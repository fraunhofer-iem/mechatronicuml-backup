package org.muml.reconfigurationverification.timedstorychart.transform.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.junit.Test;
import org.muml.core.expressions.common.LiteralExpression;
import org.muml.pim.protocol.CoordinationProtocol;
import org.muml.pim.protocol.Role;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.reconfigurationverification.timedstorychart.transform.helper.HelperFactory;
import org.muml.reconfigurationverification.timedstorychart.transform.helper.TSCTransformationInput;

public class CopyInputModelTest extends TSCTransformationTestCase {



	@Test
	public void test() {
		TSCTransformationInput result = (TSCTransformationInput) performTransformation(coordinationProtocol);
		checkResult(result);
	}

	private void checkResult(TSCTransformationInput result) {
		assertTrue(result != null);
		
		coordinationProtocol = (CoordinationProtocol) result.getConnector().eContainer();
		assertTrue(coordinationProtocol != null);
		assertTrue(coordinationProtocol.getName().equals("rtcp1"));
		
		assertTrue(coordinationProtocol.getRoles().size() == 2);
		checkRole(coordinationProtocol.getRoles().get(0));
		checkRole(coordinationProtocol.getRoles().get(0));
		
		assertTrue(coordinationProtocol.getRoleConnector() != null);
		assertTrue(coordinationProtocol.getRoleConnector().getConnectorEndpoints().size()==2);
	}

	private void checkRole(Role role) {
		assertTrue(role.getName().equals("role1") || role.getName().equals("role2"));
		
		assertTrue(role.getCardinality() != null);
		assertTrue(role.getCardinality().getLowerBound().getValue() == 1);
		assertTrue(role.getCardinality().getUpperBound().getValue() == 1);

//		checkRealtimeStatechart((RealtimeStatechart) role.getAdaptationBehavior());
		checkRealtimeStatechart((RealtimeStatechart) role.getBehavior());
	}

	private void checkRealtimeStatechart(RealtimeStatechart rtsc) {
		assertTrue(rtsc != null);
		
		assertTrue(rtsc.getStates().size() == 2);
		for (State state : rtsc.getStates()){
			if(state.isInitial())
				assertTrue(state.getName().equals("state1"));
			else
				assertFalse(state.getName().equals("state1"));
		}
		
		assertTrue(rtsc.getTransitions().size() == 1);
		for(Transition transition : rtsc.getTransitions()){
			assertTrue(transition.getSource() != transition.getTarget());
			assertTrue(transition.getSource().getName().equals("state1")
					|| transition.getSource().getName().equals("state2"));
			assertTrue(transition.getTarget().getName().equals("state1")
					|| transition.getTarget().getName().equals("state2"));
			assertTrue(transition.getRelativeDeadline() != null);
			assertTrue(transition.getRelativeDeadline().getLowerBound().getValue() instanceof LiteralExpression);
			assertTrue(((LiteralExpression)(transition.getRelativeDeadline().getLowerBound().getValue())).getValue().equals("3"));
			assertTrue(transition.getRelativeDeadline().getUpperBound().getValue() instanceof LiteralExpression);
			assertTrue(((LiteralExpression)(transition.getRelativeDeadline().getUpperBound().getValue())).getValue().equals("5"));
			
		}
	}
			

	@Override
	protected void setTransformationPath() {
		transformation_path = "/org.muml.reconfigurationverification.reachanalysis.timedstorychart.transform/transforms/CopyAndPreTransformation.qvto";
	}
	
	public EObject performTransformation(CoordinationProtocol rtcp) {
		// create URI for the transformation file
		URI transformationURI = URI
				.createPlatformPluginURI(
						transformation_path,
						true);
		// create executor and execution context
		TransformationExecutor executor = new TransformationExecutor(
				transformationURI);
		ExecutionContextImpl context = new ExecutionContextImpl();
		
		// create input extend containing the TSCTransformationInput
		TSCTransformationInput transformationInput = HelperFactory.eINSTANCE.createTSCTransformationInput();
		transformationInput.setConnector(rtcp.getRoleConnector());
		List<TSCTransformationInput> inObjects = Arrays.asList(transformationInput);
	
		ModelExtent input = new BasicModelExtent(inObjects);
		ModelExtent output = new BasicModelExtent();
		
		// execute transformation
		ExecutionDiagnostic result = executor.execute(context, input, output);
		if (result.getSeverity() != ExecutionDiagnostic.OK){
			String message = "QVT-O ERROR on rule transformation. Message was: "+ System.getProperty("line.separator") + result.getMessage();
			System.out.println(message);
		}
		

		//get the resulting TSCTransformationInput
		for(EObject curObject : input.getContents()){
			if (curObject instanceof TSCTransformationInput){
				return ((TSCTransformationInput) curObject);
			}
		}
		return null;
		
	}


}
