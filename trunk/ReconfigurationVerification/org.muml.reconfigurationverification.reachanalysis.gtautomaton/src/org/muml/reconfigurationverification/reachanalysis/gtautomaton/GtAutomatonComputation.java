package org.muml.reconfigurationverification.reachanalysis.gtautomaton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.muml.core.expressions.common.LiteralExpression;
import org.muml.core.reachanalysis.core.ReachabilityComputationStatistics;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition;
import org.muml.pim.types.PrimitiveDataType;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomaton;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonClockConstraint;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonTransition;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtStepGraph;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonFactory;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.ObjectIdentifier;
import org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tsdmhelper.BoundClockInstances;
import org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tsdmhelper.TsdmhelperFactory;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstance;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceConstraint;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceStoryDiagram;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceVariable;
import org.muml.reconfigurationverification.timedstorydiagram.InvariantStoryDiagram;
import org.muml.reconfigurationverification.timedstorydiagram.TimedGraphTransformationSystem;
import org.muml.reconfigurationverification.timedstorydiagram.TimedStoryDiagram;
import org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmFactory;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SuccessorStepGraphs;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.BoolWrapper;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.DoubleWrapper;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.IntWrapper;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.LongWrapper;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.StringWrapper;
import org.muml.storydiagram.reachanalysis.sdm.SDMReachabilityComputation;
import org.muml.verification.core.runtime.VariableBinding;

/*TODO:
 *  - generate identifiers for unchangeable nodes -> generate once and use for all nodes
 *  - identifier reuse for normal graph nodes (idea: reuse identifier if new object has the same neighborhood as an object that has been deleted before) 
 */
public class GtAutomatonComputation extends SDMReachabilityComputation{

	private ObjectIdentifier srcIdentifierHash;
	private ObjectIdentifier tgtIdentifierHash;
	
	/** counter used for generating unique identifiers for new objects */
	private int numberOfEObject;
	
	/** Prefix for the unique identifiers */
	private static final String identifierPrefix = "id";
	
	/**	Path to the QVT-O transformation that transforms the input timed GTS to a forEach enhanced timed GTS. */
	private static final String TRANSFORMATION_PATH = "/org.muml.reconfigurationverification.reachanalysis.tsdm.transform/transforms/forEachTransformation.qvto";
	
	/** All invariant rules used by this reachability computation */
	private List<InvariantStoryDiagram> invariants;

	/** All clock instance rules used by this reachability computation */
	private List<ClockInstanceStoryDiagram> clockInstanceRules;
	
	/** The timed GTS which is explored by this algorithm */
	private TimedGraphTransformationSystem tgts;
	
	/**	Stores the number of outgoing hasNode LinkVariables that the clock instance in the corresponding ClockInstanceStoryDiagram has.
	 *  This information is used for implementing the clock removal. */
	private HashMap<String, ClockInstanceStoryDiagram> clockIDToClockInstanceSD;
	
	/** Stores how many hasNode links a clock instance with the identifier used as key has. */
	private HashMap<String, Integer> hasNodeLinksForClockID;
	
	/**
	 * This static instance of the {@link GtAutomatonComputation} is only to be accessed
	 * by the static method copyGtStepGraph. It is needed for accessing the non-static copy
	 * methods. The copy methods are intended to be non-static in order to support inheritance.
	 */
	private static GtAutomatonComputation reachCompForCopyStepGraph;
	
	protected GtAutomatonComputation(){
		super();
	}
	
	/**
	 * Constructor
	 * @param initialGraphObjects the set of object which form the initial graph
	 * @param activities the list of story diagrams that are used for the reachability analysis
	 */
	public GtAutomatonComputation(TimedGraphTransformationSystem timedGTS){
		super();
		if (timedGTS != null) {
			//add all initialGraphObjects and typeGraphObjects to the initialGraphObjects for this reachability analysis
			//we require the type graph objects in the initial graph objects because they need to be added to either
			//changeable or unchangeable nodes of the GtStepGraph 
			this.getInitialGraphObjects().addAll(timedGTS.getInitialGraphObjects());
			this.getInitialGraphObjects().addAll(timedGTS.getTypeGraphObjects());
		}
		this.tgts = timedGTS;
		reachCompForCopyStepGraph = this;
		hasNodeLinksForClockID = new HashMap<String, Integer>();
		clockIDToClockInstanceSD = new HashMap<String, ClockInstanceStoryDiagram>();
	}
	
	@Override
	protected ReachabilityGraph createReachabilityGraph(){
		
		GtAutomaton result = GtautomatonFactory.eINSTANCE.createGtAutomaton();
		
		//create temporary resource for this reachability graph. It recursively contains all
		//states and transitions as well as all graph objects referenced by the changeable 
		//nodes of the states -> needed for the EcoreUtil.delete operation to work properly
		createTempResource(result);
		
		return result;
	}
	
	@Override
	protected StepGraph createStepGraph(){
		return GtautomatonFactory.eINSTANCE.createGtStepGraph();
	}
	
	@Override
	protected SDMTransition createSDMTransition(){
		return GtautomatonFactory.eINSTANCE.createGtAutomatonTransition();
	}
	
	@Override
	protected void initialize()
	{	
		//add timed GT rules to the activities container such that they can be processed by the super class
		//for identifying unchangeable nodes
		this.getActivities().addAll(tgts.getRules());
		
		//call implementation of super class
		super.initialize();
	}
	
	/**
	 * Helper function that computes which of the provided initial graph objects will never be
	 * changed by the given set of rules. The classes of these nodes are stored in the container
	 * classesOfUnchangeableNodes.
	 */
	protected void computeUnchangeableNodes(){
		super.computeUnchangeableNodes();
		
		//remove ClockInstance from the unchangeable nodes
		this.getClassesOfUnchangeableNodes().remove(TimedstorydiagramPackage.eINSTANCE.getClockInstance());
	}
	
	@Override
	public GtAutomaton getReachabilityGraph() {
		return (GtAutomaton)reachabilityGraph;
	}

	
	@Override
	protected HashSet<? extends ReachabilityGraphState> computeSuccessors(ReachabilityGraphState state) {
		
		//Info: The state given as a parameter contains all clock instances and has all invariants assigned.
		
		//validate that the given state is indeed a GtReachabilityGraphState
		if (! (state instanceof GtStepGraph)){
			throw new UnsupportedOperationException("Cannot process states of type " + state.getClass().getName() + " in SDM Reachability Analysis.");
		}
		GtStepGraph step = (GtStepGraph) state;
		
		//object identifiers of the state that is currently expanded
		ObjectIdentifier srcIdentifierHash = step.getObjectIdentifier();
		
		HashSet<StepGraph> result = new HashSet<StepGraph>();
		
		//iterate all activities and compute successors for all activities
		for(Activity curActivity : getActivities()){
			
			TimedStoryDiagram curTSD = (TimedStoryDiagram) curActivity;
			
			SuccessorStepGraphs successors = SdmFactory.eINSTANCE.createSuccessorStepGraphs();
			
			callInterpreter(step, curTSD, successors);
			
			//if no successor object has been retrieved, return without successors
			if (successors == null){
				return new HashSet<GtStepGraph>();
			}
			
			//take all produced graphs and perform postprocessing
			for (StepGraph temp : successors.getSuccessors()) {
				
				GtStepGraph tempState = (GtStepGraph) temp;
				
				//sanitize variable bindings
				sanitizeVariableBindings(tempState);
				
				//get GT Transition
				GtAutomatonTransition trans = (GtAutomatonTransition) tempState.getIncomingTransitions().get(0);
	
				cleanUpVariableBindings(trans, tempState);
				cleanUpPrimitiveTypeWrappers(tempState);
				
				//remove clock instance from tempState that lost adjacent hasNode links and are now invalid
				removeClockInstancesFromState(tempState);
				
				//add clock instances to the tempState
				addClockInstancesToState(tempState);
				
				//set identifiers for new Objects
				ObjectIdentifier identifierHash = tempState.getObjectIdentifier();
				for (EObject tempEObject : tempState.getChangeableNodes()){
					if(identifierHash.getEObjectToIdentifier().get(tempEObject)==null){
						identifierHash.putEObjectToIdentifier(tempEObject, identifierPrefix + numberOfEObject);
						identifierHash.putIdentifierToEObject(identifierPrefix + numberOfEObject, tempEObject);
						numberOfEObject++;
					}
				}
				
				
				//iterate guards of the rule
				for(ClockInstanceConstraint curConstraint : curTSD.getClockInstConstraint()){
					String variableName = curConstraint.getClockInstanceVariable().getName(); //get name of variable
					ClockInstance ci = (ClockInstance)trans.getMatching().get(variableName); //get clock instance bound to that variable
					
					//create clock constraint and assign it to the transition
					GtAutomatonClockConstraint clockCon = GtautomatonFactory.eINSTANCE.createGtAutomatonClockConstraint();
					clockCon.setClockInstanceIdentifier(srcIdentifierHash.getIdentifier(ci));
					clockCon.setOperator(curConstraint.getOperator());
					clockCon.setValue(curConstraint.getValue());
					trans.getTimeGuards().add(clockCon);
				}
				
				//iterate resets of the rule
				for(ClockInstanceVariable curReset : curTSD.getResets()){
					String variableName = curReset.getName(); //get name of variable
					ClockInstance ci = (ClockInstance)trans.getMatching().get(variableName); //get clock instance bound to that variable
					
					//add reset to the transition
					trans.getClockResets().add(srcIdentifierHash.getIdentifier(ci));
				}
				
				//annotate activity at the transition
				trans.setAppliedActivity(getInputActivityFromMapping(curTSD));
				
				//add invariants
				addInvariantsToState(tempState);
				

				
				if (!this.isStoreIndexMap()){
					trans.getIndex().clear();
				}
				
			}
			
			//add successors of this rule to the final result
			result.addAll(successors.getSuccessors());
		}
		
		return result;
	}

	@Override
	protected ReachabilityGraphState createInitialState() {
		//create new GtStepGraph via super class
		GtStepGraph initialState = (GtStepGraph) super.createInitialState();
		
		// set up references that are specific for GtStepGraphs
		ObjectIdentifier identifierHash = GtautomatonFactory.eINSTANCE.createObjectIdentifier();
		initialState.setObjectIdentifier(identifierHash);
		
		//create identifiers for initial state
		numberOfEObject = 0;
		for(EObject tempEObject: initialState.getChangeableNodes() ){
			identifierHash.getEObjectToIdentifier().put(tempEObject,identifierPrefix + numberOfEObject);
			identifierHash.getIdentifierToEObject().put(identifierPrefix + numberOfEObject,tempEObject);
			numberOfEObject++;
		}
		
		// initialize map for free clock instance identifiers
		for(ClockInstanceStoryDiagram clockInstRule : getClockInstanceRules()) {
			identifierHash.getFreeClockInstanceIdentifiers().put(clockInstRule, new BasicEList<String>());
		}
		
		//add all clock instances to the initial state
		addClockInstancesToState(initialState);
		
		//add all invariants to the inital state
		addInvariantsToState(initialState);
		
		return initialState;
	}


	/**
	 * This method applies all clock instance story diagrams to the step graph given as a parameter.
	 * @param stepGraph
	 */
	protected void addClockInstancesToState(GtStepGraph stepGraph){
		
		//current number of clock instances
		int numOfClocks = stepGraph.getClockInstances().size();
		
		//node identifiers
		ObjectIdentifier identifierMapping = stepGraph.getObjectIdentifier();
		
		//retrieve incoming transition, there can only be one (or none if it is the initial state)
		GtAutomatonTransition incomingTrans = null;
		if(! stepGraph.getIncomingTransitions().isEmpty()){
			incomingTrans = (GtAutomatonTransition) stepGraph.getIncomingTransitions().get(0);
		}
			
		//iterate all clock instance story diagrams and add clock instances
		for(ClockInstanceStoryDiagram curClockInstSDM: getClockInstanceRules()){
			
			callInterpreter(stepGraph, curClockInstSDM, null);
			
			//if clock instances have been added, create new identifiers for them
			if(stepGraph.getClockInstances().size() > numOfClocks){
				//search for the clock instances without identifier
				for(ClockInstance curObj : stepGraph.getClockInstances()){
					if (identifierMapping.getIdentifier(curObj) == null){
						//try to obtain an existing, but free identifier for the clock instance
						String newID = identifierMapping.getFreeClockInstanceIdentifier(curClockInstSDM);
						
						//no free identifier => create new one
						if(newID == null){
							newID = identifierPrefix + numberOfEObject;
							
							//identify clockID with the clock instance story diagram
							this.clockIDToClockInstanceSD.put(newID, curClockInstSDM);
						}
						
						//store new ID
						identifierMapping.getEObjectToIdentifier().put(curObj, newID);
						identifierMapping.getIdentifierToEObject().put(newID, curObj);
						
						//set clock
						curObj.setId(newID);
						
						//add identifier to the set of all clock instance identifiers used by the GtReachabilityGraph
						this.getReachabilityGraph().getClockInstanceIdentifiers().add(newID);
						
						//add reset for new clock to the incoming transition of stepGraph, because in the resulting automaton
						//the clock will start to run in the initial state, but needs to be 0 when entering this stepGraph
						if(incomingTrans != null){
							incomingTrans.getClockResets().add(newID);
						}
						
						//store number of outgoing hasNode links for this clock instance
						this.hasNodeLinksForClockID.put(newID, curObj.getHasNode().size());
						
						numberOfEObject++;
						numOfClocks++;
					}
					
				}
				
			}
		}
	}
	
	/**
	 * Remove clock instances if their corresponding clock instance rule does no longer match to the host graph.
	 * This is the case if the clock instance loses one or more of its adjacent hasNode links.
	 * @param stepGraph
	 */
	protected void removeClockInstancesFromState(GtStepGraph stepGraph){
		
		ObjectIdentifier objIDs = stepGraph.getObjectIdentifier();
		HashSet<ClockInstance> clockInstToDelete = new HashSet<ClockInstance>();
		
		//iterate all clock instances
		for(ClockInstance ci : stepGraph.getClockInstances()){
			String clockID = objIDs.getIdentifier(ci);
			
			int currentNumberOfHasNodeLinks = ci.getHasNode().size();
			int requiredNumberOfHasNodeLinks = hasNodeLinksForClockID.get(clockID);
			
			//Check whether links are missing
			if(currentNumberOfHasNodeLinks < requiredNumberOfHasNodeLinks){
				clockInstToDelete.add(ci);
				continue;
			}
			
			//in some cases, the EcoreUtil does not remove a deleted object from the referencing containers
			//-> check whether all objects that are referenced by hasNode are still in the GtStepGraph
			for(EObject curObj : ci.getHasNode()){
				if(! (stepGraph.getChangeableNodes().contains(curObj) || stepGraph.getUnchangeableNodes().contains(curObj))){
					clockInstToDelete.add(ci);
					break;
				}
			}
		}
		
		//delete clock instances
		for(ClockInstance ci : clockInstToDelete){
			String clockID = objIDs.getIdentifier(ci);
			
			//remove from GtStepGraph
			stepGraph.getClockInstances().remove(ci);
			stepGraph.getChangeableNodes().remove(ci);
			
			//remove from identifier hash map manually
			objIDs.getIdentifierToEObject().remove(clockID);
			objIDs.getEObjectToIdentifier().remove(ci);
			
			//add clockID to list of free clock instance identifiers
			List<String> identifierList = objIDs.getFreeClockInstanceIdentifiers().get(clockIDToClockInstanceSD.get(clockID));
			identifierList.add(clockID);
			
			//delete the object
			EcoreUtil.delete(ci);
		}
		
	}
	
	/**
	 * This method adds all invariants to the step graph given as a parameter by evaluating the invariant story diagrams.
	 * @param stepGraph
	 */
	protected void addInvariantsToState(GtStepGraph stepGraph){
		ObjectIdentifier identifierMapping = stepGraph.getObjectIdentifier();
		
		//iterate all invariant story diagrams and retrieve invariants
		for(InvariantStoryDiagram curInvSDM: getInvariants()){
			BoundClockInstances resultingInstances = TsdmhelperFactory.eINSTANCE.createBoundClockInstances();
			callInterpreter(stepGraph, curInvSDM, resultingInstances);
			
			ClockInstanceConstraint curConstraint = curInvSDM.getClockInstConstraint();
			
			//add invariant constraint for each match of the invariant story diagram
			for (ClockInstance curObj : resultingInstances.getClockInstances()){
				GtAutomatonClockConstraint clockCon = GtautomatonFactory.eINSTANCE.createGtAutomatonClockConstraint();
				clockCon.setClockInstanceIdentifier(identifierMapping.getIdentifier(curObj));
				clockCon.setOperator(curConstraint.getOperator());
				clockCon.setValue(curConstraint.getValue());
				
				stepGraph.getInvariant().add(clockCon);
			}
		}			
		
	}
	
	/**
	 * This static method is only meant to be accessed by the story diagram interpreter which currently
	 * is only able to call static methods.
	 * @param state the {@link GtStepGraph} to be copied
	 * @param trans the {@link GtTransition} to the state to be copied
	 * @return a copy of state
	 */
	public static GtStepGraph copyGtStepGraph(GtStepGraph state, GtAutomatonTransition trans){
		if (reachCompForCopyStepGraph == null){
			reachCompForCopyStepGraph = new GtAutomatonComputation();
		}
		
		return (GtStepGraph)reachCompForCopyStepGraph.copyState(state, trans);
	}

	@Override
	public ReachabilityGraphState copyState(ReachabilityGraphState state, ReachabilityGraphTransition trans) {
		
		long time = System.currentTimeMillis();
		
		//cast state
		if (! (state instanceof GtStepGraph)){
			throw new UnsupportedOperationException("Cannot process states of type " + state.getClass().getName() + " in SDM Reachability Analysis.");
		}
		GtStepGraph source = (GtStepGraph) state;
		
		//store variables
		srcIdentifierHash = source.getObjectIdentifier();
		tgtIdentifierHash = GtautomatonFactory.eINSTANCE.createObjectIdentifier();
		
		//call copy method of the super class
		GtStepGraph tgtState = (GtStepGraph) super.copyState(source, trans);
		
		// copy map for free clock instance identifiers of previous state
		
		if(srcIdentifierHash != null){
			for (Entry<ClockInstanceStoryDiagram, EList<String>> entry : srcIdentifierHash.getFreeClockInstanceIdentifiers()) {
				EList<String> clockIds = new BasicEList<String>();
				clockIds.addAll(entry.getValue());
				tgtIdentifierHash.getFreeClockInstanceIdentifiers().put(entry.getKey(), clockIds);
			}
			
			//add identifier mapping to the copied state
			tgtState.setObjectIdentifier(tgtIdentifierHash);
		}
		
		//populate clockInstances reference of the GtStepGraph
		for(EObject obj : tgtState.getChangeableNodes()){
			if(obj instanceof ClockInstance){
				tgtState.getClockInstances().add((ClockInstance)obj);
			}
		}
		
		((GtAutomatonComputationStatistics)stats).setTimeForStateCopy((System.currentTimeMillis() - time));
		
		return tgtState;
	}
	
	@Override
	protected EObject getOrCreateCopy(EObject srcObj, EMap<EObject, EObject> index){
		EObject result = index.get(srcObj);
		if (result == null){
			//get the factory of the package and create empty object
			EFactory eFactory = srcObj.eClass().getEPackage().getEFactoryInstance();
			result = eFactory.create(srcObj.eClass());
			index.put(srcObj, result);
			
			if (srcIdentifierHash != null){
			
				//set the identifier mapping for the new object
				String identifier = srcIdentifierHash.getIdentifier(srcObj);
				tgtIdentifierHash.getEObjectToIdentifier().put(result, identifier);
				tgtIdentifierHash.getIdentifierToEObject().put(identifier, result);
			}
		}
		return result;
	}

	@Override
	protected boolean isIsomorphic(ReachabilityGraphState state1, ReachabilityGraphState state2) {
		
		//isomorphisms can only be computed for StepGraphs
		if(!(state1 instanceof GtStepGraph) || !(state2 instanceof GtStepGraph)){
			throw new UnsupportedOperationException("Cannot compute isomorphism between " + 
					"objects of types " + state1.getClass().getName() + " and " + state2.getClass().getName());
		}
		
		// return the result of the isomorphism computation
		return isomorphismComputation.computeIsomorphism((GtStepGraph)state1, (GtStepGraph) state2);
	}
	
	
	

	@Override
	protected ReachabilityComputationStatistics createStatisticsObject() {
		return new GtAutomatonComputationStatistics(this.getReachabilityGraph());
	}
	
	@Override
	protected GtIsomorphism createIsomorphismCompuatation(){
		return new GtIsomorphism();
	}
	
	@Override
	protected void prepareActivities(){
		//transform the input timed GTS
		long sysTime = System.currentTimeMillis();
		TimedGraphTransformationSystem forEachRules = createForEachRules(tgts);

		//establish the rule mapping
		establishRuleMapping(forEachRules.getRules());
		((GtAutomatonComputationStatistics)stats).setTimeForRuleTransformation(System.currentTimeMillis() - sysTime);
		
		//add the rules to the containers used by the reachability computation
		this.getActivities().clear();
		this.getActivities().addAll(forEachRules.getRules());
		this.invariants = new ArrayList<InvariantStoryDiagram>();
		this.invariants.addAll(forEachRules.getInvariants());
		this.clockInstanceRules = new ArrayList<ClockInstanceStoryDiagram>();
		this.clockInstanceRules.addAll(forEachRules.getClockInstanceRules());
	}
	
	/**
	 * Transforms the inputs for the reachability computation such that they can be
	 * used by the reachability computation.
	 * @param inputStoryDiagram
	 * @return
	 */
	protected TimedGraphTransformationSystem createForEachRules(TimedGraphTransformationSystem inputTimedGTS) {
	
		// create URI for the transformation file
		URI transformationURI = URI
				.createPlatformPluginURI(
						TRANSFORMATION_PATH,
						true);
		// create executor and execution context
		TransformationExecutor executor = new TransformationExecutor(
				transformationURI);
		ExecutionContextImpl context = new ExecutionContextImpl();

		inputTimedGTS.getUnchangeableNodes().addAll(getClassesOfUnchangeableNodes());


		List<TimedGraphTransformationSystem> inObjects = Arrays.asList(inputTimedGTS);
	
		// create input extend containing the TimedGraphTransformationSystem
		// create empty output extend
		ModelExtent input = new BasicModelExtent(inObjects);
		ModelExtent output = new BasicModelExtent();
	
		// execute transformation
		ExecutionDiagnostic result = executor.execute(context, input,output);
		if (result.getSeverity() != ExecutionDiagnostic.OK){
			
			System.out.println("QVT-O ERROR on rule transformation. Message was:");
			System.out.println(result.getMessage());
		}
		
		TimedGraphTransformationSystem forEachGTS = null;

		//get the resulting timed GTS
		for(EObject curObject : output.getContents()){
			if (curObject instanceof TimedGraphTransformationSystem){
				forEachGTS = (TimedGraphTransformationSystem) curObject;
			}
		}
		
		return forEachGTS;
	
	}
	
	@Override
	public GtAutomatonComputationStatistics getReachabilityComputationStatistics(){
		return (GtAutomatonComputationStatistics) stats;
	}
	
	/**
	 * Retrieves the invariants used in the GtAutomaton computation.
	 * @return
	 */
	protected List<InvariantStoryDiagram> getInvariants() {
		if(this.invariants == null){
			invariants = new ArrayList<InvariantStoryDiagram>();
		}
		return invariants;
	}

	/**
	 * Replaces the list of invariant rules used in the GtAutomaton computation by a new one.
	 * @param invariants
	 */
	protected void setInvariants(List<InvariantStoryDiagram> invariants) {
		this.invariants = invariants;
	}

	/**
	 * Add an invariant story diagram to this reachability computation.
	 * @param newInvariant the invariant story diagram to be added
	 * @return true if the invariant story diagram was added successfully, false otherwise
	 */
	public boolean addToInvariants(InvariantStoryDiagram newInvariant){
		if (this.invariants == null){
			this.invariants = new ArrayList<InvariantStoryDiagram>();
		}
		
		if (this.invariants.contains(newInvariant)){
			return false;
		}
		return this.invariants.add(newInvariant);
	}

	/**
	 * Retrieves the clock instance rules used in the GtAutomaton computation.
	 * @return
	 */
	protected List<ClockInstanceStoryDiagram> getClockInstanceRules() {
		if (this.clockInstanceRules == null){
			clockInstanceRules = new ArrayList<ClockInstanceStoryDiagram>();
		}
		return clockInstanceRules;
	}

	/**
	 * Replaces the list of clock instance rules used in the GtAutomaton computation by a new one.
	 * @param clockInstanceRules
	 */
	protected void setClockInstanceRules(
			List<ClockInstanceStoryDiagram> clockInstanceRules) {
		this.clockInstanceRules = clockInstanceRules;
	}
	
	/**
	 * Add a clock instance story diagram to this reachability computation.
	 * @param newClockInstanceStoryDiagram the clock instance story diagram to be added
	 * @return true if the clock instance story diagram was added successfully, false otherwise
	 */
	public boolean addToClockInstanceRules(ClockInstanceStoryDiagram newClockInstanceStoryDiagram){
		if (this.clockInstanceRules == null){
			this.clockInstanceRules = new ArrayList<ClockInstanceStoryDiagram>();
		}
		
		if (this.clockInstanceRules.contains(newClockInstanceStoryDiagram)){
			return false;
		}
		return this.clockInstanceRules.add(newClockInstanceStoryDiagram);
	}
	
	/**
	 * A variable binding assigns a value to a variable of a RealtimeStatechartInstance. If
	 * the RealtimeStatechartInstance is deleted, the variable bindings are deleted as well.
	 * All non-primitive values referred by the variables, however, remain in the GtStepGraph.
	 * For some variables, the stored values were only temporal values that are no longer 
	 * used by any other object in the GtStepGraph. These objects need to be removed from
	 * the GtStepGraph which is achieved by this clean-up method.
	 * 
	 * @param trans the GtAutomatonTransition leading to newState
	 * @param newState the GtStepGraph resulting from the application of a rule
	 */
	protected void cleanUpVariableBindings(GtAutomatonTransition trans, GtStepGraph newState){
		
		//analyze index map of trans to check which variable bindings have been deleted
		HashSet<VariableBinding> deletedVarBindings = new HashSet<VariableBinding>();
		for(Map.Entry<EObject, EObject> entry : trans.getIndex()){
			//if key is a variable Binding and value is not contained in changeable nodes of the new state, the variable binding has been deleted
			if(entry.getKey() instanceof VariableBinding 
					&& !newState.getChangeableNodes().contains(entry.getValue())){
				deletedVarBindings.add((VariableBinding)entry.getKey());
			}
		}
		
		//terminate, if no variable bindings have been deleted
		if (deletedVarBindings.isEmpty()) return;
		
		//obtain EObjects that were referenced by the deleted variable bindings (are contained in sourceState)
		//-> these are the candidates for deletion in newState
		HashSet<EObject> candidatesInSourceState = getEObjectsReferencedByVariableBindings(deletedVarBindings);
		
		//Step 1: obtain the same objects in newState -> detect which have already been deleted
		HashSet<EObject> candidatesForDeletion = new HashSet<EObject>();
		for(EObject obj : candidatesInSourceState){
			//retrieve corresponding object in newState from the index map
			EObject tgtObj = trans.getIndex().get(obj);
			
			//if object is still contained in newState, add it to the candidate list
			if(tgtObj != null){
				candidatesForDeletion.add(tgtObj);
				
				// add all directly and indirectly cross-referenced objects
				HashSet<EObject> referencedEObjects = new HashSet<EObject>();
				candidatesForDeletion.addAll(getAllReferencedObjects(tgtObj,referencedEObjects));
				
				// add all directly and indirectly contained objects
				TreeIterator<EObject> eAllContents = tgtObj.eAllContents();
				while(eAllContents.hasNext()){
					candidatesForDeletion.add(eAllContents.next());	
				}
			}
		}
		
		if(candidatesForDeletion.isEmpty()) return; //abort if no more candidates exist
		
		
		//Step 2: Obtain all objects that are still referenced by the current variable bindings in newState
		//-> these are still is use and cannot be deleted.
		HashSet<VariableBinding> newVariableBindings = new HashSet<VariableBinding>();
		for(EObject obj : newState.getChangeableNodes()){
			if(obj instanceof VariableBinding){
				newVariableBindings.add((VariableBinding) obj);
			}
		}
		
		HashSet<EObject> objectsInUseByCurrentVarBinding = getEObjectsReferencedByVariableBindings(newVariableBindings);
		
		//remove objects that are still in use by variable bindings from candidate set
		candidatesForDeletion.removeAll(objectsInUseByCurrentVarBinding);
		
		if(candidatesForDeletion.isEmpty()) return; //abort if no more candidates exist
		
		
		//Step 3: if candidate is contained in the nonchangeable nodes of the reachability graph, then it cannot be deleted
		//-> remove all unchangeable nodes from the candidate set
		candidatesForDeletion.removeAll(newState.getUnchangeableNodes());
		
		if(candidatesForDeletion.isEmpty()) return; //abort if no more candidates exist
		
		//Checks whether candidates are still used by other objects in the graphs which are not candidates itself
		//Both of the subsequent checks need to run in a loop because removing on object requires to recheck all others
		//(referred object which was a candidate in the first pass, might not be a candidate in the second pass any more
		boolean changed = true;
		while(changed){
			changed = false;
			
			//Step 4: Check whether a candidate is contained by an object in newState which is not in the candidate set
			//-> these objects are still used and cannot be deleted
			//-> check repeatedly until candidate set does not change anymore
			Iterator<EObject> objIter = candidatesForDeletion.iterator();
			while(objIter.hasNext()){
				EObject curCandidate = objIter.next();
				
				//check whether curCandidate is contained in any EObject by retrieving the eContainer value
				EObject container = curCandidate.eContainer();
				
				//if container is also a candidate for deletion, do nothing
				if(candidatesForDeletion.contains(container)) continue;
				
				//if container is in the StepGraph, then remove from candidate set
				//checking changeable nodes is sufficient, because unchangeable nodes have been removed in Step 3
				if(newState.getChangeableNodes().contains(container)){
					objIter.remove();
					changed = true;
				}
			} // end while(objIter.hasNext())
		
			if(candidatesForDeletion.isEmpty()) return; //abort if no more candidates exist
		
		
			//Step 5: Check whether an object, which is not a candidate for deletion itself, has a reference to a candidate
			//-> these objects are still used by other objects in the graph and cannot be deleted

			//iterate all objects in newState
			for(EObject curGraphObj : newState.getChangeableNodes()){
				
				//if object is a candidate for deletion -> skip it
				if(candidatesForDeletion.contains(curGraphObj)) continue;

				//iterate all of its references (attributes do not need to be checked because their values are not contained in the changeableNodes)
				for (EReference curRef : curGraphObj.eClass().getEAllReferences()) {
					// skip these references -> they do not contribute to the actual graph state
					if (curRef.isDerived() || !curRef.isChangeable()
							|| curRef.isContainer()) {
						continue;
					}

					// differentiate to-one references and to-many references
					if (curRef.getUpperBound() == 1) {
						Object refValue = curGraphObj.eGet(curRef);

						//if referenced object is a candidate for deletion, remove it from the list
						//because it is referenced by an object which is no candidate for deletion
						if(candidatesForDeletion.contains(refValue)){
							candidatesForDeletion.remove(refValue);
							changed = true;
						}

					} else { // to-many reference
						Collection srcContainer = (Collection) curGraphObj
								.eGet(curRef);

						// iterate all objects that are referenced by this to-many
						// link
						for (Object elem : srcContainer) {
							//if referenced object is a candidate for deletion, remove it from the list
							//because it is referenced by an object which is no candidate for deletion
							if(candidatesForDeletion.contains(elem)){
								candidatesForDeletion.remove(elem);
								changed = true;
							}
						}

					}
				}
				
				//check after each object whether any more candidates exist, because Step 5 is expensive
				if(candidatesForDeletion.isEmpty()) return; 
			}
			
		}//end while(changed)
		
		
		//Finally, delete all candidates (avoid concurrent modification exception by reinitializing iterator after each 
		//deletion)
		while(!candidatesForDeletion.isEmpty()){
			EObject curCandidate = candidatesForDeletion.iterator().next();
			candidatesForDeletion.remove(curCandidate);
			newState.getChangeableNodes().remove(curCandidate);
			EcoreUtil.delete(curCandidate, true);
		}
		
	}
	
	/**
	 * Helper function to collect all directly referenced objects and recursively all objects that are referenced by those. 
	 * @param tgtObj The object for which the referenced objects are collected
	 * @param referencedEObjects The objects that were already collected
	 * @return A set of all directly and indirectly referenced objects
	 */
	protected HashSet<EObject> getAllReferencedObjects(EObject tgtObj, HashSet<EObject> referencedEObjects) {
		
		//guard against NPE
		if(tgtObj != null){
			for(EObject referencedObject : tgtObj.eCrossReferences()){
				// prevent infinite loops in case of circular object structures
				if(!referencedEObjects.contains(referencedObject)) {
					// add the current object
					referencedEObjects.add(referencedObject);
					// recursively get all objects referenced by the directly referenced objects
					referencedEObjects.addAll(getAllReferencedObjects(referencedObject,referencedEObjects));
				}
			}
		}
		return referencedEObjects;
	}

	/**
	 * Helper function that returns all EObjects that are referenced by the VariableBindings given as a parameter.
	 * @param varBindings
	 * @return
	 */
	protected HashSet<EObject> getEObjectsReferencedByVariableBindings(HashSet<VariableBinding> varBindings){
		HashSet<EObject> result = new HashSet<EObject>();
		
		//iterate all variable bindings and collect objects in the result set
		for(VariableBinding curBinding : varBindings){
			if(curBinding.getValue() instanceof EObject){
				result.add((EObject)curBinding.getValue());
			}
		}
		
		return result;
	}
	
	/**
	 * If a timed story diagram calls another timed story diagram that needs to return a
	 * primitive type, then we need to use wrapper objects that encapsulate the primitive
	 * value. These objects remain in the GtStepGraph, which is neither necessary nor
	 * wanted. This method deletes these helper objects.
	 * @param tempState
	 */
	private void cleanUpPrimitiveTypeWrappers(GtStepGraph tempState) {
		
		Iterator<EObject> objIter = tempState.getChangeableNodes().iterator();
		while(objIter.hasNext()){
			
			EObject curObj = objIter.next();
			if (curObj instanceof BoolWrapper ||
			    curObj instanceof IntWrapper  ||
			    curObj instanceof LongWrapper ||
			    curObj instanceof StringWrapper ||
			    curObj instanceof DoubleWrapper){
					
					//remove object from the GtStepGraph and delete it
					objIter.remove();
					EcoreUtil.delete(curObj, true);
			}
		}
		
	}

	/**
	 * Usually, the Gt-Automaton will be computed for a MechatronicUML model that contains 
	 * variable bindings for all the statecharts appearing in this model. Due to limitations
	 * of the story diagram interpreter and OCL, these variable bindings may often contain
	 * LiteralExpressions instead of the corresponding literal. This function checks all
	 * variable bindings in the GtStepGraph given as a parameter and replaces LiteralExpressions
	 * by the corresponding values. This function is intended to be removed after providing
	 * sufficient functionality in the story diagram interpreter.
	 * 
	 * TODO: We should eventually get rid of this method after having a consistent type model and
	 * a better approach for handling assignments to MUML variable in story diagrams.
	 * @param step
	 */
	protected void sanitizeVariableBindings(GtStepGraph step){

		//variable bindings needs to be changeable => iterate changeable nodes and search for them
		for(EObject obj : step.getChangeableNodes()){
			if (obj instanceof VariableBinding){
				VariableBinding varBinding = (VariableBinding) obj;
				Object curValue = varBinding.getValue();
				
				//check whether the varBinding contains a LiteralExpression
				if(curValue instanceof LiteralExpression){
					//cast value to the type of the variable, needs to be a primitive type 
					//(otherwise it wouldn't be a LiteralExpression)
					switch (((PrimitiveDataType)varBinding.getVariable().getDataType()).getPrimitiveType()){
					case UINT64:
					case INT64: varBinding.setValue(Long.parseLong(((LiteralExpression) curValue).getValue()));
								break;
					case UINT32:
					case INT32: varBinding.setValue(Integer.parseInt(((LiteralExpression) curValue).getValue()));
								break;
					case UINT16:
					case INT16: varBinding.setValue(Short.parseShort(((LiteralExpression) curValue).getValue()));
								break;
					case UINT8:
					case INT8: varBinding.setValue(Byte.parseByte(((LiteralExpression) curValue).getValue()));
								break;
					case DOUBLE: varBinding.setValue(Double.parseDouble(((LiteralExpression) curValue).getValue()));
								break;
					case VOID: varBinding.setValue(null);
								break;
					case BOOLEAN: varBinding.setValue(Boolean.parseBoolean(((LiteralExpression) curValue).getValue()));
								break;
					}
				}
			}
		}
		
	}

}
