package org.muml.pim.componentinstanceconfiguration.diagram.custom.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.commands.DiscreteSinglePortInstance2CreateCommand;

// TODO: Replace by edit helper
public class CustomDiscreteSinglePortInstance2CreateCommand extends
		DiscreteSinglePortInstance2CreateCommand {

	public CustomDiscreteSinglePortInstance2CreateCommand(
			CreateElementRequest req) {
		super(req);
	}

	protected void doConfigure(
			org.muml.pim.instance.DiscreteSinglePortInstance newElement,
			IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
		org.muml.pim.instance.DiscreteMultiPortInstance owner = (org.muml.pim.instance.DiscreteMultiPortInstance) getElementToEdit();
		newElement.setMultiInteractionEndpointInstance(owner);
		super.doConfigure(newElement, monitor, info);
	}

}
