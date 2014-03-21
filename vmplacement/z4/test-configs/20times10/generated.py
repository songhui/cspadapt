from z3 import *
pM_names = ['pm1', 'pm2', 'pm3', 'pm4', 'pm5', 'pm6', 'pm7', 'pm8', 'pm9', 'pm10']
pMs = dict()
PM, (pM_pm1, pM_pm2, pM_pm3, pM_pm4, pM_pm5, pM_pm6, pM_pm7, pM_pm8, pM_pm9, pM_pm10) = EnumSort('PM', pM_names)
vM_names = ['v1', 'v2', 'v3', 'v4', 'v5', 'v6', 'v7', 'v8', 'v9', 'v10', 'v11', 'v12', 'v13', 'v14', 'v15', 'v16', 'v17', 'v18', 'v19', 'v20']
vMs = dict()
VM, (vM_v1, vM_v2, vM_v3, vM_v4, vM_v5, vM_v6, vM_v7, vM_v8, vM_v9, vM_v10, vM_v11, vM_v12, vM_v13, vM_v14, vM_v15, vM_v16, vM_v17, vM_v18, vM_v19, vM_v20) = EnumSort('VM', vM_names)
objName = Function('vM_core', VM, IntSort()) 

pmlit = [pM_pm1, pM_pm2, pM_pm3, pM_pm4, pM_pm5, pM_pm6, pM_pm7, pM_pm8, pM_pm9, pM_pm10]
vmlit = [vM_v1, vM_v2, vM_v3, vM_v4, vM_v5, vM_v6, vM_v7, vM_v8, vM_v9, vM_v10, vM_v11, vM_v12, vM_v13, vM_v14, vM_v15, vM_v16, vM_v17, vM_v18, vM_v19, vM_v20]

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
	(pM_stable(vM_plc(vM_v11))) == (True),
	(vM_plc(vM_v14)) != (vM_plc(vM_v11)),
	(vM_plc(vM_v16)) != (vM_plc(vM_v11)),
	(vM_core(vM_v11)) <= (pM_core(vM_plc(vM_v11))),
	(vM_plc(vM_v13)) != (vM_plc(vM_v12)),
	(pM_stable(vM_plc(vM_v12))) == (True),
	(vM_core(vM_v12)) <= (pM_core(vM_plc(vM_v12))),
	(pM_stable(vM_plc(vM_v13))) == (True),
	pM_bit64(vM_plc(vM_v13)),
	(vM_core(vM_v13)) <= (pM_core(vM_plc(vM_v13))),
	(pM_stable(vM_plc(vM_v14))) == (True),
	pM_bit64(vM_plc(vM_v14)),
	(vM_plc(vM_v11)) != (vM_plc(vM_v14)),
	(vM_plc(vM_v16)) != (vM_plc(vM_v14)),
	(vM_core(vM_v14)) <= (pM_core(vM_plc(vM_v14))),
	(pM_stable(vM_plc(vM_v15))) == (True),
	(pM_near(vM_plc(vM_v16),vM_plc(vM_v15)) == True) ,
	(vM_core(vM_v15)) <= (pM_core(vM_plc(vM_v15))),
	(pM_stable(vM_plc(vM_v16))) == (True),
	(vM_plc(vM_v14)) != (vM_plc(vM_v16)),
	(vM_plc(vM_v11)) != (vM_plc(vM_v16)),
	(vM_core(vM_v16)) <= (pM_core(vM_plc(vM_v16))),
	(pM_stable(vM_plc(vM_v17))) == (True),
	(vM_core(vM_v17)) <= (pM_core(vM_plc(vM_v17))),
	(vM_plc(vM_v19)) != (vM_plc(vM_v18)),
	(pM_stable(vM_plc(vM_v18))) == (True),
	(vM_core(vM_v18)) <= (pM_core(vM_plc(vM_v18))),
	(pM_stable(vM_plc(vM_v19))) == (True),
	(pM_near(vM_plc(vM_v20),vM_plc(vM_v19)) == True) ,
	(pM_near(vM_plc(vM_v16),vM_plc(vM_v19)) == True) ,
	(vM_core(vM_v19)) <= (pM_core(vM_plc(vM_v19))),
	(pM_stable(vM_plc(vM_v20))) == (True),
	(vM_core(vM_v20)) <= (pM_core(vM_plc(vM_v20))),
	((If((vM_plc(vM_v1)) == (pM_pm1), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm1), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm1), 3, 0)+If((vM_plc(vM_v4)) == (pM_pm1), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm1), 2, 0)+If((vM_plc(vM_v6)) == (pM_pm1), 1, 0)+If((vM_plc(vM_v7)) == (pM_pm1), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm1), 10, 0)+If((vM_plc(vM_v9)) == (pM_pm1), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm1), 1, 0)+If((vM_plc(vM_v11)) == (pM_pm1), 2, 0)+If((vM_plc(vM_v12)) == (pM_pm1), 2, 0)+If((vM_plc(vM_v13)) == (pM_pm1), 3, 0)+If((vM_plc(vM_v14)) == (pM_pm1), 3, 0)+If((vM_plc(vM_v15)) == (pM_pm1), 2, 0)+If((vM_plc(vM_v16)) == (pM_pm1), 1, 0)+If((vM_plc(vM_v17)) == (pM_pm1), 2, 0)+If((vM_plc(vM_v18)) == (pM_pm1), 10, 0)+If((vM_plc(vM_v19)) == (pM_pm1), 1, 0)+If((vM_plc(vM_v20)) == (pM_pm1), 1, 0))) <= (10),
	((If((vM_plc(vM_v1)) == (pM_pm1), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm1), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm1), 1, 0)+If((vM_plc(vM_v4)) == (pM_pm1), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm1), 6, 0)+If((vM_plc(vM_v6)) == (pM_pm1), 2, 0)+If((vM_plc(vM_v7)) == (pM_pm1), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm1), 1, 0)+If((vM_plc(vM_v9)) == (pM_pm1), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm1), 2, 0)+If((vM_plc(vM_v11)) == (pM_pm1), 2, 0)+If((vM_plc(vM_v12)) == (pM_pm1), 2, 0)+If((vM_plc(vM_v13)) == (pM_pm1), 1, 0)+If((vM_plc(vM_v14)) == (pM_pm1), 3, 0)+If((vM_plc(vM_v15)) == (pM_pm1), 6, 0)+If((vM_plc(vM_v16)) == (pM_pm1), 2, 0)+If((vM_plc(vM_v17)) == (pM_pm1), 2, 0)+If((vM_plc(vM_v18)) == (pM_pm1), 1, 0)+If((vM_plc(vM_v19)) == (pM_pm1), 1, 0)+If((vM_plc(vM_v20)) == (pM_pm1), 2, 0))) <= (4),
	((If((vM_plc(vM_v1)) == (pM_pm2), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm2), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm2), 3, 0)+If((vM_plc(vM_v4)) == (pM_pm2), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm2), 2, 0)+If((vM_plc(vM_v6)) == (pM_pm2), 1, 0)+If((vM_plc(vM_v7)) == (pM_pm2), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm2), 10, 0)+If((vM_plc(vM_v9)) == (pM_pm2), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm2), 1, 0)+If((vM_plc(vM_v11)) == (pM_pm2), 2, 0)+If((vM_plc(vM_v12)) == (pM_pm2), 2, 0)+If((vM_plc(vM_v13)) == (pM_pm2), 3, 0)+If((vM_plc(vM_v14)) == (pM_pm2), 3, 0)+If((vM_plc(vM_v15)) == (pM_pm2), 2, 0)+If((vM_plc(vM_v16)) == (pM_pm2), 1, 0)+If((vM_plc(vM_v17)) == (pM_pm2), 2, 0)+If((vM_plc(vM_v18)) == (pM_pm2), 10, 0)+If((vM_plc(vM_v19)) == (pM_pm2), 1, 0)+If((vM_plc(vM_v20)) == (pM_pm2), 1, 0))) <= (10),
	((If((vM_plc(vM_v1)) == (pM_pm2), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm2), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm2), 1, 0)+If((vM_plc(vM_v4)) == (pM_pm2), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm2), 6, 0)+If((vM_plc(vM_v6)) == (pM_pm2), 2, 0)+If((vM_plc(vM_v7)) == (pM_pm2), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm2), 1, 0)+If((vM_plc(vM_v9)) == (pM_pm2), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm2), 2, 0)+If((vM_plc(vM_v11)) == (pM_pm2), 2, 0)+If((vM_plc(vM_v12)) == (pM_pm2), 2, 0)+If((vM_plc(vM_v13)) == (pM_pm2), 1, 0)+If((vM_plc(vM_v14)) == (pM_pm2), 3, 0)+If((vM_plc(vM_v15)) == (pM_pm2), 6, 0)+If((vM_plc(vM_v16)) == (pM_pm2), 2, 0)+If((vM_plc(vM_v17)) == (pM_pm2), 2, 0)+If((vM_plc(vM_v18)) == (pM_pm2), 1, 0)+If((vM_plc(vM_v19)) == (pM_pm2), 1, 0)+If((vM_plc(vM_v20)) == (pM_pm2), 2, 0))) <= (8),
	((If((vM_plc(vM_v1)) == (pM_pm3), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm3), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm3), 3, 0)+If((vM_plc(vM_v4)) == (pM_pm3), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm3), 2, 0)+If((vM_plc(vM_v6)) == (pM_pm3), 1, 0)+If((vM_plc(vM_v7)) == (pM_pm3), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm3), 10, 0)+If((vM_plc(vM_v9)) == (pM_pm3), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm3), 1, 0)+If((vM_plc(vM_v11)) == (pM_pm3), 2, 0)+If((vM_plc(vM_v12)) == (pM_pm3), 2, 0)+If((vM_plc(vM_v13)) == (pM_pm3), 3, 0)+If((vM_plc(vM_v14)) == (pM_pm3), 3, 0)+If((vM_plc(vM_v15)) == (pM_pm3), 2, 0)+If((vM_plc(vM_v16)) == (pM_pm3), 1, 0)+If((vM_plc(vM_v17)) == (pM_pm3), 2, 0)+If((vM_plc(vM_v18)) == (pM_pm3), 10, 0)+If((vM_plc(vM_v19)) == (pM_pm3), 1, 0)+If((vM_plc(vM_v20)) == (pM_pm3), 1, 0))) <= (5),
	((If((vM_plc(vM_v1)) == (pM_pm3), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm3), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm3), 1, 0)+If((vM_plc(vM_v4)) == (pM_pm3), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm3), 6, 0)+If((vM_plc(vM_v6)) == (pM_pm3), 2, 0)+If((vM_plc(vM_v7)) == (pM_pm3), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm3), 1, 0)+If((vM_plc(vM_v9)) == (pM_pm3), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm3), 2, 0)+If((vM_plc(vM_v11)) == (pM_pm3), 2, 0)+If((vM_plc(vM_v12)) == (pM_pm3), 2, 0)+If((vM_plc(vM_v13)) == (pM_pm3), 1, 0)+If((vM_plc(vM_v14)) == (pM_pm3), 3, 0)+If((vM_plc(vM_v15)) == (pM_pm3), 6, 0)+If((vM_plc(vM_v16)) == (pM_pm3), 2, 0)+If((vM_plc(vM_v17)) == (pM_pm3), 2, 0)+If((vM_plc(vM_v18)) == (pM_pm3), 1, 0)+If((vM_plc(vM_v19)) == (pM_pm3), 1, 0)+If((vM_plc(vM_v20)) == (pM_pm3), 2, 0))) <= (16),
	((If((vM_plc(vM_v1)) == (pM_pm4), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm4), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm4), 3, 0)+If((vM_plc(vM_v4)) == (pM_pm4), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm4), 2, 0)+If((vM_plc(vM_v6)) == (pM_pm4), 1, 0)+If((vM_plc(vM_v7)) == (pM_pm4), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm4), 10, 0)+If((vM_plc(vM_v9)) == (pM_pm4), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm4), 1, 0)+If((vM_plc(vM_v11)) == (pM_pm4), 2, 0)+If((vM_plc(vM_v12)) == (pM_pm4), 2, 0)+If((vM_plc(vM_v13)) == (pM_pm4), 3, 0)+If((vM_plc(vM_v14)) == (pM_pm4), 3, 0)+If((vM_plc(vM_v15)) == (pM_pm4), 2, 0)+If((vM_plc(vM_v16)) == (pM_pm4), 1, 0)+If((vM_plc(vM_v17)) == (pM_pm4), 2, 0)+If((vM_plc(vM_v18)) == (pM_pm4), 10, 0)+If((vM_plc(vM_v19)) == (pM_pm4), 1, 0)+If((vM_plc(vM_v20)) == (pM_pm4), 1, 0))) <= (20),
	((If((vM_plc(vM_v1)) == (pM_pm4), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm4), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm4), 1, 0)+If((vM_plc(vM_v4)) == (pM_pm4), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm4), 6, 0)+If((vM_plc(vM_v6)) == (pM_pm4), 2, 0)+If((vM_plc(vM_v7)) == (pM_pm4), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm4), 1, 0)+If((vM_plc(vM_v9)) == (pM_pm4), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm4), 2, 0)+If((vM_plc(vM_v11)) == (pM_pm4), 2, 0)+If((vM_plc(vM_v12)) == (pM_pm4), 2, 0)+If((vM_plc(vM_v13)) == (pM_pm4), 1, 0)+If((vM_plc(vM_v14)) == (pM_pm4), 3, 0)+If((vM_plc(vM_v15)) == (pM_pm4), 6, 0)+If((vM_plc(vM_v16)) == (pM_pm4), 2, 0)+If((vM_plc(vM_v17)) == (pM_pm4), 2, 0)+If((vM_plc(vM_v18)) == (pM_pm4), 1, 0)+If((vM_plc(vM_v19)) == (pM_pm4), 1, 0)+If((vM_plc(vM_v20)) == (pM_pm4), 2, 0))) <= (4),
	((If((vM_plc(vM_v1)) == (pM_pm5), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm5), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm5), 3, 0)+If((vM_plc(vM_v4)) == (pM_pm5), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm5), 2, 0)+If((vM_plc(vM_v6)) == (pM_pm5), 1, 0)+If((vM_plc(vM_v7)) == (pM_pm5), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm5), 10, 0)+If((vM_plc(vM_v9)) == (pM_pm5), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm5), 1, 0)+If((vM_plc(vM_v11)) == (pM_pm5), 2, 0)+If((vM_plc(vM_v12)) == (pM_pm5), 2, 0)+If((vM_plc(vM_v13)) == (pM_pm5), 3, 0)+If((vM_plc(vM_v14)) == (pM_pm5), 3, 0)+If((vM_plc(vM_v15)) == (pM_pm5), 2, 0)+If((vM_plc(vM_v16)) == (pM_pm5), 1, 0)+If((vM_plc(vM_v17)) == (pM_pm5), 2, 0)+If((vM_plc(vM_v18)) == (pM_pm5), 10, 0)+If((vM_plc(vM_v19)) == (pM_pm5), 1, 0)+If((vM_plc(vM_v20)) == (pM_pm5), 1, 0))) <= (10),
	((If((vM_plc(vM_v1)) == (pM_pm5), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm5), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm5), 1, 0)+If((vM_plc(vM_v4)) == (pM_pm5), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm5), 6, 0)+If((vM_plc(vM_v6)) == (pM_pm5), 2, 0)+If((vM_plc(vM_v7)) == (pM_pm5), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm5), 1, 0)+If((vM_plc(vM_v9)) == (pM_pm5), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm5), 2, 0)+If((vM_plc(vM_v11)) == (pM_pm5), 2, 0)+If((vM_plc(vM_v12)) == (pM_pm5), 2, 0)+If((vM_plc(vM_v13)) == (pM_pm5), 1, 0)+If((vM_plc(vM_v14)) == (pM_pm5), 3, 0)+If((vM_plc(vM_v15)) == (pM_pm5), 6, 0)+If((vM_plc(vM_v16)) == (pM_pm5), 2, 0)+If((vM_plc(vM_v17)) == (pM_pm5), 2, 0)+If((vM_plc(vM_v18)) == (pM_pm5), 1, 0)+If((vM_plc(vM_v19)) == (pM_pm5), 1, 0)+If((vM_plc(vM_v20)) == (pM_pm5), 2, 0))) <= (4),
	((If((vM_plc(vM_v1)) == (pM_pm6), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm6), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm6), 3, 0)+If((vM_plc(vM_v4)) == (pM_pm6), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm6), 2, 0)+If((vM_plc(vM_v6)) == (pM_pm6), 1, 0)+If((vM_plc(vM_v7)) == (pM_pm6), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm6), 10, 0)+If((vM_plc(vM_v9)) == (pM_pm6), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm6), 1, 0)+If((vM_plc(vM_v11)) == (pM_pm6), 2, 0)+If((vM_plc(vM_v12)) == (pM_pm6), 2, 0)+If((vM_plc(vM_v13)) == (pM_pm6), 3, 0)+If((vM_plc(vM_v14)) == (pM_pm6), 3, 0)+If((vM_plc(vM_v15)) == (pM_pm6), 2, 0)+If((vM_plc(vM_v16)) == (pM_pm6), 1, 0)+If((vM_plc(vM_v17)) == (pM_pm6), 2, 0)+If((vM_plc(vM_v18)) == (pM_pm6), 10, 0)+If((vM_plc(vM_v19)) == (pM_pm6), 1, 0)+If((vM_plc(vM_v20)) == (pM_pm6), 1, 0))) <= (10),
	((If((vM_plc(vM_v1)) == (pM_pm6), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm6), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm6), 1, 0)+If((vM_plc(vM_v4)) == (pM_pm6), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm6), 6, 0)+If((vM_plc(vM_v6)) == (pM_pm6), 2, 0)+If((vM_plc(vM_v7)) == (pM_pm6), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm6), 1, 0)+If((vM_plc(vM_v9)) == (pM_pm6), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm6), 2, 0)+If((vM_plc(vM_v11)) == (pM_pm6), 2, 0)+If((vM_plc(vM_v12)) == (pM_pm6), 2, 0)+If((vM_plc(vM_v13)) == (pM_pm6), 1, 0)+If((vM_plc(vM_v14)) == (pM_pm6), 3, 0)+If((vM_plc(vM_v15)) == (pM_pm6), 6, 0)+If((vM_plc(vM_v16)) == (pM_pm6), 2, 0)+If((vM_plc(vM_v17)) == (pM_pm6), 2, 0)+If((vM_plc(vM_v18)) == (pM_pm6), 1, 0)+If((vM_plc(vM_v19)) == (pM_pm6), 1, 0)+If((vM_plc(vM_v20)) == (pM_pm6), 2, 0))) <= (4),
	((If((vM_plc(vM_v1)) == (pM_pm7), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm7), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm7), 3, 0)+If((vM_plc(vM_v4)) == (pM_pm7), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm7), 2, 0)+If((vM_plc(vM_v6)) == (pM_pm7), 1, 0)+If((vM_plc(vM_v7)) == (pM_pm7), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm7), 10, 0)+If((vM_plc(vM_v9)) == (pM_pm7), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm7), 1, 0)+If((vM_plc(vM_v11)) == (pM_pm7), 2, 0)+If((vM_plc(vM_v12)) == (pM_pm7), 2, 0)+If((vM_plc(vM_v13)) == (pM_pm7), 3, 0)+If((vM_plc(vM_v14)) == (pM_pm7), 3, 0)+If((vM_plc(vM_v15)) == (pM_pm7), 2, 0)+If((vM_plc(vM_v16)) == (pM_pm7), 1, 0)+If((vM_plc(vM_v17)) == (pM_pm7), 2, 0)+If((vM_plc(vM_v18)) == (pM_pm7), 10, 0)+If((vM_plc(vM_v19)) == (pM_pm7), 1, 0)+If((vM_plc(vM_v20)) == (pM_pm7), 1, 0))) <= (10),
	((If((vM_plc(vM_v1)) == (pM_pm7), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm7), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm7), 1, 0)+If((vM_plc(vM_v4)) == (pM_pm7), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm7), 6, 0)+If((vM_plc(vM_v6)) == (pM_pm7), 2, 0)+If((vM_plc(vM_v7)) == (pM_pm7), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm7), 1, 0)+If((vM_plc(vM_v9)) == (pM_pm7), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm7), 2, 0)+If((vM_plc(vM_v11)) == (pM_pm7), 2, 0)+If((vM_plc(vM_v12)) == (pM_pm7), 2, 0)+If((vM_plc(vM_v13)) == (pM_pm7), 1, 0)+If((vM_plc(vM_v14)) == (pM_pm7), 3, 0)+If((vM_plc(vM_v15)) == (pM_pm7), 6, 0)+If((vM_plc(vM_v16)) == (pM_pm7), 2, 0)+If((vM_plc(vM_v17)) == (pM_pm7), 2, 0)+If((vM_plc(vM_v18)) == (pM_pm7), 1, 0)+If((vM_plc(vM_v19)) == (pM_pm7), 1, 0)+If((vM_plc(vM_v20)) == (pM_pm7), 2, 0))) <= (8),
	((If((vM_plc(vM_v1)) == (pM_pm8), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm8), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm8), 3, 0)+If((vM_plc(vM_v4)) == (pM_pm8), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm8), 2, 0)+If((vM_plc(vM_v6)) == (pM_pm8), 1, 0)+If((vM_plc(vM_v7)) == (pM_pm8), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm8), 10, 0)+If((vM_plc(vM_v9)) == (pM_pm8), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm8), 1, 0)+If((vM_plc(vM_v11)) == (pM_pm8), 2, 0)+If((vM_plc(vM_v12)) == (pM_pm8), 2, 0)+If((vM_plc(vM_v13)) == (pM_pm8), 3, 0)+If((vM_plc(vM_v14)) == (pM_pm8), 3, 0)+If((vM_plc(vM_v15)) == (pM_pm8), 2, 0)+If((vM_plc(vM_v16)) == (pM_pm8), 1, 0)+If((vM_plc(vM_v17)) == (pM_pm8), 2, 0)+If((vM_plc(vM_v18)) == (pM_pm8), 10, 0)+If((vM_plc(vM_v19)) == (pM_pm8), 1, 0)+If((vM_plc(vM_v20)) == (pM_pm8), 1, 0))) <= (5),
	((If((vM_plc(vM_v1)) == (pM_pm8), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm8), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm8), 1, 0)+If((vM_plc(vM_v4)) == (pM_pm8), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm8), 6, 0)+If((vM_plc(vM_v6)) == (pM_pm8), 2, 0)+If((vM_plc(vM_v7)) == (pM_pm8), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm8), 1, 0)+If((vM_plc(vM_v9)) == (pM_pm8), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm8), 2, 0)+If((vM_plc(vM_v11)) == (pM_pm8), 2, 0)+If((vM_plc(vM_v12)) == (pM_pm8), 2, 0)+If((vM_plc(vM_v13)) == (pM_pm8), 1, 0)+If((vM_plc(vM_v14)) == (pM_pm8), 3, 0)+If((vM_plc(vM_v15)) == (pM_pm8), 6, 0)+If((vM_plc(vM_v16)) == (pM_pm8), 2, 0)+If((vM_plc(vM_v17)) == (pM_pm8), 2, 0)+If((vM_plc(vM_v18)) == (pM_pm8), 1, 0)+If((vM_plc(vM_v19)) == (pM_pm8), 1, 0)+If((vM_plc(vM_v20)) == (pM_pm8), 2, 0))) <= (16),
	((If((vM_plc(vM_v1)) == (pM_pm9), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm9), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm9), 3, 0)+If((vM_plc(vM_v4)) == (pM_pm9), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm9), 2, 0)+If((vM_plc(vM_v6)) == (pM_pm9), 1, 0)+If((vM_plc(vM_v7)) == (pM_pm9), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm9), 10, 0)+If((vM_plc(vM_v9)) == (pM_pm9), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm9), 1, 0)+If((vM_plc(vM_v11)) == (pM_pm9), 2, 0)+If((vM_plc(vM_v12)) == (pM_pm9), 2, 0)+If((vM_plc(vM_v13)) == (pM_pm9), 3, 0)+If((vM_plc(vM_v14)) == (pM_pm9), 3, 0)+If((vM_plc(vM_v15)) == (pM_pm9), 2, 0)+If((vM_plc(vM_v16)) == (pM_pm9), 1, 0)+If((vM_plc(vM_v17)) == (pM_pm9), 2, 0)+If((vM_plc(vM_v18)) == (pM_pm9), 10, 0)+If((vM_plc(vM_v19)) == (pM_pm9), 1, 0)+If((vM_plc(vM_v20)) == (pM_pm9), 1, 0))) <= (20),
	((If((vM_plc(vM_v1)) == (pM_pm9), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm9), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm9), 1, 0)+If((vM_plc(vM_v4)) == (pM_pm9), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm9), 6, 0)+If((vM_plc(vM_v6)) == (pM_pm9), 2, 0)+If((vM_plc(vM_v7)) == (pM_pm9), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm9), 1, 0)+If((vM_plc(vM_v9)) == (pM_pm9), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm9), 2, 0)+If((vM_plc(vM_v11)) == (pM_pm9), 2, 0)+If((vM_plc(vM_v12)) == (pM_pm9), 2, 0)+If((vM_plc(vM_v13)) == (pM_pm9), 1, 0)+If((vM_plc(vM_v14)) == (pM_pm9), 3, 0)+If((vM_plc(vM_v15)) == (pM_pm9), 6, 0)+If((vM_plc(vM_v16)) == (pM_pm9), 2, 0)+If((vM_plc(vM_v17)) == (pM_pm9), 2, 0)+If((vM_plc(vM_v18)) == (pM_pm9), 1, 0)+If((vM_plc(vM_v19)) == (pM_pm9), 1, 0)+If((vM_plc(vM_v20)) == (pM_pm9), 2, 0))) <= (4),
	((If((vM_plc(vM_v1)) == (pM_pm10), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm10), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm10), 3, 0)+If((vM_plc(vM_v4)) == (pM_pm10), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm10), 2, 0)+If((vM_plc(vM_v6)) == (pM_pm10), 1, 0)+If((vM_plc(vM_v7)) == (pM_pm10), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm10), 10, 0)+If((vM_plc(vM_v9)) == (pM_pm10), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm10), 1, 0)+If((vM_plc(vM_v11)) == (pM_pm10), 2, 0)+If((vM_plc(vM_v12)) == (pM_pm10), 2, 0)+If((vM_plc(vM_v13)) == (pM_pm10), 3, 0)+If((vM_plc(vM_v14)) == (pM_pm10), 3, 0)+If((vM_plc(vM_v15)) == (pM_pm10), 2, 0)+If((vM_plc(vM_v16)) == (pM_pm10), 1, 0)+If((vM_plc(vM_v17)) == (pM_pm10), 2, 0)+If((vM_plc(vM_v18)) == (pM_pm10), 10, 0)+If((vM_plc(vM_v19)) == (pM_pm10), 1, 0)+If((vM_plc(vM_v20)) == (pM_pm10), 1, 0))) <= (40),
	((If((vM_plc(vM_v1)) == (pM_pm10), 2, 0)+If((vM_plc(vM_v2)) == (pM_pm10), 2, 0)+If((vM_plc(vM_v3)) == (pM_pm10), 1, 0)+If((vM_plc(vM_v4)) == (pM_pm10), 3, 0)+If((vM_plc(vM_v5)) == (pM_pm10), 6, 0)+If((vM_plc(vM_v6)) == (pM_pm10), 2, 0)+If((vM_plc(vM_v7)) == (pM_pm10), 2, 0)+If((vM_plc(vM_v8)) == (pM_pm10), 1, 0)+If((vM_plc(vM_v9)) == (pM_pm10), 1, 0)+If((vM_plc(vM_v10)) == (pM_pm10), 2, 0)+If((vM_plc(vM_v11)) == (pM_pm10), 2, 0)+If((vM_plc(vM_v12)) == (pM_pm10), 2, 0)+If((vM_plc(vM_v13)) == (pM_pm10), 1, 0)+If((vM_plc(vM_v14)) == (pM_pm10), 3, 0)+If((vM_plc(vM_v15)) == (pM_pm10), 6, 0)+If((vM_plc(vM_v16)) == (pM_pm10), 2, 0)+If((vM_plc(vM_v17)) == (pM_pm10), 2, 0)+If((vM_plc(vM_v18)) == (pM_pm10), 1, 0)+If((vM_plc(vM_v19)) == (pM_pm10), 1, 0)+If((vM_plc(vM_v20)) == (pM_pm10), 2, 0))) <= (40),
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
	(vM_plc(vM_v11)) == (pM_pm6),
	(vM_core(vM_v11)) == (4),
	(vM_plc(vM_v12)) == (pM_pm6),
	(vM_core(vM_v12)) == (4),
	(vM_plc(vM_v13)) == (pM_pm7),
	(vM_core(vM_v13)) == (4),
	(vM_plc(vM_v14)) == (pM_pm7),
	(vM_core(vM_v14)) == (4),
	(vM_plc(vM_v15)) == (pM_pm7),
	(vM_core(vM_v15)) == (4),
	(vM_plc(vM_v16)) == (pM_pm8),
	(vM_core(vM_v16)) == (4),
	(vM_plc(vM_v17)) == (pM_pm8),
	(vM_core(vM_v17)) == (4),
	(vM_plc(vM_v18)) == (pM_pm9),
	(vM_core(vM_v18)) == (4),
	(vM_plc(vM_v19)) == (pM_pm10),
	(vM_core(vM_v19)) == (4),
	(vM_plc(vM_v20)) == (pM_pm10),
	(vM_core(vM_v20)) == (4),
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
	Or((vM_core(vM_v11)) == 1, (vM_core(vM_v11)) == 2, (vM_core(vM_v11)) == 4, (vM_core(vM_v11)) == 8),
	Or((vM_core(vM_v12)) == 1, (vM_core(vM_v12)) == 2, (vM_core(vM_v12)) == 4, (vM_core(vM_v12)) == 8),
	Or((vM_core(vM_v13)) == 1, (vM_core(vM_v13)) == 2, (vM_core(vM_v13)) == 4, (vM_core(vM_v13)) == 8),
	Or((vM_core(vM_v14)) == 1, (vM_core(vM_v14)) == 2, (vM_core(vM_v14)) == 4, (vM_core(vM_v14)) == 8),
	Or((vM_core(vM_v15)) == 1, (vM_core(vM_v15)) == 2, (vM_core(vM_v15)) == 4, (vM_core(vM_v15)) == 8),
	Or((vM_core(vM_v16)) == 1, (vM_core(vM_v16)) == 2, (vM_core(vM_v16)) == 4, (vM_core(vM_v16)) == 8),
	Or((vM_core(vM_v17)) == 1, (vM_core(vM_v17)) == 2, (vM_core(vM_v17)) == 4, (vM_core(vM_v17)) == 8),
	Or((vM_core(vM_v18)) == 1, (vM_core(vM_v18)) == 2, (vM_core(vM_v18)) == 4, (vM_core(vM_v18)) == 8),
	Or((vM_core(vM_v19)) == 1, (vM_core(vM_v19)) == 2, (vM_core(vM_v19)) == 4, (vM_core(vM_v19)) == 8),
	Or((vM_core(vM_v20)) == 1, (vM_core(vM_v20)) == 2, (vM_core(vM_v20)) == 4, (vM_core(vM_v20)) == 8),
	(pM_bit64(pM_pm1)) == (True),
	(pM_near(pM_pm1, pM_pm1)) == True,
	(pM_near(pM_pm1, pM_pm2)) == False,
	(pM_near(pM_pm1, pM_pm3)) == False,
	(pM_near(pM_pm1, pM_pm4)) == False,
	(pM_near(pM_pm1, pM_pm5)) == False,
	(pM_near(pM_pm1, pM_pm6)) == False,
	(pM_near(pM_pm1, pM_pm7)) == False,
	(pM_near(pM_pm1, pM_pm8)) == False,
	(pM_near(pM_pm1, pM_pm9)) == False,
	(pM_near(pM_pm1, pM_pm10)) == False,
	(pM_core(pM_pm1)) == (4),
	(pM_stable(pM_pm1)) == (False),
	(pM_bit64(pM_pm2)) == (True),
	(pM_near(pM_pm2, pM_pm1)) == False,
	(pM_near(pM_pm2, pM_pm2)) == True,
	(pM_near(pM_pm2, pM_pm3)) == True,
	(pM_near(pM_pm2, pM_pm4)) == False,
	(pM_near(pM_pm2, pM_pm5)) == False,
	(pM_near(pM_pm2, pM_pm6)) == False,
	(pM_near(pM_pm2, pM_pm7)) == False,
	(pM_near(pM_pm2, pM_pm8)) == False,
	(pM_near(pM_pm2, pM_pm9)) == False,
	(pM_near(pM_pm2, pM_pm10)) == False,
	(pM_core(pM_pm2)) == (8),
	(pM_stable(pM_pm2)) == (False),
	(pM_bit64(pM_pm3)) == (True),
	(pM_near(pM_pm3, pM_pm1)) == False,
	(pM_near(pM_pm3, pM_pm2)) == True,
	(pM_near(pM_pm3, pM_pm3)) == True,
	(pM_near(pM_pm3, pM_pm4)) == False,
	(pM_near(pM_pm3, pM_pm5)) == False,
	(pM_near(pM_pm3, pM_pm6)) == False,
	(pM_near(pM_pm3, pM_pm7)) == False,
	(pM_near(pM_pm3, pM_pm8)) == False,
	(pM_near(pM_pm3, pM_pm9)) == False,
	(pM_near(pM_pm3, pM_pm10)) == False,
	(pM_core(pM_pm3)) == (4),
	(pM_stable(pM_pm3)) == (True),
	(pM_bit64(pM_pm4)) == (False),
	(pM_near(pM_pm4, pM_pm1)) == False,
	(pM_near(pM_pm4, pM_pm2)) == False,
	(pM_near(pM_pm4, pM_pm3)) == False,
	(pM_near(pM_pm4, pM_pm4)) == True,
	(pM_near(pM_pm4, pM_pm5)) == True,
	(pM_near(pM_pm4, pM_pm6)) == False,
	(pM_near(pM_pm4, pM_pm7)) == False,
	(pM_near(pM_pm4, pM_pm8)) == False,
	(pM_near(pM_pm4, pM_pm9)) == False,
	(pM_near(pM_pm4, pM_pm10)) == False,
	(pM_core(pM_pm4)) == (4),
	(pM_stable(pM_pm4)) == (False),
	(pM_bit64(pM_pm5)) == (False),
	(pM_near(pM_pm5, pM_pm1)) == False,
	(pM_near(pM_pm5, pM_pm2)) == False,
	(pM_near(pM_pm5, pM_pm3)) == False,
	(pM_near(pM_pm5, pM_pm4)) == True,
	(pM_near(pM_pm5, pM_pm5)) == True,
	(pM_near(pM_pm5, pM_pm6)) == False,
	(pM_near(pM_pm5, pM_pm7)) == False,
	(pM_near(pM_pm5, pM_pm8)) == False,
	(pM_near(pM_pm5, pM_pm9)) == False,
	(pM_near(pM_pm5, pM_pm10)) == False,
	(pM_core(pM_pm5)) == (4),
	(pM_stable(pM_pm5)) == (True),
	(pM_bit64(pM_pm6)) == (True),
	(pM_near(pM_pm6, pM_pm1)) == False,
	(pM_near(pM_pm6, pM_pm2)) == False,
	(pM_near(pM_pm6, pM_pm3)) == False,
	(pM_near(pM_pm6, pM_pm4)) == False,
	(pM_near(pM_pm6, pM_pm5)) == False,
	(pM_near(pM_pm6, pM_pm6)) == True,
	(pM_near(pM_pm6, pM_pm7)) == False,
	(pM_near(pM_pm6, pM_pm8)) == False,
	(pM_near(pM_pm6, pM_pm9)) == False,
	(pM_near(pM_pm6, pM_pm10)) == False,
	(pM_core(pM_pm6)) == (4),
	(pM_stable(pM_pm6)) == (False),
	(pM_bit64(pM_pm7)) == (True),
	(pM_near(pM_pm7, pM_pm1)) == False,
	(pM_near(pM_pm7, pM_pm2)) == False,
	(pM_near(pM_pm7, pM_pm3)) == False,
	(pM_near(pM_pm7, pM_pm4)) == False,
	(pM_near(pM_pm7, pM_pm5)) == False,
	(pM_near(pM_pm7, pM_pm6)) == False,
	(pM_near(pM_pm7, pM_pm7)) == True,
	(pM_near(pM_pm7, pM_pm8)) == True,
	(pM_near(pM_pm7, pM_pm9)) == False,
	(pM_near(pM_pm7, pM_pm10)) == False,
	(pM_core(pM_pm7)) == (8),
	(pM_stable(pM_pm7)) == (False),
	(pM_bit64(pM_pm8)) == (True),
	(pM_near(pM_pm8, pM_pm1)) == False,
	(pM_near(pM_pm8, pM_pm2)) == False,
	(pM_near(pM_pm8, pM_pm3)) == False,
	(pM_near(pM_pm8, pM_pm4)) == False,
	(pM_near(pM_pm8, pM_pm5)) == False,
	(pM_near(pM_pm8, pM_pm6)) == False,
	(pM_near(pM_pm8, pM_pm7)) == True,
	(pM_near(pM_pm8, pM_pm8)) == True,
	(pM_near(pM_pm8, pM_pm9)) == False,
	(pM_near(pM_pm8, pM_pm10)) == False,
	(pM_core(pM_pm8)) == (4),
	(pM_stable(pM_pm8)) == (True),
	(pM_bit64(pM_pm9)) == (False),
	(pM_near(pM_pm9, pM_pm1)) == False,
	(pM_near(pM_pm9, pM_pm2)) == False,
	(pM_near(pM_pm9, pM_pm3)) == False,
	(pM_near(pM_pm9, pM_pm4)) == False,
	(pM_near(pM_pm9, pM_pm5)) == False,
	(pM_near(pM_pm9, pM_pm6)) == False,
	(pM_near(pM_pm9, pM_pm7)) == False,
	(pM_near(pM_pm9, pM_pm8)) == False,
	(pM_near(pM_pm9, pM_pm9)) == True,
	(pM_near(pM_pm9, pM_pm10)) == True,
	(pM_core(pM_pm9)) == (4),
	(pM_stable(pM_pm9)) == (False),
	(pM_bit64(pM_pm10)) == (True),
	(pM_near(pM_pm10, pM_pm1)) == False,
	(pM_near(pM_pm10, pM_pm2)) == False,
	(pM_near(pM_pm10, pM_pm3)) == False,
	(pM_near(pM_pm10, pM_pm4)) == False,
	(pM_near(pM_pm10, pM_pm5)) == False,
	(pM_near(pM_pm10, pM_pm6)) == False,
	(pM_near(pM_pm10, pM_pm7)) == False,
	(pM_near(pM_pm10, pM_pm8)) == False,
	(pM_near(pM_pm10, pM_pm9)) == True,
	(pM_near(pM_pm10, pM_pm10)) == True,
	(pM_core(pM_pm10)) == (16),
	(pM_stable(pM_pm10)) == (True),
]

weights = [0, 40, 40, 10000, 80, 0, 10000, 0, 10000, 10000, 0, 10000, 40, 40, 10000, 0, 30, 10000, 10, 40, 40, 10000, 10, 10000, 80, 0, 10000, 0, 30, 30, 10000, 10, 10000, 0, 40, 40, 10000, 80, 0, 10000, 0, 10000, 10000, 0, 10000, 40, 40, 10000, 0, 30, 10000, 10, 40, 40, 10000, 10, 10000, 80, 0, 10000, 0, 30, 30, 10000, 10, 10000, 60, 10000, 60, 10000, 60, 10000, 60, 10000, 60, 10000, 60, 10000, 60, 10000, 60, 10000, 60, 10000, 60, 10000, 20, 20, 20, 20, 10, 20, 30, 20, 60, 20, 20, 20, 20, 20, 10, 20, 10, 20, 20, 20, 20, 20, 20, 20, 10, 20, 30, 20, 60, 20, 20, 20, 20, 20, 10, 20, 10, 20, 20, 20]

deps = [(66, 0), (66, 2), (67, 0), (67, 2), (68, 4), (68, 6), (68, 8), (69, 4), (69, 6), (69, 8), (70, 10), (70, 12), (71, 10), (71, 12), (72, 14), (73, 14), (74, 16), (74, 18), (75, 16), (75, 18), (76, 20), (76, 22), (77, 20), (77, 22), (78, 24), (78, 26), (78, 28), (79, 24), (79, 26), (79, 28), (80, 30), (80, 32), (81, 30), (81, 32), (82, 34), (83, 34), (84, 36), (84, 38), (85, 36), (85, 38)]

