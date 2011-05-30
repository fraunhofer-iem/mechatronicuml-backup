/*
 * Created on 08.07.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.wizards;

import org.eclipse.jface.dialogs.IDialogSettings;

import de.uni_paderborn.fujaba.muml.model.msgiface.MessageType;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin;

public class ModifyRaisedEventWizard extends CommonModifyWizard {
	
	private final String MODIFY_RAISED_EVENT_WIZARD = "ModifyRaisedEventWizard";

	private ModifyRaisedEventPage1 raisedEventPage1;
	private ModifyRaisedEventPage2 raisedEventPage2;
	
	private Transition selectedTransition = null;
	private MessageType selectedMessageType = null;

	public ModifyRaisedEventWizard(org.eclipse.gmf.runtime.notation.impl.DiagramImpl diag, Transition transition)
	{
		super(diag);
		
		this.setSelectedTransition(transition);

		IDialogSettings workbenchSettings = RealtimestatechartDiagramEditorPlugin.getInstance().getDialogSettings();
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
