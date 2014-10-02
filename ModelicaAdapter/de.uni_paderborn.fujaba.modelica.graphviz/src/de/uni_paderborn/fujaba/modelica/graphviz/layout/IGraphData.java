package de.uni_paderborn.fujaba.modelica.graphviz.layout;

import java.util.List;

public interface IGraphData<V extends INode, E extends IEdge> {
	public String getId();
	public V getNode(String id);
	public E getEdge(V source, V target);
	public List<V> getNodes();
	public List<E> getEdges();
}
