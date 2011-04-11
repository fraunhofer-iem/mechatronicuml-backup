package de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.custom.edit.commands;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.commands.DelegationInstanceCreateCommand;
import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance;

/**
 * A customized DelegationInstanceCreateCommand. We make sure, an Delegation
 * instance may be created between both ports.
 * 
 * @author bingo
 * 
 */
public class CustomDelegationInstanceCreateCommand extends
		DelegationInstanceCreateCommand {
	/**
	 * Constructs this CustomDelegationInstanceCreateCommand.
	 * 
	 * @param request
	 *            The CreateRelationshipRequest.
	 * @param source
	 *            The source port instance element.
	 * @param target
	 *            The target port instance element.
	 */
	public CustomDelegationInstanceCreateCommand(
			CreateRelationshipRequest request, PortInstance source,
			PortInstance target) {
		super(request, source, target);
	}

	/**
	 * Checks if this Delegation instance is allowed to be created.
	 */
	@Override
	public boolean canExecute() {
		// We add checks that are only performed, when both source and target
		// are set.
		if (getSource() != null && getTarget() != null) {
			// Make sure, both the source's ComponentInstance contains the
			// target's ComponentInstance.
			ComponentInstance sourceComponentInstance = getSource()
					.getComponentInstance();

			ComponentInstance targetComponentInstance = getTarget()
					.getComponentInstance();

			if (!sourceComponentInstance.getPartInstances().contains(
					targetComponentInstance)) {
				return false;
			}
		}
		return super.canExecute();
	}
}
