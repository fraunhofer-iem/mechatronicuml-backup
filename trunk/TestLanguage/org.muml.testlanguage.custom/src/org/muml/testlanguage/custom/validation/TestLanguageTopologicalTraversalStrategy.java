package org.muml.testlanguage.custom.validation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.service.AbstractTraversalStrategy;
import org.muml.testlanguage.Input;
import org.muml.testlanguage.Node;
import org.muml.testlanguage.Output;
import org.muml.testlanguage.TestCase;

public class TestLanguageTopologicalTraversalStrategy extends
		AbstractTraversalStrategy {

	private ArrayList<LinkedList<Node>> dependencyGraph = null;

	private Set<EObject> excluded = null;
	
	public TestLanguageTopologicalTraversalStrategy() {
		super();
	}

	private void computeDependencyGraph(TestCase testCase) {

		// Create a fresh dependency graph. Unfortunately, because of Eclipse
		// handling of instances of this class, caching is not possible.
		// TODO: Maybe do the caching based on calls of startTraversal?
		this.dependencyGraph = new ArrayList<LinkedList<Node>>();

		// Initialize the helper hash map to find nodes without predecessors.
		// Hack: Instead of using immutable Integer class for the value part, I
		// use a one-dimensional array of int with only one entry because I need
		// to change the value later.
		HashMap<Node, int[]> predecessorCount = new HashMap<Node, int[]>();
		for (Node node : testCase.getNodes()) {
			int count = 0;
			for (Input input : node.getInputs()) {
				if (input.getSource() != null) {
					count++;
				}
			}
			predecessorCount.put(node, new int[] { count });
		}

		// Build the topological ordering level for level.
		boolean cycleDetected = false;
		while (!predecessorCount.isEmpty() && !cycleDetected) {
			LinkedList<Node> level = new LinkedList<Node>();
			Iterator<Entry<Node, int[]>> iterator = predecessorCount.entrySet()
					.iterator();
			while (iterator.hasNext()) {
				Map.Entry<Node, int[]> pairs = (Map.Entry<Node, int[]>) iterator
						.next();

				if (pairs.getValue()[0] == 0) {
					level.add(pairs.getKey());
					iterator.remove();
				}
			}

			for (Node node : level) {
				for (Output output : node.getOutputs()) {
					for (Input input : output.getTargets()) {
						if (!predecessorCount.containsKey(input.getNode())) {
							cycleDetected = true;
						} else {
							predecessorCount.get(input.getNode())[0]--;
						}
					}
				}
			}

			if (level.size() == 0) {
				cycleDetected = true;
			} else if (!cycleDetected) {
				this.dependencyGraph.add(level);
			}
		}

		// The remaining nodes are parts of cycles. To allow the
		// validation of constraints even on those nodes, the are added
		// as a last level although this is slightly against the
		// definition of a topological ordering.
		if (cycleDetected && predecessorCount.size() > 0) {
			this.dependencyGraph.add(new LinkedList<Node>(predecessorCount
					.keySet()));
		}
	}

	/**
	 * Returns the test case that corresponds to the given traversal roots. As
	 * the semantics of a test case are quite special, a few assertions are
	 * made:
	 * <ul>
	 * <li>If more than one traversal root is given, only the first one is
	 * considered.</li>
	 * <li>If the given traversal root is not of type TestCase, the containment
	 * tree is searched for the containing TestCase. It does not make sense to
	 * execute isolated nodes as they depend on one another.</li>
	 * <ul>
	 * 
	 * @param traversalRoots
	 *            The set of traversal roots.
	 * @return The first traversal root cast to TestCase or the containing
	 *         TestCase.
	 */
	private TestCase getTestCase(Collection<? extends EObject> traversalRoots) {

		// Get the first traversal root.
		EObject obj = traversalRoots.iterator().next();

		// Walk up the containment hierarchy until a TestCase is found.
		while (!(obj instanceof TestCase)) {
			obj = obj.eContainer();
		}

		// Return the TestCase.
		return (TestCase) obj;
	}

	@Override
	public void elementValidated(EObject element, IStatus status) {
		super.elementValidated(element, status);

		// Check if we have to skip some objects, i.e. when an input port did
		// not validate (it makes no sense to validate the Node itself then.
		if (element instanceof Input) {
			if (!status.isOK()) {
				Node node = ((Input) element).getNode();
				this.excluded.add(node);
				if (node.getOutputCache() != null)
					node.getOutputCache().clear();
				super.elementValidated(element, Status.OK_STATUS);
			}
		}
	}

	@Override
	protected int countElements(Collection<? extends EObject> traversalRoots) {
		this.computeDependencyGraph(this.getTestCase(traversalRoots));

		int count = 0;
		for (LinkedList<Node> list : this.dependencyGraph) {
			for (Node node : list) {
				count += 1 + node.getOutputs().size() + node.getInputs().size();
			}
		}

		return count;
	}

	@Override
	protected Iterator<? extends EObject> createIterator(
			Collection<? extends EObject> traversalRoots) {

		this.computeDependencyGraph(this.getTestCase(traversalRoots));
		
		this.excluded = new HashSet<EObject>();

		// Create the iterator over the dependency graph.
		return new Iterator<EObject>() {

			private Iterator<LinkedList<Node>> outer = TestLanguageTopologicalTraversalStrategy.this.dependencyGraph
					.iterator();
			private Iterator<Node> inner = null;
			private Iterator<Input> inputs = null;
			private Iterator<Output> outputs = null;

			private Node currentNode = null;
			private boolean didAlreadyOutputNode = false;

			private EObject nextObject = null;

			private boolean obtainNextObject() {

				// If we don't currently have a node to work on, try to find
				// one.
				if (this.currentNode == null) {

					// Find the next inner iterator that has nodes.
					while (this.inner == null || !this.inner.hasNext()) {
						// If the outer iterator has no list remaining, there is
						// no next element.
						if (!this.outer.hasNext()) {
							this.nextObject = null;
							return false;
						}

						// Get the next inner list.
						this.inner = this.outer.next().iterator();
					}

					// Obtain the next node.
					this.currentNode = this.inner.next();
					this.inputs = this.currentNode.getInputs().iterator();
					this.outputs = this.currentNode.getOutputs().iterator();
				}

				// First, return all the inputs.
				if (this.inputs.hasNext()) {
					this.nextObject = this.inputs.next();
					return true;
				}

				// Then, return the node itself.
				if (!this.didAlreadyOutputNode) {
					this.didAlreadyOutputNode = true;
					this.nextObject = this.currentNode;
					return true;
				}

				// Otherwise, return the outputs.
				if (this.outputs.hasNext()) {
					this.nextObject = this.outputs.next();
					return true;
				}

				// If we get down to here, then the node was obviously
				// finished. Do a recursive call to find the next one.
				this.currentNode = null;
				this.didAlreadyOutputNode = false;
				return this.obtainNextObject();
			}

			@Override
			public boolean hasNext() {
				// Just check if we are able to obtain the next object and
				// return true/false accordingly.
				boolean result = true;
				while (result == true
						&& (this.nextObject == null || TestLanguageTopologicalTraversalStrategy.this.excluded
								.contains(this.nextObject))) {
					result = (this.obtainNextObject());
				}
				return result;
			}

			@Override
			public EObject next() {
				// If the user called next() without calling hasNext() before,
				// we have to call it manually. In the case no next element
				// exists an exception is thrown.
				if (this.nextObject == null) {
					if (!this.hasNext()) {
						throw new NoSuchElementException();
					}
				}

				// Return the next object and "forget" it by setting it to null.
				EObject out = this.nextObject;
				this.nextObject = null;
				return out;
			}

			@Override
			public void remove() {
				// Not implemented.
			}

		};
	}
}
