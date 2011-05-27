package de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.custom.edit.commands;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.commands.AssemblyInstanceCreateCommand;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;

/**
 * A customized AssemblyInstanceCreateCommand. We make sure, an assembly
 * instance may be created between both ports.
 * 
 * @author bingo
 * 
 */
public class CustomAssemblyInstanceCreateCommand extends
		AssemblyInstanceCreateCommand {
	/**
	 * Constructs this CustomAssemblyInstanceCreateCommand.
	 * 
	 * @param request
	 *            The CreateRelationshipRequest.
	 * @param source
	 *            The source port instance element.
	 * @param target
	 *            The target port instance element.
	 */
	public CustomAssemblyInstanceCreateCommand(
			CreateRelationshipRequest request, PortInstance source,
			PortInstance target) {
		super(request, source, target);
	}

	/**
	 * Checks if this Assembly instance is allowed to be created.
	 */
	@Override
	public boolean canExecute() {

		// We add checks that are only performed, when both source and target
		// are set.
		if (getSource() != null && getTarget() != null) {
			// Make sure, the source's and the target's ComponentInstance are the same.
			ComponentInstance sourceComponentInstance = getSource()
					.getComponentInstance();

			ComponentInstance targetComponentInstance = getTarget()
					.getComponentInstance();

			if (sourceComponentInstance != targetComponentInstance) {
				return false;
			}
		}
		return super.canExecute();

	}
}
