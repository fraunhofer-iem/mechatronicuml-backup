package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.commands;

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
public class ProcessorInstanceOwnedCacheInstanceCreateCommand extends EditElementCommand {

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
	public ProcessorInstanceOwnedCacheInstanceCreateCommand(CreateRelationshipRequest request, EObject source,
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
				&& false == source instanceof de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProcessorInstance) {
			return false;
		}
		if (target != null
				&& false == target instanceof de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.CacheInstance) {
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
		if (!de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canCreateProcessorInstanceOwnedCacheInstance_4003(getSource(), getTarget(), sourceView, targetView)) {
			String errorMessage = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy
					.getLinkConstraints()
					.getErrorProcessorInstanceOwnedCacheInstance_4003(getSource(), getTarget(), sourceView, targetView);
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
			getSource().setOwnedCacheInstance(getTarget());
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
	protected de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProcessorInstance getSource() {
		return (de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProcessorInstance) source;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.CacheInstance getTarget() {
		return (de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.CacheInstance) target;
	}
}
