package de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

/**
 * @generated
 */
public class MessageInterfaceSuperTypeCreateCommand extends EditElementCommand {

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
	public MessageInterfaceSuperTypeCreateCommand(
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
				&& false == source instanceof de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface) {
			return false;
		}
		if (target != null
				&& false == target instanceof de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		return de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.policies.UmlrtBaseItemSemanticEditPolicy
				.getLinkConstraints().canCreateMessageInterfaceSuperType_4003(
						getSource(), getTarget());
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
			getSource().getSuperType().add(getTarget());
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
	protected de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface getSource() {
		return (de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface) source;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface getTarget() {
		return (de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface) target;
	}
}
