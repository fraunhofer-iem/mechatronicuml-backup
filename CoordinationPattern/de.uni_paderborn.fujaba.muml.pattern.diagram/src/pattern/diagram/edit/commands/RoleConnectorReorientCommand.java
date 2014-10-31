package pattern.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;

import pattern.diagram.edit.policies.Pattern2BaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class RoleConnectorReorientCommand extends EditElementCommand {

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
	public RoleConnectorReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof de.uni_paderborn.fujaba.muml.protocol.RoleConnector) {
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
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint && newEnd instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint)) {
			return false;
		}
		// Removed this check, because other cases are now implemented; Enhancement for MUML-BUG #446
		/*
		if (getLink().getConnectorEndpoints().size() != 1) {
		  return false;
		}
		 */
		de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint target = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) getLink()
				.getConnectorEndpoints().get(0);
		if (!(getLink().eContainer() instanceof de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification container = (de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification) getLink()
				.eContainer();
		View sourceView = de.uni_paderborn.fujaba.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = de.uni_paderborn.fujaba.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!Pattern2BaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRoleConnector_4001(container, getLink(),
						getNewSource(), target, sourceView, targetView)) {
			String errorMessage = Pattern2BaseItemSemanticEditPolicy
					.getLinkConstraints().getErrorRoleConnector_4001(container,
							getNewSource(), target, sourceView, targetView);
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
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint && newEnd instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint)) {
			return false;
		}
		// Removed this check, because other cases are now implemented; Enhancement for MUML-BUG #446
		/*
		if (getLink().getConnectorEndpoints().size() != 1) {
		  return false;
		}
		 */
		de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint source = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) getLink()
				.getConnectorEndpoints().get(0);
		if (!(getLink().eContainer() instanceof de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification container = (de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification) getLink()
				.eContainer();
		View sourceView = de.uni_paderborn.fujaba.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = de.uni_paderborn.fujaba.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!Pattern2BaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRoleConnector_4001(container, getLink(), source,
						getNewTarget(), sourceView, targetView)) {
			String errorMessage = Pattern2BaseItemSemanticEditPolicy
					.getLinkConstraints().getErrorRoleConnector_4001(container,
							source, getNewTarget(), sourceView, targetView);
			de.uni_paderborn.fujaba.common.edit.policies.ErrorFeedbackEditPolicy
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
	protected de.uni_paderborn.fujaba.muml.protocol.RoleConnector getLink() {
		return (de.uni_paderborn.fujaba.muml.protocol.RoleConnector) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint getOldSource() {
		return (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint getNewSource() {
		return (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) newEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint getOldTarget() {
		return (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint getNewTarget() {
		return (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) newEnd;
	}

	/**
	 * @generated
	 */
	protected int getReorientDirection() {
		return reorientDirection;
	}
}
