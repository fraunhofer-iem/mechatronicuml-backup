package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.wizard.WizardDialog;

import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.wizards.ModifyRaisedEventWizard;

public class ModifyRaisedEventWizardAction extends CommonModifyOnTransitionWizardAction
{

	@Override
	public void run(IAction action) {
		super.run(action);		
	  
		org.eclipse.gmf.runtime.notation.impl.DiagramImpl diag = (org.eclipse.gmf.runtime.notation.impl.DiagramImpl) getEditor().getDiagram();
      
      ModifyRaisedEventWizard wizard = new ModifyRaisedEventWizard(diag,selectedTransition);
      wizard.init(workbench, null);
      WizardDialog dialog = new WizardDialog(shell, wizard);
      dialog.create();
      dialog.open();
	}
}
