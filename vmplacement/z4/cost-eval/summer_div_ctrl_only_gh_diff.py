from softz3_opt import *
from softz3_msopt import *
from z3 import *
from z3util import *
from painter import *
from time import clock
from summer_constraint import *


for i in instGh[:-1]:
    solver.add_soft(alive(i), 5)
    
for i in comps[numGh:]:
    solver.add_soft(Not(alive(i)), 2)

eval = solve(solver)
display(rp, eval)
    
for i in range(0,10):
    start_over_div(eval)
    shuffle(eval, instGh, 3)
    eval = solve(solver)
    print solver.get_broken()
    display(rp, eval)