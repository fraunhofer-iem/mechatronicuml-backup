package org.muml.simulink.adapter.reconfiguration.analysis.pre.reach;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.muml.core.ExtendableElement;
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.core.modelinstance.RootNode;
import org.muml.core.reachanalysis.core.HashLevel;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph;
import org.muml.pim.component.AtomicComponent;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pim.instance.StructuredComponentInstance;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.simulink.adapter.reconfiguration.analysis.pre.reach.state.IndividualStateGenerator;
import org.muml.simulink.adapter.reconfiguration.analysis.pre.reach.state.StateGenerator;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.activities.ModifyingStoryNode;
import org.muml.storydiagram.patterns.AbstractLinkVariable;
import org.muml.storydiagram.patterns.BindingState;
import org.muml.storydiagram.patterns.LinkVariable;
import org.muml.storydiagram.reachanalysis.sdm.SDMReachabilityComputation;

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
	
	final static String CATEGORY_ACTIVITIES = "org.muml.storydiagram.category";
	final static String CATEGORY_COMPONENTS = "org.muml.pim.components.category";
	static final String CATEGORY_RTSC = "org.muml.realtimestatechart.category";
	static final String CATEGORY_MSGTYPE = "org.muml.pim.messagetype.category";
	
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
											link.getSource().getClassifier() == inParam.getEType() &&
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
