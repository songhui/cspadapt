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

topology = solve(solver)
display(rp, topology)
    
for i in range(0,10):
    start_over_div(topology)
    shuffle(topology, instGh, 3)
    topology = solve(solver)
    print solver.get_broken()
    display(rp, topology)