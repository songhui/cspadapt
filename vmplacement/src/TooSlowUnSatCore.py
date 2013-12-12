'''
Created on 12 Nov 2013

@author: fafey
'''

from z3 import *
from random import randint
from time import time
import unittest

class Test(unittest.TestCase):

    def testName(self):

        solver = Solver()
                
        nvm = 50
        npm = 15
        
        myreq = [8, 5, 4, 7, 10,
                 6, 4, 5, 9, 7,
                 7, 5, 4, 9, 3,
                 2, 4, 9, 10, 4,
                 9, 4, 3, 6, 6,                  
                 5, 9, 4, 7, 4,
                 2, 7, 1, 2, 9,
                 4, 9, 2, 6, 3,                 
                 9, 2, 10, 5, 4,
                 4, 7, 6, 3, 7 ]
        
        myres = [20, 20, 20, 20, 20,
                 20, 20, 20, 20, 20, 
                 25, 35, 30, 30, 30]
        
        myplc = [0, 0, 1, 1, 2,
                 3, 3, 3, 4, 4,
                 5, 5, 5, 6, 6,
                 6, 6, 7, 7, 8,
                 8, 8, 9, 9, 9, 
                 9, 10, 10, 10, 10,
                 11, 11, 11, 11, 11,
                 12, 12, 12, 12, 12,
                 13, 13, 13, 13, 14,
                 14, 14, 14, 14, 14
                ]
        #myplc = []
        
    
        
        vm_names = []
        for i in range(0,nvm):
            vm_names.append('v'+str(i))
        
        pm_names = []
        for i in range(0,npm):
            pm_names.append('p'+str(i))
            
        
        VM, vms = EnumSort('VM', vm_names)
        PM, pms = EnumSort('VM', pm_names)
        
        res = Function('res', PM, IntSort())
        req = Function('req', VM, IntSort())
        plc = Function('plc', VM,PM)
        
        consume = Function('consume', VM, PM, IntSort())
        
        v = Const('v', VM)
        p = Const('p', PM)
        solver.add(ForAll([v,p], consume(v,p) == If(plc(v) == p, req(v), 0) ))
        
        
        for i,vm in enumerate(vms):
            solver.add(req(vm) == myreq[i])
            
           
        for i, pm in enumerate(pms):
            solver.add(res(pm) == myres[i])
            
        
        assumps = []
        for i, extplc in enumerate(myplc):
            p = Bool(str(i))
            solver.add(Implies(p,plc(vms[i]) == pms[extplc]))
            assumps.append(p)
        
        for pm in pms:
            expr = IntVal(0)
            for vm in vms:
                expr = expr + consume(vm,pm)
            solver.add(expr <= res(pm))
        
        
        start = time()
        print solver.check(*assumps)
        print solver.unsat_core()
        print time() - start
        
        
