package org.muml.pm.hardware.platforminstance.diagram.part;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;

/**
 * @generated
 */
public class HardwareCreationWizard
		extends org.muml.core.modelinstance.ui.diagrams.AbstractFujabaDiagramNewWizard {

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);

		setDefaultPageImageDescriptor(
				org.muml.pm.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
						.getBundledImageDescriptor("icons/wizban/NewHwplatforminstanceWizard.gif")); //$NON-NLS-1$

	}

	/**
	 * @generated
	 */
	@Override
	public String getEditorId() {
		return org.muml.pm.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditor.ID;

	}

	/**
	 * @generated
	 */
	@Override
	public AdapterFactory getItemProvidersAdapterFactory() {
		return org.muml.pm.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
				.getInstance().getItemProvidersAdapterFactory();
	}

}
