package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;

import de.fujaba.newwizard.diagrams.AbstractFujabaDiagramNewWizard;

/**
 * @generated
 */
public class MumlCreationWizard extends AbstractFujabaDiagramNewWizard {

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);

		setDefaultPageImageDescriptor(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewInstanceWizard.gif")); //$NON-NLS-1$

	}

	/**
	 * @generated
	 */
	@Override
	public String getEditorId() {
		return de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditor.ID;

	}

	/**
	 * @generated
	 */
	@Override
	public AdapterFactory getItemProvidersAdapterFactory() {
		return de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.getInstance().getItemProvidersAdapterFactory();
	}

}
