from z4 import *
import unittest


class TestSequenceFunctions(unittest.TestCase):
	def setUp(self):
		screen = Int('screen')
		env = Int('env')
		battery = Int('battery')
		slownet = Bool('slownet')
		bw = Bool('bw')
		text = Bool('text')


		config_para = [screen, bw, text]
		context_para = [env,battery,slownet]


		physical = [
				And(screen > 0, screen < 255),
				And(env >0, env < 100000),
				And(battery>0, battery < 100),
		]

		required = [
				Implies(env>2000, screen>180),
				Implies(battery <= 30, screen < 128),
				Implies(bw, text),
				Implies(screen<128, bw),
				Implies(slownet, text)
			]

		context = [ 
				env == 1000, 
				battery == 20,
				slownet == True
			]

		config = [
				screen == 200,
				Not(bw),
				Not(text)
			]

		preference = [
					#		screen == 50,
					#		screen == 70
				]

		cs = ContextSolver(config_para, context_para, physical, required, preference)
		cs.set_context({'env':1000,'battery':20,'slownet':True})
		cs.set_config(dict({'screen':200, 'bw':False, 'text':False}))
		
		self.cs = cs
		
	def test_refine(self):
		cs = self.cs
		
		cs.solve()
		cs.printResults()		
		cs.printConfig()
		self.assertEquals({'text':True,'screen':1, 'bw':True}, cs.getNewConfig())
		
		cs.refine('screen',50)
		cs.printConfig()
		self.assertEquals({'text':True,'screen':50, 'bw':True}, cs.getNewConfig())
		
		cs.changeConfig('screen',200,'bw',False)
		self.assertEquals({'text': True, 'screen': 200, 'bw': False}, cs.getNewConfig())
		cs.solve();
		self.assertEquals({'text':True,'screen':50, 'bw':True}, cs.getNewConfig())
		
		cs.refine('screen',60)
		cs.refine('screen',60)
		cs.changeConfig('screen',200,'bw',False)
		cs.solve();
		cs.printConfig();
		self.assertEqual({'text':True, 'screen':60, 'bw':True}, cs.getNewConfig())
	
	def test_switch(self):
		cs = self.cs
		cs.solve(True)
		cs.refine('screen',50)
		
		cs.switch(2)
		print cs.config_weight+cs.required_weight+cs.preference_weight
		cs.printConfig();
		
		cs.set_config({'screen':200, 'bw':False, 'text':False})
		cs.solve()
		cs.printConfig()
		self.assertEqual({'screen':50, 'bw':False, 'text':True}, cs.getNewConfig())

	def test_type(self):
		#a = IntNumRef(5)
		cs = self.cs
		cs.solve()
		for i in cs.getNewConfig():
			print type(cs.getNewConfig()[i])
		print type(cs.getNewConfig()['screen'])
		#print int(cs.getNewConfig()['screen'])

