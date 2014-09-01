'''
Created on 12 Nov 2013

@author: fafey
'''

from z3 import *
from softz3_opt import *
from softz3_msopt import *
from softz3_diagnose import *
from random import randint
from time import clock
import unittest

class Test(unittest.TestCase):

    def testName(self):
        
        numA = 20
        numB = 20
        numC = 20
        
        tnumA = 10
        tnumB = 5
        tnumC = 5
        
        mapAB = [(0, [0,1,2]), (1, [1]), (2, [1,2,4]), (3,[1,4]), (4,[2,3]), (5, [1,3]), (6, [1,4]), (7, [1])]
        mapBC = [(0, [0,1]), (1,[1]), (2,[1,2,3]), (3,[1,4])]
        
        InstA, a = EnumSort('InstA', ['a%d' % i for i in range(0,numA)])
        TypeA, A = EnumSort('TypeA', ['A%d' % i for i in range(0,tnumA)])
        
        InstB, b = EnumSort('InstB', ['b%d' % i for i in range(0,numB)])
        TypeB, B = EnumSort('TypeB', ['B%d' % i for i in range(0,tnumB)])
        
        InstC, c = EnumSort('InstC', ['c%d' % i for i in range(0,numC)])
        TypeC, C = EnumSort('TypeC', ['C%d' % i for i in range(0,tnumC)])

        dAB = Function('dAB', InstA, InstB)
        dBC = Function('dBC', InstB, InstC)
        
        toA = Function('toA', InstA, TypeA)
        toB = Function('toB', InstB, TypeB)
        toC = Function('toC', InstC, TypeC)
        
        #Sample of state-based constraints
        memB = Function('memA', InstB, IntSort())
        memC = Function('memB', InstC, IntSort())
        
        ia = Const('a', InstA)
        iaa = Const('aa', InstA)
        iat = Const('at', TypeA)
        ib = Const('b', InstB)
        ibb = Const('bb', InstB)
        ibt = Const('bt', TypeB)
        ic = Const('c', InstC)
        icc = Const('cc', InstC)
        ict = Const('ct', TypeC)
        
        
        solver = SoftSolverMsOpt()
        #solver = SoftSolverDiagnose()
        #solver = SoftSolverOpt()

        #never deploy to the same destination
        solver.hard.append(ForAll([ia,iaa], Implies(dAB(ia)==dAB(iaa), ia==iaa)))
        solver.hard.append(ForAll([ib,ibb], Implies(dBC(ib)==dBC(ibb), ib==ibb)))
        
        
        #Deployment constraints
        solver.hard.append(ForAll([ia, ib],
                          Implies(And(dAB(ia)==ib),
                                  And([Implies(toA(ia)==A[x], Or([toB(ib)==B[z] for z in y])) for (x,y) in mapAB]))))
        
        solver.hard.append(ForAll([ib, ic],
                          Implies(And(dBC(ib)==ic),
                                  And([Implies(toB(ib)==B[x], Or([toC(ic)==C[z] for z in y])) for (x,y) in mapBC]))))
        
        solver.hard.append(ForAll([ib], memB(ib)<=memC(dBC(ib))))
        
        
        for i in range(0,numA) :
            solver.hard.append(dAB(a[i])==b[i])
            #solver.add_soft(dAB(a[i])==b[i], randint(20,30))
        for i in range(0,numB):
            solver.hard.append(dBC(b[i])==c[i])
            #solver.add_soft(dBC(b[i])==c[i], randint(20,30))
            
        for i in range(0,numA):
            solver.add_soft( toA(a[i])==A[0], randint(5,10) )
            solver.add_soft( toB(b[i])==B[0], randint(5,10) )
            solver.add_soft( (toC(c[i])==C[0]), randint(5,10) )


        for x in b:
            solver.hard.append(Implies(toB(x)==B[0], memB(x)==15))
        
        solver.hard.append(And(memC(c[0])==10, memC(c[1])==10, memC(c[2])==10))

        for x in a:
            if randint(0,9) < 9 :
                solver.add_soft(toA(x)==A[randint(1,9)], randint(20,30))
        #solver.additional_hard([And(toA(a[1])==A[1], toA(a[2])==A[1], toA(a[3])==A[1])])
        
        solver.init_solver()
        
        print len(solver.soft)
        #only for softz3_opt
#        solver.error = 10
#        solver.debug = False
#        print "final total: %d" % solver.search()
        
        #These lines are for softz3_ms_opt
        solver.search()
        print solver.last_sat()    
        
        
        eval = solver.model().eval
        
        
        for x in a:
            print "%s : %s => %s" % (x, eval(toA(x)), eval(dAB(x)))
        for x in b:
            print "%s : %s => %s" % (x, eval(toB(x)), eval(dBC(x)))
        for x in c:
            print "%s : %s" % (x, eval(toC(x)))
        
        #print eval(countA)  
       
 

        
        
