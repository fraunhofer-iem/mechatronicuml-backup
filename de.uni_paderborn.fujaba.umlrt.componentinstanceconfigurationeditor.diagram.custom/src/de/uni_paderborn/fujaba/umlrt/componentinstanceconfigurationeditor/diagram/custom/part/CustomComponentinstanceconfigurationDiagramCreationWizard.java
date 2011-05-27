package de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.custom.part;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.storydriven.modeling.ExtendableElement;

import de.uni_paderborn.fujaba.newwizard.diagrams.FujabaDiagramNewWizard;
import de.uni_paderborn.fujaba.muml.model.instance.InstanceFactory;

/**
 * A CreationWizard for ComponentInstanceConfiguration diagrams. It implements
 * the abstract creation wizard from the de.uni_paderborn.fujaba.newwizard
 * plugin.
 * 
 * @author bingo
 * 
 */
public class CustomComponentinstanceconfigurationDiagramCreationWizard extends
		FujabaDiagramNewWizard {

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);

		setWindowTitle(getWindowTitle());
		setDefaultPageImageDescriptor(de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewPatterneditorWizard.gif")); //$NON-NLS-1$

	}

	@Override
	protected String getDiagramFileExtension() {
		return "componentinstanceconfiguration_diagram"; //$NON-NLS-1$
	}

	@Override
	protected String getModelId() {
		return de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.MODEL_ID;
	}

	@Override
	protected PreferencesHint getDiagramPreferencesHint() {
		return de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
	}

	@Override
	protected String getEditorId() {
		return de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditor.ID;

	}
//
//	@Override
//	protected EObject createInitialModel() {
//		ComponentInstanceConfiguration diagram = ComponentinstanceconfigurationFactory.eINSTANCE
//				.createComponentInstanceConfiguration();
//		return diagram;
//	}

	@Override
	public boolean isValidDiagramElement(EObject object) {
		return ViewService
				.getInstance()
				.provides(
						new CreateDiagramViewOperation(
								new EObjectAdapter(object),
								de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.MODEL_ID,
								de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT));
	}

	@Override
	protected String getModelElementCategoryKey() {
		return "de.uni_paderborn.fujaba.umlrt.instance.category";
	}

	@Override
	protected ExtendableElement createDiagramElement() {
		return InstanceFactory.eINSTANCE.createComponentInstanceConfiguration();
	}

}
