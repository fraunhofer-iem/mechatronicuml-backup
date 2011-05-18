package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.actions;

import org.eclipse.jface.action.IAction;

public class ModifyTransitionActionWizardAction extends CommonModifyOnTransitionWizardAction
{

	@Override
	public void run(IAction action) {
		super.run(action);		
	  		
		System.out.println("Doesn't work!");
	}
}
