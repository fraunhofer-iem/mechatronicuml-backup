package patterneditor.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import patterneditor.diagram.edit.policies.PatternBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ConstrainableElementConstraint2ReorientCommand extends
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
	public ConstrainableElementConstraint2ReorientCommand(
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
		if (false == referenceOwner instanceof de.uni_paderborn.fujaba.umlrt.model.core.ConstrainableElement) {
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
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint && newEnd instanceof de.uni_paderborn.fujaba.umlrt.model.core.ConstrainableElement)) {
			return false;
		}
		return PatternBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistConstrainableElementConstraint_4004(getNewSource(),
						getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint && newEnd instanceof de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint)) {
			return false;
		}
		return PatternBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistConstrainableElementConstraint_4004(getOldSource(),
						getNewTarget());
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
		getOldSource().getConstraint().remove(getOldTarget());
		getNewSource().getConstraint().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getConstraint().remove(getOldTarget());
		getOldSource().getConstraint().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.umlrt.model.core.ConstrainableElement getOldSource() {
		return (de.uni_paderborn.fujaba.umlrt.model.core.ConstrainableElement) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.umlrt.model.core.ConstrainableElement getNewSource() {
		return (de.uni_paderborn.fujaba.umlrt.model.core.ConstrainableElement) newEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint getOldTarget() {
		return (de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint getNewTarget() {
		return (de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint) newEnd;
	}
}
