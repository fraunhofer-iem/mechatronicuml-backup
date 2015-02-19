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
public class RoleConnectorConnectorQualityOfServiceAssumptionsReorientCommand
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
	public RoleConnectorConnectorQualityOfServiceAssumptionsReorientCommand(
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
		if (false == referenceOwner instanceof de.uni_paderborn.fujaba.muml.protocol.RoleConnector) {
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
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions && newEnd instanceof de.uni_paderborn.fujaba.muml.protocol.RoleConnector)) {
			return false;
		}
		View sourceView = de.uni_paderborn.fujaba.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = de.uni_paderborn.fujaba.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistRoleConnectorConnectorQualityOfServiceAssumptions_4009(
						getNewSource(), getOldTarget(), sourceView, targetView)) {
			String errorMessage = de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
					.getLinkConstraints()
					.getErrorRoleConnectorConnectorQualityOfServiceAssumptions_4009(
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
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions && newEnd instanceof de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions)) {
			return false;
		}
		View sourceView = de.uni_paderborn.fujaba.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = de.uni_paderborn.fujaba.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistRoleConnectorConnectorQualityOfServiceAssumptions_4009(
						getOldSource(), getNewTarget(), sourceView, targetView)) {
			String errorMessage = de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
					.getLinkConstraints()
					.getErrorRoleConnectorConnectorQualityOfServiceAssumptions_4009(
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

		getOldSource().setConnectorQualityOfServiceAssumptions(null);
		getNewSource().setConnectorQualityOfServiceAssumptions(getOldTarget());

		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {

		getOldSource().setConnectorQualityOfServiceAssumptions(getNewTarget());

		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.protocol.RoleConnector getOldSource() {
		return (de.uni_paderborn.fujaba.muml.protocol.RoleConnector) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.protocol.RoleConnector getNewSource() {
		return (de.uni_paderborn.fujaba.muml.protocol.RoleConnector) newEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions getOldTarget() {
		return (de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions getNewTarget() {
		return (de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions) newEnd;
	}

	/**
	 * @generated
	 */
	protected int getReorientDirection() {
		return reorientDirection;
	}
}
