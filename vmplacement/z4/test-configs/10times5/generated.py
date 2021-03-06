from z3 import *
pM_names = ['pm1', 'pm2', 'pm3', 'pm4', 'pm5']
pMs = dict()
PM, (pM_pm1, pM_pm2, pM_pm3, pM_pm4, pM_pm5) = EnumSort('PM', pM_names)
vM_names = ['v1', 'v2', 'v3', 'v4', 'v5', 'v6', 'v7', 'v8', 'v9', 'v10']
vMs = dict()
VM, (vM_v1, vM_v2, vM_v3, vM_v4, vM_v5, vM_v6, vM_v7, vM_v8, vM_v9, vM_v10) = EnumSort('VM', vM_names)
objName = Function('vM_core', VM, IntSort()) 

pM_bit64 = Function('pM_bit64', PM, BoolSort())
vM_plc = Function('vM_plc', VM, PM)
pM_near = Function('pM_near', PM, PM, BoolSort())
pM_core = Function('pM_core', PM, IntSort())
pM_stable = Function('pM_stable', PM, BoolSort())
vM_core = Function('vM_core', VM, IntSort())

goals = [
	(pM_stable(vM_plc(vM_v1))) == (True),
	(vM_plc(vM_v4)) != (vM_plc(vM_v1)),
	(vM_plc(vM_v6)) != (vM_plc(vM_v1)),
	(vM_core(vM_v1)) <= (pM_core(vM_plc(vM_v1))),
	(vM_plc(vM_v3)) != (vM_plc(vM_v2)),
	(pM_stable(vM_plc(vM_v2))) == (True),
	(vM_core(vM_v2)) <= (pM_core(vM_plc(vM_v2))),
	(pM_stable(vM_plc(vM_v3))) == (True),
	pM_bit64(vM_plc(vM_v3)),
	(vM_core(vM_v3)) <= (pM_core(vM_plc(vM_v3))),
	(pM_stable(vM_plc(vM_v4))) == (True),
	pM_bit64(vM_plc(vM_v4)),
	(vM_plc(vM_v1)) != (vM_plc(vM_v4)),
	(vM_plc(vM_v6)) != (vM_plc(vM_v4)),
	(vM_core(vM_v4)) <= (pM_core(vM_plc(vM_v4))),
	(pM_stable(vM_plc(vM_v5))) == (True),
	(pM_near(vM_plc(vM_v6),vM_plc(vM_v5)) == True) ,
	(vM_core(vM_v5)) <= (pM_core(vM_plc(vM_v5))),
	(pM_stable(vM_plc(vM_v6))) == (True),
	(vM_plc(vM_v4)) != (vM_plc(vM_v6)),
	(vM_plc(vM_v1)) != (vM_plc(vM_v6)),
	(vM_core(vM_v6)) <= (pM_core(vM_plc(vM_v6))),
	(pM_stable(vM_plc(vM_v7))) == (True),
	(vM_core(vM_v7)) <= (pM_core(vM_plc(vM_v7))),
	(vM_plc(vM_v9)) != (vM_plc(vM_v8)),
	(pM_stable(vM_plc(vM_v8))) == (True),
	(vM_core(vM_v8)) <= (pM_core(vM_plc(vM_v8))),
	(pM_stable(vM_plc(vM_v9))) == (True),
	(pM_near(vM_plc(vM_v10),vM_plc(vM_v9)) == True) ,
	(pM_near(vM_plc(vM_v6),vM_plc(vM_v9)) == True) ,
	(vM_core(vM_v9)) <= (pM_core(vM_plc(vM_v9))),
	(pM_stable(vM_plc(vM_v10))) == (True),
	(vM_core(vM_v10)) <= (pM_core(vM_plc(vM_v10))),
	((If((vM_plc(vM_v1)) == (pM_pm1), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm1), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm1), 3, 0)+If((vM_plc(vM_v4)) == (pM_pm1), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm1), 2, 0)+If((vM_plc(vM_v6)) == (pM_pm1), 1, 0)+If((vM_plc(vM_v7)) == (pM_pm1), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm1), 10, 0)+If((vM_plc(vM_v9)) == (pM_pm1), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm1), 1, 0))) <= (10),
	((If((vM_plc(vM_v1)) == (pM_pm1), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm1), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm1), 1, 0)+If((vM_plc(vM_v4)) == (pM_pm1), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm1), 6, 0)+If((vM_plc(vM_v6)) == (pM_pm1), 2, 0)+If((vM_plc(vM_v7)) == (pM_pm1), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm1), 1, 0)+If((vM_plc(vM_v9)) == (pM_pm1), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm1), 2, 0))) <= (4),
	((If((vM_plc(vM_v1)) == (pM_pm2), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm2), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm2), 3, 0)+If((vM_plc(vM_v4)) == (pM_pm2), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm2), 2, 0)+If((vM_plc(vM_v6)) == (pM_pm2), 1, 0)+If((vM_plc(vM_v7)) == (pM_pm2), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm2), 10, 0)+If((vM_plc(vM_v9)) == (pM_pm2), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm2), 1, 0))) <= (10),
	((If((vM_plc(vM_v1)) == (pM_pm2), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm2), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm2), 1, 0)+If((vM_plc(vM_v4)) == (pM_pm2), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm2), 6, 0)+If((vM_plc(vM_v6)) == (pM_pm2), 2, 0)+If((vM_plc(vM_v7)) == (pM_pm2), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm2), 1, 0)+If((vM_plc(vM_v9)) == (pM_pm2), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm2), 2, 0))) <= (8),
	((If((vM_plc(vM_v1)) == (pM_pm3), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm3), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm3), 3, 0)+If((vM_plc(vM_v4)) == (pM_pm3), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm3), 2, 0)+If((vM_plc(vM_v6)) == (pM_pm3), 1, 0)+If((vM_plc(vM_v7)) == (pM_pm3), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm3), 10, 0)+If((vM_plc(vM_v9)) == (pM_pm3), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm3), 1, 0))) <= (5),
	((If((vM_plc(vM_v1)) == (pM_pm3), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm3), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm3), 1, 0)+If((vM_plc(vM_v4)) == (pM_pm3), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm3), 6, 0)+If((vM_plc(vM_v6)) == (pM_pm3), 2, 0)+If((vM_plc(vM_v7)) == (pM_pm3), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm3), 1, 0)+If((vM_plc(vM_v9)) == (pM_pm3), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm3), 2, 0))) <= (16),
	((If((vM_plc(vM_v1)) == (pM_pm4), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm4), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm4), 3, 0)+If((vM_plc(vM_v4)) == (pM_pm4), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm4), 2, 0)+If((vM_plc(vM_v6)) == (pM_pm4), 1, 0)+If((vM_plc(vM_v7)) == (pM_pm4), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm4), 10, 0)+If((vM_plc(vM_v9)) == (pM_pm4), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm4), 1, 0))) <= (20),
	((If((vM_plc(vM_v1)) == (pM_pm4), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm4), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm4), 1, 0)+If((vM_plc(vM_v4)) == (pM_pm4), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm4), 6, 0)+If((vM_plc(vM_v6)) == (pM_pm4), 2, 0)+If((vM_plc(vM_v7)) == (pM_pm4), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm4), 1, 0)+If((vM_plc(vM_v9)) == (pM_pm4), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm4), 2, 0))) <= (4),
	((If((vM_plc(vM_v1)) == (pM_pm5), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm5), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm5), 3, 0)+If((vM_plc(vM_v4)) == (pM_pm5), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm5), 2, 0)+If((vM_plc(vM_v6)) == (pM_pm5), 1, 0)+If((vM_plc(vM_v7)) == (pM_pm5), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm5), 10, 0)+If((vM_plc(vM_v9)) == (pM_pm5), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm5), 1, 0))) <= (10),
	((If((vM_plc(vM_v1)) == (pM_pm5), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm5), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm5), 1, 0)+If((vM_plc(vM_v4)) == (pM_pm5), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm5), 6, 0)+If((vM_plc(vM_v6)) == (pM_pm5), 2, 0)+If((vM_plc(vM_v7)) == (pM_pm5), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm5), 1, 0)+If((vM_plc(vM_v9)) == (pM_pm5), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm5), 2, 0))) <= (4),
]
	
current = [
	(vM_plc(vM_v1)) == (pM_pm1),
	(vM_core(vM_v1)) == (4),
	(vM_plc(vM_v2)) == (pM_pm1),
	(vM_core(vM_v2)) == (4),
	(vM_plc(vM_v3)) == (pM_pm2),
	(vM_core(vM_v3)) == (4),
	(vM_plc(vM_v4)) == (pM_pm2),
	(vM_core(vM_v4)) == (4),
	(vM_plc(vM_v5)) == (pM_pm2),
	(vM_core(vM_v5)) == (4),
	(vM_plc(vM_v6)) == (pM_pm3),
	(vM_core(vM_v6)) == (4),
	(vM_plc(vM_v7)) == (pM_pm3),
	(vM_core(vM_v7)) == (4),
	(vM_plc(vM_v8)) == (pM_pm4),
	(vM_core(vM_v8)) == (4),
	(vM_plc(vM_v9)) == (pM_pm5),
	(vM_core(vM_v9)) == (4),
	(vM_plc(vM_v10)) == (pM_pm5),
	(vM_core(vM_v10)) == (4),
]

hard = [
	Or((vM_core(vM_v1)) == 1, (vM_core(vM_v1)) == 2, (vM_core(vM_v1)) == 4, (vM_core(vM_v1)) == 8),
	Or((vM_core(vM_v2)) == 1, (vM_core(vM_v2)) == 2, (vM_core(vM_v2)) == 4, (vM_core(vM_v2)) == 8),
	Or((vM_core(vM_v3)) == 1, (vM_core(vM_v3)) == 2, (vM_core(vM_v3)) == 4, (vM_core(vM_v3)) == 8),
	Or((vM_core(vM_v4)) == 1, (vM_core(vM_v4)) == 2, (vM_core(vM_v4)) == 4, (vM_core(vM_v4)) == 8),
	Or((vM_core(vM_v5)) == 1, (vM_core(vM_v5)) == 2, (vM_core(vM_v5)) == 4, (vM_core(vM_v5)) == 8),
	Or((vM_core(vM_v6)) == 1, (vM_core(vM_v6)) == 2, (vM_core(vM_v6)) == 4, (vM_core(vM_v6)) == 8),
	Or((vM_core(vM_v7)) == 1, (vM_core(vM_v7)) == 2, (vM_core(vM_v7)) == 4, (vM_core(vM_v7)) == 8),
	Or((vM_core(vM_v8)) == 1, (vM_core(vM_v8)) == 2, (vM_core(vM_v8)) == 4, (vM_core(vM_v8)) == 8),
	Or((vM_core(vM_v9)) == 1, (vM_core(vM_v9)) == 2, (vM_core(vM_v9)) == 4, (vM_core(vM_v9)) == 8),
	Or((vM_core(vM_v10)) == 1, (vM_core(vM_v10)) == 2, (vM_core(vM_v10)) == 4, (vM_core(vM_v10)) == 8),
	(pM_bit64(pM_pm1)) == (True),
	(pM_near(pM_pm1, pM_pm1)) == True,
	(pM_near(pM_pm1, pM_pm2)) == False,
	(pM_near(pM_pm1, pM_pm3)) == False,
	(pM_near(pM_pm1, pM_pm4)) == False,
	(pM_near(pM_pm1, pM_pm5)) == False,
	(pM_core(pM_pm1)) == (4),
	(pM_stable(pM_pm1)) == (False),
	(pM_bit64(pM_pm2)) == (True),
	(pM_near(pM_pm2, pM_pm1)) == False,
	(pM_near(pM_pm2, pM_pm2)) == True,
	(pM_near(pM_pm2, pM_pm3)) == True,
	(pM_near(pM_pm2, pM_pm4)) == False,
	(pM_near(pM_pm2, pM_pm5)) == False,
	(pM_core(pM_pm2)) == (8),
	(pM_stable(pM_pm2)) == (False),
	(pM_bit64(pM_pm3)) == (True),
	(pM_near(pM_pm3, pM_pm1)) == False,
	(pM_near(pM_pm3, pM_pm2)) == True,
	(pM_near(pM_pm3, pM_pm3)) == True,
	(pM_near(pM_pm3, pM_pm4)) == False,
	(pM_near(pM_pm3, pM_pm5)) == False,
	(pM_core(pM_pm3)) == (4),
	(pM_stable(pM_pm3)) == (True),
	(pM_bit64(pM_pm4)) == (False),
	(pM_near(pM_pm4, pM_pm1)) == False,
	(pM_near(pM_pm4, pM_pm2)) == False,
	(pM_near(pM_pm4, pM_pm3)) == False,
	(pM_near(pM_pm4, pM_pm4)) == True,
	(pM_near(pM_pm4, pM_pm5)) == True,
	(pM_core(pM_pm4)) == (4),
	(pM_stable(pM_pm4)) == (False),
	(pM_bit64(pM_pm5)) == (False),
	(pM_near(pM_pm5, pM_pm1)) == False,
	(pM_near(pM_pm5, pM_pm2)) == False,
	(pM_near(pM_pm5, pM_pm3)) == False,
	(pM_near(pM_pm5, pM_pm4)) == True,
	(pM_near(pM_pm5, pM_pm5)) == True,
	(pM_core(pM_pm5)) == (4),
	(pM_stable(pM_pm5)) == (True),
]

weights = [0, 40, 40, 10000, 80, 0, 10000, 0, 10000, 10000, 0, 10000, 40, 40, 10000, 0, 30, 10000, 10, 40, 40, 10000, 10, 10000, 80, 0, 10000, 0, 30, 30, 10000, 10, 10000, 60, 10000, 60, 10000, 60, 10000, 60, 10000, 60, 10000, 20, 20, 20, 20, 10, 20, 30, 20, 60, 20, 20, 20, 20, 20, 10, 20, 10, 20, 20, 20]

deps = [(33, 0), (33, 2), (34, 0), (34, 2), (35, 4), (35, 6), (35, 8), (36, 4), (36, 6), (36, 8), (37, 10), (37, 12), (38, 10), (38, 12), (39, 14), (40, 14), (41, 16), (41, 18), (42, 16), (42, 18)]

