'''
Created on 12 Nov 2013

@author: fafey
'''

from z3 import *
from random import randint
from time import clock
from softz3 import *
import unittest


class SoftSolverOpt(SoftSolver):
    
    
    def __init__(self):
        SoftSolver.__init__(self)
        self._total = None
        self.error = 30
        self.debug = False
    
    def init_solver(self):
        
        self.solver = Solver()
        
        for cst in self.hard:
            self.solver.add(cst)
        for i, (cst, wt) in enumerate(self.soft):
            w = Int('w'+str(i))
            self.solver.add(w == If(cst, 0, wt))
            self._weight_var.append(w)
        self._total = Int('total')
        self.solver.add(self._total == Sum(self._weight_var))    
    
    
        
    def check(self, ceiling):
        self.solver.push()
        self.solver.add(self._total <= ceiling)
        self._last_result = self.solver.check().r
        if self._last_result == Z3_L_TRUE :
            self._last_model = self.solver.model()
            self.pop()
            return int(str(self._last_model.eval(self._total)))
        else:
            self.pop()
            return -1
      
    
    
    def additional_hard(self, constraints):
        self.solver.push()
        for cst in constraints:
            self.solver.add(cst)
    def pop(self):
        self.solver.pop()    

    def search(self):
        return self.binary_search(0, 1000000, self.error)
  
    def binary_search(self, floor, ceiling, error):
        original_ceiling = ceiling
        self._last_result == None
        print clock()
        
        while ceiling - floor > error:
            mid = (ceiling + floor) / 2
            r = self.check(mid)
            if r > 0:
                ceiling = r
            else:
                floor = mid
            if self.debug: print 'New scope: (%d, %d)' % (floor, ceiling)
            self.print_state_time()
        
        if ceiling == original_ceiling:
            return self.check(ceiling)        
        else: 
            return ceiling
        
    