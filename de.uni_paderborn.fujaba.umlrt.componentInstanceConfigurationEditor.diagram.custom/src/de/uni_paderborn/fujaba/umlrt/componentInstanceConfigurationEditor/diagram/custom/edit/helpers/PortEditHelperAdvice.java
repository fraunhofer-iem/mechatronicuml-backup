package de.uni_paderborn.fujaba.umlrt.componentInstanceConfigurationEditor.diagram.custom.edit.helpers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;

public class PortEditHelperAdvice extends AbstractEditHelperAdvice {

	protected ICommand getBeforeDestroyElementCommand(
			final DestroyElementRequest request) {
		return new DestroyElementCommand(request) {

			@Override
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				
				// prevent deletion of derived port.

				return CommandResult.newErrorCommandResult("Cannot delete the derived port");
			}

		};
	}
}
