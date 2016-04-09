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
package org.muml.reconfiguration.componentstorydiagram.diagram.edit.commands;

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
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.policies.ComponentStoryDiagramBaseItemSemanticEditPolicy;
import org.muml.reconfiguration.componentstorypattern.MultiPortOrderConstraint;
import org.muml.reconfiguration.componentstorypattern.MultiPortVariable;
import org.muml.reconfiguration.componentstorypattern.SinglePortVariable;

/**
 * @generated
 */
public class MultiPortOrderConstraintReorientCommand extends EditElementCommand {

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
	public MultiPortOrderConstraintReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof MultiPortOrderConstraint) {
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
		if (!(oldEnd instanceof SinglePortVariable && newEnd instanceof SinglePortVariable)) {
			return false;
		}
		SinglePortVariable target = getLink().getTgtSubPortVariable();
		if (!(getLink().eContainer() instanceof MultiPortVariable)) {
			return false;
		}
		MultiPortVariable container = (MultiPortVariable) getLink().eContainer();
		View sourceView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getSourceView(getRequest());
		View targetView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getTargetView(getRequest());
		if (!ComponentStoryDiagramBaseItemSemanticEditPolicy.getLinkConstraints().canExistMultiPortOrderConstraint_4006(
				container, getLink(), getNewSource(), target, sourceView, targetView)) {
			String errorMessage = ComponentStoryDiagramBaseItemSemanticEditPolicy.getLinkConstraints()
					.getErrorMultiPortOrderConstraint_4006(container, getNewSource(), target, sourceView, targetView);
			ErrorFeedbackEditPolicy.showMessage(sourceView, errorMessage);
			return false;
		}
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof SinglePortVariable && newEnd instanceof SinglePortVariable)) {
			return false;
		}
		SinglePortVariable source = getLink().getSrcSubPortVariable();
		if (!(getLink().eContainer() instanceof MultiPortVariable)) {
			return false;
		}
		MultiPortVariable container = (MultiPortVariable) getLink().eContainer();
		View sourceView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getSourceView(getRequest());
		View targetView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getTargetView(getRequest());
		if (!ComponentStoryDiagramBaseItemSemanticEditPolicy.getLinkConstraints().canExistMultiPortOrderConstraint_4006(
				container, getLink(), source, getNewTarget(), sourceView, targetView)) {
			String errorMessage = ComponentStoryDiagramBaseItemSemanticEditPolicy.getLinkConstraints()
					.getErrorMultiPortOrderConstraint_4006(container, source, getNewTarget(), sourceView, targetView);
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

		getLink().setSrcSubPortVariable(getNewSource());

		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {

		getLink().setTgtSubPortVariable(getNewTarget());

		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected MultiPortOrderConstraint getLink() {
		return (MultiPortOrderConstraint) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected SinglePortVariable getOldSource() {
		return (SinglePortVariable) oldEnd;
	}

	/**
	 * @generated
	 */
	protected SinglePortVariable getNewSource() {
		return (SinglePortVariable) newEnd;
	}

	/**
	 * @generated
	 */
	protected SinglePortVariable getOldTarget() {
		return (SinglePortVariable) oldEnd;
	}

	/**
	 * @generated
	 */
	protected SinglePortVariable getNewTarget() {
		return (SinglePortVariable) newEnd;
	}

	/**
	 * @generated
	 */
	protected int getReorientDirection() {
		return reorientDirection;
	}
}
