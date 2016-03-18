package de.uni_paderborn.fujaba.modelica.graphviz.layout;


public interface IAnnotator<V extends INode, E extends IEdge> {
	public void annotate(IGraphData<V, E> graphData, double scale, double width, double height);
	public void annotate(V node, IPoint position, double xsize, double ysize);
	public void annotate(E edge, IPoint[] points);
}
