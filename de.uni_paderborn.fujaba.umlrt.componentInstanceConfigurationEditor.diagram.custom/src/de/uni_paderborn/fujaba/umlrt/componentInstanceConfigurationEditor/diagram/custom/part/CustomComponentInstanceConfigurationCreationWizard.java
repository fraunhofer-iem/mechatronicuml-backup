package de.uni_paderborn.fujaba.umlrt.componentInstanceConfigurationEditor.diagram.custom.part;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;

import de.uni_paderborn.fujaba.newwizard.diagrams.FujabaDiagramNewWizard;
import de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.ComponentInstanceConfiguration;
import de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.componentInstanceConfigurationFactory;

public class CustomComponentInstanceConfigurationCreationWizard extends FujabaDiagramNewWizard {

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);

		setWindowTitle(getWindowTitle());
		setDefaultPageImageDescriptor(de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationDiagramEditorPlugin
				.getBundledImageDescriptor("icons/NewComponentInstanceConfigurationEditorWizard.gif")); //$NON-NLS-1$

	}

	@Override
	protected String getDiagramFileExtension() {
		return "componentInstanceConfiguration_diagram"; //$NON-NLS-1$
	}

	@Override
	protected String getModelId() {
		return de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPart.MODEL_ID;
	}

	@Override
	protected PreferencesHint getDiagramPreferencesHint() {
		return de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
	}

	@Override
	protected String getEditorId() {
		return de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationDiagramEditor.ID;
	}

	/**
	 * Create a new instance of domain element associated with canvas.
	 */
	@Override
	protected EObject createInitialModel() {
		ComponentInstanceConfiguration CICDiagram = componentInstanceConfigurationFactory.eINSTANCE
				.createComponentInstanceConfiguration();

		return CICDiagram;
	}

	@Override
	public boolean isValidDiagramElement(EObject object) {
		return ViewService
				.getInstance()
				.provides(
						new CreateDiagramViewOperation(
								new EObjectAdapter(object),
								getModelId(),
								getDiagramPreferencesHint()));
	}

}
