package de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;
import org.storydriven.storydiagrams.activities.Activity;

import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.muml.reachanalysis.core.HashLevel;
import de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Environment;
import de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.State;
import de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Statechart;
import de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.TtccarplatooningFactory;
import de.uni_paderborn.fujaba.muml.reachanalysis.sdm.SDMReachabilityComputation;
import de.uni_paderborn.fujaba.muml.reachanalysis.sdm.SDMReachabilityComputationStatistics;
import de.uni_paderborn.fujaba.muml.reachanalysis.sdm.export.SDMReachabilityGraphExporter;

public class StartComputationTest {

	//number of car processes
	private final int numberOfCars = 3;
	
	//make GraphViz print-out
	private final boolean printGraph = true;
	
	//use unchangeable node identification
	private final boolean detectUnchangeableNodes = true;
	
	private final boolean storeIndexMapping = true;
	
	//toggle debug printout of the interpreter
	private final boolean debug_printout = false;
	
	private final String modelURI = "/de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning/model/TTCActivities.fujaba";
	
	private HashSet<EObject> setupInitialGraph(){
		
		HashSet<EObject> result = new HashSet<EObject>();
		TtccarplatooningFactory factory = TtccarplatooningFactory.eINSTANCE;
		
		//create Environment object
		Environment env = factory.createEnvironment();
		env.setMaxNumOfCars(numberOfCars);
		result.add(env);
		
		//create Statechart object
		Statechart sc = factory.createStatechart();
		result.add(sc);
		
		//create State objects
		State s = factory.createState();
		s.setName("hob");
		s.setStatechart(sc);
		result.add(s);
		
		s = factory.createState();
		s.setName("ld");
		s.setStatechart(sc);
		result.add(s);
		
		s = factory.createState();
		s.setName("flw");
		s.setStatechart(sc);
		result.add(s);
		
		s = factory.createState();
		s.setName("hod");
		s.setStatechart(sc);
		result.add(s);
		
		s = factory.createState();
		s.setName("pass");
		s.setStatechart(sc);
		result.add(s);
		
		s = factory.createState();
		s.setName("hon");
		s.setStatechart(sc);
		result.add(s);
		
		s = factory.createState();
		s.setName("ann");
		s.setStatechart(sc);
		result.add(s);
		
		s = factory.createState();
		s.setName("ho");
		s.setStatechart(sc);
		result.add(s);
		
		s = factory.createState();
		s.setName("ldb");
		s.setStatechart(sc);
		result.add(s);
		
		s = factory.createState();
		s.setName("fa");
		s.setStatechart(sc);
		result.add(s);
		
		return result;
	}
	
	private List<Activity> loadActivities() throws IOException
	{
		ResourceSet rs = new ResourceSetImpl();
		
		Resource r = rs.createResource(URI.createPlatformPluginURI(modelURI, true));

		r.load(Collections.EMPTY_MAP);
		
		ArrayList<Activity> result = new ArrayList<Activity>();
		RootNode rn = (RootNode) r.getContents().get(0);
		
		for(ModelElementCategory category : rn.getCategories()){
			if(category.getKey().equals("org.storydriven.storydiagrams.category")){
				
				//right category found, extract activities
				for(EObject obj : category.getModelElements()){
					if (obj instanceof Activity){
//						if (((Activity)obj).getName().equals("Transition_ldb_ld")){
//							continue;
//						}
						result.add((Activity)obj);
					}
				}
				
				//do not traverse further categories after finding the right one
				break;
			}
			
		}
		
		EcoreUtil.resolveAll(rn);
		
		return result;
	}
	
	@Test
	public void computeTTCStatespace() throws IOException{
		
		//create initial graph objects
		HashSet<EObject> initialGraphObjects = setupInitialGraph();
		
		//load activities
		List<Activity> activities = loadActivities();
		
		//compute the reachability graph
		SDMReachabilityComputation reachComp = new SDMReachabilityComputation(initialGraphObjects, activities);
		reachComp.setIdentifyUnchangeableSubgraphs(detectUnchangeableNodes);
		reachComp.setStoreMatching(false);
		reachComp.setStoreIndexMap(storeIndexMapping);
		reachComp.setHashLevel(HashLevel.LEVEL2);
		SDMReachabilityComputation.setDEBUG(debug_printout);
		long sysTime = System.currentTimeMillis();
		reachComp.computeReachabilityGraph();
		long curTime = System.currentTimeMillis();
		
		//make GraphViz print-out
		if(printGraph){
			SDMReachabilityGraphExporter exporter = new SDMReachabilityGraphExporter();
			exporter.setDecorator(new CarPlatooningStepGraphDecorator());
			exporter.export(reachComp.getReachabilityGraph());
		}
		
		//get stats
		SDMReachabilityComputationStatistics stats = reachComp.getReachabilityComputationStatistics();
		
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
	
}
