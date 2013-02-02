package de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CoordinationProtocolRolesReorientCommand extends
		EditElementCommand {

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
	public CoordinationProtocolRolesReorientCommand(
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
		if (false == referenceOwner instanceof de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol) {
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
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.protocol.Role && newEnd instanceof de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol)) {
			return false;
		}
		View sourceView = de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistCoordinationProtocolRoles_4007(
						getNewSource(), getOldTarget(), sourceView, targetView)) {
			String errorMessage = de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
					.getLinkConstraints()
					.getErrorCoordinationProtocolRoles_4007(getNewSource(),
							getOldTarget(), sourceView, targetView);
			de.uni_paderborn.fujaba.muml.common.edit.policies.ErrorFeedbackEditPolicy
					.showMessage(sourceView, errorMessage);
			return false;
		}
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.protocol.Role && newEnd instanceof de.uni_paderborn.fujaba.muml.protocol.Role)) {
			return false;
		}
		View sourceView = de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistCoordinationProtocolRoles_4007(
						getOldSource(), getNewTarget(), sourceView, targetView)) {
			String errorMessage = de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
					.getLinkConstraints()
					.getErrorCoordinationProtocolRoles_4007(getOldSource(),
							getNewTarget(), sourceView, targetView);
			de.uni_paderborn.fujaba.muml.common.edit.policies.ErrorFeedbackEditPolicy
					.showMessage(targetView, errorMessage);
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
	protected de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol getOldSource() {
		return (de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol getNewSource() {
		return (de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol) newEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.protocol.Role getOldTarget() {
		return (de.uni_paderborn.fujaba.muml.protocol.Role) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.protocol.Role getNewTarget() {
		return (de.uni_paderborn.fujaba.muml.protocol.Role) newEnd;
	}

	private EditPart host;

	/**
	 * @generated
	 */
	protected int getReorientDirection() {
		return reorientDirection;
	}
}
