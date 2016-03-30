package org.muml.storydiagram.reachanalysis.sdm.transform.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashSet;

import org.eclipse.emf.ecore.EClass;
import org.junit.Test;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.activities.ActivityEdge;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.activities.EdgeGuard;
import org.muml.storydiagram.activities.InitialNode;
import org.muml.storydiagram.activities.ModifyingStoryNode;
import org.muml.storydiagram.patterns.AbstractVariable;

public class SuccessFailureEdgesTest extends TransformationTest {

	@Test
	public void test() {
		// no unchangeable nodes
		this.setClassesOfUnchangeableNodes(new HashSet<EClass>());
		// transform the tgts
		gts = this.createForEachRules(gts);

		// chech the result
		// still only one rule
		assertTrue(gts.getActivities().size() == 1);

		Activity activity = gts.getActivities().get(0);
		
		// search the initial node
		InitialNode initialNode = null;
		for(ActivityNode node : activity.getOwnedActivityNodes())
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
		return "SuccessFailureEdges.sdm";
	}

	@Override
	protected void checkPortObject(AbstractVariable port) {
		// no object variables
	}

	@Override
	protected void checkRestoreMatchingNodeContents(
			ModifyingStoryNode restoreMatchingNode) {
		// TODO Auto-generated method stub
		
	}

}
