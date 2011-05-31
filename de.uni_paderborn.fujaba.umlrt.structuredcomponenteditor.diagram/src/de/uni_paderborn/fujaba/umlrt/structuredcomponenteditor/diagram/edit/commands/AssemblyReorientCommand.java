package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.commands;

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
public class AssemblyReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	protected final int reorientDirection;

	/**
	 * @generated
	 */
	protected final EObject oldEnd;

	/**
	 * @generated
	 */
	protected final EObject newEnd;

	/**
	 * @generated
	 */
	public AssemblyReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof de.uni_paderborn.fujaba.muml.model.component.Assembly) {
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
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.model.component.ComponentPart && newEnd instanceof de.uni_paderborn.fujaba.muml.model.component.ComponentPart)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.model.component.ComponentPart target = getLink()
				.getTo();
		if (!(getLink().eContainer() instanceof de.uni_paderborn.fujaba.muml.model.component.StructuredComponent)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.model.component.StructuredComponent container = (de.uni_paderborn.fujaba.muml.model.component.StructuredComponent) getLink()
				.eContainer();
		return de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.policies.MumlinstanceBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistAssembly_4004(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.model.component.ComponentPart && newEnd instanceof de.uni_paderborn.fujaba.muml.model.component.ComponentPart)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.model.component.ComponentPart source = getLink()
				.getFrom();
		if (!(getLink().eContainer() instanceof de.uni_paderborn.fujaba.muml.model.component.StructuredComponent)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.model.component.StructuredComponent container = (de.uni_paderborn.fujaba.muml.model.component.StructuredComponent) getLink()
				.eContainer();
		return de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.policies.MumlinstanceBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistAssembly_4004(container,
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
		getLink().setFrom(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTo(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.component.Assembly getLink() {
		return (de.uni_paderborn.fujaba.muml.model.component.Assembly) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.component.ComponentPart getOldSource() {
		return (de.uni_paderborn.fujaba.muml.model.component.ComponentPart) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.component.ComponentPart getNewSource() {
		return (de.uni_paderborn.fujaba.muml.model.component.ComponentPart) newEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.component.ComponentPart getOldTarget() {
		return (de.uni_paderborn.fujaba.muml.model.component.ComponentPart) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.component.ComponentPart getNewTarget() {
		return (de.uni_paderborn.fujaba.muml.model.component.ComponentPart) newEnd;
	}
}
