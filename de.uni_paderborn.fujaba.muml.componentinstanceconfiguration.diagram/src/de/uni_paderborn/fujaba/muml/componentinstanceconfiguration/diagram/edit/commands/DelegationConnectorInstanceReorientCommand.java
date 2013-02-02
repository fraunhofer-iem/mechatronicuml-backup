package de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.commands;

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
public class DelegationConnectorInstanceReorientCommand extends
		EditElementCommand {

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
	public DelegationConnectorInstanceReorientCommand(
			ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof de.uni_paderborn.fujaba.muml.instance.DelegationConnectorInstance) {
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
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance && newEnd instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance)) {
			return false;
		}
		// Removed this check, because other cases are now implemented; Enhancement for MUML-BUG #446
		/*
		if (getLink().getConnectorEndpointInstances().size() != 1) {
		  return false;
		}
		 */
		de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance target = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) getLink()
				.getConnectorEndpointInstances().get(0);
		if (!(getLink().eContainer() instanceof de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration container = (de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration) getLink()
				.eContainer();
		View sourceView = de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistDelegationConnectorInstance_4002(
						container, getLink(), getNewSource(), target,
						sourceView, targetView)) {
			String errorMessage = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
					.getLinkConstraints()
					.getErrorDelegationConnectorInstance_4002(container,
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
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance && newEnd instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance)) {
			return false;
		}
		// Removed this check, because other cases are now implemented; Enhancement for MUML-BUG #446
		/*
		if (getLink().getConnectorEndpointInstances().size() != 1) {
		  return false;
		}
		 */
		de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance source = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) getLink()
				.getConnectorEndpointInstances().get(0);
		if (!(getLink().eContainer() instanceof de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration container = (de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration) getLink()
				.eContainer();
		View sourceView = de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistDelegationConnectorInstance_4002(
						container, getLink(), source, getNewTarget(),
						sourceView, targetView)) {
			String errorMessage = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
					.getLinkConstraints()
					.getErrorDelegationConnectorInstance_4002(container,
							source, getNewTarget(), sourceView, targetView);
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
	protected de.uni_paderborn.fujaba.muml.instance.DelegationConnectorInstance getLink() {
		return (de.uni_paderborn.fujaba.muml.instance.DelegationConnectorInstance) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance getOldSource() {
		return (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance getNewSource() {
		return (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) newEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance getOldTarget() {
		return (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance getNewTarget() {
		return (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) newEnd;
	}

	private EditPart host;

	/**
	 * @generated
	 */
	protected int getReorientDirection() {
		return reorientDirection;
	}
}
