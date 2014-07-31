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
        self.eval = None
        self.G = nx.Graph()
        
    def make_graph(self):
        for v in self.vars:
            self.G.add_node(str(v))
        for ref in self.refs:
            for v in self.vars:
                try:
                    tgt = self.eval(ref(v))
                    self.G.add_edge(str(v), str(tgt))
                except Z3Exception:
                    None
         
        pos=nx.spring_layout(self.G)
        label = dict((n, str(n)) for n in self.G.nodes()) 
        plt.ion()
        nx.draw(self.G, with_lables=True, node_size=1000)
        nx.draw_networkx_labels(self.G, pos, label)
        plt.show(block=True)   
        
        
    