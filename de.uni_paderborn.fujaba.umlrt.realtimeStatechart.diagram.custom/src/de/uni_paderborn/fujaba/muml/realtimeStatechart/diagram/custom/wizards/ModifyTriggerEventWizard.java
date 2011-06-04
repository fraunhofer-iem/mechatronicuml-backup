package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.wizards;

import org.eclipse.jface.dialogs.IDialogSettings;

import de.uni_paderborn.fujaba.muml.model.msgiface.MessageType;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin;

public class ModifyTriggerEventWizard extends CommonModifyWizard {
	
	private final String MODIFY_TRIGGER_EVENT_WIZARD = "ModifyTriggerEventWizard";

	private ModifyTriggerEventPage1 triggerEventPage1;
	private ModifyTriggerEventPage2 triggerEventPage2;
	
	private Transition selectedTransition = null;
	private MessageType selectedMessageType = null;

	public ModifyTriggerEventWizard(org.eclipse.gmf.runtime.notation.impl.DiagramImpl diag, Transition transition)
	{
		super(diag);
		
		this.setSelectedTransition(transition);

		IDialogSettings workbenchSettings = RealtimestatechartDiagramEditorPlugin.getInstance().getDialogSettings();
		IDialogSettings section = workbenchSettings.getSection(this.MODIFY_TRIGGER_EVENT_WIZARD);
		if (section == null)
		{
			section = workbenchSettings.addNewSection(this.MODIFY_TRIGGER_EVENT_WIZARD);
		}
		setDialogSettings(section);
		
	}

	@Override
	public void addPages() {

		triggerEventPage1 = new ModifyTriggerEventPage1("Create/Delete a trigger events for selected transition");
		addPage(triggerEventPage1);
		
		triggerEventPage2 = new ModifyTriggerEventPage2("Create/Delete a trigger events for selected transition");
		addPage(triggerEventPage2);
		
	}

	public void setSelectedTransition(Transition selectedTransition) {
		this.selectedTransition = selectedTransition;
	}

	public Transition getSelectedTransition() {
		return selectedTransition;
	}

	public void setSelectedMessageType(
			MessageType selectedMessageType) {
		this.selectedMessageType = selectedMessageType;
	}

	public MessageType getSelectedMessageType() {
		return selectedMessageType;
	}
}
