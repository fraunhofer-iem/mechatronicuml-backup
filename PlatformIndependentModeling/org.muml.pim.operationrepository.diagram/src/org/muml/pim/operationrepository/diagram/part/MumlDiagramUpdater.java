package org.muml.pim.operationrepository.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.muml.core.ExtendableElement;

/**
 * @generated
 */
public class MumlDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<org.muml.pim.operationrepository.diagram.part.MumlNodeDescriptor> getSemanticChildren(
			View view) {
		switch (org.muml.pim.operationrepository.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case org.muml.pim.operationrepository.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000SemanticChildren(view);
		case org.muml.pim.operationrepository.diagram.edit.parts.OperationRepositoryOperationCompartmentEditPart.VISUAL_ID:
			return getOperationRepositoryOperationCompartment_7001SemanticChildren(view);
		case org.muml.pim.operationrepository.diagram.edit.parts.OperationParametersCompartmentEditPart.VISUAL_ID:
			return getOperationParametersCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.operationrepository.diagram.part.MumlNodeDescriptor> getModelElementCategory_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.core.modelinstance.ModelElementCategory modelElement = (org.muml.core.modelinstance.ModelElementCategory) view
				.getElement();
		LinkedList<org.muml.pim.operationrepository.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.operationrepository.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getModelElements().iterator(); it.hasNext();) {
			ExtendableElement childElement = (ExtendableElement) it.next();
			int visualID = org.muml.pim.operationrepository.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.operationrepository.diagram.edit.parts.OperationRepositoryEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.operationrepository.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.operationrepository.diagram.part.MumlNodeDescriptor> getOperationRepositoryOperationCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pim.behavior.OperationRepository modelElement = (org.muml.pim.behavior.OperationRepository) containerView
				.getElement();
		LinkedList<org.muml.pim.operationrepository.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.operationrepository.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperations().iterator(); it.hasNext();) {
			org.muml.pim.behavior.Operation childElement = (org.muml.pim.behavior.Operation) it
					.next();
			int visualID = org.muml.pim.operationrepository.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.operationrepository.diagram.edit.parts.OperationEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.operationrepository.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.operationrepository.diagram.part.MumlNodeDescriptor> getOperationParametersCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pim.behavior.Operation modelElement = (org.muml.pim.behavior.Operation) containerView
				.getElement();
		LinkedList<org.muml.pim.operationrepository.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.operationrepository.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParameters().iterator(); it.hasNext();) {
			org.muml.pim.behavior.Parameter childElement = (org.muml.pim.behavior.Parameter) it
					.next();
			int visualID = org.muml.pim.operationrepository.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.operationrepository.diagram.edit.parts.ParameterEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.operationrepository.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.operationrepository.diagram.part.MumlLinkDescriptor> getContainedLinks(
			View view) {
		switch (org.muml.pim.operationrepository.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case org.muml.pim.operationrepository.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000ContainedLinks(view);
		case org.muml.pim.operationrepository.diagram.edit.parts.OperationRepositoryEditPart.VISUAL_ID:
			return getOperationRepository_2001ContainedLinks(view);
		case org.muml.pim.operationrepository.diagram.edit.parts.OperationEditPart.VISUAL_ID:
			return getOperation_3001ContainedLinks(view);
		case org.muml.pim.operationrepository.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return getParameter_3002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.operationrepository.diagram.part.MumlLinkDescriptor> getIncomingLinks(
			View view) {
		switch (org.muml.pim.operationrepository.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case org.muml.pim.operationrepository.diagram.edit.parts.OperationRepositoryEditPart.VISUAL_ID:
			return getOperationRepository_2001IncomingLinks(view);
		case org.muml.pim.operationrepository.diagram.edit.parts.OperationEditPart.VISUAL_ID:
			return getOperation_3001IncomingLinks(view);
		case org.muml.pim.operationrepository.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return getParameter_3002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.operationrepository.diagram.part.MumlLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (org.muml.pim.operationrepository.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case org.muml.pim.operationrepository.diagram.edit.parts.OperationRepositoryEditPart.VISUAL_ID:
			return getOperationRepository_2001OutgoingLinks(view);
		case org.muml.pim.operationrepository.diagram.edit.parts.OperationEditPart.VISUAL_ID:
			return getOperation_3001OutgoingLinks(view);
		case org.muml.pim.operationrepository.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return getParameter_3002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.operationrepository.diagram.part.MumlLinkDescriptor> getModelElementCategory_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.operationrepository.diagram.part.MumlLinkDescriptor> getOperationRepository_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.operationrepository.diagram.part.MumlLinkDescriptor> getOperation_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.operationrepository.diagram.part.MumlLinkDescriptor> getParameter_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.operationrepository.diagram.part.MumlLinkDescriptor> getOperationRepository_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.operationrepository.diagram.part.MumlLinkDescriptor> getOperation_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.operationrepository.diagram.part.MumlLinkDescriptor> getParameter_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.operationrepository.diagram.part.MumlLinkDescriptor> getOperationRepository_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.operationrepository.diagram.part.MumlLinkDescriptor> getOperation_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.operationrepository.diagram.part.MumlLinkDescriptor> getParameter_3002OutgoingLinks(
			View view) {
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

		public List<org.muml.pim.operationrepository.diagram.part.MumlNodeDescriptor> getSemanticChildren(
				View view) {
			return MumlDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<org.muml.pim.operationrepository.diagram.part.MumlLinkDescriptor> getContainedLinks(
				View view) {
			return MumlDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<org.muml.pim.operationrepository.diagram.part.MumlLinkDescriptor> getIncomingLinks(
				View view) {
			return MumlDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<org.muml.pim.operationrepository.diagram.part.MumlLinkDescriptor> getOutgoingLinks(
				View view) {
			return MumlDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
