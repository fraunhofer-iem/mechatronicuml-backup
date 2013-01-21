package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.commands.DiscreteSinglePortInstance2CreateCommand;

// TODO: Replace by edit helper
public class CustomDiscreteSinglePortInstance2CreateCommand extends
		DiscreteSinglePortInstance2CreateCommand {

	public CustomDiscreteSinglePortInstance2CreateCommand(
			CreateElementRequest req) {
		super(req);
	}

	protected void doConfigure(
			de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance newElement,
			IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
		de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance owner = (de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance) getElementToEdit();
		newElement.setMultiInteractionEndpointInstance(owner);
		super.doConfigure(newElement, monitor, info);
	}

}
