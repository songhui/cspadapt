'''
Created on 8 Dec 2013

@author: fafey
'''

from z3 import *

solver = Solver()
p1, p2, p3, p4, p5 = Bools('p1 p2 p3 p4 p5')
i1, i2, i3, i4, i5 = Ints('i1 i2 i3 i4 i5')

solver.add(i1 + i2 < 10)
solver.add(i3 + i4 + i5 < 10)

solver.add(Implies(p1, i1 == 6))
solver.add(Implies(p2, i2 == 6))
solver.add(Implies(p3, i3 == 2))
solver.add(Implies(p4, i4 == 3))
solver.add(Implies(p5, i5 == 4))

print solver.check(p1, p2, p3, p4, p5)
print solver.unsat_core()