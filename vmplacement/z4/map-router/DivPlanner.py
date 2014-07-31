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

class Test(unittest.TestCase):

    def testName(self):
        
        AlgoT, algoT = EnumSort('AlgoT', ['algoT_pol','algoT_traf','algoT_goog'])
        AlgoI, algoI = EnumSort('AlgoI', ['algo1','algo2','algonew'])
        
        EncT, encT = EnumSort('EncT',['encT_pol', 'encT_traf'])
        EncI, encI = EnumSort('EncI', ['enc1', 'enc2', 'encnull'])
        
        VmT, vmT = EnumSort('VmT', ['ec2', 'azure'])
        VmI, vmI = EnumSort('VmI', ['vm1', 'vm2', 'vmnull'])
        
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
                            Implies(toAlgo(iAlgo)==algoT[0], toEnc(dAlgoEnc(iAlgo)) == encT[0]),
                            Implies(toAlgo(iAlgo)==algoT[1], Or(toEnc(dAlgoEnc(iAlgo))== encT[0], toEnc(dAlgoEnc(iAlgo))== encT[1])),
                            Implies(toAlgo(iAlgo)==algoT[2], And(dAlgoEnc(iAlgo)==encI[2],dAlgoVm(iAlgo)==vmI[2])),
                            Implies(Or(toAlgo(iAlgo)==algoT[0], toAlgo(iAlgo)==algoT[1]), useVm(dAlgoVm(iAlgo)))
                        )
                      )            
                  )
        )
        
        
        solver.hard.append(And(useAlgo(algoI[0]), useAlgo(algoI[1])))
        solver.add_hard(toAlgo(algoI[1])==algoT[2])
        
        solver.add_soft(True, 0)
        
        solver.init_solver()
        
        print len(solver.soft)
        solver.error = 200
        solver.debug = False
        print "final total: %d" % solver.search()
            
        
        
        eval = solver.model().eval
        
        print eval
        
        
        #print eval(countA)  
       
 

        
        
