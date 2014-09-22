'''
Created on 12 Nov 2013

@author: fafey
'''

from z3 import *
import networkx as nx
try:
    import matplotlib.pyplot as plt
except:
    print "no matplot"
import math
import random


class ResultPainter():
    
    def __init__(self):
        self.vars = []
        self.refs = []
        self.multi_refs = []
        self.filters = []
        self.types = []
        self.attrs = []
        self.toprint = ''
        self.eval = None
        self.G = nx.DiGraph()
        self.use_filters = False
        self._colors = ['#00CC99', '#33CCFF', '#FF9999', '#00FF00', '#FF99FF', 
                        '#6699CC', '#bbee88', '#CC99FF',  '#CC9933',  '#FFFF00', '#66CC00',
                        '#00FF99', '#66CCCC',  '#CCCC66','#FF00FF', '#22FFEE', '#AACCAA',
                        '#44EE99', '#EEEE33', '#7711BB', '#5599CC']
        
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
                    
        for ref in self.multi_refs:
            for v1 in using_vars:
                for v2 in using_vars:
                    try:
                        if str(self.eval(ref(v1,v2)))=='True':
                            self.G.add_edge(str(v1), str(v2), {'style':'dashed'})
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
            #print ">>>>%s" % self._colors[ci%len(self._colors)]
            nx.draw_networkx_nodes(self.G, pos, nodelist= ns, node_size = 5000, node_color = self._colors[ci%len(self._colors)])
            ci = ci+1
        #nx.draw(self.G, pos=pos, with_lables=True, node_size=5000)
        nx.draw_networkx_labels(self.G, pos, label)
        nx.draw_networkx_edges(self.G, pos, self.G.edges())
        
        G2 = nx.Graph()
        G2.add_node('toprint')
        nx.draw_networkx_labels(G2, {'toprint':[-0., -0.1]}, {'toprint':'total: %d\n shannon:%.2f\n%s'%(len(self.G), self._shannon(),self.toprint)})
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
                if not('(' in typestr):
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
        total = 0;
        for n, d in self.G.nodes(data = True):
            type = str(d['type'])
            if type in pop:
                pop[type] = pop[type] + 1
            else:
                pop[type] = 1
            total = total + 1
        n = float(total)
        p = [x / n for k,x in pop.items()]
        shannon = 0 - sum(pi * math.log(pi) for pi in p)
        return shannon
            
    def _shannon_without_show(self, topology=None):
        if topology:
            self.eval = topology
        self.G.clear()
        using_vars = [v for v in self.vars if self._filt(v)]
        for v in using_vars:
            type = self._type_of_v(v)
            attrs = dict()
            attrs['type'] = type
            self.G.add_node(str(v),attrs)         
        return (len(self.G), self._shannon())  
    
     