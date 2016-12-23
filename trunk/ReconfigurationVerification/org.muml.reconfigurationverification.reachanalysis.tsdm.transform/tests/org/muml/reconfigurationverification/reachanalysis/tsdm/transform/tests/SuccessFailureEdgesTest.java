package org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashSet;

import org.eclipse.emf.ecore.EClass;
import org.junit.Test;
import org.muml.reconfigurationverification.timedstorydiagram.TimedActivityNode;
import org.muml.reconfigurationverification.timedstorydiagram.TimedStoryDiagram;
import org.muml.storydiagram.activities.ActivityEdge;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.activities.EdgeGuard;
import org.muml.storydiagram.activities.InitialNode;
import org.muml.storydiagram.patterns.AbstractVariable;

public class SuccessFailureEdgesTest extends TransformationTest {

	@Test
	public void test() {
		// no unchangeable nodes
		this.setClassesOfUnchangeableNodes(new HashSet<EClass>());
		// transform the tgts
		tgts = this.createForEachRules(tgts);

		// chech the result
		// still only one rule
		assertTrue(tgts.getRules().size() == 1);

		TimedStoryDiagram tsd = tgts.getRules().get(0);

		// search the initial node
		InitialNode initialNode = null;
		for(ActivityNode node : tsd.getOwnedActivityNodes())
		{
			if(node instanceof InitialNode)
			{
				initialNode = (InitialNode) node;
			}
		}
		assertTrue(initialNode != null);

		// check if the ActivityNode node1 was transformed correctly
		ActivityNode restoreMatchingNode = checkOneNodeTransformed(initialNode);

		assertTrue(restoreMatchingNode.getOutgoings().size() == 1);

		ActivityEdge edge = restoreMatchingNode.getOutgoings().get(0);

		ActivityNode node2 = edge.getTarget();

		assertTrue(node2.getName().equals("node2"));

		for(ActivityEdge node2Edge : node2.getOutgoings())
		{
			if(node2Edge.getGuard() == EdgeGuard.SUCCESS)
			{
				assertTrue(node2Edge.getTarget() == initialNode.getOutgoings().get(0).getTarget());
			}
			else if(node2Edge.getGuard() == EdgeGuard.FAILURE)
			{
				ActivityNode node3 = node2Edge.getTarget();
				assertTrue(node3.getName().equals("node3"));

				assertTrue(node3.getOutgoings().size() == 1);
				assertTrue(node3.getOutgoings().get(0).getTarget() == initialNode.getOutgoings().get(0).getTarget());
			}
			else
			{
				fail("Wrong edge guard: " + node2Edge.getGuard());
			}
		}
	}

	@Override
	protected String getRuleName() {
		return "SuccessFailureEdges.timedstorydiagram";
	}

	@Override
	protected void checkPortObject(AbstractVariable port) {
		// no object variables
	}

	@Override
	protected void checkRestoreMatchingNodeContents(
			TimedActivityNode restoreMatchingNode) {
		// node is empty
		
	}
}
