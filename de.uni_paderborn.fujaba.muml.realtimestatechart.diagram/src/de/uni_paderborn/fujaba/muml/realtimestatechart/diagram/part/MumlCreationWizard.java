package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;

import de.uni_paderborn.fujaba.modelinstance.ui.diagrams.AbstractFujabaDiagramNewWizard;

/**
 * @generated
 */
public class MumlCreationWizard
		extends
		de.uni_paderborn.fujaba.modelinstance.ui.diagrams.AbstractFujabaDiagramNewWizard {

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);

		setDefaultPageImageDescriptor(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewRealtimestatechartWizard.gif")); //$NON-NLS-1$

	}

	/**
	 * @generated
	 */
	@Override
	public String getEditorId() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditor.ID;

	}

	/**
	 * @generated
	 */
	@Override
	public AdapterFactory getItemProvidersAdapterFactory() {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.getInstance().getItemProvidersAdapterFactory();
	}

}
