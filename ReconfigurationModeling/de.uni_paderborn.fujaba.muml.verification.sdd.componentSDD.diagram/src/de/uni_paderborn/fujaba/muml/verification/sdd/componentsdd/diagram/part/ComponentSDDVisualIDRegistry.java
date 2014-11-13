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
package de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part;

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
public class ComponentSDDVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "de.uni_paderborn.fujaba.muml.verification.sdd.componentSDD.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryDecisionDiagramEditPart.MODEL_ID
					.equals(view.getType())) {
				return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryDecisionDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
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
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
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
		if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentsddPackage.eINSTANCE
				.getComponentStoryDecisionDiagram().isSuperTypeOf(
						domainElement.eClass())
				&& isDiagram((de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryDecisionDiagram) domainElement)) {
			return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryDecisionDiagramEditPart.VISUAL_ID;
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
		String containerModelID = de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
				.getModelID(containerView);
		if (!de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryDecisionDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryDecisionDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryDecisionDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryDecisionDiagramEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentsddPackage.eINSTANCE
					.getComponentStoryPatternNode().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeEditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.SDDPackage.eINSTANCE
					.getLeafNode().isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.LeafNodeEditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentsddPackage.eINSTANCE
					.getInitialNode().isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getMultiPortVariable().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariable2EditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getSinglePortVariable().isSuperTypeOf(
							domainElement.eClass())
					&& isSinglePortVariable_3008((de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable) domainElement)) {
				return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable3EditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentPartVariableEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getMultiPortVariable().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableEditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getSinglePortVariable().isSuperTypeOf(
							domainElement.eClass())
					&& isSinglePortVariable_3006((de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable) domainElement)) {
				return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable2EditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.FadingComponentPartVariableEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getMultiPortVariable().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableEditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getSinglePortVariable().isSuperTypeOf(
							domainElement.eClass())
					&& isSinglePortVariable_3006((de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable) domainElement)) {
				return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable2EditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodePatternNodeContentCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getComponentStoryPattern().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternEditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getComponentVariable().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableEditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableComponentVariableCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getComponentPartVariable().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentPartVariableEditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getFadingComponentPartVariable().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.FadingComponentPartVariableEditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getSinglePortVariable().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariableEditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartment2EditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getSinglePortVariable().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariableEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
				.getModelID(containerView);
		if (!de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryDecisionDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryDecisionDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryDecisionDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryDecisionDiagramEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.LeafNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodePatternNodeContentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableOperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableComponentVariableCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariable2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentPartVariableEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.PortVariableOperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.UnderlinedLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable2EditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.PortVariableOperator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.UnderlinedLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariable2EditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.PortVariableOperator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.UnderlinedLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable3EditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.PortVariableOperator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariableName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.UnderlinedLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.FadingComponentPartVariableEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodePatternNodeContentCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableComponentVariableCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentPartVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.FadingComponentPartVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartment2EditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.AssemblyVariableEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.AssemblyVariableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortOrderConstraintEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
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
		if (de.uni_paderborn.fujaba.muml.verification.sdd.SDDPackage.eINSTANCE
				.getEdge().isSuperTypeOf(domainElement.eClass())) {
			return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.EdgeEditPart.VISUAL_ID;
		}
		if (de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
				.getAssemblyVariable().isSuperTypeOf(domainElement.eClass())) {
			return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.AssemblyVariableEditPart.VISUAL_ID;
		}
		if (de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
				.getDelegationVariable().isSuperTypeOf(domainElement.eClass())) {
			return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableEditPart.VISUAL_ID;
		}
		if (de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
				.getMultiPortOrderConstraint().isSuperTypeOf(
						domainElement.eClass())) {
			return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortOrderConstraintEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(
			de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryDecisionDiagram element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean isSinglePortVariable_3006(
			de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable domainElement) {
		Object result = de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.expressions.ComponentSDDOCLFactory
				.getExpression(
						7,
						de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
								.getSinglePortVariable(), null).evaluate(
						domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isSinglePortVariable_3008(
			de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable domainElement) {
		Object result = de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.expressions.ComponentSDDOCLFactory
				.getExpression(
						7,
						de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
								.getSinglePortVariable(), null).evaluate(
						domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
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
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodePatternNodeContentCompartmentEditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartmentEditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableComponentVariableCompartmentEditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartmentEditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartment2EditPart.VISUAL_ID:
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
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryDecisionDiagramEditPart.VISUAL_ID:
			return false;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.LeafNodeEditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariableEditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable2EditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable3EditPart.VISUAL_ID:
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
			return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
