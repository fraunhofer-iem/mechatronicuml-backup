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
package org.muml.pim.componentinstanceconfiguration.diagram.part;

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
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartmentEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstancePortInstancesEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceComponentInstanceContentsCompartment2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes;
import org.muml.pim.connector.ConnectorEndpointInstance;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance;
import org.muml.pim.instance.AssemblyConnectorInstance;
import org.muml.pim.instance.AtomicComponentInstance;
import org.muml.pim.instance.ComponentInstance;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pim.instance.ContinuousPortInstance;
import org.muml.pim.instance.CoordinationProtocolInstance;
import org.muml.pim.instance.DelegationConnectorInstance;
import org.muml.pim.instance.DiscreteMultiPortInstance;
import org.muml.pim.instance.DiscreteSinglePortInstance;
import org.muml.pim.instance.HybridPortInstance;
import org.muml.pim.instance.InstancePackage;
import org.muml.pim.instance.PortInstance;
import org.muml.pim.instance.StructuredComponentInstance;

/**
 * @generated
 */
public class MumlDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getSemanticChildren(View view) {
		switch (MumlVisualIDRegistry.getVisualID(view)) {
		case ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_1000SemanticChildren(view);
		case AtomicComponentInstanceEditPart.VISUAL_ID:
			return getAtomicComponentInstance_2016SemanticChildren(view);
		case StructuredComponentInstanceEditPart.VISUAL_ID:
			return getStructuredComponentInstance_2015SemanticChildren(view);
		case AtomicComponentInstance2EditPart.VISUAL_ID:
			return getAtomicComponentInstance_3024SemanticChildren(view);
		case StructuredComponentInstance2EditPart.VISUAL_ID:
			return getStructuredComponentInstance_3025SemanticChildren(view);
		case DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart.VISUAL_ID:
			return getDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment_7017SemanticChildren(view);
		case DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment_7018SemanticChildren(view);
		case StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart.VISUAL_ID:
			return getStructuredComponentInstanceComponentInstanceContentsCompartment_7012SemanticChildren(view);
		case ComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartmentEditPart.VISUAL_ID:
			return getComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartment_7013SemanticChildren(
					view);
		case StructuredComponentInstanceComponentInstanceContentsCompartment2EditPart.VISUAL_ID:
			return getStructuredComponentInstanceComponentInstanceContentsCompartment_7014SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getComponentInstanceConfiguration_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ComponentInstanceConfiguration modelElement = (ComponentInstanceConfiguration) view.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParentPortInstances().iterator(); it.hasNext();) {
			PortInstance childElement = (PortInstance) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HybridPortInstanceEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DiscreteSinglePortInstanceEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DiscreteMultiPortInstanceEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContinuousPortInstanceEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getComponentInstances().iterator(); it.hasNext();) {
			ComponentInstance childElement = (ComponentInstance) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AtomicComponentInstanceEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StructuredComponentInstanceEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCoordinationProtocolInstances().iterator(); it.hasNext();) {
			CoordinationProtocolInstance childElement = (CoordinationProtocolInstance) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CoordinationProtocolInstanceEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getAtomicComponentInstance_2016SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		AtomicComponentInstance modelElement = (AtomicComponentInstance) view.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortInstances().iterator(); it.hasNext();) {
			PortInstance childElement = (PortInstance) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HybridPortInstance2EditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DiscreteSinglePortInstance3EditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DiscreteMultiPortInstance2EditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContinuousPortInstance2EditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getStructuredComponentInstance_2015SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		StructuredComponentInstance modelElement = (StructuredComponentInstance) view.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortInstances().iterator(); it.hasNext();) {
			PortInstance childElement = (PortInstance) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HybridPortInstance2EditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DiscreteSinglePortInstance3EditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DiscreteMultiPortInstance2EditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContinuousPortInstance2EditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getAtomicComponentInstance_3024SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		AtomicComponentInstance modelElement = (AtomicComponentInstance) view.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortInstances().iterator(); it.hasNext();) {
			PortInstance childElement = (PortInstance) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HybridPortInstance2EditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DiscreteSinglePortInstance3EditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DiscreteMultiPortInstance2EditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContinuousPortInstance2EditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getStructuredComponentInstance_3025SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		StructuredComponentInstance modelElement = (StructuredComponentInstance) view.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortInstances().iterator(); it.hasNext();) {
			PortInstance childElement = (PortInstance) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HybridPortInstance2EditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DiscreteSinglePortInstance3EditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DiscreteMultiPortInstance2EditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContinuousPortInstance2EditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment_7017SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DiscreteMultiPortInstance modelElement = (DiscreteMultiPortInstance) containerView.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGmfSubPortInstances().iterator(); it.hasNext();) {
			DiscreteSingleInteractionEndpointInstance childElement = (DiscreteSingleInteractionEndpointInstance) it
					.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DiscreteSinglePortInstance2EditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment_7018SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DiscreteMultiPortInstance modelElement = (DiscreteMultiPortInstance) containerView.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGmfSubPortInstances().iterator(); it.hasNext();) {
			DiscreteSingleInteractionEndpointInstance childElement = (DiscreteSingleInteractionEndpointInstance) it
					.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DiscreteSinglePortInstance2EditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getStructuredComponentInstanceComponentInstanceContentsCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		StructuredComponentInstance modelElement = (StructuredComponentInstance) containerView.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		{
			ComponentInstanceConfiguration childElement = modelElement.getEmbeddedCIC();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ComponentInstanceConfigurationEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ComponentInstanceConfiguration modelElement = (ComponentInstanceConfiguration) containerView.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponentInstances().iterator(); it.hasNext();) {
			ComponentInstance childElement = (ComponentInstance) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AtomicComponentInstance2EditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StructuredComponentInstance2EditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCoordinationProtocolInstances().iterator(); it.hasNext();) {
			CoordinationProtocolInstance childElement = (CoordinationProtocolInstance) it.next();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CoordinationProtocolInstance2EditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlNodeDescriptor> getStructuredComponentInstanceComponentInstanceContentsCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		StructuredComponentInstance modelElement = (StructuredComponentInstance) containerView.getElement();
		LinkedList<MumlNodeDescriptor> result = new LinkedList<MumlNodeDescriptor>();
		{
			ComponentInstanceConfiguration childElement = modelElement.getEmbeddedCIC();
			int visualID = MumlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ComponentInstanceConfigurationEditPart.VISUAL_ID) {
				result.add(new MumlNodeDescriptor(childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getContainedLinks(View view) {
		switch (MumlVisualIDRegistry.getVisualID(view)) {
		case ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_1000ContainedLinks(view);
		case HybridPortInstanceEditPart.VISUAL_ID:
			return getHybridPortInstance_2021ContainedLinks(view);
		case DiscreteSinglePortInstanceEditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_2022ContainedLinks(view);
		case DiscreteMultiPortInstanceEditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_2023ContainedLinks(view);
		case ContinuousPortInstanceEditPart.VISUAL_ID:
			return getContinuousPortInstance_2024ContainedLinks(view);
		case AtomicComponentInstanceEditPart.VISUAL_ID:
			return getAtomicComponentInstance_2016ContainedLinks(view);
		case StructuredComponentInstanceEditPart.VISUAL_ID:
			return getStructuredComponentInstance_2015ContainedLinks(view);
		case CoordinationProtocolInstanceEditPart.VISUAL_ID:
			return getCoordinationProtocolInstance_2025ContainedLinks(view);
		case DiscreteSinglePortInstance2EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3026ContainedLinks(view);
		case HybridPortInstance2EditPart.VISUAL_ID:
			return getHybridPortInstance_3031ContainedLinks(view);
		case DiscreteSinglePortInstance3EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3032ContainedLinks(view);
		case DiscreteMultiPortInstance2EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_3033ContainedLinks(view);
		case ContinuousPortInstance2EditPart.VISUAL_ID:
			return getContinuousPortInstance_3034ContainedLinks(view);
		case ComponentInstanceConfigurationEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_3023ContainedLinks(view);
		case AtomicComponentInstance2EditPart.VISUAL_ID:
			return getAtomicComponentInstance_3024ContainedLinks(view);
		case StructuredComponentInstance2EditPart.VISUAL_ID:
			return getStructuredComponentInstance_3025ContainedLinks(view);
		case CoordinationProtocolInstance2EditPart.VISUAL_ID:
			return getCoordinationProtocolInstance_3035ContainedLinks(view);
		case AssemblyConnectorInstanceEditPart.VISUAL_ID:
			return getAssemblyConnectorInstance_4001ContainedLinks(view);
		case DelegationConnectorInstanceEditPart.VISUAL_ID:
			return getDelegationConnectorInstance_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getIncomingLinks(View view) {
		switch (MumlVisualIDRegistry.getVisualID(view)) {
		case HybridPortInstanceEditPart.VISUAL_ID:
			return getHybridPortInstance_2021IncomingLinks(view);
		case DiscreteSinglePortInstanceEditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_2022IncomingLinks(view);
		case DiscreteMultiPortInstanceEditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_2023IncomingLinks(view);
		case ContinuousPortInstanceEditPart.VISUAL_ID:
			return getContinuousPortInstance_2024IncomingLinks(view);
		case AtomicComponentInstanceEditPart.VISUAL_ID:
			return getAtomicComponentInstance_2016IncomingLinks(view);
		case StructuredComponentInstanceEditPart.VISUAL_ID:
			return getStructuredComponentInstance_2015IncomingLinks(view);
		case CoordinationProtocolInstanceEditPart.VISUAL_ID:
			return getCoordinationProtocolInstance_2025IncomingLinks(view);
		case DiscreteSinglePortInstance2EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3026IncomingLinks(view);
		case HybridPortInstance2EditPart.VISUAL_ID:
			return getHybridPortInstance_3031IncomingLinks(view);
		case DiscreteSinglePortInstance3EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3032IncomingLinks(view);
		case DiscreteMultiPortInstance2EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_3033IncomingLinks(view);
		case ContinuousPortInstance2EditPart.VISUAL_ID:
			return getContinuousPortInstance_3034IncomingLinks(view);
		case ComponentInstanceConfigurationEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_3023IncomingLinks(view);
		case AtomicComponentInstance2EditPart.VISUAL_ID:
			return getAtomicComponentInstance_3024IncomingLinks(view);
		case StructuredComponentInstance2EditPart.VISUAL_ID:
			return getStructuredComponentInstance_3025IncomingLinks(view);
		case CoordinationProtocolInstance2EditPart.VISUAL_ID:
			return getCoordinationProtocolInstance_3035IncomingLinks(view);
		case AssemblyConnectorInstanceEditPart.VISUAL_ID:
			return getAssemblyConnectorInstance_4001IncomingLinks(view);
		case DelegationConnectorInstanceEditPart.VISUAL_ID:
			return getDelegationConnectorInstance_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getOutgoingLinks(View view) {
		switch (MumlVisualIDRegistry.getVisualID(view)) {
		case HybridPortInstanceEditPart.VISUAL_ID:
			return getHybridPortInstance_2021OutgoingLinks(view);
		case DiscreteSinglePortInstanceEditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_2022OutgoingLinks(view);
		case DiscreteMultiPortInstanceEditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_2023OutgoingLinks(view);
		case ContinuousPortInstanceEditPart.VISUAL_ID:
			return getContinuousPortInstance_2024OutgoingLinks(view);
		case AtomicComponentInstanceEditPart.VISUAL_ID:
			return getAtomicComponentInstance_2016OutgoingLinks(view);
		case StructuredComponentInstanceEditPart.VISUAL_ID:
			return getStructuredComponentInstance_2015OutgoingLinks(view);
		case CoordinationProtocolInstanceEditPart.VISUAL_ID:
			return getCoordinationProtocolInstance_2025OutgoingLinks(view);
		case DiscreteSinglePortInstance2EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3026OutgoingLinks(view);
		case HybridPortInstance2EditPart.VISUAL_ID:
			return getHybridPortInstance_3031OutgoingLinks(view);
		case DiscreteSinglePortInstance3EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3032OutgoingLinks(view);
		case DiscreteMultiPortInstance2EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_3033OutgoingLinks(view);
		case ContinuousPortInstance2EditPart.VISUAL_ID:
			return getContinuousPortInstance_3034OutgoingLinks(view);
		case ComponentInstanceConfigurationEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_3023OutgoingLinks(view);
		case AtomicComponentInstance2EditPart.VISUAL_ID:
			return getAtomicComponentInstance_3024OutgoingLinks(view);
		case StructuredComponentInstance2EditPart.VISUAL_ID:
			return getStructuredComponentInstance_3025OutgoingLinks(view);
		case CoordinationProtocolInstance2EditPart.VISUAL_ID:
			return getCoordinationProtocolInstance_3035OutgoingLinks(view);
		case AssemblyConnectorInstanceEditPart.VISUAL_ID:
			return getAssemblyConnectorInstance_4001OutgoingLinks(view);
		case DelegationConnectorInstanceEditPart.VISUAL_ID:
			return getDelegationConnectorInstance_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getComponentInstanceConfiguration_1000ContainedLinks(View view) {
		ComponentInstanceConfiguration modelElement = (ComponentInstanceConfiguration) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getHybridPortInstance_2021ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getDiscreteSinglePortInstance_2022ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getDiscreteMultiPortInstance_2023ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getContinuousPortInstance_2024ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getAtomicComponentInstance_2016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getStructuredComponentInstance_2015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getCoordinationProtocolInstance_2025ContainedLinks(View view) {
		CoordinationProtocolInstance modelElement = (CoordinationProtocolInstance) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getDiscreteSinglePortInstance_3026ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getHybridPortInstance_3031ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getDiscreteSinglePortInstance_3032ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getDiscreteMultiPortInstance_3033ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getContinuousPortInstance_3034ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getComponentInstanceConfiguration_3023ContainedLinks(View view) {
		ComponentInstanceConfiguration modelElement = (ComponentInstanceConfiguration) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getAtomicComponentInstance_3024ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getStructuredComponentInstance_3025ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getCoordinationProtocolInstance_3035ContainedLinks(View view) {
		CoordinationProtocolInstance modelElement = (CoordinationProtocolInstance) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getAssemblyConnectorInstance_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getDelegationConnectorInstance_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getHybridPortInstance_2021IncomingLinks(View view) {
		HybridPortInstance modelElement = (HybridPortInstance) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getDiscreteSinglePortInstance_2022IncomingLinks(View view) {
		DiscreteSinglePortInstance modelElement = (DiscreteSinglePortInstance) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getDiscreteMultiPortInstance_2023IncomingLinks(View view) {
		DiscreteMultiPortInstance modelElement = (DiscreteMultiPortInstance) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getContinuousPortInstance_2024IncomingLinks(View view) {
		ContinuousPortInstance modelElement = (ContinuousPortInstance) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getAtomicComponentInstance_2016IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getStructuredComponentInstance_2015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getCoordinationProtocolInstance_2025IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getDiscreteSinglePortInstance_3026IncomingLinks(View view) {
		DiscreteSinglePortInstance modelElement = (DiscreteSinglePortInstance) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getHybridPortInstance_3031IncomingLinks(View view) {
		HybridPortInstance modelElement = (HybridPortInstance) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getDiscreteSinglePortInstance_3032IncomingLinks(View view) {
		DiscreteSinglePortInstance modelElement = (DiscreteSinglePortInstance) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getDiscreteMultiPortInstance_3033IncomingLinks(View view) {
		DiscreteMultiPortInstance modelElement = (DiscreteMultiPortInstance) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getContinuousPortInstance_3034IncomingLinks(View view) {
		ContinuousPortInstance modelElement = (ContinuousPortInstance) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getComponentInstanceConfiguration_3023IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getAtomicComponentInstance_3024IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getStructuredComponentInstance_3025IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getCoordinationProtocolInstance_3035IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getAssemblyConnectorInstance_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getDelegationConnectorInstance_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getHybridPortInstance_2021OutgoingLinks(View view) {
		HybridPortInstance modelElement = (HybridPortInstance) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getDiscreteSinglePortInstance_2022OutgoingLinks(View view) {
		DiscreteSinglePortInstance modelElement = (DiscreteSinglePortInstance) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getDiscreteMultiPortInstance_2023OutgoingLinks(View view) {
		DiscreteMultiPortInstance modelElement = (DiscreteMultiPortInstance) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getContinuousPortInstance_2024OutgoingLinks(View view) {
		ContinuousPortInstance modelElement = (ContinuousPortInstance) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getAtomicComponentInstance_2016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getStructuredComponentInstance_2015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getCoordinationProtocolInstance_2025OutgoingLinks(View view) {
		CoordinationProtocolInstance modelElement = (CoordinationProtocolInstance) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getDiscreteSinglePortInstance_3026OutgoingLinks(View view) {
		DiscreteSinglePortInstance modelElement = (DiscreteSinglePortInstance) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getHybridPortInstance_3031OutgoingLinks(View view) {
		HybridPortInstance modelElement = (HybridPortInstance) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getDiscreteSinglePortInstance_3032OutgoingLinks(View view) {
		DiscreteSinglePortInstance modelElement = (DiscreteSinglePortInstance) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getDiscreteMultiPortInstance_3033OutgoingLinks(View view) {
		DiscreteMultiPortInstance modelElement = (DiscreteMultiPortInstance) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getContinuousPortInstance_3034OutgoingLinks(View view) {
		ContinuousPortInstance modelElement = (ContinuousPortInstance) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getComponentInstanceConfiguration_3023OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getAtomicComponentInstance_3024OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getStructuredComponentInstance_3025OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getCoordinationProtocolInstance_3035OutgoingLinks(View view) {
		CoordinationProtocolInstance modelElement = (CoordinationProtocolInstance) view.getElement();
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getAssemblyConnectorInstance_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MumlLinkDescriptor> getDelegationConnectorInstance_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getContainedTypeModelFacetLinks_AssemblyConnectorInstance_4001(
			ComponentInstanceConfiguration container) {
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		for (Iterator<?> links = container.getPortConnectorInstances().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AssemblyConnectorInstance) {
				continue;
			}
			AssemblyConnectorInstance link = (AssemblyConnectorInstance) linkObject;
			if (AssemblyConnectorInstanceEditPart.VISUAL_ID != MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpointInstances();
			Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof ConnectorEndpointInstance) {
				continue;
			}
			ConnectorEndpointInstance dst = (ConnectorEndpointInstance) theTarget;
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof ConnectorEndpointInstance) {
				continue;
			}
			ConnectorEndpointInstance src = (ConnectorEndpointInstance) theSource;
			result.add(new MumlLinkDescriptor(src, dst, link, MumlElementTypes.AssemblyConnectorInstance_4001,
					AssemblyConnectorInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getContainedTypeModelFacetLinks_DelegationConnectorInstance_4002(
			ComponentInstanceConfiguration container) {
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		for (Iterator<?> links = container.getPortConnectorInstances().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DelegationConnectorInstance) {
				continue;
			}
			DelegationConnectorInstance link = (DelegationConnectorInstance) linkObject;
			if (DelegationConnectorInstanceEditPart.VISUAL_ID != MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpointInstances();
			Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof ConnectorEndpointInstance) {
				continue;
			}
			ConnectorEndpointInstance dst = (ConnectorEndpointInstance) theTarget;
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof ConnectorEndpointInstance) {
				continue;
			}
			ConnectorEndpointInstance src = (ConnectorEndpointInstance) theSource;
			result.add(new MumlLinkDescriptor(src, dst, link, MumlElementTypes.DelegationConnectorInstance_4002,
					DelegationConnectorInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(
			ConnectorEndpointInstance target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConnectorPackage.eINSTANCE
					.getConnectorInstance_ConnectorEndpointInstances()
					|| false == setting.getEObject() instanceof AssemblyConnectorInstance) {
				continue;
			}
			AssemblyConnectorInstance link = (AssemblyConnectorInstance) setting.getEObject();
			if (AssemblyConnectorInstanceEditPart.VISUAL_ID != MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof ConnectorEndpointInstance) {
				continue;
			}
			ConnectorEndpointInstance src = (ConnectorEndpointInstance) theSource;
			result.add(new MumlLinkDescriptor(src, target, link, MumlElementTypes.AssemblyConnectorInstance_4001,
					AssemblyConnectorInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(
			ConnectorEndpointInstance target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConnectorPackage.eINSTANCE
					.getConnectorInstance_ConnectorEndpointInstances()
					|| false == setting.getEObject() instanceof DelegationConnectorInstance) {
				continue;
			}
			DelegationConnectorInstance link = (DelegationConnectorInstance) setting.getEObject();
			if (DelegationConnectorInstanceEditPart.VISUAL_ID != MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof ConnectorEndpointInstance) {
				continue;
			}
			ConnectorEndpointInstance src = (ConnectorEndpointInstance) theSource;
			result.add(new MumlLinkDescriptor(src, target, link, MumlElementTypes.DelegationConnectorInstance_4002,
					DelegationConnectorInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getIncomingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(
			PortInstance target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == InstancePackage.eINSTANCE
					.getCoordinationProtocolInstance_PortInstances()) {
				result.add(new MumlLinkDescriptor(setting.getEObject(), target,
						MumlElementTypes.CoordinationProtocolInstancePortInstances_4003,
						CoordinationProtocolInstancePortInstancesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(
			ConnectorEndpointInstance source) {
		ComponentInstanceConfiguration container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ComponentInstanceConfiguration) {
				container = (ComponentInstanceConfiguration) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		for (Iterator<?> links = container.getPortConnectorInstances().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AssemblyConnectorInstance) {
				continue;
			}
			AssemblyConnectorInstance link = (AssemblyConnectorInstance) linkObject;
			if (AssemblyConnectorInstanceEditPart.VISUAL_ID != MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpointInstances();
			Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof ConnectorEndpointInstance) {
				continue;
			}
			ConnectorEndpointInstance dst = (ConnectorEndpointInstance) theTarget;
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof ConnectorEndpointInstance) {
				continue;
			}
			ConnectorEndpointInstance src = (ConnectorEndpointInstance) theSource;
			if (src != source) {
				continue;
			}
			result.add(new MumlLinkDescriptor(src, dst, link, MumlElementTypes.AssemblyConnectorInstance_4001,
					AssemblyConnectorInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(
			ConnectorEndpointInstance source) {
		ComponentInstanceConfiguration container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ComponentInstanceConfiguration) {
				container = (ComponentInstanceConfiguration) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		for (Iterator<?> links = container.getPortConnectorInstances().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DelegationConnectorInstance) {
				continue;
			}
			DelegationConnectorInstance link = (DelegationConnectorInstance) linkObject;
			if (DelegationConnectorInstanceEditPart.VISUAL_ID != MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpointInstances();
			Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof ConnectorEndpointInstance) {
				continue;
			}
			ConnectorEndpointInstance dst = (ConnectorEndpointInstance) theTarget;
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof ConnectorEndpointInstance) {
				continue;
			}
			ConnectorEndpointInstance src = (ConnectorEndpointInstance) theSource;
			if (src != source) {
				continue;
			}
			result.add(new MumlLinkDescriptor(src, dst, link, MumlElementTypes.DelegationConnectorInstance_4002,
					DelegationConnectorInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MumlLinkDescriptor> getOutgoingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(
			CoordinationProtocolInstance source) {
		LinkedList<MumlLinkDescriptor> result = new LinkedList<MumlLinkDescriptor>();
		for (Iterator<?> destinations = source.getPortInstances().iterator(); destinations.hasNext();) {
			PortInstance destination = (PortInstance) destinations.next();
			result.add(new MumlLinkDescriptor(source, destination,
					MumlElementTypes.CoordinationProtocolInstancePortInstances_4003,
					CoordinationProtocolInstancePortInstancesEditPart.VISUAL_ID));
		}
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
