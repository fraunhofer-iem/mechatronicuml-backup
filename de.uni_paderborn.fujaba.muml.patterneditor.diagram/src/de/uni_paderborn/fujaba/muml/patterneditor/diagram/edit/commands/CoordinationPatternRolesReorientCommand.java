package de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class CoordinationPatternRolesReorientCommand extends EditElementCommand {

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
	public CoordinationPatternRolesReorientCommand(
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
		if (false == getElementToEdit() instanceof de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector) {
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
		if (getLink().getConnectorEndpoints().size() != 1) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint target = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) getLink()
				.getConnectorEndpoints().get(0);
		if (!(getLink().eContainer() instanceof de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol container = (de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol) getLink()
				.eContainer();
		return de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRoleConnector_4005(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint && newEnd instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint)) {
			return false;
		}
		if (getLink().getConnectorEndpoints().size() != 1) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint source = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) getLink()
				.getConnectorEndpoints().get(0);
		if (!(getLink().eContainer() instanceof de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol container = (de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol) getLink()
				.eContainer();
		return de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRoleConnector_4005(container,
						getLink(), source, getNewTarget());
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
		getLink().getConnectorEndpoints().remove(getOldSource());
		getLink().getConnectorEndpoints().add(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().getConnectorEndpoints().remove(getOldTarget());
		getLink().getConnectorEndpoints().add(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector getLink() {
		return (de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector) getElementToEdit();
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
