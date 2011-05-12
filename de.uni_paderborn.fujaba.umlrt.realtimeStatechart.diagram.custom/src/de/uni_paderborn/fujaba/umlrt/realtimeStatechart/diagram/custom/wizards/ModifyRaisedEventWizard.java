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

public class ModifyRaisedEventWizard extends AbstractWizard {
	
	private final String MODIFY_RAISED_EVENT_WIZARD = "ModifyRaisedEventWizard";

	private FujabaRealtimeStatechart realtimeStatechart = null;

	private ModifyRaisedEventPage1 raisedEventPage1;
	private ModifyRaisedEventPage2 raisedEventPage2;
	
	private Transition selectedTransition = null;
	private MessageType selectedMessageType = null;

	public ModifyRaisedEventWizard(org.eclipse.gmf.runtime.notation.impl.DiagramImpl diag, Transition transition)
	{
		super();
		
		this.realtimeStatechart = (FujabaRealtimeStatechart)diag.getElement();
		this.setSelectedTransition(transition);

		IDialogSettings workbenchSettings = RealtimeStatechartDiagramEditorPlugin.getInstance().getDialogSettings();
		IDialogSettings section = workbenchSettings.getSection(this.MODIFY_RAISED_EVENT_WIZARD);
		if (section == null)
		{
			section = workbenchSettings.addNewSection(this.MODIFY_RAISED_EVENT_WIZARD);
		}
		setDialogSettings(section);
		
	}

	@Override
	public void addPages() {

		raisedEventPage1 = new ModifyRaisedEventPage1("Create/Delete a raised events for selected transition");
		addPage(raisedEventPage1);
		
		raisedEventPage2 = new ModifyRaisedEventPage2("Create/Delete a raised events for selected transition");
		addPage(raisedEventPage2);
		
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
			MessageType selectedMessageType) {
		this.selectedMessageType = selectedMessageType;
	}

	public MessageType getSelectedMessageType() {
		return selectedMessageType;
	}
}
