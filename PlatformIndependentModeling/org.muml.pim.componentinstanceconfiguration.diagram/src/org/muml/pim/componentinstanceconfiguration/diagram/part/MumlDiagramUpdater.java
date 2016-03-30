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

/**
 * @generated
 */
public class MumlDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor> getSemanticChildren(
			View view) {
		switch (org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_1000SemanticChildren(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstanceEditPart.VISUAL_ID:
			return getAtomicComponentInstance_2016SemanticChildren(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceEditPart.VISUAL_ID:
			return getStructuredComponentInstance_2015SemanticChildren(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstance2EditPart.VISUAL_ID:
			return getAtomicComponentInstance_3024SemanticChildren(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstance2EditPart.VISUAL_ID:
			return getStructuredComponentInstance_3025SemanticChildren(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart.VISUAL_ID:
			return getDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment_7017SemanticChildren(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment_7018SemanticChildren(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart.VISUAL_ID:
			return getStructuredComponentInstanceComponentInstanceContentsCompartment_7012SemanticChildren(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartmentEditPart.VISUAL_ID:
			return getComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartment_7013SemanticChildren(
					view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceComponentInstanceContentsCompartment2EditPart.VISUAL_ID:
			return getStructuredComponentInstanceComponentInstanceContentsCompartment_7014SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor> getComponentInstanceConfiguration_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pim.instance.ComponentInstanceConfiguration modelElement = (org.muml.pim.instance.ComponentInstanceConfiguration) view
				.getElement();
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParentPortInstances().iterator(); it.hasNext();) {
			org.muml.pim.instance.PortInstance childElement = (org.muml.pim.instance.PortInstance) it
					.next();
			int visualID = org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceEditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceEditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getComponentInstances().iterator(); it.hasNext();) {
			org.muml.pim.instance.ComponentInstance childElement = (org.muml.pim.instance.ComponentInstance) it
					.next();
			int visualID = org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstanceEditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceEditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCoordinationProtocolInstances().iterator(); it.hasNext();) {
			org.muml.pim.instance.CoordinationProtocolInstance childElement = (org.muml.pim.instance.CoordinationProtocolInstance) it
					.next();
			int visualID = org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstanceEditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor> getAtomicComponentInstance_2016SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pim.instance.AtomicComponentInstance modelElement = (org.muml.pim.instance.AtomicComponentInstance) view
				.getElement();
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortInstances().iterator(); it.hasNext();) {
			org.muml.pim.instance.PortInstance childElement = (org.muml.pim.instance.PortInstance) it
					.next();
			int visualID = org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor> getStructuredComponentInstance_2015SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pim.instance.StructuredComponentInstance modelElement = (org.muml.pim.instance.StructuredComponentInstance) view
				.getElement();
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortInstances().iterator(); it.hasNext();) {
			org.muml.pim.instance.PortInstance childElement = (org.muml.pim.instance.PortInstance) it
					.next();
			int visualID = org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor> getAtomicComponentInstance_3024SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pim.instance.AtomicComponentInstance modelElement = (org.muml.pim.instance.AtomicComponentInstance) view
				.getElement();
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortInstances().iterator(); it.hasNext();) {
			org.muml.pim.instance.PortInstance childElement = (org.muml.pim.instance.PortInstance) it
					.next();
			int visualID = org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor> getStructuredComponentInstance_3025SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pim.instance.StructuredComponentInstance modelElement = (org.muml.pim.instance.StructuredComponentInstance) view
				.getElement();
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortInstances().iterator(); it.hasNext();) {
			org.muml.pim.instance.PortInstance childElement = (org.muml.pim.instance.PortInstance) it
					.next();
			int visualID = org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor> getDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment_7017SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pim.instance.DiscreteMultiPortInstance modelElement = (org.muml.pim.instance.DiscreteMultiPortInstance) containerView
				.getElement();
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGmfSubPortInstances().iterator(); it.hasNext();) {
			org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance childElement = (org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance) it
					.next();
			int visualID = org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor> getDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment_7018SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pim.instance.DiscreteMultiPortInstance modelElement = (org.muml.pim.instance.DiscreteMultiPortInstance) containerView
				.getElement();
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGmfSubPortInstances().iterator(); it.hasNext();) {
			org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance childElement = (org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance) it
					.next();
			int visualID = org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor> getStructuredComponentInstanceComponentInstanceContentsCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pim.instance.StructuredComponentInstance modelElement = (org.muml.pim.instance.StructuredComponentInstance) containerView
				.getElement();
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor>();
		{
			org.muml.pim.instance.ComponentInstanceConfiguration childElement = modelElement
					.getEmbeddedCIC();
			int visualID = org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor> getComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pim.instance.ComponentInstanceConfiguration modelElement = (org.muml.pim.instance.ComponentInstanceConfiguration) containerView
				.getElement();
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponentInstances().iterator(); it.hasNext();) {
			org.muml.pim.instance.ComponentInstance childElement = (org.muml.pim.instance.ComponentInstance) it
					.next();
			int visualID = org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstance2EditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstance2EditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCoordinationProtocolInstances().iterator(); it.hasNext();) {
			org.muml.pim.instance.CoordinationProtocolInstance childElement = (org.muml.pim.instance.CoordinationProtocolInstance) it
					.next();
			int visualID = org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstance2EditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor> getStructuredComponentInstanceComponentInstanceContentsCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.pim.instance.StructuredComponentInstance modelElement = (org.muml.pim.instance.StructuredComponentInstance) containerView
				.getElement();
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor>();
		{
			org.muml.pim.instance.ComponentInstanceConfiguration childElement = modelElement
					.getEmbeddedCIC();
			int visualID = org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPart.VISUAL_ID) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor(
								childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getContainedLinks(
			View view) {
		switch (org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_1000ContainedLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceEditPart.VISUAL_ID:
			return getHybridPortInstance_2021ContainedLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_2022ContainedLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceEditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_2023ContainedLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID:
			return getContinuousPortInstance_2024ContainedLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstanceEditPart.VISUAL_ID:
			return getAtomicComponentInstance_2016ContainedLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceEditPart.VISUAL_ID:
			return getStructuredComponentInstance_2015ContainedLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstanceEditPart.VISUAL_ID:
			return getCoordinationProtocolInstance_2025ContainedLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3026ContainedLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID:
			return getHybridPortInstance_3031ContainedLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3032ContainedLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_3033ContainedLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID:
			return getContinuousPortInstance_3034ContainedLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_3023ContainedLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstance2EditPart.VISUAL_ID:
			return getAtomicComponentInstance_3024ContainedLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstance2EditPart.VISUAL_ID:
			return getStructuredComponentInstance_3025ContainedLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstance2EditPart.VISUAL_ID:
			return getCoordinationProtocolInstance_3035ContainedLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID:
			return getAssemblyConnectorInstance_4001ContainedLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID:
			return getDelegationConnectorInstance_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getIncomingLinks(
			View view) {
		switch (org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceEditPart.VISUAL_ID:
			return getHybridPortInstance_2021IncomingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_2022IncomingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceEditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_2023IncomingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID:
			return getContinuousPortInstance_2024IncomingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstanceEditPart.VISUAL_ID:
			return getAtomicComponentInstance_2016IncomingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceEditPart.VISUAL_ID:
			return getStructuredComponentInstance_2015IncomingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstanceEditPart.VISUAL_ID:
			return getCoordinationProtocolInstance_2025IncomingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3026IncomingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID:
			return getHybridPortInstance_3031IncomingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3032IncomingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_3033IncomingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID:
			return getContinuousPortInstance_3034IncomingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_3023IncomingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstance2EditPart.VISUAL_ID:
			return getAtomicComponentInstance_3024IncomingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstance2EditPart.VISUAL_ID:
			return getStructuredComponentInstance_3025IncomingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstance2EditPart.VISUAL_ID:
			return getCoordinationProtocolInstance_3035IncomingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID:
			return getAssemblyConnectorInstance_4001IncomingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID:
			return getDelegationConnectorInstance_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceEditPart.VISUAL_ID:
			return getHybridPortInstance_2021OutgoingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_2022OutgoingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceEditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_2023OutgoingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID:
			return getContinuousPortInstance_2024OutgoingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstanceEditPart.VISUAL_ID:
			return getAtomicComponentInstance_2016OutgoingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceEditPart.VISUAL_ID:
			return getStructuredComponentInstance_2015OutgoingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstanceEditPart.VISUAL_ID:
			return getCoordinationProtocolInstance_2025OutgoingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3026OutgoingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID:
			return getHybridPortInstance_3031OutgoingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3032OutgoingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_3033OutgoingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID:
			return getContinuousPortInstance_3034OutgoingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_3023OutgoingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstance2EditPart.VISUAL_ID:
			return getAtomicComponentInstance_3024OutgoingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstance2EditPart.VISUAL_ID:
			return getStructuredComponentInstance_3025OutgoingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstance2EditPart.VISUAL_ID:
			return getCoordinationProtocolInstance_3035OutgoingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID:
			return getAssemblyConnectorInstance_4001OutgoingLinks(view);
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID:
			return getDelegationConnectorInstance_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getComponentInstanceConfiguration_1000ContainedLinks(
			View view) {
		org.muml.pim.instance.ComponentInstanceConfiguration modelElement = (org.muml.pim.instance.ComponentInstanceConfiguration) view
				.getElement();
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getHybridPortInstance_2021ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_2022ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getDiscreteMultiPortInstance_2023ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getContinuousPortInstance_2024ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getAtomicComponentInstance_2016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getStructuredComponentInstance_2015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getCoordinationProtocolInstance_2025ContainedLinks(
			View view) {
		org.muml.pim.instance.CoordinationProtocolInstance modelElement = (org.muml.pim.instance.CoordinationProtocolInstance) view
				.getElement();
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_3026ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getHybridPortInstance_3031ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_3032ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getDiscreteMultiPortInstance_3033ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getContinuousPortInstance_3034ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getComponentInstanceConfiguration_3023ContainedLinks(
			View view) {
		org.muml.pim.instance.ComponentInstanceConfiguration modelElement = (org.muml.pim.instance.ComponentInstanceConfiguration) view
				.getElement();
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getAtomicComponentInstance_3024ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getStructuredComponentInstance_3025ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getCoordinationProtocolInstance_3035ContainedLinks(
			View view) {
		org.muml.pim.instance.CoordinationProtocolInstance modelElement = (org.muml.pim.instance.CoordinationProtocolInstance) view
				.getElement();
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getAssemblyConnectorInstance_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getDelegationConnectorInstance_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getHybridPortInstance_2021IncomingLinks(
			View view) {
		org.muml.pim.instance.HybridPortInstance modelElement = (org.muml.pim.instance.HybridPortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_2022IncomingLinks(
			View view) {
		org.muml.pim.instance.DiscreteSinglePortInstance modelElement = (org.muml.pim.instance.DiscreteSinglePortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getDiscreteMultiPortInstance_2023IncomingLinks(
			View view) {
		org.muml.pim.instance.DiscreteMultiPortInstance modelElement = (org.muml.pim.instance.DiscreteMultiPortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getContinuousPortInstance_2024IncomingLinks(
			View view) {
		org.muml.pim.instance.ContinuousPortInstance modelElement = (org.muml.pim.instance.ContinuousPortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getAtomicComponentInstance_2016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getStructuredComponentInstance_2015IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getCoordinationProtocolInstance_2025IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_3026IncomingLinks(
			View view) {
		org.muml.pim.instance.DiscreteSinglePortInstance modelElement = (org.muml.pim.instance.DiscreteSinglePortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getHybridPortInstance_3031IncomingLinks(
			View view) {
		org.muml.pim.instance.HybridPortInstance modelElement = (org.muml.pim.instance.HybridPortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_3032IncomingLinks(
			View view) {
		org.muml.pim.instance.DiscreteSinglePortInstance modelElement = (org.muml.pim.instance.DiscreteSinglePortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getDiscreteMultiPortInstance_3033IncomingLinks(
			View view) {
		org.muml.pim.instance.DiscreteMultiPortInstance modelElement = (org.muml.pim.instance.DiscreteMultiPortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getContinuousPortInstance_3034IncomingLinks(
			View view) {
		org.muml.pim.instance.ContinuousPortInstance modelElement = (org.muml.pim.instance.ContinuousPortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getComponentInstanceConfiguration_3023IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getAtomicComponentInstance_3024IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getStructuredComponentInstance_3025IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getCoordinationProtocolInstance_3035IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getAssemblyConnectorInstance_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getDelegationConnectorInstance_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getHybridPortInstance_2021OutgoingLinks(
			View view) {
		org.muml.pim.instance.HybridPortInstance modelElement = (org.muml.pim.instance.HybridPortInstance) view
				.getElement();
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_2022OutgoingLinks(
			View view) {
		org.muml.pim.instance.DiscreteSinglePortInstance modelElement = (org.muml.pim.instance.DiscreteSinglePortInstance) view
				.getElement();
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getDiscreteMultiPortInstance_2023OutgoingLinks(
			View view) {
		org.muml.pim.instance.DiscreteMultiPortInstance modelElement = (org.muml.pim.instance.DiscreteMultiPortInstance) view
				.getElement();
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getContinuousPortInstance_2024OutgoingLinks(
			View view) {
		org.muml.pim.instance.ContinuousPortInstance modelElement = (org.muml.pim.instance.ContinuousPortInstance) view
				.getElement();
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getAtomicComponentInstance_2016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getStructuredComponentInstance_2015OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getCoordinationProtocolInstance_2025OutgoingLinks(
			View view) {
		org.muml.pim.instance.CoordinationProtocolInstance modelElement = (org.muml.pim.instance.CoordinationProtocolInstance) view
				.getElement();
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_3026OutgoingLinks(
			View view) {
		org.muml.pim.instance.DiscreteSinglePortInstance modelElement = (org.muml.pim.instance.DiscreteSinglePortInstance) view
				.getElement();
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getHybridPortInstance_3031OutgoingLinks(
			View view) {
		org.muml.pim.instance.HybridPortInstance modelElement = (org.muml.pim.instance.HybridPortInstance) view
				.getElement();
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_3032OutgoingLinks(
			View view) {
		org.muml.pim.instance.DiscreteSinglePortInstance modelElement = (org.muml.pim.instance.DiscreteSinglePortInstance) view
				.getElement();
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getDiscreteMultiPortInstance_3033OutgoingLinks(
			View view) {
		org.muml.pim.instance.DiscreteMultiPortInstance modelElement = (org.muml.pim.instance.DiscreteMultiPortInstance) view
				.getElement();
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getContinuousPortInstance_3034OutgoingLinks(
			View view) {
		org.muml.pim.instance.ContinuousPortInstance modelElement = (org.muml.pim.instance.ContinuousPortInstance) view
				.getElement();
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getComponentInstanceConfiguration_3023OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getAtomicComponentInstance_3024OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getStructuredComponentInstance_3025OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getCoordinationProtocolInstance_3035OutgoingLinks(
			View view) {
		org.muml.pim.instance.CoordinationProtocolInstance modelElement = (org.muml.pim.instance.CoordinationProtocolInstance) view
				.getElement();
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getAssemblyConnectorInstance_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getDelegationConnectorInstance_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_AssemblyConnectorInstance_4001(
			org.muml.pim.instance.ComponentInstanceConfiguration container) {
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getPortConnectorInstances().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof org.muml.pim.instance.AssemblyConnectorInstance) {
				continue;
			}
			org.muml.pim.instance.AssemblyConnectorInstance link = (org.muml.pim.instance.AssemblyConnectorInstance) linkObject;
			if (org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID != org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpointInstances();
			Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof org.muml.pim.connector.ConnectorEndpointInstance) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpointInstance dst = (org.muml.pim.connector.ConnectorEndpointInstance) theTarget;
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpointInstance) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpointInstance src = (org.muml.pim.connector.ConnectorEndpointInstance) theSource;
			result.add(new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor(
					src, dst, link,
					org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes.AssemblyConnectorInstance_4001,
					org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_DelegationConnectorInstance_4002(
			org.muml.pim.instance.ComponentInstanceConfiguration container) {
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getPortConnectorInstances().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof org.muml.pim.instance.DelegationConnectorInstance) {
				continue;
			}
			org.muml.pim.instance.DelegationConnectorInstance link = (org.muml.pim.instance.DelegationConnectorInstance) linkObject;
			if (org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID != org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpointInstances();
			Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof org.muml.pim.connector.ConnectorEndpointInstance) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpointInstance dst = (org.muml.pim.connector.ConnectorEndpointInstance) theTarget;
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpointInstance) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpointInstance src = (org.muml.pim.connector.ConnectorEndpointInstance) theSource;
			result.add(new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor(
					src, dst, link,
					org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DelegationConnectorInstance_4002,
					org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(
			org.muml.pim.connector.ConnectorEndpointInstance target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != org.muml.pim.connector.ConnectorPackage.eINSTANCE
					.getConnectorInstance_ConnectorEndpointInstances()
					|| false == setting
							.getEObject() instanceof org.muml.pim.instance.AssemblyConnectorInstance) {
				continue;
			}
			org.muml.pim.instance.AssemblyConnectorInstance link = (org.muml.pim.instance.AssemblyConnectorInstance) setting
					.getEObject();
			if (org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID != org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpointInstance) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpointInstance src = (org.muml.pim.connector.ConnectorEndpointInstance) theSource;
			result.add(new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor(
					src, target, link,
					org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes.AssemblyConnectorInstance_4001,
					org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(
			org.muml.pim.connector.ConnectorEndpointInstance target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != org.muml.pim.connector.ConnectorPackage.eINSTANCE
					.getConnectorInstance_ConnectorEndpointInstances()
					|| false == setting
							.getEObject() instanceof org.muml.pim.instance.DelegationConnectorInstance) {
				continue;
			}
			org.muml.pim.instance.DelegationConnectorInstance link = (org.muml.pim.instance.DelegationConnectorInstance) setting
					.getEObject();
			if (org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID != org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpointInstance) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpointInstance src = (org.muml.pim.connector.ConnectorEndpointInstance) theSource;
			result.add(new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor(
					src, target, link,
					org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DelegationConnectorInstance_4002,
					org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getIncomingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(
			org.muml.pim.instance.PortInstance target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.muml.pim.instance.InstancePackage.eINSTANCE
					.getCoordinationProtocolInstance_PortInstances()) {
				result.add(
						new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor(
								setting.getEObject(), target,
								org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes.CoordinationProtocolInstancePortInstances_4003,
								org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstancePortInstancesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(
			org.muml.pim.connector.ConnectorEndpointInstance source) {
		org.muml.pim.instance.ComponentInstanceConfiguration container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof org.muml.pim.instance.ComponentInstanceConfiguration) {
				container = (org.muml.pim.instance.ComponentInstanceConfiguration) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getPortConnectorInstances().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof org.muml.pim.instance.AssemblyConnectorInstance) {
				continue;
			}
			org.muml.pim.instance.AssemblyConnectorInstance link = (org.muml.pim.instance.AssemblyConnectorInstance) linkObject;
			if (org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID != org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpointInstances();
			Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof org.muml.pim.connector.ConnectorEndpointInstance) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpointInstance dst = (org.muml.pim.connector.ConnectorEndpointInstance) theTarget;
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpointInstance) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpointInstance src = (org.muml.pim.connector.ConnectorEndpointInstance) theSource;
			if (src != source) {
				continue;
			}
			result.add(new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor(
					src, dst, link,
					org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes.AssemblyConnectorInstance_4001,
					org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(
			org.muml.pim.connector.ConnectorEndpointInstance source) {
		org.muml.pim.instance.ComponentInstanceConfiguration container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof org.muml.pim.instance.ComponentInstanceConfiguration) {
				container = (org.muml.pim.instance.ComponentInstanceConfiguration) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getPortConnectorInstances().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof org.muml.pim.instance.DelegationConnectorInstance) {
				continue;
			}
			org.muml.pim.instance.DelegationConnectorInstance link = (org.muml.pim.instance.DelegationConnectorInstance) linkObject;
			if (org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID != org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpointInstances();
			Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof org.muml.pim.connector.ConnectorEndpointInstance) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpointInstance dst = (org.muml.pim.connector.ConnectorEndpointInstance) theTarget;
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpointInstance) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpointInstance src = (org.muml.pim.connector.ConnectorEndpointInstance) theSource;
			if (src != source) {
				continue;
			}
			result.add(new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor(
					src, dst, link,
					org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DelegationConnectorInstance_4002,
					org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getOutgoingFeatureModelFacetLinks_CoordinationProtocolInstance_PortInstances_4003(
			org.muml.pim.instance.CoordinationProtocolInstance source) {
		LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> destinations = source.getPortInstances().iterator(); destinations.hasNext();) {
			org.muml.pim.instance.PortInstance destination = (org.muml.pim.instance.PortInstance) destinations
					.next();
			result.add(new org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor(
					source, destination,
					org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes.CoordinationProtocolInstancePortInstances_4003,
					org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstancePortInstancesEditPart.VISUAL_ID));
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

		public List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlNodeDescriptor> getSemanticChildren(
				View view) {
			return MumlDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getContainedLinks(
				View view) {
			return MumlDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getIncomingLinks(
				View view) {
			return MumlDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<org.muml.pim.componentinstanceconfiguration.diagram.part.MumlLinkDescriptor> getOutgoingLinks(
				View view) {
			return MumlDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
