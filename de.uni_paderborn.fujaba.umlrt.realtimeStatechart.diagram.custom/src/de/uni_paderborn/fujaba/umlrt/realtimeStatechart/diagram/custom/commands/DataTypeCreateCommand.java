package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechart;



/**
 * @generated
 */
public class DataTypeCreateCommand extends EditElementCommand {
	
	private String name = null;
	private String instanceTypeName = null;

	/**
	 * @generated
	 */
	public DataTypeCreateCommand(CreateElementRequest req, String name, String type) {
		super(req.getLabel(), null, req);
		this.name = name;
		this.instanceTypeName = type;
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
		
		EDataType newElement = EcoreFactory.eINSTANCE.createEDataType();

		RealtimeStatechart owner = (RealtimeStatechart) getElementToEdit();
		RootNode root = (RootNode)owner.eContainer();
		
		root.getEcoreDataTypes().add(newElement);
		
		newElement.setName(name);
		newElement.setInstanceTypeName(instanceTypeName);

		doConfigure(newElement, monitor, info);

		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);
	}
	

	/**
	 * @generated
	 */
	protected void doConfigure(EDataType newElement, IProgressMonitor monitor,
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
