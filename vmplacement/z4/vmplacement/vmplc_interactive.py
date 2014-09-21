from softz3_opt import *
from softz3_msopt import *
from z3 import *
from z3util import *
from vmplc_painter import *
from time import clock
from random import choice
from itertools import product
from vmplc_constraint import *

vmmem = [(vms[1],2), (vms[2],2), (vms[3], 1), (vms[4],3), (vms[5],6), 
         (vms[6],2), (vms[7],2), (vms[8],1), (vms[9],1), (vms[0], 2)]
pmmem = [(pms[1],4), (pms[2],4), (pms[3],8), (pms[4], 4), (pms[0], 4)]


for (vm, m) in vmmem:
    solver.add_soft(Implies(alive(vm), mem(vm)==m),100)
    
for (pm, m) in pmmem:
    solver.add_soft(Implies(alive(pm), mem(pm)==m),100)

for i in vms[1:5]:
    solver.add_soft(alive(i), 10)
topology = solve(solver)
display(rp, topology)

for curr in range(0, 20):
    for j in range(0,100):
        s = raw_input('constraint[ | weight]>>')
        if s == 'quit' or s == 'q':
            quit()
        if s == 'go':
            break
        if '|' in s:
            conswei = s.split('|')
            print conswei[0].strip()
            cst = eval(conswei[0].strip())
            weight = int(conswei[1].strip())
            solver.add_soft(cst,weight)
        else:
            cst = eval(s.strip())
            solver.add_hard(cst)
            #solver.add_soft(cst, (j+2)*100)
    topology = solve(solver)
    print solver.get_broken()
    display(rp, topology)        