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
package org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.commands;

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
	public MultiPortOrderConstraintReorientCommand(
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
		if (false == getElementToEdit() instanceof org.muml.reconfiguration.componentstorypattern.MultiPortOrderConstraint) {
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
		if (!(oldEnd instanceof org.muml.reconfiguration.componentstorypattern.SinglePortVariable && newEnd instanceof org.muml.reconfiguration.componentstorypattern.SinglePortVariable)) {
			return false;
		}
		org.muml.reconfiguration.componentstorypattern.SinglePortVariable target = getLink()
				.getTgtSubPortVariable();
		if (!(getLink().eContainer() instanceof org.muml.reconfiguration.componentstorypattern.MultiPortVariable)) {
			return false;
		}
		org.muml.reconfiguration.componentstorypattern.MultiPortVariable container = (org.muml.reconfiguration.componentstorypattern.MultiPortVariable) getLink()
				.eContainer();
		View sourceView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.policies.ComponentSDDBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistMultiPortOrderConstraint_4004(
						container, getLink(), getNewSource(), target,
						sourceView, targetView)) {
			String errorMessage = org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.policies.ComponentSDDBaseItemSemanticEditPolicy
					.getLinkConstraints()
					.getErrorMultiPortOrderConstraint_4004(container,
							getNewSource(), target, sourceView, targetView);
			org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy
					.showMessage(sourceView, errorMessage);
			return false;
		}
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof org.muml.reconfiguration.componentstorypattern.SinglePortVariable && newEnd instanceof org.muml.reconfiguration.componentstorypattern.SinglePortVariable)) {
			return false;
		}
		org.muml.reconfiguration.componentstorypattern.SinglePortVariable source = getLink()
				.getSrcSubPortVariable();
		if (!(getLink().eContainer() instanceof org.muml.reconfiguration.componentstorypattern.MultiPortVariable)) {
			return false;
		}
		org.muml.reconfiguration.componentstorypattern.MultiPortVariable container = (org.muml.reconfiguration.componentstorypattern.MultiPortVariable) getLink()
				.eContainer();
		View sourceView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.policies.ComponentSDDBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistMultiPortOrderConstraint_4004(
						container, getLink(), source, getNewTarget(),
						sourceView, targetView)) {
			String errorMessage = org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.policies.ComponentSDDBaseItemSemanticEditPolicy
					.getLinkConstraints()
					.getErrorMultiPortOrderConstraint_4004(container, source,
							getNewTarget(), sourceView, targetView);
			org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy
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
	protected org.muml.reconfiguration.componentstorypattern.MultiPortOrderConstraint getLink() {
		return (org.muml.reconfiguration.componentstorypattern.MultiPortOrderConstraint) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected org.muml.reconfiguration.componentstorypattern.SinglePortVariable getOldSource() {
		return (org.muml.reconfiguration.componentstorypattern.SinglePortVariable) oldEnd;
	}

	/**
	 * @generated
	 */
	protected org.muml.reconfiguration.componentstorypattern.SinglePortVariable getNewSource() {
		return (org.muml.reconfiguration.componentstorypattern.SinglePortVariable) newEnd;
	}

	/**
	 * @generated
	 */
	protected org.muml.reconfiguration.componentstorypattern.SinglePortVariable getOldTarget() {
		return (org.muml.reconfiguration.componentstorypattern.SinglePortVariable) oldEnd;
	}

	/**
	 * @generated
	 */
	protected org.muml.reconfiguration.componentstorypattern.SinglePortVariable getNewTarget() {
		return (org.muml.reconfiguration.componentstorypattern.SinglePortVariable) newEnd;
	}

	/**
	 * @generated
	 */
	protected int getReorientDirection() {
		return reorientDirection;
	}
}
