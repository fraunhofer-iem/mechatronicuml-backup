package de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.commands.DiscreteSinglePortInstance2CreateCommand;

// TODO: Replace by edit helper
public class CustomDiscreteSinglePortInstance2CreateCommand extends
		DiscreteSinglePortInstance2CreateCommand {

	public CustomDiscreteSinglePortInstance2CreateCommand(
			CreateElementRequest req) {
		super(req);
	}

	protected void doConfigure(
			de.uni_paderborn.fujaba.muml.instance.DiscreteSinglePortInstance newElement,
			IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
		de.uni_paderborn.fujaba.muml.instance.DiscreteMultiPortInstance owner = (de.uni_paderborn.fujaba.muml.instance.DiscreteMultiPortInstance) getElementToEdit();
		newElement.setMultiInteractionEndpointInstance(owner);
		super.doConfigure(newElement, monitor, info);
	}

}
