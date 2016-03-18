package de.uni_paderborn.fujaba.modelica.graphviz.layout;

public interface IEdge {
	public INode getSource();
	public INode getTarget();
	public EdgePort getHeadPort();
	public EdgePort getTailPort();
}
