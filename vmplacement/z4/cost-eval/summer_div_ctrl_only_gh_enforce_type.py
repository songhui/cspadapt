from softz3_opt import *
from softz3_msopt import *
from z3 import *
from z3util import *
from painter import *
from time import clock
from summer_constraint import *
from random import choice

ghtypes = [GhUni, GhStatic, GhDriving, GhWorkOut, GoogMap]
for i in instGh[:-1]:
    solver.add_soft(alive(i), 5)
    
for i in comps[numGh:]:
    solver.add_soft(Not(alive(i)), 2)

eval = solve(solver)
display(rp, eval)
    
for i in range(0,10):
    start_over_div(eval)
    for j in range(0,2):
        inst = choice(instGh)
        type = choice(ghtypes)
        solver.add_soft(typeof(inst)==type, 40)
    eval = solve(solver)
    print solver.get_broken()
    display(rp, eval)
    
