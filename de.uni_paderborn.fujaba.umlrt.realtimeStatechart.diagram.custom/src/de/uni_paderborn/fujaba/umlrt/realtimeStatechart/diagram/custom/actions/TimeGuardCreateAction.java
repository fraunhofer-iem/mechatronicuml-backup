package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.actions;

import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.jface.action.IAction;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.commands.ClockConstraint2CreateCommand;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes;

public class TimeGuardCreateAction extends CommonCreateAction {

	@Override
	public void run(IAction action) {
		
		  CreateElementRequest request = new CreateElementRequest(selectedTransition,
				  RealtimeStatechartElementTypes.ClockConstraint_3018);
		  
		  ClockConstraint2CreateCommand command = new ClockConstraint2CreateCommand(request);

		  new ICommandProxy(command).execute();
		
	}
}
