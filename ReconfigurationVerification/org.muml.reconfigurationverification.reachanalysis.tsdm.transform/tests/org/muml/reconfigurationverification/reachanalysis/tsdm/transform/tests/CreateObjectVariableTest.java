package org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashSet;

import javax.naming.Binding;

import org.eclipse.emf.ecore.EClass;
import org.junit.Test;
import org.muml.reconfigurationverification.timedstorydiagram.TimedActivityNode;
import org.muml.reconfigurationverification.timedstorydiagram.TimedStoryDiagram;
import org.muml.storydiagram.activities.ActivityEdge;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.activities.InitialNode;
import org.muml.storydiagram.patterns.AbstractLinkVariable;
import org.muml.storydiagram.patterns.AbstractVariable;
import org.muml.storydiagram.patterns.BindingOperator;
import org.muml.storydiagram.patterns.ObjectVariable;

public class CreateObjectVariableTest extends TransformationTest {

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
		
		// check the transformation of the object variables
		
		ActivityNode forEachNode = initialNode.getOutgoings().get(0).getTarget();
		checkTransformationOfObjectVariables(forEachNode);

	}





	@Override
	protected String getRuleName() {
		return "CreateObjectVariable.timedstorydiagram";
	}



	@Override
	protected void checkPortObject(AbstractVariable port) {
		fail("Port has BindingOperator CREATE and should not be included in the ForEachNode");
	}





	@Override
	protected void checkRestoreMatchingNodeContents(
			TimedActivityNode restoreMatchingNode) {
		
		assertTrue(restoreMatchingNode.getOwnedRule().getVariables().size() == 6);
		
		for (AbstractVariable var : restoreMatchingNode.getOwnedRule().getVariables()) {
			ObjectVariable objVar = ((ObjectVariable) var);
			
			
			
			if(objVar.getName().equals("comp_entry"))
			{
				assertTrue(objVar.getOutgoingLinks().size() == 2);
				for(AbstractLinkVariable link : objVar.getOutgoingLinks()) {
					assertTrue(link.getTarget().getName().equals("comp") 
							|| link.getTarget().getName().equals("comp_succ"));
				}
			}
			
			if(objVar.getName().equals("trans"))
			{
				assertTrue(objVar.getOutgoingLinks().size() == 1);
				assertTrue(objVar.getOutgoingLinks().get(0).getTarget().getName().equals("comp_entry"));
			}
			
			if(objVar.getName().equals("succ"))
			{
				assertTrue(objVar.getOutgoingLinks().size() == 1);
				assertTrue(objVar.getOutgoingLinks().get(0).getTarget().getName().equals("p_succ"));
				assertTrue(objVar.getOutgoingLinks().get(0).getBindingOperator() == BindingOperator.CREATE);
			}

			if(objVar.getName().equals("p_succ"))
			{
				assertTrue(objVar.getBindingOperator() == BindingOperator.CREATE);
			}
		}
	}

}
