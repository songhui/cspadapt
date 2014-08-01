'''
Created on 12 Nov 2013

@author: fafey
'''

from z3 import *
import networkx as nx
import matplotlib.pyplot as plt


class ResultPainter():
    
    def __init__(self):
        self.vars = []
        self.refs = []
        self.filters = []
        self.types = []
        self.eval = None
        self.G = nx.Graph()
        self.use_filters = False
        
    def make_graph(self):
        
        for v in self.vars:
            if self._filt(v):
                self.G.add_node(str(v))
        all_nodes_str = [str(n) for n in self.G.nodes()] 
        for ref in self.refs:
            for v in self.vars:
                try:
                    tgt = str(self.eval(ref(v)))
                    if tgt in all_nodes_str:
                        self.G.add_edge(str(v), tgt)
                except Z3Exception:
                    None
        
        pos=nx.spring_layout(self.G)
        label = dict((n, str(n)+':'+self._typeOf(n)) for n in self.G.nodes()) 
        plt.ion()
        nx.draw(self.G, pos=pos, with_lables=True, node_size=5000)
        nx.draw_networkx_labels(self.G, pos, label)
        plt.show(block=True)   
    
    def _filt(self, v):  
        if len(self.filters)==0: 
            return True 
        if not self.use_filters: 
            return True
        keep = False
        for filter in self.filters:
            try:
                tgt = str(self.eval(filter(v)))
                if tgt == 'True': keep = True
            except:
                None
        return keep
    
    def _typeOf(self, vstr):
        v = next(n for n in self.vars if str(n)==vstr)
        for t in self.types:
            try:
                typestr = str(self.eval(t(v)))
                return typestr
            except:
                None
        return ""