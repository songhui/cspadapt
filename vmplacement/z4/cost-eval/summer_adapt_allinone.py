from softz3_opt import *
from softz3_msopt import *
from z3 import *
from z3util import *
from painter import *
from time import clock
from summer_constraint import *

topology = solve(solver)
#display(rp, topology)

generated_topologys = []
"""
Wake some comps up
"""
for i in range(0,10):
    activate(solver, topology, comps, alive, 2)
    topology = solve(solver)
    #display(rp, topology)
    rp.eval = topology
    generated_topologys.append( (topology, rp._shannon_without_show()) )

results = []
topology = None
for topology, shannon in generated_topologys:
    phase_res = []
    results.append(phase_res)
    for x in range(0,10):
        del solver.soft[:]
        for i in comps[1:]:
            if str(topology(alive(i)))=='False':
                solver.add_soft(Not(alive(i)), 10)
            else:
                solver.add_soft(alive(i), 4)
                solver.add_soft(typeof(i)==topology(typeof(i)), 10)
                for r in refs:
                    if str(topology(r(i)))!='null':
                        solver.add_soft(r(i)==topology(r(i)), 10)
        n=len(context)       
        solver.add_soft(context[x%n], 200)
        if x > n:
            solver.add_soft(context[(x*17)%n], 200)
        ntopology = solve(solver)
        #print solver.solver.sexpr()
        print "----"
        print shannon
        print ntopology(typeof(theone))
        print solver.get_broken()
        #print solver.get_broken_weight()
        phase_res.append(solver.get_broken_weight())
        
        #display(rp, ntopology)
    
for i, r in enumerate(results):
    print "shannon: %f, cost: %d" % (generated_topologys[i][1], sum(r))
    
        

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





    
    