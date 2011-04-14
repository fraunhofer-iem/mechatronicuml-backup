package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.part;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;

import de.uni_paderborn.fujaba.newwizard.diagrams.FujabaDiagramNewWizard;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechartFactory;

public class CustomRealtimeStatechartDiagramCreationWizard extends FujabaDiagramNewWizard {

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);

		setWindowTitle(getWindowTitle());
		setDefaultPageImageDescriptor(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.
				diagram.part.RealtimeStatechartDiagramEditorPlugin
				.getBundledImageDescriptor("icons/StatechartFile.gif")); //$NON-NLS-1$

	}

	@Override
	protected String getDiagramFileExtension() {
		return "statechart_diagram"; //$NON-NLS-1$
	}

	@Override
	protected String getModelId() {
		return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.
		diagram.edit.parts.RealtimeStatechartEditPart.MODEL_ID;
	}

	@Override
	protected PreferencesHint getDiagramPreferencesHint() {
		return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.
		diagram.part.RealtimeStatechartDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
	}

	@Override
	protected String getEditorId() {
		return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.
		diagram.part.RealtimeStatechartDiagramEditor.ID;
	}

	/**
	 * Create a new instance of domain element associated with canvas.
	 */
	@Override
	protected EObject createInitialModel() {
		RealtimeStatechart failureTypeDiag = RealtimeStatechartFactory.eINSTANCE
				.createRealtimeStatechart();

		return failureTypeDiag;
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
