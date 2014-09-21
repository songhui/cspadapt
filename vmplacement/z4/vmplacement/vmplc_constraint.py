from softz3_opt import *
from softz3_msopt import *
from z3 import *
from z3util import *
from vmplc_painter import *
from time import clock
from random import choice
from itertools import product
from vmplc_func import *


numVm = 10
numPm = 5


nameVm = ['vm%d'%(i) for i in range(0, numVm)]
namePm = ['pm%d'%(i) for i in range(0, numPm)]

Types, (NullType, VM, PM) = EnumSort('Types', ['Null', 'VM', 'PM'])
    
CompInst, comps = EnumSort('CompInst', ['null'] + nameVm + namePm)

curr = 0
nullinst = comps[curr]
curr += 1
vms = comps[curr:curr + numVm]
curr += numVm
pms = comps[curr:curr+numPm]

alive = Function('alive', CompInst, BoolSort())
typeof = Function('typeof', CompInst, Types)

plc = Function('plc', CompInst, CompInst)
backup = Function('backup', CompInst, CompInst, BoolSort())
frqt = Function('frqt', CompInst, CompInst, BoolSort())
near = Function('near', CompInst, CompInst, BoolSort())

mem = Function('mem', CompInst, IntSort())
core = Function('core', CompInst, IntSort())
fixed_soft = []

rp = ResultPainter()
rp.vars = comps
rp.types = [typeof]
rp.refs = [plc] 
rp.filters = [alive]
rp.multi_refs = [backup, frqt, near]
#rp.attrs = [mem, core]
rp.attrs = [mem]
rp.use_filters = True

solver = SoftSolverMsOpt()
quick = QuickExpr(alive, typeof, nullinst, NullType)


solver.add_hard(typeof(nullinst) == NullType)
solver.add_hard(alive(nullinst) == False)

#solver.add_hard(And([alive(i)== (typeof(i)==NullType) for i in comps]))

solver.add_hard(And([Or(alive(i), 
                        And(typeof(i)==NullType, 
                            plc(i)==nullinst, 
                            mem(i)==0,
                            core(i)==0)) 
                     for i in comps[1:] ]))

solver.add_hard(And([
                     Or(
                        And(typeof(x)==PM, typeof(y)==PM),
                        near(x,y)==False
                        )
                     for (x,y) in product(comps[1:], comps[1:])
                     ]
                    ))

solver.add_hard(And([
                     Or(
                        And(typeof(x)==VM, typeof(y)==VM),
                        And(backup(x, y)==False, frqt(x,y)==False)
                        )
                     for x, y in product(comps[1:], comps[1:])
                     ]))
solver.add_hard(And([
                     Or(
                        Not(And(alive(x), alive(y))),
                        near(x, y) == False
                        )
                     ]))

solver.add_hard(And([And(backup(x,y)==backup(y,x), frqt(x,y)==frqt(y,x)) for (x,y) in product(vms, vms)]))
solver.add_hard(And([near(x,y)==near(y,x) for (x,y) in product(pms, pms)]))

for icomp in vms:
    solver.add_hard(quick.alter_types(icomp, [VM]))
    solver.add_hard(quick.type_dep(icomp, plc, VM, [PM]))
    
for x,y in product(vms, vms):
    fixed_soft.append((Implies(backup(x,y), plc(x)!=plc(y)), 9))
    fixed_soft.append((Implies(frqt(x,y), near(plc(x), plc(y))), 5))
    
for icomp in pms:
    solver.add_hard(quick.alter_types(icomp, [PM]))
    solver.add_hard(quick.count_sum(vms, icomp, plc, mem)<=mem(icomp))
    solver.add_hard(Implies(alive(icomp), near(icomp, icomp)))
            

for i in comps:
    solver.add_soft(Not(alive(i)),1)
    

    
#solver.add_hard(alive(vms[0]))

for (cst, wt) in fixed_soft:
    solver.add_soft(cst, wt)

    
topology = solve(solver)
#display(rp, topology)

def start_over(topology):
    del solver.soft[:]
    for (cst, wt) in fixed_soft:
        solver.add_soft(cst, wt)
    
    for i in comps[1:]:
        if str(topology(alive(i)))=='False':
            solver.add_soft(Not(alive(i)), 1)
        else:
            if str(topology(plc(i)))!='null':
                solver.add_soft(plc(i)==topology(plc(i)), int(str(topology(mem(i)))))
            if str(topology(typeof(i)==VM))=='True':
                solver.add_soft(core(i)==topology(core(i)), 4)
    
    