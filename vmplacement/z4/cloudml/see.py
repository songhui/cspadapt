from softz3_opt import *
from softz3_msopt import *
from z3 import *
from z3util import *
from painter import *
from time import clock
from divmaps_adapt_func import *




a = Int('a')
b = Int('b')
c = Int('c')

solver = SoftSolverMsOpt()
solver.add_soft(a==0, 5)
solver.add_soft(b==0, 5)
solver.add_soft(c==0, 4)

solver.add_soft(Or([a>0, b>0, c>0]), 1)

print solver.add_soft(eval("a==5"),10)


solver.init_solver()

solver.search()

print solver.solver.param_descrs()
print solver.solver.sexpr()


print solver.model().eval