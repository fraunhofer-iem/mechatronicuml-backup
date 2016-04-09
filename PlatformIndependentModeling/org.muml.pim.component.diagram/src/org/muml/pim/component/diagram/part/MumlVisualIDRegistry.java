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
			if (org.muml.pim.component.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID
					.equals(view.getType())) {
				return org.muml.pim.component.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID;
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
				org.muml.pim.component.diagram.part.ComponentDiagramEditorPlugin.getInstance()
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
		if (org.muml.core.modelinstance.ModelinstancePackage.eINSTANCE.getModelElementCategory()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((org.muml.core.modelinstance.ModelElementCategory) domainElement)) {
			return org.muml.pim.component.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID;
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
		String containerModelID = org.muml.pim.component.diagram.part.MumlVisualIDRegistry
				.getModelID(containerView);
		if (!org.muml.pim.component.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (org.muml.pim.component.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = org.muml.pim.component.diagram.part.MumlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = org.muml.pim.component.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case org.muml.pim.component.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			if (org.muml.pim.component.ComponentPackage.eINSTANCE.getStaticAtomicComponent()
					.isSuperTypeOf(domainElement.eClass())) {
				return org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentEditPart.VISUAL_ID;
			}
			if (org.muml.pim.component.ComponentPackage.eINSTANCE.getStaticStructuredComponent()
					.isSuperTypeOf(domainElement.eClass())) {
				return org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID;
			}
			break;
		case org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentEditPart.VISUAL_ID:
			if (org.muml.pim.component.ComponentPackage.eINSTANCE.getDiscretePort()
					.isSuperTypeOf(domainElement.eClass())) {
				return org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID;
			}
			if (org.muml.pim.component.ComponentPackage.eINSTANCE.getContinuousPort()
					.isSuperTypeOf(domainElement.eClass())) {
				return org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID;
			}
			if (org.muml.pim.component.ComponentPackage.eINSTANCE.getHybridPort()
					.isSuperTypeOf(domainElement.eClass())) {
				return org.muml.pim.component.diagram.edit.parts.HybridPortEditPart.VISUAL_ID;
			}
			break;
		case org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID:
			if (org.muml.pim.component.ComponentPackage.eINSTANCE.getDiscretePort()
					.isSuperTypeOf(domainElement.eClass())) {
				return org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID;
			}
			if (org.muml.pim.component.ComponentPackage.eINSTANCE.getContinuousPort()
					.isSuperTypeOf(domainElement.eClass())) {
				return org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID;
			}
			break;
		case org.muml.pim.component.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
			if (org.muml.pim.component.ComponentPackage.eINSTANCE.getPortPart()
					.isSuperTypeOf(domainElement.eClass())) {
				return org.muml.pim.component.diagram.edit.parts.PortPartEditPart.VISUAL_ID;
			}
			break;
		case org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentComponentCompartmentEditPart.VISUAL_ID:
			if (org.muml.pim.component.ComponentPackage.eINSTANCE.getComponentPart()
					.isSuperTypeOf(domainElement.eClass())) {
				return org.muml.pim.component.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID;
			}
			if (org.muml.pim.component.ComponentPackage.eINSTANCE.getCoordinationProtocolPart()
					.isSuperTypeOf(domainElement.eClass())) {
				return org.muml.pim.component.diagram.edit.parts.CoordinationProtocolPartEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.muml.pim.component.diagram.part.MumlVisualIDRegistry
				.getModelID(containerView);
		if (!org.muml.pim.component.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (org.muml.pim.component.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = org.muml.pim.component.diagram.part.MumlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = org.muml.pim.component.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case org.muml.pim.component.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			if (org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentEditPart.VISUAL_ID:
			if (org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.pim.component.diagram.edit.parts.HybridPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID:
			if (org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentComponentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
			if (org.muml.pim.component.diagram.edit.parts.DiscretePortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.pim.component.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
			if (org.muml.pim.component.diagram.edit.parts.ContinuousPortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.pim.component.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
			if (org.muml.pim.component.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.pim.component.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
			if (org.muml.pim.component.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.pim.component.diagram.edit.parts.PortPartEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.pim.component.diagram.edit.parts.PortPartEditPart.VISUAL_ID:
			if (org.muml.pim.component.diagram.edit.parts.PortPartNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.pim.component.diagram.edit.parts.CoordinationProtocolPartEditPart.VISUAL_ID:
			if (org.muml.pim.component.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentComponentCompartmentEditPart.VISUAL_ID:
			if (org.muml.pim.component.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.pim.component.diagram.edit.parts.CoordinationProtocolPartEditPart.VISUAL_ID == nodeVisualID) {
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
		if (org.muml.pim.component.ComponentPackage.eINSTANCE.getAssemblyConnector()
				.isSuperTypeOf(domainElement.eClass())) {
			return org.muml.pim.component.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID;
		}
		if (org.muml.pim.component.ComponentPackage.eINSTANCE.getDelegationConnector()
				.isSuperTypeOf(domainElement.eClass())) {
			return org.muml.pim.component.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(org.muml.core.modelinstance.ModelElementCategory element) {
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
		case org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentComponentCompartmentEditPart.VISUAL_ID:
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
		case org.muml.pim.component.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return false;
		case org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
		case org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
		case org.muml.pim.component.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
		case org.muml.pim.component.diagram.edit.parts.CoordinationProtocolPartEditPart.VISUAL_ID:
		case org.muml.pim.component.diagram.edit.parts.PortPartEditPart.VISUAL_ID:
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
			return org.muml.pim.component.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return org.muml.pim.component.diagram.part.MumlVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return org.muml.pim.component.diagram.part.MumlVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return org.muml.pim.component.diagram.part.MumlVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
