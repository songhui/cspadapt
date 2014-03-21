'''
Created on 12 Nov 2013

@author: fafey
'''

from z3 import *


MyType = Datatype('MyType')
MyType.declare('a')
MyType.declare('b')

MyType = MyType.create()

fun = Function('fun', MyType, IntSort())
x = Const('x', MyType)


solve(MyType.a == x, fun(x) == 5)
