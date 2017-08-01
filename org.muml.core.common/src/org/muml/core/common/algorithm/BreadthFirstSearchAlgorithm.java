package org.muml.core.common.algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * A BFS-Search algorithm for graphs.
 * 
 * @author bingo
 *
 */
public class BreadthFirstSearchAlgorithm<T> implements ISearchAlgorithm<T> {

	/**
	 * Starts a BFS-Search in the graph starting at startNode.
	 * 
	 * @param startNode
	 *            the node to start.
	 * @param searchVisitor
	 *            the visitor that does something with every node and also knows
	 *            about the edges of the graph. If the visitor returns
	 *            <code>false</code> in its visit() method, the search is
	 *            stopped and considered successful.
	 * @return <code>true</code>, if the node has been found.
	 */
	public boolean search(T startNode, ISearchVisitor<T> searchVisitor) {
		List<T> visited = new ArrayList<T>();
		Queue<T> unvisited = new LinkedList<T>();
		unvisited.add(startNode);
		while (!unvisited.isEmpty()) {
			T current = unvisited.poll();
			if (!visited.contains(current)) {
				boolean continueSearch = searchVisitor.visit(current);
				if (!continueSearch) {
					return true;
				}
				Collection<T> adjacentNodes = searchVisitor
						.getAdjacentNodes(current);
				unvisited.addAll(adjacentNodes);
				visited.add(current);
			}
		}
		return false;
	}
}
