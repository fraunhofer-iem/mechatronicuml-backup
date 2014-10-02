package de.uni_paderborn.fujaba.muml.reachanalysis.tsdm.transform.tests;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;

import org.eclipse.emf.ecore.EClass;
import org.junit.Test;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.activities.InitialNode;
import org.storydriven.storydiagrams.patterns.AbstractVariable;

import de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedActivityNode;
import de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedStoryDiagram;

public class OneEmptyNodeTest extends TransformationTest {
	

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
		
		// check if the ActivityNode was transformed correctly
		ActivityNode restoreMatchingNode = checkOneNodeTransformed(initialNode);

		assertTrue(restoreMatchingNode.getOutgoings().size() == 1);

		ActivityEdge edge = restoreMatchingNode.getOutgoings().get(0);
		
		assertTrue(edge.getTarget() == initialNode.getOutgoings().get(0).getTarget());
	}

	@Override
	protected String getRuleName() {
		return "OneEmptyNode.timedstorydiagram";
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
