'''
Created on 15 Mar 2014

@author: huis
'''

from rawdata import alltogether

f = open('rdata', 'w')

f.write("type,\t value\n")

for i, lst in enumerate(alltogether):
    for d in lst:
        f.write(str(i))
        f.write(',\t')
        f.write(str(d))
        f.write('\n')

f.close()


    