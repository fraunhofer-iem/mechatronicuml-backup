package org.muml.pim.pattern.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy;
import org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy;
import org.muml.pim.connector.ConnectorEndpoint;
import org.muml.pim.pattern.diagram.edit.policies.MumlBaseItemSemanticEditPolicy;
import org.muml.pim.protocol.AbstractCoordinationSpecification;
import org.muml.pim.protocol.RoleConnector;

/**
 * @generated
 */
public class RoleConnectorReorientCommand extends EditElementCommand {

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
	public RoleConnectorReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof RoleConnector) {
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
		if (!(oldEnd instanceof ConnectorEndpoint && newEnd instanceof ConnectorEndpoint)) {
			return false;
		}
		// Removed this check, because other cases are now implemented; Enhancement for MUML-BUG #446
		/*
		if (getLink().getConnectorEndpoints().size() != 1) {
		  return false;
		}
		*/
		ConnectorEndpoint target = (ConnectorEndpoint) getLink().getConnectorEndpoints().get(0);
		if (!(getLink().eContainer() instanceof AbstractCoordinationSpecification)) {
			return false;
		}
		AbstractCoordinationSpecification container = (AbstractCoordinationSpecification) getLink().eContainer();
		View sourceView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getSourceView(getRequest());
		View targetView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getTargetView(getRequest());
		if (!MumlBaseItemSemanticEditPolicy.getLinkConstraints().canExistRoleConnector_4001(container, getLink(),
				getNewSource(), target, sourceView, targetView)) {
			String errorMessage = MumlBaseItemSemanticEditPolicy.getLinkConstraints()
					.getErrorRoleConnector_4001(container, getNewSource(), target, sourceView, targetView);
			ErrorFeedbackEditPolicy.showMessage(sourceView, errorMessage);
			return false;
		}
		return true;
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ConnectorEndpoint && newEnd instanceof ConnectorEndpoint)) {
			return false;
		}
		// Removed this check, because other cases are now implemented; Enhancement for MUML-BUG #446
		/*
		if (getLink().getConnectorEndpoints().size() != 1) {
		  return false;
		}
		*/
		ConnectorEndpoint source = (ConnectorEndpoint) getLink().getConnectorEndpoints().get(0);
		if (!(getLink().eContainer() instanceof AbstractCoordinationSpecification)) {
			return false;
		}
		AbstractCoordinationSpecification container = (AbstractCoordinationSpecification) getLink().eContainer();
		View sourceView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getSourceView(getRequest());
		View targetView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getTargetView(getRequest());
		if (!MumlBaseItemSemanticEditPolicy.getLinkConstraints().canExistRoleConnector_4001(container, getLink(),
				source, getNewTarget(), sourceView, targetView)) {
			String errorMessage = MumlBaseItemSemanticEditPolicy.getLinkConstraints()
					.getErrorRoleConnector_4001(container, source, getNewTarget(), sourceView, targetView);
			ErrorFeedbackEditPolicy.showMessage(sourceView, errorMessage);
			return false;
		}
		return true;
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
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

		// Enhancement for MUML-BUG #446
		if (getLink().getConnectorEndpoints().size() > 1) {
			getLink().getConnectorEndpoints().remove(getOldSource());
		}
		getLink().getConnectorEndpoints().add(getNewSource());

		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {

		// Enhancement for MUML-BUG #446
		if (getLink().getConnectorEndpoints().size() > 1) {
			getLink().getConnectorEndpoints().remove(getOldTarget());
		}
		getLink().getConnectorEndpoints().add(getNewTarget());

		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected RoleConnector getLink() {
		return (RoleConnector) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected ConnectorEndpoint getOldSource() {
		return (ConnectorEndpoint) oldEnd;
	}

	/**
	* @generated
	*/
	protected ConnectorEndpoint getNewSource() {
		return (ConnectorEndpoint) newEnd;
	}

	/**
	* @generated
	*/
	protected ConnectorEndpoint getOldTarget() {
		return (ConnectorEndpoint) oldEnd;
	}

	/**
	* @generated
	*/
	protected ConnectorEndpoint getNewTarget() {
		return (ConnectorEndpoint) newEnd;
	}

	/**
	* @generated
	*/
	protected int getReorientDirection() {
		return reorientDirection;
	}
}
