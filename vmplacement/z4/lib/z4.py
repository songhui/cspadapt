#now in GitHub

from z3 import *
from heapq import *
from random import *


GOAL_RANGE=(10000,12000)
PREF_RANGE=(1000,2000)
CONF_RANGE=(1000,2000)
CEILING= 50000

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
	def __init__(self,):
		
		self.random = Random()
		
		self.hards = []
		
		self.weight_seeds = []
		
		self.other_soft = []
		
		self.count=0
		self.all_cores = []
		
		self.dependencies = dict()
		
		
		
		
	def set_current_plc(self, vms, pms, plc_map, plc_fun):
		vms = vms
		pms = pms

		
		self.vm_plc_assumpt = []
		self.pm_assumpt = []
		self.pm_vm_id = []
		for pm in pms:
			self.pm_vm_id.append([])
		self.current_plcs = []
					
		
		
		for i, vm in enumerate(vms):
			pm_id = plc_map[i]			
			self.pm_vm_id[pm_id].append(i)
			self.current_plcs.append(plc_fun(vm)==pms[pm_id])	
		
			
		
	def init_resource_constraint(self, vms, pms, res, req, consume):	
		for pm in pms:
			expr = IntVal(0)
			for vm in vms:
				expr = expr + consume(vm,pm)
			self.pm_resource_constraint.append(expr <= res(pm))
	

	def calcu_assumps(self):
		assumps = []
		weights = []	
		breakable = []	
		
		for i, c in enumerate(self.other_soft):
			p = Bool(str(len(assumps)))
			assumps.append(p)
			breakable.append(c)
			weights.append(self.weight_seeds[i]*100 + self.random.randint(0,100))
			#print weights[i]
			
		return (assumps,breakable,weights)

	
	def putConstraint2Solver(self,solver):
		(assumps,breakable,weights) = self.calcu_assumps()

		for c in self.hards:
			solver.add(c)
		for i in range(len(breakable)):
			solver.add(Implies(assumps[i],breakable[i]))
			
		return (assumps,breakable,weights)
		
		
	def solve(self, debug=False):
		
		solver = Solver()
		self.solver = solver
		(assumps,breakable,weights) = self.putConstraint2Solver(solver)
		self.assumps = assumps
		bitSize = len(assumps)
		
			
 		if debug:
 			for i, constraint in enumerate(breakable):
 				if i< 66 or i > 86:
 				    print str(i) + ": " + str(constraint) #.__repr__()
	
		solutions = []
		heappush(solutions,Solution(set([]),0))
				
		results = []
		self.results = results
		
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
#			if True:	
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
					#	solutions.remove(t)
				#if self.count<200:
				#print "======" + self.count.__repr__()
				#print solver.unsat_core().__repr__() + ":" #+ current.__repr__()
				#	self.count = self.count+1
				#if len(solver.unsat_core())==0: print results
				#if debug: print solutions
				unsat_core = solver.unsat_core()
				
				violated_pm = set([int(repr(x)) for x in unsat_core]) & set(self.dependencies.keys())
				if debug:
					print ">>"+str(violated_pm)
				if len(violated_pm) > 0:
					unsat_core = []
					for p in violated_pm:
						unsat_core.extend(self.assumps[it] for it in self.dependencies[p])
				
				if debug:
					#print solver.unsat_core()
					print "{0} => {1}".format(sorted(current.assumps), sorted(unsat_core))		
				
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
			#self.confirmConfig(0)
			#print len(self.results)
			print self.results[0]
		else:
			print "satisfied"
	
	def getModel(self):
		return self.results[0].model
	
	def printBroken(self):
		for i in self.results[0].assumps:
			print self.other_soft[i]
	
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
	
	def refineWithoutPref(self,*config_value):
		pairs = zip(*[iter(config_value)]*2)
		for (key,value) in pairs:
			self.config_value_dict[key] = value
		
	#(key,value,key,value,...)
	def refine(self,*config_value):
		CONFIG_WEIGHT_ADDED = 10000000000
		temp_config_dict = self.config_value_dict.copy()
		
		changed_para = []
		
		ori_result = self.results[0]
				
		pairs = zip(*[iter(config_value)]*2)
		for (key,value) in pairs:
			self.config_value_dict[key] = value
			
		for i,key in enumerate(map(lambda x:x.__repr__(), self.config_para)):
			if(self.config_value_dict[key]!=self.ori_config_value_dict[key]):
				changed_para.append(i)
			
#		if self.reCheckCurrent(self.results[0].assumps):
#			for (key,value) in pairs:
#				self.addNewPrefer(self.getConfigPara(key) == value, 3)
#			print 'out with passed'
#		else:
			
		self.config_weight = map(lambda x: x+CONFIG_WEIGHT_ADDED, self.config_weight)	
		self.solve()			
		self.config_weight = map(lambda x: x-CONFIG_WEIGHT_ADDED, self.config_weight)
		new_result = self.results[0]
		new_assump = new_result.assumps.union(changed_para)
		
		appeared = new_assump.difference(ori_result.assumps)
		disappeared = ori_result.assumps.difference(new_assump)
		
		#print new_result
		#print new_assump
		#print appeared
		#print disappeared
		
		tot_appeared = sum(map(lambda x:self.getWeight(x), appeared))
		tot_disappeared = sum(map(lambda x:self.getWeight(x),disappeared))-1
		
		if True:  # Change to False to switch down preference
			if tot_disappeared <= 0:
				for i in appeared:
					self.changeWeight(i,0.5)
				for (key, value) in pairs:
					para = next(x for x in self.config_para if str(x)==key)
					self.addNewPrefer(para == value, tot_appeared/2+1)
			else:		
				for i in disappeared:
					self.changeWeight(i, float(tot_appeared)/tot_disappeared)
				for i in appeared:
					self.changeWeight(i, float(tot_disappeared)/tot_appeared)

	
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
			newweight = int(self.config_weight[id]*weight_rate)
			if newweight > CEILING:
				print 'I got you (config): {0},{1}'.format(self.config[id],newweight)
				newweight = self.random.randint(CEILING-1000,CEILING)
			self.config_weight[id] = newweight
			return
		else: 
			id = id - len(self.config)
		if id < len(self.required) :
			newweight = int(self.required_weight[id]*weight_rate)
			if newweight > CEILING:
				print 'I got you (goal): {0}, {1}'.format(self.required[id], newweight)
				newweight = self.random.randint(CEILING-1000,CEILING)
			self.required_weight[id] = newweight
			return
		else:
			id = id - len(self.required)
		newweight = int(self.preference_weight[id]*weight_rate)
		if newweight > CEILING:
			print 'I got you (pref): {0}, {1}'.format(self.preference[id],newweight)
			newweight = self.random.randint(CEILING-1000,CEILING)
		self.preference_weight[id] = newweight			
				
	def printResults(self,debug=False):
		print "{0}: {1}".format(len(self.results), self.results)
		if debug:
			for i in self.results:
				print i.model

	def getNewConfig(self):
		return self.config_value_dict
			
	def printConfig(self):
		for line in self.config_para:
			print str(line) + ":   " + self.config_value_dict[line.__repr__()].__repr__()

	def addNewPrefer(self, prefer, weight):
		self.preference.append(prefer)
		self.preference_weight.append(max(weight, Random(0).randint(*PREF_RANGE)))
		
	def confirmConfig(self, id):
		self.ori_config_value_dict = dict(self.config_value_dict)
		self.changed_para = self.results[id].assumps.intersection(range(0,len(self.config_para)))
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

	def checkOriginalAssumps(self,ignored):	
		tocheck = list(self.assumps)
		for assump in ignored:
			tocheck[assump] = None
		for assump in ignored:
			tocheck.remove(None)
		if self.solver.check(*tocheck).r == Z3_L_TRUE:
			return True
		else:
			return False
		