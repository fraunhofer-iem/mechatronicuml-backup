package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.helpers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance;

/**
 * An EditHelperAdvice for the DiscreteSinglePortInstance.
 * 
 * @author bingo
 * 
 */
public class DiscreteSinglePortInstanceEditHelperAdvice extends
		AbstractEditHelperAdvice {

	@Override
	protected ICommand getAfterConfigureCommand(ConfigureRequest request) {
		if (request.getElementToConfigure() instanceof DiscreteSinglePortInstance) {
	
			final DiscreteSinglePortInstance singlePortInstance = (DiscreteSinglePortInstance) request
					.getElementToConfigure();
	
			DiscreteMultiPortInstance multiPortInstance = singlePortInstance
					.getMultiPortInstance();
	
			if (multiPortInstance != null) {
				final ComponentInstance componentInstance = multiPortInstance
						.getComponentInstance();
				return new ConfigureElementCommand(request) {
					@Override
					protected CommandResult doExecuteWithResult(
							IProgressMonitor monitor, IAdaptable info)
							throws ExecutionException {
						componentInstance.getPortInstances()
								.add(singlePortInstance);
						return CommandResult.newOKCommandResult();
					}
				};
			}
		}
		return super.getAfterConfigureCommand(request);
	}

	@Override
	protected ICommand getAfterDestroyElementCommand(
			DestroyElementRequest request) {
		if (request.getElementToDestroy() instanceof DiscreteSinglePortInstance) {

			final DiscreteSinglePortInstance singlePortInstance = (DiscreteSinglePortInstance) request
					.getElementToDestroy();

			DiscreteMultiPortInstance multiPortInstance = singlePortInstance
					.getMultiPortInstance();

			if (multiPortInstance != null) {
				final ComponentInstance componentInstance = multiPortInstance
						.getComponentInstance();
				return new DestroyElementCommand(request) {
					@Override
					protected CommandResult doExecuteWithResult(
							IProgressMonitor monitor, IAdaptable info)
							throws ExecutionException {
						componentInstance.getPortInstances().remove(
								singlePortInstance);
						return CommandResult.newOKCommandResult();
					}
				};
			}
		}
		return super.getAfterDestroyElementCommand(request);
	}

}
