package org.muml.core.common.algorithm;

/**
 * A search algorithm for graphs that does not know about the edges, but uses an
 * ISearchVisitor to find out the edges of a node.
 * 
 * @author bingo
 * 
 */
public interface ISearchAlgorithm<T> {

	/**
	 * Starts a search in the graph starting at startNode.
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
	boolean search(T startNode, ISearchVisitor<T> searchVisitor);

}
