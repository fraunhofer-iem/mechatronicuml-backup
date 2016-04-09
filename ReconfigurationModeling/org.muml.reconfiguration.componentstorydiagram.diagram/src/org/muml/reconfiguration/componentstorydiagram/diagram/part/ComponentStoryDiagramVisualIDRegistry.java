package org.muml.reconfiguration.componentstorydiagram.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import org.muml.reconfiguration.componentstorydiagram.ComponentStoryRule;
import org.muml.reconfiguration.componentstorydiagram.ComponentstorydiagramPackage;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityActivityCompartmentEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityEdgeEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityEdgeGuardEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityFinalNodeEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityNameEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.AssemblyVariableEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.AssemblyVariableNameEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeComponentStoryNodeCompartmentEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeNameEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryPattern2EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartment2EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartmentEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryPatternEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryRuleEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariable2EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariableComponentVariableCompartment2EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariableComponentVariableCompartmentEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariableEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariableNameEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariableOperator2EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariableOperatorEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeControllerExchangeNodeFadingFunctionsCompartmentEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeNameEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.DelegationVariableEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.DelegationVariableNameEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.FadingComponentPartVariableEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.InitialNodeEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.JunctionNodeEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortOrderConstraintEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortOrderConstraintOrderConstraintTypeEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariable2EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartment2EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartmentEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableName2EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableNameEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.PartVariableEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.PortVariableOperator2EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.PortVariableOperator3EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.PortVariableOperator4EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.PortVariableOperatorEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariable2EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariable3EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableName2EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableNameEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.UnderlinedLabel2EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.UnderlinedLabel3EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.UnderlinedLabel4EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.UnderlinedLabelEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.WrappingLabel2EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.WrappingLabel3EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.WrappingLabel4EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.WrappingLabel5EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.WrappingLabel6EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.WrappingLabel7EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.WrappingLabel8EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.WrappingLabel9EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.WrappingLabelEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory;
import org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage;
import org.muml.reconfiguration.componentstorypattern.SinglePortVariable;
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
	private static final String DEBUG_KEY = "org.muml.reconfiguration.componentstorydiagram.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ComponentStoryRuleEditPart.MODEL_ID.equals(view.getType())) {
				return ComponentStoryRuleEditPart.VISUAL_ID;
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
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				ComponentStoryDiagramDiagramEditorPlugin.getInstance()
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
		if (ComponentstorydiagramPackage.eINSTANCE.getComponentStoryRule().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ComponentStoryRule) domainElement)) {
			return ComponentStoryRuleEditPart.VISUAL_ID;
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
		if (!ComponentStoryRuleEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ComponentStoryRuleEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ComponentStoryRuleEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ComponentStoryRuleEditPart.VISUAL_ID:
			if (ActivitiesPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
				return ActivityEditPart.VISUAL_ID;
			}
			break;
		case ComponentVariableEditPart.VISUAL_ID:
			if (ComponentstorypatternPackage.eINSTANCE.getMultiPortVariable().isSuperTypeOf(domainElement.eClass())) {
				return MultiPortVariable2EditPart.VISUAL_ID;
			}
			if (ComponentstorypatternPackage.eINSTANCE.getSinglePortVariable().isSuperTypeOf(domainElement.eClass())
					&& isSinglePortVariable_3020((SinglePortVariable) domainElement)) {
				return SinglePortVariable3EditPart.VISUAL_ID;
			}
			break;
		case PartVariableEditPart.VISUAL_ID:
			if (ComponentstorypatternPackage.eINSTANCE.getMultiPortVariable().isSuperTypeOf(domainElement.eClass())) {
				return MultiPortVariableEditPart.VISUAL_ID;
			}
			if (ComponentstorypatternPackage.eINSTANCE.getSinglePortVariable().isSuperTypeOf(domainElement.eClass())
					&& isSinglePortVariable_3018((SinglePortVariable) domainElement)) {
				return SinglePortVariable2EditPart.VISUAL_ID;
			}
			break;
		case ComponentVariable2EditPart.VISUAL_ID:
			if (ComponentstorypatternPackage.eINSTANCE.getMultiPortVariable().isSuperTypeOf(domainElement.eClass())) {
				return MultiPortVariable2EditPart.VISUAL_ID;
			}
			if (ComponentstorypatternPackage.eINSTANCE.getSinglePortVariable().isSuperTypeOf(domainElement.eClass())
					&& isSinglePortVariable_3020((SinglePortVariable) domainElement)) {
				return SinglePortVariable3EditPart.VISUAL_ID;
			}
			break;
		case FadingComponentPartVariableEditPart.VISUAL_ID:
			if (ComponentstorypatternPackage.eINSTANCE.getMultiPortVariable().isSuperTypeOf(domainElement.eClass())) {
				return MultiPortVariableEditPart.VISUAL_ID;
			}
			if (ComponentstorypatternPackage.eINSTANCE.getSinglePortVariable().isSuperTypeOf(domainElement.eClass())
					&& isSinglePortVariable_3018((SinglePortVariable) domainElement)) {
				return SinglePortVariable2EditPart.VISUAL_ID;
			}
			break;
		case ActivityActivityCompartmentEditPart.VISUAL_ID:
			if (ComponentstorydiagramPackage.eINSTANCE.getComponentStoryNode().isSuperTypeOf(domainElement.eClass())) {
				return ComponentStoryNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getInitialNode().isSuperTypeOf(domainElement.eClass())) {
				return InitialNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getJunctionNode().isSuperTypeOf(domainElement.eClass())) {
				return JunctionNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass())) {
				return ActivityFinalNodeEditPart.VISUAL_ID;
			}
			if (ComponentstorydiagramPackage.eINSTANCE.getControllerExchangeNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControllerExchangeNodeEditPart.VISUAL_ID;
			}
			break;
		case ComponentStoryNodeComponentStoryNodeCompartmentEditPart.VISUAL_ID:
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
				return PartVariableEditPart.VISUAL_ID;
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
		case ControllerExchangeNodeControllerExchangeNodeFadingFunctionsCompartmentEditPart.VISUAL_ID:
			if (ComponentstorypatternPackage.eINSTANCE.getComponentStoryPattern()
					.isSuperTypeOf(domainElement.eClass())) {
				return ComponentStoryPattern2EditPart.VISUAL_ID;
			}
			break;
		case ComponentStoryPatternComponentStoryPatternCompartment2EditPart.VISUAL_ID:
			if (ComponentstorypatternPackage.eINSTANCE.getComponentVariable().isSuperTypeOf(domainElement.eClass())) {
				return ComponentVariable2EditPart.VISUAL_ID;
			}
			break;
		case ComponentVariableComponentVariableCompartment2EditPart.VISUAL_ID:
			if (ComponentstorypatternPackage.eINSTANCE.getComponentPartVariable()
					.isSuperTypeOf(domainElement.eClass())) {
				return PartVariableEditPart.VISUAL_ID;
			}
			if (ComponentstorypatternPackage.eINSTANCE.getFadingComponentPartVariable()
					.isSuperTypeOf(domainElement.eClass())) {
				return FadingComponentPartVariableEditPart.VISUAL_ID;
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
		if (!ComponentStoryRuleEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ComponentStoryRuleEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ComponentStoryRuleEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ComponentStoryRuleEditPart.VISUAL_ID:
			if (ActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityEditPart.VISUAL_ID:
			if (ActivityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityActivityCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentStoryNodeEditPart.VISUAL_ID:
			if (ComponentStoryNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentStoryNodeComponentStoryNodeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
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
			if (ComponentVariableNameEditPart.VISUAL_ID == nodeVisualID) {
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
		case PartVariableEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
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
		case ActivityFinalNodeEditPart.VISUAL_ID:
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControllerExchangeNodeEditPart.VISUAL_ID:
			if (ControllerExchangeNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControllerExchangeNodeControllerExchangeNodeFadingFunctionsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentStoryPattern2EditPart.VISUAL_ID:
			if (ComponentStoryPatternComponentStoryPatternCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentVariable2EditPart.VISUAL_ID:
			if (ComponentVariableOperator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentVariableComponentVariableCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiPortVariable2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SinglePortVariable3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FadingComponentPartVariableEditPart.VISUAL_ID:
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiPortVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SinglePortVariable2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityActivityCompartmentEditPart.VISUAL_ID:
			if (ComponentStoryNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitialNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JunctionNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityFinalNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControllerExchangeNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentStoryNodeComponentStoryNodeCompartmentEditPart.VISUAL_ID:
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
			if (PartVariableEditPart.VISUAL_ID == nodeVisualID) {
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
		case ControllerExchangeNodeControllerExchangeNodeFadingFunctionsCompartmentEditPart.VISUAL_ID:
			if (ComponentStoryPattern2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentStoryPatternComponentStoryPatternCompartment2EditPart.VISUAL_ID:
			if (ComponentVariable2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentVariableComponentVariableCompartment2EditPart.VISUAL_ID:
			if (PartVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FadingComponentPartVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityEdgeEditPart.VISUAL_ID:
			if (ActivityEdgeGuardEditPart.VISUAL_ID == nodeVisualID) {
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
			if (MultiPortOrderConstraintOrderConstraintTypeEditPart.VISUAL_ID == nodeVisualID) {
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
		if (ActivitiesPackage.eINSTANCE.getActivityEdge().isSuperTypeOf(domainElement.eClass())) {
			return ActivityEdgeEditPart.VISUAL_ID;
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
	private static boolean isDiagram(ComponentStoryRule element) {
		return true;
	}

	/**
	* @generated
	*/
	private static boolean isSinglePortVariable_3018(SinglePortVariable domainElement) {
		Object result = ComponentStoryDiagramOCLFactory
				.getExpression(8, ComponentstorypatternPackage.eINSTANCE.getSinglePortVariable(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	* @generated
	*/
	private static boolean isSinglePortVariable_3020(SinglePortVariable domainElement) {
		Object result = ComponentStoryDiagramOCLFactory
				.getExpression(8, ComponentstorypatternPackage.eINSTANCE.getSinglePortVariable(), null)
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
		case ActivityActivityCompartmentEditPart.VISUAL_ID:
		case ComponentStoryNodeComponentStoryNodeCompartmentEditPart.VISUAL_ID:
		case ComponentStoryPatternComponentStoryPatternCompartmentEditPart.VISUAL_ID:
		case ComponentVariableComponentVariableCompartmentEditPart.VISUAL_ID:
		case MultiPortVariableMultiPortVariablesCompartmentEditPart.VISUAL_ID:
		case MultiPortVariableMultiPortVariablesCompartment2EditPart.VISUAL_ID:
		case ControllerExchangeNodeControllerExchangeNodeFadingFunctionsCompartmentEditPart.VISUAL_ID:
		case ComponentStoryPatternComponentStoryPatternCompartment2EditPart.VISUAL_ID:
		case ComponentVariableComponentVariableCompartment2EditPart.VISUAL_ID:
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
		case ComponentStoryRuleEditPart.VISUAL_ID:
			return false;
		case InitialNodeEditPart.VISUAL_ID:
		case JunctionNodeEditPart.VISUAL_ID:
		case ActivityFinalNodeEditPart.VISUAL_ID:
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

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
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
