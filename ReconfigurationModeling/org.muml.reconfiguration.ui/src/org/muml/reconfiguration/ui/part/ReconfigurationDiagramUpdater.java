package org.muml.reconfiguration.ui.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.core.ExtendableElement;
import org.muml.reconfiguration.ReconfigurationPort;

/**
 * @generated
 */
public class ReconfigurationDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlNodeDescriptor> getSemanticChildren(
			View view) {
		switch (org.muml.pim.component.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case org.muml.pim.component.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000SemanticChildren(view);
		case org.muml.reconfiguration.ui.edit.parts.ReconfigurableAtomicComponentEditPart.VISUAL_ID:
			return getReconfigurableAtomicComponent_2078SemanticChildren(view);
		case org.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentEditPart.VISUAL_ID:
			return getReconfigurableStructuredComponent_2076SemanticChildren(view);
		case org.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentCompartmentEditPart.VISUAL_ID:
			return getReconfigurableStructuredComponentCompartment_7077SemanticChildren(view);
		case org.muml.reconfiguration.ui.edit.parts.RuleBasedReconfigurationControllerEditPart.VISUAL_ID:
			return getRuleBasedReconfigurationController_7076SemanticChildren(view);
		case org.muml.reconfiguration.ui.edit.parts.ManagerEditPart.VISUAL_ID:
			return getManager_2075SemanticChildren(view);
		case org.muml.reconfiguration.ui.edit.parts.FadingComponentEditPart.VISUAL_ID:
			return getFadingComponent_2079SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlNodeDescriptor> getModelElementCategory_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();

		}
		org.muml.core.modelinstance.ModelElementCategory modelElement = (org.muml.core.modelinstance.ModelElementCategory) view
				.getElement();
		LinkedList<org.muml.pim.component.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getModelElements().iterator(); it
				.hasNext();) {
			ExtendableElement childElement = (ExtendableElement) it.next();
			int visualID = org.muml.pim.component.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			
			if (visualID == org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			
			if (visualID == org.muml.reconfiguration.ui.edit.parts.ReconfigurableAtomicComponentEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			
			if (visualID == org.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentCompartmentEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			
			if (visualID == org.muml.reconfiguration.ui.edit.parts.FadingComponentEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			
		}

		return result;
	}

	public static List<org.muml.pim.component.diagram.part.MumlNodeDescriptor> getReconfigurableStructuredComponent_2076SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.reconfiguration.ReconfigurableStructuredComponent modelElement = (org.muml.reconfiguration.ReconfigurableStructuredComponent) view
				.getElement();
		LinkedList<org.muml.pim.component.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			org.muml.pim.component.Port childElement = (org.muml.pim.component.Port) it
					.next();
			int visualID = org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == org.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == org.muml.reconfiguration.ui.edit.parts.ReconfigurationExecutionPortEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == org.muml.reconfiguration.ui.edit.parts.BroadcastPortEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}

		}
		if (modelElement.getController() != null) {
			org.muml.reconfiguration.Controller childElement = (org.muml.reconfiguration.Controller) modelElement
					.getController();
			int visualID = org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.reconfiguration.ui.edit.parts.RuleBasedReconfigurationControllerEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
			}
		}

		return result;
	}

	
	public static List<org.muml.pim.component.diagram.part.MumlNodeDescriptor> getReconfigurableAtomicComponent_2078SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.reconfiguration.ReconfigurableAtomicComponent modelElement = (org.muml.reconfiguration.ReconfigurableAtomicComponent) view
				.getElement();
		LinkedList<org.muml.pim.component.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			org.muml.pim.component.Port childElement = (org.muml.pim.component.Port) it
					.next();
			int visualID = org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == org.muml.pim.component.diagram.edit.parts.HybridPortEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == org.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == org.muml.reconfiguration.ui.edit.parts.ReconfigurationExecutionPortEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == org.muml.reconfiguration.ui.edit.parts.BroadcastPortEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			

		}


		return result;
	}
	
	
	public static List<org.muml.pim.component.diagram.part.MumlNodeDescriptor> getReconfigurableStructuredComponentCompartment_7077SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.reconfiguration.ReconfigurableStructuredComponent modelElement = (org.muml.reconfiguration.ReconfigurableStructuredComponent) containerView
				.getElement();
		LinkedList<org.muml.pim.component.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEmbeddedComponentParts()
				.iterator(); it.hasNext();) {
			org.muml.pim.component.ComponentPart childElement = (org.muml.pim.component.ComponentPart) it
					.next();
			int visualID = org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.component.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCoordinationProtocolParts()
				.iterator(); it.hasNext();) {
			org.muml.pim.component.CoordinationProtocolPart childElement = (org.muml.pim.component.CoordinationProtocolPart) it
					.next();
			int visualID = org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.component.diagram.edit.parts.CoordinationProtocolPartEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	public static List<org.muml.pim.component.diagram.part.MumlNodeDescriptor> getRuleBasedReconfigurationController_7076SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}

		org.muml.reconfiguration.RuleBasedReconfigurationController modelElement = (org.muml.reconfiguration.RuleBasedReconfigurationController) view
				.getElement();
		LinkedList<org.muml.pim.component.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlNodeDescriptor>();
		if (modelElement.getManager() != null) {
			org.muml.reconfiguration.Manager childElement = (org.muml.reconfiguration.Manager) modelElement
					.getManager();
			int visualID = org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.reconfiguration.ui.edit.parts.ManagerEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
			}
		}

		if (modelElement.getExecutor() != null) {
			org.muml.reconfiguration.Executor childElement = (org.muml.reconfiguration.Executor) modelElement
					.getExecutor();
			int visualID = org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.reconfiguration.ui.edit.parts.ExecutorEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
			}
		}

		return result;
	}

	public static List<org.muml.pim.component.diagram.part.MumlNodeDescriptor> getManager_2075SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}

		org.muml.reconfiguration.Manager modelElement = (org.muml.reconfiguration.Manager) view
				.getElement();
		LinkedList<org.muml.pim.component.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlNodeDescriptor>();
		for (ReconfigurationPort curPort : modelElement.getPorts()) {

			if (org.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
					.getReconfigurationMessagePort().isSuperTypeOf(
							curPort.eClass())) {
				org.muml.reconfiguration.ReconfigurationMessagePort childElement = (org.muml.reconfiguration.ReconfigurationMessagePort) curPort;
				int visualID = org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
						.getNodeVisualID(view, childElement);
				if (visualID == org.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart.VISUAL_ID) {
					result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(
							childElement, visualID));
					continue;
				}
			}
			if (org.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
					.getInternalReconfigurationCommunicationPort()
					.isSuperTypeOf(curPort.eClass())) {
				org.muml.reconfiguration.InternalReconfigurationCommunicationPort childElement = (org.muml.reconfiguration.InternalReconfigurationCommunicationPort) curPort;
				int visualID = org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
						.getNodeVisualID(view, childElement);
				if (visualID == org.muml.reconfiguration.ui.edit.parts.InternalReconfigurationCommunicationPortEditPart.VISUAL_ID) {
					result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(
							childElement, visualID));
					continue;
				}
			}
		}

		return result;
	}

	public static List<org.muml.pim.component.diagram.part.MumlNodeDescriptor> getExecutor_2077SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}

		org.muml.reconfiguration.Executor modelElement = (org.muml.reconfiguration.Executor) view
				.getElement();
		LinkedList<org.muml.pim.component.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlNodeDescriptor>();
		for (ReconfigurationPort curPort : modelElement.getPorts()) {

			if (org.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
					.getReconfigurationExecutionPort().isSuperTypeOf(
							curPort.eClass())) {
				org.muml.reconfiguration.ReconfigurationExecutionPort childElement = (org.muml.reconfiguration.ReconfigurationExecutionPort) curPort;
				int visualID = org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
						.getNodeVisualID(view, childElement);
				if (visualID == org.muml.reconfiguration.ui.edit.parts.ReconfigurationExecutionPortEditPart.VISUAL_ID) {
					result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(
							childElement, visualID));
					continue;
				}
			}
			if (org.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
					.getInternalReconfigurationCommunicationPort()
					.isSuperTypeOf(curPort.eClass())) {
				org.muml.reconfiguration.InternalReconfigurationCommunicationPort childElement = (org.muml.reconfiguration.InternalReconfigurationCommunicationPort) curPort;
				int visualID = org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
						.getNodeVisualID(view, childElement);
				if (visualID == org.muml.reconfiguration.ui.edit.parts.InternalReconfigurationCommunicationPortEditPart.VISUAL_ID) {
					result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(
							childElement, visualID));
					continue;
				}
			}
		}

		return result;
	}

	public static List<org.muml.pim.component.diagram.part.MumlNodeDescriptor> getFadingComponent_2079SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}

		org.muml.reconfiguration.FadingComponent modelElement = (org.muml.reconfiguration.FadingComponent) view
				.getElement();
		LinkedList<org.muml.pim.component.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			org.muml.pim.component.Port childElement = (org.muml.pim.component.Port) it
					.next();
			int visualID = org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getNodeVisualID(view, childElement);
			
			if (visualID == org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}
	
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getModelElementCategory_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getReconfigurableStructuredComponent_2076ContainedLinks(
			View view) {
		org.muml.reconfiguration.ReconfigurableStructuredComponent modelElement = (org.muml.reconfiguration.ReconfigurableStructuredComponent) view
				.getElement();
		LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ReconfigurationPortAssemblyConnector_4075(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ReconfigurationPortDelegationConnector_4076(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_AssemblyConnector_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DelegationConnector_4002(modelElement));
		return result;
	}
	
	
	

	private static Collection<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_DelegationConnector_4002(
			org.muml.pim.component.StructuredComponent container) {
		LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof org.muml.pim.component.DelegationConnector) {
				continue;
			}
			org.muml.pim.component.DelegationConnector link = (org.muml.pim.component.DelegationConnector) linkObject;
			if (org.muml.pim.component.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID != org.muml.pim.component.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG
														// #446
			if (false == theTarget instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint dst = (org.muml.pim.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted
																			// for
																			// MUML-BUG
																			// #446
			if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint src = (org.muml.pim.connector.ConnectorEndpoint) theSource;
			result.add(new org.muml.pim.component.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					org.muml.pim.component.diagram.providers.MumlElementTypes.DelegationConnector_4002,
					org.muml.pim.component.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	private static Collection<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_AssemblyConnector_4001(
			org.muml.pim.component.StructuredComponent container) {
		LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof org.muml.pim.component.AssemblyConnector) {
				continue;
			}
			org.muml.pim.component.AssemblyConnector link = (org.muml.pim.component.AssemblyConnector) linkObject;
			if (org.muml.pim.component.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID != org.muml.pim.component.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG
														// #446
			if (false == theTarget instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint dst = (org.muml.pim.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted
																			// for
																			// MUML-BUG
																			// #446
			if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint src = (org.muml.pim.connector.ConnectorEndpoint) theSource;
			result.add(new org.muml.pim.component.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					org.muml.pim.component.diagram.providers.MumlElementTypes.AssemblyConnector_4001,
					org.muml.pim.component.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	private static Collection<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_ReconfigurationPortAssemblyConnector_4075(
			org.muml.reconfiguration.ReconfigurableStructuredComponent container) {
		LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof org.muml.reconfiguration.ReconfigurationPortAssemblyConnector) {
				continue;
			}
			org.muml.reconfiguration.ReconfigurationPortAssemblyConnector link = (org.muml.reconfiguration.ReconfigurationPortAssemblyConnector) linkObject;
			if (org.muml.reconfiguration.ui.edit.parts.ReconfigurationPortAssemblyConnectorEditPart.VISUAL_ID != org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG
														// #446
			if (false == theTarget instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint dst = (org.muml.pim.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted
																			// for
																			// MUML-BUG
																			// #446
			if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint src = (org.muml.pim.connector.ConnectorEndpoint) theSource;
			result.add(new org.muml.pim.component.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					org.muml.reconfiguration.ui.providers.ReconfigurationElementTypes.ReconfigurationPortAssemblyConnector_4075,
					org.muml.reconfiguration.ui.edit.parts.ReconfigurationPortAssemblyConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	private static Collection<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_ReconfigurationPortDelegationConnector_4076(
			org.muml.reconfiguration.ReconfigurableStructuredComponent container) {
		LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof org.muml.reconfiguration.ReconfigurationPortDelegationConnector) {
				continue;
			}
			org.muml.reconfiguration.ReconfigurationPortDelegationConnector link = (org.muml.reconfiguration.ReconfigurationPortDelegationConnector) linkObject;
			if (org.muml.reconfiguration.ui.edit.parts.ReconfigurationPortDelegationConnectorEditPart.VISUAL_ID != org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG
														// #446
			if (false == theTarget instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint dst = (org.muml.pim.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted
																			// for
																			// MUML-BUG
																			// #446
			if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint src = (org.muml.pim.connector.ConnectorEndpoint) theSource;
			result.add(new org.muml.pim.component.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					org.muml.reconfiguration.ui.providers.ReconfigurationElementTypes.ReconfigurationPortDelegationConnector_4076,
					org.muml.reconfiguration.ui.edit.parts.ReconfigurationPortDelegationConnectorEditPart.VISUAL_ID));
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
