package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.commands;

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
public class AssemblyVariableReorientCommand extends EditElementCommand {

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
	public AssemblyVariableReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.AssemblyVariable) {
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
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable && newEnd instanceof de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable target = getLink()
				.getTarget();
		if (!(getLink().eContainer() instanceof de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable container = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable) getLink()
				.eContainer();
		return de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.policies.ComponentStoryDiagramBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistAssemblyVariable_4002(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable && newEnd instanceof de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable source = getLink()
				.getSource();
		if (!(getLink().eContainer() instanceof de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable container = (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable) getLink()
				.eContainer();
		return de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.policies.ComponentStoryDiagramBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistAssemblyVariable_4002(container,
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
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.AssemblyVariable getLink() {
		return (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.AssemblyVariable) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable getOldSource() {
		return (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable getNewSource() {
		return (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable) newEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable getOldTarget() {
		return (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable getNewTarget() {
		return (de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable) newEnd;
	}

	/**
	 * @generated
	 */
	protected int getReorientDirection() {
		return reorientDirection;
	}
}
