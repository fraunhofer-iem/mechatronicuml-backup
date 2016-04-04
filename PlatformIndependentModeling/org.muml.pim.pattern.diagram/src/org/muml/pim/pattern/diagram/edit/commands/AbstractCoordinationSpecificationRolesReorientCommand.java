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
public class AbstractCoordinationSpecificationRolesReorientCommand extends EditElementCommand {

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
	public AbstractCoordinationSpecificationRolesReorientCommand(ReorientReferenceRelationshipRequest request) {
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
		if (false == referenceOwner instanceof org.muml.pim.protocol.AbstractCoordinationSpecification) {
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
		if (!(oldEnd instanceof org.muml.pim.protocol.Role
				&& newEnd instanceof org.muml.pim.protocol.AbstractCoordinationSpecification)) {
			return false;
		}
		View sourceView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!org.muml.pim.pattern.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistAbstractCoordinationSpecificationRoles_4002(getNewSource(),
						getOldTarget(), sourceView, targetView)) {
			String errorMessage = org.muml.pim.pattern.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
					.getLinkConstraints().getErrorAbstractCoordinationSpecificationRoles_4002(getNewSource(),
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
		if (!(oldEnd instanceof org.muml.pim.protocol.Role
				&& newEnd instanceof org.muml.pim.protocol.Role)) {
			return false;
		}
		View sourceView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!org.muml.pim.pattern.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistAbstractCoordinationSpecificationRoles_4002(getOldSource(),
						getNewTarget(), sourceView, targetView)) {
			String errorMessage = org.muml.pim.pattern.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
					.getLinkConstraints().getErrorAbstractCoordinationSpecificationRoles_4002(getOldSource(),
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

		// Enhancement for MUML-BUG #446
		if (getOldSource().getRoles().size() > 1) {
			getOldSource().getRoles().remove(getOldTarget());
		}
		getNewSource().getRoles().add(getOldTarget());

		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {

		// Enhancement for MUML-BUG #446
		if (getOldSource().getRoles().size() > 1) {
			getOldSource().getRoles().remove(getOldTarget());
		}
		getOldSource().getRoles().add(getNewTarget());

		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected org.muml.pim.protocol.AbstractCoordinationSpecification getOldSource() {
		return (org.muml.pim.protocol.AbstractCoordinationSpecification) referenceOwner;
	}

	/**
	* @generated
	*/
	protected org.muml.pim.protocol.AbstractCoordinationSpecification getNewSource() {
		return (org.muml.pim.protocol.AbstractCoordinationSpecification) newEnd;
	}

	/**
	* @generated
	*/
	protected org.muml.pim.protocol.Role getOldTarget() {
		return (org.muml.pim.protocol.Role) oldEnd;
	}

	/**
	* @generated
	*/
	protected org.muml.pim.protocol.Role getNewTarget() {
		return (org.muml.pim.protocol.Role) newEnd;
	}

	/**
	* @generated
	*/
	protected int getReorientDirection() {
		return reorientDirection;
	}
}