package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.actions;

import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.jface.action.IAction;

import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.commands.AsynchronousEvent2CreateCommand;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes;

public class TriggerEventCreateAction extends CommonCreateAction {


	@Override
	public void run(IAction action) {
		
		  CreateElementRequest request = new CreateElementRequest(selectedTransition,
				  RealtimeStatechartElementTypes.AsynchronousEvent_3019);
		  
		  AsynchronousEvent2CreateCommand command = new AsynchronousEvent2CreateCommand(request);

		  new ICommandProxy(command).execute();
		
	}
}
