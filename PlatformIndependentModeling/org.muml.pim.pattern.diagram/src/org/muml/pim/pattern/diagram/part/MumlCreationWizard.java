package org.muml.pim.pattern.diagram.part;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;

/**
 * @generated
 */
public class MumlCreationWizard
		extends org.muml.core.modelinstance.ui.diagrams.AbstractFujabaDiagramNewWizard {

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);

		setDefaultPageImageDescriptor(org.muml.pim.pattern.diagram.part.MumlDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewModelinstanceWizard.gif")); //$NON-NLS-1$

	}

	/**
	* @generated
	*/
	@Override
	public String getEditorId() {
		return org.muml.pim.pattern.diagram.part.CoordinationPatternDiagramEditor.ID;

	}

	/**
	* @generated
	*/
	@Override
	public AdapterFactory getItemProvidersAdapterFactory() {
		return org.muml.pim.pattern.diagram.part.MumlDiagramEditorPlugin.getInstance()
				.getItemProvidersAdapterFactory();
	}

}
