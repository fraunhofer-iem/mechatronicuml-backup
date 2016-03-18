package de.uni_paderborn.fujaba.modelica.graphviz.layout;


public interface IGraphDataProvider<V extends INode, E extends IEdge> {
	public IGraphData<V, E> getGraphData();
}
