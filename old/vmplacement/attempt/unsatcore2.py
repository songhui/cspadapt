'''
Created on 8 Dec 2013

@author: fafey
'''

from z3 import *

solver = Solver()

VM, vms = EnumSort('VM', ['v0', 'v1', 'v2', 'v3', 'v4'])
PM, pms = EnumSort('PM',['pm0','pm1'])


p0, p1, p2, p3, p4, psum0, psum1 = Bools('p0 p1 p2 p3 p4 psum0 psum1')
req = Function('req', VM, IntSort())
res = Function('res', PM, IntSort())
backup = Function('backup', VM, VM, BoolSort())

plc = Function('plc', VM,PM)        
consume = Function('consume', VM, PM, IntSort())
v = Const('v', VM)
v2 = Const('v2',VM)
p = Const('p',PM)
solver.add(ForAll([v,p], consume(v,p) == If(plc(v) == p, req(v), 0) ))

#solver.add(ForAll([v, v2], Implies(backup(v,v2), Not(plc(v)==plc(v2)))))

#solver.add(backup(vms[2],vms[3]))

solver.add(Implies(psum0, consume(vms[0], pms[0]) + consume(vms[1], pms[0]) + consume(vms[2], pms[0]) + consume(vms[3], pms[0]) + consume(vms[4], pms[0]) < res(pms[0])))
solver.add(Implies(psum1, consume(vms[0], pms[1]) + consume(vms[1], pms[1]) + consume(vms[2], pms[1]) + consume(vms[3], pms[1]) + consume(vms[4], pms[1]) < res(pms[1])))

solver.add(req(vms[0]) == 6)
solver.add(req(vms[1]) == 1)
solver.add(req(vms[2])== 2)
solver.add(req(vms[3]) == 3)
solver.add(req(vms[4]) == 6)

solver.add(Implies(p0, plc(vms[0]) == pms[0]))
solver.add(Implies(p1, plc(vms[1]) == pms[0]))
solver.add(Implies(p2, plc(vms[2]) == pms[1]))
solver.add(Implies(p3, plc(vms[3]) == pms[1]))
solver.add(Implies(p4, plc(vms[4]) == pms[1]))


solver.add(res(pms[0]) == 10)
solver.add(res(pms[1]) == 10)

print solver.check(p0, p1, p2, p3, p4, psum0, psum1)
#print solver.model()
#print solver.model().eval(Implies(backup(vms[2],vms[3]), Not(plc(vms[2])==plc(vms[3]))))
print solver.unsat_core()