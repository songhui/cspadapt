'''
Created on 12 Nov 2013

@author: fafey
'''

from z3 import *
from random import randint
from time import clock
from softz3 import *
import unittest


class SoftSolverMsOpt(SoftSolver):
    
    
    def __init__(self):
        SoftSolver.__init__(self)
        self.error = 50
    
    def init_solver(self):
        
        self.solver = Optimize()
        
        for cst in self.hard:
            self.solver.add(cst)
        for i, (cst, wt) in enumerate(self.soft):
            self.solver.add_soft(cst, wt)
        
      

    def search(self):
        self._last_result = self.solver.check().r
        self._last_model = self.solver.model()
        
  
            
    