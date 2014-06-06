'''
Created on 12 Nov 2013

@author: fafey
'''

from z3 import *
from random import randint
from time import clock
from softz3 import *
from heapq import *
import unittest


def assump2int(assump):
        return int(assump.__repr__())

class Solution:
    def __init__(self, assumps, weight):
        #for assump in assumps:
            #self.bitVector = self.bitVector | (1<<assump)
        self.assumps = assumps
        self.weight = weight
        


    def __repr__(self):
        return self.assumps.__repr__() + ": " + str(self.weight) #+ ", p:" + str(self.getAllParents()) +"c: " + str(self.core)
    def setModel(self, model):
        self.model = model
    def __lt__(self,other):
        return self.weight < other.weight
    def __le__(self,other):
        return self.weight <= other.weight
    
    def setUnsetCore(self,core):
        self.core = set(map(lambda x:int(x.__repr__()),core))
    def getAllParents(self):
        result = set([])
        for (label,parent) in self.parent:
            result = result.union(parent.getAllParents())
            result.add(parent)
        return result


class SoftSolverDiagnose(SoftSolver):
    
    def __init__(self):
        SoftSolver.__init__(self)
        self._assumps = []
        self._solutions = []
        self._weights = []
        self.debug = True
        
        self.count = 0
        self.all_cores = []
    
    def init_solver(self):
        
        self.solver = Solver()
        
        for cst in self.hard:
            self.solver.add(cst)
        for i, (cst, wt) in enumerate(self.soft):
            p = Bool(str(i))
            self.solver.add(Implies(p, cst))
            self._assumps.append(p)
            self._weights.append(wt)
    
      
    


    def search(self):
        return self.dij_search()
  
    def dij_search(self):
        solver = self.solver
        assumps = self._assumps
        weights = self._weights
        
        bitSize = len(assumps)
            
        if self.debug:
            for i, (cst, weight) in enumerate(self.soft):
                print "%s: %s, %d" % (i, cst, weight)
    
        solutions = []
        heappush(solutions,Solution(set([]),0))
                
        results = []
        
        sameCost = -1
        sameSolu = []
        
        del self.all_cores[:]
        
    
        while len(solutions)>0 and (len(results)<1):
            #limit the solution pool to be 
            #if len(solutions)>1000:
                #del solutions[0:len(solutions)-1000]
            
            current = heappop(solutions)
            if len(solutions) > 800000:  
                print self.context_value_dict
                print self.config_value_dict
                del solutions[:]
                raise NameError('Here')
            
            if current.weight == sameCost:
                try:
                    next(x for x in sameSolu if x.assumps == current.assumps)
                    continue
                except StopIteration:
                    sameSolu.append(current)
            else:
                del sameSolu[:]
                sameCost = current.weight
                sameSolu.append(current)
            
            
            try:
                insec = next(x for x in self.all_cores if x.isdisjoint(current.assumps))
                unsat_core_num = set(insec)
            except StopIteration:
#            if True:    
                tocheck = map(lambda x:assumps[x], set(range(0,len(assumps))) - current.assumps)                                
                
                check_result = solver.check(*tocheck).r
                self.count = self.count + 1 #count the total number of z3 solving
                if check_result == Z3_L_TRUE:
                    results.append(current)
                    current.setModel(solver.model())
                    continue
                    #temp = filter(lambda x: x.assumps>=current.assumps, solutions)
                    #print temp
                    #for t in temp:
                    #    solutions.remove(t)
                #if self.count<200:
                #print "======" + self.count.__repr__()
                #print solver.unsat_core().__repr__() + ":" #+ current.__repr__()
                #    self.count = self.count+1
                #if len(solver.unsat_core())==0: print results
                
                unsat_core = solver.unsat_core()
                
                #print "{0} => {1}".format(sorted(current.assumps), sorted(unsat_core))        
                
                unsat_core_num = set(map(lambda x:int(x.__repr__()),unsat_core))
                if not unsat_core_num in self.all_cores:
                    self.all_cores.append(unsat_core_num);

            for pInt in unsat_core_num:
                pInt = assump2int(pInt)
                newset = set(current.assumps)
                newset.add(pInt)
                newsolu = Solution(newset, current.weight + weights[pInt])
                
                heappush(solutions,newsolu)
            
            if self.debug: print solutions[0]    
            self.results = results
            self.assumps = assumps
        
            
        if len(self.results) !=0:    
            result = self.results[0]
            self._last_model = result.weight
            self._last_result = True
            return self.results[0].weight
        else:
            return 0
       
    