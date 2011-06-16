package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.commands;

import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.commands.AssemblyInstanceReorientCommand;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;

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

		// Find out the new source and target
		PortInstance source = getOldSource();
		PortInstance target = getOldTarget();
		switch (reorientDirection) {
		case ReorientRelationshipRequest.REORIENT_SOURCE:
			source = getNewSource();
			break;
		case ReorientRelationshipRequest.REORIENT_TARGET:
			target = getNewTarget();
			break;
		}
		
		// We add checks that are only performed, when both source and target
		// are set.
		if (source != null && target != null) {
			// Make sure, the source's and the target's ComponentInstance are
			// the same.
			ComponentInstance sourceComponentInstance = source
					.getComponentInstance();

			ComponentInstance targetComponentInstance = target
					.getComponentInstance();

			if (sourceComponentInstance != targetComponentInstance) {
				return false;
			}
		}
		return super.canExecute();
	}
	
	

}
