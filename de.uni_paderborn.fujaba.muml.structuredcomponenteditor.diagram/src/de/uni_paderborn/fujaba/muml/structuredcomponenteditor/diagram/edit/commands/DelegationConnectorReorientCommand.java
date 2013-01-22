package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.commands;

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
public class DelegationConnectorReorientCommand extends EditElementCommand {

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
	public DelegationConnectorReorientCommand(
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
		if (false == getElementToEdit() instanceof de.uni_paderborn.fujaba.muml.model.component.DelegationConnector) {
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
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint && newEnd instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint)) {
			return false;
		}
		// Removed this check, because other cases are now implemented; Enhancement for MUML-BUG #446
		/*
		if (getLink().getConnectorEndpoints().size() != 1) {
		  return false;
		}
		 */
		de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint target = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) getLink()
				.getConnectorEndpoints().get(0);
		if (!(getLink().eContainer() instanceof de.uni_paderborn.fujaba.muml.model.component.StructuredComponent)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.model.component.StructuredComponent container = (de.uni_paderborn.fujaba.muml.model.component.StructuredComponent) getLink()
				.eContainer();
		View sourceView = de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		return de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistDelegationConnector_4002(
						container, getLink(), getNewSource(), target,
						sourceView, targetView);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint && newEnd instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint)) {
			return false;
		}
		// Removed this check, because other cases are now implemented; Enhancement for MUML-BUG #446
		/*
		if (getLink().getConnectorEndpoints().size() != 1) {
		  return false;
		}
		 */
		de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint source = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) getLink()
				.getConnectorEndpoints().get(0);
		if (!(getLink().eContainer() instanceof de.uni_paderborn.fujaba.muml.model.component.StructuredComponent)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.model.component.StructuredComponent container = (de.uni_paderborn.fujaba.muml.model.component.StructuredComponent) getLink()
				.eContainer();
		View sourceView = de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		return de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistDelegationConnector_4002(
						container, getLink(), source, getNewTarget(),
						sourceView, targetView);
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
		if (getLink().getConnectorEndpoints().size() > 1) {
			getLink().getConnectorEndpoints().remove(getOldSource());
		}
		getLink().getConnectorEndpoints().add(getNewSource());

		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {

		// Enhancement for MUML-BUG #446
		if (getLink().getConnectorEndpoints().size() > 1) {
			getLink().getConnectorEndpoints().remove(getOldTarget());
		}
		getLink().getConnectorEndpoints().add(getNewTarget());

		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.component.DelegationConnector getLink() {
		return (de.uni_paderborn.fujaba.muml.model.component.DelegationConnector) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint getOldSource() {
		return (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint getNewSource() {
		return (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) newEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint getOldTarget() {
		return (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint getNewTarget() {
		return (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) newEnd;
	}

	/**
	 * @generated
	 */
	protected int getReorientDirection() {
		return reorientDirection;
	}
}
