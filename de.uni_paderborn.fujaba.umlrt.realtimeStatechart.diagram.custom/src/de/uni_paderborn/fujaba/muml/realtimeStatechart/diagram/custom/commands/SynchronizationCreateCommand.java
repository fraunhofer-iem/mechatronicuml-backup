package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.commands;

import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Synchronization;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationKind;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;

/**
 * @generated
 */
public class SynchronizationCreateCommand extends EditElementCommand {

	private HashMap<EParameter, String> parameterValuesHashMap = null;
	private SynchronizationChannel channel = null;
	private String type = "";

	/**
	 * @generated
	 */
	public SynchronizationCreateCommand(CreateElementRequest req,
			HashMap<EParameter, String> parameterValuesHashMap,
			SynchronizationChannel channel, String type) {
		super(req.getLabel(), null, req);
		this.parameterValuesHashMap = parameterValuesHashMap;
		this.channel = channel;
		this.type = type;
	}

	/**
	 * FIXME: replace with setElementToEdit()
	 * 
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

		Synchronization newElement = RealtimestatechartFactory.eINSTANCE
				.createSynchronization();

		Transition owner = (Transition) getElementToEdit();
		owner.setSynchronization(newElement);
		if (type.equals("send")) {
			newElement.setKind(SynchronizationKind.SEND);
		} else {
			newElement.setKind(SynchronizationKind.RECEIVE);
		}

		newElement.setCallee(channel);

		Iterator<EParameter> iter = parameterValuesHashMap.keySet().iterator();
		while (iter.hasNext()) {
			EParameter tmp = iter.next();
			String value = parameterValuesHashMap.get(tmp);

			org.storydriven.modeling.calls.ParameterBinding parameterBinding = org.storydriven.modeling.calls.CallsFactory.eINSTANCE
					.createParameterBinding();

			newElement.getOwnedParameterBindings().add(parameterBinding);

			parameterBinding.setParameter(tmp);

			org.storydriven.modeling.expressions.LiteralExpression literalExpr = org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE
					.createLiteralExpression();

			parameterBinding.setValueExpression(literalExpr);

			literalExpr.setValue(value);
			literalExpr.setValueType((EDataType) tmp.getEType());
		}

		doConfigure(newElement, monitor, info);

		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);
	}

	/**
	 * @generated
	 */
	protected void doConfigure(Synchronization newElement,
			IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
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
