package org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy;
import org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy;
import org.muml.storydiagram.patterns.AbstractVariable;
import org.muml.storydiagram.patterns.LinkVariable;
import org.muml.storydiagram.patterns.ObjectVariable;
import org.muml.storydiagram.patterns.StoryPattern;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.policies.BasicSDDBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class LinkVariableReorientCommand extends EditElementCommand {

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
	public LinkVariableReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof LinkVariable) {
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
		if (!(oldEnd instanceof ObjectVariable && newEnd instanceof ObjectVariable)) {
			return false;
		}
		AbstractVariable target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof StoryPattern)) {
			return false;
		}
		StoryPattern container = (StoryPattern) getLink().eContainer();
		View sourceView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getSourceView(getRequest());
		View targetView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getTargetView(getRequest());
		if (!BasicSDDBaseItemSemanticEditPolicy.getLinkConstraints().canExistLinkVariable_4003(container, getLink(),
				getNewSource(), target, sourceView, targetView)) {
			String errorMessage = BasicSDDBaseItemSemanticEditPolicy.getLinkConstraints()
					.getErrorLinkVariable_4003(container, getNewSource(), target, sourceView, targetView);
			ErrorFeedbackEditPolicy.showMessage(sourceView, errorMessage);
			return false;
		}
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof AbstractVariable && newEnd instanceof AbstractVariable)) {
			return false;
		}
		ObjectVariable source = getLink().getSource();
		if (!(getLink().eContainer() instanceof StoryPattern)) {
			return false;
		}
		StoryPattern container = (StoryPattern) getLink().eContainer();
		View sourceView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getSourceView(getRequest());
		View targetView = ConnectionConfigureHelperGraphicalNodeEditPolicy.getTargetView(getRequest());
		if (!BasicSDDBaseItemSemanticEditPolicy.getLinkConstraints().canExistLinkVariable_4003(container, getLink(),
				source, getNewTarget(), sourceView, targetView)) {
			String errorMessage = BasicSDDBaseItemSemanticEditPolicy.getLinkConstraints()
					.getErrorLinkVariable_4003(container, source, getNewTarget(), sourceView, targetView);
			ErrorFeedbackEditPolicy.showMessage(sourceView, errorMessage);
			return false;
		}
		return true;
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
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
	protected LinkVariable getLink() {
		return (LinkVariable) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected ObjectVariable getOldSource() {
		return (ObjectVariable) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ObjectVariable getNewSource() {
		return (ObjectVariable) newEnd;
	}

	/**
	 * @generated
	 */
	protected AbstractVariable getOldTarget() {
		return (AbstractVariable) oldEnd;
	}

	/**
	 * @generated
	 */
	protected AbstractVariable getNewTarget() {
		return (AbstractVariable) newEnd;
	}

	/**
	 * @generated
	 */
	protected int getReorientDirection() {
		return reorientDirection;
	}
}
