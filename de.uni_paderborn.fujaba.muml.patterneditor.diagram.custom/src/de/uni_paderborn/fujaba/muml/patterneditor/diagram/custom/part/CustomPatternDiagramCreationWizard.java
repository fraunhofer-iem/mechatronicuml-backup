package de.uni_paderborn.fujaba.muml.patterneditor.diagram.custom.part;

import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.storydriven.modeling.ExtendableElement;

import de.fujaba.newwizard.diagrams.FujabaDiagramNewWizard;
import de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlDiagramEditorPlugin;

/**
 * A CreationWizard for Pattern diagrams. It implements the abstract creation
 * wizard from the de.uni_paderborn.fujaba.newwizard plugin.
 * 
 * @author bingo
 * 
 */
public class CustomPatternDiagramCreationWizard extends FujabaDiagramNewWizard {

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);

		setWindowTitle(getWindowTitle());
		setDefaultPageImageDescriptor(MumlDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewPatterneditorWizard.gif")); //$NON-NLS-1$

	}

	@Override
	protected String getDiagramFileExtension() {
		return "pattern_diagram"; //$NON-NLS-1$
	}

	@Override
	protected String getModelId() {
		return de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID;
	}

	@Override
	protected PreferencesHint getDiagramPreferencesHint() {
		return de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
	}

	@Override
	protected String getEditorId() {
		return de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.PatternDiagramEditor.ID;

	}

	@Override
	protected String getModelElementCategoryKey() {
		return "de.uni_paderborn.fujaba.muml.pattern.category";
	}

	@Override
	protected ExtendableElement createDiagramElement() {
		return null; //PatternFactory.eINSTANCE.createCoordinationPattern();
	}

}
