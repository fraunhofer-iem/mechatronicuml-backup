/*
 * Created on 08.07.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.wizards;

import org.eclipse.jface.dialogs.IDialogSettings;

import de.uni_paderborn.fujaba.umlrt.common.wizard.AbstractWizard;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FujabaRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin;

public class ModifySynchronizationWizard extends AbstractWizard {
	
	private final String MODIFY_SYNCHRONIZATION_WIZARD_SECTION = "ModifySynchronizationWizard";

	private FujabaRealtimeStatechart realtimeStatechart = null;

	private ModifySynchronizationPage1 synchronizationPage1;
	private ModifySynchronizationPage2 synchronizationPage2;
	
	private Transition selectedTransition = null;
	private SynchronizationChannel selectedSynchronizationChannel = null;
	private String selectedSynchronizationType = "";

	public ModifySynchronizationWizard(org.eclipse.gmf.runtime.notation.impl.DiagramImpl diag, Transition transition)
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

		synchronizationPage1 = new ModifySynchronizationPage1("Create/Delete a synchronization for selected transition");
		addPage(synchronizationPage1);
		
		synchronizationPage2 = new ModifySynchronizationPage2("Create/Delete a synchronization for selected transition");
		addPage(synchronizationPage2);
		
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

	public void setSelectedSynchronizationChannel(
			SynchronizationChannel selectedSynchronizationChannel) {
		this.selectedSynchronizationChannel = selectedSynchronizationChannel;
	}

	public SynchronizationChannel getSelectedSynchronizationChannel() {
		return selectedSynchronizationChannel;
	}

	public void setSelectedSynchronizationType(
			String selectedSynchronizationType) {
		this.selectedSynchronizationType = selectedSynchronizationType;
	}

	public String getSelectedSynchronizationType() {
		return selectedSynchronizationType;
	}

}
