package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.actions;

import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.jface.action.IAction;

import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.commands.RealtimeEventCreateCommand;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes;

public class TriggerEventCreateAction extends CommonCreateAction {


	@Override
	public void run(IAction action) {
		
		  CreateElementRequest request = new CreateElementRequest(selectedTransition,
				  RealtimeStatechartElementTypes.RealtimeEvent_3013);
		  
		  RealtimeEventCreateCommand command = new RealtimeEventCreateCommand(request);

		  new ICommandProxy(command).execute();
		
	}
}
