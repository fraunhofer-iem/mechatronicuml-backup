package de.uni_paderborn.fujaba.modelica.graphviz.layout;

import java.util.ArrayList;
import java.util.List;


public abstract class AbstractGraphData<V extends INode, E extends IEdge> implements IGraphData<V, E> {
	private List<V> nodeList = new ArrayList<V>();
	private List<E> edgeList = new ArrayList<E>();
	
	public V getNode(String id) {
		for (V node : nodeList) {
			if (node.getId().equals(id)) {
				return node;
			}
		}
		return null;
	}
	
	protected void addNode(V node) {
		nodeList.add(node);
	}
	
	protected void addEdge(E edge) {
		edgeList.add(edge);
	}
	
	@Override
	public E getEdge(V source, V target) {
		for (E edge : edgeList) {
			if (edge.getSource() == source && edge.getTarget() == target) {
				return edge;
			}
		}
		return null;
	}

	@Override
	public List<V> getNodes() {
		return nodeList;
	}

	@Override
	public List<E> getEdges() {
		return edgeList;
	}

}
