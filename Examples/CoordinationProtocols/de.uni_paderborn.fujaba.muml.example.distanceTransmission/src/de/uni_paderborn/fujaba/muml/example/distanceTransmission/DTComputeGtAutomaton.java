package de.uni_paderborn.fujaba.muml.example.distanceTransmission;

import java.io.IOException;
import java.util.Collections;
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
import de.uni_paderborn.fujaba.muml.reachanalysis.core.HashLevel;
import de.uni_paderborn.fujaba.muml.reachanalysis.core.export.GraphVizExportFileTypes;
import de.uni_paderborn.fujaba.muml.reachanalysis.gtautomaton.GtAutomatonComputation;
import de.uni_paderborn.fujaba.muml.reachanalysis.gtautomaton.export.GtAutomatonExporter;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.GtAutomaton;
import de.uni_paderborn.fujaba.muml.reachanalysis.sdm.SDMReachabilityComputationStatistics;
import de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedGraphTransformationSystem;
import de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.TSCTransformationRunner;

public class DTComputeGtAutomaton {

	//make GraphViz print-out
		private final boolean printGraph = false;
		private final GraphVizExportFileTypes fileType = GraphVizExportFileTypes.SVG;

		//use unchangeable node identification
		private final boolean detectUnchangeableNodes = true;

		private final boolean storeIndexMapping = true;
		
		private final int pathLength = 40;

		private final boolean writeGtAutomatontoFile = true;
		
		//toggle debug printout of the interpreter
		private final boolean debug_printout = false;

		private final String modelURI = "/de.uni_paderborn.fujaba.muml.example.distanceTransmission/model/DistanceTransmission.fujaba";

		private RootNode modelRootNode;

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
		

		@Test
		public void computeGtAutomaton() throws IOException{

			// load the model
			loadModel();

			CoordinationProtocol protocol = getCoordinationProtocol();
			
			//perform TSC transformation
			long sysTime = System.currentTimeMillis();
			TSCTransformationRunner transformationRunner = new TSCTransformationRunner();
			transformationRunner.execute(protocol.getRoleConnector());
			long timeForTSC = System.currentTimeMillis() - sysTime;
			
			TimedGraphTransformationSystem tgts = transformationRunner.getTgts();

			//compute the reachability graph
			GtAutomatonComputation reachComp = new GtAutomatonComputation(tgts);
			reachComp.setIdentifyUnchangeableSubgraphs(detectUnchangeableNodes);
			reachComp.setStoreMatching(true);
			reachComp.setStoreIndexMap(storeIndexMapping);
			reachComp.setHashLevel(HashLevel.LEVEL1);
			reachComp.setMaxPathLength(pathLength);
			GtAutomatonComputation.setDEBUG(debug_printout);
			reachComp.computeReachabilityGraph();
			
			long totalTime = System.currentTimeMillis() - sysTime;

			//make GraphViz print-out
			if(printGraph){
				GtAutomatonExporter exporter = new GtAutomatonExporter();
				exporter.setType(fileType);
				exporter.export(reachComp.getReachabilityGraph());
			}
			
			if(writeGtAutomatontoFile){
				writeToResource(reachComp.getReachabilityGraph());
			}

			//get stats
			SDMReachabilityComputationStatistics stats = reachComp.getReachabilityComputationStatistics();

			//print stats
			System.out.println("-------------------- Summary ----------------");
			System.out.println("Total number of states:\t\t" + stats.getNumberOfStates());
			System.out.println("Max Graph size:\t\t\t" + stats.getMaximumNumberOfObjectsPerState() + " nodes");
			System.out.println("Pruned Branches:\t\t" + stats.getNumberOfPrunedBranches());
			System.out.println("Unchangeable nodes:\t\t" + stats.getNumberOfUnchangeableNodes());
			System.out.println("Hash collisions/isomorphisms\t" + stats.getHashCollisions() + "/" + stats.getIsomorphismsFound());
			System.out.println("Took time:\t\t\t" + totalTime + "ms");
			System.out.println("Time for TSC transformation:\t " + timeForTSC + "ms");
			System.out.println("Time for GtAutomatonComputation:" + stats.getTimeForReachabilityGraphComputation() + "ms");
			System.out.println("Time for forEach Transformation:" + stats.getTimeForRuleTransformation() + "ms");
			System.out.println("Time for unchangeable nodes:\t" + stats.getTimeForUnchangeableNodeIdentifiation() + "ms");
			System.out.println("Time for state exploration:\t" + stats.getTimeForReachabilityGraphComputation() + "ms");
			System.out.println("Time for isomorphisms:\t\t" + stats.getTimeForIsomorphismCheck() + "ms");
			System.out.println("Time for state copy:\t\t" + stats.getTimeForStateCopy() + "ms");
			System.out.println("Time for hash computation\t" + stats.getTimeForHashComputation() + "ms");

		}
		
		/**
		 * Creates a resource and write the GtAutomaton into it.
		 * @throws IOException 
		 */
		protected void writeToResource(GtAutomaton gtautomaton) throws IOException{
			
			// Register the XMI resource factory for the .sdmReachGraph extension
		    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		    Map<String, Object> m = reg.getExtensionToFactoryMap();
		    m.put("gtautomaton", new XMIResourceFactoryImpl());

		    // Obtain a new resource set
		    ResourceSet resSet = new ResourceSetImpl();

		    // create a resource
		    Resource theResource = resSet.createResource(URI.createURI("model-gen/GtAutomaton.gtautomaton"));
		    
		    // Get the first model element and cast it to the right type, in my
		    // example everything is hierarchical included in this first node
		    theResource.getContents().add(gtautomaton);
		    
		    theResource.save(Collections.EMPTY_MAP);
		}
}
