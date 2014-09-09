from softz3_opt import *
from softz3_msopt import *
from z3 import *
from z3util import *
from painter import *
from time import clock

numOfInst = 7
numOfStub = 4

nameInst = ['inst%d'%(i) for i in range(1,numOfInst+1)]
nameStub = ['stub%d'%(i) for i in range(numOfInst+1, numOfInst + numOfStub+1)]

CompType, (NullType, GhPul, GhTraf, EncTrafOnly, EncVersatile, GoogMap, EC2, Azure) = EnumSort('CompType', ['NullType', 'GhPul', 'GhTraf', 'EncTrafOnly', 'EncVersatile', 'GoogMap', 'EC2', 'Azure'])
CompInst, comps = EnumSort('CompInst', ['null'] + nameInst + nameStub)

nullinst = comps[0]

alive = Function('alive', CompInst, BoolSort())
typeof = Function('typeof', CompInst, CompType)

host = Function('host', CompInst, CompInst)

dGhEnc = Function('dGhEnc', CompInst, CompInst)

mem = Function('mem', CompInst, IntSort())

#icomp = Const('icomp', CompInst)
#iicomp = Const('iicomp', CompInst)

solver = SoftSolverMsOpt()
quick = QuickExpr(alive, typeof, nullinst, NullType)

solver.add_hard(typeof(nullinst) == NullType)
solver.add_hard(alive(nullinst) == False)

#solver.add_hard(ForAll([icomp], quick.only_alive_type(icomp, GhTraf, And(alive(dGhEnc(icomp)), Or([typeof(dGhEnc(icomp))==t for t in [ EncTrafOnly]] )))))
#solver.add_hard(ForAll([icomp], quick.only_alive_type(icomp, GhPul, And(alive(dGhEnc(icomp)), typeof(dGhEnc(icomp))==EncVersatile))))
#solver.add_hard(ForAll([icomp], quick.only_alive_types(icomp, [GhPul, GhTraf, EncTrafOnly, EncVersatile], And(alive(host(icomp)), Or([typeof(host(icomp))==t for t in [EC2, Azure]])))))
#
#solver.add_hard(ForAll([icomp], quick.only_alive_types(icomp, [EncTrafOnly, EncVersatile, EC2, Azure], dGhEnc(icomp)==nullinst)))
#solver.add_hard(ForAll([icomp], quick.only_alive_types(icomp, [EC2, Azure], host(icomp)==nullinst)))

# get rid of ForAll?
for icomp in comps[1:] :
    solver.add_hard(quick.only_alive_type(icomp, GhTraf, And(alive(dGhEnc(icomp)), Or([typeof(dGhEnc(icomp))==t for t in [ EncTrafOnly]] ))))
    solver.add_hard(quick.only_alive_type(icomp, GhPul, And(alive(dGhEnc(icomp)), typeof(dGhEnc(icomp))==EncVersatile)))
    solver.add_hard(quick.only_alive_types(icomp, [GhPul, GhTraf, EncTrafOnly, EncVersatile], And(alive(host(icomp)), Or([typeof(host(icomp))==t for t in [EC2, Azure]]))))
    solver.add_hard(quick.only_alive_types(icomp, [EncTrafOnly, EncVersatile, EC2, Azure], dGhEnc(icomp)==nullinst))
    solver.add_hard(quick.only_alive_types(icomp, [EC2, Azure], host(icomp)==nullinst))
for icomp in comps[7:] :
    solver.add_hard(quick.only_alive_types(icomp, [EC2, Azure], quick.count(comps[1:], icomp, host) <= mem(icomp)))
#solver.add_hard(ForAll([icomp], (typeof(icomp)==NullType)==(not alive(icomp))))

# for i in comps[1:4]:
#     solver.add_soft(And(alive(i), typeof(i)==GhPul),20)    
# for i in comps[4:6]:
#     solver.add_soft(And(alive(i), Or(typeof(i)==EncTrafOnly, typeof(i)==EncVersatile)), 15)    
# for i in comps[6:8]:
#     solver.add_soft(And(alive(i), Or(typeof(i)==EC2, typeof(i)==Azure)), 18)    

for i in comps[1:6] :
    solver.add_hard(quick.alter_types(i, [GhPul, GhTraf]))
    #solver.add_hard(quick.alter_types(dGhEnc(i),[EncTrafOnly, EncVersatile]))  

for i in comps[6:7] :
    solver.add_hard(quick.alter_types(i, [EncTrafOnly, EncVersatile]))
    
#for i in comps[1:7]:
    #solver.add_hard(quick.alter_types(host(i), [Azure, EC2]))

for i in comps[7:8]:
    solver.add_hard(quick.alter_types(i, [Azure, EC2]))
    

for i in comps[1:6] :
    solver.add_soft(alive(i), 300)
    
for i in comps[8:12] :
    solver.add_soft(Not(alive(i)), 30)
    
for i in comps[1:6] :
    solver.add_soft(dGhEnc(i)==comps[6], 17)
    
for i in comps[1:7]:
    solver.add_soft(host(i)==comps[7], 15)
    
solver.add_soft(typeof(comps[1])!=typeof(comps[2]), 500)

#limited capacity of vms
solver.add_soft(And([quick.only_alive_types(i, [Azure], mem(i)==2) for i in comps[6:]]), 600)
solver.add_soft(And([quick.only_alive_types(i, [EC2], mem(i)==3) for i in comps[6:]]), 600)

    
solver.init_solver()
        
print len(solver.soft)


before = clock()
solver.search() 
print clock() - before

#print solver.model()

eval = solver.model().eval

print eval(typeof(comps[2]))
print eval(alive(comps[2]))

rp = ResultPainter()
rp.vars = comps
rp.types = [typeof]
rp.refs = [dGhEnc, host]
rp.filters = [alive]
rp.use_filters = True
rp.eval = solver.model().eval
rp.make_graph()




    
    