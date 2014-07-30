'''
Created on 12 Nov 2013

@author: fafey
'''

from z3 import *
from z5 import *
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
        
        ia = Const('a', InstA)
        iaa = Const('aa', InstA)
        iat = Const('at', TypeA)
        ib = Const('b', InstB)
        ibb = Const('bb', InstB)
        ibt = Const('bt', TypeB)
        ic = Const('c', InstC)
        icc = Const('cc', InstC)
        ict = Const('ct', TypeC)
        
        
        solver = SoftSolver()

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
        
        
        
        for i in range(0,numA) :
            solver.soft.append(dAB(a[i])==b[i])
            solver.weight.append(randint(400,500))
        for i in range(0,numB):
            solver.soft.append(dBC(b[i])==c[i])
            solver.weight.append(randint(400,500))
            
        for i in range(0,numA):
            solver.soft.append(toA(a[i])==A[0])
            solver.weight.append(randint(100,200))
            solver.soft.append(toB(b[i])==B[0])
            solver.weight.append(randint(100,200))
            solver.soft.append(toC(c[i])==C[0])
            solver.weight.append(randint(100,200))

        solver.init_solver()

        solver.additional_hard([And(toA(a[1])==A[1], toA(a[2])==A[1], toA(a[3])==A[1])])
        
        
        print "final total: %d" % solver.binary_search(0, 10000, 500)

        #Test the performance of Z3: with a small number (unsat): 0.2 second, a big number (sat) 4 seconds... 
#         for i in range(0,10):
#             value = randint(0,1200)
#             print value
#             solver.check(value)
#             solver.print_state_time()
#         
#         print 2000
#         solver.check(2000)
#         solver.print_state_time()
#             
#         for i in range(0,10):
#             value = randint(3000, 100000)
#             print value
#             solver.check(value)
#             solver.print_state_time()
            
        
        
        eval = solver.model().eval
        
        
        for x in a:
            print "%s : %s => %s" % (x, eval(toA(x)), eval(dAB(x)))
        for x in b:
            print "%s : %s => %s" % (x, eval(toB(x)), eval(dBC(x)))
        for x in c:
            print "%s : %s" % (x, eval(toC(x)))
        
        #print eval(countA)  
       
 

        
        
