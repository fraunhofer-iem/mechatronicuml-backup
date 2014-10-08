package de.uni_paderborn.fujaba.modelica.m2t.rtsc.layout;

import org.storydriven.core.ExtendableElement;

import de.uni_paderborn.fujaba.muml.model.gen.graphviz.layout.EdgePort;
import de.uni_paderborn.fujaba.muml.model.gen.graphviz.layout.IEdge;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Transition;

enum EdgeType {
	STANDARD, MESSAGE, MAILBOX, PSEUDO;
}

public class Edge implements IEdge {
	private ExtendableElement extendableElement;
	private Node source;
	private Node target;
	private EdgeType edgeType;
	private EdgePort headPort;
	private EdgePort tailPort;
	
	public Edge(Transition transition, Node source, Node target) {
		this(transition, source, target, EdgeType.STANDARD, null, null);
	}
	
	public Edge(ExtendableElement extendableElement, Node source, Node target, EdgeType edgeType, EdgePort headPort, EdgePort tailPort) {
		this.extendableElement = extendableElement;
		this.source = source;
		this.target = target;
		this.edgeType = edgeType;
		this.headPort = headPort;
		this.tailPort = tailPort;
	}

	public Node getSource() {
		return source;
	}

	public Node getTarget() {
		return target;
	}
	
	public ExtendableElement getExtendableElement() {
		return extendableElement;
	}
	
	public EdgeType getEdgeType() {
		return edgeType;
	}
	
	
	public EdgePort getHeadPort() {
		return headPort;
	}
	
	public EdgePort getTailPort() {
		return tailPort;
	}
}
