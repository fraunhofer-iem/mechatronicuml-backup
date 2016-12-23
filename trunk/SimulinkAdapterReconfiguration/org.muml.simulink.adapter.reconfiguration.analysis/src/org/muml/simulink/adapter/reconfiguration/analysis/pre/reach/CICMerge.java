package org.muml.simulink.adapter.reconfiguration.analysis.pre.reach;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.muml.core.ExtendableElement;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition;
import org.muml.pim.component.Component;
import org.muml.pim.connector.Connector;
import org.muml.pim.instance.AtomicComponentInstance;
import org.muml.pim.instance.ComponentInstance;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pim.instance.DelegationConnectorInstance;
import org.muml.pim.instance.PortConnectorInstance;
import org.muml.pim.instance.PortInstance;
import org.muml.pim.instance.StructuredComponentInstance;
import org.muml.simulink.adapter.extension.ExtensionFactory;
import org.muml.simulink.adapter.extension.SimulinkAnnotationExtension;
import org.muml.simulink.adapter.reconfiguration.analysis.pre.ReconfigurationMUMLAnalysis;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph;
import org.muml.storydiagram.reachanalysis.sdm.SDMReachabilityComputation;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.diffmerge.api.IComparison;
import org.eclipse.emf.diffmerge.api.IMergeSelector;
import org.eclipse.emf.diffmerge.api.Role;
import org.eclipse.emf.diffmerge.api.diff.IDifference;
import org.eclipse.emf.diffmerge.api.diff.IElementPresence;
import org.eclipse.emf.diffmerge.api.scopes.IModelScope;
import org.eclipse.emf.diffmerge.impl.scopes.FilteredModelScope;
import org.eclipse.emf.diffmerge.diffdata.impl.EComparisonImpl;
import org.eclipse.emf.diffmerge.impl.policies.DefaultDiffPolicy;
import org.eclipse.emf.diffmerge.impl.policies.MapBasedMatchPolicy;

/**
 * Merge all models computed by the SDMReachabilityComputation to
 * a single model.
 *
 */
public class CICMerge extends ReachGraphVisitor
{	
	private SDMReachabilityComputation reachComp = null; 
	private Set<EObject> initialGraphObjects = null;
	
	/**
	 * Match policy based in the index of a SDMTransition
	 */
	class SDMTransitionMatchPolicy extends MapBasedMatchPolicy
	{		
		public SDMTransitionMatchPolicy(EMap<EObject, EObject> index) 
		{
			super(index.map());
		}

		@Override
		 public Object getMatchID(EObject element_p, IModelScope scope_p) 
		 {
			 return this.getMatchIDByHash(element_p, scope_p);
		 }
		 
		 protected Object getMatchIDByHash(EObject element_p, IModelScope scope_p) 
		 {
			 Object match = null;
			 if(this.getMap().containsKey(element_p))
			 {
				 if(this.getMap().get(element_p) != null)
					 match = this.getMap().get(element_p).hashCode();
				 else
					 match = element_p.hashCode();
			 }
			 else
				 match = element_p.hashCode();
			 return match;			 
		 }
	}
	
	public CICMerge(SDMReachabilityComputation reachComp, Set<EObject> initialGraphObjects) 
	{
		this.reachComp = reachComp;
		this.initialGraphObjects = initialGraphObjects;
	}

	@Override
	public void finish(ReachabilityGraph graph)
	{
		this.annotateMultiConnections((StepGraph)graph.getStartState());

		//Merge startState with actual target component instance
		this.merge( this.initialGraphObjects,  ((StepGraph)graph.getStartState()).getContains(),  this.reachComp.getInitialObjectMapping());
	}
	
	@Override
	public void visit(ReachabilityGraphTransition transition) 
	{
		if(transition instanceof SDMTransition)
			this.visit((SDMTransition)transition);
	}
	
	public void visit(SDMTransition transition)
	{
		StepGraph source = (StepGraph)transition.getSource();
		StepGraph target = (StepGraph)transition.getTarget();
		
		this.merge(source.getContains(), target.getContains(), transition.getIndex());		
	}	
	
	/**
	 * Merge target step graph into source step graph 
	 */
	private void merge(Collection<EObject> source, Collection<EObject> target, EMap<EObject, EObject> index) 
	{
		//Source Model - Reference
		FilteredModelScope srcScope = new FilteredModelScope(new LinkedList<EObject>());
		this.addElementsToScope(source, srcScope);
		
		//Target Model - Target
		FilteredModelScope trgScope = new FilteredModelScope(new LinkedList<EObject>());
		this.addElementsToScope(target, trgScope);

		IComparison comparison = new EComparisonImpl(trgScope, srcScope);
		comparison.compute(new SDMTransitionMatchPolicy(index), new DefaultDiffPolicy(), null, null);	
		
		
		Collection<IDifference> differences = comparison.getRemainingDifferences();
		
		//Annotate deleted instances
		for(IDifference diff: differences)
		{
			if(diff instanceof IElementPresence)
			{
				IElementPresence pDiff = (IElementPresence)diff;
				
				if(pDiff.getPresenceRole() == Role.TARGET)
				{
					//Created Element: pDiff.getElement()
				}
				else if(pDiff.getPresenceRole() == Role.REFERENCE)
				{
					//Deleted Element: pDiff.getElement()
					if(pDiff.getElement() instanceof ComponentInstance)
						this.addReconfigurationAnnotation((ExtendableElement) pDiff.getElement(), "changed", "true");
				}
			}
		}
		
		final StructuredComponentInstance rootInst = this.getRootInstance(target);
		
		//Merge from Target to Source(Reference)
		Collection<IDifference> merged = comparison.merge(new IMergeSelector(){

			@Override
			public Role getMergeDirection(IDifference difference_p) {
				
				if(difference_p instanceof IElementPresence)
				{
					IElementPresence pDiff = (IElementPresence)difference_p;
					//Only add created elements
					if(pDiff.getPresenceRole() == Role.TARGET)
					{
						//Merge Element: pDiff.getElement()
						if(elementShouldMerge(pDiff.getElement()))
							return Role.REFERENCE;
					}
				}
				return null;							
			}

			/**
			 *  Enforce/Ensure encapsulation. Do only merge elements in the root instance
			 *  and (as a hack) atomic instances.
			 */
			private boolean elementShouldMerge(EObject element) 
			{
				ComponentInstance parentInst = getParentInstance(element);
				if(parentInst instanceof AtomicComponentInstance)
					return true;
				if(parentInst == rootInst)
					return true;
				return false;
			}
			}, true, null);
		
		
		//Annotate created instances - needs to be done after the merge. If not, the annotation is not
		// present in the combined model.
		for(IDifference diff: merged)
		{
			if(diff instanceof IElementPresence)
			{
				IElementPresence pDiff = (IElementPresence)diff;			
				if(pDiff.getElement() instanceof ComponentInstance)
				{
					this.addReconfigurationAnnotation((ExtendableElement) pDiff.getElementMatch().get(Role.REFERENCE), "changed", "true");
				}	
			}
		}		
	}
	
	/**
	 * Add important objects to the given scope. Important objects are the root instance and
	 * all components
	 */
	private void addElementsToScope(Collection<EObject> objects, FilteredModelScope scope) 
	{
		boolean rootFound = false;
		for(EObject object: objects)
		{
			if(object instanceof Component)
			{
				scope.add(object, true);
			}
			if(object instanceof StructuredComponentInstance && (object.eContainer() instanceof StepGraph || object.eContainer() instanceof  ComponentInstanceConfiguration  ))
			{
				rootFound = true;
				scope.add(object, true);
			}
		}
		if(!rootFound)
			throw new IllegalArgumentException("No root instance found in " + objects);
	}

	/**
	 * Create annotations for all multi connections
	 * Each connector gets the annotation 'multilineindex'
	 * Each port gets the annotation 'multiline'
	 */
	private void annotateMultiConnections(StepGraph startState) 
	{
		StructuredComponentInstance root = this.getRoot(startState);
		for(EObject object: root.getEmbeddedCIC().getPortConnectorInstances())
		{
			if(object instanceof PortConnectorInstance)
			{
				PortConnectorInstance connector = (PortConnectorInstance) object;
				for(PortInstance portInst: connector.getPortInstances())
				{
					List<Connector> connectors = null;
					
					if(object instanceof DelegationConnectorInstance)
						connectors = portInst.getPortType().getConnectors();
					else
						connectors = portInst.getPortPart().getConnectors();
					
					if(connectors.size() > 1)
					{						
						if(connectors.contains(connector.getType()))
						{
							int index = connectors.indexOf(connector.getType());
							this.addReconfigurationAnnotation(connector, "multilineindex", Integer.toString(index));
							this.addReconfigurationAnnotation(portInst, "multiline", "true");
						}
					}
				}
			}
		}
		
	}
	
	/**
	 * Helper method to add an annotation (key='Reconfiguration') to the given element
	 */
	private void addReconfigurationAnnotation(ExtendableElement element, String key, String val) {
		SimulinkAnnotationExtension annotation = ReconfigurationMUMLAnalysis.getAnnotation(element, "Reconfiguration");
		if(annotation == null)
		{
			annotation = ExtensionFactory.eINSTANCE.createSimulinkAnnotationExtension();
			annotation.setSource("Reconfiguration");
			element.getExtensions().add(annotation);	
		}						
		annotation.getDetails().put(key, val);	
	}


	/**
	 * Find root StructuredComponentInstance
	 */
	private StructuredComponentInstance getRoot(StepGraph s)
	{
		return this.getRootInstance(s.getContains());
	}	
	
	/**
	 * Find the parent instance
	 */
	private ComponentInstance getParentInstance(EObject object)
	{
		if(object.eContainer() == null)
			return null;
		if(object.eContainer() instanceof ComponentInstance)
			return (ComponentInstance) object.eContainer();
		return this.getParentInstance(object.eContainer());
	}
	
	/**
	 * Find root instance
	 */
	private StructuredComponentInstance getRootInstance(Collection<EObject> objects)
	{
		for(EObject object: objects)
		{
			if(object instanceof StructuredComponentInstance && object.eContainer() instanceof StepGraph)
				return (StructuredComponentInstance) object;
		}
		throw new IllegalArgumentException("No root instance found in " + objects);
	}
	
	
}
