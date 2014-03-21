'''
Created on 12 Nov 2013

@author: fafey
'''

from z3 import *


x = Int('x')
y = Int('x')
fun = Function('fun', IntSort(), IntSort())



solve(x > 5, x<7, ForAll(x, fun(x) == 10), fun(y) == 1)
