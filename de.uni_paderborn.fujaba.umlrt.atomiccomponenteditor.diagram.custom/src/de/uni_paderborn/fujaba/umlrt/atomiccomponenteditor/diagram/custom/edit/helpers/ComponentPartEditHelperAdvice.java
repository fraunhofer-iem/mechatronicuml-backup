package de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.custom.edit.helpers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;

/**
 * An EditHelperAdvice for the ComponentPart.
 * 
 * @author bingo
 * 
 */
public class ComponentPartEditHelperAdvice extends AbstractEditHelperAdvice {

	/**
	 * Make sure, the component type is undefined, before destroying a
	 * ComponentPart. This is necessary to prevent deletion of all Ports that
	 * were derived.
	 */
	protected ICommand getBeforeDestroyElementCommand(
			final DestroyElementRequest request) {
		return new DestroyElementCommand(request) {

			@Override
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				ComponentPart componentPart = (ComponentPart) request
						.getElementToDestroy();

				// prevent complete deletion of derived ports.
				componentPart.setComponentType(null);

				return CommandResult.newOKCommandResult(componentPart);
			}

		};
	}

	// TODO: getBeforeSetCommand() is not called!
	// /**
	// * Delete Delegations and Assemblies, before componentType changes.
	// */
	// protected ICommand getBeforeSetCommand(final SetRequest request) {
	// return new SetValueCommand(request) {
	//
	// @Override
	// protected CommandResult doExecuteWithResult(
	// IProgressMonitor monitor, IAdaptable info)
	// throws ExecutionException {
	// ComponentPart componentPart = (ComponentPart) request.getElementToEdit();
	//
	// return CommandResult.newOKCommandResult(componentPart);
	// }
	//
	// };
	// }

}
