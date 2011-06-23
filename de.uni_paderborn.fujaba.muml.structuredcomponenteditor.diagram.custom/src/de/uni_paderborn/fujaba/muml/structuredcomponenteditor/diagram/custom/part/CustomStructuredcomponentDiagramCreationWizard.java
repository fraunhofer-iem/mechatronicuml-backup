package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.custom.part;

import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.storydriven.modeling.ExtendableElement;

import de.fujaba.newwizard.diagrams.FujabaDiagramNewWizard;

/**
 * A CreationWizard for StructuredComponent diagrams. It implements the abstract
 * creation wizard from the de.uni_paderborn.fujaba.newwizard plugin.
 * 
 * @author bingo
 * 
 */
public class CustomStructuredcomponentDiagramCreationWizard extends
		FujabaDiagramNewWizard {

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);

		setWindowTitle(getWindowTitle());
		setDefaultPageImageDescriptor(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewPatterneditorWizard.gif")); //$NON-NLS-1$

	}

	@Override
	protected String getDiagramFileExtension() {
		return "structuredcomponent_diagram"; //$NON-NLS-1$
	}

	@Override
	protected String getModelId() {
		return de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StructuredComponentDiagramEditPart.MODEL_ID;
	}

	@Override
	protected PreferencesHint getDiagramPreferencesHint() {
		return de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
	}

	@Override
	protected String getEditorId() {
		return de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditor.ID;

	}


	@Override
	protected String getModelElementCategoryKey() {
		return "de.uni_paderborn.fujaba.muml.components.category";
	}

	@Override
	protected ExtendableElement createDiagramElement() {
		return null;
	}

}
