package de.uni_paderborn.fujaba.modelica.m2t.rtsc.layout;

import de.uni_paderborn.fujaba.modelica.graphviz.layout.INode;
import de.uni_paderborn.fujaba.modelica.graphviz.layout.IPoint;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex;

public class Node implements INode {
	private Vertex vertex;
	
	public Node(Vertex vertex) {
		this.vertex = vertex;
	}

	@Override
	public String getId() {
		return vertex.getName();
	}
	
	public Vertex getVertex() {
		return vertex;
	}

}

class PseudoNode extends Node {
	private String id;
	private IPoint position;
	private double xsize;
	private double ysize;
	
	public PseudoNode(String id) {
		super(null);
		this.id = id;
	}

	@Override
	public String getId() {
		return id;
	}

	public IPoint getPosition() {
		return position;
	}

	public void setPosition(IPoint position) {
		this.position = position;
	}

	public double getXsize() {
		return xsize;
	}

	public void setXsize(double xsize) {
		this.xsize = xsize;
	}

	public double getYsize() {
		return ysize;
	}

	public void setYsize(double ysize) {
		this.ysize = ysize;
	}
	
}
