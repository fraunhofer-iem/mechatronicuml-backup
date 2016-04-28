/*
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.pim.component.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.muml.mumlcore.ExtendableElement;
import org.muml.mumlcore.modelinstance.ModelElementCategory;
import org.muml.pim.component.AssemblyConnector;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.component.ComponentPart;
import org.muml.pim.component.ContinuousPort;
import org.muml.pim.component.CoordinationProtocolPart;
import org.muml.pim.component.DelegationConnector;
import org.muml.pim.component.DiscretePort;
import org.muml.pim.component.HybridPort;
import org.muml.pim.component.Port;
import org.muml.pim.component.PortPart;
import org.muml.pim.component.StaticAtomicComponent;
import org.muml.pim.component.StaticStructuredComponent;
import org.muml.pim.component.StructuredComponent;
import org.muml.pim.component.diagram.edit.parts.AssemblyConnectorEditPart;
import org.muml.pim.component.diagram.edit.parts.ComponentPartEditPart;
import org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart;
import org.muml.pim.component.diagram.edit.parts.CoordinationProtocolPartEditPart;
import org.muml.pim.component.diagram.edit.parts.DelegationConnectorEditPart;
import org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart;
import org.muml.pim.component.diagram.edit.parts.HybridPortEditPart;
import org.muml.pim.component.diagram.edit.parts.ModelElementCategoryEditPart;
import org.muml.pim.component.diagram.edit.parts.PortPartCoordinationProtocolPartEditPart;
import org.muml.pim.component.diagram.edit.parts.PortPartEditPart;
import org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentEditPart;
import org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentComponentCompartmentEditPart;
import org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentEditPart;
import org.muml.pim.component.diagram.providers.MumlElementTypes;
import org.muml.pim.connector.ConnectorEndpoint;
import org.muml.pim.connector.ConnectorPackage;

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
		case StaticAtomicComponentEditPart.VISUAL_ID:
			return getStaticAtomicComponent_2006SemanticChildren(view);
		case StaticStructuredComponentEditPart.VISUAL_ID:
			return getStaticStructuredComponent_2005SemanticChildren(view);
		case ComponentPartEditPart.VISUAL_ID:
			return getComponentPart_3012SemanticChildren(view);
		case StaticStructuredComponentComponentCompartmentEditPart.VISUAL_ID:
			return getStaticStructuredComponentComponentCompartment_7005SemanticChildren(view);
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
			if (visualID == StaticAtomicComponentEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StaticStructuredComponentEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getStaticAtomicComponent_2006SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		StaticAtomicComponent modelElement = (StaticAtomicComponent) view.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			Port childElement = (Port) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DiscretePortEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContinuousPortEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == HybridPortEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getStaticStructuredComponent_2005SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		StaticStructuredComponent modelElement = (StaticStructuredComponent) view.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			Port childElement = (Port) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DiscretePortEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContinuousPortEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getComponentPart_3012SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ComponentPart modelElement = (ComponentPart) view.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortParts().iterator(); it.hasNext();) {
			PortPart childElement = (PortPart) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PortPartEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getStaticStructuredComponentComponentCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		StaticStructuredComponent modelElement = (StaticStructuredComponent) containerView.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEmbeddedComponentParts().iterator(); it.hasNext();) {
			ComponentPart childElement = (ComponentPart) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ComponentPartEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCoordinationProtocolParts().iterator(); it.hasNext();) {
			CoordinationProtocolPart childElement = (CoordinationProtocolPart) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CoordinationProtocolPartEditPart.VISUAL_ID) {
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
		case StaticAtomicComponentEditPart.VISUAL_ID:
			return getStaticAtomicComponent_2006ContainedLinks(view);
		case StaticStructuredComponentEditPart.VISUAL_ID:
			return getStaticStructuredComponent_2005ContainedLinks(view);
		case DiscretePortEditPart.VISUAL_ID:
			return getDiscretePort_3010ContainedLinks(view);
		case ContinuousPortEditPart.VISUAL_ID:
			return getContinuousPort_3011ContainedLinks(view);
		case HybridPortEditPart.VISUAL_ID:
			return getHybridPort_3013ContainedLinks(view);
		case ComponentPartEditPart.VISUAL_ID:
			return getComponentPart_3012ContainedLinks(view);
		case PortPartEditPart.VISUAL_ID:
			return getPortPart_3022ContainedLinks(view);
		case CoordinationProtocolPartEditPart.VISUAL_ID:
			return getCoordinationProtocolPart_3016ContainedLinks(view);
		case AssemblyConnectorEditPart.VISUAL_ID:
			return getAssemblyConnector_4001ContainedLinks(view);
		case DelegationConnectorEditPart.VISUAL_ID:
			return getDelegationConnector_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getIncomingLinks(View view) {
		switch (MumlVisualIDRegistry.getVisualID(view)) {
		case StaticAtomicComponentEditPart.VISUAL_ID:
			return getStaticAtomicComponent_2006IncomingLinks(view);
		case StaticStructuredComponentEditPart.VISUAL_ID:
			return getStaticStructuredComponent_2005IncomingLinks(view);
		case DiscretePortEditPart.VISUAL_ID:
			return getDiscretePort_3010IncomingLinks(view);
		case ContinuousPortEditPart.VISUAL_ID:
			return getContinuousPort_3011IncomingLinks(view);
		case HybridPortEditPart.VISUAL_ID:
			return getHybridPort_3013IncomingLinks(view);
		case ComponentPartEditPart.VISUAL_ID:
			return getComponentPart_3012IncomingLinks(view);
		case PortPartEditPart.VISUAL_ID:
			return getPortPart_3022IncomingLinks(view);
		case CoordinationProtocolPartEditPart.VISUAL_ID:
			return getCoordinationProtocolPart_3016IncomingLinks(view);
		case AssemblyConnectorEditPart.VISUAL_ID:
			return getAssemblyConnector_4001IncomingLinks(view);
		case DelegationConnectorEditPart.VISUAL_ID:
			return getDelegationConnector_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getOutgoingLinks(View view) {
		switch (MumlVisualIDRegistry.getVisualID(view)) {
		case StaticAtomicComponentEditPart.VISUAL_ID:
			return getStaticAtomicComponent_2006OutgoingLinks(view);
		case StaticStructuredComponentEditPart.VISUAL_ID:
			return getStaticStructuredComponent_2005OutgoingLinks(view);
		case DiscretePortEditPart.VISUAL_ID:
			return getDiscretePort_3010OutgoingLinks(view);
		case ContinuousPortEditPart.VISUAL_ID:
			return getContinuousPort_3011OutgoingLinks(view);
		case HybridPortEditPart.VISUAL_ID:
			return getHybridPort_3013OutgoingLinks(view);
		case ComponentPartEditPart.VISUAL_ID:
			return getComponentPart_3012OutgoingLinks(view);
		case PortPartEditPart.VISUAL_ID:
			return getPortPart_3022OutgoingLinks(view);
		case CoordinationProtocolPartEditPart.VISUAL_ID:
			return getCoordinationProtocolPart_3016OutgoingLinks(view);
		case AssemblyConnectorEditPart.VISUAL_ID:
			return getAssemblyConnector_4001OutgoingLinks(view);
		case DelegationConnectorEditPart.VISUAL_ID:
			return getDelegationConnector_4002OutgoingLinks(view);
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
	public static List<MumlLinkDescriptor> getStaticAtomicComponent_2006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getStaticStructuredComponent_2005ContainedLinks(View view) {
		StaticStructuredComponent modelElement = (StaticStructuredComponent) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AssemblyConnector_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DelegationConnector_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getDiscretePort_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getContinuousPort_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getHybridPort_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getComponentPart_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getPortPart_3022ContainedLinks(View view) {
		PortPart modelElement = (PortPart) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PortPart_CoordinationProtocolPart_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getCoordinationProtocolPart_3016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getAssemblyConnector_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getDelegationConnector_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getStaticAtomicComponent_2006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getStaticStructuredComponent_2005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getDiscretePort_3010IncomingLinks(View view) {
		DiscretePort modelElement = (DiscretePort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnector_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnector_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getContinuousPort_3011IncomingLinks(View view) {
		ContinuousPort modelElement = (ContinuousPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnector_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnector_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getHybridPort_3013IncomingLinks(View view) {
		HybridPort modelElement = (HybridPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnector_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnector_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getComponentPart_3012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getPortPart_3022IncomingLinks(View view) {
		PortPart modelElement = (PortPart) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnector_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnector_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getCoordinationProtocolPart_3016IncomingLinks(View view) {
		CoordinationProtocolPart modelElement = (CoordinationProtocolPart) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PortPart_CoordinationProtocolPart_4004(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getAssemblyConnector_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getDelegationConnector_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getStaticAtomicComponent_2006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getStaticStructuredComponent_2005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getDiscretePort_3010OutgoingLinks(View view) {
		DiscretePort modelElement = (DiscretePort) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnector_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnector_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getContinuousPort_3011OutgoingLinks(View view) {
		ContinuousPort modelElement = (ContinuousPort) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnector_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnector_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getHybridPort_3013OutgoingLinks(View view) {
		HybridPort modelElement = (HybridPort) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnector_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnector_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getComponentPart_3012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getPortPart_3022OutgoingLinks(View view) {
		PortPart modelElement = (PortPart) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnector_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnector_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PortPart_CoordinationProtocolPart_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getCoordinationProtocolPart_3016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getAssemblyConnector_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getDelegationConnector_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getContainedTypeModelFacetLinks_AssemblyConnector_4001(
			StructuredComponent container) {
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AssemblyConnector) {
				continue;
			}
			AssemblyConnector link = (AssemblyConnector) linkObject;
			if (AssemblyConnectorEditPart.VISUAL_ID != MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof ConnectorEndpoint) {
				continue;
			}
			ConnectorEndpoint dst = (ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof ConnectorEndpoint) {
				continue;
			}
			ConnectorEndpoint src = (ConnectorEndpoint) theSource;
			result.add(new MumlLinkDescriptor(src, dst, link, MumlElementTypes.AssemblyConnector_4001,
					AssemblyConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getContainedTypeModelFacetLinks_DelegationConnector_4002(
			StructuredComponent container) {
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DelegationConnector) {
				continue;
			}
			DelegationConnector link = (DelegationConnector) linkObject;
			if (DelegationConnectorEditPart.VISUAL_ID != MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof ConnectorEndpoint) {
				continue;
			}
			ConnectorEndpoint dst = (ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof ConnectorEndpoint) {
				continue;
			}
			ConnectorEndpoint src = (ConnectorEndpoint) theSource;
			result.add(new MumlLinkDescriptor(src, dst, link, MumlElementTypes.DelegationConnector_4002,
					DelegationConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getIncomingTypeModelFacetLinks_AssemblyConnector_4001(
			ConnectorEndpoint target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConnectorPackage.eINSTANCE.getConnector_ConnectorEndpoints()
					|| false == setting.getEObject() instanceof AssemblyConnector) {
				continue;
			}
			AssemblyConnector link = (AssemblyConnector) setting.getEObject();
			if (AssemblyConnectorEditPart.VISUAL_ID != MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof ConnectorEndpoint) {
				continue;
			}
			ConnectorEndpoint src = (ConnectorEndpoint) theSource;
			result.add(new MumlLinkDescriptor(src, target, link, MumlElementTypes.AssemblyConnector_4001,
					AssemblyConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getIncomingTypeModelFacetLinks_DelegationConnector_4002(
			ConnectorEndpoint target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConnectorPackage.eINSTANCE.getConnector_ConnectorEndpoints()
					|| false == setting.getEObject() instanceof DelegationConnector) {
				continue;
			}
			DelegationConnector link = (DelegationConnector) setting.getEObject();
			if (DelegationConnectorEditPart.VISUAL_ID != MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof ConnectorEndpoint) {
				continue;
			}
			ConnectorEndpoint src = (ConnectorEndpoint) theSource;
			result.add(new MumlLinkDescriptor(src, target, link, MumlElementTypes.DelegationConnector_4002,
					DelegationConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getIncomingFeatureModelFacetLinks_PortPart_CoordinationProtocolPart_4004(
			CoordinationProtocolPart target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ComponentPackage.eINSTANCE.getPortPart_CoordinationProtocolPart()) {
				result.add(new MumlLinkDescriptor(setting.getEObject(), target,
						MumlElementTypes.PortPartCoordinationProtocolPart_4004,
						PortPartCoordinationProtocolPartEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getOutgoingTypeModelFacetLinks_AssemblyConnector_4001(
			ConnectorEndpoint source) {
		StructuredComponent container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof StructuredComponent) {
				container = (StructuredComponent) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AssemblyConnector) {
				continue;
			}
			AssemblyConnector link = (AssemblyConnector) linkObject;
			if (AssemblyConnectorEditPart.VISUAL_ID != MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof ConnectorEndpoint) {
				continue;
			}
			ConnectorEndpoint dst = (ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof ConnectorEndpoint) {
				continue;
			}
			ConnectorEndpoint src = (ConnectorEndpoint) theSource;
			if (src != source) {
				continue;
			}
			result.add(new MumlLinkDescriptor(src, dst, link, MumlElementTypes.AssemblyConnector_4001,
					AssemblyConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getOutgoingTypeModelFacetLinks_DelegationConnector_4002(
			ConnectorEndpoint source) {
		StructuredComponent container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof StructuredComponent) {
				container = (StructuredComponent) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DelegationConnector) {
				continue;
			}
			DelegationConnector link = (DelegationConnector) linkObject;
			if (DelegationConnectorEditPart.VISUAL_ID != MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof ConnectorEndpoint) {
				continue;
			}
			ConnectorEndpoint dst = (ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof ConnectorEndpoint) {
				continue;
			}
			ConnectorEndpoint src = (ConnectorEndpoint) theSource;
			if (src != source) {
				continue;
			}
			result.add(new MumlLinkDescriptor(src, dst, link, MumlElementTypes.DelegationConnector_4002,
					DelegationConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getOutgoingFeatureModelFacetLinks_PortPart_CoordinationProtocolPart_4004(
			PortPart source) {
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		CoordinationProtocolPart destination = source.getCoordinationProtocolPart();
		if (destination == null) {
			return result;
		}
		result.add(new MumlLinkDescriptor(source, destination, MumlElementTypes.PortPartCoordinationProtocolPart_4004,
				PortPartCoordinationProtocolPartEditPart.VISUAL_ID));
		return result;
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
