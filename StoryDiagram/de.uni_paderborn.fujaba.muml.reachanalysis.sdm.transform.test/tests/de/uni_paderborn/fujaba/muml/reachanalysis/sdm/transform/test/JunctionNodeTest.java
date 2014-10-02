package de.uni_paderborn.fujaba.muml.reachanalysis.sdm.transform.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashSet;

import org.eclipse.emf.ecore.EClass;
import org.junit.Test;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.activities.EdgeGuard;
import org.storydriven.storydiagrams.activities.InitialNode;
import org.storydriven.storydiagrams.activities.JunctionNode;
import org.storydriven.storydiagrams.activities.ModifyingStoryNode;
import org.storydriven.storydiagrams.patterns.AbstractVariable;

public class JunctionNodeTest extends TransformationTest {

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
		
		assertTrue(edge.getTarget() instanceof JunctionNode);
		
		JunctionNode junctionNode = (JunctionNode) edge.getTarget();
		
		for(ActivityEdge junctionNodeEdge : junctionNode.getOutgoings())
		{
			assertTrue(junctionNodeEdge.getGuard() == EdgeGuard.BOOL);
			
			ActivityNode node = junctionNodeEdge.getTarget();
			assertTrue(node.getOutgoings().size() == 1);
			edge = node.getOutgoings().get(0);
			assertTrue(edge.getTarget() == initialNode.getOutgoings().get(0).getTarget());

			if(((TextualExpression) junctionNodeEdge.getGuardExpression()).getExpressionText().equals("cond1"))
			{
				assertTrue(node.getName().equals("node2"));
			}
			else if(((TextualExpression) junctionNodeEdge.getGuardExpression()).getExpressionText().equals("cond2"))
			{
				assertTrue(node.getName().equals("node3"));
			}
			else
				fail("Wrong or missing guard expression:" + junctionNodeEdge.getGuardExpression());
			
		}

	}

	@Override
	protected String getRuleName() {
		return "JunctionNode.sdm";
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
