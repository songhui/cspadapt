import networkx as nx
import matplotlib.pyplot as plt

G=nx.Graph()

G.add_node('a', name='a', color='blue')
pos=nx.spring_layout(G)
#G.add_edge('b','c')
#G.add_edge('a','c')

label=dict((n,d['name']) for n,d in G.nodes(data=True))
print label
plt.ion()
nx.draw(G, with_lables=True, node_size=1000)
nx.draw_networkx_labels(G, pos, label)
plt.show(block=True)