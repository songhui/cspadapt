from z3 import *
variables = {
	'/myhouse.eprice': Real('/myhouse.eprice'),
	'/myhouse.time': Int('/myhouse.time'),
	#'/myhouse.outtemp': Real('/myhouse.outtemp'),
	'/myhouse/room#liv.temp': Real('/myhouse/room#liv.temp'),
	'/myhouse/room#liv.bright': Real('/myhouse/room#liv.bright'),
	'/myhouse/room#liv.air': Int('/myhouse/room#liv.air'),
	'/myhouse/room#liv/window#w1.curtainOn': Bool('/myhouse/room#liv/window#w1.curtainOn'),
	'/myhouse/room#liv/window#w1.opened': Bool('/myhouse/room#liv/window#w1.opened'),
	'/myhouse/room#liv/heating#h1.level': Int('/myhouse/room#liv/heating#h1.level'),
	'/myhouse/room#liv/heating#h2.level': Int('/myhouse/room#liv/heating#h2.level'),
	'/myhouse/room#liv/light#0.level': Int('/myhouse/room#liv/light#0.level'),
	#'/myhouse/wh.temp': Real('/myhouse/wh.temp'),
	'/myhouse/wh.on': Bool('/myhouse/wh.on')
	#'/myhouse/wh.boost': Bool('/myhouse/wh.boost'),
	#'/myhouse/ev#donkey.pluged': Bool('/myhouse/ev#donkey.pluged'),
	#'/myhouse/ev#donkey.level': Int('/myhouse/ev#donkey.level'),
	#'/myhouse/ev#donkey.charging': Bool('/myhouse/ev#donkey.charging')
}
config_para = [
	variables['/myhouse/room#liv/window#w1.curtainOn'],
	variables['/myhouse/wh.on'],
	#	
	variables['/myhouse/room#liv/heating#h1.level'],
	variables['/myhouse/room#liv/heating#h2.level'],
	variables['/myhouse/room#liv/window#w1.opened']
	#variables['/myhouse/room#liv/light#0.level'],
	
	#variables['/myhouse/wh.boost'],
	#variables['/myhouse/ev#donkey.level'],
	#variables['/myhouse/ev#donkey.charging']
]
context_para = [
	variables['/myhouse.eprice'],
	variables['/myhouse.time'],
	#variables['/myhouse.outtemp'],
	variables['/myhouse/room#liv.temp'],
	#variables['/myhouse/room#liv.bright'],
	variables['/myhouse/room#liv.air'],
	#variables['/myhouse/wh.temp']
	#variables['/myhouse/ev#donkey.pluged']
]
config = {
	'/myhouse/room#liv/window#w1.curtainOn': False,
	'/myhouse/wh.on': True,	
	'/myhouse/room#liv/heating#h1.level': 3,
	'/myhouse/room#liv/heating#h2.level': 0,
	'/myhouse/room#liv/window#w1.opened': False,
	#'/myhouse/room#liv/light#0.level': 3,
	
	#'/myhouse/wh.boost': False
	#'/myhouse/ev#donkey.level': 10,
	#'/myhouse/ev#donkey.charging': True
}
context = {
	'/myhouse.eprice': 25.0,
	'/myhouse.time': 3,
	#'/myhouse.outtemp': 5,
	'/myhouse/room#liv.temp': 9.0,
	#'/myhouse/room#liv.bright': 4000.0,
	'/myhouse/room#liv.air': 6,
	#'/myhouse/wh.temp': 20
	#'/myhouse/ev#donkey.pluged': True
}

goals = [
	Implies((variables['/myhouse/room#liv.temp']) < (10), (variables['/myhouse/room#liv/heating#h2.level'] + variables['/myhouse/room#liv/heating#h1.level']  ) > ((3) * (2))),
	Or(And((variables['/myhouse/room#liv/window#w1.opened']) == (False) ), And((variables['/myhouse/room#liv/heating#h2.level']) == (0), (variables['/myhouse/room#liv/heating#h1.level']) == (0) )),
	Implies((variables['/myhouse/room#liv.air']) > (5), variables['/myhouse/room#liv/window#w1.opened']),
	Or(Or((variables['/myhouse.time']) < (2), (variables['/myhouse.time']) > (8)), variables['/myhouse/wh.on']),
	Implies((variables['/myhouse.eprice']) > (15), Or(Not(variables['/myhouse/wh.on']), And((variables['/myhouse/room#liv/heating#h2.level']) < (4), (variables['/myhouse/room#liv/heating#h1.level']) < (4) ))),
	#Implies((variables['/myhouse/room#liv.temp']) < (18), Or((variables['/myhouse/room#liv/heating#h2.level']) > (0), (variables['/myhouse/room#liv/heating#h1.level']) > (0) )),
	#Implies((variables['/myhouse/room#liv.bright']) > (2000), variables['/myhouse/room#liv/light#0.level'] == (0)),
	#And((variables['/myhouse/room#liv/heating#h2.level']) == (0), (variables['/myhouse/room#liv/heating#h1.level']) == (0) ),
	#Or((variables['/myhouse.outtemp']) > (5), And(Not(variables['/myhouse/room#liv/window#w1.opened']) )),
	#Implies((variables['/myhouse/wh.temp']) < (30), variables['/myhouse/wh.on']),
	#Or((variables['/myhouse/wh.temp']) < (50), Not(variables['/myhouse/wh.on'])),
	#Implies((variables['/myhouse.eprice']) < (10), variables['/myhouse/ev#donkey.charging']),
	#Implies((variables['/myhouse/ev#donkey.level']) < (30), variables['/myhouse/ev#donkey.charging'])
]
domains = [
	And(variables['/myhouse/room#liv/heating#h1.level'] >= 0, variables['/myhouse/room#liv/heating#h1.level'] <= 10),
	And(variables['/myhouse/room#liv/heating#h2.level'] >= 0, variables['/myhouse/room#liv/heating#h2.level'] <= 10),
	And(variables['/myhouse/room#liv/light#0.level'] >= 0, variables['/myhouse/room#liv/light#0.level'] <= 5)
	#And(variables['/myhouse/ev#donkey.level'] >= 0, variables['/myhouse/ev#donkey.level'] <= 100)
]

