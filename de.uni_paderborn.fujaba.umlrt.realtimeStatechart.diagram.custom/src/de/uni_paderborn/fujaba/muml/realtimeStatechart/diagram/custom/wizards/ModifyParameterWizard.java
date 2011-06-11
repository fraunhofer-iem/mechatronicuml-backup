/*
 * Created on 08.07.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.wizards;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.IDialogSettings;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin;

public class ModifyParameterWizard extends CommonModifyWizard {
	
	private final String MODIFY_EPARAMETER_WIZARD_SECTION = "ModifyEParameterWizard";

	private ModifyParameterPage addEParameterPage;
	
	private SynchronizationChannel selectedSyncChannel = null;

	public ModifyParameterWizard(Diagram diag, SynchronizationChannel sC)
	{
		super(diag);
		
		setSelectedSyncChannel(sC);

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

		addEParameterPage = new ModifyParameterPage("Create/Delete parameters for selected synchronization channel");
		addPage(addEParameterPage);
		
	}

	public void setSelectedSyncChannel(SynchronizationChannel selectedSyncChannel) {
		this.selectedSyncChannel = selectedSyncChannel;
	}

	public SynchronizationChannel getSelectedSyncChannel() {
		return selectedSyncChannel;
	}
}
