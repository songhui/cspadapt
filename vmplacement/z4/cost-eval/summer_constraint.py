from softz3_opt import *
from softz3_msopt import *
from z3 import *
from z3util import *
from painter import *
from time import clock
from summer_func import *
from random import choice

numGh = 10
numEnc = 10
numStr = 8
numVm = 4

nameGh = ['gh%d'%(i) for i in range(1,numGh+1)]
nameEnc = ['enc%d'%(i) for i in range(1, numEnc+1)]
nameStr = ['str%d'%(i) for i in range(1, numStr+1)]
nameVm = ['vm%d'%(i) for i in range(1, numVm+1)]

CompType, (NullType, GhUni, GhStatic, GhDriving, GhWorkOut, GoogMap, 
           EncBasic, EncAllService, EncPollution, EncTraffic, EncNoise,
           StoreApp, StorePltf, StorePltf2, 
           EC2, EC2Free, Azure) = \
    EnumSort('CompType', [
           'NullType', 'GhUni', 'GhStatic', 'GhDriving', 'GhWorkOut', 'GoogMap', 
           'EncBasic', 'EncAllService', 'EncPollution', 'EncTraffic', 'EncNoise',
           'StoreApp', 'StorePltf', 'StorePltf2', 
           'EC2', 'EC2Free', 'Azure'
        ])
    
CompInst, comps = EnumSort('CompInst', ['null'] + nameGh + nameEnc + nameStr + nameVm)

curr = 0
nullinst = comps[curr]
curr += 1
instGh = comps[curr:curr + numGh]
curr += numGh
instEnc = comps[curr:curr+numEnc]
curr += numEnc
instStr = comps[curr:curr+numStr]
curr += numStr
instVm = comps[curr:curr+numVm]

alive = Function('alive', CompInst, BoolSort())
typeof = Function('typeof', CompInst, CompType)

host = Function('host', CompInst, CompInst)
dGhEnc = Function('dGhEnc', CompInst, CompInst)
dEncStr = Function('dEncStr', CompInst, CompInst)
mem = Function('mem', CompInst, IntSort())

refs = [dGhEnc, host, dEncStr]

rp = ResultPainter()
rp.vars = comps
rp.types = [typeof]
rp.refs = refs 
rp.filters = [alive]
rp.use_filters = True

#icomp = Const('icomp', CompInst)
#iicomp = Const('iicomp', CompInst)

solver = SoftSolverMsOpt()
quick = QuickExpr(alive, typeof, nullinst, NullType)


solver.add_hard(typeof(nullinst) == NullType)
solver.add_hard(alive(nullinst) == False)

solver.add_hard(And([Or(alive(i), 
                        And(typeof(i)==NullType, 
                            dGhEnc(i)==nullinst, 
                            dEncStr(i)==nullinst,
                            host(i)==nullinst)) 
                     for i in comps[1:] ]))

for icomp in instGh:
    solver.add_hard(quick.alter_types(icomp, [GhUni, GhStatic, GhDriving, GhWorkOut, GoogMap]))
    solver.add_hard(quick.type_dep(icomp, dGhEnc, GhUni, [EncBasic, EncAllService]))
    solver.add_hard(quick.type_dep(icomp, dGhEnc, GhStatic, [EncBasic]))
    solver.add_hard(quick.type_dep(icomp, dGhEnc, GhDriving, [EncAllService, EncPollution, EncTraffic, EncNoise]))
    solver.add_hard(quick.type_dep(icomp, dGhEnc, GhWorkOut,[EncAllService, EncPollution, EncNoise]))
    solver.add_hard(quick.ref_to_null(icomp, dGhEnc, GoogMap))
    solver.add_hard(Implies(And(alive(icomp), alive(dGhEnc(icomp)), alive(host(icomp)), alive(host(dGhEnc(icomp)))), 
                            host(icomp)==host(dGhEnc(icomp))))
    
    
    
for icomp in instEnc + instStr + instVm:
    solver.add_hard(dGhEnc(icomp)==nullinst) 
    
for icomp in instEnc:
    solver.add_hard(quick.alter_types(icomp, [EncAllService, EncBasic, EncNoise, EncPollution, EncTraffic]))
    solver.add_hard(quick.type_dep(icomp, dEncStr, 
                                            EncAllService, 
                                            [StoreApp]))
    solver.add_hard(quick.type_dep(icomp, dEncStr, 
                                            EncTraffic, 
                                            [StoreApp, StorePltf2]))
    solver.add_hard(quick.type_dep(icomp,dEncStr,EncNoise,[StoreApp,StorePltf]))
    solver.add_hard(quick.type_dep_multiple(icomp, dEncStr, 
                                            [EncBasic, EncPollution], 
                                            [StoreApp, StorePltf, StorePltf2]))
    
        
for icomp in instGh + instStr + instVm:
    solver.add_hard(dEncStr(icomp)==nullinst)
    
    
for icomp in instGh + instEnc + instStr:
    solver.add_hard(quick.ref_to_null_multiple(icomp, host, [GoogMap, StorePltf, StorePltf2]))
    solver.add_hard(quick.type_dep_multiple(icomp, host, 
                                            [GhDriving, GhStatic, GhUni, GhWorkOut, EncAllService, EncBasic, EncNoise, EncPollution, EncTraffic, StoreApp], 
                                            [EC2, EC2Free, Azure]))
    solver.add_hard(mem(icomp)==0)
    
for icomp in instVm:
    solver.add_hard(host(icomp)==nullinst)
    
for icomp in instStr:
    solver.add_hard(quick.alter_types(icomp, [StoreApp, StorePltf, StorePltf2]))
    solver.add_hard(quick.type_dep(icomp, host, StoreApp, [EC2]))
    
for icomp in instVm:
    solver.add_hard(quick.alter_types(icomp, [EC2, EC2Free, Azure]))
    solver.add_hard(quick.count(instGh+instEnc+instStr, icomp, host)<=mem(icomp))
    solver.add_hard(Implies(typeof(icomp)==EC2, mem(icomp)==4))
    solver.add_hard(Implies(typeof(icomp)==EC2Free, mem(icomp)==2))
    solver.add_hard(Implies(typeof(icomp)==Azure, mem(icomp)==4))
    
    
theone = Const('theone', CompInst)
solver.add_hard(Or([And(theone==i, alive(theone)) for i in instGh]))

#Context
driving = Const('driving', BoolSort())
pollution = Const('pollution', BoolSort())
traffic = Const('traffic', BoolSort())
fast = Const('fast', BoolSort())
cheap = Const('cheap', BoolSort())
private = Const('private', BoolSort())
secure = Const('secure', BoolSort())


context = [driving, pollution, traffic, fast, cheap, private, secure]

solver.add_hard(Implies(driving, typeof(theone)==GhDriving))
solver.add_hard(Implies(pollution, typeof(dGhEnc(theone))==EncPollution))
solver.add_hard(Implies(traffic, 
                        Or([typeof(dGhEnc(theone))==t 
                             for t in [EncTraffic,EncAllService] ]
                            )
                        ))
solver.add_hard(Implies(cheap,
                        quick.cartesian_not_equal(
                                                  [host(theone), host(dEncStr(dGhEnc(theone)))], 
                                                  [EC2, Azure])
                        ))
solver.add_hard(Implies(cheap,
                        typeof(dEncStr(dGhEnc(theone)))!=StorePltf))
solver.add_hard(Implies(fast,
                        Or(typeof(dGhEnc(theone))==EncBasic, 
                           typeof(theone)==GoogMap)
                        ))
solver.add_hard(Implies(private, 
                        quick.cartesian_not_equal([theone], [GhUni,GoogMap])))
solver.add_hard(Implies(secure, typeof(host(theone))!=EC2Free))

for i in comps:
    solver.add_soft(Not(alive(i)),1)
    



#functions

'''
convert the current topology into soft constraints, which means 
starting from the configuration encoded in eval
'''
def start_over_div(topology):
    del solver.soft[:]
    for i in comps[1:]:
        if str(topology(alive(i)))=='False':
            solver.add_soft(Not(alive(i)), 1)
        else:
            solver.add_soft(alive(i), 10)
            solver.add_soft(typeof(i)==topology(typeof(i)), 1)
            for r in refs:
                if str(topology(r(i)))!='null':
                    solver.add_soft(r(i)==topology(r(i)), 1)

def shuffle(topology, target, num):   
    alived = [x for x in target if str(topology(alive(x))) == 'True']
    for i in range(0, num):
        x = randint(0, len(alived)-2)
        y = randint(x+1, len(alived)-1)
        if str(topology(typeof(alived[x])==typeof(alived[y])))=='True':
            solver.add_soft(typeof(alived[x])!=typeof(alived[y]), 10)


def activate(topology, target=comps[1:], num=1, weight=10):
    i = 0
    j = 0
    while(i < num and j<20):
        j = j+1
        x = choice(target)
        if str(topology(alive(x)))=='False':
           solver.add_soft(alive(x), weight)
           i = i+1

        
    
    