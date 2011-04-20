package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.actions;

import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.jface.action.IAction;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.commands.AbsoluteDeadlineCreateCommand;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes;

public class AbsoluteDeadlineCreateAction extends CommonCreateAction {

	@Override
	public void run(IAction action) {
		
		  CreateElementRequest request = new CreateElementRequest(selectedTransition,
				  RealtimeStatechartElementTypes.AbsoluteDeadline_3010);
		  
		  AbsoluteDeadlineCreateCommand command = new AbsoluteDeadlineCreateCommand(request);

		  new ICommandProxy(command).execute();
		
	}
}
