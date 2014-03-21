'''
Created on 25 Feb 2014

@author: huis
'''
from z3 import *

pM_names = ['pm1', 'pm2']
pMs = dict()
PM, (pM_pm1, pM_pm2) = EnumSort('PM', pM_names)
vM_names = ['vm1', 'vm2', 'vm3']
vMs = dict()
VM, (vM_vm1, vM_vm2, vM_vm3) = EnumSort('VM', vM_names)
objName = Function('vM_core', VM, IntSort()) 

vM_plc = Function('vM_plc', VM, PM)
vM_core = Function('vM_core', VM, IntSort())
pM_core = Function('pM_core', PM, IntSort())
pM_near = Function('pM_near', PM, PM, BoolSort())

goals = [
    (vM_core(vM_vm1)) < (pM_core(vM_plc(vM_vm1))),
    (vM_plc(vM_vm2)) != (vM_plc(vM_vm1)),
    (vM_core(vM_vm2)) < (pM_core(vM_plc(vM_vm2))),
    (pM_near(vM_plc(vM_vm3),vM_plc(vM_vm2)) == True) ,
    (vM_plc(vM_vm1)) != (vM_plc(vM_vm2)),
    (vM_core(vM_vm3)) < (pM_core(vM_plc(vM_vm3))),
    ((If((vM_plc(vM_vm1)) == (pM_pm1), 8, 0)+If((vM_plc(vM_vm2)) == (pM_pm1), 8, 0)+If((vM_plc(vM_vm3)) == (pM_pm1), 4, 0))) < (16),
    ((If((vM_plc(vM_vm1)) == (pM_pm2), 8, 0)+If((vM_plc(vM_vm2)) == (pM_pm2), 8, 0)+If((vM_plc(vM_vm3)) == (pM_pm2), 4, 0))) < (16),
]
    
current = [
    (vM_plc(vM_vm1)) == (pM_pm1),
    (vM_core(vM_vm1)) == (8),
    (vM_plc(vM_vm2)) == (pM_pm1),
    (vM_core(vM_vm2)) == (4),
    (vM_plc(vM_vm3)) == (pM_pm2),
    (vM_core(vM_vm3)) == (8),
]

hard = [
    ((vM_core(vM_vm1)) == 1 or (vM_core(vM_vm1)) == 2 or (vM_core(vM_vm1)) == 4 or (vM_core(vM_vm1)) == 8),
    ((vM_core(vM_vm2)) == 1 or (vM_core(vM_vm2)) == 2 or (vM_core(vM_vm2)) == 4 or (vM_core(vM_vm2)) == 8),
    ((vM_core(vM_vm3)) == 1 or (vM_core(vM_vm3)) == 2 or (vM_core(vM_vm3)) == 4 or (vM_core(vM_vm3)) == 8),
    (pM_core(pM_pm1)) == (4),
    (pM_near(pM_pm1, pM_pm1)) == True,
    (pM_near(pM_pm1, pM_pm2)) == False,
    (pM_core(pM_pm2)) == (4),
    (pM_near(pM_pm2, pM_pm1)) == False,
    (pM_near(pM_pm2, pM_pm2)) == True,
]

weights = [10000, 80, 10000, 30, 80, 10000, 10000, 10000, 80, 20, 80, 20, 40, 20]

deps = [(6, 0), (6, 2), (7, 4)]

