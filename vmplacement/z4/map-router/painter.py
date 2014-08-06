'''
Created on 12 Nov 2013

@author: fafey
'''

from z3 import *
import networkx as nx
import matplotlib.pyplot as plt
import math
import random


class ResultPainter():
    
    def __init__(self):
        self.vars = []
        self.refs = []
        self.filters = []
        self.types = []
        self.attrs = []
        self.eval = None
        self.G = nx.Graph()
        self.use_filters = False
        self._colors = ['#99aaee', '#eeaa99', '#ccffdd', '#ddffcc', '#aa99ee', 'g', 'r', 'm', 'y', 'c']
        
    def make_graph(self): 
        self.G.clear()
        using_vars = [v for v in self.vars if self._filt(v)]
        for v in using_vars:
            type = self._type_of_v(v)
            attrs = self._attr_of_v(v)
            attrs['type'] = type
            self.G.add_node(str(v),attrs)
        all_nodes_str = [str(n) for n in self.G.nodes()] 
        for ref in self.refs:
            for v in using_vars:
                try:
                    tgt = str(self.eval(ref(v)))
                    if tgt in all_nodes_str:
                        self.G.add_edge(str(v), tgt)
                except Z3Exception:
                    None
        pos=nx.spring_layout(self.G)
        label = dict((n, str(n)+':'+d['type'] + self._attr(n)) for n,d in self.G.nodes(data=True)) 
        plt.ion()
        
        node_type_dict = dict()
        for n,d in self.G.nodes(data=True):
            t = d['type']
            if t in node_type_dict:
                node_type_dict[t].append(n)
            else:
                node_type_dict[t] = [n]
        ci = 0
        for t, ns in node_type_dict.items():
            nx.draw_networkx_nodes(self.G, pos, nodelist= ns, node_size = 5000, node_color = self._colors[ci])
            ci = ci+1
        #nx.draw(self.G, pos=pos, with_lables=True, node_size=5000)
        nx.draw_networkx_labels(self.G, pos, label)
        nx.draw_networkx_edges(self.G, pos, self.G.edges())
        plt.show(block=True)   
    
    def _filt(self, v):  
        if len(self.filters)==0: 
            return True 
        if not self.use_filters: 
            return True
        for filter in self.filters:
            try:
                tgt = str(self.eval(filter(v)))
                if tgt == 'True': return True
            except:
                None
        return False
    
    def _type_of(self, vstr):
        v = next(n for n in self.vars if str(n)==vstr)
        return self._type_of_v(v)
    
    def _type_of_v(self,v):
        for t in self.types:
            try:
                typestr = str(self.eval(t(v)))
                return typestr
            except:
                None
        return ""
    
    def _attr_of_v(self,v):
        ret = dict()
        for a in self.attrs:
            try:
                attrstr = str(self.eval(a(v)))
                if not('(' in attrstr):
                    ret[str(a)] = attrstr
            except:
                None
        return ret
    
    def _attr(self, vstr):
        v = next(n for n in self.vars if str(n)==vstr)
        ret = ''
        for a in self.attrs:
            try:
                attrstr = str(self.eval(a(v)))
                if not('(' in attrstr):
                    ret = ret + '\n' + str(a) + ':' + attrstr
            except:
                None
        return ret
    
    def _shannon(self):
        pop = dict()
        for n, d in self.G.nodes(data = True):
            type = str(d['type'])
            if type in pop:
                pop[type] = pop[type] + 1
            else:
                pop[type] = 1
        n = float(len(pop))
        p = [x / n for k,x in pop.items()]
        shannon = 0 - sum(pi * math.log(pi) for pi in p)
        return shannon
            
            
            