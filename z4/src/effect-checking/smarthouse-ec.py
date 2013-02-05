'''
Created on Jan 2, 2013

@author: Hui
'''


from z4 import *
import unittest
from random import *

from homecsp import *

class TestSmartHomeFunctions(unittest.TestCase):
    def setUp(self):  
        filtered_goals = filter(lambda x: self.goalsWithConfig(x), goals)
        cs = ContextSolver(config_para, context_para, domains, filtered_goals, [])
        cs.set_config(config)
        cs.set_context(context)        
        self.cs = cs
        self.random = Random(0)

        

    def goalsWithConfig(self,goal):
        if any(x for x in config_para if x.eq(goal)):            
            return True
        for g in goal.children():
            if self.goalsWithConfig(g):
                return True
        return False
 
        
    def ttestSimpleCheck(self):
        
        cs = self.cs
        print self.cs.solve(True)
        self.cs.printResults()
        self.cs.printConfig()
 #       self.cs.refine()
        print self.cs.count
          
        
        self.cs.refine('/myhouse/room#liv/heating#h2.level',8)
                       #'/myhouse/room#liv/light#0.level',1,
                       #'/myhouse/ev#donkey.charging',True,
                       #'/myhouse/room#liv/projector.on',True)
        print self.cs.preference

        cs.set_context(context)
        cs.set_config(config)
        cs.solve()
        cs.printResults()
        cs.printConfig()
        
    def testSolveRefine(self):
        cs = self.cs
        cs.solve(True)
        #cs.printConfig()
        for i in range(1,10):
            #print cs.config_value_dict['/myhouse/room#bed2/light#0.level']
            self.contextEvolve(cs.context_value_dict)
            self.configEvolve(cs.config_value_dict)
            #print cs.config_value_dict['/myhouse/room#bed2/light#0.level']
            cs.solve()
            cs.printResults()
            
            #cs.printConfig()
            print '{0}: changed: {1}'.format(i,sorted(cs.changed_para))
            
        
        
    def contextEvolve(self,context):
        context['/myhouse.time'] += 1
        print context['/myhouse.time']
        
        random = self.random
        
        context['/myhouse.eprice'] += random.randrange(-10,10,1)        
        
        
        temps = [str(x) for x in context_para if 'temp' in str(x)]
        for i in range(1,5):        
            temp = temps[random.randint(0,len(temps)-1)]
            context[temp] += float(random.randint(-10,10))/2
        
        brights = [str(x) for x in context_para if 'bright' in str(x)]   
        for i in range(1,3):     
            bright = brights[random.randint(0,len(brights)-1)]
            context[bright] += abs( random.randrange(-1000, 1000, 50))
            
        airs = [str(x) for x in context_para if 'air' in str(x)]   
        for i in range(1,3):     
            air = airs[random.randint(0,len(airs)-1)]
            context[air] = random.randint(0,10)
        
        plugeds = [str(x) for x in context_para if 'pluged' in str(x)]        
        pluged = plugeds[random.randint(0,len(plugeds)-1)]
        context[pluged] = (randint(0,1)==0)
        
    def configEvolve(self,config):
        random = self.random
        for i in range(0,5):
            c = config_para[random.randint(0,len(config_para)-1)]
            cs = str(c)
            #print c.__class__.__name__
            if 'BoolRef' == c.__class__.__name__:
                config[cs] = (randint(0,1)==0)
                continue
            if c.is_int():
                config[cs] += random.randint(-5,5)
            else:
                if c.is_real:
                    config[cs] += 0 
                else:
                    config[cs] = (randint(0,1)==0)
                 
                
        
      #def containsConfig(Expr):  
