from z3 import *


solver = Optimize()

x = Int('x')

solver.add_soft(x<0, 6)
solver.add_soft(x>1, 3)
solver.add_soft(x==4, 4)

solver.check()

print solver.model().eval(x)