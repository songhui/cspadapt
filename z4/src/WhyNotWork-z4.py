from z3 import *

def assump2int(assump):
		return int(assump.__repr__())

			
class Solution:
	def __init__(self, assumps, weight):
		#for assump in assumps:
			#self.bitVector = self.bitVector | (1<<assump)
		self.assumps = assumps
		self.weight = weight
		self.valid = True
		self.parent = []
		self.core = set([])
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
	
	

class ContextSolver:
	def __init__(self, config_para, context_para, physical, required, preference):
		self.config_para = config_para
		self.context_para = context_para
		self.required = required
		self.preference = preference
		self.physical = physical
		self.context = []
		self.config = []		
		
		self.required_weight=[]
		for i in self.required:
			self.required_weight.append(1000)
		self.preference_weight=[]
		for i in self.preference:
			self.preference_weight.append(200)
		self.config_weight = []
		for i in self.config_para:
			self.config_weight.append(300)
		#self.calcu_assumps()	
		self.count=0
		
	def set_context(self, context_value_dict):
		self.context_value_dict = context_value_dict
		
	def set_config(self,config_value_dict):
		self.config_value_dict = config_value_dict
		

	def calcu_assumps(self):
		self.context = []
		for (key,value) in self.context_value_dict.items():
			self.context.append(self.getContextPara(key) == value)
		self.config = []
		for(key,value) in self.config_value_dict.items():
			self.config.append(self.getConfigPara(key) == value)
		assumps = []
		weights = []
		breakable =  self.config + self.required + self.preference
		weights = self.config_weight + self.required_weight + self.preference_weight
		for i,c in enumerate(breakable):
			p = Bool(str(i))
			assumps.append(p)
		return (assumps,breakable,weights)

	#(key,value,key,value...)
	def changeConfig(self,*values):
		for (key,value) in zip(*[iter(values)]*2):
			self.config_value_dict[key] = value
	
	def changeContext(self,*values):
		for (key,value) in zip(*[iter(values)]*2):
			self.context_value_dict[key] = value
	
	def putConstraint2Solver(self,solver):
		(assumps,breakable,weights) = self.calcu_assumps()

		for c in self.physical:
			solver.add(c)
		for c in self.context:
			solver.add(c)
		for i in range(len(breakable)):
			solver.add(Implies(assumps[i],breakable[i]))
			
		return (assumps,breakable,weights)
		
		
	def solve(self, debug=False):
		
		solver = Solver()
		(assumps,breakable,weights) = self.putConstraint2Solver(solver)
		bitSize = len(assumps)
			
		if debug:
			for i, constraint in enumerate(breakable):
				print str(i) + ": " + constraint.__repr__()
	
		solutions = [Solution(set([]),0)]
		pastSolutions = []
	
		results = []
	
		while len(solutions)>0 and (len(results)<10):
			#limit the solution pool to be 
			#if len(solutions)>100:
				#del solutions[0:len(solutions)-100]
			
			current = solutions.pop()
			pastSolutions.insert(0, current)
			temp = filter(lambda x: x.assumps<=current.assumps, results)
			if len(temp) > 0:
				continue
			tocheck = list(assumps)
			for assump in current.assumps:
				tocheck[assump] = None
			for assump in current.assumps:
				tocheck.remove(None)
			#if debug: print solver.check(*tocheck)
			check_result = solver.check(*tocheck).r
			self.count = self.count + 1 #count the total number of z3 solving
			if check_result == Z3_L_TRUE:
				results.append(current)
				current.setModel(solver.model())
				continue
				#temp = filter(lambda x: x.assumps>=current.assumps, solutions)
				#print temp
				#for t in temp:
				#	solutions.remove(t)
			#if self.count<200:
			#print "======" + self.count.__repr__()
			#print solver.unsat_core().__repr__() + ":" #+ current.__repr__()
			#	self.count = self.count+1
			#if len(solver.unsat_core())==0: print results
			#if debug: print solutions
			unsat_core = solver.unsat_core()
			current.setUnsetCore(unsat_core)
			
			parents = filter(lambda x: current.core < x.core, current.getAllParents())
			if len(parents) > 0:
				#print "I'm here" + str(current)
				parent = parents.pop()
				queue = []
				diff = parent.core - current.core
				parent.core = current.core
				for so in reversed(solutions + pastSolutions):
					dead = True
					if len(so.parent) == 0:
						dead = False
					for(label,p) in so.parent:
						if (p==parent) and (label in diff):
							continue
						if p.valid == False:
							continue
						dead = False
						break	
					if dead: 
						so.valid = False	
						print "dead: " + str(so)
			solutions = filter(lambda x: x.valid, solutions)
			pastSolutions = filter(lambda x: x.valid, pastSolutions)
			for p in unsat_core:
				pInt = assump2int(p)
				newset = set(current.assumps)
				newset.add(assump2int(p))
				newsolu = Solution(newset, current.weight + weights[pInt])
				newsolu.parent.append((pInt,current));
				found = 0
				contained = False
				try:
					found = next(i for i,s in enumerate(solutions) if s <= newsolu)
				except StopIteration:
					found = len(solutions)
				i = found
				while found < len(solutions) and solutions[found].weight==newsolu.weight:
					if(solutions[found].assumps == newsolu.assumps):
						solutions[found].parent = solutions[found].parent + newsolu.parent
						contained = True
					found = found + 1
				if not contained:
					solutions.insert(i,newsolu)
			self.results = results
			self.assumps = assumps
		
			
		if len(self.results) !=0:	
			self.confirmConfig(0)
		else:
			print "satisfied"
	
	def reCheckCurrent(self, ignored):
		solver = Solver()
		(assumps,breakable,weights) = self.putConstraint2Solver(solver)
		tocheck = list(assumps)
		for assump in ignored:
			tocheck[assump] = None
		for assump in ignored:
			tocheck.remove(None)
		if solver.check(*tocheck).r == Z3_L_TRUE:
			return True
		else:
			return False
		
	#(key,value,key,value,...)
	def refine(self,*config_value):
		temp_config_dict = self.config_value_dict.copy()
		pairs = zip(*[iter(config_value)]*2)
		for (key,value) in pairs:
			self.config_value_dict[key] = value			
		if self.reCheckCurrent(self.results[0].assumps):
			for (key,value) in pairs:
				self.addNewPrefer(self.getConfigPara(key) == value, 100)
	
	def switch(self, subs_id):
		original = self.results[0]
		substitute = self.results[subs_id]
		self.confirmConfig(subs_id)
		diff = substitute.weight - original.weight
		sub_ori = substitute.assumps - original.assumps
		sum = 0
		for i in sub_ori: sum += self.getWeight(i)
		diff_rate = float(sum-diff) / sum
		for i in sub_ori:
			self.changeWeight(i, diff_rate)
		
		diff = diff / subs_id
			
		for res in self.results[0:subs_id]:
			sub_any = res.assumps - substitute.assumps
			sum = 0
			for i in sub_any: sum += self.getWeight(i)
			diff_rate_any = float(sum+diff)/sum
			for i in sub_any:
				self.changeWeight(i,diff_rate_any)
			
	
	def getWeight(self,id):
		if id < len(self.config) :
			return self.config_weight[id] 
		else: 
			id = id - len(self.config)
		if id < len(self.required) :
			return self.required_weight[id] 
		else:
			id = id - len(self.required)
		return self.preference_weight[id] 
		
	def changeWeight(self,id,weight_rate):
		if id < len(self.config) :
			self.config_weight[id] = int(self.config_weight[id]*weight_rate)
			return
		else: 
			id = id - len(self.config)
		if id < len(self.required) :
			self.required_weight[id] = int(self.required_weight[id]*weight_rate)
			return
		else:
			id = id - len(self.required)
		self.preference_weight[id] = int(self.preference_weight[id]*weight_rate)			
				
	def printResults(self,debug=False):
		print "{0}: {1}".format(len(self.results), self.results)
		if debug:
			for i in self.results:
				print i.model

	def getNewConfig(self):
		return self.config_value_dict
			
	def printConfig(self):
		for line in self.config_value_dict:
			print line + ":   " + self.config_value_dict[line].__repr__()

	def addNewPrefer(self, prefer, weight):
		self.preference.append(prefer)
		self.preference_weight.append(weight)
		
	def confirmConfig(self, id):
		for para in self.config_para:
			v = self.results[id].model[para]
			vsort = v.sort().__repr__()
			if  vsort == 'Bool':
				rv = v.__repr__() == 'True'
			if vsort == 'Real':
				rv = float(v.__repr__())
			if vsort == 'Int':
				rv = int(v.__repr__())
			self.config_value_dict[para.__repr__()] = rv
		
	def getConfigPara(self,name):
		for i in self.config_para:
			if i.__repr__() == name:
				return i
	def getContextPara(self,name):
		for i in self.context_para:
			if i.__repr__() == name:
				return i
