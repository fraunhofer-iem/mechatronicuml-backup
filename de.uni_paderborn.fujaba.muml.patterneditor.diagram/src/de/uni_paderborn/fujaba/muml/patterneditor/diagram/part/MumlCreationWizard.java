package de.uni_paderborn.fujaba.muml.patterneditor.diagram.part;

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

		setDefaultPageImageDescriptor(de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewModelinstanceWizard.gif")); //$NON-NLS-1$

	}

	/**
	 * @generated
	 */
	@Override
	public String getEditorId() {
		return de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.PatternDiagramEditor.ID;

	}

}
