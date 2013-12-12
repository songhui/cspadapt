'''
Created on 12 Nov 2013

@author: fafey
'''

from z3 import *
from z4 import *
from random import randint
from time import time
import unittest

class Test(unittest.TestCase):

    def testName(self):

        solver = ContextSolver()
                
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
                 4, 7, 6, 3, 7 ]  # 31
        
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
        solver.hards.append(ForAll([v,p], consume(v,p) == If(plc(v) == p, req(v), 0) ))
        
        backup = Function('backup', VM, VM, BoolSort())
        v1 = Const('v1', VM)
        v2 = Const('v2', VM)
        
        solver.other_soft.append(ForAll([v1,v2], Implies(backup(v1,v2), Not(plc(v1) == plc(v2)))))
        solver.hards.append(backup(vms[2], vms[3]))
        
        
        
        for i,vm in enumerate(vms):
            solver.hards.append(req(vm) == myreq[i])
            
           
        for i, pm in enumerate(pms):
            solver.hards.append(res(pm) == myres[i])            
        
        plc_map = dict()
        
        
        
        solver.set_current_plc(vms, pms, myplc, plc)
        solver.init_resource_constraint(vms, pms, res, req, consume)
        
        
        
        
        start = time()
        solver.solve(True)
        
        print time() - start
        
        print '2 => ' + str(solver.getModel().eval(plc(vms[2])))
        print '3 => ' + str(solver.getModel().eval(plc(vms[3])))
        print '47 => ' + str(solver.getModel().eval(plc(vms[47])))
        print '49 => ' + str(solver.getModel().eval(plc(vms[49])))
        
