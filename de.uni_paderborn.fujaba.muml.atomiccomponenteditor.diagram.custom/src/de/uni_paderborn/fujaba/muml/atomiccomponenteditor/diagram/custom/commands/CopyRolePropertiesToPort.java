package de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.custom.commands;

import java.util.Collection;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.EvaluationContext;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.Node;

import de.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.custom.edit.parts.CustomDiscretePortEditPart;
import de.uni_paderborn.fujaba.muml.model.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex;

import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

public class CopyRolePropertiesToPort extends AbstractHandler {

	public CopyRolePropertiesToPort() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		DiscretePort port = this.getPort(event);
		
		if(port.getRefines() == null)
			return null;
		
		//Single port
		if(port.getCardinality().getUpperBound().getValue() == 1)
		{	RealtimeStatechart transformedBehavior = this.copyRealtimeStatechart((RealtimeStatechart) port.getRefines().getBehavior());
					
			if(transformedBehavior != null)
			{
				ICommandProxy a = new ICommandProxy(new SinglePortChangeCommand(this.getEditPart(event).getEditingDomain(),port,transformedBehavior));
				a.execute();	
			}		
		}
		//Multi port
		else
		{
			RealtimeStatechart roleAndAdaptation = (RealtimeStatechart) port.getRefines().getRoleAndAdaptationBehavior();
			RealtimeStatechart transformedRoleAndAdaptation = this.copyRealtimeStatechart(roleAndAdaptation);
			String behaviorName = null;
			if(port.getRefines().getBehavior() != null)
				behaviorName = ((RealtimeStatechart)port.getRefines().getBehavior()).getName();
			String adaptationName = null;
			if(port.getRefines().getAdaptationBehavior() != null)
				adaptationName = ((RealtimeStatechart)port.getRefines().getAdaptationBehavior()).getName();
			if(transformedRoleAndAdaptation != null)
			{
				ICommandProxy a = new ICommandProxy(new MultiPortChangeCommand(this.getEditPart(event).getEditingDomain(),port,transformedRoleAndAdaptation, behaviorName, adaptationName));
				a.execute();
			}
		}

		return null;
	}
	
	/**
	 * Returns the selected discrete port
	 */
	public DiscretePort getPort(ExecutionEvent event)
	{		
		CustomDiscretePortEditPart editPart = this.getEditPart(event);
		return (DiscretePort) ((Node)editPart.getModel()).getElement();		
	}
	
	/**
	 * Returns the selected editpart
	 */
	public CustomDiscretePortEditPart getEditPart(ExecutionEvent event)
	{
		EvaluationContext evalCtx = (EvaluationContext) event.getApplicationContext();
		@SuppressWarnings("unchecked")
		Collection<CustomDiscretePortEditPart> defVar = (Collection<CustomDiscretePortEditPart>) evalCtx.getDefaultVariable();
		return defVar.iterator().next();
	}
	
	
	/**
	 * Copies the given rtsc by using a qvto transformation
	 */
	public RealtimeStatechart copyRealtimeStatechart(RealtimeStatechart source)
	{
		if(source == null)
			return null;
		
		URI transformationURI = URI
				.createPlatformPluginURI(
						"/de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.custom/transforms/CopyRealtimeStatechart.qvto",
						true);
		// create executor and execution context
		TransformationExecutor executor = new TransformationExecutor(
				transformationURI);
		ExecutionContextImpl context = new ExecutionContextImpl();

		// create input extend containing the activities
		// create empty output extend


		BasicModelExtent input = new BasicModelExtent();
		input.add(source);
		
		ModelExtent output = new BasicModelExtent();

		// execute transformation
		ExecutionDiagnostic result = executor.execute(context, input, output);
		if (result.getSeverity() != ExecutionDiagnostic.OK) {

			System.out
					.println("QVT-O ERROR on rule transformation. Message was:");
			System.out.println(result.getMessage());
		}

		// get the resulting rules
		for (EObject curObject : output.getContents()) {
			if (curObject instanceof RealtimeStatechart) {
				return (RealtimeStatechart) curObject;
			}
		}		
		return null;
	}
	
	/**
	 * Helper class to edit the resource/model.
	 * 
	 * Direct manipulation would lead to a "java.lang.IllegalStateException: 
	 * Cannot modify resource set without a write transaction"
	 *
	 */
	class SinglePortChangeCommand extends AbstractTransactionalCommand
	{
		DiscretePort source = null;
		RealtimeStatechart behavior = null;
				
		public SinglePortChangeCommand(TransactionalEditingDomain editingDomain, DiscretePort source, RealtimeStatechart behavior)
		{
		    super(editingDomain, "Copy role properties to port", null);
		    this.source = source;
		    this.behavior = behavior;
		}

		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
				IAdaptable info) throws ExecutionException {
			
			//Step 1: Set message interfaces
			source.getReceiverMessageTypes().addAll(source.getRefines().getReceiverMessageTypes());
			source.getSenderMessageTypes().addAll(source.getRefines().getSenderMessageTypes());
			
			//Step 2: Copy statechart
			source.setBehavior(behavior);
			
			//Add to resource
			ModelElementCategory category = (ModelElementCategory) source.getRefines().getBehavior().eContainer();
			category.getModelElements().add(behavior);		
			
			
			return CommandResult.newOKCommandResult();
		}		
	}
	
	class MultiPortChangeCommand extends AbstractTransactionalCommand
	{
		DiscretePort source = null;
		RealtimeStatechart roleAndAdaptation = null;
		String behaviorName = null;
		String adaptationName = null;
				
		public MultiPortChangeCommand(TransactionalEditingDomain editingDomain, DiscretePort source, RealtimeStatechart roleAndAdaptation, String behaviorName, String adaptationName)
		{
		    super(editingDomain, "Copy role properties to port", null);
		    this.source = source;
		    this.roleAndAdaptation = roleAndAdaptation;
		    this.behaviorName = behaviorName;
		    this.adaptationName = adaptationName;
		}

		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
				IAdaptable info) throws ExecutionException {
			
			//Step 1: Set message interfaces
			source.getReceiverMessageTypes().addAll(source.getRefines().getReceiverMessageTypes());
			source.getSenderMessageTypes().addAll(source.getRefines().getSenderMessageTypes());
			
			//Step 2: Copy statechart
			source.setRoleAndAdaptationBehavior(roleAndAdaptation);
			source.setBehavior(this.getSubChartByName(this.roleAndAdaptation, this.behaviorName));
			source.setAdaptationBehavior(this.getSubChartByName(this.roleAndAdaptation, this.adaptationName));
			
			//Add to resource
			ModelElementCategory category = (ModelElementCategory) source.getRefines().getRoleAndAdaptationBehavior().eContainer();
			category.getModelElements().add(roleAndAdaptation);		
			
			
			return CommandResult.newOKCommandResult();
		}
		
		public RealtimeStatechart getSubChartByName(RealtimeStatechart chart, String name)
		{
			if(name == null)
				return null;
			if(name.equals(chart.getName()))
					return chart;
			for(Vertex v: chart.getVertices())
			{
				if(v instanceof State)
				{
					State s = (State)v;
					for(Region r: s.getRegions())
					{
						if(r.getStatechart() != null)
						{
							RealtimeStatechart t = this.getSubChartByName(r.getStatechart(), name);
							if(t != null)
								return t;									
						}
					}
				}
			}
			return null;
		}		
	}	

}
