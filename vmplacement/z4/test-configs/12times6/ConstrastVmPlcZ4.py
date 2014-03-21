'''
Created on 12 Nov 2013

@author: fafey
'''

                           
from z3 import *
from z4 import *
from random import randint
from time import time
import unittest


from formanual import *
from manual import *


class TestContrast(unittest.TestCase):
    
   

    def runit(self):

        solver = ContextSolver()
                
    
        for goal in goals:
            solver.other_soft.append(goal)
        
        for goal in current:
            solver.other_soft.append(goal)
            
        for cxt in hard:
            solver.hards.append(cxt)
            
        solver.weight_seeds = goal_weights + weights
        
        for (a,b) in deps:
            if not solver.dependencies.has_key(a) : 
                solver.dependencies[a] = []
            solver.dependencies[a].append(b+len(goals))
            
        #print solver.dependencies
        #solver.dependencies[3]=[5,6]
        #solver.dependencies[4]=[7]
        
        start = time()
        solver.solve(False)
        
        #print "==================="
        #solver.printBroken()
        #print solver.getModel()[vM_plc]
        #print solver.getModel()[vM_core]
        
        print time() - start
        self.results.append(time()-start)
        
    def testPerformance(self):
        self.results = []
        for i in range(0, 30):
            self.runit()
        print self.results
