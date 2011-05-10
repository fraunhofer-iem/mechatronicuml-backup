package de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.custom.part;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;

import de.uni_paderborn.fujaba.newwizard.diagrams.FujabaDiagramNewWizard;
import de.uni_paderborn.fujaba.umlrt.model.core.Cardinality;
import de.uni_paderborn.fujaba.umlrt.model.core.CoreFactory;
import de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber;
import de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.umlrt.model.pattern.PatternFactory;
import de.uni_paderborn.fujaba.umlrt.model.pattern.Role;
import de.uni_paderborn.fujaba.umlrt.patterneditor.PatternDiagram;
import de.uni_paderborn.fujaba.umlrt.patterneditor.PatterneditorFactory;

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
		setDefaultPageImageDescriptor(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewPatterneditorWizard.gif")); //$NON-NLS-1$

	}

	@Override
	protected String getDiagramFileExtension() {
		return "pattern_diagram"; //$NON-NLS-1$
	}

	@Override
	protected String getModelId() {
		return de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.PatternDiagramEditPart.MODEL_ID;
	}

	@Override
	protected PreferencesHint getDiagramPreferencesHint() {
		return de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
	}

	@Override
	protected String getEditorId() {
		return de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternDiagramEditor.ID;

	}

	@Override
	protected EObject createInitialModel() {
		CoordinationPattern coordinationPattern = createCoordinationPattern();
		coordinationPattern.getRoles().add(createRole());
		coordinationPattern.getRoles().add(createRole());
		
		PatternDiagram patternDiagram = PatterneditorFactory.eINSTANCE
			.createPatternDiagram();
		
		patternDiagram.setCoordinationPattern(coordinationPattern);
		
		for (Role role : coordinationPattern.getRoles()) {
			patternDiagram.getRoles().add(role);
		}
		
		return patternDiagram;
	}

	private Role createRole() {
		Role role = PatternFactory.eINSTANCE.createRole();
		Cardinality cardinality = CoreFactory.eINSTANCE.createCardinality();
		NaturalNumber lowerBound = CoreFactory.eINSTANCE.createNaturalNumber();
		NaturalNumber upperBound = CoreFactory.eINSTANCE.createNaturalNumber();
		lowerBound.setValue(1);
		upperBound.setValue(1);
		cardinality.setLowerBound(lowerBound);
		cardinality.setUpperBound(upperBound);
		role.setCardinality(cardinality);
		return role;
	}

	private CoordinationPattern createCoordinationPattern() {
		return PatternFactory.eINSTANCE.createCoordinationPattern();
	}

	@Override
	public boolean isValidDiagramElement(EObject object) {
		return ViewService
				.getInstance()
				.provides(
						new CreateDiagramViewOperation(
								new EObjectAdapter(object),
								de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.PatternDiagramEditPart.MODEL_ID,
								de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT));
	}

}
