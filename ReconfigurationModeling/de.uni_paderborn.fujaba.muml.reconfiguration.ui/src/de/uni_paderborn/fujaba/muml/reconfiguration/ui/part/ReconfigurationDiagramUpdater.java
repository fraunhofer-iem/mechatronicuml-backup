package de.uni_paderborn.fujaba.muml.reconfiguration.ui.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.core.ExtendableElement;

import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPort;

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
		case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurableAtomicComponentEditPart.VISUAL_ID:
			return getReconfigurableAtomicComponent_2078SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentEditPart.VISUAL_ID:
			return getReconfigurableStructuredComponent_2076SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentCompartmentEditPart.VISUAL_ID:
			return getReconfigurableStructuredComponentCompartment_7077SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.RuleBasedReconfigurationControllerEditPart.VISUAL_ID:
			return getRuleBasedReconfigurationController_7076SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ManagerEditPart.VISUAL_ID:
			return getManager_2075SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.FadingComponentEditPart.VISUAL_ID:
			return getFadingComponent_2079SemanticChildren(view);
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
			if (visualID == de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticAtomicComponentEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			
			if (visualID == de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			
			if (visualID == de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurableAtomicComponentEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			
			if (visualID == de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentCompartmentEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			
			if (visualID == de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.FadingComponentEditPart.VISUAL_ID) {
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
			if (visualID == de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.BroadcastPortEditPart.VISUAL_ID) {
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

	
	public static List<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor> getReconfigurableAtomicComponent_2078SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableAtomicComponent modelElement = (de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableAtomicComponent) view
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
			if (visualID == de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.HybridPortEditPart.VISUAL_ID) {
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
			if (visualID == de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.BroadcastPortEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
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
		for (Iterator<?> it = modelElement.getCoordinationProtocolParts()
				.iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.component.CoordinationProtocolPart childElement = (de.uni_paderborn.fujaba.muml.component.CoordinationProtocolPart) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.CoordinationProtocolPartEditPart.VISUAL_ID) {
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
		for (ReconfigurationPort curPort : modelElement.getPorts()) {

			if (de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
					.getReconfigurationMessagePort().isSuperTypeOf(
							curPort.eClass())) {
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePort childElement = (de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePort) curPort;
				int visualID = de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
						.getNodeVisualID(view, childElement);
				if (visualID == de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart.VISUAL_ID) {
					result.add(new de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor(
							childElement, visualID));
					continue;
				}
			}
			if (de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
					.getInternalReconfigurationCommunicationPort()
					.isSuperTypeOf(curPort.eClass())) {
				de.uni_paderborn.fujaba.muml.reconfiguration.InternalReconfigurationCommunicationPort childElement = (de.uni_paderborn.fujaba.muml.reconfiguration.InternalReconfigurationCommunicationPort) curPort;
				int visualID = de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
						.getNodeVisualID(view, childElement);
				if (visualID == de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.InternalReconfigurationCommunicationPortEditPart.VISUAL_ID) {
					result.add(new de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor(
							childElement, visualID));
					continue;
				}
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
		for (ReconfigurationPort curPort : modelElement.getPorts()) {

			if (de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
					.getReconfigurationExecutionPort().isSuperTypeOf(
							curPort.eClass())) {
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPort childElement = (de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPort) curPort;
				int visualID = de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
						.getNodeVisualID(view, childElement);
				if (visualID == de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationExecutionPortEditPart.VISUAL_ID) {
					result.add(new de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor(
							childElement, visualID));
					continue;
				}
			}
			if (de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
					.getInternalReconfigurationCommunicationPort()
					.isSuperTypeOf(curPort.eClass())) {
				de.uni_paderborn.fujaba.muml.reconfiguration.InternalReconfigurationCommunicationPort childElement = (de.uni_paderborn.fujaba.muml.reconfiguration.InternalReconfigurationCommunicationPort) curPort;
				int visualID = de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
						.getNodeVisualID(view, childElement);
				if (visualID == de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.InternalReconfigurationCommunicationPortEditPart.VISUAL_ID) {
					result.add(new de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor(
							childElement, visualID));
					continue;
				}
			}
		}

		return result;
	}

	public static List<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor> getFadingComponent_2079SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}

		de.uni_paderborn.fujaba.muml.reconfiguration.FadingComponent modelElement = (de.uni_paderborn.fujaba.muml.reconfiguration.FadingComponent) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.component.Port childElement = (de.uni_paderborn.fujaba.muml.component.Port) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getNodeVisualID(view, childElement);
			
			if (visualID == de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID) {
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

	public static List<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlLinkDescriptor> getReconfigurableStructuredComponent_2076ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent modelElement = (de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ReconfigurationPortAssemblyConnector_4075(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ReconfigurationPortDelegationConnector_4076(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_AssemblyConnector_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DelegationConnector_4002(modelElement));
		return result;
	}
	
	
	

	private static Collection<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_DelegationConnector_4002(
			de.uni_paderborn.fujaba.muml.component.StructuredComponent container) {
		LinkedList<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.component.DelegationConnector) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.component.DelegationConnector link = (de.uni_paderborn.fujaba.muml.component.DelegationConnector) linkObject;
			if (de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG
														// #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint dst = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted
																			// for
																			// MUML-BUG
																			// #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.component.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes.DelegationConnector_4002,
					de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	private static Collection<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_AssemblyConnector_4001(
			de.uni_paderborn.fujaba.muml.component.StructuredComponent container) {
		LinkedList<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.component.AssemblyConnector) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.component.AssemblyConnector link = (de.uni_paderborn.fujaba.muml.component.AssemblyConnector) linkObject;
			if (de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG
														// #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint dst = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted
																			// for
																			// MUML-BUG
																			// #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.component.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes.AssemblyConnector_4001,
					de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	private static Collection<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_ReconfigurationPortAssemblyConnector_4075(
			de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent container) {
		LinkedList<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortAssemblyConnector) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortAssemblyConnector link = (de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortAssemblyConnector) linkObject;
			if (de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationPortAssemblyConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG
														// #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint dst = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted
																			// for
																			// MUML-BUG
																			// #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.component.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.reconfiguration.ui.providers.ReconfigurationElementTypes.ReconfigurationPortAssemblyConnector_4075,
					de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationPortAssemblyConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	private static Collection<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_ReconfigurationPortDelegationConnector_4076(
			de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent container) {
		LinkedList<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortDelegationConnector) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortDelegationConnector link = (de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortDelegationConnector) linkObject;
			if (de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationPortDelegationConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG
														// #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint dst = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted
																			// for
																			// MUML-BUG
																			// #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.component.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.reconfiguration.ui.providers.ReconfigurationElementTypes.ReconfigurationPortDelegationConnector_4076,
					de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationPortDelegationConnectorEditPart.VISUAL_ID));
		}
		return result;
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
