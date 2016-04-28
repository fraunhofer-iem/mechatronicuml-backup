package org.muml.storydiagram.reachanalysis.sdm;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.muml.core.expressions.Expression;
import org.muml.core.reachanalysis.core.HashLevel;
import org.muml.core.reachanalysis.core.ReachabilityComputation;
import org.muml.core.reachanalysis.core.ReachabilityComputationStatistics;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.activities.ActivityEdge;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.interpreter.core.StoryDrivenInterpreter;
import org.muml.storydiagram.interpreter.core.eclipse.EclipseExpressionInterpreterManager;
import org.muml.storydiagram.interpreter.core.facade.StoryDrivenMetamodelFacadeFactory;
import org.muml.storydiagram.interpreter.core.mdelab.SDMException;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.NotificationEmitter;
import org.muml.storydiagram.interpreter.core.mdelab.variables.Variable;
import org.muml.storydiagram.interpreter.core.notifications.StoryDrivenNotificationEmitter;
import org.muml.storydiagram.interpreter.core.notifications.StoryDrivenOutputStreamNotificationReceiver;
import org.muml.storydiagram.patterns.AbstractLinkVariable;
import org.muml.storydiagram.patterns.AbstractVariable;
import org.muml.storydiagram.patterns.StoryPattern;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.GraphTransformationSystem;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMReachabilityGraph;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmFactory;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SuccessorStepGraphs;

public class SDMReachabilityComputation extends ReachabilityComputation {

	/**
	 * The objects that will constitute the initial graph.
	 */
	private Set<EObject> initialGraphObjects;

	/**
	 * All nodes that are typed over one of the classes contained in this set
	 * will be considered as unchangeable nodes.
	 */
	private Set<EClass> classesOfUnchangeableNodes;

	/**
	 * The hash computation for a step graph needs to consider the hash values
	 * of unchangeable nodes. Since the attribute hashes of these objects do not
	 * changed during the reachability analysis, this map stores the hash values
	 * for these objects.
	 */
	private HashMap<EObject, Long> attributeHashOfUnchangeableNodes;

	/**
	 * The activities to be used in the reachability analysis.
	 */
	private List<Activity> activities;

	/**
	 * The copy function for StepGraphs creates an index map which assigns
	 * objects of the source state to objects of the copy. If this flag is set
	 * to true, this map is stored until the end of the reachability
	 * computation. If it is set to true, the map will be deleted after one
	 * expansion step.
	 */
	private boolean storeIndexMap = false;

	/**
	 * The forEach transformation may automatically extend the provided activities 
	 * such that the matching obtained in the first activity node is stored
	 * in the reference matching of the SDMTransition. If the flag is set to false,
	 * no matching will be stored.
	 * If this flag is set to true, the matchings will be stored. 
	 */
	private boolean storeMatching = false;
	
	/**
	 * The analysis may identify subgraphs of the initial graph which may never be
	 * changed by the given set of activities. Then, the analysis can exploit that
	 * knowledge by storing the unchangeable subgraphs only once for the whole
	 * reachability graph. The identification, however, is costly.
	 */
	private boolean identifyUnchangeableSubgraphs = true;
	
	/**
	 * Static queue to store the sorted hash values which are computed for the
	 * states within one state. This sorting of hashes is necessary to obtain
	 * canonical hash values.
	 */
	protected static PriorityQueue<Long> hashQueue;
	
	/**
	 * The object for computing isomorphisms between two states.
	 */
	protected final Isomorphism isomorphismComputation;
	
	/**
	 * For making the EcoreUtil work for deleting objects during a reachability
	 * analysis, we need to clone the initialGraphObjects provided to the 
	 * reachability computation. The maps associates the objects provided
	 * by the user to the objects contained in the initial state of the 
	 * reachability graph.
	 */
	protected EMap<EObject, EObject> initialObjectMapping;

	/**
	 * This static instance of the {@link SDMReachabilityComputation} is only to
	 * be accessed by the static method copyStepGraph. It is needed for
	 * accessing the non-static copy methods. The copy methods are intended to
	 * be non-static in order to support inheritance.
	 */
	private static SDMReachabilityComputation reachCompForCopyStepGraph;
	
	/**
	 * Two-dimensional array which contains all input Activities in the first row
	 * and all corresponding forEach-Activities in the second row. While the 
	 * reachability analysis is carried out based on forEach-Activities, the 
	 * SDMTransitions shall be labeled with the input Activities. This array is 
	 * used to resolve the correspondence.
	 */
	private Activity[][] ruleMapping ;
	
	/**
	 * Store repeatedly used factory in a final field.
	 */
	private final SdmFactory sdmFactory = SdmFactory.eINSTANCE;
	
	/**
	 * The temporary resource containing parts of the currently computed reachability graph.
	 */
	private Resource theResource;

	/**
	 * Constructor, this empty constructor should only be used for testing
	 * purpose.
	 */
	protected SDMReachabilityComputation() {
		super();
		isomorphismComputation = createIsomorphismCompuatation();
		hashQueue = new PriorityQueue<Long>();
		setAttributeHashOfUnchangeableNodes(new HashMap<EObject, Long>());
		setClassesOfUnchangeableNodes(new HashSet<EClass>());
		reachCompForCopyStepGraph = this;
	}

	/**
	 * Constructor
	 * 
	 * @param initialGraphObjects
	 *            the set of object which form the initial graph
	 * @param activities
	 *            the list of story diagrams that are used for the reachability
	 *            analysis
	 */
	public SDMReachabilityComputation(Set<EObject> initialGraphObjects,
			List<Activity> activities) {
		this();

		this.initialGraphObjects = initialGraphObjects;
		this.activities = activities;
	}

	/**
	 * Add an activity to this reachability computation.
	 * 
	 * @param newActivity
	 *            the activity to be added
	 * @return true if the activity was added successfully, false otherwise
	 */
	public boolean addToActivities(Activity newActivity) {
		if (this.activities == null) {
			this.activities = new ArrayList<Activity>();
		}

		if (this.activities.contains(newActivity)) {
			return false;
		}
		return this.activities.add(newActivity);
	}

	/**
	 * Return true if the activity given as a parameter is contained in the list
	 * of activities of this reachability analysis.
	 * 
	 * @param activity
	 * @return
	 */
	public boolean hasInActivities(Activity activity) {
		return this.activities.contains(activity);
	}

	/**
	 * Returns an iterator that allows to iterate all activities in this
	 * reachability computation.
	 * 
	 * @return
	 */
	public Iterator<Activity> iteratorOfActivities() {
		return this.activities.iterator();
	}

	/**
	 * Returns the number of activities in this reachability computation.
	 * 
	 * @return
	 */
	public int sizeOfActivities() {
		return this.activities.size();
	}

	/**
	 * Removes the activity given as a parameter from this reachability
	 * computation.
	 * 
	 * @param activity
	 * @return true if the removal was successful, false otherwise
	 */
	public boolean removeFromActivities(Activity activity) {
		return this.activities.remove(activity);
	}

	/**
	 * Returns whether the index map of SDMTransitions is stored or not.
	 * 
	 * @return
	 */
	public boolean isStoreIndexMap() {
		return storeIndexMap;
	}

	/**
	 * Sets whether the index map of SDMTransitions is stored or not.
	 * 
	 * @return
	 */
	public void setStoreIndexMap(boolean value) {
		this.storeIndexMap = value;
	}
	
	/**
	 * Returns whether the matching annotated at SDMTransitions is stored or not.
	 * 
	 * @return
	 */
	public boolean isStoreMatching() {
		return storeMatching;
	}

	/**
	 * Sets whether the matching annotated at SDMTransitions is stored or not.
	 * 
	 * @return
	 */
	public void setStoreMatching(boolean storeMatching) {
		this.storeMatching = storeMatching;
	}
	
	/**
	 * Returns whether the analysis tries to identify unchangeable subgraphs.
	 * @return
	 */
	public boolean isIdentifyUnchangeableSubgraphs() {
		return identifyUnchangeableSubgraphs;
	}

	/**
	 * Sets whether the analysis tries to identify unchangeable subgraphs.
	 * @return
	 */
	public void setIdentifyUnchangeableSubgraphs(
			boolean identifyUnchangeableSubgraphs) {
		this.identifyUnchangeableSubgraphs = identifyUnchangeableSubgraphs;
	}

	/**
	 * Creates a new ReachabilityGraph. This method has to be overriden in order
	 * to instantiate subclasses of ReachabilityGraph if this is necessary for
	 * special algorithms.
	 * 
	 * @return
	 */
	protected ReachabilityGraph createReachabilityGraph() {
		SDMReachabilityGraph result = sdmFactory.createSDMReachabilityGraph();
		
		//create temporary resource for this reachability graph. It recursively contains all
		//states and transitions as well as all graph objects referenced by the changeable 
		//nodes of the states -> needed for the EcoreUtil.delete operation to work properly
		createTempResource(result);
		
		return result;
	}
	
	/**
	 * Creates a new StepGraph object. Subclasses are intended to override this method if they
	 * operate on subclasses of StepGraph instead of using the StepGraph as is.
	 * @return
	 */
	protected StepGraph createStepGraph(){
		return sdmFactory.createStepGraph();
	}
	
	/**
	 * Creates a new SDMTransition object. Subclasses are intended to override this method if they
	 * operate on subclasses of SDMTransition instead of using the SDMTransition as is.
	 * @return
	 */
	protected SDMTransition createSDMTransition(){
		return sdmFactory.createSDMTransition();
	}
	
	/**
	 * Creates a resource that will host all reachability graph objects and the reachability graph
	 * itself. This resource is needed to make the EcoreUtil.delete function work as expected.
	 */
	protected void createTempResource(ReachabilityGraph reachGraph){
		
		// Register the XMI resource factory for the .sdmReachGraph extension
	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("sdmReachGraph", new XMIResourceFactoryImpl());

	    // Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();

	    // create a resource
	    theResource = resSet.createResource(URI.createURI("reachGraphs/tmpReachGraph.sdmReachGraph"));
	    
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    theResource.getContents().add(reachGraph);
	}

	@Override
	protected void initialize() {
		
		//delete all explicit "null" entries from initialGrpahObjects to prevent NPEs in successive algorithms
		Iterator<EObject> iter = initialGraphObjects.iterator();
		while(iter.hasNext()){
			if (iter.next() == null){
				iter.remove();
			}
		}
		
		//all objects which are contained in the initial graph objects also need to be added
		//to the initial graph. Otherwise, the containments will cause the source graph to be
		//changed during a copy operation and a to-many containment will cause ConcurrentModification
		//exceptions.
		extendByContainedObjects(initialGraphObjects);
		
		if (activities != null) {
			
			//compute objects contained in the initial graph objects that cannot be changed by the
			//given rule set
			computeUnchangeableNodes();
			
			//performs the forEach Transformation and updates the rules container
			prepareActivities();
		} else {
			this.activities = new ArrayList<Activity>();
		}
	}

	
	/**
	 * Extends the given set of objects by  all objects which are contained 
	 * in these. They need to be added, because, otherwise, the containments will cause 
	 * the source graph to be changed during a copy operation and a to-many containment 
	 * will cause ConcurrentModificationExceptions.
	 * @param objects
	 */
	protected void extendByContainedObjects(Set<EObject> objects) {
		
		assert(objects == null);
		
		//initialize Deque
		Deque<EObject> todo = new ArrayDeque<EObject>();
		for(EObject curObj : objects){
			//the set may contain "null" as an explicit entry, a Deque crashes with an NPE when inserting null
			if(curObj != null){
				todo.add(curObj);
			}
		}
		
		// iterate all objects
		while(!todo.isEmpty()){
			EObject curObj = todo.poll();
			
			//iterate all containment references
			for(EReference curRef : curObj.eClass().getEAllContainments()){
				// differentiate to-one references and to-many references
				if (curRef.getUpperBound() == 1) {
					Object refValue = curObj.eGet(curRef);
					
					//treat object if there is any
					if(refValue != null && refValue instanceof EObject){
						if (!todo.contains(refValue) && ! objects.contains(refValue)){
							objects.add((EObject)refValue);
							todo.add((EObject)refValue);
						}
					}

				} else { // to-many reference
					Collection<?> container = (Collection<?>) curObj.eGet(curRef);

					// iterate all objects that are referenced by this to-many link
					for (Object refValue : container) {
						if (refValue instanceof EObject) {
							//add to containers if it is not already contained
							if (!todo.contains(refValue) && ! objects.contains(refValue)){
								objects.add((EObject)refValue);
								todo.add((EObject)refValue);
							}
						}
					}
				}
			}
		} //End While
	}
	
	/**
	 * Helper function that computes which of the provided initial graph objects will never be
	 * changed by the given set of rules. The classes of these nodes are stored in the container
	 * classesOfUnchangeableNodes.
	 */
	protected void computeUnchangeableNodes(){
		// compute which of the provided initial graph objects will never be
		// changed by the given set of rules
		long sysTime = System.currentTimeMillis();
		if (identifyUnchangeableSubgraphs){
			UnchangeableNodesIdentification nodeIdentification = new UnchangeableNodesIdentification();
			this.setClassesOfUnchangeableNodes(nodeIdentification.identifyUnchangeableNodes(
					activities, initialGraphObjects));
		} else {
			this.setClassesOfUnchangeableNodes(new HashSet<EClass>());
		}

		if (! getClassesOfUnchangeableNodes().isEmpty()) {
			// remove unchangeable objects from the initial graph objects
			Iterator<EObject> iter = initialGraphObjects.iterator();
			while (iter.hasNext()) {
				EObject curObj = iter.next();
				if (getClassesOfUnchangeableNodes().contains(curObj.eClass())) {
					// add unchangeable node to the respective container of the
					// ReachabilityGraph
					((SDMReachabilityGraph) this.getReachabilityGraph())
					.getUnchangeableNodes().add(curObj);
					
					// add unchangeable node to containedUnchangeableNodes if it is not
					// contained in any other resource. Then, they are automatically added to the resource
					//and the ReachabilityGraph may be serialized to a file.
					if(curObj.eContainer() == null){
						//we add objects that are currently not contained in any other object to the "containedObjects" 
						//reference of the StepGraph. Then, they are automatically added to the resource.
						((SDMReachabilityGraph)this.getReachabilityGraph()).getContainedUnchangeableNodes().add(curObj);
					}

					// compute hash value for unchangeable node
					getAttributeHashOfUnchangeableNodes().put(curObj,
							computeAttributeHash(curObj));

					// remove unchangeable node from the initial graph nodes
					// that will
					// become changeable nodes
					iter.remove();
				}
			}
		}
		((SDMReachabilityComputationStatistics)stats).timeForUnchangeableNodeIdentifiation = System.currentTimeMillis() - sysTime;

	}

	@Override
	protected HashSet<? extends ReachabilityGraphState> computeSuccessors(
			ReachabilityGraphState state) {

		HashSet<ReachabilityGraphState> result = new HashSet<ReachabilityGraphState>();
		
		// validate that the given state is indeed a StepGraph
		if (!(state instanceof StepGraph)) {
			throw new UnsupportedOperationException(
					"Cannot process states of type "
							+ state.getClass().getName()
							+ " in SDM Reachability Analysis.");
		}
		StepGraph step = (StepGraph) state;
		
		// iterate and apply all activities
		Iterator<Activity> it = iteratorOfActivities();
		while (it.hasNext()) {
			Activity curActivity = it.next();

			//apply the activity
			SuccessorStepGraphs successors = sdmFactory.createSuccessorStepGraphs();
			callInterpreter(step, curActivity, successors);

			// if no successor object has been retrieved, return without
			// successors
			if (successors == null) {
				return new HashSet<StepGraph>();
			}

			// annotate activity at the transition
			for (StepGraph curState : successors.getSuccessors()) {
				SDMTransition trans = (SDMTransition) curState
						.getIncomingTransitions().get(0);
				trans.setAppliedActivity(getInputActivityFromMapping(curActivity));
				
				//Delete index map if it should not be preserved
				if (!storeIndexMap) {
					trans.getIndex().clear();
				}
				//Delete matching if it should not be preserved
				if(!storeMatching){
					trans.getMatching().clear();
				}
			}

			// add them to the rule result
			result.addAll(successors.getSuccessors());
		}

		return result;
	}

	/**
	 * Helper functions that creates the parameters for the SDM interpreter,
	 * calls it, and returns the result.
	 * 
	 * @param step
	 *            the GtStepGraph on which the activity has to be applied
	 * @param activity
	 *            a timed story diagram, invariant story diagram, or clock
	 *            instance story diagram to be applied on step
	 * @param returnValue
	 *            either an instance of SuccessorGtStepGraph in case of a timed
	 *            story diagram or an instance of BoundClockInstances in case of
	 *            an invariant story diagram or clock instance story diagram.
	 * @return
	 */
	protected Map<String, Variable<EClassifier>> callInterpreter(StepGraph step,
			Activity activity, EObject returnValue) {

		// create parameter for the given state which will be passed to the
		// interpreter
		List<Variable<EClassifier>> parameters = new ArrayList<Variable<EClassifier>>();
		Variable<EClassifier> v1 = new Variable<EClassifier>("step", step.eClass(), step);
		parameters.add(v1);
		
		// if a return value is needed, create a parameter for it which 
		// will be passed to the interpreter
		if(returnValue != null) {
			Variable<EClassifier> v2 = new Variable<EClassifier>("result", returnValue.eClass(), returnValue);
			parameters.add(v2);
		}

		// call interpreter
		StoryDrivenInterpreter interpreter;

		try {
			interpreter = new StoryDrivenInterpreter(createExpressionInterpreterManager(),
								createNotificationEmitter());
			return interpreter.executeActivity(activity, parameters);

		} catch (SDMException e) {
			// TODO: Error handling if interpretation fails
			e.printStackTrace();
		}
		return new HashMap<String, Variable<EClassifier>>();
	}

	@Override
	protected ReachabilityGraphState createInitialState() {
		
		//clone Initial graph objects to avoid that they move into a different resource
		//first, set up graph and transition for using the normal copyState method
		StepGraph tempState = createStepGraph();
		tempState.getChangeableNodes().addAll(initialGraphObjects);
		SDMTransition tempTrans = createSDMTransition();
		
		//copy the objects
		StepGraph initialState = (StepGraph) this.copyState(tempState, tempTrans);

		//store the index in the initialObjectMapping
		initialObjectMapping = tempTrans.getIndex();
		
		addGraphObjectsToResource(initialState);
		return initialState;
	}

	@Override
	protected void computeHashValue(ReachabilityGraphState state) {
		long hash = 23;
		hashQueue.clear();

		StepGraph step = (StepGraph) state;

		HashMap<EObject, Long> lowerLevelObjectHash = null;
		HashMap<EObject, Long> currentLevelObjectHash = new LinkedHashMap<EObject, Long>();
		// compute Level 0 hash => compute attribute hash for each object
		for (EObject obj : step.getChangeableNodes()) {
			currentLevelObjectHash.put(obj, computeAttributeHash(obj));
		}

		for (int i = HashLevel.LEVEL1_VALUE; i <= this.getHashLevel().getValue(); i++) {
			lowerLevelObjectHash = currentLevelObjectHash;
			currentLevelObjectHash = new LinkedHashMap<EObject, Long>();

			for (EObject obj : step.getChangeableNodes()) {
				currentLevelObjectHash.put(obj,
						computeNeighborhoodHash(obj, lowerLevelObjectHash));
			}
		}

		// sort the hashes using a priority queue
		for (Long l : currentLevelObjectHash.values()) {
			hashQueue.offer(l);
		}

		// compute the hash value for the state

		while (!hashQueue.isEmpty()) {
			hash = hash * 53 + hashQueue.poll();
		}

		step.setHash(hash);

	}

	/**
	 * Computes the level 0 attribute hash for the nodes contained in this
	 * StepGraph. The level 0 hash only considers the EAttributes of the given
	 * EObject obj, but it does not consider the references.
	 * 
	 * @param obj
	 *            the object for which an attribute hash is to be computed
	 */
	protected long computeAttributeHash(EObject obj) {

		// initialize hash with the class name's hash code
		long hash = obj.getClass().hashCode();

		// iterate all attributes and get the hash codes of their values
		for (EAttribute attr : obj.eClass().getEAllAttributes()) {
			Object attrValue = obj.eGet(attr);
			if (attrValue != null) {
				
				//check for EObject type -> may happen if EDataType mapping of Java object type contains EObjects
				if(!(attrValue instanceof EObject)){
					hash = hash * 37 + attrValue.hashCode();
				}
			}
		}

		return hash;
	}

	/**
	 * Computes the higher level hashes for the nodes contained in this
	 * StepGraph. Higher level hashes consider the so-called neighborhood of the
	 * EObject obj. The neighborhood of obj are all EObjects to which obj has a
	 * reference. For computing the Level n hash of obj, we use the Level (n-1)
	 * hashes of the object in the neighborhood of obj.
	 * 
	 * @param obj
	 *            the object for which a hash is to be computed
	 * @param lowerLevelHashes
	 *            the Level (n-1) hashes of all objects in the current graph
	 */
	protected long computeNeighborhoodHash(EObject obj,
			HashMap<EObject, Long> lowerLevelHashes) {

		long hash = lowerLevelHashes.get(obj);

		// iterate all attributes and check whether they reference an EObject
		// -> may happen if EDataType mapping of Java object type contains EObjects
		for (EAttribute attr : obj.eClass().getEAllAttributes()) {
			Object attrValue = obj.eGet(attr);
			if (attrValue != null) {
				//check for EObject that is part of the graph 
				if(attrValue instanceof EObject && lowerLevelHashes.containsKey(attrValue)){
					hash = hash * attr.getName().hashCode()
							* lowerLevelHashes.get(attrValue);
				}
			}
		}
		
		// iterate all references, check if target objects are in the graph
		// and get their hash codes.
		for (EReference curReference : obj.eClass().getEAllReferences()) {
			
			//skip derived references -> do not contribute to object state and produce overhead
			if(curReference.isDerived()) continue;

			// differentiate to-one references and to-many references
			if (curReference.getUpperBound() == 1) {
				Object referencedValue = obj.eGet(curReference);
				// if the reference points to a value, consider the name of the
				// reference and
				// the hash value of the referenced object for computing the
				// hash
				if (referencedValue != null
						&& lowerLevelHashes.containsKey(referencedValue)) {
					hash = hash * curReference.getName().hashCode()
							* lowerLevelHashes.get(referencedValue);
				} else if (referencedValue != null
						&& getAttributeHashOfUnchangeableNodes()
								.containsKey(referencedValue)) {
					hash = hash
							* curReference.getName().hashCode()
							* getAttributeHashOfUnchangeableNodes()
									.get(referencedValue);
				}
			} else {
				Collection<?> refContainer = (Collection<?>) obj.eGet(curReference);
				if (refContainer == null)
					continue;
				for (Object referencedValue : refContainer) {
					if (lowerLevelHashes.containsKey(referencedValue)) {
						hash = hash * curReference.getName().hashCode()
								* lowerLevelHashes.get(referencedValue);
					} else if (referencedValue != null
							&& getAttributeHashOfUnchangeableNodes()
									.containsKey(referencedValue)) {
						hash = hash
								* curReference.getName().hashCode()
								* getAttributeHashOfUnchangeableNodes()
										.get(referencedValue);
					}
				}
			}

		}

		return hash;
	}

	/**
	 * This static method is only meant to be accessed by the story diagram
	 * interpreter which currently is only able to call static methods.
	 * 
	 * @param state
	 *            the StepGraph to be copied
	 * @param trans
	 *            the transition to the state to be copied
	 * @return a copy of state
	 */
	public static StepGraph copyStepGraph(StepGraph state, SDMTransition trans) {
		if (reachCompForCopyStepGraph == null) {
			reachCompForCopyStepGraph = new SDMReachabilityComputation();
		}

		return (StepGraph) reachCompForCopyStepGraph.copyState(state, trans);
	}

	@Override
	public ReachabilityGraphState copyState(ReachabilityGraphState state,
			ReachabilityGraphTransition trans) {
		
		long time = System.currentTimeMillis();

		// cast state and transition
		if (!(trans instanceof SDMTransition)) {
			throw new UnsupportedOperationException(
					"Cannot process transition type "
							+ trans.getClass().getName()
							+ " in SDM Reachability Analysis.");
		}
		SDMTransition sdmTrans = (SDMTransition) trans;
		if (!(state instanceof StepGraph)) {
			throw new UnsupportedOperationException(
					"Cannot process states of type "
							+ state.getClass().getName()
							+ " in SDM Reachability Analysis.");
		}
		StepGraph source = (StepGraph) state;

		// create target state and link to transition
		EFactory eFactory = state.eClass().getEPackage().getEFactoryInstance();
		StepGraph copy = (StepGraph) eFactory.create(state.eClass());
		trans.setSource(source);
		trans.setTarget(copy);

		// retrieve index map which associates objects of the source graph
		// with their copies in the copy graph
		EMap<EObject, EObject> index = sdmTrans.getIndex();

		// iterate all objects in the graph and make a copy
		for (EObject curSrcObj : source.getChangeableNodes()) {
			// get copy of object from the graph and add to the copied state
			EObject curTgtObj = getOrCreateCopy(curSrcObj, index);
			copy.getChangeableNodes().add(curTgtObj);

			// copy all attributes
			for (EAttribute curAttribute : curSrcObj.eClass()
					.getEAllAttributes()) {
				Object attributeValue = curSrcObj.eGet(curAttribute);
				if (attributeValue != null && curAttribute.isDerived() == false
						&& curAttribute.isUnsettable() == false) {
					
					//consider wrapped JavaObjects in EDataTypes that may reference EObjects contained in the graph
					if(attributeValue instanceof EObject && source.getChangeableNodes().contains(attributeValue)){
						curTgtObj.eSet(curAttribute, getOrCreateCopy((EObject)attributeValue, index));
					} else {
						curTgtObj.eSet(curAttribute, attributeValue);
					}
				}
			}

			// copy references
			for (EReference curRef : curSrcObj.eClass().getEAllReferences()) {
				// only try to copy references that are not derived and not
				// unsettable, will result in NullPointerException
				if (curRef.isDerived() || !curRef.isChangeable()
						|| curRef.isContainer()) {
					continue;
				}

				// differentiate to-one references and to-many references
				if (curRef.getUpperBound() == 1) {
					Object refValue = curSrcObj.eGet(curRef);
					
					if (source.getChangeableNodes().contains(refValue)) {
						// ref points to an object of the source graph => add
						// reference to copy to the tgtObj
						curTgtObj.eSet(curRef,
								getOrCreateCopy((EObject) refValue, index));
					} else {
						if (refValue != null && curTgtObj.eGet(curRef) == null) {
							// otherwise keep reference as it is
							curTgtObj.eSet(curRef, refValue);
						}
					}

				} else { // to-many reference
					Collection srcContainer = (Collection) curSrcObj
							.eGet(curRef);
					Collection tgtContainer = (Collection) curTgtObj
							.eGet(curRef);

					// iterate all objects that are referenced by this to-many
					// link
					for (Object elem : srcContainer) {
						if (elem instanceof EObject) {
							// check whether EObject elem is contained in the
							// source graph
							if (source.getChangeableNodes().contains(elem)) {
								tgtContainer.add(getOrCreateCopy(
										(EObject) elem, index));
							} else {
								tgtContainer.add(elem);
							}
						} else { // if it's no EObject, it can't be contained in
									// the source graph => keep reference
							tgtContainer.add(elem);
						}
					}

				}
			}
		}
		
		//finally add all objects of the copy to the temporary resource, if one is present
		if(theResource != null){
			//add newState and trans to resource
			theResource.getContents().add(copy);
			theResource.getContents().add(trans);
			//add changeable graph objects of copy to resource
			addGraphObjectsToResource(copy);
		}
		
		((SDMReachabilityComputationStatistics)stats).timeForStateCopy += (System.currentTimeMillis() - time);

		return copy;
	}

	/**
	 * Helper function that returns the object in the copied graph which belongs
	 * to the srcObj of the source graph. The object will either be returned if
	 * it already exists or it will be created.
	 * 
	 * @param srcObj
	 *            an object of the source graph
	 * @param index
	 *            the index function mapping objects of the source graph to
	 *            objects of the target graph
	 * @return the object in the target graph which was created as a copy of
	 *         srcObj
	 */
	protected EObject getOrCreateCopy(EObject srcObj,
			EMap<EObject, EObject> index) {
		EObject result = index.get(srcObj);
		if (result == null) {
			// get the factory of the package and create empty object
			EFactory eFactory = srcObj.eClass().getEPackage()
					.getEFactoryInstance();
			result = eFactory.create(srcObj.eClass());
			index.put(srcObj, result);
		}
		return result;
	}
	
	/**
	 * Adds all changeable graph objects to the resource that are not contained in any other object.
	 */
	protected void addGraphObjectsToResource(StepGraph state){
		
		//guard against NPE
		if(state == null) return;
		
		//iterate all changeable graph nodes
		for(EObject curObj : state.getChangeableNodes()){
			if(curObj.eContainer() == null){
				//we add objects that are currently not contained in any other object to the "containedObjects" 
				//reference of the StepGraph. Then, they are automatically added to the resource.
				state.getContainedNodes().add(curObj);
			}
		}
	}

	@Override
	protected boolean isIsomorphic(ReachabilityGraphState state1,
			ReachabilityGraphState state2) {

		// isomorphisms can only be computed for StepGraphs
		if (!(state1 instanceof StepGraph) || !(state2 instanceof StepGraph)) {
			throw new UnsupportedOperationException(
					"Cannot compute isomorphism between " + "objects of types "
							+ state1.getClass().getName() + " and "
							+ state2.getClass().getName());
		}

		// return the result of the isomorphism computation
		return isomorphismComputation.computeIsomorphism((StepGraph) state1,
				(StepGraph) state2);
	}
	
	@Override
	protected void redirectTransition(ReachabilityGraphState oldState, ReachabilityGraphTransition transition, ReachabilityGraphState newState){
		super.redirectTransition(oldState, transition, newState);
		
		if(!(transition instanceof SDMTransition)){
			throw new UnsupportedOperationException("Cannot process transitions of type " 
						+ transition.getClass());
		}
		
		//adjust index mapping if the index mapping is stored
		if(isStoreIndexMap()){
			SDMTransition sdmTrans = (SDMTransition) transition;
			EObject[] indexKeys = new EObject[sdmTrans.getIndex().keySet().size()];
			
			//these objects are contained in the newState which is to be deleted because it is isomorphic to the oldState
			EObject[] newStateIndexValues = new EObject[sdmTrans.getIndex().keySet().size()];
			
			//these objects are contained in the oldState and are isomorphic to the ones in newStateIndexValues
			EObject[] oldStateIndexValues = new EObject[sdmTrans.getIndex().keySet().size()];
			
			//write current index keys and values of the transition to arrays 
			int i = 0;
			for(Map.Entry<EObject, EObject> curEntry : sdmTrans.getIndex().entrySet()){
				indexKeys[i] = curEntry.getKey();
				newStateIndexValues[i] = curEntry.getValue();
				i++;
			}
			
			//exploit isomorphism to obtain objects in the oldState for updating the index
			//objects in newStateIndexValue appear in rightMapping of the isomorphism
			//isomorphic object of oldState appears at the same array index in leftMapping
			for(i = 0; i < newStateIndexValues.length; i++){
				int arrayIndex = isomorphismComputation.getObjectInRightMapping(newStateIndexValues[i]);
				if(arrayIndex >= 0){
					oldStateIndexValues[i] = isomorphismComputation.leftMapping[arrayIndex];
				} else {
					oldStateIndexValues[i] = null;
				}
			}
			
			//clear the index
			sdmTrans.getIndex().clear();
			
			//put the new entries
			for(i = 0; i < indexKeys.length; i++){
				sdmTrans.getIndex().put(indexKeys[i], oldStateIndexValues[i]);
			}
		}
	}

	public Set<EObject> getInitialGraphObjects() {
		if (this.initialGraphObjects == null) {
			this.initialGraphObjects = new HashSet<EObject>();
		}
		return initialGraphObjects;
	}

	public List<Activity> getActivities() {
		if (activities == null) {
			this.activities = new ArrayList<Activity>();
		}
		return activities;
	}

	@Override
	protected ReachabilityComputationStatistics createStatisticsObject() {
		return new SDMReachabilityComputationStatistics((SDMReachabilityGraph)this.getReachabilityGraph());
	}
	
	/**
	 * Creates the isomorphism computation object that is used throughout the reachability computation. 
	 * Subclasses may register a specialized isomorphism computation by overriding this method. 
	 * @return
	 */
	protected Isomorphism createIsomorphismCompuatation(){
		return new Isomorphism();
	}
	
	@Override
	public SDMReachabilityComputationStatistics getReachabilityComputationStatistics(){
		return (SDMReachabilityComputationStatistics) stats;
	}
	
	protected void prepareActivities(){
		// transform the given set of rules into forEach rules that fulfill
		// the needs of the reachability analysis
		long sysTime = System.currentTimeMillis();
		List<Activity> forEachActivities = createForEachRules(activities, getClassesOfUnchangeableNodes());
		
		establishRuleMapping(forEachActivities);
		
		//replace input activities by forEachActivities that are used for the reachability analysis
		activities = forEachActivities;
		((SDMReachabilityComputationStatistics)stats).timeForRuleTransformation = System.currentTimeMillis() - sysTime;
	}
	
	/**
	 * Establishes the rule mapping that associates internally used forEach Rules
	 * to the Activities that were provided as inputs by the user.
	 * @param forEachActivities
	 */
	protected void establishRuleMapping(List<? extends Activity> forEachActivities){
		//establish rule mapping
		int i = 0;
		this.ruleMapping = new Activity[2][activities.size()];
		
		for(Activity curAct : activities){
			ruleMapping[0][i] = curAct;

			//search for corresponding
			for(Activity forEachAct : forEachActivities){
				if(forEachAct.getName().startsWith(curAct.getName())){
					ruleMapping[1][i] = forEachAct;
					break;
				}
			}

			i++;
		}
	}
	
	/**
	 * Transforms the inputs for the reachability computation such that they can
	 * be used by the reachability computation.
	 * 
	 * @param inputStoryDiagram
	 * @return
	 */
	protected List<Activity> createForEachRules(List<Activity> inputActivities,
			Set<EClass> classesOfUnchangeableNodes) {

		URI transformationURI = URI
				.createPlatformPluginURI(
						"/org.muml.storydiagram.reachanalysis.sdm.transform/transforms/forEachTransformation.qvto",
						true);
		// create executor and execution context
		TransformationExecutor executor = new TransformationExecutor(
				transformationURI);
		ExecutionContextImpl context = new ExecutionContextImpl();
		
		//set context variables
		if(this.storeMatching){
			context.setConfigProperty("generateMatchingEntries", Boolean.TRUE);
		} else {
			context.setConfigProperty("generateMatchingEntries", Boolean.FALSE);
		}

		// create input extend containing the activities
		// create empty output extend

		GraphTransformationSystem gts = sdmFactory.createGraphTransformationSystem();
		gts.getActivities().addAll(inputActivities);
		gts.getUnchangeableNodes().addAll(classesOfUnchangeableNodes);
		List<GraphTransformationSystem> inputList = Arrays.asList(gts);
		ModelExtent input = new BasicModelExtent(inputList);
		ModelExtent output = new BasicModelExtent();

		// execute transformation
		ExecutionDiagnostic result = executor.execute(context, input, output);
		if (result.getSeverity() != ExecutionDiagnostic.OK) {

			System.out
					.println("QVT-O ERROR on rule transformation. Message was:");
			System.out.println(result.getMessage());
		}

		List<Activity> outputActivities = new ArrayList<Activity>();

		// get the resulting rules
		for (EObject curObject : output.getContents()) {
			if (curObject instanceof GraphTransformationSystem) {
				outputActivities.addAll(((GraphTransformationSystem) curObject).getActivities());
			}
		}

		return outputActivities;

	}
	
	/**
	 * Returns the input Activity that was created for the given forEach Activity using the ruleMapping.  
	 * @param forEachActivity
	 * @return
	 */
	protected Activity getInputActivityFromMapping(Activity forEachActivity){
		for(int i = 0; i < ruleMapping[1].length; i++){
			if(ruleMapping[1][i] == forEachActivity){
				return ruleMapping[0][i];
			}
		}
		return null;
	}
	
	protected EclipseExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> createExpressionInterpreterManager() throws SDMException{
		return new EclipseExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression>(createStoryDrivenMetamodelFacadeFactory(), 
												getClass().getClassLoader(),
												createNotificationEmitter());
	}
	
	protected StoryDrivenMetamodelFacadeFactory createStoryDrivenMetamodelFacadeFactory(){
		return StoryDrivenMetamodelFacadeFactory.INSTANCE;
	}
	
	protected NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> createNotificationEmitter(){
		
		if(isDEBUG()){
			StoryDrivenNotificationEmitter emitter = new StoryDrivenNotificationEmitter();
			emitter.addNotificationReceiver(new StoryDrivenOutputStreamNotificationReceiver());
			
			return emitter;
		} else {
			return new NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression>();
		}
	}

	public Set<EClass> getClassesOfUnchangeableNodes() {
		return classesOfUnchangeableNodes;
	}

	public void setClassesOfUnchangeableNodes(
			Set<EClass> classesOfUnchangeableNodes) {
		this.classesOfUnchangeableNodes = classesOfUnchangeableNodes;
	}

	public HashMap<EObject, Long> getAttributeHashOfUnchangeableNodes() {
		return attributeHashOfUnchangeableNodes;
	}

	public void setAttributeHashOfUnchangeableNodes(
			HashMap<EObject, Long> attributeHashOfUnchangeableNodes) {
		this.attributeHashOfUnchangeableNodes = attributeHashOfUnchangeableNodes;
	}

	/**
	 * Returns the resource that contains this reachability graph.
	 * @return
	 */
	protected Resource getTheResource() {
		return theResource;
	}

	/**
	 * For making the EcoreUtil work for deleting objects during a reachability
	 * analysis, we need to clone the initialGraphObjects provided to the 
	 * reachability computation. The map associates the objects provided
	 * by the user to the objects contained in the initial state of the 
	 * reachability graph.
	 * @return an unmodifiable EMap associating the objects provided as
	 * initial graph objects to the objects appearing in the initial state
	 */
	public EMap<EObject, EObject> getInitialObjectMapping() {
		return ECollections.unmodifiableEMap(initialObjectMapping);
	}
}
