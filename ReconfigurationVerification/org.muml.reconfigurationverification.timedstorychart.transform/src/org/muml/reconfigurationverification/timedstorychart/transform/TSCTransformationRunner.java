package org.muml.reconfigurationverification.timedstorychart.transform;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.muml.pim.connector.Connector;
import org.muml.pim.connector.ConnectorEndpoint;
import org.muml.pim.connector.DiscreteInteractionEndpoint;
import org.muml.pim.protocol.RoleConnector;
import org.muml.pim.realtimestatechart.SynchronizationChannel;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.reconfigurationverification.timedstorychart.transform.helper.HelperFactory;
import org.muml.reconfigurationverification.timedstorychart.transform.helper.TSCTransformationInput;
import org.muml.reconfigurationverification.timedstorychart.transform.helper.TSCTransformationOutput;
import org.muml.reconfigurationverification.timedstorychart.transform.helper.TransitionTuple;
import org.muml.reconfigurationverification.timedstorydiagram.TimedGraphTransformationSystem;

public class TSCTransformationRunner {
	
	private static final String PRETRANSFORMATION_PATH = "/de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform/transforms/CopyAndPreTransformation.qvto";
	private static final String RTSC2RULETRANSFORMATION_PATH = "/de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform/transforms/RTSC2RuleTransformation.qvto";
	
	private TimedGraphTransformationSystem tgts;

	public boolean execute(Connector connector) {	
		// perform the pre-transformation
		Connector preTransformedConnector = preTransformation(connector);
		
		// Analyze synchronizing transitions
		TransitionAnalysis transitionAnalysis = new TransitionAnalysis();
		HashMap<SynchronizationChannel, HashSet<TransitionTuple>>  syncPairs = new HashMap<SynchronizationChannel, HashSet<TransitionTuple>>();
		HashSet<Transition> noSyncTransitions = new HashSet<Transition>();
		// compute pairs of transitions that may synchronize for each ConnectorEnd
		for(ConnectorEndpoint endpoint : preTransformedConnector.getConnectorEndpoints()) {
			syncPairs.putAll(transitionAnalysis.computeSyncPairs((DiscreteInteractionEndpoint) endpoint));
			noSyncTransitions.addAll(transitionAnalysis.getNoSyncTransitions());
		}
		
		// prepare the input for the transformation
		TSCTransformationInput transformationInput = HelperFactory.eINSTANCE.createTSCTransformationInput();
		transformationInput.setConnector(preTransformedConnector);
		for(HashSet<TransitionTuple> syncPairSet: syncPairs.values()) {
			transformationInput.getSyncTransitionTuples().addAll(syncPairSet);	
		}
		transformationInput.getNoSyncTransitions().addAll(noSyncTransitions);
		
		// perform the RTSC2Rule transformation (Steps 3-4, 6-8)
		// input: TSCTransformationInput containing
		//                               a CoordinationPattern
		//                               transformationTuples for all transitions that may synchronize
		tgts = (TimedGraphTransformationSystem) performTransformation(RTSC2RULETRANSFORMATION_PATH, transformationInput);
		
		GraphObjectsInitializer initializer = new GraphObjectsInitializer();
		if(connector instanceof RoleConnector){
			initializer.createRoleInstances((RoleConnector) preTransformedConnector, tgts);
		}
		else{
			//TODO other connectors / abstract graph object initialization
		}
		
		return tgts != null;
	}

	private Connector preTransformation(Connector connector) {
		TSCTransformationInput transformationInput = HelperFactory.eINSTANCE.createTSCTransformationInput();
		transformationInput.setConnector(connector);
		Connector preTransformedRtcp = (Connector) performTransformation(PRETRANSFORMATION_PATH, transformationInput);
		return preTransformedRtcp;
	}

	private EObject performTransformation(String path, TSCTransformationInput transformationInput) {
		// create URI for the transformation file
		URI transformationURI = URI
				.createPlatformPluginURI(
						path,
						true);
		// create executor and execution context
		TransformationExecutor executor = new TransformationExecutor(
				transformationURI);
		ExecutionContextImpl context = new ExecutionContextImpl();
		
		// create input extend containing the TSCTransformationInput
		// create empty output extend

		List<TSCTransformationInput> inObjects = Arrays.asList(transformationInput);
	
		ModelExtent input = new BasicModelExtent(inObjects);
		ModelExtent output = new BasicModelExtent();
		
	
		// execute transformation
		ExecutionDiagnostic result = executor.execute(context, input, output);
		if (result.getSeverity() != ExecutionDiagnostic.OK){
			String message = "QVT-O ERROR on rule transformation. Message was: "+ System.getProperty("line.separator") + result.getMessage();
			System.out.println(message);
		}

		return handleOutput(output);
	}

	private EObject handleOutput(ModelExtent output) {
		for(EObject curObject : output.getContents()){
			if (curObject instanceof TSCTransformationInput){
				// Only the PreTransformation and Copy transformation were executed.
				// So there is only a CoordinationPattern here since the "output" is still a TSCTransformationInput
				return ((TSCTransformationInput) curObject).getConnector();
			}
			else if (curObject instanceof TSCTransformationOutput){
				return ((TSCTransformationOutput) curObject).getTgts();
			}
		}
		return null;

	}
	
	public TimedGraphTransformationSystem getTgts() {
		return tgts;
	}

	public List<EObject> getInitialGraphObjects() {
		if(tgts != null){
			return tgts.getInitialGraphObjects();
		} else {
			return new ArrayList<EObject>();
		}
	}

}
