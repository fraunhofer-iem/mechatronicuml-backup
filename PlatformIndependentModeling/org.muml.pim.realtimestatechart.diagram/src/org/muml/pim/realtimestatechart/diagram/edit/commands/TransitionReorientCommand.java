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
package org.muml.pim.realtimestatechart.diagram.edit.commands;

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
public class TransitionReorientCommand extends EditElementCommand {

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
	public TransitionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof org.muml.pim.realtimestatechart.Transition) {
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
		if (!(oldEnd instanceof org.muml.pim.realtimestatechart.Vertex
				&& newEnd instanceof org.muml.pim.realtimestatechart.Vertex)) {
			return false;
		}
		org.muml.pim.realtimestatechart.Vertex target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof org.muml.pim.realtimestatechart.RealtimeStatechart)) {
			return false;
		}
		org.muml.pim.realtimestatechart.RealtimeStatechart container = (org.muml.pim.realtimestatechart.RealtimeStatechart) getLink()
				.eContainer();
		View sourceView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!org.muml.pim.realtimestatechart.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistTransition_4003(container, getLink(), getNewSource(), target, sourceView, targetView)) {
			String errorMessage = org.muml.pim.realtimestatechart.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
					.getLinkConstraints()
					.getErrorTransition_4003(container, getNewSource(), target, sourceView, targetView);
			org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy.showMessage(sourceView, errorMessage);
			return false;
		}
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof org.muml.pim.realtimestatechart.Vertex
				&& newEnd instanceof org.muml.pim.realtimestatechart.Vertex)) {
			return false;
		}
		org.muml.pim.realtimestatechart.Vertex source = getLink().getSource();
		if (!(getLink().eContainer() instanceof org.muml.pim.realtimestatechart.RealtimeStatechart)) {
			return false;
		}
		org.muml.pim.realtimestatechart.RealtimeStatechart container = (org.muml.pim.realtimestatechart.RealtimeStatechart) getLink()
				.eContainer();
		View sourceView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!org.muml.pim.realtimestatechart.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistTransition_4003(container, getLink(), source, getNewTarget(), sourceView, targetView)) {
			String errorMessage = org.muml.pim.realtimestatechart.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
					.getLinkConstraints()
					.getErrorTransition_4003(container, source, getNewTarget(), sourceView, targetView);
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

		getLink().setSource(getNewSource());

		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {

		getLink().setTarget(getNewTarget());

		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected org.muml.pim.realtimestatechart.Transition getLink() {
		return (org.muml.pim.realtimestatechart.Transition) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected org.muml.pim.realtimestatechart.Vertex getOldSource() {
		return (org.muml.pim.realtimestatechart.Vertex) oldEnd;
	}

	/**
	 * @generated
	 */
	protected org.muml.pim.realtimestatechart.Vertex getNewSource() {
		return (org.muml.pim.realtimestatechart.Vertex) newEnd;
	}

	/**
	 * @generated
	 */
	protected org.muml.pim.realtimestatechart.Vertex getOldTarget() {
		return (org.muml.pim.realtimestatechart.Vertex) oldEnd;
	}

	/**
	 * @generated
	 */
	protected org.muml.pim.realtimestatechart.Vertex getNewTarget() {
		return (org.muml.pim.realtimestatechart.Vertex) newEnd;
	}

	/**
	 * @generated
	 */
	protected int getReorientDirection() {
		return reorientDirection;
	}
}
