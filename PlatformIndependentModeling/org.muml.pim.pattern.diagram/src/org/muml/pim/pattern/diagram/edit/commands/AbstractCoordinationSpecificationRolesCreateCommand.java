package org.muml.pim.pattern.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class AbstractCoordinationSpecificationRolesCreateCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final EObject source;

	/**
	* @generated
	*/
	private final EObject target;

	/**
	* @generated
	*/
	public AbstractCoordinationSpecificationRolesCreateCommand(CreateRelationshipRequest request, EObject source,
			EObject target) {
		super(request.getLabel(), null, request);
		this.source = source;
		this.target = target;
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null
				&& false == source instanceof org.muml.pim.protocol.AbstractCoordinationSpecification) {
			return false;
		}
		if (target != null && false == target instanceof org.muml.pim.protocol.Role) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		View sourceView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!org.muml.pim.pattern.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints().canCreateAbstractCoordinationSpecificationRoles_4002(getSource(), getTarget(),
						sourceView, targetView)) {
			String errorMessage = org.muml.pim.pattern.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
					.getLinkConstraints().getErrorAbstractCoordinationSpecificationRoles_4002(getSource(), getTarget(),
							sourceView, targetView);
			org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy
					.showMessage(targetView != null ? targetView : sourceView, errorMessage);
			return false;
		}
		return true;
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in create link command"); //$NON-NLS-1$
		}

		if (getSource() != null && getTarget() != null) {
			getSource().getRoles().add(getTarget());
		}
		return CommandResult.newOKCommandResult();

	}

	/**
	* @generated
	*/
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	/**
	* @generated
	*/
	protected org.muml.pim.protocol.AbstractCoordinationSpecification getSource() {
		return (org.muml.pim.protocol.AbstractCoordinationSpecification) source;
	}

	/**
	* @generated
	*/
	protected org.muml.pim.protocol.Role getTarget() {
		return (org.muml.pim.protocol.Role) target;
	}
}
