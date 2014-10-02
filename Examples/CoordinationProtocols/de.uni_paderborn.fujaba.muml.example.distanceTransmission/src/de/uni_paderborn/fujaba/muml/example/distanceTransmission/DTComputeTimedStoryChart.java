package de.uni_paderborn.fujaba.muml.example.distanceTransmission;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Test;

import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;
import de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedGraphTransformationSystem;
import de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.TSCTransformationRunner;

public class DTComputeTimedStoryChart {
	private final String modelURI = "/de.uni_paderborn.fujaba.muml.example.distanceTransmission/model/DistanceTransmission.fujaba";

	private RootNode modelRootNode;
	
	private final boolean writeTSCtoFile = true;

	private void loadModel() throws IOException{
		ResourceSet rs = new ResourceSetImpl();

		Resource r = rs.createResource(URI.createPlatformPluginURI(modelURI, true));
		r.load(Collections.EMPTY_MAP);
		modelRootNode = (RootNode) r.getContents().get(0);

		EcoreUtil.resolveAll(modelRootNode);
	}

	private CoordinationProtocol getCoordinationProtocol(){
		for(ModelElementCategory cat : modelRootNode.getCategories()){
			if(cat.getKey().equals("de.uni_paderborn.fujaba.muml.protocol.category")){
				for(EObject curObj : cat.getModelElements()){
					if(curObj instanceof CoordinationProtocol){
						CoordinationProtocol curProt = (CoordinationProtocol) curObj;
						if(curProt.getName().equals("DistanceTransmission")){
							return curProt;
						}
					}
				}
			}
		}
		
		return null;
	}
	
	/**
	 * Creates a resource that will host all reachability graph objects and the reachability graph
	 * itself. This resource is needed to make the EcoreUtil.delete function work as expected.
	 * @throws IOException 
	 */
	protected void writeToResource(TimedGraphTransformationSystem tgts) throws IOException{
		
		// Register the XMI resource factory for the .sdmReachGraph extension
	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("timedstorydiagram", new XMIResourceFactoryImpl());

	    // Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();

	    // create a resource
	    Resource theResource = resSet.createResource(URI.createURI("model-gen/TimedStoryChart.timedstorydiagram"));
	    
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    theResource.getContents().add(tgts);
	    
	    theResource.save(Collections.EMPTY_MAP);
	}
	
	@Test
	public void computeTimedStoryChart() throws IOException{
		// load the model
		loadModel();

		CoordinationProtocol protocol = getCoordinationProtocol();
		
		//perform TSC transformation
		long sysTime = System.currentTimeMillis();
		TSCTransformationRunner transformationRunner = new TSCTransformationRunner();
		boolean success = transformationRunner.execute(protocol.getRoleConnector());
		long timeForTSC = System.currentTimeMillis() - sysTime;
		
		TimedGraphTransformationSystem tgts = transformationRunner.getTgts();
		
		if(writeTSCtoFile){
			writeToResource(tgts);
		}
		
		//print out
		if(success){
			System.out.println("---------- TSC successfully generated ----------");
			System.out.println("Took time:\t " + timeForTSC + "ms");
			System.out.println("Generated timed GTS contains:\t" + tgts.getRules().size() + " rules");
			System.out.println("\t\t\t\t" + tgts.getInvariants().size() + " invariants");
			System.out.println("\t\t\t\t" + tgts.getClockInstanceRules().size() + " clock instance rules");
			System.out.println("\t\t\t\t" + tgts.getHelperStoryDiagrams().size() + " helper story diagrams");
		} else {
			System.out.println("TSC generation failed.");
		}
	}
}
