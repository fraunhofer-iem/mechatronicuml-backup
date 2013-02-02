package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class TransitionReorientCommand extends EditElementCommand {

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
	public TransitionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.Transition) {
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
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex && newEnd instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex target = getLink()
				.getTarget();
		if (!(getLink().eContainer() instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart container = (de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart) getLink()
				.eContainer();
		View sourceView = de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistTransition_4003(container,
						getLink(), getNewSource(), target, sourceView,
						targetView)) {
			String errorMessage = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
					.getLinkConstraints().getErrorTransition_4003(container,
							getNewSource(), target, sourceView, targetView);
			de.uni_paderborn.fujaba.muml.common.edit.policies.ErrorFeedbackEditPolicy
					.showMessage(sourceView, errorMessage);
			return false;
		}
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex && newEnd instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex source = getLink()
				.getSource();
		if (!(getLink().eContainer() instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart)) {
			return false;
		}
		de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart container = (de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart) getLink()
				.eContainer();
		View sourceView = de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistTransition_4003(container,
						getLink(), source, getNewTarget(), sourceView,
						targetView)) {
			String errorMessage = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
					.getLinkConstraints().getErrorTransition_4003(container,
							source, getNewTarget(), sourceView, targetView);
			de.uni_paderborn.fujaba.muml.common.edit.policies.ErrorFeedbackEditPolicy
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
	protected de.uni_paderborn.fujaba.muml.realtimestatechart.Transition getLink() {
		return (de.uni_paderborn.fujaba.muml.realtimestatechart.Transition) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex getOldSource() {
		return (de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex getNewSource() {
		return (de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex) newEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex getOldTarget() {
		return (de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex getNewTarget() {
		return (de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex) newEnd;
	}

	private EditPart host;

	/**
	 * @generated
	 */
	protected int getReorientDirection() {
		return reorientDirection;
	}
}
