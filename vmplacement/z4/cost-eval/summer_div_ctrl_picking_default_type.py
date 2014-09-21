from softz3_opt import *
from softz3_msopt import *
from z3 import *
from z3util import *
from painter import *
from time import clock
from summer_constraint import *
from random import choice

defaults = [(instGh, GhDriving), (instEnc, EncPollution), (instStr, StorePltf), (instVm, EC2)]
    
for i in comps[2:]:
    solver.add_soft(Not(alive(i)), 2)

topology = solve(solver)
display(rp, topology)
    
for i in range(0,10):
    start_over_div(topology)
    for i in range(0,3):
        x = choice(comps[1:])
        for (inst, type) in defaults:
            if x in inst:
                solver.add_soft(typeof(x)==type, 10)
    topology = solve(solver)
    print solver.get_broken()
    display(rp, topology)