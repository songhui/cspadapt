from z3 import *
from heapq import *
from random import *



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
		random = Random(0)
		for i in self.required:
			self.required_weight.append(10)
		self.preference_weight=[]
		for i in self.preference:
			self.preference_weight.append(3)
		self.config_weight = []
		for i in self.config_para:
			self.config_weight.append(4)
		#self.calcu_assumps()	
		self.count=0
		self.all_cores = []
		self.required_weight[0]=20
		
	def set_context(self, context_value_dict):
		self.context_value_dict = context_value_dict
		
	def set_config(self,config_value_dict):
		self.config_value_dict = config_value_dict
		

	def calcu_assumps(self):
		self.context = []
		for (key,value) in self.context_value_dict.items():
			self.context.append(self.getContextPara(key) == value)
		self.config = []

		for para in self.config_para:
			para_name = para.__repr__()
			self.config.append(para == self.config_value_dict[para_name])
		#for(key,value) in self.config_value_dict.items():
		#	self.config.append(self.getConfigPara(key) == value)
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
	
		solutions = []
		heappush(solutions,Solution(set([]),0))
				
		results = []
		
		sameCost = -1
		sameSolu = []
		
	
		while len(solutions)>0 and (len(results)<1):
				
			#limit the solution pool to be 
			#if len(solutions)>1000:
				#del solutions[0:len(solutions)-1000]
			
			current = heappop(solutions)
			print "---"
			print current
			
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
				print "set found: {0}".format(unsat_core_num)
			except StopIteration:
			#if True:	
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
				print "real found: {0}".format(sorted(unsat_core))		
				
				unsat_core_num = set(map(lambda x:int(x.__repr__()),unsat_core))
				if not unsat_core_num in self.all_cores:
					self.all_cores.append(unsat_core_num);

			for pInt in unsat_core_num:
				pInt = assump2int(pInt)
				newset = set(current.assumps)
				newset.add(pInt)
				newsolu = Solution(newset, current.weight + weights[pInt])
				
				heappush(solutions,newsolu)
				
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
		CONFIG_WEIGHT_ADDED = 100000000
		temp_config_dict = self.config_value_dict.copy()
		
		changed_para = []
		
		ori_result = self.results[0]
				
		pairs = zip(*[iter(config_value)]*2)
		for (key,value) in pairs:
			self.config_value_dict[key] = value
			
		for i,key in enumerate(map(lambda x:x.__repr__(), self.config_para)):
			if(self.config_value_dict[key]!=self.ori_config_value_dict[key]):
				changed_para.append(i)
			
		if self.reCheckCurrent(self.results[0].assumps):
			for (key,value) in pairs:
				self.addNewPrefer(self.getConfigPara(key) == value, 3)
		else:	
			self.config_weight = map(lambda x: x+CONFIG_WEIGHT_ADDED, self.config_weight)	
			self.solve()			
			self.config_weight = map(lambda x: x-CONFIG_WEIGHT_ADDED, self.config_weight)
			new_result = self.results[0]
			new_assump = new_result.assumps.union(changed_para)
			
			appeared = new_assump.difference(ori_result.assumps)
			disappeared = ori_result.assumps.difference(new_assump)
			
			tot_appeared = sum(map(lambda x:self.getWeight(x), appeared))
			tot_disappeared = sum(map(lambda x:self.getWeight(x),disappeared))-1
			
			for i in disappeared:
				self.changeWeight(i, float(tot_appeared)/tot_disappeared)
			for i in appeared:
				self.changeWeight(i,float(tot_disappeared)/tot_appeared)
				
				

	
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
		self.ori_config_value_dict = dict(self.config_value_dict)
		self.changed_para = self.results[id].assumps.intersection(range(0,len(self.config_para)))
		print "###{0}".format(self.changed_para)
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
