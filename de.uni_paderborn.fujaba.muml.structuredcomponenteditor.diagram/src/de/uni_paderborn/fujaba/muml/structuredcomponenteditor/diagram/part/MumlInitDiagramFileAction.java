package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.storydriven.modeling.ExtendableElement;
import de.fujaba.newwizard.InitialElementAdapter;
import de.fujaba.newwizard.commands.AbstractCreateDiagramFileCommand;

/**
 * @generated
 */
public class MumlInitDiagramFileAction extends AbstractCreateDiagramFileCommand {

	/**
	 * @generated
	 */
	@Override
	public void setCharset(IFile diagramFile) {
		de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlDiagramEditorUtil
				.setCharset(diagramFile);
	}

	/**
	 * @generated
	 */
	@Override
	public String getUniqueFilename(String hint, String extension,
			IPath filePath) {
		return de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlDiagramEditorUtil
				.getUniqueFileName(filePath, hint, extension);
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
