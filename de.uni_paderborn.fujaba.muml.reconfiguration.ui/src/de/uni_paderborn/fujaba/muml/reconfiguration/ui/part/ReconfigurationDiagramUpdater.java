package de.uni_paderborn.fujaba.muml.reconfiguration.ui.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.core.ExtendableElement;

/**
 * @generated
 */
public class ReconfigurationDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentEditPart.VISUAL_ID:
			return getReconfigurableStructuredComponent_2076SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentCompartmentEditPart.VISUAL_ID:
			return getReconfigurableStructuredComponentCompartment_7077SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.RuleBasedReconfigurationControllerEditPart.VISUAL_ID:
			return getRuleBasedReconfigurationController_7076SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ManagerEditPart.VISUAL_ID:
			return getManager_2075SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor> getModelElementCategory_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();

		}
		de.uni_paderborn.fujaba.modelinstance.ModelElementCategory modelElement = (de.uni_paderborn.fujaba.modelinstance.ModelElementCategory) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getModelElements().iterator(); it
				.hasNext();) {
			ExtendableElement childElement = (ExtendableElement) it.next();
			int visualID = de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	public static List<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor> getReconfigurableStructuredComponent_2076SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent modelElement = (de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.component.Port childElement = (de.uni_paderborn.fujaba.muml.component.Port) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationExecutionPortEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}

		}
		if (modelElement.getController() != null) {
			de.uni_paderborn.fujaba.muml.reconfiguration.Controller childElement = (de.uni_paderborn.fujaba.muml.reconfiguration.Controller) modelElement
					.getController();
			int visualID = de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.RuleBasedReconfigurationControllerEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
			}
		}

		return result;
	}

	public static List<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor> getReconfigurableStructuredComponentCompartment_7077SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent modelElement = (de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEmbeddedComponentParts()
				.iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.component.ComponentPart childElement = (de.uni_paderborn.fujaba.muml.component.ComponentPart) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCoordinationProtocolOccurences()
				.iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.component.CoordinationProtocolOccurrence childElement = (de.uni_paderborn.fujaba.muml.component.CoordinationProtocolOccurrence) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.CoordinationProtocolOccurrenceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	public static List<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor> getRuleBasedReconfigurationController_7076SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}

		de.uni_paderborn.fujaba.muml.reconfiguration.RuleBasedReconfigurationController modelElement = (de.uni_paderborn.fujaba.muml.reconfiguration.RuleBasedReconfigurationController) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor>();
		if (modelElement.getManager() != null) {
			de.uni_paderborn.fujaba.muml.reconfiguration.Manager childElement = (de.uni_paderborn.fujaba.muml.reconfiguration.Manager) modelElement
					.getManager();
			int visualID = de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ManagerEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
			}
		}

		if (modelElement.getExecutor() != null) {
			de.uni_paderborn.fujaba.muml.reconfiguration.Executor childElement = (de.uni_paderborn.fujaba.muml.reconfiguration.Executor) modelElement
					.getExecutor();
			int visualID = de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ExecutorEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
			}
		}

		return result;
	}
	
	public static List<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor> getManager_2075SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		
		de.uni_paderborn.fujaba.muml.reconfiguration.Manager modelElement = (de.uni_paderborn.fujaba.muml.reconfiguration.Manager) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReconfigurationMessagePorts()
				.iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePort childElement = (de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePort) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}
	
	public static List<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor> getExecutor_2077SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		
		de.uni_paderborn.fujaba.muml.reconfiguration.Executor modelElement = (de.uni_paderborn.fujaba.muml.reconfiguration.Executor) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReconfigurationExecutionPorts()
				.iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPort childElement = (de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPort) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationExecutionPortEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	public static List<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlLinkDescriptor> getModelElementCategory_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	// public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater()
	// {
	// /**
	// * @generated
	// */
	// @Override
	// public
	// List<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor>
	// getSemanticChildren(
	// View view) {
	// return ReconfigurationDiagramUpdater.getSemanticChildren(view);
	// }
	//
	// /**
	// * @generated
	// */
	// @Override
	// public
	// List<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlLinkDescriptor>
	// getContainedLinks(
	// View view) {
	// return ReconfigurationDiagramUpdater.getContainedLinks(view);
	// }
	//
	// /**
	// * @generated
	// */
	// @Override
	// public
	// List<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlLinkDescriptor>
	// getIncomingLinks(
	// View view) {
	// return ReconfigurationDiagramUpdater.getIncomingLinks(view);
	// }
	//
	// /**
	// * @generated
	// */
	// @Override
	// public
	// List<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlLinkDescriptor>
	// getOutgoingLinks(
	// View view) {
	// return ReconfigurationDiagramUpdater.getOutgoingLinks(view);
	// }
	// };

}
