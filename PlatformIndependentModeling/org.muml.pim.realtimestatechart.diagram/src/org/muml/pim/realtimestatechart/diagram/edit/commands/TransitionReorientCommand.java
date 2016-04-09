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
import org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy;
import org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.pim.realtimestatechart.Vertex;
import org.muml.pim.realtimestatechart.diagram.edit.policies.MumlBaseItemSemanticEditPolicy;

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
		if (false == getElementToEdit() instanceof Transition) {
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
		if (!(oldEnd instanceof Vertex && newEnd instanceof Vertex)) {
			return false;
		}
		Vertex target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof RealtimeStatechart)) {
			return false;
		}
		RealtimeStatechart container = (RealtimeStatechart) getLink().eContainer();
		View sourceView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getSourceView(getRequest());
		View targetView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getTargetView(getRequest());
		if (!MumlBaseItemSemanticEditPolicy.getLinkConstraints().canExistTransition_4003(container, getLink(),
				getNewSource(), target, sourceView, targetView)) {
			String errorMessage = MumlBaseItemSemanticEditPolicy.getLinkConstraints().getErrorTransition_4003(container,
					getNewSource(), target, sourceView, targetView);
			ErrorFeedbackEditPolicy.showMessage(sourceView, errorMessage);
			return false;
		}
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Vertex && newEnd instanceof Vertex)) {
			return false;
		}
		Vertex source = getLink().getSource();
		if (!(getLink().eContainer() instanceof RealtimeStatechart)) {
			return false;
		}
		RealtimeStatechart container = (RealtimeStatechart) getLink().eContainer();
		View sourceView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getSourceView(getRequest());
		View targetView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getTargetView(getRequest());
		if (!MumlBaseItemSemanticEditPolicy.getLinkConstraints().canExistTransition_4003(container, getLink(), source,
				getNewTarget(), sourceView, targetView)) {
			String errorMessage = MumlBaseItemSemanticEditPolicy.getLinkConstraints().getErrorTransition_4003(container,
					source, getNewTarget(), sourceView, targetView);
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
	protected Transition getLink() {
		return (Transition) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Vertex getOldSource() {
		return (Vertex) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Vertex getNewSource() {
		return (Vertex) newEnd;
	}

	/**
	 * @generated
	 */
	protected Vertex getOldTarget() {
		return (Vertex) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Vertex getNewTarget() {
		return (Vertex) newEnd;
	}

	/**
	 * @generated
	 */
	protected int getReorientDirection() {
		return reorientDirection;
	}
}
