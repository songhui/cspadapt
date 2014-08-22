from softz3_opt import *
from z3 import *
from z3util import *

numOfInst = 8
numOfStub = 2

nameInst = ['inst%d'%(i) for i in range(1,numOfInst+1)]
nameStub = ['stub%d'%(i) for i in range(numOfInst, numOfInst + numOfStub)]

CompType, (NullType, GhPul, GhTraf, EncTrafOnly, EncVersatile, GoogMap, EC2, Azure) = EnumSort('CompType', ['NullType', 'GhPul', 'GhTraf', 'EncTrafOnly', 'EncVersatile', 'GoogMap', 'EC2', 'Azure'])
CompInst, comps = EnumSort('CompInst', ['null'] + nameInst + nameStub)

nullinst = comps[0]

alive = Function('alive', CompInst, BoolSort())
typeof = Function('typeof', CompInst, CompType)

host = Function('host', CompInst, CompInst)

dGhEnc = Function('dGhEnc', CompInst, CompInst)

icomp = Const('icomp', CompInst)
iicomp = Const('iicomp', CompInst)

solver = SoftSolverOpt()
quick = QuickExpr(alive, typeof, nullinst, NullType)

solver.add_hard(typeof(nullinst) == NullType)
solver.add_hard(alive(nullinst) == False)

solver.add_hard(ForAll([icomp], quick.only_alive_type(icomp, GhTraf, And(alive(dGhEnc(icomp)), Or(typeof(dGhEnc(icomp))==EncTrafOnly), typeof(dGhEnc(icomp))==EncVersatile))))
solver.add_hard(ForAll([icomp], quick.only_alive_type(icomp, GhPul, And(alive(dGhEnc(icomp)), typeof(dGhEnc(icomp))==EncVersatile))))
solver.add_hard(ForAll([icomp], quick.only_alive_types(icomp, [GhPul, GhTraf, EncTrafOnly, EncVersatile], And(alive(host(icomp)), Or([typeof(host(icomp))==t for t in [EC2, Azure]])))))

solver.add_hard(ForAll([icomp], quick.only_alive_types(icomp, [EncTrafOnly, EncVersatile, EC2, Azure], dGhEnc(icomp)==nullinst)))
solver.add_hard(ForAll([icomp], quick.only_alive_types(icomp, [EC2, Azure], host(icomp)==nullinst)))

for i in comps[1:4]:
    solver.add_soft(And(alive(i), typeof(i)==GhPul),20)
    
for i in comps[1+numOfInst:]:
    solver.add_soft(alive(i) == False, 50)
    
    
solver.init_solver()
        
print len(solver.soft)
solver.error = 20
solver.debug = False


print "final total: %d" % solver.search() 

print solver.model()






    
    