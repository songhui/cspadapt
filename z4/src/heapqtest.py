'''
Created on Jan 9, 2013

@author: fafey
'''
from heapq import *
from random import *
import unittest

class TestSmartHomeFunctions(unittest.TestCase):
    def testSorted(self):
        random = Random(0)
        queue = []
        for i in range(0,1000000):
            heappush(queue,random.randint(0,10000000))
 
        sum = 0   
        for i in sorted(queue):
            sum += i

        print sum