package org.muml.pim.componentinstanceconfiguration.diagram.custom.edit.helpers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance;
import org.muml.pim.instance.DiscreteMultiPortInstance;
import org.muml.pim.instance.DiscreteSinglePortInstance;

/**
 * An EditHelperAdvice for the DiscreteMultiPortInstance.
 * 
 * @author bingo
 * 
 */
public class DiscreteMultiPortInstanceEditHelperAdvice extends
		AbstractEditHelperAdvice {

	@Override
	protected ICommand getAfterDestroyElementCommand(
			DestroyElementRequest request) {
		if (request.getElementToDestroy() instanceof DiscreteMultiPortInstance) {
			final DiscreteMultiPortInstance multiPortInstance = (DiscreteMultiPortInstance) request
					.getElementToDestroy();
			return new DestroyElementCommand(request) {
				@Override
				protected CommandResult doExecuteWithResult(
						IProgressMonitor monitor, IAdaptable info)
						throws ExecutionException {
					for (DiscreteSingleInteractionEndpointInstance dspi : multiPortInstance.getSubInteractionEndpointInstances()) {
						if (dspi instanceof DiscreteSinglePortInstance) {
							((DiscreteSinglePortInstance)dspi).setComponentInstance(null);
						}
					}
					return CommandResult.newOKCommandResult();
				}
			};
		}
		return super.getAfterDestroyElementCommand(request);
	}

}
