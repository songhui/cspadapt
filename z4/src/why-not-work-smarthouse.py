'''
Created on Jan 2, 2013

@author: Hui
'''

from z4 import *
import unittest

variables = {
    '/myhouse.eprice': Real('/myhouse.eprice'),
    '/myhouse.time': Int('/myhouse.time'),
    '/myhouse.outtemp': Real('/myhouse.outtemp'),
    '/myhouse/room#liv.temp': Real('/myhouse/room#liv.temp'),
    '/myhouse/room#liv.bright': Real('/myhouse/room#liv.bright'),
    '/myhouse/room#liv.air': Int('/myhouse/room#liv.air'),
    '/myhouse/room#liv/window#w1.curtainOn': Bool('/myhouse/room#liv/window#w1.curtainOn'),
    '/myhouse/room#liv/window#w1.opened': Bool('/myhouse/room#liv/window#w1.opened'),
    '/myhouse/room#liv/window#w2.curtainOn': Bool('/myhouse/room#liv/window#w2.curtainOn'),
    '/myhouse/room#liv/window#w2.opened': Bool('/myhouse/room#liv/window#w2.opened'),
    '/myhouse/room#liv/heating#h1.level': Int('/myhouse/room#liv/heating#h1.level'),
    '/myhouse/room#liv/heating#h2.level': Int('/myhouse/room#liv/heating#h2.level'),
    '/myhouse/room#liv/light#0.level': Int('/myhouse/room#liv/light#0.level'),
    '/myhouse/room#liv/light#1.level': Int('/myhouse/room#liv/light#1.level'),
    '/myhouse/room#liv/ac#0.level': Int('/myhouse/room#liv/ac#0.level'),
    '/myhouse/room#liv/ac#0.freshAir': Bool('/myhouse/room#liv/ac#0.freshAir'),
    '/myhouse/room#liv/projector.on': Bool('/myhouse/room#liv/projector.on'),
    '/myhouse/room#liv/projector.brightness': Int('/myhouse/room#liv/projector.brightness'),
    '/myhouse/room#liv/projector.volume': Int('/myhouse/room#liv/projector.volume'),
    '/myhouse/room#kitchen.temp': Real('/myhouse/room#kitchen.temp'),
    '/myhouse/room#kitchen.bright': Real('/myhouse/room#kitchen.bright'),
    '/myhouse/room#kitchen.air': Int('/myhouse/room#kitchen.air'),
    '/myhouse/room#kitchen/cooker.on': Bool('/myhouse/room#kitchen/cooker.on'),
    '/myhouse/room#bed1.temp': Real('/myhouse/room#bed1.temp'),
    '/myhouse/room#bed1.bright': Real('/myhouse/room#bed1.bright'),
    '/myhouse/room#bed1.air': Int('/myhouse/room#bed1.air'),
    '/myhouse/room#bed1/window#w1.curtainOn': Bool('/myhouse/room#bed1/window#w1.curtainOn'),
    '/myhouse/room#bed1/window#w1.opened': Bool('/myhouse/room#bed1/window#w1.opened'),
    '/myhouse/room#bed1/heating#h.level': Int('/myhouse/room#bed1/heating#h.level'),
    '/myhouse/room#bed2.temp': Real('/myhouse/room#bed2.temp'),
    '/myhouse/room#bed2.bright': Real('/myhouse/room#bed2.bright'),
    '/myhouse/room#bed2.air': Int('/myhouse/room#bed2.air'),
    '/myhouse/room#bed2/window#w1.curtainOn': Bool('/myhouse/room#bed2/window#w1.curtainOn'),
    '/myhouse/room#bed2/window#w1.opened': Bool('/myhouse/room#bed2/window#w1.opened'),
    '/myhouse/room#bed2/light#0.level': Int('/myhouse/room#bed2/light#0.level'),
    '/myhouse/wh.temp': Real('/myhouse/wh.temp'),
    '/myhouse/wh.on': Bool('/myhouse/wh.on'),
    '/myhouse/wh.boost': Bool('/myhouse/wh.boost'),
    '/myhouse/ev#donkey.pluged': Bool('/myhouse/ev#donkey.pluged'),
    '/myhouse/ev#donkey.level': Int('/myhouse/ev#donkey.level'),
    '/myhouse/ev#donkey.charging': Bool('/myhouse/ev#donkey.charging')
}
config_para = [
    variables['/myhouse/room#liv/window#w1.curtainOn'],
    variables['/myhouse/room#liv/window#w1.opened'],
    variables['/myhouse/room#liv/window#w2.curtainOn'],
    variables['/myhouse/room#liv/window#w2.opened'],
    variables['/myhouse/room#liv/heating#h1.level'],
    variables['/myhouse/room#liv/heating#h2.level'],
    variables['/myhouse/room#liv/light#0.level'],
    variables['/myhouse/room#liv/light#1.level'],
    variables['/myhouse/room#liv/ac#0.level'],
    variables['/myhouse/room#liv/ac#0.freshAir'],
    variables['/myhouse/room#liv/projector.on'],
    variables['/myhouse/room#liv/projector.brightness'],
    variables['/myhouse/room#liv/projector.volume'],
    variables['/myhouse/room#kitchen/cooker.on'],
    variables['/myhouse/room#bed1/window#w1.curtainOn'],
    variables['/myhouse/room#bed1/window#w1.opened'],
    variables['/myhouse/room#bed1/heating#h.level'],
    variables['/myhouse/room#bed2/window#w1.curtainOn'],
    variables['/myhouse/room#bed2/window#w1.opened'],
    variables['/myhouse/room#bed2/light#0.level'],
    variables['/myhouse/wh.on'],
    variables['/myhouse/wh.boost'],
    variables['/myhouse/ev#donkey.level'],
    variables['/myhouse/ev#donkey.charging']
]
context_para = [
    variables['/myhouse.eprice'],
    variables['/myhouse.time'],
    variables['/myhouse.outtemp'],
    variables['/myhouse/room#liv.temp'],
    variables['/myhouse/room#liv.bright'],
    variables['/myhouse/room#liv.air'],
    variables['/myhouse/room#kitchen.temp'],
    variables['/myhouse/room#kitchen.bright'],
    variables['/myhouse/room#kitchen.air'],
    variables['/myhouse/room#bed1.temp'],
    variables['/myhouse/room#bed1.bright'],
    variables['/myhouse/room#bed1.air'],
    variables['/myhouse/room#bed2.temp'],
    variables['/myhouse/room#bed2.bright'],
    variables['/myhouse/room#bed2.air'],
    variables['/myhouse/wh.temp'],
    variables['/myhouse/ev#donkey.pluged']
]
config = {
    '/myhouse/room#liv/window#w1.curtainOn': False,
    '/myhouse/room#liv/window#w1.opened': False,
    '/myhouse/room#liv/window#w2.curtainOn': False,
    '/myhouse/room#liv/window#w2.opened': True,
    '/myhouse/room#liv/heating#h1.level': 0,
    '/myhouse/room#liv/heating#h2.level': 2,
    '/myhouse/room#liv/light#0.level': 3,
    '/myhouse/room#liv/light#1.level': 3,
    '/myhouse/room#liv/ac#0.level': 0,
    '/myhouse/room#liv/ac#0.freshAir': False,
    '/myhouse/room#liv/projector.on': True,
    '/myhouse/room#liv/projector.brightness': 5,
    '/myhouse/room#liv/projector.volume': 26,
    '/myhouse/room#kitchen/cooker.on': True,
    '/myhouse/room#bed1/window#w1.curtainOn': True,
    '/myhouse/room#bed1/window#w1.opened': False,
    '/myhouse/room#bed1/heating#h.level': 2,
    '/myhouse/room#bed2/window#w1.curtainOn': False,
    '/myhouse/room#bed2/window#w1.opened': True,
    '/myhouse/room#bed2/light#0.level': 2,
    '/myhouse/wh.on': True,
    '/myhouse/wh.boost': False,
    '/myhouse/ev#donkey.level': 10,
    '/myhouse/ev#donkey.charging': False
}
context = {
    '/myhouse.eprice': 25.0,
    '/myhouse.time': 23,
    '/myhouse.outtemp': 5,
    '/myhouse/room#liv.temp': 9.0,
    '/myhouse/room#liv.bright': 4000.0,
    '/myhouse/room#liv.air': 0,
    '/myhouse/room#kitchen.temp': 0.0,
    '/myhouse/room#kitchen.bright': 30.0,
    '/myhouse/room#kitchen.air': 6,
    '/myhouse/room#bed1.temp': 15.0,
    '/myhouse/room#bed1.bright': 1000,
    '/myhouse/room#bed1.air': 6,
    '/myhouse/room#bed2.temp': 10.0,
    '/myhouse/room#bed2.bright': 2000,
    '/myhouse/room#bed2.air': 0,
    '/myhouse/wh.temp': 20,
    '/myhouse/ev#donkey.pluged': True
}

goals = [
    Implies((variables['/myhouse.eprice']) > (15), Or(Or(And((variables['/myhouse/ev#donkey.charging']) == (False) ), Not(variables['/myhouse/wh.on'])), And((variables['/myhouse/room#kitchen/cooker.on']) == (False) ))),
    Implies((variables['/myhouse/room#liv.temp']) < (18), Or((variables['/myhouse/room#liv/heating#h1.level']) > (0), (variables['/myhouse/room#liv/heating#h2.level']) > (0) )),
    Implies((variables['/myhouse.time']) > (22), (variables['/myhouse/room#liv/projector.volume']) < (10)),
    Implies((variables['/myhouse/room#liv.temp']) < (10), (variables['/myhouse/room#liv/heating#h1.level'] + variables['/myhouse/room#liv/heating#h2.level']  ) > ((3) * (2))),
    Implies(And(variables['/myhouse/room#liv/projector.on'], (variables['/myhouse/room#liv.bright']) > (500)), And(And((variables['/myhouse/room#liv/light#0.level']) == (0), (variables['/myhouse/room#liv/light#1.level']) == (0) ), And(variables['/myhouse/room#liv/window#w1.curtainOn'], variables['/myhouse/room#liv/window#w2.curtainOn'] ))),
    Implies((variables['/myhouse/room#liv.air']) > (5), Or(Or(variables['/myhouse/room#liv/window#w1.opened'], variables['/myhouse/room#liv/window#w2.opened'] ), Or(variables['/myhouse/room#liv/ac#0.freshAir'] ))),
    Or(And((variables['/myhouse/room#liv/heating#h1.level']) == (0), (variables['/myhouse/room#liv/heating#h2.level']) == (0) ), And((variables['/myhouse/room#liv/ac#0.level']) == (0) )),
    Or(And((variables['/myhouse/room#liv/window#w1.opened']) == (False), (variables['/myhouse/room#liv/window#w2.opened']) == (False) ), And((variables['/myhouse/room#liv/heating#h1.level']) == (0), (variables['/myhouse/room#liv/heating#h2.level']) == (0) )),
    Or((variables['/myhouse.outtemp']) > (5), And(Not(variables['/myhouse/room#liv/window#w1.opened']), Not(variables['/myhouse/room#liv/window#w2.opened']) )),
    (variables['/myhouse.outtemp']) > (5),
    Implies((variables['/myhouse/room#bed1.temp']) < (18), Or((variables['/myhouse/room#bed1/heating#h.level']) > (0) )),
    Implies((variables['/myhouse/room#bed1.temp']) < (10), (variables['/myhouse/room#bed1/heating#h.level']  ) > ((3) * (1))),
    Implies((variables['/myhouse/room#bed1.bright']) > (500), And(variables['/myhouse/room#bed1/window#w1.curtainOn'] )),
    Implies((variables['/myhouse/room#bed1.air']) > (5), Or(variables['/myhouse/room#bed1/window#w1.opened'] )),
    And((variables['/myhouse/room#bed1/heating#h.level']) == (0) ),
    Or(And((variables['/myhouse/room#bed1/window#w1.opened']) == (False) ), And((variables['/myhouse/room#bed1/heating#h.level']) == (0) )),
    Or((variables['/myhouse.outtemp']) > (5), And(Not(variables['/myhouse/room#bed1/window#w1.opened']) )),
    Implies((variables['/myhouse/room#bed2.bright']) > (500), And(And((variables['/myhouse/room#bed2/light#0.level']) == (0) ), And(variables['/myhouse/room#bed2/window#w1.curtainOn'] ))),
    Implies((variables['/myhouse/room#bed2.air']) > (5), Or(variables['/myhouse/room#bed2/window#w1.opened'] )),
    And((variables['/myhouse/room#bed2/window#w1.opened']) == (False) ),
    Or((variables['/myhouse.outtemp']) > (5), And(Not(variables['/myhouse/room#bed2/window#w1.opened']) )),
    Or(Or((variables['/myhouse.time']) < (2), (variables['/myhouse.time']) > (8)), variables['/myhouse/wh.on']),
    Implies((variables['/myhouse/wh.temp']) < (30), variables['/myhouse/wh.on']),
    Or((variables['/myhouse/wh.temp']) < (50), Not(variables['/myhouse/wh.on'])),
    Implies((variables['/myhouse.eprice']) < (10), variables['/myhouse/ev#donkey.charging']),
    Implies((variables['/myhouse/ev#donkey.level']) < (30), variables['/myhouse/ev#donkey.charging'])
]
domains = [
    And(variables['/myhouse/room#liv/heating#h1.level'] >= 0, variables['/myhouse/room#liv/heating#h1.level'] <= 10),
    And(variables['/myhouse/room#liv/heating#h2.level'] >= 0, variables['/myhouse/room#liv/heating#h2.level'] <= 10),
    And(variables['/myhouse/room#liv/light#0.level'] >= 0, variables['/myhouse/room#liv/light#0.level'] <= 5),
    And(variables['/myhouse/room#liv/light#1.level'] >= 0, variables['/myhouse/room#liv/light#1.level'] <= 5),
    And(variables['/myhouse/room#liv/ac#0.level'] >= 0, variables['/myhouse/room#liv/ac#0.level'] <= 5),
    And(variables['/myhouse/room#liv/projector.brightness'] >= 0, variables['/myhouse/room#liv/projector.brightness'] <= 10),
    And(variables['/myhouse/room#liv/projector.volume'] >= 0, variables['/myhouse/room#liv/projector.volume'] <= 20),
    And(variables['/myhouse/room#bed1/heating#h.level'] >= 0, variables['/myhouse/room#bed1/heating#h.level'] <= 10),
    And(variables['/myhouse/room#bed2/light#0.level'] >= 0, variables['/myhouse/room#bed2/light#0.level'] <= 5),
    And(variables['/myhouse/ev#donkey.level'] >= 0, variables['/myhouse/ev#donkey.level'] <= 100)
]

class TestSmartHomeFunctions(unittest.TestCase):
    def setUp(self):        
    
        cs = ContextSolver(config_para, context_para, domains, goals, [])
        cs.set_config(config)
        cs.set_context(context)
        
        self.cs = cs
        
    def testSimpleCheck(self):
        print self.cs.solve(True)
        self.cs.printResults()
        self.cs.printConfig()
        print self.cs.count
