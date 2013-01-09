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
		if (false == getElementToEdit() instanceof de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol) {
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
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol && newEnd instanceof de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol)) {
			return false;
		}
		if (getLink().getRoles().size() != 1) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.model.protocol.Role target = (de.uni_paderborn.fujaba.muml.model.protocol.Role) getLink()
				.getRoles().get(0);
		return de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistCoordinationProtocol_4006(
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.model.protocol.Role && newEnd instanceof de.uni_paderborn.fujaba.muml.model.protocol.Role)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol source = (de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol) getLink()
				.eContainer();
		return de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistCoordinationProtocol_4006(
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
		getOldSource().setCoordinationProtocol(null);
		getNewSource().setCoordinationProtocol(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().getRoles().remove(getOldTarget());
		getLink().getRoles().add(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol getLink() {
		return (de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol getOldSource() {
		return (de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol getNewSource() {
		return (de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol) newEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.protocol.Role getOldTarget() {
		return (de.uni_paderborn.fujaba.muml.model.protocol.Role) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.protocol.Role getNewTarget() {
		return (de.uni_paderborn.fujaba.muml.model.protocol.Role) newEnd;
	}

	/**
	 * @generated
	 */
	protected int getReorientDirection() {
		return reorientDirection;
	}
}
