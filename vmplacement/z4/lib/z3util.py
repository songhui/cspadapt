from z3 import *


class QuickExpr:
    def __init__(self, alive, typeof, nullinst, nulltype):
        self.alive = alive
        self.typeof = typeof
        self.nullinst = nullinst
        self.nulltype = nulltype
        
    def only_alive(self, inst, expr):
        return Implies(self.alive(inst), expr)
    
    def only_alive_type(self, inst, ttype, expr):
        return Implies(And(self.alive(inst), self.typeof(inst)==ttype), expr)
    
    def only_alive_types(self, inst, types, expr):
        return Implies(And(self.alive(inst), Or([self.typeof(inst)==t for t in types])), expr)
    
    def alter_types(self, inst, types):
        return Implies(self.alive(inst), Or([self.typeof(inst)==type for type in types]))
    
    def cartesian_not_equal(self, instances, types):
        return And([self.typeof(x)!=y for x in instances for y in types])
    
    def count(self, insts, target, relation):
        return Sum([If(relation(i)==target, 1, 0) for i in insts])
    
    def type_dep(self, inst, reference, sourceType, targetTypes):
        return Implies(And(self.alive(inst), self.typeof(inst)==sourceType), 
                       And(
                           self.alive(reference(inst)),
                           Or([self.typeof(reference(inst))==t for t in targetTypes])
                       ))
        
    def type_dep_multiple(self, inst, reference, sourceTypes, targetTypes):
        return Implies(And(self.alive(inst), Or([self.typeof(inst)==t for t in sourceTypes])), 
                       And(
                           self.alive(reference(inst)),
                           Or([self.typeof(reference(inst))==t for t in targetTypes])
                       )) 
           
    def ref_to_null(self, inst, reference, sourceType):
        return Implies(self.typeof(inst)==sourceType, reference(inst)==self.nullinst)
    
    def ref_to_null_multiple(self, inst, reference, sourceTypes):
        return Implies(Or([self.typeof(inst)==t for t in sourceTypes]),
                       reference(inst)==self.nullinst)
        
    def exist_alive_typed(self, instances, types):
        return Or([And(self.alive(i), Or([self.typeof(i)==t for t in types])) for i in instances])
    