package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart;
import de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.commands.DelegationReorientCommand;

public class CustomDelegationReorientCommand extends DelegationReorientCommand {

	/**
	 * The ComponentPart for this Delegation.
	 */
	private ComponentPart componentPart;

	/**
	 * The parent Component for this Delegation.
	 */
	private StructuredComponent parentComponent;

	/**
	 * Constructs this CustomDelegationReorientCommand.
	 * 
	 * @param request
	 *            The ReorientRelationshipRequest.
	 * @param componentPart
	 *            The ComponentPart for this Delegation.
	 * @param parentComponent
	 *            The parent Component for this Delegation.
	 */
	public CustomDelegationReorientCommand(ReorientRelationshipRequest request,
			ComponentPart componentPart, StructuredComponent parentComponent) {
		super(request);
		this.componentPart = componentPart;
		this.parentComponent = parentComponent;
	}

	/**
	 * Checks if this Delegation is allowed to be reoriented.
	 */
	@Override
	public boolean canExecute() {

		// Make sure both Ports are set.
		if (getNewSource() == null || getNewTarget() == null) {
			return false;
		}

		// Make sure, ComponentPart and parentComponent are set.
		if (componentPart == null || parentComponent == null) {
			return false;
		}

		return super.canExecute();
	}

	/**
	 * Update both ComponentPart and parent Component of the Delegation
	 * according to the ReorientRequest.
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		// Set ComponentPart and parent Component
		getLink().setComponentPart(componentPart);
		getLink().setParentComponent(parentComponent);

		// Call super implementation, which sets the new Port for the
		// Delegation.
		return super.doExecuteWithResult(monitor, info);
	}

}
