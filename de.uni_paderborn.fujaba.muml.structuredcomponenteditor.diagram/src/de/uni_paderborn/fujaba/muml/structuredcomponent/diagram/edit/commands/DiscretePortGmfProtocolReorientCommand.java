package de.uni_paderborn.fujaba.muml.structuredcomponent.diagram.edit.commands;

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
public class DiscretePortGmfProtocolReorientCommand extends EditElementCommand {

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
	public DiscretePortGmfProtocolReorientCommand(
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
		if (false == referenceOwner instanceof de.uni_paderborn.fujaba.muml.component.DiscretePort) {
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
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol && newEnd instanceof de.uni_paderborn.fujaba.muml.component.DiscretePort)) {
			return false;
		}
		View sourceView = de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!de.uni_paderborn.fujaba.muml.structuredcomponent.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistDiscretePortGmfProtocol_4005(
						getNewSource(), getOldTarget(), sourceView, targetView)) {
			String errorMessage = de.uni_paderborn.fujaba.muml.structuredcomponent.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
					.getLinkConstraints().getErrorDiscretePortGmfProtocol_4005(
							getNewSource(), getOldTarget(), sourceView,
							targetView);
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
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol && newEnd instanceof de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol)) {
			return false;
		}
		View sourceView = de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!de.uni_paderborn.fujaba.muml.structuredcomponent.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistDiscretePortGmfProtocol_4005(
						getOldSource(), getNewTarget(), sourceView, targetView)) {
			String errorMessage = de.uni_paderborn.fujaba.muml.structuredcomponent.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
					.getLinkConstraints().getErrorDiscretePortGmfProtocol_4005(
							getOldSource(), getNewTarget(), sourceView,
							targetView);
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
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.component.DiscretePort getOldSource() {
		return (de.uni_paderborn.fujaba.muml.component.DiscretePort) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.component.DiscretePort getNewSource() {
		return (de.uni_paderborn.fujaba.muml.component.DiscretePort) newEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol getOldTarget() {
		return (de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol getNewTarget() {
		return (de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol) newEnd;
	}

	/**
	 * @generated
	 */
	protected int getReorientDirection() {
		return reorientDirection;
	}
}
