package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.model.component.Delegation;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.component.StructuredComponent;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.commands.DelegationCreateCommand;

/**
 * A customized DelegationCreateCommand. We make sure, a delegation may be
 * created between both ports. The created element is then configured to get
 * references for the ComponentPart and the StructuredComponent.
 * 
 * @author bingo
 * 
 */
public class CustomDelegationCreateCommand extends DelegationCreateCommand {

	/**
	 * The ComponentPart.
	 */
	private ComponentPart componentPart;

	/**
	 * The parent Component.
	 */
	private StructuredComponent parentComponent;

	/**
	 * Constructs this CustomDelegationCreateCommand.
	 * 
	 * @param request
	 *            The CreateRelationshipRequest.
	 * @param source
	 *            The source port element.
	 * @param target
	 *            The target port element.
	 * @param componentPart
	 *            The ComponentPart for this Delegation.
	 * @param parentComponent
	 *            The parent Component for this Delegation.
	 */
	public CustomDelegationCreateCommand(CreateRelationshipRequest request,
			Port source, Port target, ComponentPart componentPart,
			StructuredComponent parentComponent) {
		super(request, source, target);
		this.componentPart = componentPart;
		this.parentComponent = parentComponent;
	}

	/**
	 * Checks if this Assembly is allowed to be created.
	 */
	@Override
	public boolean canExecute() {
		// We add checks that are only performed, when both source and target
		// are set.
		if (getSource() != null && getTarget() != null) {

			// Make sure, both parentComponent and componentPart are set.
			if (parentComponent == null || componentPart == null) {
				return false;
			}
		}

		return super.canExecute();
	}

	/**
	 * Configure the newly created Delegation to additionally have references to
	 * the ComponentPart and the parent component.
	 */
	@Override
	protected void doConfigure(Delegation newElement, IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		// Set both ComponentPart and ParentComponent.
		newElement.setComponentPart(componentPart);
		newElement.setParentComponent(parentComponent);

		// Call super implementation, which will set both Ports for the new
		// Delegation.
		super.doConfigure(newElement, monitor, info);
	}
	
	@Override
	protected de.uni_paderborn.fujaba.muml.model.component.StructuredComponent deduceContainer() {
		return parentComponent;
	}

}
