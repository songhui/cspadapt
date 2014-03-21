from formanual import *
import itertools

goals = []

vmlit = [vM_v1, vM_v2, vM_v3, vM_v4, vM_v5, vM_v6, vM_v7, vM_v8, vM_v9, vM_v10]
pmlit = [pM_pm1, pM_pm2, pM_pm3, pM_pm4, pM_pm5]

consume = Function('consume', VM, PM, IntSort())
consume_load = Function('conume_load', VM, PM, IntSort())
        
v = Const('v', VM)
p = Const('p', PM)
hard.append(ForAll([v,p], consume(v,p) == If(vM_plc(v) == p, vM_mem(v), 0) ))
hard.append(ForAll([v,p], consume_load(v,p) == If(vM_plc(v) == p, vM_tp(v), 0)))

goal_weights = []

for pm in pmlit:
	expr = IntVal(0)
	for vm in vmlit:
		expr = expr + consume(vm,pm)
	goals.append(expr <= pM_mem(pm))
	goal_weights.append(100000)
	
for pm in pmlit:
	expr = IntVal(0)
	for vm in vmlit:
		expr = expr + consume_load(vm,pm)
	goals.append(expr <= pM_tpLimit(pm))
	goal_weights.append(80)
	
for vm in vmlit:
	goals.append(vM_core(vm) <= pM_core(vM_plc(vm)))
	goal_weights.append(100000)
	goals.append(Implies(vM_bit64(vm), pM_bit64(vM_plc(vm))))
	goal_weights.append(100000)
	goals.append(pM_stable(vM_plc(vm)))
	goal_weights.append(40)
	
for (vm1, vm2) in itertools.product(vmlit,vmlit):
	goals.append( Implies(vM_backup(vm1, vm2), vM_plc(vm1) != vM_plc(vm2)))
	goal_weights.append(70)
	
for (vm1, vm2) in itertools.product(vmlit, vmlit):
	goals.append( Implies(vM_syncPeak(vm1, vm2), vM_plc(vm1) != vM_plc(vm2)) )
	goal_weights.append(40)
	
for (vm1, vm2) in itertools.product(vmlit, vmlit):
	goals.append( Implies(vM_frqt(vm1, vm2), pM_near( vM_plc(vm1), vM_plc(vm2))) )
	goal_weights.append(30)
	

	
	