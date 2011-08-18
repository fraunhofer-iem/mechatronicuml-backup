package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.commands;

import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.commands.DelegationInstanceReorientCommand;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;

/**
 * A customized DelegationInstanceReorientCommand. We make sure, an Delegation
 * instance may be reoriented this way.
 * 
 * @author bingo
 * 
 */
public class CustomDelegationInstanceReorientCommand extends
		DelegationInstanceReorientCommand {

	/**
	 * Constructs this CustomDelegationInstanceReorientCommand.
	 * 
	 * @param request
	 *            The CreateRelationshipRequest.
	 * @param source
	 *            The source port instance element.
	 * @param target
	 *            The target port instance element.
	 */
	public CustomDelegationInstanceReorientCommand(
			ReorientRelationshipRequest request) {
		super(request);
	}
	
	/**
	 * Checks if this Delegation instance is allowed to be reoriented.
	 */
	@Override
	public boolean canExecute() {
		// We add checks that are only performed, when both source and target
		// are set.
		if (getNewSource() != null && getNewTarget() != null) {
			// Make sure, both the source's ComponentInstance contains the
			// target's ComponentInstance.
			ComponentInstance sourceComponentInstance = getNewSource()
					.getComponentInstance();

			ComponentInstance targetComponentInstance = getNewTarget()
					.getComponentInstance();

			if (!sourceComponentInstance.getEmbeddedCIC().getComponentInstances().contains(
					targetComponentInstance)) {
				return false;
			}
		}
		return super.canExecute();
	}

}
