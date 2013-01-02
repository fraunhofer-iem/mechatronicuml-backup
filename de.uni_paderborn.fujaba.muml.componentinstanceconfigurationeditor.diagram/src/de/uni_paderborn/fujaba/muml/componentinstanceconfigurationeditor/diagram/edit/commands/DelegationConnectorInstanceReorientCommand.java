package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class DelegationConnectorInstanceReorientCommand extends
		EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public DelegationConnectorInstanceReorientCommand(
			ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof de.uni_paderborn.fujaba.muml.model.instance.DelegationConnectorInstance) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance && newEnd instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance)) {
			return false;
		}
		if (getLink().getConnectorEndpointInstances().size() != 1) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance target = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance) getLink()
				.getConnectorEndpointInstances().get(0);
		if (!(getLink().eContainer() instanceof de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration container = (de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration) getLink()
				.eContainer();
		return de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistDelegationConnectorInstance_4002(
						container, getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance && newEnd instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance)) {
			return false;
		}
		if (getLink().getConnectorEndpointInstances().size() != 1) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance source = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance) getLink()
				.getConnectorEndpointInstances().get(0);
		if (!(getLink().eContainer() instanceof de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration container = (de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration) getLink()
				.eContainer();
		return de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistDelegationConnectorInstance_4002(
						container, getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().getConnectorEndpointInstances().remove(getOldSource());
		getLink().getConnectorEndpointInstances().add(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().getConnectorEndpointInstances().remove(getOldTarget());
		getLink().getConnectorEndpointInstances().add(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.instance.DelegationConnectorInstance getLink() {
		return (de.uni_paderborn.fujaba.muml.model.instance.DelegationConnectorInstance) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance getOldSource() {
		return (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance getNewSource() {
		return (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance) newEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance getOldTarget() {
		return (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance getNewTarget() {
		return (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance) newEnd;
	}

	/**
	 * @generated
	 */
	protected int getReorientDirection() {
		return reorientDirection;
	}
}
