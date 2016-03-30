package org.muml.reconfiguration.componentstorydiagram.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import org.muml.storydiagram.activities.ActivitiesPackage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ComponentStoryDiagramVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryRuleEditPart.MODEL_ID
					.equals(view.getType())) {
				return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryRuleEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry
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
				org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
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
		if (org.muml.reconfiguration.componentstorydiagram.ComponentstorydiagramPackage.eINSTANCE
				.getComponentStoryRule().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((org.muml.reconfiguration.componentstorydiagram.ComponentStoryRule) domainElement)) {
			return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryRuleEditPart.VISUAL_ID;
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
		String containerModelID = org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry
				.getModelID(containerView);
		if (!org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryRuleEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryRuleEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryRuleEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryRuleEditPart.VISUAL_ID:
			if (ActivitiesPackage.eINSTANCE.getActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityEditPart.VISUAL_ID;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariableEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getMultiPortVariable().isSuperTypeOf(
							domainElement.eClass())) {
				return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariable2EditPart.VISUAL_ID;
			}
			if (org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getSinglePortVariable().isSuperTypeOf(
							domainElement.eClass())
					&& isSinglePortVariable_3020((org.muml.reconfiguration.componentstorypattern.SinglePortVariable) domainElement)) {
				return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariable3EditPart.VISUAL_ID;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.PartVariableEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getMultiPortVariable().isSuperTypeOf(
							domainElement.eClass())) {
				return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableEditPart.VISUAL_ID;
			}
			if (org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getSinglePortVariable().isSuperTypeOf(
							domainElement.eClass())
					&& isSinglePortVariable_3018((org.muml.reconfiguration.componentstorypattern.SinglePortVariable) domainElement)) {
				return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariable2EditPart.VISUAL_ID;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariable2EditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getMultiPortVariable().isSuperTypeOf(
							domainElement.eClass())) {
				return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariable2EditPart.VISUAL_ID;
			}
			if (org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getSinglePortVariable().isSuperTypeOf(
							domainElement.eClass())
					&& isSinglePortVariable_3020((org.muml.reconfiguration.componentstorypattern.SinglePortVariable) domainElement)) {
				return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariable3EditPart.VISUAL_ID;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.FadingComponentPartVariableEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getMultiPortVariable().isSuperTypeOf(
							domainElement.eClass())) {
				return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableEditPart.VISUAL_ID;
			}
			if (org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getSinglePortVariable().isSuperTypeOf(
							domainElement.eClass())
					&& isSinglePortVariable_3018((org.muml.reconfiguration.componentstorypattern.SinglePortVariable) domainElement)) {
				return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariable2EditPart.VISUAL_ID;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityActivityCompartmentEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.ComponentstorydiagramPackage.eINSTANCE
					.getComponentStoryNode().isSuperTypeOf(
							domainElement.eClass())) {
				return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getInitialNode().isSuperTypeOf(
					domainElement.eClass())) {
				return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getJunctionNode().isSuperTypeOf(
					domainElement.eClass())) {
				return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.JunctionNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getActivityFinalNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityFinalNodeEditPart.VISUAL_ID;
			}
			if (org.muml.reconfiguration.componentstorydiagram.ComponentstorydiagramPackage.eINSTANCE
					.getControllerExchangeNode().isSuperTypeOf(
							domainElement.eClass())) {
				return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeEditPart.VISUAL_ID;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeComponentStoryNodeCompartmentEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getComponentStoryPattern().isSuperTypeOf(
							domainElement.eClass())) {
				return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryPatternEditPart.VISUAL_ID;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartmentEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getComponentVariable().isSuperTypeOf(
							domainElement.eClass())) {
				return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariableEditPart.VISUAL_ID;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariableComponentVariableCompartmentEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getComponentPartVariable().isSuperTypeOf(
							domainElement.eClass())) {
				return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.PartVariableEditPart.VISUAL_ID;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartmentEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getSinglePortVariable().isSuperTypeOf(
							domainElement.eClass())) {
				return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableEditPart.VISUAL_ID;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartment2EditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getSinglePortVariable().isSuperTypeOf(
							domainElement.eClass())) {
				return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableEditPart.VISUAL_ID;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeControllerExchangeNodeFadingFunctionsCompartmentEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getComponentStoryPattern().isSuperTypeOf(
							domainElement.eClass())) {
				return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryPattern2EditPart.VISUAL_ID;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartment2EditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getComponentVariable().isSuperTypeOf(
							domainElement.eClass())) {
				return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariable2EditPart.VISUAL_ID;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariableComponentVariableCompartment2EditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getComponentPartVariable().isSuperTypeOf(
							domainElement.eClass())) {
				return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.PartVariableEditPart.VISUAL_ID;
			}
			if (org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getFadingComponentPartVariable().isSuperTypeOf(
							domainElement.eClass())) {
				return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.FadingComponentPartVariableEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry
				.getModelID(containerView);
		if (!org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryRuleEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryRuleEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryRuleEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryRuleEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityActivityCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeComponentStoryNodeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryPatternEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariableEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariableOperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariableComponentVariableCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariable2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariable3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.PartVariableEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariable2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.PortVariableOperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.UnderlinedLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariable2EditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.PortVariableOperator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.UnderlinedLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariable2EditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.PortVariableOperator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.UnderlinedLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariable3EditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.PortVariableOperator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.UnderlinedLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityFinalNodeEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeControllerExchangeNodeFadingFunctionsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryPattern2EditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariable2EditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariableOperator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariableComponentVariableCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariable2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariable3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.FadingComponentPartVariableEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariable2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityActivityCompartmentEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.JunctionNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityFinalNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeComponentStoryNodeCompartmentEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartmentEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariableComponentVariableCompartmentEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.PartVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartmentEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartment2EditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeControllerExchangeNodeFadingFunctionsCompartmentEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryPattern2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartment2EditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariable2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariableComponentVariableCompartment2EditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.PartVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.FadingComponentPartVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityEdgeGuardEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.AssemblyVariableEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.AssemblyVariableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.DelegationVariableEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.DelegationVariableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortOrderConstraintEditPart.VISUAL_ID:
			if (org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortOrderConstraintOrderConstraintTypeEditPart.VISUAL_ID == nodeVisualID) {
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
		if (ActivitiesPackage.eINSTANCE.getActivityEdge().isSuperTypeOf(
				domainElement.eClass())) {
			return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID;
		}
		if (org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
				.getAssemblyVariable().isSuperTypeOf(domainElement.eClass())) {
			return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.AssemblyVariableEditPart.VISUAL_ID;
		}
		if (org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
				.getDelegationVariable().isSuperTypeOf(domainElement.eClass())) {
			return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.DelegationVariableEditPart.VISUAL_ID;
		}
		if (org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
				.getMultiPortOrderConstraint().isSuperTypeOf(
						domainElement.eClass())) {
			return org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortOrderConstraintEditPart.VISUAL_ID;
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
			org.muml.reconfiguration.componentstorydiagram.ComponentStoryRule element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean isSinglePortVariable_3018(
			org.muml.reconfiguration.componentstorypattern.SinglePortVariable domainElement) {
		Object result = org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
				.getExpression(
						8,
						org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
								.getSinglePortVariable(), null).evaluate(
						domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isSinglePortVariable_3020(
			org.muml.reconfiguration.componentstorypattern.SinglePortVariable domainElement) {
		Object result = org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory
				.getExpression(
						8,
						org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
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
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityActivityCompartmentEditPart.VISUAL_ID:
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeComponentStoryNodeCompartmentEditPart.VISUAL_ID:
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartmentEditPart.VISUAL_ID:
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariableComponentVariableCompartmentEditPart.VISUAL_ID:
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartmentEditPart.VISUAL_ID:
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartment2EditPart.VISUAL_ID:
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeControllerExchangeNodeFadingFunctionsCompartmentEditPart.VISUAL_ID:
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartment2EditPart.VISUAL_ID:
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariableComponentVariableCompartment2EditPart.VISUAL_ID:
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
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryRuleEditPart.VISUAL_ID:
			return false;
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.JunctionNodeEditPart.VISUAL_ID:
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityFinalNodeEditPart.VISUAL_ID:
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableEditPart.VISUAL_ID:
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariable2EditPart.VISUAL_ID:
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariable3EditPart.VISUAL_ID:
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
			return org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
