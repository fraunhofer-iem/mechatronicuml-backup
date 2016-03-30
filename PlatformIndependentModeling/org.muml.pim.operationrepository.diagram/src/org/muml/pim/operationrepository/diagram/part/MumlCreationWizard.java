package org.muml.pim.operationrepository.diagram.part;

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

		setDefaultPageImageDescriptor(
				org.muml.pim.operationrepository.diagram.part.OperationRepositoryDiagramEditorPlugin
						.getBundledImageDescriptor("icons/wizban/NewModelinstanceWizard.gif")); //$NON-NLS-1$

	}

	/**
	 * @generated
	 */
	@Override
	public String getEditorId() {
		return org.muml.pim.operationrepository.diagram.part.MumlDiagramEditor.ID;

	}

	/**
	 * @generated
	 */
	@Override
	public AdapterFactory getItemProvidersAdapterFactory() {
		return org.muml.pim.operationrepository.diagram.part.OperationRepositoryDiagramEditorPlugin
				.getInstance().getItemProvidersAdapterFactory();
	}

}
