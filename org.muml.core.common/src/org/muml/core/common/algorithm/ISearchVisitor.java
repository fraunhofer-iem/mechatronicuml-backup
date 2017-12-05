package org.muml.core.common.algorithm;

import java.util.Collection;

/**
 * A Visitor that does something with a node and knows about the edges of a
 * node.
 * 
 * @author bingo
 * 
 */
public interface ISearchVisitor<T> {

	/**
	 * Visits the given node.
	 * 
	 * @param node
	 *            the node being visited
	 * @return <code>true</code> if the search should go on normally. A concrete
	 *         algorithm decides what to do, if <code>false</code> is returned.
	 */
	boolean visit(T node);

	/**
	 * Returns the list of adjacent nodes. This is used to traverse the graph.
	 * 
	 * @param node
	 *            The node in question.
	 * @return The adjacent nodes for this node.
	 */
	Collection<T> getAdjacentNodes(T node);
}
