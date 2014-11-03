package pattern.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;

import pattern.diagram.edit.policies.Pattern2BaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class RoleCoordinationProtocolCreateCommand extends EditElementCommand {

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
	public RoleCoordinationProtocolCreateCommand(
			CreateRelationshipRequest request, EObject source, EObject target) {
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
				&& false == source instanceof de.uni_paderborn.fujaba.muml.protocol.Role) {
			return false;
		}
		if (target != null
				&& false == target instanceof de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		View sourceView = de.uni_paderborn.fujaba.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = de.uni_paderborn.fujaba.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!Pattern2BaseItemSemanticEditPolicy.getLinkConstraints()
				.canCreateRoleCoordinationProtocol_4001(getSource(),
						getTarget(), sourceView, targetView)) {
			String errorMessage = Pattern2BaseItemSemanticEditPolicy
					.getLinkConstraints()
					.getErrorRoleCoordinationProtocol_4001(getSource(),
							getTarget(), sourceView, targetView);
			de.uni_paderborn.fujaba.common.edit.policies.ErrorFeedbackEditPolicy
					.showMessage(targetView != null ? targetView : sourceView,
							errorMessage);
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
					"Invalid arguments in create link command"); //$NON-NLS-1$
		}

		if (getSource() != null && getTarget() != null) {
			getSource().setCoordinationProtocol(getTarget());
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
	protected de.uni_paderborn.fujaba.muml.protocol.Role getSource() {
		return (de.uni_paderborn.fujaba.muml.protocol.Role) source;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification getTarget() {
		return (de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification) target;
	}
}
