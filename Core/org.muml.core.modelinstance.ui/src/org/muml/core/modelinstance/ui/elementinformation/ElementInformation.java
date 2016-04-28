package org.muml.core.modelinstance.ui.elementinformation;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.muml.core.modelinstance.ui.diagrams.IDiagramInformation;
import org.muml.mumlcore.modelinstance.ModelElementCategory;
import org.muml.mumlcore.modelinstance.ModelinstancePackage;

public class ElementInformation {
	public IDiagramInformation diagramInformation;
	public Collection<EObject> contents;
	public EObject diagramElement;

	public ElementInformation(EObject diagramElement,
			Collection<EObject> contents,
			IDiagramInformation diagramInformation) {
		this.diagramElement = diagramElement;
		this.contents = contents;
		this.diagramInformation = diagramInformation;
	}


	public static boolean isValidDiagramElement(String modelId, EObject diagramElement) {
		IAdaptable adapter = new EObjectAdapter(diagramElement);
		IOperation operation = new CreateDiagramViewOperation(adapter, modelId,
				null);
		return ViewService.getInstance().provides(operation);
	}

	public static boolean isValidTopLevelNodeElement(String modelId,
			EObject diagramElement, EObject topLevelNodeElement) {
		Diagram diagram = ViewService.createDiagram(diagramElement, modelId,
				null);
		IAdaptable adapter = new EObjectAdapter(topLevelNodeElement);
		IOperation operation = new CreateNodeViewOperation(adapter, diagram,
				null, 0, false, null);
		return ViewService.getInstance().provides(operation);
	}

	public static ElementInformation getElementInformation(EObject element,
			Map<String, IDiagramInformation> map) {
		for (IDiagramInformation information : map.values()) {
			String modelId = information.getModelId();
			
			EClass elementClass = information.getDiagramElementClass();
			if (elementClass == null) {
				continue;
			}
			boolean useCategory = ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY
					.isSuperTypeOf(elementClass);
			if (!useCategory && isValidDiagramElement(modelId, element)) {
				Collection<EObject> contents = Collections.emptyList();
				return new ElementInformation(element, contents, information);
			} else if (useCategory
					&& element.eContainer() instanceof ModelElementCategory
					&& isValidTopLevelNodeElement(modelId,
							element.eContainer(), element)) {
				Collection<EObject> contents = Collections
						.singletonList(element);
				return new ElementInformation(null, contents, information);
			}
		}
		return null;
	}

}