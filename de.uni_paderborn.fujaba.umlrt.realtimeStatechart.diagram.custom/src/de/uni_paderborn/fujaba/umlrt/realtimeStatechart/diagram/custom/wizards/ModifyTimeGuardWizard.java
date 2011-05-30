package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.wizards;

import org.eclipse.jface.dialogs.IDialogSettings;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin;

public class ModifyTimeGuardWizard extends CommonModifyWizard {
	
	private final String MODIFY_EPARAMETER_WIZARD_SECTION = "ModifyTimeGuard";

	private ModifyTimeGuardPage addEParameterPage;
	
	private Transition selectedTransition = null;

	public ModifyTimeGuardWizard(org.eclipse.gmf.runtime.notation.impl.DiagramImpl diag, Transition transition)
	{
		super(diag);
		
		setSelectedTransition(transition);

		IDialogSettings workbenchSettings = RealtimestatechartDiagramEditorPlugin.getInstance().getDialogSettings();
		IDialogSettings section = workbenchSettings.getSection(this.MODIFY_EPARAMETER_WIZARD_SECTION);
		if (section == null)
		{
			section = workbenchSettings.addNewSection(this.MODIFY_EPARAMETER_WIZARD_SECTION);
		}
		setDialogSettings(section);
		
	}

	@Override
	public void addPages() {

		addEParameterPage = new ModifyTimeGuardPage("Create/Delete time guards for selected transition");
		addPage(addEParameterPage);
		
	}

	public void setSelectedTransition(Transition selectedTransition) {
		this.selectedTransition = selectedTransition;
	}

	public Transition getSelectedTransition() {
		return selectedTransition;
	}
}
