package de.uni_paderborn.fujaba.muml.operationrepository.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.storydriven.core.ExtendableElement;

/**
 * @generated
 */
public class MumlDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.OperationRepositoryOperationCompartmentEditPart.VISUAL_ID:
			return getOperationRepositoryOperationCompartment_7001SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.OperationParametersCompartmentEditPart.VISUAL_ID:
			return getOperationParametersCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlNodeDescriptor> getModelElementCategory_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.modelinstance.ModelElementCategory modelElement = (de.uni_paderborn.fujaba.modelinstance.ModelElementCategory) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getModelElements().iterator(); it.hasNext();) {
			ExtendableElement childElement = (ExtendableElement) it.next();
			int visualID = de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.OperationRepositoryEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlNodeDescriptor> getOperationRepositoryOperationCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.behavior.OperationRepository modelElement = (de.uni_paderborn.fujaba.muml.behavior.OperationRepository) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperations().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.behavior.Operation childElement = (de.uni_paderborn.fujaba.muml.behavior.Operation) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.OperationEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlNodeDescriptor> getOperationParametersCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.behavior.Operation modelElement = (de.uni_paderborn.fujaba.muml.behavior.Operation) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParameters().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.behavior.Parameter childElement = (de.uni_paderborn.fujaba.muml.behavior.Parameter) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.ParameterEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.OperationRepositoryEditPart.VISUAL_ID:
			return getOperationRepository_2001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.OperationEditPart.VISUAL_ID:
			return getOperation_3001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return getParameter_3002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.OperationRepositoryEditPart.VISUAL_ID:
			return getOperationRepository_2001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.OperationEditPart.VISUAL_ID:
			return getOperation_3001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return getParameter_3002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.OperationRepositoryEditPart.VISUAL_ID:
			return getOperationRepository_2001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.OperationEditPart.VISUAL_ID:
			return getOperation_3001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return getParameter_3002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlLinkDescriptor> getModelElementCategory_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlLinkDescriptor> getOperationRepository_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlLinkDescriptor> getOperation_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlLinkDescriptor> getParameter_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlLinkDescriptor> getOperationRepository_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlLinkDescriptor> getOperation_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlLinkDescriptor> getParameter_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlLinkDescriptor> getOperationRepository_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlLinkDescriptor> getOperation_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlLinkDescriptor> getParameter_3002OutgoingLinks(
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

		public List<de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlNodeDescriptor> getSemanticChildren(
				View view) {
			return MumlDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlLinkDescriptor> getContainedLinks(
				View view) {
			return MumlDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlLinkDescriptor> getIncomingLinks(
				View view) {
			return MumlDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlLinkDescriptor> getOutgoingLinks(
				View view) {
			return MumlDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
