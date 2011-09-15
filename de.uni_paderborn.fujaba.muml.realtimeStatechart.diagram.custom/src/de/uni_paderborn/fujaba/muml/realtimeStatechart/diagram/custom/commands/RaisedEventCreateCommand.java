package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.commands;

import java.util.HashMap;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.model.msgiface.MessageType;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousMessageEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;



/**
 * @generated
 */
public class RaisedEventCreateCommand extends EditElementCommand {
	
	private HashMap<EParameter, String> parameterValuesHashMap = null;
	private MessageType messageType = null;

	/**
	 * @generated
	 */
	public RaisedEventCreateCommand(CreateElementRequest req, HashMap<EParameter, String> parameterValuesHashMap, 
			MessageType messageType) {
		super(req.getLabel(), null, req);
		this.parameterValuesHashMap = parameterValuesHashMap;
		this.messageType = messageType;
	}
	
	/**
	 * FIXME: replace with setElementToEdit()
	 * @generated
	 */
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest())
				.getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}
	
	/**
	 * @generated
	 */
	public boolean canExecute() {
		return true;

	}
	
	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {

		AsynchronousMessageEvent newElement = RealtimestatechartFactory.
			eINSTANCE.createAsynchronousMessageEvent();
	
		Transition owner = (Transition) getElementToEdit();

		owner.getEvents().add(newElement);

		// TODO: Fix this old code
/*
		newElement.setCallee(messageType);
		
		Iterator<EParameter> iter = parameterValuesHashMap.keySet().iterator();
		while(iter.hasNext()){
			EParameter tmp = iter.next();
			String value = parameterValuesHashMap.get(tmp);
			
			org.storydriven.modeling.calls.ParameterBinding parameterBinding = org.storydriven.modeling.calls.CallsFactory
				.eINSTANCE.createParameterBinding();
			
			newElement.getOwnedParameterBindings().add(parameterBinding);
			
			parameterBinding.setParameter(tmp);
			
			org.storydriven.modeling.expressions.LiteralExpression literalExpr = org.storydriven.modeling.expressions.
				ExpressionsFactory.eINSTANCE.createLiteralExpression();
			
			parameterBinding.setValueExpression(literalExpr);
			
			literalExpr.setValue(value);
			literalExpr.setValueType((EDataType)tmp.getEType());
		}

		doConfigure(newElement, monitor, info);
*/
		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);
	}
	

	/**
	 * @generated
	 */
	protected void doConfigure(AsynchronousMessageEvent newElement, IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest())
				.getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(
				getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest())
				.getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		ICommand configureCommand = elementType
				.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

}
