/*
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.pim.componentinstanceconfiguration.diagram.edit.commands;

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
public class DelegationConnectorInstanceReorientCommand extends EditElementCommand {

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
	public DelegationConnectorInstanceReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof org.muml.pim.instance.DelegationConnectorInstance) {
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
		if (!(getLink().eContainer() instanceof org.muml.pim.instance.ComponentInstanceConfiguration)) {
			return false;
		}
		org.muml.pim.instance.ComponentInstanceConfiguration container = (org.muml.pim.instance.ComponentInstanceConfiguration) getLink()
				.eContainer();
		View sourceView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!org.muml.pim.componentinstanceconfiguration.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistDelegationConnectorInstance_4002(container, getLink(), getNewSource(),
						target, sourceView, targetView)) {
			String errorMessage = org.muml.pim.componentinstanceconfiguration.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
					.getLinkConstraints().getErrorDelegationConnectorInstance_4002(container, getNewSource(), target,
							sourceView, targetView);
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
		if (!(getLink().eContainer() instanceof org.muml.pim.instance.ComponentInstanceConfiguration)) {
			return false;
		}
		org.muml.pim.instance.ComponentInstanceConfiguration container = (org.muml.pim.instance.ComponentInstanceConfiguration) getLink()
				.eContainer();
		View sourceView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!org.muml.pim.componentinstanceconfiguration.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistDelegationConnectorInstance_4002(container, getLink(), source,
						getNewTarget(), sourceView, targetView)) {
			String errorMessage = org.muml.pim.componentinstanceconfiguration.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
					.getLinkConstraints().getErrorDelegationConnectorInstance_4002(container, source, getNewTarget(),
							sourceView, targetView);
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
	protected org.muml.pim.instance.DelegationConnectorInstance getLink() {
		return (org.muml.pim.instance.DelegationConnectorInstance) getElementToEdit();
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
