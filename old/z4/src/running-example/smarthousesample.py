'''
Created on Jan 2, 2013

@author: Hui
'''

from z4sample import *
import unittest

from homecspsample import *

class TestSmartHomeFunctions(unittest.TestCase):
    def setUp(self):        
    
        cs = ContextSolver(config_para, context_para, domains, goals, [])
        cs.set_config(config)
        cs.set_context(context)
        
        self.cs = cs
        
    def testSimpleCheck(self):
        cs = self.cs
        print cs.solve(True)
        cs.printResults()
        cs.printConfig()
        print cs.count
        
        cs.refine('/myhouse/room#liv/window#w1.opened',True)
        
        print cs.config_weight + cs.required_weight
        
        
        
