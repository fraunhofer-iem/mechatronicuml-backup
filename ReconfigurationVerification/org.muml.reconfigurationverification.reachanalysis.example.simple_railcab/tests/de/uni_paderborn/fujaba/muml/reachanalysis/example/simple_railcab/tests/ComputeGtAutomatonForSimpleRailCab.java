package de.uni_paderborn.fujaba.muml.reachanalysis.example.simple_railcab.tests;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Before;
import org.junit.Test;
import org.muml.core.modelinstance.ModelinstancePackage;
import org.muml.core.reachanalysis.core.HashLevel;
import org.muml.reconfigurationverification.reachanalysis.gtautomaton.GtAutomatonComputation;
import org.muml.reconfigurationverification.reachanalysis.gtautomaton.GtAutomatonComputationStatistics;
import org.muml.reconfigurationverification.reachanalysis.gtautomaton.export.GtAutomatonExporter;
import org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tsdmhelper.TsdmhelperPackage;
import org.muml.reconfigurationverification.timedstorydiagram.TimedGraphTransformationSystem;
import org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage;
import org.muml.storydiagram.reachanalysis.sdm.SDMReachabilityComputation;

import railcab.RailCab;
import railcab.RailcabFactory;
import railcab.SectionControl;

public class ComputeGtAutomatonForSimpleRailCab {
	private int railCabCount = 3;
	private int sectionControlCount = 1;
	
	//make GraphViz print-out
	private final boolean printGraph = true;
	
	//use unchangeable node identification
	private final boolean detectUnchangeableNodes = true;
	
	//enable debug printouts of the interpreter
	private final boolean debug_printout = false;
	
	//define the max path depth to be used for the reachability computation
	private final int maxPathDepth = 20;
	
	private HashSet<RailCab> railCabs;
	private HashSet<SectionControl> sectionControls;
	
	private static final String PROJECT_NAME = "de.uni_paderborn.muml.verification.test.railcab.transformationrules";
	private ResourceSet resourceSet = new ResourceSetImpl();

	@Before
	public void setUp() {
		railCabs = new HashSet<RailCab>();
		sectionControls = new HashSet<SectionControl>();
		
		for(int i = 0; i < railCabCount; i++)
		{
			RailCab railCab = RailcabFactory.eINSTANCE.createRailCab();
			railCab.setIsLeader(false);
			railCab.setName("r"+i);
			railCabs.add(railCab);
		}
		
		for(int i = 0; i < sectionControlCount;i++) 
		{
			SectionControl sectionControl = RailcabFactory.eINSTANCE.createSectionControl();
			sectionControl.setName("s"+i);
			sectionControls.add(sectionControl);
			
		}
		
		// initialize resource set
		Map<String, Object> extensionToFactoryMap = resourceSet
				.getResourceFactoryRegistry().getExtensionToFactoryMap();
		extensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl());

		extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());

		// Register Packages
		EcorePackage.eINSTANCE.eClass();
		TimedstorydiagramPackage.eINSTANCE.eClass();
		ModelinstancePackage.eINSTANCE.eClass();
		TsdmhelperPackage.eINSTANCE.eClass();

		// Find out absolute path of muml.model project
		StringBuffer absoluteProjectPath = new StringBuffer();
		absoluteProjectPath.append(new File("").getAbsoluteFile()
				.getParentFile());
		absoluteProjectPath.append('/');
		absoluteProjectPath.append(PROJECT_NAME);
		// no idea why, but this is necessary two times
		absoluteProjectPath.append('/');
		absoluteProjectPath.append(PROJECT_NAME);

		// Register platform mapping for muml.model project
		EcorePlugin.getPlatformResourceMap().put(PROJECT_NAME,
				URI.createFileURI(absoluteProjectPath.toString()));
		
		
	}
	

	@Test
	public void test() throws IOException {
		
		// load TGTS from xmi file
		TimedGraphTransformationSystem tgts = (TimedGraphTransformationSystem) load("railCabTransform.timedstorydiagram");
		
		// collect initial graph objects
		tgts.getInitialGraphObjects().addAll(railCabs);
		tgts.getInitialGraphObjects().addAll(sectionControls);
		
		// compute GtAutomaton
		GtAutomatonComputation gtAutomatonComputation = new GtAutomatonComputation(tgts);
		gtAutomatonComputation.setIdentifyUnchangeableSubgraphs(detectUnchangeableNodes);
		gtAutomatonComputation.setStoreMatching(false);
		gtAutomatonComputation.setHashLevel(HashLevel.LEVEL2);
		gtAutomatonComputation.setMaxPathLength(maxPathDepth);
		SDMReachabilityComputation.setDEBUG(debug_printout);
		long sysTime = System.currentTimeMillis();
		gtAutomatonComputation.computeReachabilityGraph();
		long curTime = System.currentTimeMillis();
		
		//make GraphViz print-out
		if(printGraph){
			GtAutomatonExporter exporter = new GtAutomatonExporter();
			exporter.export(gtAutomatonComputation.getReachabilityGraph());
		}
		
		//get stats
		GtAutomatonComputationStatistics stats = gtAutomatonComputation.getReachabilityComputationStatistics();
		
		//print stats
		System.out.println("-------------------- Summary ----------------");
		System.out.println("Total number of reached graphs: " + stats.getNumberOfStates());
		System.out.println("Max Graph size:\t\t\t" + stats.getMaximumNumberOfObjectsPerState() + " nodes");
		System.out.println("Unchangeable nodes:\t\t" + stats.getNumberOfUnchangeableNodes());
		System.out.println("Hash collisions/isomorphisms\t" + stats.getHashCollisions() + "/" + stats.getIsomorphismsFound());
		System.out.println("Took time:\t\t\t" + (curTime - sysTime) + "ms");
		System.out.println("Time for forEach Transformation:" + stats.getTimeForRuleTransformation() + "ms");
		System.out.println("Time for unchangeable nodes:\t" + stats.getTimeForUnchangeableNodeIdentifiation() + "ms");
		System.out.println("Time for state exploration:\t" + stats.getTimeForReachabilityGraphComputation() + "ms");
		System.out.println("Time for isomorphisms:\t\t" + stats.getTimeForIsomorphismCheck() + "ms");
		System.out.println("Time for state copy:\t\t" + stats.getTimeForStateCopy() + "ms");
		System.out.println("Time for hash computation\t" + stats.getTimeForHashComputation() + "ms");
		
		

	}
	
	
	private EObject load(String modelName) throws IOException {

		ResourceSet rs = new ResourceSetImpl();
		
		String modelFolder = "/de.uni_paderborn.fujaba.muml.reachanalysis.example.simple_railcab/model/";

		Resource r = rs.createResource(URI.createPlatformPluginURI(
				modelFolder + modelName, true));

		r.load(Collections.EMPTY_MAP);

		return r.getContents().get(0);
	}

}
