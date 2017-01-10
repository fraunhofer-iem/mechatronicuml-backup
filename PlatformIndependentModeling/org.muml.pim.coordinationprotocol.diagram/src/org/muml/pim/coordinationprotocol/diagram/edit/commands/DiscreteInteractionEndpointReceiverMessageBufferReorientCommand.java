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
package org.muml.pim.coordinationprotocol.diagram.edit.commands;

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
import org.muml.pim.connector.DiscreteInteractionEndpoint;
import org.muml.pim.connector.MessageBuffer;
import org.muml.pim.coordinationprotocol.diagram.edit.policies.MumlBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class DiscreteInteractionEndpointReceiverMessageBufferReorientCommand extends EditElementCommand {

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
	public DiscreteInteractionEndpointReceiverMessageBufferReorientCommand(
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
		if (false == referenceOwner instanceof DiscreteInteractionEndpoint) {
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
		if (!(oldEnd instanceof MessageBuffer && newEnd instanceof DiscreteInteractionEndpoint)) {
			return false;
		}
		View sourceView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getSourceView(getRequest());
		View targetView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getTargetView(getRequest());
		if (!MumlBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistDiscreteInteractionEndpointReceiverMessageBuffer_4008(getNewSource(), getOldTarget(),
						sourceView, targetView)) {
			String errorMessage = MumlBaseItemSemanticEditPolicy.getLinkConstraints()
					.getErrorDiscreteInteractionEndpointReceiverMessageBuffer_4008(getNewSource(), getOldTarget(),
							sourceView, targetView);
			ErrorFeedbackEditPolicy.showMessage(sourceView, errorMessage);
			return false;
		}
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof MessageBuffer && newEnd instanceof MessageBuffer)) {
			return false;
		}
		View sourceView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getSourceView(getRequest());
		View targetView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getTargetView(getRequest());
		if (!MumlBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistDiscreteInteractionEndpointReceiverMessageBuffer_4008(getOldSource(), getNewTarget(),
						sourceView, targetView)) {
			String errorMessage = MumlBaseItemSemanticEditPolicy.getLinkConstraints()
					.getErrorDiscreteInteractionEndpointReceiverMessageBuffer_4008(getOldSource(), getNewTarget(),
							sourceView, targetView);
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

		// Enhancement for MUML-BUG #446
		if (getOldSource().getReceiverMessageBuffer().size() > 1) {
			getOldSource().getReceiverMessageBuffer().remove(getOldTarget());
		}
		getNewSource().getReceiverMessageBuffer().add(getOldTarget());

		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {

		// Enhancement for MUML-BUG #446
		if (getOldSource().getReceiverMessageBuffer().size() > 1) {
			getOldSource().getReceiverMessageBuffer().remove(getOldTarget());
		}
		getOldSource().getReceiverMessageBuffer().add(getNewTarget());

		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected DiscreteInteractionEndpoint getOldSource() {
		return (DiscreteInteractionEndpoint) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected DiscreteInteractionEndpoint getNewSource() {
		return (DiscreteInteractionEndpoint) newEnd;
	}

	/**
	 * @generated
	 */
	protected MessageBuffer getOldTarget() {
		return (MessageBuffer) oldEnd;
	}

	/**
	 * @generated
	 */
	protected MessageBuffer getNewTarget() {
		return (MessageBuffer) newEnd;
	}

	/**
	 * @generated
	 */
	protected int getReorientDirection() {
		return reorientDirection;
	}
}
