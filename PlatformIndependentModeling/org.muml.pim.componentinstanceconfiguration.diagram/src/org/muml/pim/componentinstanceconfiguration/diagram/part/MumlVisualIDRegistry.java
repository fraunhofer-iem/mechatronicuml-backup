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

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartmentEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceName2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceNameEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceName2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceNameEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceName3EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceNameEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceName2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceNameEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceComponentInstanceContentsCompartment2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel10EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel3EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel4EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel5EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel6EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel7EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel8EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel9EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabelEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory;
import org.muml.pim.instance.AssemblyConnectorInstance;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pim.instance.DelegationConnectorInstance;
import org.muml.pim.instance.DiscreteSinglePortInstance;
import org.muml.pim.instance.InstancePackage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MumlVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.muml.pim.componentinstanceconfiguration.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ComponentInstanceConfigurationDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				ComponentinstanceconfigurationDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (InstancePackage.eINSTANCE.getComponentInstanceConfiguration().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ComponentInstanceConfiguration) domainElement)) {
			return ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
				.getModelID(containerView);
		if (!ComponentInstanceConfigurationDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ComponentInstanceConfigurationDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID:
			if (InstancePackage.eINSTANCE.getHybridPortInstance().isSuperTypeOf(domainElement.eClass())) {
				return HybridPortInstanceEditPart.VISUAL_ID;
			}
			if (InstancePackage.eINSTANCE.getDiscreteSinglePortInstance().isSuperTypeOf(domainElement.eClass())
					&& isDiscreteSinglePortInstance_2022((DiscreteSinglePortInstance) domainElement)) {
				return DiscreteSinglePortInstanceEditPart.VISUAL_ID;
			}
			if (InstancePackage.eINSTANCE.getDiscreteMultiPortInstance().isSuperTypeOf(domainElement.eClass())) {
				return DiscreteMultiPortInstanceEditPart.VISUAL_ID;
			}
			if (InstancePackage.eINSTANCE.getContinuousPortInstance().isSuperTypeOf(domainElement.eClass())) {
				return ContinuousPortInstanceEditPart.VISUAL_ID;
			}
			if (InstancePackage.eINSTANCE.getAtomicComponentInstance().isSuperTypeOf(domainElement.eClass())) {
				return AtomicComponentInstanceEditPart.VISUAL_ID;
			}
			if (InstancePackage.eINSTANCE.getStructuredComponentInstance().isSuperTypeOf(domainElement.eClass())) {
				return StructuredComponentInstanceEditPart.VISUAL_ID;
			}
			if (InstancePackage.eINSTANCE.getCoordinationProtocolInstance().isSuperTypeOf(domainElement.eClass())) {
				return CoordinationProtocolInstanceEditPart.VISUAL_ID;
			}
			break;
		case AtomicComponentInstanceEditPart.VISUAL_ID:
			if (InstancePackage.eINSTANCE.getHybridPortInstance().isSuperTypeOf(domainElement.eClass())) {
				return HybridPortInstance2EditPart.VISUAL_ID;
			}
			if (InstancePackage.eINSTANCE.getDiscreteSinglePortInstance().isSuperTypeOf(domainElement.eClass())
					&& isDiscreteSinglePortInstance_3032((DiscreteSinglePortInstance) domainElement)) {
				return DiscreteSinglePortInstance3EditPart.VISUAL_ID;
			}
			if (InstancePackage.eINSTANCE.getDiscreteMultiPortInstance().isSuperTypeOf(domainElement.eClass())) {
				return DiscreteMultiPortInstance2EditPart.VISUAL_ID;
			}
			if (InstancePackage.eINSTANCE.getContinuousPortInstance().isSuperTypeOf(domainElement.eClass())) {
				return ContinuousPortInstance2EditPart.VISUAL_ID;
			}
			break;
		case StructuredComponentInstanceEditPart.VISUAL_ID:
			if (InstancePackage.eINSTANCE.getHybridPortInstance().isSuperTypeOf(domainElement.eClass())) {
				return HybridPortInstance2EditPart.VISUAL_ID;
			}
			if (InstancePackage.eINSTANCE.getDiscreteSinglePortInstance().isSuperTypeOf(domainElement.eClass())
					&& isDiscreteSinglePortInstance_3032((DiscreteSinglePortInstance) domainElement)) {
				return DiscreteSinglePortInstance3EditPart.VISUAL_ID;
			}
			if (InstancePackage.eINSTANCE.getDiscreteMultiPortInstance().isSuperTypeOf(domainElement.eClass())) {
				return DiscreteMultiPortInstance2EditPart.VISUAL_ID;
			}
			if (InstancePackage.eINSTANCE.getContinuousPortInstance().isSuperTypeOf(domainElement.eClass())) {
				return ContinuousPortInstance2EditPart.VISUAL_ID;
			}
			break;
		case AtomicComponentInstance2EditPart.VISUAL_ID:
			if (InstancePackage.eINSTANCE.getHybridPortInstance().isSuperTypeOf(domainElement.eClass())) {
				return HybridPortInstance2EditPart.VISUAL_ID;
			}
			if (InstancePackage.eINSTANCE.getDiscreteSinglePortInstance().isSuperTypeOf(domainElement.eClass())
					&& isDiscreteSinglePortInstance_3032((DiscreteSinglePortInstance) domainElement)) {
				return DiscreteSinglePortInstance3EditPart.VISUAL_ID;
			}
			if (InstancePackage.eINSTANCE.getDiscreteMultiPortInstance().isSuperTypeOf(domainElement.eClass())) {
				return DiscreteMultiPortInstance2EditPart.VISUAL_ID;
			}
			if (InstancePackage.eINSTANCE.getContinuousPortInstance().isSuperTypeOf(domainElement.eClass())) {
				return ContinuousPortInstance2EditPart.VISUAL_ID;
			}
			break;
		case StructuredComponentInstance2EditPart.VISUAL_ID:
			if (InstancePackage.eINSTANCE.getHybridPortInstance().isSuperTypeOf(domainElement.eClass())) {
				return HybridPortInstance2EditPart.VISUAL_ID;
			}
			if (InstancePackage.eINSTANCE.getDiscreteSinglePortInstance().isSuperTypeOf(domainElement.eClass())
					&& isDiscreteSinglePortInstance_3032((DiscreteSinglePortInstance) domainElement)) {
				return DiscreteSinglePortInstance3EditPart.VISUAL_ID;
			}
			if (InstancePackage.eINSTANCE.getDiscreteMultiPortInstance().isSuperTypeOf(domainElement.eClass())) {
				return DiscreteMultiPortInstance2EditPart.VISUAL_ID;
			}
			if (InstancePackage.eINSTANCE.getContinuousPortInstance().isSuperTypeOf(domainElement.eClass())) {
				return ContinuousPortInstance2EditPart.VISUAL_ID;
			}
			break;
		case DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart.VISUAL_ID:
			if (InstancePackage.eINSTANCE.getDiscreteSinglePortInstance().isSuperTypeOf(domainElement.eClass())) {
				return DiscreteSinglePortInstance2EditPart.VISUAL_ID;
			}
			break;
		case DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart.VISUAL_ID:
			if (InstancePackage.eINSTANCE.getDiscreteSinglePortInstance().isSuperTypeOf(domainElement.eClass())) {
				return DiscreteSinglePortInstance2EditPart.VISUAL_ID;
			}
			break;
		case StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart.VISUAL_ID:
			if (InstancePackage.eINSTANCE.getComponentInstanceConfiguration().isSuperTypeOf(domainElement.eClass())) {
				return ComponentInstanceConfigurationEditPart.VISUAL_ID;
			}
			break;
		case ComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartmentEditPart.VISUAL_ID:
			if (InstancePackage.eINSTANCE.getAtomicComponentInstance().isSuperTypeOf(domainElement.eClass())) {
				return AtomicComponentInstance2EditPart.VISUAL_ID;
			}
			if (InstancePackage.eINSTANCE.getStructuredComponentInstance().isSuperTypeOf(domainElement.eClass())) {
				return StructuredComponentInstance2EditPart.VISUAL_ID;
			}
			if (InstancePackage.eINSTANCE.getCoordinationProtocolInstance().isSuperTypeOf(domainElement.eClass())) {
				return CoordinationProtocolInstance2EditPart.VISUAL_ID;
			}
			break;
		case StructuredComponentInstanceComponentInstanceContentsCompartment2EditPart.VISUAL_ID:
			if (InstancePackage.eINSTANCE.getComponentInstanceConfiguration().isSuperTypeOf(domainElement.eClass())) {
				return ComponentInstanceConfigurationEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
				.getModelID(containerView);
		if (!ComponentInstanceConfigurationDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ComponentInstanceConfigurationDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID:
			if (HybridPortInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DiscreteSinglePortInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DiscreteMultiPortInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContinuousPortInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicComponentInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StructuredComponentInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CoordinationProtocolInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HybridPortInstanceEditPart.VISUAL_ID:
			if (HybridPortInstanceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DiscreteSinglePortInstanceEditPart.VISUAL_ID:
			if (DiscreteSinglePortInstanceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DiscreteMultiPortInstanceEditPart.VISUAL_ID:
			if (DiscreteMultiPortInstanceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContinuousPortInstanceEditPart.VISUAL_ID:
			if (ContinuousPortInstanceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtomicComponentInstanceEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HybridPortInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DiscreteSinglePortInstance3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DiscreteMultiPortInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContinuousPortInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StructuredComponentInstanceEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HybridPortInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DiscreteSinglePortInstance3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DiscreteMultiPortInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContinuousPortInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CoordinationProtocolInstanceEditPart.VISUAL_ID:
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HybridPortInstance2EditPart.VISUAL_ID:
			if (HybridPortInstanceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DiscreteSinglePortInstance3EditPart.VISUAL_ID:
			if (DiscreteSinglePortInstanceName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DiscreteMultiPortInstance2EditPart.VISUAL_ID:
			if (DiscreteMultiPortInstanceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContinuousPortInstance2EditPart.VISUAL_ID:
			if (ContinuousPortInstanceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentInstanceConfigurationEditPart.VISUAL_ID:
			if (ComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtomicComponentInstance2EditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HybridPortInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DiscreteSinglePortInstance3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DiscreteMultiPortInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContinuousPortInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StructuredComponentInstance2EditPart.VISUAL_ID:
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StructuredComponentInstanceComponentInstanceContentsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HybridPortInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DiscreteSinglePortInstance3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DiscreteMultiPortInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContinuousPortInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CoordinationProtocolInstance2EditPart.VISUAL_ID:
			if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart.VISUAL_ID:
			if (DiscreteSinglePortInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart.VISUAL_ID:
			if (DiscreteSinglePortInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart.VISUAL_ID:
			if (ComponentInstanceConfigurationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartmentEditPart.VISUAL_ID:
			if (AtomicComponentInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StructuredComponentInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CoordinationProtocolInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StructuredComponentInstanceComponentInstanceContentsCompartment2EditPart.VISUAL_ID:
			if (ComponentInstanceConfigurationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (InstancePackage.eINSTANCE.getAssemblyConnectorInstance().isSuperTypeOf(domainElement.eClass())
				&& isAssemblyConnectorInstance_4001((AssemblyConnectorInstance) domainElement)) {
			return AssemblyConnectorInstanceEditPart.VISUAL_ID;
		}
		if (InstancePackage.eINSTANCE.getDelegationConnectorInstance().isSuperTypeOf(domainElement.eClass())
				&& isDelegationConnectorInstance_4002((DelegationConnectorInstance) domainElement)) {
			return DelegationConnectorInstanceEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(ComponentInstanceConfiguration element) {
		return true;
	}

	/**
	* @generated
	*/
	private static boolean isDiscreteSinglePortInstance_2022(DiscreteSinglePortInstance domainElement) {
		Object result = MumlOCLFactory.getExpression(1, InstancePackage.eINSTANCE.getDiscreteSinglePortInstance(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	* @generated
	*/
	private static boolean isDiscreteSinglePortInstance_3032(DiscreteSinglePortInstance domainElement) {
		Object result = MumlOCLFactory.getExpression(1, InstancePackage.eINSTANCE.getDiscreteSinglePortInstance(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	* @generated
	*/
	private static boolean isAssemblyConnectorInstance_4001(AssemblyConnectorInstance domainElement) {
		Object result = MumlOCLFactory.getExpression(12, InstancePackage.eINSTANCE.getAssemblyConnectorInstance(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	* @generated
	*/
	private static boolean isDelegationConnectorInstance_4002(DelegationConnectorInstance domainElement) {
		Object result = MumlOCLFactory
				.getExpression(13, InstancePackage.eINSTANCE.getDelegationConnectorInstance(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart.VISUAL_ID:
		case DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart.VISUAL_ID:
		case StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart.VISUAL_ID:
		case ComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartmentEditPart.VISUAL_ID:
		case StructuredComponentInstanceComponentInstanceContentsCompartment2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID:
			return false;
		case HybridPortInstanceEditPart.VISUAL_ID:
		case DiscreteSinglePortInstanceEditPart.VISUAL_ID:
		case ContinuousPortInstanceEditPart.VISUAL_ID:
		case CoordinationProtocolInstanceEditPart.VISUAL_ID:
		case DiscreteSinglePortInstance2EditPart.VISUAL_ID:
		case HybridPortInstance2EditPart.VISUAL_ID:
		case DiscreteSinglePortInstance3EditPart.VISUAL_ID:
		case ContinuousPortInstance2EditPart.VISUAL_ID:
		case CoordinationProtocolInstance2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
