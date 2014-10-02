package de.uni_paderborn.fujaba.modelica.graphviz.layout;


public interface ILayouter<V extends INode, E extends IEdge> {
	public void layout(IGraphDataProvider<V, E> graphDataProvider, IAnnotator<V, E> annotator);
}
