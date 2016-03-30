package org.muml.pim.pattern.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RoleConnectorConnectorQualityOfServiceAssumptionsReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject referenceOwner;

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
	public RoleConnectorConnectorQualityOfServiceAssumptionsReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == referenceOwner instanceof org.muml.pim.protocol.RoleConnector) {
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
		if (!(oldEnd instanceof org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions
				&& newEnd instanceof org.muml.pim.protocol.RoleConnector)) {
			return false;
		}
		View sourceView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!org.muml.pim.pattern.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRoleConnectorConnectorQualityOfServiceAssumptions_4004(getNewSource(),
						getOldTarget(), sourceView, targetView)) {
			String errorMessage = org.muml.pim.pattern.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
					.getLinkConstraints().getErrorRoleConnectorConnectorQualityOfServiceAssumptions_4004(getNewSource(),
							getOldTarget(), sourceView, targetView);
			org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy.showMessage(sourceView, errorMessage);
			return false;
		}
		return true;
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions
				&& newEnd instanceof org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions)) {
			return false;
		}
		View sourceView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!org.muml.pim.pattern.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRoleConnectorConnectorQualityOfServiceAssumptions_4004(getOldSource(),
						getNewTarget(), sourceView, targetView)) {
			String errorMessage = org.muml.pim.pattern.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
					.getLinkConstraints().getErrorRoleConnectorConnectorQualityOfServiceAssumptions_4004(getOldSource(),
							getNewTarget(), sourceView, targetView);
			org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy.showMessage(targetView, errorMessage);
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

		getOldSource().setConnectorQualityOfServiceAssumptions(null);
		getNewSource().setConnectorQualityOfServiceAssumptions(getOldTarget());

		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {

		getOldSource().setConnectorQualityOfServiceAssumptions(getNewTarget());

		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected org.muml.pim.protocol.RoleConnector getOldSource() {
		return (org.muml.pim.protocol.RoleConnector) referenceOwner;
	}

	/**
	* @generated
	*/
	protected org.muml.pim.protocol.RoleConnector getNewSource() {
		return (org.muml.pim.protocol.RoleConnector) newEnd;
	}

	/**
	* @generated
	*/
	protected org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions getOldTarget() {
		return (org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions) oldEnd;
	}

	/**
	* @generated
	*/
	protected org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions getNewTarget() {
		return (org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions) newEnd;
	}

	/**
	* @generated
	*/
	protected int getReorientDirection() {
		return reorientDirection;
	}
}
