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
        self._weight_var = []
        self._last_result = None
        self._last_model = None
        
    def add_soft(self, cst, wt):
        self.soft.append((cst, wt))  
    
    def add_hard(self, cst):
        self.hard.append(cst)
    
    def init_solver(self):
        None   
    
    
    def last_sat(self):
        return self._last_result == Z3_L_TRUE     
        
    def model(self):
        return self._last_model
    
    def print_state_time(self):
        None#print 'Result2: %s, Time: %.2f' % (self.last_sat(), clock())
        
    def search(self):
        None
        
    def get_broken(self):
        eval = self.model().eval
        return [(c, w) for (c,w) in self.soft if str(eval(c))=='False']
    
    def get_broken_weight(self):
        return sum(w for (c,w) in self.get_broken())