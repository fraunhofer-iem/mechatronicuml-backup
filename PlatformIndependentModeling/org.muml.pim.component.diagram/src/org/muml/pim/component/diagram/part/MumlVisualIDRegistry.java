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

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.core.modelinstance.ModelinstancePackage;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.component.diagram.edit.parts.AssemblyConnectorEditPart;
import org.muml.pim.component.diagram.edit.parts.ComponentPartEditPart;
import org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart;
import org.muml.pim.component.diagram.edit.parts.ContinuousPortNameEditPart;
import org.muml.pim.component.diagram.edit.parts.CoordinationProtocolPartEditPart;
import org.muml.pim.component.diagram.edit.parts.DelegationConnectorEditPart;
import org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart;
import org.muml.pim.component.diagram.edit.parts.DiscretePortNameEditPart;
import org.muml.pim.component.diagram.edit.parts.HybridPortEditPart;
import org.muml.pim.component.diagram.edit.parts.ModelElementCategoryEditPart;
import org.muml.pim.component.diagram.edit.parts.PortPartEditPart;
import org.muml.pim.component.diagram.edit.parts.PortPartNameEditPart;
import org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentEditPart;
import org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentNameEditPart;
import org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentComponentCompartmentEditPart;
import org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentEditPart;
import org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentNameEditPart;
import org.muml.pim.component.diagram.edit.parts.WrappingLabel2EditPart;
import org.muml.pim.component.diagram.edit.parts.WrappingLabel3EditPart;
import org.muml.pim.component.diagram.edit.parts.WrappingLabel4EditPart;
import org.muml.pim.component.diagram.edit.parts.WrappingLabelEditPart;

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
	private static final String DEBUG_KEY = "org.muml.pim.component.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ModelElementCategoryEditPart.MODEL_ID.equals(view.getType())) {
				return ModelElementCategoryEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.muml.pim.component.diagram.part.MumlVisualIDRegistry.getVisualID(view.getType());
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
				ComponentDiagramEditorPlugin.getInstance()
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
		if (ModelinstancePackage.eINSTANCE.getModelElementCategory().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ModelElementCategory) domainElement)) {
			return ModelElementCategoryEditPart.VISUAL_ID;
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
		String containerModelID = org.muml.pim.component.diagram.part.MumlVisualIDRegistry.getModelID(containerView);
		if (!ModelElementCategoryEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ModelElementCategoryEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.muml.pim.component.diagram.part.MumlVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ModelElementCategoryEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ModelElementCategoryEditPart.VISUAL_ID:
			if (ComponentPackage.eINSTANCE.getStaticAtomicComponent().isSuperTypeOf(domainElement.eClass())) {
				return StaticAtomicComponentEditPart.VISUAL_ID;
			}
			if (ComponentPackage.eINSTANCE.getStaticStructuredComponent().isSuperTypeOf(domainElement.eClass())) {
				return StaticStructuredComponentEditPart.VISUAL_ID;
			}
			break;
		case StaticAtomicComponentEditPart.VISUAL_ID:
			if (ComponentPackage.eINSTANCE.getDiscretePort().isSuperTypeOf(domainElement.eClass())) {
				return DiscretePortEditPart.VISUAL_ID;
			}
			if (ComponentPackage.eINSTANCE.getContinuousPort().isSuperTypeOf(domainElement.eClass())) {
				return ContinuousPortEditPart.VISUAL_ID;
			}
			if (ComponentPackage.eINSTANCE.getHybridPort().isSuperTypeOf(domainElement.eClass())) {
				return HybridPortEditPart.VISUAL_ID;
			}
			break;
		case StaticStructuredComponentEditPart.VISUAL_ID:
			if (ComponentPackage.eINSTANCE.getDiscretePort().isSuperTypeOf(domainElement.eClass())) {
				return DiscretePortEditPart.VISUAL_ID;
			}
			if (ComponentPackage.eINSTANCE.getContinuousPort().isSuperTypeOf(domainElement.eClass())) {
				return ContinuousPortEditPart.VISUAL_ID;
			}
			break;
		case ComponentPartEditPart.VISUAL_ID:
			if (ComponentPackage.eINSTANCE.getPortPart().isSuperTypeOf(domainElement.eClass())) {
				return PortPartEditPart.VISUAL_ID;
			}
			break;
		case StaticStructuredComponentComponentCompartmentEditPart.VISUAL_ID:
			if (ComponentPackage.eINSTANCE.getComponentPart().isSuperTypeOf(domainElement.eClass())) {
				return ComponentPartEditPart.VISUAL_ID;
			}
			if (ComponentPackage.eINSTANCE.getCoordinationProtocolPart().isSuperTypeOf(domainElement.eClass())) {
				return CoordinationProtocolPartEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.muml.pim.component.diagram.part.MumlVisualIDRegistry.getModelID(containerView);
		if (!ModelElementCategoryEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ModelElementCategoryEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.muml.pim.component.diagram.part.MumlVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ModelElementCategoryEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ModelElementCategoryEditPart.VISUAL_ID:
			if (StaticAtomicComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StaticStructuredComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StaticAtomicComponentEditPart.VISUAL_ID:
			if (StaticAtomicComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DiscretePortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContinuousPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HybridPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StaticStructuredComponentEditPart.VISUAL_ID:
			if (StaticStructuredComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StaticStructuredComponentComponentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DiscretePortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContinuousPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DiscretePortEditPart.VISUAL_ID:
			if (DiscretePortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContinuousPortEditPart.VISUAL_ID:
			if (ContinuousPortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HybridPortEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentPartEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PortPartEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PortPartEditPart.VISUAL_ID:
			if (PortPartNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CoordinationProtocolPartEditPart.VISUAL_ID:
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StaticStructuredComponentComponentCompartmentEditPart.VISUAL_ID:
			if (ComponentPartEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CoordinationProtocolPartEditPart.VISUAL_ID == nodeVisualID) {
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
		if (ComponentPackage.eINSTANCE.getAssemblyConnector().isSuperTypeOf(domainElement.eClass())) {
			return AssemblyConnectorEditPart.VISUAL_ID;
		}
		if (ComponentPackage.eINSTANCE.getDelegationConnector().isSuperTypeOf(domainElement.eClass())) {
			return DelegationConnectorEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(ModelElementCategory element) {
		return true;
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
		case StaticStructuredComponentComponentCompartmentEditPart.VISUAL_ID:
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
		case ModelElementCategoryEditPart.VISUAL_ID:
			return false;
		case DiscretePortEditPart.VISUAL_ID:
		case ContinuousPortEditPart.VISUAL_ID:
		case HybridPortEditPart.VISUAL_ID:
		case CoordinationProtocolPartEditPart.VISUAL_ID:
		case PortPartEditPart.VISUAL_ID:
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
			return org.muml.pim.component.diagram.part.MumlVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return org.muml.pim.component.diagram.part.MumlVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.muml.pim.component.diagram.part.MumlVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return org.muml.pim.component.diagram.part.MumlVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return org.muml.pim.component.diagram.part.MumlVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return org.muml.pim.component.diagram.part.MumlVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
