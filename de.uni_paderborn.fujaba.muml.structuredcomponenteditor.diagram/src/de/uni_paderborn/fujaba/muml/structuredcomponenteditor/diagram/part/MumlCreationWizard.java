package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
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
public class MumlCreationWizard extends FujabaDiagramNewWizard {

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);

		setDefaultPageImageDescriptor(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewModelinstanceWizard.gif")); //$NON-NLS-1$

	}

	/**
	 * @generated
	 */
	@Override
	public String getDiagramFileExtension() {
		return "structuredcomponent_diagram"; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	@Override
	public String getModelId() {
		return "de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram";
	}

	/**
	 * @generated
	 */
	@Override
	public String getModelElementCategoryKey() {
		return "de.uni_paderborn.fujaba.muml.components.category";
	}

	/**
	 * @generated
	 */
	@Override
	public PreferencesHint getDiagramPreferencesHint() {
		return de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
	}

	/**
	 * @generated
	 */
	@Override
	public String getEditorId() {
		return de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditor.ID;

	}

	/**
	 * @generated
	 */
	@Override
	public ExtendableElement createDiagramElement() {

		return null;

	}

	/**
	 * @generated
	 */
	public boolean isModelElementCategoryDiagramElement() {

		return true;

	}

	/**
	 * @generated
	 */
	public CreateViewRequest getCreatePersistedViewsRequest(Diagram diagram,
			Collection<EObject> elements) {
		List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor> childDescriptors = de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlDiagramUpdater
				.getModelElementCategory_1000SemanticChildren(diagram);
		List<CreateViewRequest.ViewDescriptor> viewDescriptors = new ArrayList<CreateViewRequest.ViewDescriptor>(
				childDescriptors.size());

		for (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor d : childDescriptors) {
			if (!elements.contains(d.getModelElement())) {
				continue;
			}
			java.lang.String hint = de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
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

	/**
	 * @generated
	 */
	@Override
	public boolean isValidDiagramElement(EObject diagramElement) {
		IAdaptable adapter = new EObjectAdapter(diagramElement);
		IOperation operation = new CreateDiagramViewOperation(adapter,
				getModelId(), getDiagramPreferencesHint());
		return ViewService.getInstance().provides(operation);
	}

	/**
	 * @generated
	 */
	@Override
	public boolean isValidTopLevelNodeElement(EObject diagramElement,
			EObject topLevelNodeElement) {
		Diagram diagram = ViewService.getInstance().createDiagram(
				diagramElement, getModelId(), getDiagramPreferencesHint());

		IAdaptable adapter = new EObjectAdapter(topLevelNodeElement);
		IOperation operation = new CreateNodeViewOperation(adapter, diagram,
				null, 0, false, getDiagramPreferencesHint());
		return ViewService.getInstance().provides(operation);
	}
}
