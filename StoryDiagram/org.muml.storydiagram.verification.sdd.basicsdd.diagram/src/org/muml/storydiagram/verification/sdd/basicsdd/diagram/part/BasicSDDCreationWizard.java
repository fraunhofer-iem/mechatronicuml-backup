package org.muml.storydiagram.verification.sdd.basicsdd.diagram.part;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;

/**
 * @generated
 */
public class BasicSDDCreationWizard
		extends
		org.muml.core.modelinstance.ui.diagrams.AbstractFujabaDiagramNewWizard {

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);

		setDefaultPageImageDescriptor(org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewBasicSDDWizard.gif")); //$NON-NLS-1$

	}

	/**
	 * @generated
	 */
	@Override
	public String getEditorId() {
		return org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDDiagramEditor.ID;

	}

	/**
	 * @generated
	 */
	@Override
	public AdapterFactory getItemProvidersAdapterFactory() {
		return org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDDiagramEditorPlugin
				.getInstance().getItemProvidersAdapterFactory();
	}

}
