package org.muml.pm.hardware.platforminstance.diagram.edit.commands;

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
		if (false == getElementToEdit() instanceof org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance) {
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
		if (!(oldEnd instanceof org.muml.pim.connector.ConnectorEndpointInstance
				&& newEnd instanceof org.muml.pim.connector.ConnectorEndpointInstance)) {
			return false;
		}
		// Removed this check, because other cases are now implemented; Enhancement for MUML-BUG #446
		/*
		if (getLink().getConnectorEndpointInstances().size() != 1) {
		  return false;
		}
		*/
		org.muml.pim.connector.ConnectorEndpointInstance target = (org.muml.pim.connector.ConnectorEndpointInstance) getLink()
				.getConnectorEndpointInstances().get(0);
		if (!(getLink()
				.eContainer() instanceof org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration)) {
			return false;
		}
		org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration container = (org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration) getLink()
				.eContainer();
		View sourceView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!org.muml.pm.hardware.platforminstance.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistNetworkConnectorInstance_4012(container, getLink(), getNewSource(),
						target, sourceView, targetView)) {
			String errorMessage = org.muml.pm.hardware.platforminstance.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy
					.getLinkConstraints()
					.getErrorNetworkConnectorInstance_4012(container, getNewSource(), target, sourceView, targetView);
			org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy.showMessage(sourceView, errorMessage);
			return false;
		}
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof org.muml.pim.connector.ConnectorEndpointInstance
				&& newEnd instanceof org.muml.pim.connector.ConnectorEndpointInstance)) {
			return false;
		}
		// Removed this check, because other cases are now implemented; Enhancement for MUML-BUG #446
		/*
		if (getLink().getConnectorEndpointInstances().size() != 1) {
		  return false;
		}
		*/
		org.muml.pim.connector.ConnectorEndpointInstance source = (org.muml.pim.connector.ConnectorEndpointInstance) getLink()
				.getConnectorEndpointInstances().get(0);
		if (!(getLink()
				.eContainer() instanceof org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration)) {
			return false;
		}
		org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration container = (org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration) getLink()
				.eContainer();
		View sourceView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!org.muml.pm.hardware.platforminstance.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistNetworkConnectorInstance_4012(container, getLink(), source,
						getNewTarget(), sourceView, targetView)) {
			String errorMessage = org.muml.pm.hardware.platforminstance.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy
					.getLinkConstraints()
					.getErrorNetworkConnectorInstance_4012(container, source, getNewTarget(), sourceView, targetView);
			org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy.showMessage(sourceView, errorMessage);
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
	protected org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance getLink() {
		return (org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected org.muml.pim.connector.ConnectorEndpointInstance getOldSource() {
		return (org.muml.pim.connector.ConnectorEndpointInstance) oldEnd;
	}

	/**
	 * @generated
	 */
	protected org.muml.pim.connector.ConnectorEndpointInstance getNewSource() {
		return (org.muml.pim.connector.ConnectorEndpointInstance) newEnd;
	}

	/**
	 * @generated
	 */
	protected org.muml.pim.connector.ConnectorEndpointInstance getOldTarget() {
		return (org.muml.pim.connector.ConnectorEndpointInstance) oldEnd;
	}

	/**
	 * @generated
	 */
	protected org.muml.pim.connector.ConnectorEndpointInstance getNewTarget() {
		return (org.muml.pim.connector.ConnectorEndpointInstance) newEnd;
	}

	/**
	 * @generated
	 */
	protected int getReorientDirection() {
		return reorientDirection;
	}
}
