from softz3_opt import *
from softz3_msopt import *
from z3 import *
from z3util import *
from painter import *
from time import clock
from summer_constraint import *

context_group=[
               [traffic],
               [driving, cheap],
               [driving, traffic, private],
               [traffic, secure],
               [pollution, private, cheap],
               [fast, private],
               [fast, secure]
            ]


#display(rp, topology)

generated_topologys = []

for xxx in range(0,3):
    del solver.soft[:]
    for i in comps[numGh+1:]:
        solver.add_soft(Not(alive(i)), 1)
    for i in instGh:
        solver.add_soft(alive(i),1)
    topology = solve(solver)
    #display(rp, topology)
    '''
        awake comps with default types
    '''
    defaults = [(instGh, GhDriving), (instEnc, EncPollution), (instStr, StorePltf), (instVm, EC2Free)]
        
    for i in range(0, 10):
        start_over_div(topology)
        for i in range(0,3):
            x = choice(comps[1:])
            for (inst, type) in defaults:
                if x in inst:
                    solver.add_soft(typeof(x)==type, 10)
        topology = solve(solver)
        (total, shannon) = rp._shannon_without_show(topology)
        print (total, shannon)
        generated_topologys.append((topology, total, shannon))
        
            
    '''
    force gh to be diff types
    '''
    del solver.soft[:]
    for i in instGh:
        solver.add_soft(alive(i), 5)
        
    for i in comps[numGh:]:
        solver.add_soft(Not(alive(i)), 2)
    
    topology = solve(solver)
        
    for i in range(0,10):
        start_over_div(topology)
        shuffle(topology, instGh, 2)
        topology = solve(solver)
        (total, shannon) = rp._shannon_without_show(topology)
        print (total, shannon)
        generated_topologys.append((topology, total, shannon))
    
    
    '''
    awake gh with enforced types
    '''
    del solver.soft[:]
    ghtypes = [GhUni, GhStatic, GhDriving, GhWorkOut, GoogMap]
    for i in instGh:
        solver.add_soft(alive(i), 5)
        
    for i in comps[numGh:]:
        solver.add_soft(Not(alive(i)), 2)
    
    topology = solve(solver)
        
    for i in range(0,10):
        start_over_div(topology)
        for j in range(0,2):
            inst = choice(instGh)
            type = choice(ghtypes)
            solver.add_soft(typeof(inst)==type, 40)
        topology = solve(solver)
        (total, shannon) = rp._shannon_without_show(topology)
        print (total, shannon)
        generated_topologys.append((topology, total, shannon))
        
        
    
    ''' 
        awake comps with random types
    '''
    
    del solver.soft[:]    
    for i in instGh:
        solver.add_soft(alive(i), 2)
    for i in comps[numGh+1:]:
        solver.add_soft(Not(alive(i)), 2)
    
    topology = solve(solver)
        
    for i in range(0,10):
        start_over_div(topology)
        activate(topology, num=2)
        topology = solve(solver)
        (total, shannon) = rp._shannon_without_show(topology)
        print (total, shannon)
        generated_topologys.append((topology, total, shannon))
    
    print [ (total, shannon) for (top, total, shannon) in generated_topologys]
    
    '''
    
    '''




results = []
topology = None
curr = 1
for topology, total, shannon in generated_topologys:
    print '\n\n================'
    print '%d of %d topology' % (curr, len(generated_topologys))
    curr = curr+1
    phase_res = []
    results.append(phase_res)
    for ctx in context_group:
        del solver.soft[:]
        for i in comps[1:]:
            if str(topology(alive(i)))=='False':
                solver.add_soft(Not(alive(i)), 5)
            else:
                solver.add_soft(alive(i), 4)
                solver.add_soft(typeof(i)==topology(typeof(i)), 8)
                for r in refs:
                    if str(topology(r(i)))!='null':
                        solver.add_soft(r(i)==topology(r(i)), 2)
        for x in ctx:
            solver.add_soft(x, 30)
        ntopology = solve(solver)
        #print solver.solver.sexpr()
        print "%s, %s" %(shannon, ntopology(typeof(theone)))
        print solver.get_broken()
        #print solver.get_broken_weight()
        phase_res.append(solver.get_broken_weight())
        
        #display(rp, ntopology)
    
for i, r in enumerate(results):
    print "%d,\t %.4f,\t %d" % (generated_topologys[i][1], generated_topologys[i][2], sum(r))
    
          

"""
?
"""

#for i in range(0,1):
#    activate(solver, eval, instGh, alive, 12)
#    eval = solve(solver) 
#    display(rp, eval)
#    print rp._shannon_without_show()
#
#for i in range(0,1):
#    shuffle(solver, eval, instGh, typeof, alive, 6)
#    eval = solve(solver)
#    display(rp, eval)
#solver.add_soft(traffic, 1000)


"""
Directly re-adapt based on a fixed solution
"""
#del solver.soft[:]
#for i in comps:
#    solver.add_soft(Not(alive(i)),1)
#solver.add_soft(alive(instGh[0]),2)
#solver.add_soft(traffic, 100)
#solver.add_soft(typeof(instGh[0])==GhDriving, 5)
#solver.add_soft(dGhEnc(instGh[0])==instEnc[0],6)
#solver.add_soft(typeof(instEnc[0])==EncNoise,6)
#solver.add_soft(host(instGh[0])==instVm[0],20)
#solver.add_soft(host(instEnc[0])==instVm[0],20)
#solver.add_soft(dEncStr(instEnc[0])==instStr[0],3)
#solver.add_soft(typeof(instStr[0])==StorePltf,5)
#solver.add_soft(typeof(instVm[0])==EC2,6)




#solver.add_soft(theone==instGh[0],10)
#solver.add_soft(commuter, 100)
#solver.add_soft(cheap, 1000)
#solver.add_soft(fast,1000)
#solver.add_soft(private, 1000)
#solver.add_soft(secure,1000)
#solver.add_soft(pollution, 1000)

#eval = solve(solver)
#print solver.get_broken()
#print solver.solver.sexpr()
#display(rp, eval)





    
    