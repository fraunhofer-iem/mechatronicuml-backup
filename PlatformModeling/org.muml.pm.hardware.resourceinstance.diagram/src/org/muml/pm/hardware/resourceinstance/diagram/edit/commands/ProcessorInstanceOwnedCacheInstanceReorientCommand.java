package org.muml.pm.hardware.resourceinstance.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy;
import org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy;
import org.muml.pm.hardware.hwresourceinstance.CacheInstance;
import org.muml.pm.hardware.hwresourceinstance.ProcessorInstance;
import org.muml.pm.hardware.resourceinstance.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ProcessorInstanceOwnedCacheInstanceReorientCommand extends EditElementCommand {

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
	public ProcessorInstanceOwnedCacheInstanceReorientCommand(ReorientReferenceRelationshipRequest request) {
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
		if (false == referenceOwner instanceof ProcessorInstance) {
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
		if (!(oldEnd instanceof CacheInstance && newEnd instanceof ProcessorInstance)) {
			return false;
		}
		View sourceView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getSourceView(getRequest());
		View targetView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getTargetView(getRequest());
		if (!HardwareBaseItemSemanticEditPolicy.getLinkConstraints().canExistProcessorInstanceOwnedCacheInstance_4003(
				getNewSource(), getOldTarget(), sourceView, targetView)) {
			String errorMessage = HardwareBaseItemSemanticEditPolicy.getLinkConstraints()
					.getErrorProcessorInstanceOwnedCacheInstance_4003(getNewSource(), getOldTarget(), sourceView,
							targetView);
			ErrorFeedbackEditPolicy.showMessage(sourceView, errorMessage);
			return false;
		}
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof CacheInstance && newEnd instanceof CacheInstance)) {
			return false;
		}
		View sourceView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getSourceView(getRequest());
		View targetView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getTargetView(getRequest());
		if (!HardwareBaseItemSemanticEditPolicy.getLinkConstraints().canExistProcessorInstanceOwnedCacheInstance_4003(
				getOldSource(), getNewTarget(), sourceView, targetView)) {
			String errorMessage = HardwareBaseItemSemanticEditPolicy.getLinkConstraints()
					.getErrorProcessorInstanceOwnedCacheInstance_4003(getOldSource(), getNewTarget(), sourceView,
							targetView);
			ErrorFeedbackEditPolicy.showMessage(targetView, errorMessage);
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

		getOldSource().setOwnedCacheInstance(null);
		getNewSource().setOwnedCacheInstance(getOldTarget());

		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {

		getOldSource().setOwnedCacheInstance(getNewTarget());

		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected ProcessorInstance getOldSource() {
		return (ProcessorInstance) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected ProcessorInstance getNewSource() {
		return (ProcessorInstance) newEnd;
	}

	/**
	 * @generated
	 */
	protected CacheInstance getOldTarget() {
		return (CacheInstance) oldEnd;
	}

	/**
	 * @generated
	 */
	protected CacheInstance getNewTarget() {
		return (CacheInstance) newEnd;
	}

	/**
	 * @generated
	 */
	protected int getReorientDirection() {
		return reorientDirection;
	}
}
