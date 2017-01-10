package org.muml.pim.pattern.diagram.part;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.muml.core.modelinstance.ui.diagrams.AbstractFujabaDiagramNewWizard;

/**
 * @generated
 */
public class MumlCreationWizard extends AbstractFujabaDiagramNewWizard {

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);

		setDefaultPageImageDescriptor(
				MumlDiagramEditorPlugin.getBundledImageDescriptor("icons/wizban/NewModelinstanceWizard.gif")); //$NON-NLS-1$

	}

	/**
	* @generated
	*/
	@Override
	public String getEditorId() {
		return CoordinationPatternDiagramEditor.ID;

	}

	/**
	* @generated
	*/
	@Override
	public AdapterFactory getItemProvidersAdapterFactory() {
		return MumlDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory();
	}

}
