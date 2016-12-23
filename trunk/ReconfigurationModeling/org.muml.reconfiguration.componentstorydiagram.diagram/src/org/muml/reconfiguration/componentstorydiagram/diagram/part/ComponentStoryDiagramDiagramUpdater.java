package org.muml.reconfiguration.componentstorydiagram.diagram.part;

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
import org.muml.pim.connector.ConnectorEndpoint;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.reconfiguration.componentstorydiagram.ComponentStoryNode;
import org.muml.reconfiguration.componentstorydiagram.ComponentStoryRule;
import org.muml.reconfiguration.componentstorydiagram.ControllerExchangeNode;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityActivityCompartmentEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityEdgeEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityFinalNodeEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.AssemblyVariableEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeComponentStoryNodeCompartmentEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryPattern2EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartment2EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartmentEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryPatternEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryRuleEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariable2EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariableComponentVariableCompartment2EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariableComponentVariableCompartmentEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariableEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeControllerExchangeNodeFadingFunctionsCompartmentEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.DelegationVariableEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.FadingComponentPartVariableEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.InitialNodeEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.JunctionNodeEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortOrderConstraintEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariable2EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartment2EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartmentEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.PartVariableEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariable2EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariable3EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes;
import org.muml.reconfiguration.componentstorypattern.AssemblyVariable;
import org.muml.reconfiguration.componentstorypattern.ComponentPartVariable;
import org.muml.reconfiguration.componentstorypattern.ComponentStoryPattern;
import org.muml.reconfiguration.componentstorypattern.ComponentVariable;
import org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage;
import org.muml.reconfiguration.componentstorypattern.DelegationVariable;
import org.muml.reconfiguration.componentstorypattern.FadingComponentPartVariable;
import org.muml.reconfiguration.componentstorypattern.MultiPortOrderConstraint;
import org.muml.reconfiguration.componentstorypattern.MultiPortVariable;
import org.muml.reconfiguration.componentstorypattern.PartVariable;
import org.muml.reconfiguration.componentstorypattern.PortVariable;
import org.muml.reconfiguration.componentstorypattern.SinglePortVariable;
import org.muml.storydiagram.activities.ActivitiesPackage;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.activities.ActivityEdge;
import org.muml.storydiagram.activities.ActivityFinalNode;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.activities.InitialNode;
import org.muml.storydiagram.activities.JunctionNode;

/**
 * @generated
 */
public class ComponentStoryDiagramDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramNodeDescriptor> getSemanticChildren(View view) {
		switch (ComponentStoryDiagramVisualIDRegistry.getVisualID(view)) {
		case ComponentStoryRuleEditPart.VISUAL_ID:
			return getComponentStoryRule_1000SemanticChildren(view);
		case ComponentVariableEditPart.VISUAL_ID:
			return getComponentVariable_3012SemanticChildren(view);
		case PartVariableEditPart.VISUAL_ID:
			return getComponentPartVariable_3014SemanticChildren(view);
		case ComponentVariable2EditPart.VISUAL_ID:
			return getComponentVariable_3023SemanticChildren(view);
		case FadingComponentPartVariableEditPart.VISUAL_ID:
			return getFadingComponentPartVariable_3024SemanticChildren(view);
		case ActivityActivityCompartmentEditPart.VISUAL_ID:
			return getActivityActivityCompartment_7001SemanticChildren(view);
		case ComponentStoryNodeComponentStoryNodeCompartmentEditPart.VISUAL_ID:
			return getComponentStoryNodeComponentStoryNodeCompartment_7002SemanticChildren(view);
		case ComponentStoryPatternComponentStoryPatternCompartmentEditPart.VISUAL_ID:
			return getComponentStoryPatternComponentStoryPatternCompartment_7005SemanticChildren(view);
		case ComponentVariableComponentVariableCompartmentEditPart.VISUAL_ID:
			return getComponentVariableComponentVariableCompartment_7006SemanticChildren(view);
		case MultiPortVariableMultiPortVariablesCompartmentEditPart.VISUAL_ID:
			return getMultiPortVariableMultiPortVariablesCompartment_7007SemanticChildren(view);
		case MultiPortVariableMultiPortVariablesCompartment2EditPart.VISUAL_ID:
			return getMultiPortVariableMultiPortVariablesCompartment_7008SemanticChildren(view);
		case ControllerExchangeNodeControllerExchangeNodeFadingFunctionsCompartmentEditPart.VISUAL_ID:
			return getControllerExchangeNodeControllerExchangeNodeCompartment_7009SemanticChildren(view);
		case ComponentStoryPatternComponentStoryPatternCompartment2EditPart.VISUAL_ID:
			return getComponentStoryPatternComponentStoryPatternCompartment_7012SemanticChildren(view);
		case ComponentVariableComponentVariableCompartment2EditPart.VISUAL_ID:
			return getComponentVariableComponentVariableCompartment_7013SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramNodeDescriptor> getComponentStoryRule_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ComponentStoryRule modelElement = (ComponentStoryRule) view.getElement();
		LinkedList<ComponentStoryDiagramNodeDescriptor> result = new LinkedList<ComponentStoryDiagramNodeDescriptor>();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = ComponentStoryDiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ActivityEditPart.VISUAL_ID) {
				result.add(new ComponentStoryDiagramNodeDescriptor(childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramNodeDescriptor> getComponentVariable_3012SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ComponentVariable modelElement = (ComponentVariable) view.getElement();
		LinkedList<ComponentStoryDiagramNodeDescriptor> result = new LinkedList<ComponentStoryDiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortVariables().iterator(); it.hasNext();) {
			PortVariable childElement = (PortVariable) it.next();
			int visualID = ComponentStoryDiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MultiPortVariable2EditPart.VISUAL_ID) {
				result.add(new ComponentStoryDiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SinglePortVariable3EditPart.VISUAL_ID) {
				result.add(new ComponentStoryDiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramNodeDescriptor> getComponentPartVariable_3014SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ComponentPartVariable modelElement = (ComponentPartVariable) view.getElement();
		LinkedList<ComponentStoryDiagramNodeDescriptor> result = new LinkedList<ComponentStoryDiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortVariables().iterator(); it.hasNext();) {
			PortVariable childElement = (PortVariable) it.next();
			int visualID = ComponentStoryDiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MultiPortVariableEditPart.VISUAL_ID) {
				result.add(new ComponentStoryDiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SinglePortVariable2EditPart.VISUAL_ID) {
				result.add(new ComponentStoryDiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramNodeDescriptor> getComponentVariable_3023SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ComponentVariable modelElement = (ComponentVariable) view.getElement();
		LinkedList<ComponentStoryDiagramNodeDescriptor> result = new LinkedList<ComponentStoryDiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortVariables().iterator(); it.hasNext();) {
			PortVariable childElement = (PortVariable) it.next();
			int visualID = ComponentStoryDiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MultiPortVariable2EditPart.VISUAL_ID) {
				result.add(new ComponentStoryDiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SinglePortVariable3EditPart.VISUAL_ID) {
				result.add(new ComponentStoryDiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramNodeDescriptor> getFadingComponentPartVariable_3024SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		FadingComponentPartVariable modelElement = (FadingComponentPartVariable) view.getElement();
		LinkedList<ComponentStoryDiagramNodeDescriptor> result = new LinkedList<ComponentStoryDiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortVariables().iterator(); it.hasNext();) {
			PortVariable childElement = (PortVariable) it.next();
			int visualID = ComponentStoryDiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MultiPortVariableEditPart.VISUAL_ID) {
				result.add(new ComponentStoryDiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SinglePortVariable2EditPart.VISUAL_ID) {
				result.add(new ComponentStoryDiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramNodeDescriptor> getActivityActivityCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Activity modelElement = (Activity) containerView.getElement();
		LinkedList<ComponentStoryDiagramNodeDescriptor> result = new LinkedList<ComponentStoryDiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedActivityNodes().iterator(); it.hasNext();) {
			ActivityNode childElement = (ActivityNode) it.next();
			int visualID = ComponentStoryDiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ComponentStoryNodeEditPart.VISUAL_ID) {
				result.add(new ComponentStoryDiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InitialNodeEditPart.VISUAL_ID) {
				result.add(new ComponentStoryDiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JunctionNodeEditPart.VISUAL_ID) {
				result.add(new ComponentStoryDiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityFinalNodeEditPart.VISUAL_ID) {
				result.add(new ComponentStoryDiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ControllerExchangeNodeEditPart.VISUAL_ID) {
				result.add(new ComponentStoryDiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramNodeDescriptor> getComponentStoryNodeComponentStoryNodeCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ComponentStoryNode modelElement = (ComponentStoryNode) containerView.getElement();
		LinkedList<ComponentStoryDiagramNodeDescriptor> result = new LinkedList<ComponentStoryDiagramNodeDescriptor>();
		{
			ComponentStoryPattern childElement = modelElement.getComponentStoryPattern();
			int visualID = ComponentStoryDiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ComponentStoryPatternEditPart.VISUAL_ID) {
				result.add(new ComponentStoryDiagramNodeDescriptor(childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramNodeDescriptor> getComponentStoryPatternComponentStoryPatternCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ComponentStoryPattern modelElement = (ComponentStoryPattern) containerView.getElement();
		LinkedList<ComponentStoryDiagramNodeDescriptor> result = new LinkedList<ComponentStoryDiagramNodeDescriptor>();
		{
			ComponentVariable childElement = modelElement.getThisVariable();
			int visualID = ComponentStoryDiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ComponentVariableEditPart.VISUAL_ID) {
				result.add(new ComponentStoryDiagramNodeDescriptor(childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramNodeDescriptor> getComponentVariableComponentVariableCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ComponentVariable modelElement = (ComponentVariable) containerView.getElement();
		LinkedList<ComponentStoryDiagramNodeDescriptor> result = new LinkedList<ComponentStoryDiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPartVariables().iterator(); it.hasNext();) {
			PartVariable childElement = (PartVariable) it.next();
			int visualID = ComponentStoryDiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PartVariableEditPart.VISUAL_ID) {
				result.add(new ComponentStoryDiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramNodeDescriptor> getMultiPortVariableMultiPortVariablesCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MultiPortVariable modelElement = (MultiPortVariable) containerView.getElement();
		LinkedList<ComponentStoryDiagramNodeDescriptor> result = new LinkedList<ComponentStoryDiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGmfSubPortVariables().iterator(); it.hasNext();) {
			SinglePortVariable childElement = (SinglePortVariable) it.next();
			int visualID = ComponentStoryDiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SinglePortVariableEditPart.VISUAL_ID) {
				result.add(new ComponentStoryDiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramNodeDescriptor> getMultiPortVariableMultiPortVariablesCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MultiPortVariable modelElement = (MultiPortVariable) containerView.getElement();
		LinkedList<ComponentStoryDiagramNodeDescriptor> result = new LinkedList<ComponentStoryDiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGmfSubPortVariables().iterator(); it.hasNext();) {
			SinglePortVariable childElement = (SinglePortVariable) it.next();
			int visualID = ComponentStoryDiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SinglePortVariableEditPart.VISUAL_ID) {
				result.add(new ComponentStoryDiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramNodeDescriptor> getControllerExchangeNodeControllerExchangeNodeCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ControllerExchangeNode modelElement = (ControllerExchangeNode) containerView.getElement();
		LinkedList<ComponentStoryDiagramNodeDescriptor> result = new LinkedList<ComponentStoryDiagramNodeDescriptor>();
		{
			ComponentStoryPattern childElement = modelElement.getComponentStoryPattern();
			int visualID = ComponentStoryDiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ComponentStoryPattern2EditPart.VISUAL_ID) {
				result.add(new ComponentStoryDiagramNodeDescriptor(childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramNodeDescriptor> getComponentStoryPatternComponentStoryPatternCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ComponentStoryPattern modelElement = (ComponentStoryPattern) containerView.getElement();
		LinkedList<ComponentStoryDiagramNodeDescriptor> result = new LinkedList<ComponentStoryDiagramNodeDescriptor>();
		{
			ComponentVariable childElement = modelElement.getThisVariable();
			int visualID = ComponentStoryDiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ComponentVariable2EditPart.VISUAL_ID) {
				result.add(new ComponentStoryDiagramNodeDescriptor(childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramNodeDescriptor> getComponentVariableComponentVariableCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ComponentVariable modelElement = (ComponentVariable) containerView.getElement();
		LinkedList<ComponentStoryDiagramNodeDescriptor> result = new LinkedList<ComponentStoryDiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPartVariables().iterator(); it.hasNext();) {
			PartVariable childElement = (PartVariable) it.next();
			int visualID = ComponentStoryDiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PartVariableEditPart.VISUAL_ID) {
				result.add(new ComponentStoryDiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FadingComponentPartVariableEditPart.VISUAL_ID) {
				result.add(new ComponentStoryDiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getContainedLinks(View view) {
		switch (ComponentStoryDiagramVisualIDRegistry.getVisualID(view)) {
		case ComponentStoryRuleEditPart.VISUAL_ID:
			return getComponentStoryRule_1000ContainedLinks(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2003ContainedLinks(view);
		case ComponentStoryNodeEditPart.VISUAL_ID:
			return getComponentStoryNode_3001ContainedLinks(view);
		case ComponentStoryPatternEditPart.VISUAL_ID:
			return getComponentStoryPattern_3011ContainedLinks(view);
		case ComponentVariableEditPart.VISUAL_ID:
			return getComponentVariable_3012ContainedLinks(view);
		case PartVariableEditPart.VISUAL_ID:
			return getComponentPartVariable_3014ContainedLinks(view);
		case MultiPortVariableEditPart.VISUAL_ID:
			return getMultiPortVariable_3016ContainedLinks(view);
		case SinglePortVariableEditPart.VISUAL_ID:
			return getSinglePortVariable_3017ContainedLinks(view);
		case SinglePortVariable2EditPart.VISUAL_ID:
			return getSinglePortVariable_3018ContainedLinks(view);
		case MultiPortVariable2EditPart.VISUAL_ID:
			return getMultiPortVariable_3019ContainedLinks(view);
		case SinglePortVariable3EditPart.VISUAL_ID:
			return getSinglePortVariable_3020ContainedLinks(view);
		case InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_3007ContainedLinks(view);
		case JunctionNodeEditPart.VISUAL_ID:
			return getJunctionNode_3008ContainedLinks(view);
		case ActivityFinalNodeEditPart.VISUAL_ID:
			return getActivityFinalNode_3010ContainedLinks(view);
		case ControllerExchangeNodeEditPart.VISUAL_ID:
			return getControllerExchangeNode_3021ContainedLinks(view);
		case ComponentStoryPattern2EditPart.VISUAL_ID:
			return getComponentStoryPattern_3022ContainedLinks(view);
		case ComponentVariable2EditPart.VISUAL_ID:
			return getComponentVariable_3023ContainedLinks(view);
		case FadingComponentPartVariableEditPart.VISUAL_ID:
			return getFadingComponentPartVariable_3024ContainedLinks(view);
		case ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4001ContainedLinks(view);
		case AssemblyVariableEditPart.VISUAL_ID:
			return getAssemblyVariable_4004ContainedLinks(view);
		case DelegationVariableEditPart.VISUAL_ID:
			return getDelegationVariable_4005ContainedLinks(view);
		case MultiPortOrderConstraintEditPart.VISUAL_ID:
			return getMultiPortOrderConstraint_4006ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getIncomingLinks(View view) {
		switch (ComponentStoryDiagramVisualIDRegistry.getVisualID(view)) {
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2003IncomingLinks(view);
		case ComponentStoryNodeEditPart.VISUAL_ID:
			return getComponentStoryNode_3001IncomingLinks(view);
		case ComponentStoryPatternEditPart.VISUAL_ID:
			return getComponentStoryPattern_3011IncomingLinks(view);
		case ComponentVariableEditPart.VISUAL_ID:
			return getComponentVariable_3012IncomingLinks(view);
		case PartVariableEditPart.VISUAL_ID:
			return getComponentPartVariable_3014IncomingLinks(view);
		case MultiPortVariableEditPart.VISUAL_ID:
			return getMultiPortVariable_3016IncomingLinks(view);
		case SinglePortVariableEditPart.VISUAL_ID:
			return getSinglePortVariable_3017IncomingLinks(view);
		case SinglePortVariable2EditPart.VISUAL_ID:
			return getSinglePortVariable_3018IncomingLinks(view);
		case MultiPortVariable2EditPart.VISUAL_ID:
			return getMultiPortVariable_3019IncomingLinks(view);
		case SinglePortVariable3EditPart.VISUAL_ID:
			return getSinglePortVariable_3020IncomingLinks(view);
		case InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_3007IncomingLinks(view);
		case JunctionNodeEditPart.VISUAL_ID:
			return getJunctionNode_3008IncomingLinks(view);
		case ActivityFinalNodeEditPart.VISUAL_ID:
			return getActivityFinalNode_3010IncomingLinks(view);
		case ControllerExchangeNodeEditPart.VISUAL_ID:
			return getControllerExchangeNode_3021IncomingLinks(view);
		case ComponentStoryPattern2EditPart.VISUAL_ID:
			return getComponentStoryPattern_3022IncomingLinks(view);
		case ComponentVariable2EditPart.VISUAL_ID:
			return getComponentVariable_3023IncomingLinks(view);
		case FadingComponentPartVariableEditPart.VISUAL_ID:
			return getFadingComponentPartVariable_3024IncomingLinks(view);
		case ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4001IncomingLinks(view);
		case AssemblyVariableEditPart.VISUAL_ID:
			return getAssemblyVariable_4004IncomingLinks(view);
		case DelegationVariableEditPart.VISUAL_ID:
			return getDelegationVariable_4005IncomingLinks(view);
		case MultiPortOrderConstraintEditPart.VISUAL_ID:
			return getMultiPortOrderConstraint_4006IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getOutgoingLinks(View view) {
		switch (ComponentStoryDiagramVisualIDRegistry.getVisualID(view)) {
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2003OutgoingLinks(view);
		case ComponentStoryNodeEditPart.VISUAL_ID:
			return getComponentStoryNode_3001OutgoingLinks(view);
		case ComponentStoryPatternEditPart.VISUAL_ID:
			return getComponentStoryPattern_3011OutgoingLinks(view);
		case ComponentVariableEditPart.VISUAL_ID:
			return getComponentVariable_3012OutgoingLinks(view);
		case PartVariableEditPart.VISUAL_ID:
			return getComponentPartVariable_3014OutgoingLinks(view);
		case MultiPortVariableEditPart.VISUAL_ID:
			return getMultiPortVariable_3016OutgoingLinks(view);
		case SinglePortVariableEditPart.VISUAL_ID:
			return getSinglePortVariable_3017OutgoingLinks(view);
		case SinglePortVariable2EditPart.VISUAL_ID:
			return getSinglePortVariable_3018OutgoingLinks(view);
		case MultiPortVariable2EditPart.VISUAL_ID:
			return getMultiPortVariable_3019OutgoingLinks(view);
		case SinglePortVariable3EditPart.VISUAL_ID:
			return getSinglePortVariable_3020OutgoingLinks(view);
		case InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_3007OutgoingLinks(view);
		case JunctionNodeEditPart.VISUAL_ID:
			return getJunctionNode_3008OutgoingLinks(view);
		case ActivityFinalNodeEditPart.VISUAL_ID:
			return getActivityFinalNode_3010OutgoingLinks(view);
		case ControllerExchangeNodeEditPart.VISUAL_ID:
			return getControllerExchangeNode_3021OutgoingLinks(view);
		case ComponentStoryPattern2EditPart.VISUAL_ID:
			return getComponentStoryPattern_3022OutgoingLinks(view);
		case ComponentVariable2EditPart.VISUAL_ID:
			return getComponentVariable_3023OutgoingLinks(view);
		case FadingComponentPartVariableEditPart.VISUAL_ID:
			return getFadingComponentPartVariable_3024OutgoingLinks(view);
		case ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4001OutgoingLinks(view);
		case AssemblyVariableEditPart.VISUAL_ID:
			return getAssemblyVariable_4004OutgoingLinks(view);
		case DelegationVariableEditPart.VISUAL_ID:
			return getDelegationVariable_4005OutgoingLinks(view);
		case MultiPortOrderConstraintEditPart.VISUAL_ID:
			return getMultiPortOrderConstraint_4006OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getComponentStoryRule_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getActivity_2003ContainedLinks(View view) {
		Activity modelElement = (Activity) view.getElement();
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getComponentStoryNode_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getComponentStoryPattern_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getComponentVariable_3012ContainedLinks(View view) {
		ComponentVariable modelElement = (ComponentVariable) view.getElement();
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AssemblyVariable_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DelegationVariable_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getComponentPartVariable_3014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getMultiPortVariable_3016ContainedLinks(View view) {
		MultiPortVariable modelElement = (MultiPortVariable) view.getElement();
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_MultiPortOrderConstraint_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getSinglePortVariable_3017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getSinglePortVariable_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getMultiPortVariable_3019ContainedLinks(View view) {
		MultiPortVariable modelElement = (MultiPortVariable) view.getElement();
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_MultiPortOrderConstraint_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getSinglePortVariable_3020ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getInitialNode_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getJunctionNode_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getActivityFinalNode_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getControllerExchangeNode_3021ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getComponentStoryPattern_3022ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getComponentVariable_3023ContainedLinks(View view) {
		ComponentVariable modelElement = (ComponentVariable) view.getElement();
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AssemblyVariable_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DelegationVariable_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getFadingComponentPartVariable_3024ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getActivityEdge_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getAssemblyVariable_4004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getDelegationVariable_4005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getMultiPortOrderConstraint_4006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getActivity_2003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getComponentStoryNode_3001IncomingLinks(View view) {
		ComponentStoryNode modelElement = (ComponentStoryNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getComponentStoryPattern_3011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getComponentVariable_3012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getComponentPartVariable_3014IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getMultiPortVariable_3016IncomingLinks(View view) {
		MultiPortVariable modelElement = (MultiPortVariable) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyVariable_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationVariable_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getSinglePortVariable_3017IncomingLinks(View view) {
		SinglePortVariable modelElement = (SinglePortVariable) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyVariable_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationVariable_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MultiPortOrderConstraint_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getSinglePortVariable_3018IncomingLinks(View view) {
		SinglePortVariable modelElement = (SinglePortVariable) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyVariable_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationVariable_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MultiPortOrderConstraint_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getMultiPortVariable_3019IncomingLinks(View view) {
		MultiPortVariable modelElement = (MultiPortVariable) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyVariable_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationVariable_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getSinglePortVariable_3020IncomingLinks(View view) {
		SinglePortVariable modelElement = (SinglePortVariable) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyVariable_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationVariable_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MultiPortOrderConstraint_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getInitialNode_3007IncomingLinks(View view) {
		InitialNode modelElement = (InitialNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getJunctionNode_3008IncomingLinks(View view) {
		JunctionNode modelElement = (JunctionNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getActivityFinalNode_3010IncomingLinks(View view) {
		ActivityFinalNode modelElement = (ActivityFinalNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getControllerExchangeNode_3021IncomingLinks(View view) {
		ControllerExchangeNode modelElement = (ControllerExchangeNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getComponentStoryPattern_3022IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getComponentVariable_3023IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getFadingComponentPartVariable_3024IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getActivityEdge_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getAssemblyVariable_4004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getDelegationVariable_4005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getMultiPortOrderConstraint_4006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getActivity_2003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getComponentStoryNode_3001OutgoingLinks(View view) {
		ComponentStoryNode modelElement = (ComponentStoryNode) view.getElement();
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getComponentStoryPattern_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getComponentVariable_3012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getComponentPartVariable_3014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getMultiPortVariable_3016OutgoingLinks(View view) {
		MultiPortVariable modelElement = (MultiPortVariable) view.getElement();
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyVariable_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationVariable_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getSinglePortVariable_3017OutgoingLinks(View view) {
		SinglePortVariable modelElement = (SinglePortVariable) view.getElement();
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyVariable_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationVariable_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MultiPortOrderConstraint_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getSinglePortVariable_3018OutgoingLinks(View view) {
		SinglePortVariable modelElement = (SinglePortVariable) view.getElement();
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyVariable_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationVariable_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MultiPortOrderConstraint_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getMultiPortVariable_3019OutgoingLinks(View view) {
		MultiPortVariable modelElement = (MultiPortVariable) view.getElement();
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyVariable_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationVariable_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getSinglePortVariable_3020OutgoingLinks(View view) {
		SinglePortVariable modelElement = (SinglePortVariable) view.getElement();
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyVariable_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationVariable_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MultiPortOrderConstraint_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getInitialNode_3007OutgoingLinks(View view) {
		InitialNode modelElement = (InitialNode) view.getElement();
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getJunctionNode_3008OutgoingLinks(View view) {
		JunctionNode modelElement = (JunctionNode) view.getElement();
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getActivityFinalNode_3010OutgoingLinks(View view) {
		ActivityFinalNode modelElement = (ActivityFinalNode) view.getElement();
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getControllerExchangeNode_3021OutgoingLinks(View view) {
		ControllerExchangeNode modelElement = (ControllerExchangeNode) view.getElement();
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getComponentStoryPattern_3022OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getComponentVariable_3023OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getFadingComponentPartVariable_3024OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getActivityEdge_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getAssemblyVariable_4004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getDelegationVariable_4005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentStoryDiagramLinkDescriptor> getMultiPortOrderConstraint_4006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<ComponentStoryDiagramLinkDescriptor> getContainedTypeModelFacetLinks_ActivityEdge_4001(
			Activity container) {
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		for (Iterator<?> links = container.getOwnedActivityEdges().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActivityEdge) {
				continue;
			}
			ActivityEdge link = (ActivityEdge) linkObject;
			if (ActivityEdgeEditPart.VISUAL_ID != ComponentStoryDiagramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			result.add(new ComponentStoryDiagramLinkDescriptor(src, dst, link,
					ComponentStoryDiagramElementTypes.ActivityEdge_4001, ActivityEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentStoryDiagramLinkDescriptor> getContainedTypeModelFacetLinks_AssemblyVariable_4004(
			ComponentVariable container) {
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorVariables().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AssemblyVariable) {
				continue;
			}
			AssemblyVariable link = (AssemblyVariable) linkObject;
			if (AssemblyVariableEditPart.VISUAL_ID != ComponentStoryDiagramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof ConnectorEndpoint) {
				continue;
			}
			ConnectorEndpoint dst = (ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof ConnectorEndpoint) {
				continue;
			}
			ConnectorEndpoint src = (ConnectorEndpoint) theSource;
			result.add(new ComponentStoryDiagramLinkDescriptor(src, dst, link,
					ComponentStoryDiagramElementTypes.AssemblyVariable_4004, AssemblyVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentStoryDiagramLinkDescriptor> getContainedTypeModelFacetLinks_DelegationVariable_4005(
			ComponentVariable container) {
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorVariables().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DelegationVariable) {
				continue;
			}
			DelegationVariable link = (DelegationVariable) linkObject;
			if (DelegationVariableEditPart.VISUAL_ID != ComponentStoryDiagramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof ConnectorEndpoint) {
				continue;
			}
			ConnectorEndpoint dst = (ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof ConnectorEndpoint) {
				continue;
			}
			ConnectorEndpoint src = (ConnectorEndpoint) theSource;
			result.add(new ComponentStoryDiagramLinkDescriptor(src, dst, link,
					ComponentStoryDiagramElementTypes.DelegationVariable_4005, DelegationVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentStoryDiagramLinkDescriptor> getContainedTypeModelFacetLinks_MultiPortOrderConstraint_4006(
			MultiPortVariable container) {
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		for (Iterator<?> links = container.getOrderConstraints().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MultiPortOrderConstraint) {
				continue;
			}
			MultiPortOrderConstraint link = (MultiPortOrderConstraint) linkObject;
			if (MultiPortOrderConstraintEditPart.VISUAL_ID != ComponentStoryDiagramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SinglePortVariable dst = link.getTgtSubPortVariable();
			SinglePortVariable src = link.getSrcSubPortVariable();
			result.add(new ComponentStoryDiagramLinkDescriptor(src, dst, link,
					ComponentStoryDiagramElementTypes.MultiPortOrderConstraint_4006,
					MultiPortOrderConstraintEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComponentStoryDiagramLinkDescriptor> getIncomingTypeModelFacetLinks_ActivityEdge_4001(
			ActivityNode target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ActivitiesPackage.eINSTANCE.getActivityEdge_Target()
					|| false == setting.getEObject() instanceof ActivityEdge) {
				continue;
			}
			ActivityEdge link = (ActivityEdge) setting.getEObject();
			if (ActivityEdgeEditPart.VISUAL_ID != ComponentStoryDiagramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode src = link.getSource();
			result.add(new ComponentStoryDiagramLinkDescriptor(src, target, link,
					ComponentStoryDiagramElementTypes.ActivityEdge_4001, ActivityEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentStoryDiagramLinkDescriptor> getIncomingTypeModelFacetLinks_AssemblyVariable_4004(
			ConnectorEndpoint target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConnectorPackage.eINSTANCE.getConnector_ConnectorEndpoints()
					|| false == setting.getEObject() instanceof AssemblyVariable) {
				continue;
			}
			AssemblyVariable link = (AssemblyVariable) setting.getEObject();
			if (AssemblyVariableEditPart.VISUAL_ID != ComponentStoryDiagramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof ConnectorEndpoint) {
				continue;
			}
			ConnectorEndpoint src = (ConnectorEndpoint) theSource;
			result.add(new ComponentStoryDiagramLinkDescriptor(src, target, link,
					ComponentStoryDiagramElementTypes.AssemblyVariable_4004, AssemblyVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentStoryDiagramLinkDescriptor> getIncomingTypeModelFacetLinks_DelegationVariable_4005(
			ConnectorEndpoint target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConnectorPackage.eINSTANCE.getConnector_ConnectorEndpoints()
					|| false == setting.getEObject() instanceof DelegationVariable) {
				continue;
			}
			DelegationVariable link = (DelegationVariable) setting.getEObject();
			if (DelegationVariableEditPart.VISUAL_ID != ComponentStoryDiagramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof ConnectorEndpoint) {
				continue;
			}
			ConnectorEndpoint src = (ConnectorEndpoint) theSource;
			result.add(new ComponentStoryDiagramLinkDescriptor(src, target, link,
					ComponentStoryDiagramElementTypes.DelegationVariable_4005, DelegationVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentStoryDiagramLinkDescriptor> getIncomingTypeModelFacetLinks_MultiPortOrderConstraint_4006(
			SinglePortVariable target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ComponentstorypatternPackage.eINSTANCE
					.getMultiPortOrderConstraint_TgtSubPortVariable()
					|| false == setting.getEObject() instanceof MultiPortOrderConstraint) {
				continue;
			}
			MultiPortOrderConstraint link = (MultiPortOrderConstraint) setting.getEObject();
			if (MultiPortOrderConstraintEditPart.VISUAL_ID != ComponentStoryDiagramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SinglePortVariable src = link.getSrcSubPortVariable();
			result.add(new ComponentStoryDiagramLinkDescriptor(src, target, link,
					ComponentStoryDiagramElementTypes.MultiPortOrderConstraint_4006,
					MultiPortOrderConstraintEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComponentStoryDiagramLinkDescriptor> getOutgoingTypeModelFacetLinks_ActivityEdge_4001(
			ActivityNode source) {
		Activity container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Activity) {
				container = (Activity) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		for (Iterator<?> links = container.getOwnedActivityEdges().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActivityEdge) {
				continue;
			}
			ActivityEdge link = (ActivityEdge) linkObject;
			if (ActivityEdgeEditPart.VISUAL_ID != ComponentStoryDiagramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ComponentStoryDiagramLinkDescriptor(src, dst, link,
					ComponentStoryDiagramElementTypes.ActivityEdge_4001, ActivityEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentStoryDiagramLinkDescriptor> getOutgoingTypeModelFacetLinks_AssemblyVariable_4004(
			ConnectorEndpoint source) {
		ComponentVariable container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ComponentVariable) {
				container = (ComponentVariable) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorVariables().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AssemblyVariable) {
				continue;
			}
			AssemblyVariable link = (AssemblyVariable) linkObject;
			if (AssemblyVariableEditPart.VISUAL_ID != ComponentStoryDiagramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof ConnectorEndpoint) {
				continue;
			}
			ConnectorEndpoint dst = (ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof ConnectorEndpoint) {
				continue;
			}
			ConnectorEndpoint src = (ConnectorEndpoint) theSource;
			if (src != source) {
				continue;
			}
			result.add(new ComponentStoryDiagramLinkDescriptor(src, dst, link,
					ComponentStoryDiagramElementTypes.AssemblyVariable_4004, AssemblyVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentStoryDiagramLinkDescriptor> getOutgoingTypeModelFacetLinks_DelegationVariable_4005(
			ConnectorEndpoint source) {
		ComponentVariable container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ComponentVariable) {
				container = (ComponentVariable) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorVariables().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DelegationVariable) {
				continue;
			}
			DelegationVariable link = (DelegationVariable) linkObject;
			if (DelegationVariableEditPart.VISUAL_ID != ComponentStoryDiagramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof ConnectorEndpoint) {
				continue;
			}
			ConnectorEndpoint dst = (ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof ConnectorEndpoint) {
				continue;
			}
			ConnectorEndpoint src = (ConnectorEndpoint) theSource;
			if (src != source) {
				continue;
			}
			result.add(new ComponentStoryDiagramLinkDescriptor(src, dst, link,
					ComponentStoryDiagramElementTypes.DelegationVariable_4005, DelegationVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentStoryDiagramLinkDescriptor> getOutgoingTypeModelFacetLinks_MultiPortOrderConstraint_4006(
			SinglePortVariable source) {
		MultiPortVariable container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof MultiPortVariable) {
				container = (MultiPortVariable) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ComponentStoryDiagramLinkDescriptor> result = new LinkedList<ComponentStoryDiagramLinkDescriptor>();
		for (Iterator<?> links = container.getOrderConstraints().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MultiPortOrderConstraint) {
				continue;
			}
			MultiPortOrderConstraint link = (MultiPortOrderConstraint) linkObject;
			if (MultiPortOrderConstraintEditPart.VISUAL_ID != ComponentStoryDiagramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SinglePortVariable dst = link.getTgtSubPortVariable();
			SinglePortVariable src = link.getSrcSubPortVariable();
			if (src != source) {
				continue;
			}
			result.add(new ComponentStoryDiagramLinkDescriptor(src, dst, link,
					ComponentStoryDiagramElementTypes.MultiPortOrderConstraint_4006,
					MultiPortOrderConstraintEditPart.VISUAL_ID));
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

		public List<ComponentStoryDiagramNodeDescriptor> getSemanticChildren(View view) {
			return ComponentStoryDiagramDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ComponentStoryDiagramLinkDescriptor> getContainedLinks(View view) {
			return ComponentStoryDiagramDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ComponentStoryDiagramLinkDescriptor> getIncomingLinks(View view) {
			return ComponentStoryDiagramDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ComponentStoryDiagramLinkDescriptor> getOutgoingLinks(View view) {
			return ComponentStoryDiagramDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
