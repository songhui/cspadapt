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
        
        myreq = [8, 5, 4, 7, 10,  #0
                 6, 4, 5, 9, 7,   #5
                 7, 5, 4, 9, 3,   #10
                 2, 4, 9, 10, 4,  #15
                 9, 4, 3, 6, 6,   #20               
                 5, 9, 4, 7, 4,   #25
                 2, 7, 1, 2, 9,   #30
                 4, 9, 2, 6, 3,   #35              
                 9, 2, 10, 5, 4,  #40
                 4, 7, 6, 3, 7 ]  #45    total requirement of the last 6: 31
        
        myres = [20, 20, 20, 20, 20,
                 20, 20, 20, 20, 40, 
                 25, 35, 30, 30, 30]
        
        myplc = [0, 0, 1, 1, 2,      #0
                 3, 3, 3, 4, 4,      #5
                 5, 5, 5, 6, 6,      #10
                 6, 6, 7, 7, 8,      #15
                 8, 8, 9, 9, 9,      #20
                 9, 10, 10, 10, 10,  #25
                 11, 11, 11, 11, 11, #30
                 12, 12, 12, 12, 12, #35
                 13, 13, 13, 13, 14, #40
                 14, 14, 14, 14, 14  #45
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
        
        #-------backup--------#
        backup = Function('backup', VM, VM, BoolSort())
        v1 = Const('v1', VM)
        v2 = Const('v2', VM)
        
        solver.hards.append(ForAll([v1,v2], Implies(backup(v1,v2), Not(plc(v1) == plc(v2)))))
        solver.other_soft.append(backup(vms[2], vms[3]))
        
        #-------frequent------#
        frequent = Function('frequent', VM, VM, BoolSort())
        solver.hards.append(ForAll([v1, v2], Implies(frequent(v1,v2), (plc(v1) == plc(v2)))))
        solver.other_soft.append(frequent(vms[1],vms[22]))
        solver.other_soft.append(frequent(vms[6],vms[23]))
        
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
        
        print '1 => ' + str(solver.getModel().eval(plc(vms[1])))
        print '2 => ' + str(solver.getModel().eval(plc(vms[2])))
        print '3 => ' + str(solver.getModel().eval(plc(vms[3])))
        print '6 => ' + str(solver.getModel().eval(plc(vms[6])))
        print '22 => ' + str(solver.getModel().eval(plc(vms[22])))
        print '47 => ' + str(solver.getModel().eval(plc(vms[47])))
        print '49 => ' + str(solver.getModel().eval(plc(vms[49])))
        
