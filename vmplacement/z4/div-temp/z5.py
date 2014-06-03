'''
Created on 12 Nov 2013

@author: fafey
'''

from z3 import *
from random import randint
from time import clock
import unittest


class SoftSolver():
    
    def __init__(self):
        self.soft = []
        self.hard = []
        self.weight = []
        self._weight_var = []
        self._last_result = None
        self._last_model = None
        self._total = None
        
    def add_soft(self, cst, wt):
        self.soft.append(cst)
        self.weight.append(wt)    
    
    def init_solver(self):
        
        self.solver = Solver()
        
        for cst in self.hard:
            self.solver.add(cst)
        for i, cst in enumerate(self.soft):
            w = Int('w'+str(i))
            self.solver.add(w == If(cst, 0, self.weight[i]))
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
    
    def last_sat(self):
        return self._last_result == Z3_L_TRUE    
    
    
    def additional_hard(self, constraints):
        self.solver.push()
        for cst in constraints:
            self.solver.add(cst)
    def pop(self):
        self.solver.pop()    
        
    def model(self):
        return self._last_model
    
    def print_state_time(self):
        print 'Result: %s, Time: %.2f' % (self._last_result, clock())
        
        
        
        
    def binary_search(self, floor, ceiling, diff):
        original_ceiling = ceiling
        self._last_result == None
        print clock()
        
        while ceiling - floor > diff:
            mid = (ceiling + floor) / 2
            r = self.check(mid)
            if r > 0:
                ceiling = r
            else:
                floor = mid
            print 'New scope: (%d, %d)' % (floor, ceiling)
            self.print_state_time()
        
        if ceiling == original_ceiling:
            return check(ceiling)        
        else: 
            return ceiling
        
    