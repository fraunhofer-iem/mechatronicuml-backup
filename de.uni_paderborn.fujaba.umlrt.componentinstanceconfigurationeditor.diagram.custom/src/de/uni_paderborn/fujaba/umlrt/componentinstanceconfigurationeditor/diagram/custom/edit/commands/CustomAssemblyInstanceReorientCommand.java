package de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.custom.edit.commands;

import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.commands.AssemblyInstanceReorientCommand;
import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;

/**
 * A customized AssemblyInstanceReorientCommand. We make sure, an assembly
 * instance may be reoriented this way.
 * 
 * @author bingo
 * 
 */
public class CustomAssemblyInstanceReorientCommand extends
		AssemblyInstanceReorientCommand {

	/**
	 * Constructs this CustomAssemblyInstanceReorientCommand.
	 * 
	 * @param request
	 *            The CreateRelationshipRequest.
	 * @param source
	 *            The source port instance element.
	 * @param target
	 *            The target port instance element.
	 */
	public CustomAssemblyInstanceReorientCommand(
			ReorientRelationshipRequest request) {
		super(request);
	}

	/**
	 * Checks if this Assembly instance is allowed to be reoriented.
	 */
	@Override
	public boolean canExecute() {

		// We add checks that are only performed, when both source and target
		// are set.
		if (getNewSource() != null && getNewTarget() != null) {
			// Make sure, the source's and the target's ComponentInstance are
			// the same.
			ComponentInstance sourceComponentInstance = getNewSource()
					.getComponentInstance();

			ComponentInstance targetComponentInstance = getNewTarget()
					.getComponentInstance();

			if (sourceComponentInstance != targetComponentInstance) {
				return false;
			}
		}
		return super.canExecute();
	}

}
