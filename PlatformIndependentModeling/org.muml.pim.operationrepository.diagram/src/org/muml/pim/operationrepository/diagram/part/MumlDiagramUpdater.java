package org.muml.pim.operationrepository.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.muml.mumlcore.ExtendableElement;
import org.muml.mumlcore.modelinstance.ModelElementCategory;
import org.muml.pim.behavior.Operation;
import org.muml.pim.behavior.OperationRepository;
import org.muml.pim.behavior.Parameter;
import org.muml.pim.operationrepository.diagram.edit.parts.ModelElementCategoryEditPart;
import org.muml.pim.operationrepository.diagram.edit.parts.OperationEditPart;
import org.muml.pim.operationrepository.diagram.edit.parts.OperationParametersCompartmentEditPart;
import org.muml.pim.operationrepository.diagram.edit.parts.OperationRepositoryEditPart;
import org.muml.pim.operationrepository.diagram.edit.parts.OperationRepositoryOperationCompartmentEditPart;
import org.muml.pim.operationrepository.diagram.edit.parts.ParameterEditPart;

/**
 * @generated
 */
public class MumlDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getSemanticChildren(View view) {
		switch (MumlVisualIDRegistry.getVisualID(view)) {
		case ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000SemanticChildren(view);
		case OperationRepositoryOperationCompartmentEditPart.VISUAL_ID:
			return getOperationRepositoryOperationCompartment_7001SemanticChildren(view);
		case OperationParametersCompartmentEditPart.VISUAL_ID:
			return getOperationParametersCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getModelElementCategory_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ModelElementCategory modelElement = (ModelElementCategory) view.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getModelElements().iterator(); it.hasNext();) {
			ExtendableElement childElement = (ExtendableElement) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OperationRepositoryEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getOperationRepositoryOperationCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		OperationRepository modelElement = (OperationRepository) containerView.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperations().iterator(); it.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OperationEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getOperationParametersCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Operation modelElement = (Operation) containerView.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParameters().iterator(); it.hasNext();) {
			Parameter childElement = (Parameter) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ParameterEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getContainedLinks(View view) {
		switch (MumlVisualIDRegistry.getVisualID(view)) {
		case ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000ContainedLinks(view);
		case OperationRepositoryEditPart.VISUAL_ID:
			return getOperationRepository_2001ContainedLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3001ContainedLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getIncomingLinks(View view) {
		switch (MumlVisualIDRegistry.getVisualID(view)) {
		case OperationRepositoryEditPart.VISUAL_ID:
			return getOperationRepository_2001IncomingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3001IncomingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getOutgoingLinks(View view) {
		switch (MumlVisualIDRegistry.getVisualID(view)) {
		case OperationRepositoryEditPart.VISUAL_ID:
			return getOperationRepository_2001OutgoingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3001OutgoingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getModelElementCategory_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getOperationRepository_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getOperation_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getParameter_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getOperationRepository_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getOperation_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getParameter_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getOperationRepository_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getOperation_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getParameter_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<MumlNodeDescriptor> getSemanticChildren(View view) {
			return MumlDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MumlLinkDescriptor> getContainedLinks(View view) {
			return MumlDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MumlLinkDescriptor> getIncomingLinks(View view) {
			return MumlDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MumlLinkDescriptor> getOutgoingLinks(View view) {
			return MumlDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
