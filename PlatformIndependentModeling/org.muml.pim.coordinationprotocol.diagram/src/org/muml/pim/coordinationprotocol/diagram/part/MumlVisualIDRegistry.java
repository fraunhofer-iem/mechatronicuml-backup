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
package org.muml.pim.coordinationprotocol.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.core.modelinstance.ModelinstancePackage;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.ConnectorQualityOfServiceAssumptionsEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.CoordinationProtocol2EditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.CoordinationProtocolCoordinationProtocolContainerCompartmentEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.CoordinationProtocolEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.CoordinationProtocolNameEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.MessageBufferEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.MessageBufferMessageBufferCompartmentEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.MessageBufferNameEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.MessageTypeEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.MessageTypeMessageTypesCompartmentEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.MessageTypeNameEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.ModelElementCategoryEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.ParameterEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.RoleConnectorEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.RoleEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.RoleNameEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.WrappingLabel2EditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.WrappingLabel3EditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.WrappingLabel5EditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.WrappingLabel6EditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.WrappingLabelEditPart;
import org.muml.pim.msgtype.MsgtypePackage;
import org.muml.pim.protocol.ProtocolPackage;

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
	private static final String DEBUG_KEY = "org.muml.pim.coordinationprotocol.diagram/debug/visualID"; //$NON-NLS-1$

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
		return org.muml.pim.coordinationprotocol.diagram.part.MumlVisualIDRegistry.getVisualID(view.getType());
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
				MumlDiagramEditorPlugin.getInstance()
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
		String containerModelID = org.muml.pim.coordinationprotocol.diagram.part.MumlVisualIDRegistry
				.getModelID(containerView);
		if (!ModelElementCategoryEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ModelElementCategoryEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.muml.pim.coordinationprotocol.diagram.part.MumlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ModelElementCategoryEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ModelElementCategoryEditPart.VISUAL_ID:
			if (ProtocolPackage.eINSTANCE.getCoordinationProtocol().isSuperTypeOf(domainElement.eClass())) {
				return CoordinationProtocolEditPart.VISUAL_ID;
			}
			break;
		case CoordinationProtocolCoordinationProtocolContainerCompartmentEditPart.VISUAL_ID:
			if (ProtocolPackage.eINSTANCE.getCoordinationProtocol().isSuperTypeOf(domainElement.eClass())) {
				return CoordinationProtocol2EditPart.VISUAL_ID;
			}
			if (ProtocolPackage.eINSTANCE.getRole().isSuperTypeOf(domainElement.eClass())) {
				return RoleEditPart.VISUAL_ID;
			}
			if (ConnectorPackage.eINSTANCE.getMessageBuffer().isSuperTypeOf(domainElement.eClass())) {
				return MessageBufferEditPart.VISUAL_ID;
			}
			if (ProtocolPackage.eINSTANCE.getConnectorQualityOfServiceAssumptions()
					.isSuperTypeOf(domainElement.eClass())) {
				return ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID;
			}
			break;
		case MessageBufferMessageBufferCompartmentEditPart.VISUAL_ID:
			if (MsgtypePackage.eINSTANCE.getMessageType().isSuperTypeOf(domainElement.eClass())) {
				return MessageTypeEditPart.VISUAL_ID;
			}
			break;
		case MessageTypeMessageTypesCompartmentEditPart.VISUAL_ID:
			if (BehaviorPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
				return ParameterEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.muml.pim.coordinationprotocol.diagram.part.MumlVisualIDRegistry
				.getModelID(containerView);
		if (!ModelElementCategoryEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ModelElementCategoryEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.muml.pim.coordinationprotocol.diagram.part.MumlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ModelElementCategoryEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ModelElementCategoryEditPart.VISUAL_ID:
			if (CoordinationProtocolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CoordinationProtocolEditPart.VISUAL_ID:
			if (CoordinationProtocolCoordinationProtocolContainerCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CoordinationProtocol2EditPart.VISUAL_ID:
			if (CoordinationProtocolNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RoleEditPart.VISUAL_ID:
			if (RoleNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MessageBufferEditPart.VISUAL_ID:
			if (MessageBufferNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MessageBufferMessageBufferCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MessageTypeEditPart.VISUAL_ID:
			if (MessageTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MessageTypeMessageTypesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParameterEditPart.VISUAL_ID:
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CoordinationProtocolCoordinationProtocolContainerCompartmentEditPart.VISUAL_ID:
			if (CoordinationProtocol2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MessageBufferEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MessageBufferMessageBufferCompartmentEditPart.VISUAL_ID:
			if (MessageTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MessageTypeMessageTypesCompartmentEditPart.VISUAL_ID:
			if (ParameterEditPart.VISUAL_ID == nodeVisualID) {
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
		if (ProtocolPackage.eINSTANCE.getRoleConnector().isSuperTypeOf(domainElement.eClass())) {
			return RoleConnectorEditPart.VISUAL_ID;
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
		case CoordinationProtocolCoordinationProtocolContainerCompartmentEditPart.VISUAL_ID:
		case MessageBufferMessageBufferCompartmentEditPart.VISUAL_ID:
		case MessageTypeMessageTypesCompartmentEditPart.VISUAL_ID:
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
		case RoleEditPart.VISUAL_ID:
		case ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
		case CoordinationProtocol2EditPart.VISUAL_ID:
		case ParameterEditPart.VISUAL_ID:
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
			return org.muml.pim.coordinationprotocol.diagram.part.MumlVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return org.muml.pim.coordinationprotocol.diagram.part.MumlVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.muml.pim.coordinationprotocol.diagram.part.MumlVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return org.muml.pim.coordinationprotocol.diagram.part.MumlVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return org.muml.pim.coordinationprotocol.diagram.part.MumlVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return org.muml.pim.coordinationprotocol.diagram.part.MumlVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
