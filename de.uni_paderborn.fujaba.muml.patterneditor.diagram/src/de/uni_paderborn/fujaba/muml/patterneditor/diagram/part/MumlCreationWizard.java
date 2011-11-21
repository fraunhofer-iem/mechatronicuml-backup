package de.uni_paderborn.fujaba.muml.patterneditor.diagram.part;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;

import org.storydriven.modeling.ExtendableElement;
import de.fujaba.newwizard.InitialElementAdapter;
import de.fujaba.newwizard.diagrams.FujabaDiagramNewWizard;

/**
 * @generated
 */
public abstract class MumlCreationWizard extends FujabaDiagramNewWizard {

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
	protected String getDiagramFileExtension() {
		return "pattern_diagram"; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	@Override
	protected String getModelId() {
		return "Patterneditor";
	}

	/**
	 * @generated
	 */
	@Override
	protected PreferencesHint getDiagramPreferencesHint() {
		return de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
	}

	/**
	 * @generated
	 */
	@Override
	protected String getEditorId() {
		return de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.PatternDiagramEditor.ID;

	}

	/**
	 * @generated
	 */
	@Override
	protected ExtendableElement createDiagramElement() {

		return null;

	}

	/**
	 * @generated
	 */
	protected boolean isModelElementCategoryDiagramElement() {

		return true;

	}

	/**
	 * @generated
	 */
	protected CreateViewRequest getCreatePersistedViewsRequest(Diagram diagram,
			Collection<EObject> elements) {
		List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlNodeDescriptor> childDescriptors = de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlDiagramUpdater
				.getModelElementCategory_1000SemanticChildren(diagram);
		List<CreateViewRequest.ViewDescriptor> viewDescriptors = new ArrayList<CreateViewRequest.ViewDescriptor>(
				childDescriptors.size());

		for (de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlNodeDescriptor d : childDescriptors) {
			if (!elements.contains(d.getModelElement())) {
				continue;
			}
			java.lang.String hint = de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry
					.getType(d.getVisualID());
			IAdaptable elementAdapter = new InitialElementAdapter(
					d.getModelElement(), hint);
			CreateViewRequest.ViewDescriptor descriptor = new CreateViewRequest.ViewDescriptor(
					elementAdapter, Node.class, hint, ViewUtil.APPEND, true,
					getDiagramPreferencesHint());
			viewDescriptors.add(descriptor);
		}
		return new CreateViewRequest(viewDescriptors);
	}

}
