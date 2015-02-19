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
package de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.commands;

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
public class DiscreteInteractionEndpointReceiverMessageBufferReorientCommand
		extends EditElementCommand {

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
		if (false == referenceOwner instanceof de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint) {
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
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.connector.MessageBuffer && newEnd instanceof de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint)) {
			return false;
		}
		View sourceView = de.uni_paderborn.fujaba.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = de.uni_paderborn.fujaba.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistDiscreteInteractionEndpointReceiverMessageBuffer_4008(
						getNewSource(), getOldTarget(), sourceView, targetView)) {
			String errorMessage = de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
					.getLinkConstraints()
					.getErrorDiscreteInteractionEndpointReceiverMessageBuffer_4008(
							getNewSource(), getOldTarget(), sourceView,
							targetView);
			de.uni_paderborn.fujaba.common.edit.policies.ErrorFeedbackEditPolicy
					.showMessage(sourceView, errorMessage);
			return false;
		}
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.connector.MessageBuffer && newEnd instanceof de.uni_paderborn.fujaba.muml.connector.MessageBuffer)) {
			return false;
		}
		View sourceView = de.uni_paderborn.fujaba.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = de.uni_paderborn.fujaba.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistDiscreteInteractionEndpointReceiverMessageBuffer_4008(
						getOldSource(), getNewTarget(), sourceView, targetView)) {
			String errorMessage = de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
					.getLinkConstraints()
					.getErrorDiscreteInteractionEndpointReceiverMessageBuffer_4008(
							getOldSource(), getNewTarget(), sourceView,
							targetView);
			de.uni_paderborn.fujaba.common.edit.policies.ErrorFeedbackEditPolicy
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
	protected de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint getOldSource() {
		return (de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint getNewSource() {
		return (de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint) newEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.connector.MessageBuffer getOldTarget() {
		return (de.uni_paderborn.fujaba.muml.connector.MessageBuffer) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.connector.MessageBuffer getNewTarget() {
		return (de.uni_paderborn.fujaba.muml.connector.MessageBuffer) newEnd;
	}

	/**
	 * @generated
	 */
	protected int getReorientDirection() {
		return reorientDirection;
	}
}
