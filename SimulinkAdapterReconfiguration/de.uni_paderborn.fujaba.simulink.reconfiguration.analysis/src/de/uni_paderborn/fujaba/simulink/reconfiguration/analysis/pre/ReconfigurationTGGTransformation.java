package de.uni_paderborn.fujaba.simulink.reconfiguration.analysis.pre;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.uni_paderborn.fujaba.simulink.wizard.transformation.TGGTransformation;
import de.upb.swt.qvt.tgg.TripleGraphGrammar;
import de.upb.swt.qvt.tgg.interpreterconfiguration.util.InterpreterconfigurationUtil;

public class ReconfigurationTGGTransformation extends TGGTransformation{

	
	/**
	 * Opens the Fujaba2Simulink TripleGraphGrammar from the file.
	 * @param resourceSet
	 * @return
	 */
	@Override
	protected TripleGraphGrammar getTGGTransformationFromResource(ResourceSet resourceSet){
		TripleGraphGrammar basicTransformation = super.getTGGTransformationFromResource(resourceSet);
		
		TripleGraphGrammar reconfTransformation = null;
		
		// If the .tgg-files are in the runtime-Workspace (for developers)
		try{
			reconfTransformation = InterpreterconfigurationUtil.loadAndInitTripleGraphGrammar(URI.createPlatformResourceURI("/de.uni_paderborn.fujaba.simulink.reconfiguration.m2m/tgg/SimulinkReconfiguration.tgg",true), resourceSet);
		}
		// else
		catch(Exception e){
			reconfTransformation = InterpreterconfigurationUtil.loadAndInitTripleGraphGrammar(URI.createPlatformPluginURI("de.uni_paderborn.fujaba.simulink.reconfiguration.m2m/tgg/SimulinkReconfiguration.tgg",true), resourceSet);
		}
		
		basicTransformation.getChildTransformation().add(reconfTransformation);
		
		return basicTransformation;
		
	}
}
