'''
Created on 12 Nov 2013

@author: fafey
'''

from z3 import *


solver = Solver()

VM, (v1, v2, v3, v4, v5) = EnumSort('VM',['v1','v2','v3','v4','v5'])

PM, (p1, p2, p3) = EnumSort('PM',['p1','p2','p3'])

res = Function('res', PM, IntSort())

req = Function('req', VM, IntSort())

plc = Function('plc', VM,PM)

consume = Function('consume', VM, PM, IntSort())

v = Const('v', VM)
p = Const('p', PM)


solver.add(ForAll([v,p], consume(v,p) == If(plc(v) == p, req(v), 0) ))

solver.add(res(p1) == 10)
solver.add(res(p2) == 7)
solver.add(res(p3) == 5)



solver.add(req(v1) == 5)
solver.add(req(v2) == 3)
solver.add(req(v3) == 2)
solver.add(req(v4) == 7)
solver.add(req(v5) == 4)

solver.add(consume(v1,p1)+consume(v2,p1)+consume(v3,p1)+consume(v4,p1)+consume(v5,p1) <= res(p1))
solver.add(consume(v1,p2)+consume(v2,p2)+consume(v3,p2)+consume(v4,p2)+consume(v5,p2) <= res(p2))
solver.add(consume(v1,p3)+consume(v2,p3)+consume(v3,p3)+consume(v4,p3)+consume(v5,p3) <= res(p3))


print solver.check()
print solver.model()


