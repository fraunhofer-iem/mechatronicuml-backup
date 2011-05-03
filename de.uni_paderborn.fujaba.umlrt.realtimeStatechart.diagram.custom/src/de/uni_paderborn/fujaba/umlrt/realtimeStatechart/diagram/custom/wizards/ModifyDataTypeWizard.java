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
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin;

public class ModifyDataTypeWizard extends AbstractWizard {
	
	private final String CREATE_EDATATYPE_WIZARD_SECTION = "CreateEDataTypeWizard";

	private FujabaRealtimeStatechart realtimeStatechart = null;

	private ModifyDataTypePage addEDataTypePage;
	
	public ModifyDataTypeWizard(org.eclipse.gmf.runtime.notation.impl.DiagramImpl diag)
	{
		super();

		this.realtimeStatechart = (FujabaRealtimeStatechart)diag.getElement();


		IDialogSettings workbenchSettings = RealtimeStatechartDiagramEditorPlugin.getInstance().getDialogSettings();
		IDialogSettings section = workbenchSettings.getSection(this.CREATE_EDATATYPE_WIZARD_SECTION);
		if (section == null)
		{
			section = workbenchSettings.addNewSection(this.CREATE_EDATATYPE_WIZARD_SECTION);
		}
		setDialogSettings(section);
		
	}

	@Override
	public void addPages() {

		addEDataTypePage = new ModifyDataTypePage("Create/Delete data types for selected realtime statechart");
		addPage(addEDataTypePage);
		
	}


	public FujabaRealtimeStatechart getRealtimeStatechart() {
		return realtimeStatechart;
	}

	@Override
	public boolean performFinish() {
		
		return super.performFinish();
	}
}
