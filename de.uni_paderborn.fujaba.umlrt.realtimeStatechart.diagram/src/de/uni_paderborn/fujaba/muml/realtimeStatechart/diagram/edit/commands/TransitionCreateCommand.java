package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

/**
 * @generated
 */
public class TransitionCreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final EObject source;

	/**
	 * @generated
	 */
	private final EObject target;

	/**
	 * @generated
	 */
	private final de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart container;

	/**
	 * @generated
	 */
	public TransitionCreateCommand(CreateRelationshipRequest request,
			EObject source, EObject target) {
		super(request.getLabel(), null, request);
		this.source = source;
		this.target = target;
		container = deduceContainer(source, target);
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null
				&& false == source instanceof de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex) {
			return false;
		}
		if (target != null
				&& false == target instanceof de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		if (getContainer() == null) {
			return false;
		}
		return de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.policies.UmlrtBaseItemSemanticEditPolicy
				.getLinkConstraints().canCreateTransition_4001(getContainer(),
						getSource(), getTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in create link command"); //$NON-NLS-1$
		}

		de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition newElement = de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartFactory.eINSTANCE
				.createTransition();
		getContainer().getTransitions().add(newElement);
		newElement.setSource(getSource());
		newElement.setTarget(getTarget());
		doConfigure(newElement, monitor, info);
		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);

	}

	/**
	 * @generated
	 */
	protected void doConfigure(
			de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition newElement,
			IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest())
				.getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(
				getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest())
				.getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		configureRequest.setParameter(CreateRelationshipRequest.SOURCE,
				getSource());
		configureRequest.setParameter(CreateRelationshipRequest.TARGET,
				getTarget());
		ICommand configureCommand = elementType
				.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

	/**
	 * @generated
	 */
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex getSource() {
		return (de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex) source;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex getTarget() {
		return (de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex) target;
	}

	/**
	 * @generated
	 */
	public de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart getContainer() {
		return container;
	}

	/**
	 * Default approach is to traverse ancestors of the source to find instance of container.
	 * Modify with appropriate logic.
	 * @generated
	 */
	private static de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart deduceContainer(
			EObject source, EObject target) {
		// Find container element for the new link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart) {
				return (de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart) element;
			}
		}
		return null;
	}

}
