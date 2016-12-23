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
import org.muml.reconfiguration.verification.sdd.componentsdd.ComponentStoryDecisionDiagram;
import org.muml.reconfiguration.verification.sdd.componentsdd.ComponentStoryPatternNode;
import org.muml.reconfiguration.verification.sdd.componentsdd.InitialNode;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.AssemblyVariableEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentPartVariableEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryDecisionDiagramEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartmentEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodePatternNodeContentCompartmentEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableComponentVariableCompartmentEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.EdgeEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.FadingComponentPartVariableEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.InitialNodeEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.LeafNodeEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortOrderConstraintEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariable2EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartment2EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartmentEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable2EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable3EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariableEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes;
import org.muml.storydiagram.verification.sdd.AbstractStoryDecisionDiagram;
import org.muml.storydiagram.verification.sdd.Edge;
import org.muml.storydiagram.verification.sdd.LeafNode;
import org.muml.storydiagram.verification.sdd.Node;
import org.muml.storydiagram.verification.sdd.SDDPackage;

/**
 * @generated
 */
public class ComponentSDDDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<ComponentSDDNodeDescriptor> getSemanticChildren(View view) {
		switch (ComponentSDDVisualIDRegistry.getVisualID(view)) {
		case ComponentStoryDecisionDiagramEditPart.VISUAL_ID:
			return getComponentStoryDecisionDiagram_1000SemanticChildren(view);
		case ComponentVariableEditPart.VISUAL_ID:
			return getComponentVariable_3002SemanticChildren(view);
		case ComponentPartVariableEditPart.VISUAL_ID:
			return getComponentPartVariable_3003SemanticChildren(view);
		case FadingComponentPartVariableEditPart.VISUAL_ID:
			return getFadingComponentPartVariable_3009SemanticChildren(view);
		case ComponentStoryPatternNodePatternNodeContentCompartmentEditPart.VISUAL_ID:
			return getComponentStoryPatternNodePatternNodeContentCompartment_7001SemanticChildren(view);
		case ComponentStoryPatternComponentStoryPatternCompartmentEditPart.VISUAL_ID:
			return getComponentStoryPatternComponentStoryPatternCompartment_7002SemanticChildren(view);
		case ComponentVariableComponentVariableCompartmentEditPart.VISUAL_ID:
			return getComponentVariableComponentVariableCompartment_7003SemanticChildren(view);
		case MultiPortVariableMultiPortVariablesCompartmentEditPart.VISUAL_ID:
			return getMultiPortVariableMultiPortVariablesCompartment_7004SemanticChildren(view);
		case MultiPortVariableMultiPortVariablesCompartment2EditPart.VISUAL_ID:
			return getMultiPortVariableMultiPortVariablesCompartment_7005SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDNodeDescriptor> getComponentStoryDecisionDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ComponentStoryDecisionDiagram modelElement = (ComponentStoryDecisionDiagram) view.getElement();
		LinkedList<ComponentSDDNodeDescriptor> result = new LinkedList<ComponentSDDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = ComponentSDDVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ComponentStoryPatternNodeEditPart.VISUAL_ID) {
				result.add(new ComponentSDDNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LeafNodeEditPart.VISUAL_ID) {
				result.add(new ComponentSDDNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InitialNodeEditPart.VISUAL_ID) {
				result.add(new ComponentSDDNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDNodeDescriptor> getComponentVariable_3002SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ComponentVariable modelElement = (ComponentVariable) view.getElement();
		LinkedList<ComponentSDDNodeDescriptor> result = new LinkedList<ComponentSDDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortVariables().iterator(); it.hasNext();) {
			PortVariable childElement = (PortVariable) it.next();
			int visualID = ComponentSDDVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MultiPortVariable2EditPart.VISUAL_ID) {
				result.add(new ComponentSDDNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SinglePortVariable3EditPart.VISUAL_ID) {
				result.add(new ComponentSDDNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDNodeDescriptor> getComponentPartVariable_3003SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ComponentPartVariable modelElement = (ComponentPartVariable) view.getElement();
		LinkedList<ComponentSDDNodeDescriptor> result = new LinkedList<ComponentSDDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortVariables().iterator(); it.hasNext();) {
			PortVariable childElement = (PortVariable) it.next();
			int visualID = ComponentSDDVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MultiPortVariableEditPart.VISUAL_ID) {
				result.add(new ComponentSDDNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SinglePortVariable2EditPart.VISUAL_ID) {
				result.add(new ComponentSDDNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDNodeDescriptor> getFadingComponentPartVariable_3009SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		FadingComponentPartVariable modelElement = (FadingComponentPartVariable) view.getElement();
		LinkedList<ComponentSDDNodeDescriptor> result = new LinkedList<ComponentSDDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortVariables().iterator(); it.hasNext();) {
			PortVariable childElement = (PortVariable) it.next();
			int visualID = ComponentSDDVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MultiPortVariableEditPart.VISUAL_ID) {
				result.add(new ComponentSDDNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SinglePortVariable2EditPart.VISUAL_ID) {
				result.add(new ComponentSDDNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDNodeDescriptor> getComponentStoryPatternNodePatternNodeContentCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ComponentStoryPatternNode modelElement = (ComponentStoryPatternNode) containerView.getElement();
		LinkedList<ComponentSDDNodeDescriptor> result = new LinkedList<ComponentSDDNodeDescriptor>();
		{
			ComponentStoryPattern childElement = modelElement.getPattern();
			int visualID = ComponentSDDVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ComponentStoryPatternEditPart.VISUAL_ID) {
				result.add(new ComponentSDDNodeDescriptor(childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDNodeDescriptor> getComponentStoryPatternComponentStoryPatternCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ComponentStoryPattern modelElement = (ComponentStoryPattern) containerView.getElement();
		LinkedList<ComponentSDDNodeDescriptor> result = new LinkedList<ComponentSDDNodeDescriptor>();
		{
			ComponentVariable childElement = modelElement.getThisVariable();
			int visualID = ComponentSDDVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ComponentVariableEditPart.VISUAL_ID) {
				result.add(new ComponentSDDNodeDescriptor(childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDNodeDescriptor> getComponentVariableComponentVariableCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ComponentVariable modelElement = (ComponentVariable) containerView.getElement();
		LinkedList<ComponentSDDNodeDescriptor> result = new LinkedList<ComponentSDDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPartVariables().iterator(); it.hasNext();) {
			PartVariable childElement = (PartVariable) it.next();
			int visualID = ComponentSDDVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ComponentPartVariableEditPart.VISUAL_ID) {
				result.add(new ComponentSDDNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FadingComponentPartVariableEditPart.VISUAL_ID) {
				result.add(new ComponentSDDNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDNodeDescriptor> getMultiPortVariableMultiPortVariablesCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MultiPortVariable modelElement = (MultiPortVariable) containerView.getElement();
		LinkedList<ComponentSDDNodeDescriptor> result = new LinkedList<ComponentSDDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGmfSubPortVariables().iterator(); it.hasNext();) {
			SinglePortVariable childElement = (SinglePortVariable) it.next();
			int visualID = ComponentSDDVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SinglePortVariableEditPart.VISUAL_ID) {
				result.add(new ComponentSDDNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDNodeDescriptor> getMultiPortVariableMultiPortVariablesCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MultiPortVariable modelElement = (MultiPortVariable) containerView.getElement();
		LinkedList<ComponentSDDNodeDescriptor> result = new LinkedList<ComponentSDDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGmfSubPortVariables().iterator(); it.hasNext();) {
			SinglePortVariable childElement = (SinglePortVariable) it.next();
			int visualID = ComponentSDDVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SinglePortVariableEditPart.VISUAL_ID) {
				result.add(new ComponentSDDNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getContainedLinks(View view) {
		switch (ComponentSDDVisualIDRegistry.getVisualID(view)) {
		case ComponentStoryDecisionDiagramEditPart.VISUAL_ID:
			return getComponentStoryDecisionDiagram_1000ContainedLinks(view);
		case ComponentStoryPatternNodeEditPart.VISUAL_ID:
			return getComponentStoryPatternNode_2003ContainedLinks(view);
		case LeafNodeEditPart.VISUAL_ID:
			return getLeafNode_2002ContainedLinks(view);
		case InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2004ContainedLinks(view);
		case ComponentStoryPatternEditPart.VISUAL_ID:
			return getComponentStoryPattern_3001ContainedLinks(view);
		case ComponentVariableEditPart.VISUAL_ID:
			return getComponentVariable_3002ContainedLinks(view);
		case ComponentPartVariableEditPart.VISUAL_ID:
			return getComponentPartVariable_3003ContainedLinks(view);
		case MultiPortVariableEditPart.VISUAL_ID:
			return getMultiPortVariable_3004ContainedLinks(view);
		case SinglePortVariableEditPart.VISUAL_ID:
			return getSinglePortVariable_3005ContainedLinks(view);
		case SinglePortVariable2EditPart.VISUAL_ID:
			return getSinglePortVariable_3006ContainedLinks(view);
		case MultiPortVariable2EditPart.VISUAL_ID:
			return getMultiPortVariable_3007ContainedLinks(view);
		case SinglePortVariable3EditPart.VISUAL_ID:
			return getSinglePortVariable_3008ContainedLinks(view);
		case FadingComponentPartVariableEditPart.VISUAL_ID:
			return getFadingComponentPartVariable_3009ContainedLinks(view);
		case EdgeEditPart.VISUAL_ID:
			return getEdge_4001ContainedLinks(view);
		case AssemblyVariableEditPart.VISUAL_ID:
			return getAssemblyVariable_4002ContainedLinks(view);
		case DelegationVariableEditPart.VISUAL_ID:
			return getDelegationVariable_4003ContainedLinks(view);
		case MultiPortOrderConstraintEditPart.VISUAL_ID:
			return getMultiPortOrderConstraint_4004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getIncomingLinks(View view) {
		switch (ComponentSDDVisualIDRegistry.getVisualID(view)) {
		case ComponentStoryPatternNodeEditPart.VISUAL_ID:
			return getComponentStoryPatternNode_2003IncomingLinks(view);
		case LeafNodeEditPart.VISUAL_ID:
			return getLeafNode_2002IncomingLinks(view);
		case InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2004IncomingLinks(view);
		case ComponentStoryPatternEditPart.VISUAL_ID:
			return getComponentStoryPattern_3001IncomingLinks(view);
		case ComponentVariableEditPart.VISUAL_ID:
			return getComponentVariable_3002IncomingLinks(view);
		case ComponentPartVariableEditPart.VISUAL_ID:
			return getComponentPartVariable_3003IncomingLinks(view);
		case MultiPortVariableEditPart.VISUAL_ID:
			return getMultiPortVariable_3004IncomingLinks(view);
		case SinglePortVariableEditPart.VISUAL_ID:
			return getSinglePortVariable_3005IncomingLinks(view);
		case SinglePortVariable2EditPart.VISUAL_ID:
			return getSinglePortVariable_3006IncomingLinks(view);
		case MultiPortVariable2EditPart.VISUAL_ID:
			return getMultiPortVariable_3007IncomingLinks(view);
		case SinglePortVariable3EditPart.VISUAL_ID:
			return getSinglePortVariable_3008IncomingLinks(view);
		case FadingComponentPartVariableEditPart.VISUAL_ID:
			return getFadingComponentPartVariable_3009IncomingLinks(view);
		case EdgeEditPart.VISUAL_ID:
			return getEdge_4001IncomingLinks(view);
		case AssemblyVariableEditPart.VISUAL_ID:
			return getAssemblyVariable_4002IncomingLinks(view);
		case DelegationVariableEditPart.VISUAL_ID:
			return getDelegationVariable_4003IncomingLinks(view);
		case MultiPortOrderConstraintEditPart.VISUAL_ID:
			return getMultiPortOrderConstraint_4004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getOutgoingLinks(View view) {
		switch (ComponentSDDVisualIDRegistry.getVisualID(view)) {
		case ComponentStoryPatternNodeEditPart.VISUAL_ID:
			return getComponentStoryPatternNode_2003OutgoingLinks(view);
		case LeafNodeEditPart.VISUAL_ID:
			return getLeafNode_2002OutgoingLinks(view);
		case InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2004OutgoingLinks(view);
		case ComponentStoryPatternEditPart.VISUAL_ID:
			return getComponentStoryPattern_3001OutgoingLinks(view);
		case ComponentVariableEditPart.VISUAL_ID:
			return getComponentVariable_3002OutgoingLinks(view);
		case ComponentPartVariableEditPart.VISUAL_ID:
			return getComponentPartVariable_3003OutgoingLinks(view);
		case MultiPortVariableEditPart.VISUAL_ID:
			return getMultiPortVariable_3004OutgoingLinks(view);
		case SinglePortVariableEditPart.VISUAL_ID:
			return getSinglePortVariable_3005OutgoingLinks(view);
		case SinglePortVariable2EditPart.VISUAL_ID:
			return getSinglePortVariable_3006OutgoingLinks(view);
		case MultiPortVariable2EditPart.VISUAL_ID:
			return getMultiPortVariable_3007OutgoingLinks(view);
		case SinglePortVariable3EditPart.VISUAL_ID:
			return getSinglePortVariable_3008OutgoingLinks(view);
		case FadingComponentPartVariableEditPart.VISUAL_ID:
			return getFadingComponentPartVariable_3009OutgoingLinks(view);
		case EdgeEditPart.VISUAL_ID:
			return getEdge_4001OutgoingLinks(view);
		case AssemblyVariableEditPart.VISUAL_ID:
			return getAssemblyVariable_4002OutgoingLinks(view);
		case DelegationVariableEditPart.VISUAL_ID:
			return getDelegationVariable_4003OutgoingLinks(view);
		case MultiPortOrderConstraintEditPart.VISUAL_ID:
			return getMultiPortOrderConstraint_4004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getComponentStoryDecisionDiagram_1000ContainedLinks(View view) {
		ComponentStoryDecisionDiagram modelElement = (ComponentStoryDecisionDiagram) view.getElement();
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getComponentStoryPatternNode_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getLeafNode_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getInitialNode_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getComponentStoryPattern_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getComponentVariable_3002ContainedLinks(View view) {
		ComponentVariable modelElement = (ComponentVariable) view.getElement();
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AssemblyVariable_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DelegationVariable_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getComponentPartVariable_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getMultiPortVariable_3004ContainedLinks(View view) {
		MultiPortVariable modelElement = (MultiPortVariable) view.getElement();
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_MultiPortOrderConstraint_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getSinglePortVariable_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getSinglePortVariable_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getMultiPortVariable_3007ContainedLinks(View view) {
		MultiPortVariable modelElement = (MultiPortVariable) view.getElement();
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_MultiPortOrderConstraint_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getSinglePortVariable_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getFadingComponentPartVariable_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getEdge_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getAssemblyVariable_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getDelegationVariable_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getMultiPortOrderConstraint_4004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getComponentStoryPatternNode_2003IncomingLinks(View view) {
		ComponentStoryPatternNode modelElement = (ComponentStoryPatternNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getLeafNode_2002IncomingLinks(View view) {
		LeafNode modelElement = (LeafNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getInitialNode_2004IncomingLinks(View view) {
		InitialNode modelElement = (InitialNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getComponentStoryPattern_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getComponentVariable_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getComponentPartVariable_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getMultiPortVariable_3004IncomingLinks(View view) {
		MultiPortVariable modelElement = (MultiPortVariable) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyVariable_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationVariable_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getSinglePortVariable_3005IncomingLinks(View view) {
		SinglePortVariable modelElement = (SinglePortVariable) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyVariable_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationVariable_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MultiPortOrderConstraint_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getSinglePortVariable_3006IncomingLinks(View view) {
		SinglePortVariable modelElement = (SinglePortVariable) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyVariable_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationVariable_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MultiPortOrderConstraint_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getMultiPortVariable_3007IncomingLinks(View view) {
		MultiPortVariable modelElement = (MultiPortVariable) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyVariable_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationVariable_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getSinglePortVariable_3008IncomingLinks(View view) {
		SinglePortVariable modelElement = (SinglePortVariable) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyVariable_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationVariable_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MultiPortOrderConstraint_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getFadingComponentPartVariable_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getEdge_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getAssemblyVariable_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getDelegationVariable_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getMultiPortOrderConstraint_4004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getComponentStoryPatternNode_2003OutgoingLinks(View view) {
		ComponentStoryPatternNode modelElement = (ComponentStoryPatternNode) view.getElement();
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getLeafNode_2002OutgoingLinks(View view) {
		LeafNode modelElement = (LeafNode) view.getElement();
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getInitialNode_2004OutgoingLinks(View view) {
		InitialNode modelElement = (InitialNode) view.getElement();
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getComponentStoryPattern_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getComponentVariable_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getComponentPartVariable_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getMultiPortVariable_3004OutgoingLinks(View view) {
		MultiPortVariable modelElement = (MultiPortVariable) view.getElement();
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyVariable_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationVariable_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getSinglePortVariable_3005OutgoingLinks(View view) {
		SinglePortVariable modelElement = (SinglePortVariable) view.getElement();
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyVariable_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationVariable_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MultiPortOrderConstraint_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getSinglePortVariable_3006OutgoingLinks(View view) {
		SinglePortVariable modelElement = (SinglePortVariable) view.getElement();
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyVariable_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationVariable_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MultiPortOrderConstraint_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getMultiPortVariable_3007OutgoingLinks(View view) {
		MultiPortVariable modelElement = (MultiPortVariable) view.getElement();
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyVariable_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationVariable_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getSinglePortVariable_3008OutgoingLinks(View view) {
		SinglePortVariable modelElement = (SinglePortVariable) view.getElement();
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyVariable_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationVariable_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MultiPortOrderConstraint_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getFadingComponentPartVariable_3009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getEdge_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getAssemblyVariable_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getDelegationVariable_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentSDDLinkDescriptor> getMultiPortOrderConstraint_4004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<ComponentSDDLinkDescriptor> getContainedTypeModelFacetLinks_Edge_4001(
			AbstractStoryDecisionDiagram container) {
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Edge) {
				continue;
			}
			Edge link = (Edge) linkObject;
			if (EdgeEditPart.VISUAL_ID != ComponentSDDVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTargetNode();
			Node src = link.getSourceNode();
			result.add(new ComponentSDDLinkDescriptor(src, dst, link, ComponentSDDElementTypes.Edge_4001,
					EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentSDDLinkDescriptor> getContainedTypeModelFacetLinks_AssemblyVariable_4002(
			ComponentVariable container) {
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorVariables().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AssemblyVariable) {
				continue;
			}
			AssemblyVariable link = (AssemblyVariable) linkObject;
			if (AssemblyVariableEditPart.VISUAL_ID != ComponentSDDVisualIDRegistry.getLinkWithClassVisualID(link)) {
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
			result.add(new ComponentSDDLinkDescriptor(src, dst, link, ComponentSDDElementTypes.AssemblyVariable_4002,
					AssemblyVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentSDDLinkDescriptor> getContainedTypeModelFacetLinks_DelegationVariable_4003(
			ComponentVariable container) {
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorVariables().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DelegationVariable) {
				continue;
			}
			DelegationVariable link = (DelegationVariable) linkObject;
			if (DelegationVariableEditPart.VISUAL_ID != ComponentSDDVisualIDRegistry.getLinkWithClassVisualID(link)) {
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
			result.add(new ComponentSDDLinkDescriptor(src, dst, link, ComponentSDDElementTypes.DelegationVariable_4003,
					DelegationVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentSDDLinkDescriptor> getContainedTypeModelFacetLinks_MultiPortOrderConstraint_4004(
			MultiPortVariable container) {
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		for (Iterator<?> links = container.getOrderConstraints().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MultiPortOrderConstraint) {
				continue;
			}
			MultiPortOrderConstraint link = (MultiPortOrderConstraint) linkObject;
			if (MultiPortOrderConstraintEditPart.VISUAL_ID != ComponentSDDVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SinglePortVariable dst = link.getTgtSubPortVariable();
			SinglePortVariable src = link.getSrcSubPortVariable();
			result.add(new ComponentSDDLinkDescriptor(src, dst, link,
					ComponentSDDElementTypes.MultiPortOrderConstraint_4004,
					MultiPortOrderConstraintEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentSDDLinkDescriptor> getIncomingTypeModelFacetLinks_Edge_4001(Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != SDDPackage.eINSTANCE.getEdge_TargetNode()
					|| false == setting.getEObject() instanceof Edge) {
				continue;
			}
			Edge link = (Edge) setting.getEObject();
			if (EdgeEditPart.VISUAL_ID != ComponentSDDVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSourceNode();
			result.add(new ComponentSDDLinkDescriptor(src, target, link, ComponentSDDElementTypes.Edge_4001,
					EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentSDDLinkDescriptor> getIncomingTypeModelFacetLinks_AssemblyVariable_4002(
			ConnectorEndpoint target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConnectorPackage.eINSTANCE.getConnector_ConnectorEndpoints()
					|| false == setting.getEObject() instanceof AssemblyVariable) {
				continue;
			}
			AssemblyVariable link = (AssemblyVariable) setting.getEObject();
			if (AssemblyVariableEditPart.VISUAL_ID != ComponentSDDVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof ConnectorEndpoint) {
				continue;
			}
			ConnectorEndpoint src = (ConnectorEndpoint) theSource;
			result.add(new ComponentSDDLinkDescriptor(src, target, link, ComponentSDDElementTypes.AssemblyVariable_4002,
					AssemblyVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentSDDLinkDescriptor> getIncomingTypeModelFacetLinks_DelegationVariable_4003(
			ConnectorEndpoint target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConnectorPackage.eINSTANCE.getConnector_ConnectorEndpoints()
					|| false == setting.getEObject() instanceof DelegationVariable) {
				continue;
			}
			DelegationVariable link = (DelegationVariable) setting.getEObject();
			if (DelegationVariableEditPart.VISUAL_ID != ComponentSDDVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof ConnectorEndpoint) {
				continue;
			}
			ConnectorEndpoint src = (ConnectorEndpoint) theSource;
			result.add(new ComponentSDDLinkDescriptor(src, target, link,
					ComponentSDDElementTypes.DelegationVariable_4003, DelegationVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentSDDLinkDescriptor> getIncomingTypeModelFacetLinks_MultiPortOrderConstraint_4004(
			SinglePortVariable target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ComponentstorypatternPackage.eINSTANCE
					.getMultiPortOrderConstraint_TgtSubPortVariable()
					|| false == setting.getEObject() instanceof MultiPortOrderConstraint) {
				continue;
			}
			MultiPortOrderConstraint link = (MultiPortOrderConstraint) setting.getEObject();
			if (MultiPortOrderConstraintEditPart.VISUAL_ID != ComponentSDDVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SinglePortVariable src = link.getSrcSubPortVariable();
			result.add(new ComponentSDDLinkDescriptor(src, target, link,
					ComponentSDDElementTypes.MultiPortOrderConstraint_4004,
					MultiPortOrderConstraintEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentSDDLinkDescriptor> getOutgoingTypeModelFacetLinks_Edge_4001(Node source) {
		AbstractStoryDecisionDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof AbstractStoryDecisionDiagram) {
				container = (AbstractStoryDecisionDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Edge) {
				continue;
			}
			Edge link = (Edge) linkObject;
			if (EdgeEditPart.VISUAL_ID != ComponentSDDVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTargetNode();
			Node src = link.getSourceNode();
			if (src != source) {
				continue;
			}
			result.add(new ComponentSDDLinkDescriptor(src, dst, link, ComponentSDDElementTypes.Edge_4001,
					EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentSDDLinkDescriptor> getOutgoingTypeModelFacetLinks_AssemblyVariable_4002(
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
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorVariables().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AssemblyVariable) {
				continue;
			}
			AssemblyVariable link = (AssemblyVariable) linkObject;
			if (AssemblyVariableEditPart.VISUAL_ID != ComponentSDDVisualIDRegistry.getLinkWithClassVisualID(link)) {
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
			result.add(new ComponentSDDLinkDescriptor(src, dst, link, ComponentSDDElementTypes.AssemblyVariable_4002,
					AssemblyVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentSDDLinkDescriptor> getOutgoingTypeModelFacetLinks_DelegationVariable_4003(
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
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorVariables().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DelegationVariable) {
				continue;
			}
			DelegationVariable link = (DelegationVariable) linkObject;
			if (DelegationVariableEditPart.VISUAL_ID != ComponentSDDVisualIDRegistry.getLinkWithClassVisualID(link)) {
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
			result.add(new ComponentSDDLinkDescriptor(src, dst, link, ComponentSDDElementTypes.DelegationVariable_4003,
					DelegationVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentSDDLinkDescriptor> getOutgoingTypeModelFacetLinks_MultiPortOrderConstraint_4004(
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
		LinkedList<ComponentSDDLinkDescriptor> result = new LinkedList<ComponentSDDLinkDescriptor>();
		for (Iterator<?> links = container.getOrderConstraints().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MultiPortOrderConstraint) {
				continue;
			}
			MultiPortOrderConstraint link = (MultiPortOrderConstraint) linkObject;
			if (MultiPortOrderConstraintEditPart.VISUAL_ID != ComponentSDDVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SinglePortVariable dst = link.getTgtSubPortVariable();
			SinglePortVariable src = link.getSrcSubPortVariable();
			if (src != source) {
				continue;
			}
			result.add(new ComponentSDDLinkDescriptor(src, dst, link,
					ComponentSDDElementTypes.MultiPortOrderConstraint_4004,
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

		public List<ComponentSDDNodeDescriptor> getSemanticChildren(View view) {
			return ComponentSDDDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ComponentSDDLinkDescriptor> getContainedLinks(View view) {
			return ComponentSDDDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ComponentSDDLinkDescriptor> getIncomingLinks(View view) {
			return ComponentSDDDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ComponentSDDLinkDescriptor> getOutgoingLinks(View view) {
			return ComponentSDDDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
