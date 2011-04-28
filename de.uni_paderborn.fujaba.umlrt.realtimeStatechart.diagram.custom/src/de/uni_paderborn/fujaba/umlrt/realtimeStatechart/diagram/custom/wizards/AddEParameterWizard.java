/*
 * Created on 08.07.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.wizards;

import org.eclipse.jface.dialogs.IDialogSettings;

import de.uni_paderborn.fujaba.umlrt.common.wizard.AbstractWizard;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin;

public class AddEParameterWizard extends AbstractWizard {
	
	private final String ADD_EPARAMETER_WIZARD_SECTION = "AddEParameterWizard";

	private org.eclipse.gmf.runtime.notation.impl.DiagramImpl diag = null;

	private AddEParameterPage addEParameterPage;
	
	private SynchronizationChannel selectedSyncChannel = null;

	public AddEParameterWizard(org.eclipse.gmf.runtime.notation.impl.DiagramImpl diag, SynchronizationChannel sC)
	{
		super();

		this.diag = diag;
		this.setSelectedSyncChannel(sC);

		IDialogSettings workbenchSettings = RealtimeStatechartDiagramEditorPlugin.getInstance().getDialogSettings();
		IDialogSettings section = workbenchSettings.getSection(this.ADD_EPARAMETER_WIZARD_SECTION);
		if (section == null)
		{
			section = workbenchSettings.addNewSection(this.ADD_EPARAMETER_WIZARD_SECTION);
		}
		setDialogSettings(section);
	}

	@Override
	public void addPages() {

		addEParameterPage = new AddEParameterPage("Event occurrences for hazards", selection);
		addEParameterPage.setExplanation("Required event occurrences for each hazard.");

	}


	public org.eclipse.gmf.runtime.notation.impl.DiagramImpl getDiag() {
		return diag;
	}

	@Override
	public boolean performFinish() {
		
		return super.performFinish();
	}

	public void setSelectedSyncChannel(SynchronizationChannel selectedSyncChannel) {
		this.selectedSyncChannel = selectedSyncChannel;
	}

	public SynchronizationChannel getSelectedSyncChannel() {
		return selectedSyncChannel;
	}
}
