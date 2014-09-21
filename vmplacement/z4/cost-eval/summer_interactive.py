from softz3_opt import *
from softz3_msopt import *
from z3 import *
from z3util import *
from painter import *
from time import clock
from summer_constraint import *


for i in instGh[:-1]:
    solver.add_soft(Not(alive(i)), 5)
    
for i in comps[numGh:]:
    solver.add_soft(Not(alive(i)), 2)

topology = solve(solver)
display(rp, topology)
    
for i in range(0,100):
    start_over_div(topology)
    for j in range(0,100):
        s = raw_input('constraint, weight>>')
        if s == 'quit' or s == 'q':
            quit()
        if s == 'go':
            break
        conswei = s.split(',')
        print conswei[0].strip()
        cst = eval(conswei[0].strip())
        weight = int(conswei[1].strip())
        solver.add_soft(cst,weight)
    
    topology = solve(solver)
    print solver.get_broken()
    display(rp, topology)