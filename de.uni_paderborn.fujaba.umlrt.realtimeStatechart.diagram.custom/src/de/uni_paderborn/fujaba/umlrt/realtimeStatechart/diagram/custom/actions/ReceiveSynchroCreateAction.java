package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.actions;

import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.jface.action.IAction;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.commands.Synchronization2CreateCommand;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes;

public class ReceiveSynchroCreateAction extends CommonCreateAction{

	@Override
	public void run(IAction action) {
		
		/**
		 * here should be a wizard asking for the synchronization channel for the synchronization
		 */
		
		  CreateElementRequest request = new CreateElementRequest(selectedTransition,
				  RealtimeStatechartElementTypes.Synchronization_3017);
		  
		  Synchronization2CreateCommand command = new Synchronization2CreateCommand(request);

		  new ICommandProxy(command).execute();
		
	}
}
