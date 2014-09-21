from softz3_opt import *
from softz3_msopt import *
from z3 import *
from z3util import *
from vmplc_painter import *
from time import clock
from random import *

def solve(solver):
    solver.init_solver()
    before = clock()
    solver.search() 
    print ">> Solved in: %.2f" % (clock() - before)
    return solver.model().eval

def display(painter, eval):
    painter.eval = eval
    painter.make_graph()
    
def activate(solver, eval, comps, alive, num):
    i = 0
    while(i < num):
        x = randint(0, len(comps)-1)
        if str(eval(alive(comps[x])))=='False':
           solver.add_soft(alive(comps[x]), 10)
           i = i+1
    
def shuffle(solver, eval, comps, typeof, alive, num):   
    alived = [x for x in comps if str(eval(alive(x))) == 'True']
    print alived
    for i in range(0, num):
        x = randint(0, len(alived)-2)
        y = randint(x+1, len(alived)-1)
        if str(eval(typeof(alived[x])==typeof(alived[y])))=='True':
            solver.add_soft(typeof(alived[x])!=typeof(alived[y]), 20)
        
        
#def adapt_from_eval(solver, eval, comps, alive, typeof, refs, contexts):
#    solver._ini            
    