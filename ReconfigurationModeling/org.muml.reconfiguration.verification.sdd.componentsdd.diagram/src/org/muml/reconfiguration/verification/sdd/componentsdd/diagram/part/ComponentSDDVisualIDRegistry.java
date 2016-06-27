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
package org.muml.reconfiguration.verification.sdd.componentsdd.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage;
import org.muml.reconfiguration.componentstorypattern.SinglePortVariable;
import org.muml.reconfiguration.verification.sdd.componentsdd.ComponentStoryDecisionDiagram;
import org.muml.reconfiguration.verification.sdd.componentsdd.ComponentsddPackage;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.AssemblyVariableEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.AssemblyVariableNameEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentPartVariableEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryDecisionDiagramEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartmentEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeNameEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodePatternNodeContentCompartmentEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeTypeEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableComponentVariableCompartmentEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableOperatorEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableNameEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.EdgeEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.FadingComponentPartVariableEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.InitialNodeEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.LeafNodeEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortOrderConstraintEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariable2EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartment2EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartmentEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableName2EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableNameEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.PortVariableOperator2EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.PortVariableOperator3EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.PortVariableOperator4EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.PortVariableOperatorEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable2EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable3EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariableEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariableName2EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariableNameEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.UnderlinedLabel2EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.UnderlinedLabel3EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.UnderlinedLabel4EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.UnderlinedLabelEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel10EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel2EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel3EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel4EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel5EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel6EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel7EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel8EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel9EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabelEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.expressions.ComponentSDDOCLFactory;
import org.muml.storydiagram.verification.sdd.SDDPackage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ComponentSDDVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.muml.reconfiguration.verification.sdd.componentsdd.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ComponentStoryDecisionDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return ComponentStoryDecisionDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.muml.reconfiguration.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
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
				ComponentSDDDiagramEditorPlugin.getInstance()
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
		if (ComponentsddPackage.eINSTANCE.getComponentStoryDecisionDiagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ComponentStoryDecisionDiagram) domainElement)) {
			return ComponentStoryDecisionDiagramEditPart.VISUAL_ID;
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
		String containerModelID = org.muml.reconfiguration.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
				.getModelID(containerView);
		if (!ComponentStoryDecisionDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ComponentStoryDecisionDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.muml.reconfiguration.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ComponentStoryDecisionDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ComponentStoryDecisionDiagramEditPart.VISUAL_ID:
			if (ComponentsddPackage.eINSTANCE.getComponentStoryPatternNode().isSuperTypeOf(domainElement.eClass())) {
				return ComponentStoryPatternNodeEditPart.VISUAL_ID;
			}
			if (SDDPackage.eINSTANCE.getLeafNode().isSuperTypeOf(domainElement.eClass())) {
				return LeafNodeEditPart.VISUAL_ID;
			}
			if (ComponentsddPackage.eINSTANCE.getInitialNode().isSuperTypeOf(domainElement.eClass())) {
				return InitialNodeEditPart.VISUAL_ID;
			}
			break;
		case ComponentVariableEditPart.VISUAL_ID:
			if (ComponentstorypatternPackage.eINSTANCE.getMultiPortVariable().isSuperTypeOf(domainElement.eClass())) {
				return MultiPortVariable2EditPart.VISUAL_ID;
			}
			if (ComponentstorypatternPackage.eINSTANCE.getSinglePortVariable().isSuperTypeOf(domainElement.eClass())
					&& isSinglePortVariable_3008((SinglePortVariable) domainElement)) {
				return SinglePortVariable3EditPart.VISUAL_ID;
			}
			break;
		case ComponentPartVariableEditPart.VISUAL_ID:
			if (ComponentstorypatternPackage.eINSTANCE.getMultiPortVariable().isSuperTypeOf(domainElement.eClass())) {
				return MultiPortVariableEditPart.VISUAL_ID;
			}
			if (ComponentstorypatternPackage.eINSTANCE.getSinglePortVariable().isSuperTypeOf(domainElement.eClass())
					&& isSinglePortVariable_3006((SinglePortVariable) domainElement)) {
				return SinglePortVariable2EditPart.VISUAL_ID;
			}
			break;
		case FadingComponentPartVariableEditPart.VISUAL_ID:
			if (ComponentstorypatternPackage.eINSTANCE.getMultiPortVariable().isSuperTypeOf(domainElement.eClass())) {
				return MultiPortVariableEditPart.VISUAL_ID;
			}
			if (ComponentstorypatternPackage.eINSTANCE.getSinglePortVariable().isSuperTypeOf(domainElement.eClass())
					&& isSinglePortVariable_3006((SinglePortVariable) domainElement)) {
				return SinglePortVariable2EditPart.VISUAL_ID;
			}
			break;
		case ComponentStoryPatternNodePatternNodeContentCompartmentEditPart.VISUAL_ID:
			if (ComponentstorypatternPackage.eINSTANCE.getComponentStoryPattern()
					.isSuperTypeOf(domainElement.eClass())) {
				return ComponentStoryPatternEditPart.VISUAL_ID;
			}
			break;
		case ComponentStoryPatternComponentStoryPatternCompartmentEditPart.VISUAL_ID:
			if (ComponentstorypatternPackage.eINSTANCE.getComponentVariable().isSuperTypeOf(domainElement.eClass())) {
				return ComponentVariableEditPart.VISUAL_ID;
			}
			break;
		case ComponentVariableComponentVariableCompartmentEditPart.VISUAL_ID:
			if (ComponentstorypatternPackage.eINSTANCE.getComponentPartVariable()
					.isSuperTypeOf(domainElement.eClass())) {
				return ComponentPartVariableEditPart.VISUAL_ID;
			}
			if (ComponentstorypatternPackage.eINSTANCE.getFadingComponentPartVariable()
					.isSuperTypeOf(domainElement.eClass())) {
				return FadingComponentPartVariableEditPart.VISUAL_ID;
			}
			break;
		case MultiPortVariableMultiPortVariablesCompartmentEditPart.VISUAL_ID:
			if (ComponentstorypatternPackage.eINSTANCE.getSinglePortVariable().isSuperTypeOf(domainElement.eClass())) {
				return SinglePortVariableEditPart.VISUAL_ID;
			}
			break;
		case MultiPortVariableMultiPortVariablesCompartment2EditPart.VISUAL_ID:
			if (ComponentstorypatternPackage.eINSTANCE.getSinglePortVariable().isSuperTypeOf(domainElement.eClass())) {
				return SinglePortVariableEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.muml.reconfiguration.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
				.getModelID(containerView);
		if (!ComponentStoryDecisionDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ComponentStoryDecisionDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.muml.reconfiguration.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ComponentStoryDecisionDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ComponentStoryDecisionDiagramEditPart.VISUAL_ID:
			if (ComponentStoryPatternNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LeafNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitialNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentStoryPatternNodeEditPart.VISUAL_ID:
			if (ComponentStoryPatternNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentStoryPatternNodeTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentStoryPatternNodePatternNodeContentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InitialNodeEditPart.VISUAL_ID:
			if (WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentStoryPatternEditPart.VISUAL_ID:
			if (ComponentStoryPatternComponentStoryPatternCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentVariableEditPart.VISUAL_ID:
			if (ComponentVariableOperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentVariableComponentVariableCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiPortVariable2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SinglePortVariable3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentPartVariableEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiPortVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SinglePortVariable2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MultiPortVariableEditPart.VISUAL_ID:
			if (PortVariableOperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiPortVariableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnderlinedLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiPortVariableMultiPortVariablesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SinglePortVariable2EditPart.VISUAL_ID:
			if (PortVariableOperator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SinglePortVariableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnderlinedLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MultiPortVariable2EditPart.VISUAL_ID:
			if (PortVariableOperator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiPortVariableName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnderlinedLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiPortVariableMultiPortVariablesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SinglePortVariable3EditPart.VISUAL_ID:
			if (PortVariableOperator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SinglePortVariableName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnderlinedLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FadingComponentPartVariableEditPart.VISUAL_ID:
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiPortVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SinglePortVariable2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentStoryPatternNodePatternNodeContentCompartmentEditPart.VISUAL_ID:
			if (ComponentStoryPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentStoryPatternComponentStoryPatternCompartmentEditPart.VISUAL_ID:
			if (ComponentVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentVariableComponentVariableCompartmentEditPart.VISUAL_ID:
			if (ComponentPartVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FadingComponentPartVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MultiPortVariableMultiPortVariablesCompartmentEditPart.VISUAL_ID:
			if (SinglePortVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MultiPortVariableMultiPortVariablesCompartment2EditPart.VISUAL_ID:
			if (SinglePortVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssemblyVariableEditPart.VISUAL_ID:
			if (AssemblyVariableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DelegationVariableEditPart.VISUAL_ID:
			if (DelegationVariableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MultiPortOrderConstraintEditPart.VISUAL_ID:
			if (WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
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
		if (SDDPackage.eINSTANCE.getEdge().isSuperTypeOf(domainElement.eClass())) {
			return EdgeEditPart.VISUAL_ID;
		}
		if (ComponentstorypatternPackage.eINSTANCE.getAssemblyVariable().isSuperTypeOf(domainElement.eClass())) {
			return AssemblyVariableEditPart.VISUAL_ID;
		}
		if (ComponentstorypatternPackage.eINSTANCE.getDelegationVariable().isSuperTypeOf(domainElement.eClass())) {
			return DelegationVariableEditPart.VISUAL_ID;
		}
		if (ComponentstorypatternPackage.eINSTANCE.getMultiPortOrderConstraint()
				.isSuperTypeOf(domainElement.eClass())) {
			return MultiPortOrderConstraintEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(ComponentStoryDecisionDiagram element) {
		return true;
	}

	/**
	* @generated
	*/
	private static boolean isSinglePortVariable_3006(SinglePortVariable domainElement) {
		Object result = ComponentSDDOCLFactory
				.getExpression(7, ComponentstorypatternPackage.eINSTANCE.getSinglePortVariable(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	* @generated
	*/
	private static boolean isSinglePortVariable_3008(SinglePortVariable domainElement) {
		Object result = ComponentSDDOCLFactory
				.getExpression(7, ComponentstorypatternPackage.eINSTANCE.getSinglePortVariable(), null)
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
		case ComponentStoryPatternNodePatternNodeContentCompartmentEditPart.VISUAL_ID:
		case ComponentStoryPatternComponentStoryPatternCompartmentEditPart.VISUAL_ID:
		case ComponentVariableComponentVariableCompartmentEditPart.VISUAL_ID:
		case MultiPortVariableMultiPortVariablesCompartmentEditPart.VISUAL_ID:
		case MultiPortVariableMultiPortVariablesCompartment2EditPart.VISUAL_ID:
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
		case ComponentStoryDecisionDiagramEditPart.VISUAL_ID:
			return false;
		case LeafNodeEditPart.VISUAL_ID:
		case InitialNodeEditPart.VISUAL_ID:
		case SinglePortVariableEditPart.VISUAL_ID:
		case SinglePortVariable2EditPart.VISUAL_ID:
		case SinglePortVariable3EditPart.VISUAL_ID:
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
			return org.muml.reconfiguration.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return org.muml.reconfiguration.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.muml.reconfiguration.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return org.muml.reconfiguration.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return org.muml.reconfiguration.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return org.muml.reconfiguration.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
