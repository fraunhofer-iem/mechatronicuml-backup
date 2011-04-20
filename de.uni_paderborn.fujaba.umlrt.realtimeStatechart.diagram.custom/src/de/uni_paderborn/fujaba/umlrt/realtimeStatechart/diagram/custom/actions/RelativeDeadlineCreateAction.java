package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.actions;

import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.jface.action.IAction;

import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.commands.RelativeDeadlineCreateCommand;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes;

public class RelativeDeadlineCreateAction extends CommonCreateAction {

	@Override
	public void run(IAction action) {
		
		/**
		 * here should be a check, is there already an relative deadline existing within the transition
		 */
		  CreateElementRequest request = new CreateElementRequest(selectedTransition,
				  RealtimeStatechartElementTypes.RelativeDeadline_3011);
		  
		  RelativeDeadlineCreateCommand command = new RelativeDeadlineCreateCommand(request);

		  new ICommandProxy(command).execute();
		
	}
}
