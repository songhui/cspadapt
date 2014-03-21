'''
Created on 1 Feb 2013

@author: Hui
'''

f = open("C:\\Temp\\SmartHouse-O.ecore")

classes = 0;
properties = 0;
contexts = 0;
configs = 0;
invs = 0


help(f)
for line in f:
    if 'class' in line:
        classes +=1
    if 'attribute' in line:
        properties += 1
        contexts +=1
    if 'annotation config' in line:
        configs += 1
        
    if 'property' in line:
        properties +=1
    
    if 'invariant' in line:
        invs += 1
        
print('class & {0} \\\\ propert & {1}\\\\ context & {2}\\\\ config & {3}\\\\ inv & {4}\\\\'.format(classes, properties, contexts, configs, invs))
        