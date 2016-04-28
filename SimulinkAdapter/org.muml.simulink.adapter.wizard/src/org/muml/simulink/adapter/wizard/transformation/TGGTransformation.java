package org.muml.simulink.adapter.wizard.transformation;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.muml.mumlcore.modelinstance.RootNode;
import org.muml.simulink.SimulinkContainer;

import de.upb.swt.qvt.qvtbase.TypedModel;
import de.upb.swt.qvt.tgg.TripleGraphGrammar;
import de.upb.swt.qvt.tgg.TripleGraphGrammarRule;
import de.upb.swt.qvt.tgg.interpreter.Interpreter;
import de.upb.swt.qvt.tgg.interpreter.InterpreterPackage;
import de.upb.swt.qvt.tgg.interpreterconfiguration.ApplicationMode;
import de.upb.swt.qvt.tgg.interpreterconfiguration.ApplicationScenario;
import de.upb.swt.qvt.tgg.interpreterconfiguration.Configuration;
import de.upb.swt.qvt.tgg.interpreterconfiguration.DomainModel;
import de.upb.swt.qvt.tgg.interpreterconfiguration.InterpreterconfigurationFactory;
import de.upb.swt.qvt.tgg.interpreterconfiguration.util.InterpreterconfigurationUtil;

public class TGGTransformation {
	
	protected int numberOfAppliedRules = 0;
	
	protected int numberOfUnsuccessfullyAppliedRules = 0;
	
	/**
	 * Transforms the given MechatronicUML model to a MATLAB/Simulink model
	 */
	public SimulinkContainer transform(RootNode source, IProgressMonitor monitor)
	{
		ResourceSet resourceSet = new ResourceSetImpl();
		
		//open TGG
		TripleGraphGrammar tgg = getTGGTransformationFromResource(resourceSet);
		
		Configuration configuration = this.buildConfiguration(tgg, source);
		
		File tmp = null;
		try {
			tmp = File.createTempFile("tgg", "interpreterconfiguration");
		} catch (IOException e) {
			//
		}
		tmp.deleteOnExit();
		
		Resource interpreterConfigurationResource = resourceSet.createResource(URI.createFileURI(tmp.getAbsolutePath()));
		interpreterConfigurationResource.getContents().add(configuration);
		
		
		Interpreter interpreter = InterpreterPackage.eINSTANCE.getInterpreterFactory().createInterpreter();
		interpreter.setConfiguration(configuration);
		interpreter.initializeConfiguration();
		
		interpreter.getTransformationProcessor().performTransformation(monitor);

		SimulinkContainer retval = null;
		retval = (SimulinkContainer) configuration.getActiveApplicationScenario().getTargetDomainModel().get(0).getResource().get(0).getContents().get(0);
		
		//gather statistics
		numberOfUnsuccessfullyAppliedRules = interpreter.getTransformationProcessor().getUnsuccessfulRuleApplicationAttempts();
		for(Map.Entry<TripleGraphGrammarRule, Integer> entry : interpreter.getTransformationProcessor().getRulesApplied().entrySet()){
			numberOfAppliedRules = numberOfAppliedRules + entry.getValue();
		}
		
		return retval;

	}
	
	protected Configuration buildConfiguration(TripleGraphGrammar tgg, RootNode source)
	{
		//1. Set TGG
		Configuration configuration = InterpreterconfigurationFactory.eINSTANCE.createConfiguration();		
		configuration.setTripleGraphGrammar(tgg);
		
		// 2. Create source domain model
		DomainModel sourceDomainModel = InterpreterconfigurationFactory.eINSTANCE.createDomainModel();
		// find correct typed model from the tgg
		for (TypedModel typedModel : tgg.getAllModelParameters()) {
			for (EPackage ePackage : typedModel.getUsedPackage()) {
				if (ePackage.equals(source.eClass().getEPackage()))
					sourceDomainModel.setTypedModel(typedModel);
			}			
		}
		if (sourceDomainModel.getTypedModel() == null) 
			throw new IllegalArgumentException("The TGG does not contain any typed model that fits the root object of the selected source model");
		// add typed model
		configuration.getDomainModel().add(sourceDomainModel);
	
		// add root object
		sourceDomainModel.getRootObject().add(source);
		
		
		
		// 3. Create correspondence domain model
		TypedModel correspondenceTypedModel = null;		
		
		for(TypedModel tm : tgg.getModelParameter())
			if(tm.getName().equals("fujaba2simulink"))
				correspondenceTypedModel = tm;
		
		if (correspondenceTypedModel == null) 
			throw new IllegalArgumentException("CorrespondenceTypedModel fujaba2simulink not found.");		
		
		DomainModel correspondenceDomainModel = InterpreterconfigurationFactory.eINSTANCE.createDomainModel();
		correspondenceDomainModel.setTypedModel(correspondenceTypedModel);
		configuration.getDomainModel().add(correspondenceDomainModel);
		// relative path: 
		correspondenceDomainModel.getResourceURI().add("fujaba.corr.xmi");		
		
		// 4. Create target domain model
		DomainModel targetDomainModel = InterpreterconfigurationFactory.eINSTANCE.createDomainModel();
		// find correct typed model from the tgg
		for (TypedModel typedModel : tgg.getAllModelParameters()) {
			if (!typedModel.equals(sourceDomainModel.getTypedModel()) && !typedModel.equals(correspondenceDomainModel.getTypedModel())){
				targetDomainModel.setTypedModel(typedModel);
			}
		}
		configuration.getDomainModel().add(targetDomainModel);
		String targetModelSuffix = targetDomainModel.getTypedModel().getUsedPackage().get(0).getName();
		// relative path: 
		targetDomainModel.getResourceURI().add("fujaba."+targetModelSuffix);		
		
		
		ApplicationScenario scenario = InterpreterconfigurationFactory.eINSTANCE.createApplicationScenario();
		scenario.getSourceDomainModel().add(sourceDomainModel);
		scenario.getCorrespondenceModel().add(correspondenceDomainModel);
		scenario.getTargetDomainModel().add(targetDomainModel);
		scenario.setName("fwd");
		scenario.setMode(ApplicationMode.TRANSFORM);
		scenario.setDeactivateFront(true);
		configuration.getApplicationScenario().add(scenario);
		configuration.setActiveApplicationScenario(scenario);
				
		return configuration;
	}
	
	/**
	 * Opens the Fujaba2Simulink TripleGraphGrammar from the file.
	 * @param resourceSet
	 * @return
	 */
	protected TripleGraphGrammar getTGGTransformationFromResource(ResourceSet resourceSet){
		TripleGraphGrammar tgg = null;
		// If the .tgg-files are in the runtime-Workspace (for developers)
		try{
			tgg = InterpreterconfigurationUtil.loadAndInitTripleGraphGrammar(URI.createPlatformResourceURI("/org.muml.simulink.adapter.reconfiguration.m2m/tgg/fujaba2simulink.tgg",true), resourceSet);
		}
		// else
		catch(Exception e){
			tgg = InterpreterconfigurationUtil.loadAndInitTripleGraphGrammar(URI.createPlatformPluginURI("org.muml.simulink.adapter.reconfiguration.m2m/tgg/fujaba2simulink.tgg",true), resourceSet);
		}
		
		return tgg;
	}

	public int getNumberOfAppliedRules() {
		return numberOfAppliedRules;
	}

	public int getNumberOfUnsuccessfullyAppliedRules() {
		return numberOfUnsuccessfullyAppliedRules;
	}
}
