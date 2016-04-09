package org.muml.pm.hardware.platforminstance.diagram.edit.commands;

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
import org.muml.pim.connector.ConnectorEndpointInstance;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance;
import org.muml.pm.hardware.platforminstance.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class NetworkConnectorInstanceReorientCommand extends EditElementCommand {

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
	public NetworkConnectorInstanceReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof NetworkConnectorInstance) {
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
		if (!(oldEnd instanceof ConnectorEndpointInstance && newEnd instanceof ConnectorEndpointInstance)) {
			return false;
		}
		// Removed this check, because other cases are now implemented; Enhancement for MUML-BUG #446
		/*
		if (getLink().getConnectorEndpointInstances().size() != 1) {
		  return false;
		}
		*/
		ConnectorEndpointInstance target = (ConnectorEndpointInstance) getLink().getConnectorEndpointInstances().get(0);
		if (!(getLink().eContainer() instanceof HWPlatformInstanceConfiguration)) {
			return false;
		}
		HWPlatformInstanceConfiguration container = (HWPlatformInstanceConfiguration) getLink().eContainer();
		View sourceView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getSourceView(getRequest());
		View targetView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getTargetView(getRequest());
		if (!HardwareBaseItemSemanticEditPolicy.getLinkConstraints().canExistNetworkConnectorInstance_4012(container,
				getLink(), getNewSource(), target, sourceView, targetView)) {
			String errorMessage = HardwareBaseItemSemanticEditPolicy.getLinkConstraints()
					.getErrorNetworkConnectorInstance_4012(container, getNewSource(), target, sourceView, targetView);
			ErrorFeedbackEditPolicy.showMessage(sourceView, errorMessage);
			return false;
		}
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ConnectorEndpointInstance && newEnd instanceof ConnectorEndpointInstance)) {
			return false;
		}
		// Removed this check, because other cases are now implemented; Enhancement for MUML-BUG #446
		/*
		if (getLink().getConnectorEndpointInstances().size() != 1) {
		  return false;
		}
		*/
		ConnectorEndpointInstance source = (ConnectorEndpointInstance) getLink().getConnectorEndpointInstances().get(0);
		if (!(getLink().eContainer() instanceof HWPlatformInstanceConfiguration)) {
			return false;
		}
		HWPlatformInstanceConfiguration container = (HWPlatformInstanceConfiguration) getLink().eContainer();
		View sourceView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getSourceView(getRequest());
		View targetView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getTargetView(getRequest());
		if (!HardwareBaseItemSemanticEditPolicy.getLinkConstraints().canExistNetworkConnectorInstance_4012(container,
				getLink(), source, getNewTarget(), sourceView, targetView)) {
			String errorMessage = HardwareBaseItemSemanticEditPolicy.getLinkConstraints()
					.getErrorNetworkConnectorInstance_4012(container, source, getNewTarget(), sourceView, targetView);
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
		if (getLink().getConnectorEndpointInstances().size() > 1) {
			getLink().getConnectorEndpointInstances().remove(getOldSource());
		}
		getLink().getConnectorEndpointInstances().add(getNewSource());

		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {

		// Enhancement for MUML-BUG #446
		if (getLink().getConnectorEndpointInstances().size() > 1) {
			getLink().getConnectorEndpointInstances().remove(getOldTarget());
		}
		getLink().getConnectorEndpointInstances().add(getNewTarget());

		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected NetworkConnectorInstance getLink() {
		return (NetworkConnectorInstance) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected ConnectorEndpointInstance getOldSource() {
		return (ConnectorEndpointInstance) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ConnectorEndpointInstance getNewSource() {
		return (ConnectorEndpointInstance) newEnd;
	}

	/**
	 * @generated
	 */
	protected ConnectorEndpointInstance getOldTarget() {
		return (ConnectorEndpointInstance) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ConnectorEndpointInstance getNewTarget() {
		return (ConnectorEndpointInstance) newEnd;
	}

	/**
	 * @generated
	 */
	protected int getReorientDirection() {
		return reorientDirection;
	}
}
