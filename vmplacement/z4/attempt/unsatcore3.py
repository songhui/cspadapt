'''
Created on 8 Dec 2013

@author: fafey
'''

from z3 import *

solver = Solver()

p0, p1, p2, p3, p4 = Bools('p0 p1 p2 p3 p4')
VM, vms = EnumSort('VM', ['v0', 'v1', 'v2', 'v3', 'v4'])

x = Const('x',VM)
fun = Function('fun',VM,IntSort())
fun2 = Function('fun2',VM, BoolSort())
solver.add(ForAll(x, fun(x)==0))

solver.add(And( (Implies(p0, fun(vms[0])==0)), (Implies(p1, fun(vms[1])==1))))
#solver.add(Implies(p1, fun(vms[1])==1))
#solver.add(Implies(p2, fun(vms[2])==1))
#solver.add(Implies(p3, fun(vms[3])==0))


print solver.check(p0, p1)
print solver.unsat_core()