package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;

/**
 * @generated
 */
public class HardwareCreationWizard
		extends
		de.uni_paderborn.fujaba.modelinstance.ui.diagrams.AbstractFujabaDiagramNewWizard {

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);

		setDefaultPageImageDescriptor(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewPlatforminstanceWizard.gif")); //$NON-NLS-1$

	}

	/**
	 * @generated
	 */
	@Override
	public String getEditorId() {
		return de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditor.ID;

	}

	/**
	 * @generated
	 */
	@Override
	public AdapterFactory getItemProvidersAdapterFactory() {
		return de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareDiagramEditorPlugin
				.getInstance().getItemProvidersAdapterFactory();
	}

}
