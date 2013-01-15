package de.uni_paderborn.fujaba.muml.deployment.diagram.edit.commands;

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
public class CommunicationLinkReorientCommand extends EditElementCommand {

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
	public CommunicationLinkReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink) {
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
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort && newEnd instanceof de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort)) {
			return false;
		}
		// Removed this check, because other cases are now implemented; Enhancement for MUML-BUG #446
		/*
		if (getLink().getHardwarePorts().size() != 1) {
		  return false;
		}
		 */
		de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort target = (de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort) getLink()
				.getHardwarePorts().get(0);
		if (!(getLink().eContainer() instanceof de.uni_paderborn.fujaba.muml.model.deployment.Deployment)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.model.deployment.Deployment container = (de.uni_paderborn.fujaba.muml.model.deployment.Deployment) getLink()
				.eContainer();
		return de.uni_paderborn.fujaba.muml.deployment.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistCommunicationLink_4001(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort && newEnd instanceof de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort)) {
			return false;
		}
		// Removed this check, because other cases are now implemented; Enhancement for MUML-BUG #446
		/*
		if (getLink().getHardwarePorts().size() != 1) {
		  return false;
		}
		 */
		de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort source = (de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort) getLink()
				.getHardwarePorts().get(0);
		if (!(getLink().eContainer() instanceof de.uni_paderborn.fujaba.muml.model.deployment.Deployment)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.model.deployment.Deployment container = (de.uni_paderborn.fujaba.muml.model.deployment.Deployment) getLink()
				.eContainer();
		return de.uni_paderborn.fujaba.muml.deployment.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistCommunicationLink_4001(container,
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
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink getLink() {
		return (de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort getOldSource() {
		return (de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort getNewSource() {
		return (de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort) newEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort getOldTarget() {
		return (de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort getNewTarget() {
		return (de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort) newEnd;
	}

	/**
	 * @generated
	 */
	protected int getReorientDirection() {
		return reorientDirection;
	}
}
