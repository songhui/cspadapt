'''
Created on 12 Nov 2013

@author: fafey
'''

from z3 import *
from softz3_opt import *
from softz3_diagnose import *
from random import randint
from time import clock
import unittest
from painter import *

class Test(unittest.TestCase):

    def testName(self):
        
        AlgoT, (algoT_pol, algoT_traf, algoT_goog) = EnumSort('AlgoT', ['algoT_pol','algoT_traf','algoT_goog'])
        AlgoI, algoI = EnumSort('AlgoI', ['algo1','algo2','algonew'])
        
        EncT, (encT_pol, encT_traf) = EnumSort('EncT',['encT_pol', 'encT_traf'])
        EncI, encI = EnumSort('EncI', ['encnull','enc1', 'enc2'])
        
        VmT, (vmT_ec2, vmT_azure) = EnumSort('VmT', ['vmT_ec2', 'vmT_azure'])
        VmI, vmI = EnumSort('VmI', ['vmnull', 'vm1', 'vm2'])
        
        toAlgo = Function('toAlgo', AlgoI, AlgoT)
        toEnc = Function('toEnc', EncI, EncT)
        toVm = Function('toVm', VmI, VmT)
        
        dAlgoEnc = Function('dAlgoEnc', AlgoI, EncI)
        dAlgoVm = Function('dAlgoVm', AlgoI, VmI)
        dEncVm = Function('dEncVm', EncI, VmI)
        
        useAlgo = Function('useAlgo', AlgoI, BoolSort())
        useEnc = Function('useEnc', EncI, BoolSort())
        useVm = Function('useVM', VmI, BoolSort())
        
        memVm = Function('memVM', VmI, IntSort())
        memAlgo = Function('memAlgo', AlgoI, IntSort())
        
        iAlgo = Const('iAlgo', AlgoI)
        iiAlgo = Const('iiAlgo', AlgoI)
        iEnc = Const('iEnc', EncI)
        iiEnc = Const('iiEnc', EncI)
        iVm = Const('iVm', VmI)
        iiVm = Const('iiVm', VmI)
        
        solver = SoftSolverOpt()
        
        solver.hard.append(
            ForAll([iAlgo], Implies(useAlgo(iAlgo),
                        And(
                            Implies(toAlgo(iAlgo)==algoT_pol, toEnc(dAlgoEnc(iAlgo)) == encT_pol),
                            Implies(toAlgo(iAlgo)==algoT_traf, Or(toEnc(dAlgoEnc(iAlgo))== encT_pol, toEnc(dAlgoEnc(iAlgo))== encT_traf)),
                            Implies(toAlgo(iAlgo)==algoT_goog, And(dAlgoEnc(iAlgo)==encI[0],dAlgoVm(iAlgo)==vmI[0])),
                            Implies(Or(toAlgo(iAlgo)==algoT_pol, toAlgo(iAlgo)==algoT_traf), And(useVm(dAlgoVm(iAlgo)), useEnc(dAlgoEnc(iAlgo))))
                        )
                      )            
                  )
        )
        
        solver.hard.append(
            ForAll([iEnc], 
                useEnc(iEnc) == useVm(dEncVm(iEnc))
            )
        )
        
        solver.hard.append(toVm(vmI[1])!=toVm(vmI[2]))
        
        solver.hard.append(And(useAlgo(algoI[0]), useAlgo(algoI[1])))
        solver.add_hard(toAlgo(algoI[1])==algoT_goog)
        solver.add_hard(toAlgo(algoI[0])==algoT_pol)
        solver.hard.append(Not(useVm(vmI[0])))
        solver.hard.append(Not(useEnc(encI[0])))
        
        
        solver.add_soft(True, 0)
        solver.add_soft(toVm(vmI[1])==vmT_ec2,10)
        
        solver.init_solver()
        
        print len(solver.soft)
        solver.error = 200
        solver.debug = False
        
        
        print "final total: %d" % solver.search()
            
        
        
        eval = solver.model().eval
        
        print eval
        print eval(dEncVm(encI[1]))
        print eval(dAlgoVm(algoI[0]))
        print eval(useEnc(encI[1]))
        
        rp = ResultPainter()
        rp.vars = algoI + encI + vmI
        rp.refs = [dAlgoEnc, dAlgoVm, dEncVm]
        rp.types = [toAlgo, toEnc, toVm]
        rp.filters = [useAlgo, useEnc, useVm]
        rp.use_filters = True
        rp.eval = eval
        rp.make_graph()
        #print eval(countA)  
       
 

        
        
