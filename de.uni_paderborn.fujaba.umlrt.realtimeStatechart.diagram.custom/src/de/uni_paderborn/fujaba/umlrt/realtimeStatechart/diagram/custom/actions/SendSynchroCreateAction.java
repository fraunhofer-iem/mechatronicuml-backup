package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.actions;

import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.jface.action.IAction;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.commands.SynchronizationCreateCommand;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes;

public class SendSynchroCreateAction extends CommonCreateAction {

	@Override
	public void run(IAction action) {
		
		/**
		 * here should be a wizard asking for the synchronization channel for the synchronization
		 */
		
		  CreateElementRequest request = new CreateElementRequest(selectedTransition,
				  RealtimeStatechartElementTypes.Synchronization_3016);
		  
		  SynchronizationCreateCommand command = new SynchronizationCreateCommand(request);

		  new ICommandProxy(command).execute();
		
	}
}
