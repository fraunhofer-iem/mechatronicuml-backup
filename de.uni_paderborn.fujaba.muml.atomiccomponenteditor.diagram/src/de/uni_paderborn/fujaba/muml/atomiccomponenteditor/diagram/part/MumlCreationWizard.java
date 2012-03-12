package de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part;

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
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);

		setDefaultPageImageDescriptor(de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.AtomiccomponentDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewModelinstanceWizard.gif")); //$NON-NLS-1$

	}

	/**
	 * @generated
	 */
	@Override
	public String getEditorId() {
		return de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.AtomiccomponentDiagramEditor.ID;

	}

	/**
	 * @generated
	 */
	@Override
	public AdapterFactory getItemProvidersAdapterFactory() {
		return de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.AtomiccomponentDiagramEditorPlugin
				.getInstance().getItemProvidersAdapterFactory();
	}

}
