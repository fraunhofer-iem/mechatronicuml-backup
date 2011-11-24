package de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class MessageInterfaceSuperTypeReorientCommand extends
		EditElementCommand {

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
	public MessageInterfaceSuperTypeReorientCommand(
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
		if (false == referenceOwner instanceof de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface) {
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
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface && newEnd instanceof de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface)) {
			return false;
		}
		return de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistMessageInterfaceSuperType_4003(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface && newEnd instanceof de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface)) {
			return false;
		}
		return de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistMessageInterfaceSuperType_4003(
						getOldSource(), getNewTarget());
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
		getOldSource().getSuperType().remove(getOldTarget());
		getNewSource().getSuperType().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getSuperType().remove(getOldTarget());
		getOldSource().getSuperType().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface getOldSource() {
		return (de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface getNewSource() {
		return (de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface) newEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface getOldTarget() {
		return (de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface getNewTarget() {
		return (de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface) newEnd;
	}
}
