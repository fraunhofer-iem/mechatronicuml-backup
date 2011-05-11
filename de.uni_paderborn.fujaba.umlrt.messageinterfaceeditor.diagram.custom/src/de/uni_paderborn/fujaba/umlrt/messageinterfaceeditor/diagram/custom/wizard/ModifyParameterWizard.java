/*
 * Created on 08.07.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.custom.wizard;

import org.eclipse.jface.dialogs.IDialogSettings;

import de.uni_paderborn.fujaba.umlrt.common.wizard.AbstractWizard;
import de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.MessageInterfaceDiagram;
import de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceDiagramEditorPlugin;
import de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageType;

public class ModifyParameterWizard extends AbstractWizard {
	
	private final String ADD_EPARAMETER_WIZARD_SECTION = "AddEParameterWizard";

	private MessageInterfaceDiagram messageInterfaceDiagram = null;

	private ModifyParameterPage addEParameterPage;
	
	private MessageType selectedMessageType = null;

	public ModifyParameterWizard(org.eclipse.gmf.runtime.notation.impl.DiagramImpl diag, MessageType mT)
	{
		super();

		this.messageInterfaceDiagram = (MessageInterfaceDiagram)diag.getElement();
		this.setSelectedSyncChannel(mT);

		IDialogSettings workbenchSettings = MessageinterfaceDiagramEditorPlugin.getInstance().getDialogSettings();
		IDialogSettings section = workbenchSettings.getSection(this.ADD_EPARAMETER_WIZARD_SECTION);
		if (section == null)
		{
			section = workbenchSettings.addNewSection(this.ADD_EPARAMETER_WIZARD_SECTION);
		}
		setDialogSettings(section);
		
	}

	@Override
	public void addPages() {

		addEParameterPage = new ModifyParameterPage("Create/Delete parameters for selected message type");
		addPage(addEParameterPage);
		
	}


	public MessageInterfaceDiagram getMessageTypeDiagram() {
		return messageInterfaceDiagram;
	}

	@Override
	public boolean performFinish() {
		
		return super.performFinish();
	}

	public void setSelectedSyncChannel(MessageType selectedMT) {
		this.selectedMessageType = selectedMT;
	}

	public MessageType getSelectedSyncChannel() {
		return selectedMessageType;
	}
}
