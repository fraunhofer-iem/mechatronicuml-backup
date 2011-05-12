/*
 * Created on 08.07.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.wizards;

import org.eclipse.jface.dialogs.IDialogSettings;

import de.uni_paderborn.fujaba.umlrt.common.wizard.AbstractWizard;
import de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageType;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FujabaRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin;

public class ModifyTriggerEventWizard extends AbstractWizard {
	
	private final String MODIFY_SYNCHRONIZATION_WIZARD_SECTION = "ModifySynchronizationWizard";

	private FujabaRealtimeStatechart realtimeStatechart = null;

	private ModifyTriggerEventPage1 triggerEventPage1;
	private ModifyTriggerEventPage2 triggerEventPage2;
	
	private Transition selectedTransition = null;
	private MessageType selectedMessageType = null;

	public ModifyTriggerEventWizard(org.eclipse.gmf.runtime.notation.impl.DiagramImpl diag, Transition transition)
	{
		super();
		
		this.realtimeStatechart = (FujabaRealtimeStatechart)diag.getElement();
		this.setSelectedTransition(transition);

		IDialogSettings workbenchSettings = RealtimeStatechartDiagramEditorPlugin.getInstance().getDialogSettings();
		IDialogSettings section = workbenchSettings.getSection(this.MODIFY_SYNCHRONIZATION_WIZARD_SECTION);
		if (section == null)
		{
			section = workbenchSettings.addNewSection(this.MODIFY_SYNCHRONIZATION_WIZARD_SECTION);
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


	public FujabaRealtimeStatechart getRealtimeStatechart() {
		return realtimeStatechart;
	}

	@Override
	public boolean performFinish() {
		
		return super.performFinish();
	}

	public void setSelectedTransition(Transition selectedTransition) {
		this.selectedTransition = selectedTransition;
	}

	public Transition getSelectedTransition() {
		return selectedTransition;
	}

	public void setSelectedMessageType(
			MessageType selectedMessageInterface) {
		this.selectedMessageType = selectedMessageInterface;
	}

	public MessageType getSelectedMessageType() {
		return selectedMessageType;
	}
}
