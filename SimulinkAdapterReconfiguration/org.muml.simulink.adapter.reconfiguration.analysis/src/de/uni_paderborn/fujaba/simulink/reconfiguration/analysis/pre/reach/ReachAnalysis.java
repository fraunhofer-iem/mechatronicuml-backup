package de.uni_paderborn.fujaba.simulink.reconfiguration.analysis.pre.reach;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.storydriven.core.ExtendableElement;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.activities.ModifyingStoryNode;
import org.storydriven.storydiagrams.patterns.AbstractLinkVariable;
import org.storydriven.storydiagrams.patterns.BindingState;
import org.storydriven.storydiagrams.patterns.LinkVariable;
import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.muml.component.AtomicComponent;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.instance.StructuredComponentInstance;
import de.uni_paderborn.fujaba.muml.reachanalysis.core.HashLevel;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraph;
import de.uni_paderborn.fujaba.muml.reachanalysis.sdm.SDMReachabilityComputation;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.simulink.reconfiguration.analysis.pre.reach.state.IndividualStateGenerator;
import de.uni_paderborn.fujaba.simulink.reconfiguration.analysis.pre.reach.state.StateGenerator;

/**
 * The Reachability Analysis. Performs the following tasks for all instances:
 * 	1. Compute ReachablityGraph
 *  2. Generate State
 *  3. Generate integrated configuration 
 */
public class ReachAnalysis 
{	
	protected RootNode model;
	protected ComponentInstanceConfiguration cic;
	
	final static String CATEGORY_ACTIVITIES = "org.storydriven.storydiagrams.category";
	final static String CATEGORY_COMPONENTS = "de.uni_paderborn.fujaba.muml.components.category";
	static final String CATEGORY_RTSC = "de.uni_paderborn.fujaba.muml.realtimestatechart.category";
	static final String CATEGORY_MSGTYPE = "de.uni_paderborn.fujaba.muml.messagetype.category";
	
	public ReachAnalysis(RootNode model, ComponentInstanceConfiguration cic)
	{
		this.model = model;		
		this.cic = cic;
	}
	
	/**
	 * Generate the configurations for the given instance
	 */
	public void computeConfigurationsFor(StructuredComponentInstance target)
	{		
		Set<EObject> initialGraphObjects = listInitialGraphObjects(target);
		List<Activity> activities = listActivities(target);
		
		if(activities.size() == 0)
			return;
		
		//Configure Reachability Computation
		SDMReachabilityComputation reachComp = new SDMReachabilityComputation(initialGraphObjects, activities);
		SDMReachabilityComputation.setDEBUG(false);
		reachComp.setMaxPathLength(6);
		reachComp.setStoreMatching(true);
		reachComp.setIdentifyUnchangeableSubgraphs(true);
		reachComp.setHashLevel(HashLevel.LEVEL2);
		reachComp.setStoreIndexMap(true);
		
		//Execute Reachability Computation
		reachComp.computeReachabilityGraph();		
		ReachabilityGraph graph = reachComp.getReachabilityGraph();
		
			
		//Generate StateComponent and behavior frame
		StateGenerator sg = new StateGenerator(this.model);
		AtomicComponent stateComponent = sg.generateStateType(target);
		RealtimeStatechart stateSpace = ((RealtimeStatechart)stateComponent.getBehavior()).getStates().get(0).getEmbeddedRegions().get(0).getEmbeddedStatechart();
		//StateSpace is always the RTSC in the first region of the single top state
		
		//Generate region 'state_space'
		ReachGraphWalker walker = new ReachGraphWalker();
		walker.walk(graph, new IndividualStateGenerator(sg.getStateBehaviorGenerator(),stateSpace));
		
		//Merge integrated configuration
		DFSReachGraphWalker dfswalker = new DFSReachGraphWalker();
		dfswalker.addVisitor(new CICMerge(reachComp, listInitialGraphObjects(target)));
		dfswalker.walk(graph);
			
		//Inject state into component
		sg.injectInto(target, stateComponent);
	}
	
	/**
	 * Compute the configurations for all instances
	 */
	public void computeConfigurations()
	{
		EObject next = null;
		for(TreeIterator<EObject> it = this.cic.eAllContents(); it.hasNext(); next = it.next())
		{
			if(next instanceof StructuredComponentInstance)
			{
				this.computeConfigurationsFor((StructuredComponentInstance)next);
			}
		}		
	}

	/**
	 * Collect all activities that have the given instance as an input parameter
	 */
	private List<Activity> listActivities(StructuredComponentInstance target) 
	{
		LinkedList<Activity> activities = new LinkedList<Activity>();
		for(ModelElementCategory category: this.model.getCategories())
		{
			if(CATEGORY_ACTIVITIES.equals(category.getKey()))
			{
				for(ExtendableElement element: category.getModelElements())
				{
					if(element instanceof Activity)
					{
						Activity activity = (Activity) element;
						
						EParameter inParam = activity.getInParameters().get(0);
						
						for(ActivityNode node:activity.getOwnedActivityNodes())
						{
							if(node instanceof ModifyingStoryNode)
							{
								for(AbstractLinkVariable abstractlink: ((ModifyingStoryNode)node).getOwnedRule().getLinkVariables())
								{	
									if(abstractlink instanceof LinkVariable)
									{
										/*
										 * Find the link that connects the bound (input) variable to
										 * its type definition that is named like the component we
										 * are looking for.
										 */
										LinkVariable link = (LinkVariable) abstractlink;
										if( link.getSource().getBindingState() == BindingState.BOUND &&
											link.getSource().getType() == inParam.getEType() &&
											inParam.getName().equals(link.getSource().getVariableName()) &&
											"componentType".equals(link.getTargetEnd().getName()) &&
											target.getComponentType().getName().equals(link.getTarget().getName())
											)
										{
											if(!activities.contains(element))
												activities.add((Activity)element);
											break;
										}
									}									
								}
							}
						}
					}
				}
			}
		}
		return activities;
	}

	/**
	 * Returns the initial graph objects for the Reachbility Computation
	 */
	private Set<EObject> listInitialGraphObjects(StructuredComponentInstance target) 
	{
		HashSet<EObject> initialObjects = new HashSet<EObject>();
		
		initialObjects.add(target);
		
		for(ModelElementCategory category: this.model.getCategories())
		{
			if(CATEGORY_COMPONENTS.equals(category.getKey()))
			{
				for(ExtendableElement element: category.getModelElements())
				{
					initialObjects.add(element);
				}
			}			
			else if(CATEGORY_RTSC.equals(category.getKey()))
			{
				for(ExtendableElement element: category.getModelElements())
				{
					initialObjects.add(element);
				}				
			}			
		}		
		return initialObjects;
	}
}
