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

class TestSensApp(unittest.TestCase):

    def testSensAppPlanning(self):
        
        #VmType ()
        

        solver = SoftSolverOpt()
        
        print "final total: %d" % solver.search()
            
        
        
        eval = solver.model().eval
        
        print eval

        
        rp = ResultPainter()

        rp.eval = eval
        rp.make_graph()
        #print eval(countA)  
       
 

        
        
