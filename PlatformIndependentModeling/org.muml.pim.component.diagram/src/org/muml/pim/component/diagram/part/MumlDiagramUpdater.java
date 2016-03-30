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
import org.muml.core.ExtendableElement;

/**
 * @generated
 */
public class MumlDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlNodeDescriptor> getSemanticChildren(
			View view) {
		switch (org.muml.pim.component.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case org.muml.pim.component.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000SemanticChildren(view);
		case org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentEditPart.VISUAL_ID:
			return getStaticAtomicComponent_2006SemanticChildren(view);
		case org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID:
			return getStaticStructuredComponent_2005SemanticChildren(view);
		case org.muml.pim.component.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
			return getComponentPart_3012SemanticChildren(view);
		case org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentComponentCompartmentEditPart.VISUAL_ID:
			return getStaticStructuredComponentComponentCompartment_7005SemanticChildren(view);
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
		for (Iterator<?> it = modelElement.getModelElements().iterator(); it.hasNext();) {
			ExtendableElement childElement = (ExtendableElement) it.next();
			int visualID = org.muml.pim.component.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlNodeDescriptor> getStaticAtomicComponent_2006SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pim.component.StaticAtomicComponent modelElement = (org.muml.pim.component.StaticAtomicComponent) view
				.getElement();
		LinkedList<org.muml.pim.component.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			org.muml.pim.component.Port childElement = (org.muml.pim.component.Port) it
					.next();
			int visualID = org.muml.pim.component.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == org.muml.pim.component.diagram.edit.parts.HybridPortEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlNodeDescriptor> getStaticStructuredComponent_2005SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pim.component.StaticStructuredComponent modelElement = (org.muml.pim.component.StaticStructuredComponent) view
				.getElement();
		LinkedList<org.muml.pim.component.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			org.muml.pim.component.Port childElement = (org.muml.pim.component.Port) it
					.next();
			int visualID = org.muml.pim.component.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlNodeDescriptor> getComponentPart_3012SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pim.component.ComponentPart modelElement = (org.muml.pim.component.ComponentPart) view
				.getElement();
		LinkedList<org.muml.pim.component.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortParts().iterator(); it.hasNext();) {
			org.muml.pim.component.PortPart childElement = (org.muml.pim.component.PortPart) it
					.next();
			int visualID = org.muml.pim.component.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.component.diagram.edit.parts.PortPartEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlNodeDescriptor> getStaticStructuredComponentComponentCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pim.component.StaticStructuredComponent modelElement = (org.muml.pim.component.StaticStructuredComponent) containerView
				.getElement();
		LinkedList<org.muml.pim.component.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEmbeddedComponentParts().iterator(); it.hasNext();) {
			org.muml.pim.component.ComponentPart childElement = (org.muml.pim.component.ComponentPart) it
					.next();
			int visualID = org.muml.pim.component.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.component.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCoordinationProtocolParts().iterator(); it.hasNext();) {
			org.muml.pim.component.CoordinationProtocolPart childElement = (org.muml.pim.component.CoordinationProtocolPart) it
					.next();
			int visualID = org.muml.pim.component.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.component.diagram.edit.parts.CoordinationProtocolPartEditPart.VISUAL_ID) {
				result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getContainedLinks(
			View view) {
		switch (org.muml.pim.component.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case org.muml.pim.component.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000ContainedLinks(view);
		case org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentEditPart.VISUAL_ID:
			return getStaticAtomicComponent_2006ContainedLinks(view);
		case org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID:
			return getStaticStructuredComponent_2005ContainedLinks(view);
		case org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
			return getDiscretePort_3010ContainedLinks(view);
		case org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
			return getContinuousPort_3011ContainedLinks(view);
		case org.muml.pim.component.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
			return getHybridPort_3013ContainedLinks(view);
		case org.muml.pim.component.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
			return getComponentPart_3012ContainedLinks(view);
		case org.muml.pim.component.diagram.edit.parts.PortPartEditPart.VISUAL_ID:
			return getPortPart_3022ContainedLinks(view);
		case org.muml.pim.component.diagram.edit.parts.CoordinationProtocolPartEditPart.VISUAL_ID:
			return getCoordinationProtocolPart_3016ContainedLinks(view);
		case org.muml.pim.component.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID:
			return getAssemblyConnector_4001ContainedLinks(view);
		case org.muml.pim.component.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID:
			return getDelegationConnector_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getIncomingLinks(
			View view) {
		switch (org.muml.pim.component.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentEditPart.VISUAL_ID:
			return getStaticAtomicComponent_2006IncomingLinks(view);
		case org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID:
			return getStaticStructuredComponent_2005IncomingLinks(view);
		case org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
			return getDiscretePort_3010IncomingLinks(view);
		case org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
			return getContinuousPort_3011IncomingLinks(view);
		case org.muml.pim.component.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
			return getHybridPort_3013IncomingLinks(view);
		case org.muml.pim.component.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
			return getComponentPart_3012IncomingLinks(view);
		case org.muml.pim.component.diagram.edit.parts.PortPartEditPart.VISUAL_ID:
			return getPortPart_3022IncomingLinks(view);
		case org.muml.pim.component.diagram.edit.parts.CoordinationProtocolPartEditPart.VISUAL_ID:
			return getCoordinationProtocolPart_3016IncomingLinks(view);
		case org.muml.pim.component.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID:
			return getAssemblyConnector_4001IncomingLinks(view);
		case org.muml.pim.component.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID:
			return getDelegationConnector_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (org.muml.pim.component.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentEditPart.VISUAL_ID:
			return getStaticAtomicComponent_2006OutgoingLinks(view);
		case org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID:
			return getStaticStructuredComponent_2005OutgoingLinks(view);
		case org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
			return getDiscretePort_3010OutgoingLinks(view);
		case org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
			return getContinuousPort_3011OutgoingLinks(view);
		case org.muml.pim.component.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
			return getHybridPort_3013OutgoingLinks(view);
		case org.muml.pim.component.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
			return getComponentPart_3012OutgoingLinks(view);
		case org.muml.pim.component.diagram.edit.parts.PortPartEditPart.VISUAL_ID:
			return getPortPart_3022OutgoingLinks(view);
		case org.muml.pim.component.diagram.edit.parts.CoordinationProtocolPartEditPart.VISUAL_ID:
			return getCoordinationProtocolPart_3016OutgoingLinks(view);
		case org.muml.pim.component.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID:
			return getAssemblyConnector_4001OutgoingLinks(view);
		case org.muml.pim.component.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID:
			return getDelegationConnector_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getModelElementCategory_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getStaticAtomicComponent_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getStaticStructuredComponent_2005ContainedLinks(
			View view) {
		org.muml.pim.component.StaticStructuredComponent modelElement = (org.muml.pim.component.StaticStructuredComponent) view
				.getElement();
		LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AssemblyConnector_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DelegationConnector_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getDiscretePort_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getContinuousPort_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getHybridPort_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getComponentPart_3012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getPortPart_3022ContainedLinks(
			View view) {
		org.muml.pim.component.PortPart modelElement = (org.muml.pim.component.PortPart) view
				.getElement();
		LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PortPart_CoordinationProtocolPart_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getCoordinationProtocolPart_3016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getAssemblyConnector_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getDelegationConnector_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getStaticAtomicComponent_2006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getStaticStructuredComponent_2005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getDiscretePort_3010IncomingLinks(
			View view) {
		org.muml.pim.component.DiscretePort modelElement = (org.muml.pim.component.DiscretePort) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnector_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnector_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getContinuousPort_3011IncomingLinks(
			View view) {
		org.muml.pim.component.ContinuousPort modelElement = (org.muml.pim.component.ContinuousPort) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnector_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnector_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getHybridPort_3013IncomingLinks(
			View view) {
		org.muml.pim.component.HybridPort modelElement = (org.muml.pim.component.HybridPort) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnector_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnector_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getComponentPart_3012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getPortPart_3022IncomingLinks(
			View view) {
		org.muml.pim.component.PortPart modelElement = (org.muml.pim.component.PortPart) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnector_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnector_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getCoordinationProtocolPart_3016IncomingLinks(
			View view) {
		org.muml.pim.component.CoordinationProtocolPart modelElement = (org.muml.pim.component.CoordinationProtocolPart) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PortPart_CoordinationProtocolPart_4004(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getAssemblyConnector_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getDelegationConnector_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getStaticAtomicComponent_2006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getStaticStructuredComponent_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getDiscretePort_3010OutgoingLinks(
			View view) {
		org.muml.pim.component.DiscretePort modelElement = (org.muml.pim.component.DiscretePort) view
				.getElement();
		LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnector_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnector_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getContinuousPort_3011OutgoingLinks(
			View view) {
		org.muml.pim.component.ContinuousPort modelElement = (org.muml.pim.component.ContinuousPort) view
				.getElement();
		LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnector_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnector_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getHybridPort_3013OutgoingLinks(
			View view) {
		org.muml.pim.component.HybridPort modelElement = (org.muml.pim.component.HybridPort) view
				.getElement();
		LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnector_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnector_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getComponentPart_3012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getPortPart_3022OutgoingLinks(
			View view) {
		org.muml.pim.component.PortPart modelElement = (org.muml.pim.component.PortPart) view
				.getElement();
		LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnector_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnector_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PortPart_CoordinationProtocolPart_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getCoordinationProtocolPart_3016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getAssemblyConnector_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getDelegationConnector_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_AssemblyConnector_4001(
			org.muml.pim.component.StructuredComponent container) {
		LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links.hasNext();) {
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
			Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint dst = (org.muml.pim.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint src = (org.muml.pim.connector.ConnectorEndpoint) theSource;
			result.add(new org.muml.pim.component.diagram.part.MumlLinkDescriptor(src, dst, link,
					org.muml.pim.component.diagram.providers.MumlElementTypes.AssemblyConnector_4001,
					org.muml.pim.component.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_DelegationConnector_4002(
			org.muml.pim.component.StructuredComponent container) {
		LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links.hasNext();) {
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
			Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint dst = (org.muml.pim.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint src = (org.muml.pim.connector.ConnectorEndpoint) theSource;
			result.add(new org.muml.pim.component.diagram.part.MumlLinkDescriptor(src, dst, link,
					org.muml.pim.component.diagram.providers.MumlElementTypes.DelegationConnector_4002,
					org.muml.pim.component.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getIncomingTypeModelFacetLinks_AssemblyConnector_4001(
			org.muml.pim.connector.ConnectorEndpoint target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != org.muml.pim.connector.ConnectorPackage.eINSTANCE
					.getConnector_ConnectorEndpoints()
					|| false == setting
							.getEObject() instanceof org.muml.pim.component.AssemblyConnector) {
				continue;
			}
			org.muml.pim.component.AssemblyConnector link = (org.muml.pim.component.AssemblyConnector) setting
					.getEObject();
			if (org.muml.pim.component.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID != org.muml.pim.component.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint src = (org.muml.pim.connector.ConnectorEndpoint) theSource;
			result.add(new org.muml.pim.component.diagram.part.MumlLinkDescriptor(src, target, link,
					org.muml.pim.component.diagram.providers.MumlElementTypes.AssemblyConnector_4001,
					org.muml.pim.component.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getIncomingTypeModelFacetLinks_DelegationConnector_4002(
			org.muml.pim.connector.ConnectorEndpoint target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != org.muml.pim.connector.ConnectorPackage.eINSTANCE
					.getConnector_ConnectorEndpoints()
					|| false == setting
							.getEObject() instanceof org.muml.pim.component.DelegationConnector) {
				continue;
			}
			org.muml.pim.component.DelegationConnector link = (org.muml.pim.component.DelegationConnector) setting
					.getEObject();
			if (org.muml.pim.component.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID != org.muml.pim.component.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint src = (org.muml.pim.connector.ConnectorEndpoint) theSource;
			result.add(new org.muml.pim.component.diagram.part.MumlLinkDescriptor(src, target, link,
					org.muml.pim.component.diagram.providers.MumlElementTypes.DelegationConnector_4002,
					org.muml.pim.component.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getIncomingFeatureModelFacetLinks_PortPart_CoordinationProtocolPart_4004(
			org.muml.pim.component.CoordinationProtocolPart target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.muml.pim.component.ComponentPackage.eINSTANCE
					.getPortPart_CoordinationProtocolPart()) {
				result.add(new org.muml.pim.component.diagram.part.MumlLinkDescriptor(
						setting.getEObject(), target,
						org.muml.pim.component.diagram.providers.MumlElementTypes.PortPartCoordinationProtocolPart_4004,
						org.muml.pim.component.diagram.edit.parts.PortPartCoordinationProtocolPartEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getOutgoingTypeModelFacetLinks_AssemblyConnector_4001(
			org.muml.pim.connector.ConnectorEndpoint source) {
		org.muml.pim.component.StructuredComponent container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof org.muml.pim.component.StructuredComponent) {
				container = (org.muml.pim.component.StructuredComponent) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links.hasNext();) {
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
			Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint dst = (org.muml.pim.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint src = (org.muml.pim.connector.ConnectorEndpoint) theSource;
			if (src != source) {
				continue;
			}
			result.add(new org.muml.pim.component.diagram.part.MumlLinkDescriptor(src, dst, link,
					org.muml.pim.component.diagram.providers.MumlElementTypes.AssemblyConnector_4001,
					org.muml.pim.component.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getOutgoingTypeModelFacetLinks_DelegationConnector_4002(
			org.muml.pim.connector.ConnectorEndpoint source) {
		org.muml.pim.component.StructuredComponent container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof org.muml.pim.component.StructuredComponent) {
				container = (org.muml.pim.component.StructuredComponent) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links.hasNext();) {
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
			Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint dst = (org.muml.pim.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint src = (org.muml.pim.connector.ConnectorEndpoint) theSource;
			if (src != source) {
				continue;
			}
			result.add(new org.muml.pim.component.diagram.part.MumlLinkDescriptor(src, dst, link,
					org.muml.pim.component.diagram.providers.MumlElementTypes.DelegationConnector_4002,
					org.muml.pim.component.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getOutgoingFeatureModelFacetLinks_PortPart_CoordinationProtocolPart_4004(
			org.muml.pim.component.PortPart source) {
		LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlLinkDescriptor>();
		org.muml.pim.component.CoordinationProtocolPart destination = source
				.getCoordinationProtocolPart();
		if (destination == null) {
			return result;
		}
		result.add(new org.muml.pim.component.diagram.part.MumlLinkDescriptor(source, destination,
				org.muml.pim.component.diagram.providers.MumlElementTypes.PortPartCoordinationProtocolPart_4004,
				org.muml.pim.component.diagram.edit.parts.PortPartCoordinationProtocolPartEditPart.VISUAL_ID));
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

		public List<org.muml.pim.component.diagram.part.MumlNodeDescriptor> getSemanticChildren(
				View view) {
			return MumlDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getContainedLinks(
				View view) {
			return MumlDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getIncomingLinks(
				View view) {
			return MumlDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<org.muml.pim.component.diagram.part.MumlLinkDescriptor> getOutgoingLinks(
				View view) {
			return MumlDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
