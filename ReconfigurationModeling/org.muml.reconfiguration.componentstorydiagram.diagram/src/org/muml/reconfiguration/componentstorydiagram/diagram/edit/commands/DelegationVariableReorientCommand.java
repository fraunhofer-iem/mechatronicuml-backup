package org.muml.reconfiguration.componentstorydiagram.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class DelegationVariableReorientCommand extends EditElementCommand {

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
	public DelegationVariableReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof org.muml.reconfiguration.componentstorypattern.DelegationVariable) {
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
		if (!(oldEnd instanceof org.muml.pim.connector.ConnectorEndpoint && newEnd instanceof org.muml.pim.connector.ConnectorEndpoint)) {
			return false;
		}
		// Removed this check, because other cases are now implemented; Enhancement for MUML-BUG #446
		/*
		if (getLink().getConnectorEndpoints().size() != 1) {
		  return false;
		}
		 */
		org.muml.pim.connector.ConnectorEndpoint target = (org.muml.pim.connector.ConnectorEndpoint) getLink()
				.getConnectorEndpoints().get(0);
		if (!(getLink().eContainer() instanceof org.muml.reconfiguration.componentstorypattern.ComponentVariable)) {
			return false;
		}
		org.muml.reconfiguration.componentstorypattern.ComponentVariable container = (org.muml.reconfiguration.componentstorypattern.ComponentVariable) getLink()
				.eContainer();
		View sourceView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!org.muml.reconfiguration.componentstorydiagram.diagram.edit.policies.ComponentStoryDiagramBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistDelegationVariable_4005(
						container, getLink(), getNewSource(), target,
						sourceView, targetView)) {
			String errorMessage = org.muml.reconfiguration.componentstorydiagram.diagram.edit.policies.ComponentStoryDiagramBaseItemSemanticEditPolicy
					.getLinkConstraints().getErrorDelegationVariable_4005(
							container, getNewSource(), target, sourceView,
							targetView);
			org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy
					.showMessage(sourceView, errorMessage);
			return false;
		}
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof org.muml.pim.connector.ConnectorEndpoint && newEnd instanceof org.muml.pim.connector.ConnectorEndpoint)) {
			return false;
		}
		// Removed this check, because other cases are now implemented; Enhancement for MUML-BUG #446
		/*
		if (getLink().getConnectorEndpoints().size() != 1) {
		  return false;
		}
		 */
		org.muml.pim.connector.ConnectorEndpoint source = (org.muml.pim.connector.ConnectorEndpoint) getLink()
				.getConnectorEndpoints().get(0);
		if (!(getLink().eContainer() instanceof org.muml.reconfiguration.componentstorypattern.ComponentVariable)) {
			return false;
		}
		org.muml.reconfiguration.componentstorypattern.ComponentVariable container = (org.muml.reconfiguration.componentstorypattern.ComponentVariable) getLink()
				.eContainer();
		View sourceView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!org.muml.reconfiguration.componentstorydiagram.diagram.edit.policies.ComponentStoryDiagramBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistDelegationVariable_4005(
						container, getLink(), source, getNewTarget(),
						sourceView, targetView)) {
			String errorMessage = org.muml.reconfiguration.componentstorydiagram.diagram.edit.policies.ComponentStoryDiagramBaseItemSemanticEditPolicy
					.getLinkConstraints().getErrorDelegationVariable_4005(
							container, source, getNewTarget(), sourceView,
							targetView);
			org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy
					.showMessage(sourceView, errorMessage);
			return false;
		}
		return true;
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
	protected org.muml.reconfiguration.componentstorypattern.DelegationVariable getLink() {
		return (org.muml.reconfiguration.componentstorypattern.DelegationVariable) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected org.muml.pim.connector.ConnectorEndpoint getOldSource() {
		return (org.muml.pim.connector.ConnectorEndpoint) oldEnd;
	}

	/**
	 * @generated
	 */
	protected org.muml.pim.connector.ConnectorEndpoint getNewSource() {
		return (org.muml.pim.connector.ConnectorEndpoint) newEnd;
	}

	/**
	 * @generated
	 */
	protected org.muml.pim.connector.ConnectorEndpoint getOldTarget() {
		return (org.muml.pim.connector.ConnectorEndpoint) oldEnd;
	}

	/**
	 * @generated
	 */
	protected org.muml.pim.connector.ConnectorEndpoint getNewTarget() {
		return (org.muml.pim.connector.ConnectorEndpoint) newEnd;
	}

	private EditPart host;

	/**
	 * @generated
	 */
	protected int getReorientDirection() {
		return reorientDirection;
	}
}
