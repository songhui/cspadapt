'''
Created on Jan 2, 2013

@author: Hui
'''


from z4 import *
import unittest
from random import *

from homecsp import *
from time import clock

class TestSmartHomeFunctions(unittest.TestCase):
    def setUp(self):  
        filtered_goals = filter(lambda x: self.goalsWithConfig(x), goals)
        cs = ContextSolver(config_para, context_para, domains, filtered_goals, [])
        cs.set_config(config)
        cs.set_context(context)        
        self.cs = cs

        

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
          
        
#        self.cs.refine('/myhouse/room#liv/heating#h2.level',8)
#                       #'/myhouse/room#liv/light#0.level',1,
#                       #'/myhouse/ev#donkey.charging',True,
#                       #'/myhouse/room#liv/projector.on',True)
#        print self.cs.preference
#
#        cs.set_context(context)
#        cs.set_config(config)
#        cs.solve()
#        cs.printResults()
#        cs.printConfig()
        
    def testSolveRefine(self):
        f = open('C:\\Users\\Hui\\temp\\data.txt','w')
        LOOP = 500
        ROUND = 100
        stat = [0]*ROUND
        for curr in range(0,LOOP):
            self.setUp()
            random = Random()
            self.random = random
            cs = self.cs
            cs.solve()
            #cs.printConfig()
            for i in range(0,ROUND):
                #print('round {0}'.format(i))
                self.contextEvolve(cs.context_value_dict)
                self.configEvolve(cs.config_value_dict)
                
                try:
                    cs.solve()
                except NameError:
                    break
                #cs.printResults()
                
                count = 0
                start = random.randint(0,len(users)-1)
                rot = users[start:]+users[:start]
                for (precon, confv, value) in rot:
                    if precon(cs.context_value_dict,cs.config_value_dict):
                        if cs.config_value_dict[confv] != value:
                            print '({3}) {0}: {1} => {2}'.format(confv, cs.config_value_dict[confv],value,i)
                            cs.refine(confv,value)
                            count += 1
                            break
                #print('{0} refined'.format(count))        
                #print('')
                stat[i] += count
            toprint = '{0}: {1}'.format(curr, stat)
            print(toprint)
            f.write(toprint+'\n')
            f.flush()
            
    def ttestSolvePerformance(self):
        times = 0
        len_total = 0
        LOOP = 1
        ROUND = 9
        stat = [0]*ROUND
        for curr in range(0,LOOP):
            self.setUp()
            random = Random()
            self.random = random
            cs = self.cs
            cs.solve()
            size = len(cs.results[0].assumps)
            len_total += size
            print('{0}'.format(size))
            #cs.printConfig()
            start = clock()
            for i in range(0,ROUND):
                #print('round {0}'.format(i))
                self.contextEvolve(cs.context_value_dict)
                self.configEvolve(cs.config_value_dict)
                
                try:
                    cs.solve()
                    size = len(cs.results[0].assumps)
                    print('{0}'.format(size))
                    len_total += size
                except NameError:
                    break
            elaspe = clock()-start
        print('{0}\t{1}\t{2}'.format(len(cs.assumps), len_total, elaspe))
        
    def contextEvolve(self,context):
        
        #print context['/myhouse.time']
        
        random = self.random
        
        if random.randint(0,3)==0:
            context['/myhouse.time'] = random.randint(0,23)
        if random.randint(0,3)==0:
            context['/myhouse.eprice'] += random.randrange(-10,10,1)        
        
        
        temps = [str(x) for x in context_para if 'temp' in str(x)]
        for i in range(1,4):        
            temp = temps[random.randint(0,len(temps)-1)]
            context[temp] += float(random.randint(-10,10))
        
        brights = [str(x) for x in context_para if 'bright' in str(x)]   
        for i in range(1,2):     
            bright = brights[random.randint(0,len(brights)-1)]
            context[bright] += abs( random.randrange(-1000, 1000, 50))
            
        airs = [str(x) for x in context_para if 'air' in str(x)]   
        for i in range(1,2):     
            air = airs[random.randint(0,len(airs)-1)]
            context[air] = random.randint(0,10)
        
        for i in range(1,10):
            boolcontext = context_para[random.randint(0,len(context)-1)]
            if 'BoolRef' == boolcontext.__class__.__name__:
                context[str(boolcontext)] = (random.randint(0,1)==0)
        
    def configEvolve(self,config):
        random = self.random
        for i in range(0,3):
            c = config_para[random.randint(0,len(config_para)-1)]
            cs = str(c)
            #print c.__class__.__name__
            if 'BoolRef' == c.__class__.__name__:
                config[cs] = (randint(0,1)==0)
                continue
            if c.is_int():
                config[cs] = random.randint(0,10)
            else:
                if c.is_real:
                    config[cs] += 0 
                else:
                    config[cs] = (randint(0,1)==0)
                 
                
        
      #def containsConfig(Expr):  
