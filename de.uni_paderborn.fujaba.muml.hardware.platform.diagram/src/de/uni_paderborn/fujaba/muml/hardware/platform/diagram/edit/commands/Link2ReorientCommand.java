package de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Link2ReorientCommand extends EditElementCommand {

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
	public Link2ReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof de.uni_paderborn.fujaba.muml.hardware.platform.Link) {
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
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart && newEnd instanceof de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart)) {
			return false;
		}
		// Removed this check, because other cases are now implemented; Enhancement for MUML-BUG #446
		/*
		if (getLink().getConnectedBridges().size() != 1) {
		  return false;
		}
		 */
		de.uni_paderborn.fujaba.muml.hardware.platform.Bridge target = (de.uni_paderborn.fujaba.muml.hardware.platform.Bridge) getLink()
				.getConnectedBridges().get(0);
		if (!(getLink().eContainer() instanceof de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform container = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform) getLink()
				.eContainer();
		View sourceView = de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistLink_4011(container, getLink(),
						getNewSource(), target, sourceView, targetView)) {
			String errorMessage = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy
					.getLinkConstraints().getErrorLink_4011(container,
							getNewSource(), target, sourceView, targetView);
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
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.hardware.platform.Bridge && newEnd instanceof de.uni_paderborn.fujaba.muml.hardware.platform.Bridge)) {
			return false;
		}
		// Removed this check, because other cases are now implemented; Enhancement for MUML-BUG #446
		/*
		if (getLink().getConnectedHWPortParts().size() != 1) {
		  return false;
		}
		 */
		de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart source = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) getLink()
				.getConnectedHWPortParts().get(0);
		if (!(getLink().eContainer() instanceof de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform container = (de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform) getLink()
				.eContainer();
		View sourceView = de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistLink_4011(container, getLink(),
						source, getNewTarget(), sourceView, targetView)) {
			String errorMessage = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy
					.getLinkConstraints().getErrorLink_4011(container, source,
							getNewTarget(), sourceView, targetView);
			de.uni_paderborn.fujaba.muml.common.edit.policies.ErrorFeedbackEditPolicy
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
		if (getLink().getConnectedHWPortParts().size() > 1) {
			getLink().getConnectedHWPortParts().remove(getOldSource());
		}
		getLink().getConnectedHWPortParts().add(getNewSource());

		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {

		// Enhancement for MUML-BUG #446
		if (getLink().getConnectedBridges().size() > 1) {
			getLink().getConnectedBridges().remove(getOldTarget());
		}
		getLink().getConnectedBridges().add(getNewTarget());

		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.hardware.platform.Link getLink() {
		return (de.uni_paderborn.fujaba.muml.hardware.platform.Link) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart getOldSource() {
		return (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart getNewSource() {
		return (de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart) newEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.hardware.platform.Bridge getOldTarget() {
		return (de.uni_paderborn.fujaba.muml.hardware.platform.Bridge) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.hardware.platform.Bridge getNewTarget() {
		return (de.uni_paderborn.fujaba.muml.hardware.platform.Bridge) newEnd;
	}

	/**
	 * @generated
	 */
	protected int getReorientDirection() {
		return reorientDirection;
	}
}
