'''
Created on 12 Nov 2013

@author: fafey
'''

from z3 import *
from softz3_opt import *
from softz3_diagnose import *
from random import randint
from random import choice
from time import clock
import unittest
import itertools
from painter import *

class Test(unittest.TestCase):

    def testName(self):
        
        #Types        
        AlgoT, (algoT_pol, algoT_traf, algoT_goog) = EnumSort('AlgoT', ['JustPoll','PollOrTraff', 'Goog'])
        EncT, (encT_pol, encT_traf) = EnumSort('EncT',['PollEnc', 'TraffEnc'])
        VmT, (vmT_ec2, vmT_azure) = EnumSort('VmT', ['EC2', 'Azure'])
        StorT, (storT_app, storT_pltf) = EnumSort('StorT', ['StorageApp', 'StoragePlatform'])
        LBT, (lbT_universe) = EnumSort('LBT', ['Universe'])
        
        #Instances
        AlgoI, algoI = EnumSort('AlgoI', ['algo0', 'algo1','algo2','algo3', 'algo4', 'algo5', 'algo6', 'algo7'])
        EncI, encI = EnumSort('EncI', ['encnull','enc1', 'enc2', 'enc3'])
        VmI, vmI = EnumSort('VmI', ['vmnull', 'vm1', 'vm2', 'vmnew'])
        StorI, storI = EnumSort('StorI', ['stornull', 'stor1', 'stor2'])
        LBI, lbI = EnumSort('LBI', ['lbnull','lb1'])
        
        #Use an instance or not
        useAlgo = Function('useAlgo', AlgoI, BoolSort())
        useEnc = Function('useEnc', EncI, BoolSort())
        useVm = Function('useVM', VmI, BoolSort())
        useStor = Function('useStor', StorI, BoolSort())
        useLB = Function('useLB', LBI, BoolSort())
        
        #Instance-Type
        toAlgo = Function('toAlgo', AlgoI, AlgoT)
        toEnc = Function('toEnc', EncI, EncT)
        toVm = Function('toVm', VmI, VmT)
        toStor = Function('toStor', StorI, StorT)
        toLB = Function('toLB', LBI, LBT)
        
        #Dependencies/References
        dAlgoEnc = Function('dAlgoEnc', AlgoI, EncI)
        dAlgoVm = Function('dAlgoVm', AlgoI, VmI)
        dEncVm = Function('dEncVm', EncI, VmI)
        dStorVm = Function('dStorVm', StorI, VmI)
        dAlgoStor = Function('dAlgoStor', AlgoI, StorI)
        dLBAlgo = Function('dLBAlgo', LBI, AlgoI, BoolSort())
        
        #Attributes
        memVm = Function('memVM', VmI, IntSort())
        cacheAlgo = Function('cacheAlgo', AlgoI, BoolSort())
        
        #Variables used for defining constraints
        iAlgo = Const('iAlgo', AlgoI)
        iiAlgo = Const('iiAlgo', AlgoI)
        iEnc = Const('iEnc', EncI)
        iiEnc = Const('iiEnc', EncI)
        iVm = Const('iVm', VmI)
        iiVm = Const('iiVm', VmI)
        iStor = Const('iStore', StorI)
        iLB = Const('iLB', LBI)
        
        
        #Now started defining constraints. But we need a solver first
        solver = SoftSolverOpt()
        
        #functional dependencies
        solver.add_hard(
            ForAll([iAlgo], Implies(useAlgo(iAlgo),
                        And(
                            Implies(toAlgo(iAlgo)==algoT_pol, toEnc(dAlgoEnc(iAlgo)) == encT_pol),
                            Implies(toAlgo(iAlgo)==algoT_traf, Or(toEnc(dAlgoEnc(iAlgo))== encT_pol, toEnc(dAlgoEnc(iAlgo))== encT_traf)),
                            Implies(toAlgo(iAlgo)==algoT_goog, And(dAlgoEnc(iAlgo)==encI[0],dAlgoVm(iAlgo)==vmI[0],Not(cacheAlgo(iAlgo)))),
                            Implies(Or(toAlgo(iAlgo)==algoT_pol, toAlgo(iAlgo)==algoT_traf), And(useVm(dAlgoVm(iAlgo)), useEnc(dAlgoEnc(iAlgo)))),
                            Implies(cacheAlgo(iAlgo), useStor(dAlgoStor(iAlgo)))
                        )
                      )            
                  )
        )
        
        solver.add_hard(
            ForAll([iEnc], 
                useEnc(iEnc) == useVm(dEncVm(iEnc))
            )
        )
        
        solver.add_hard(ForAll([iStor],
                               Implies(And(useStor(iStor), toStor(iStor)==storT_app),
                                       useVm(dStorVm(iStor))
                                       )
                               )
                        )
        
        
        
        solver.add_hard(ForAll([iAlgo], 
                               Implies(
                                       And(useAlgo(iAlgo), useEnc(dAlgoEnc(iAlgo))),
                                       dAlgoVm(iAlgo)==dEncVm(dAlgoEnc(iAlgo))         
                                      )
                               )
                        )
        
        solver.add_hard(ForAll([iLB, iAlgo],
                               Implies(dLBAlgo(iLB, iAlgo),
                                       And(useLB(iLB), useAlgo(iAlgo))
                                       )))
        
        
        solver.add_hard(Not(useLB(lbI[0])))
        solver.add_hard(Not(useAlgo(algoI[0])))
        solver.add_hard(Not(useVm(vmI[0])))
        solver.add_hard(Not(useEnc(encI[0])))
        solver.add_hard(Not(useStor(storI[0])))
        
        #VM capacity: suppose each app needs 1 GB of memory
        solver.add_hard(ForAll([iVm],
                               Sum(
                                   [If(And(useAlgo(a), dAlgoVm(a)==iVm),1,0) for a in algoI] +
                                   [If(And(useEnc(a), dEncVm(a)==iVm),1,0) for a in encI] +
                                   [If(And(useStor(a), dStorVm(a)==iVm),1,0) for a in storI]
                                   )
                               <= memVm(iVm)
                               )
                        )
        
        #requirements
        solver.hard.append(And([useAlgo(algo) for algo in algoI[1:]]))
        
        solver.add_soft(Implies(useLB(lbI[1]), self.gen_count(dLBAlgo, lbI[1], algoI)>3), 100)
        solver.add_soft(Not(useLB(lbI[1])), 100)
        #solver.add_hard(And([cacheAlgo(algoI[0]), cacheAlgo(algoI[1]),cacheAlgo(algoI[2]),cacheAlgo(algoI[3])]))
        for a in algoI:
            solver.add_soft(cacheAlgo(a), 12)
        #solver.add_hard(toAlgo(algoI[1])==algoT_goog)
        #solver.add_hard(toAlgo(algoI[0])==algoT_pol)
        
        #solver.add_soft(toVm(vmI[1])==vmT_ec2,10)
        solver.add_soft(Not(useVm(vmI[2])),10)
        solver.add_soft(memVm(vmI[1])==5, 50)
        solver.add_soft(memVm(vmI[2])==5, 50)
        #solver.add_soft(memVm(vmI[3])==2, 50)
        
        
        
        #perturbations
        solver.add_soft(Not(useVm(vmI[3])),30)
        #solver.add_soft(toVm(vmI[1])!=toVm(vmI[2]),10)
        #solver.add_soft(toAlgo(algoI[1])!=toAlgo(algoI[3]),10)
        #solver.add_soft(dAlgoVm(algoI[1])!=dAlgoVm(algoI[2]),10)
        #solver.add_soft(dAlgoStor(algoI[1])!=dAlgoStor(algoI[2]),15)
        solver.init_solver()
        
        print len(solver.soft)
        solver.error = 20
        solver.debug = False
        
        
        print "final total: %d" % solver.search() 
        eval = solver.model().eval
        
        print eval(dEncVm(encI[1]))
        print eval(dAlgoVm(algoI[0]))
        print eval(useEnc(encI[1]))
        print eval(dAlgoStor(algoI[1]))
        
        rp = ResultPainter()
        rp.vars = algoI + encI + vmI + storI + lbI
        rp.refs = [dAlgoEnc, dAlgoVm, dEncVm, dStorVm, dAlgoStor]
        rp.multi_refs = [dLBAlgo]
        rp.types = [toAlgo, toEnc, toVm, toStor, toLB]
        rp.filters = [useAlgo, useEnc, useVm, useStor, useLB]
        rp.attrs = [memVm, cacheAlgo]
        rp.use_filters = True
        
        
        print eval(dEncVm(encI[1]))
        print eval(dAlgoVm(algoI[0]))
        print eval(useEnc(encI[1]))
        print eval(dAlgoStor(algoI[1]))
        print 'use stor1: ' + str(eval(useStor(storI[1])))
        print eval(dStorVm(storI[1]))
        
        rp.eval = eval
        rp.make_graph()
        
        var_type = [(algoI, toAlgo), (encI, toEnc), (vmI, toVm), (storI, toStor)]
        
        for i in range(0,10):
            for j in range(0,10):
                if self.shuffle(solver, var_type): break
            solver.init_solver()
            print solver.search()
            rp.eval = solver.model().eval
            print rp._shannon()
            rp.make_graph()
        
        
        #print eval(countA)  
        print rp._shannon()
 
 
    def shuffle(self, solver, target):
        (vars, type) = choice(target)
        i1 = randint(1,len(vars)-2)
        i2 = randint(i1+1, len(vars)-1)
        v1 = vars[i1]
        v2 = vars[i2]
        print (v1, v2)
        if str(solver.model().eval(type(v1)==type(v2)))=='False':
            print "no use shuffle"
            return False
        solver.add_soft(type(v1)!=type(v2), 20)
        return True
        

    def gen_count(self, mult_func, host, targets):
        return Sum([If(mult_func(host, y), 1, 0) for y in targets])
        
