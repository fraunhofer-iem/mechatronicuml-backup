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

/**
 * @generated
 */
public class ComponentSDDDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryDecisionDiagramEditPart.VISUAL_ID:
			return getComponentStoryDecisionDiagram_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableEditPart.VISUAL_ID:
			return getComponentVariable_3002SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentPartVariableEditPart.VISUAL_ID:
			return getComponentPartVariable_3003SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.FadingComponentPartVariableEditPart.VISUAL_ID:
			return getFadingComponentPartVariable_3009SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodePatternNodeContentCompartmentEditPart.VISUAL_ID:
			return getComponentStoryPatternNodePatternNodeContentCompartment_7001SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartmentEditPart.VISUAL_ID:
			return getComponentStoryPatternComponentStoryPatternCompartment_7002SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableComponentVariableCompartmentEditPart.VISUAL_ID:
			return getComponentVariableComponentVariableCompartment_7003SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartmentEditPart.VISUAL_ID:
			return getMultiPortVariableMultiPortVariablesCompartment_7004SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartment2EditPart.VISUAL_ID:
			return getMultiPortVariableMultiPortVariablesCompartment_7005SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor> getComponentStoryDecisionDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryDecisionDiagram modelElement = (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryDecisionDiagram) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.verification.sdd.Node childElement = (de.uni_paderborn.fujaba.muml.verification.sdd.Node) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.LeafNodeEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor> getComponentVariable_3002SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable modelElement = (de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortVariables().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.componentstorypattern.PortVariable childElement = (de.uni_paderborn.fujaba.muml.componentstorypattern.PortVariable) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariable2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable3EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor> getComponentPartVariable_3003SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentPartVariable modelElement = (de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentPartVariable) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortVariables().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.componentstorypattern.PortVariable childElement = (de.uni_paderborn.fujaba.muml.componentstorypattern.PortVariable) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor> getFadingComponentPartVariable_3009SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.componentstorypattern.FadingComponentPartVariable modelElement = (de.uni_paderborn.fujaba.muml.componentstorypattern.FadingComponentPartVariable) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortVariables().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.componentstorypattern.PortVariable childElement = (de.uni_paderborn.fujaba.muml.componentstorypattern.PortVariable) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor> getComponentStoryPatternNodePatternNodeContentCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryPatternNode modelElement = (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryPatternNode) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor>();
		{
			de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPattern childElement = modelElement
					.getPattern();
			int visualID = de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor(
						childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor> getComponentStoryPatternComponentStoryPatternCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPattern modelElement = (de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPattern) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor>();
		{
			de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable childElement = modelElement
					.getThisVariable();
			int visualID = de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor(
						childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor> getComponentVariableComponentVariableCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable modelElement = (de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPartVariables().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.componentstorypattern.PartVariable childElement = (de.uni_paderborn.fujaba.muml.componentstorypattern.PartVariable) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentPartVariableEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.FadingComponentPartVariableEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor> getMultiPortVariableMultiPortVariablesCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable modelElement = (de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGmfSubPortVariables().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable childElement = (de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariableEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor> getMultiPortVariableMultiPortVariablesCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable modelElement = (de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGmfSubPortVariables().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable childElement = (de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariableEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryDecisionDiagramEditPart.VISUAL_ID:
			return getComponentStoryDecisionDiagram_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeEditPart.VISUAL_ID:
			return getComponentStoryPatternNode_2003ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.LeafNodeEditPart.VISUAL_ID:
			return getLeafNode_2002ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2004ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternEditPart.VISUAL_ID:
			return getComponentStoryPattern_3001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableEditPart.VISUAL_ID:
			return getComponentVariable_3002ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentPartVariableEditPart.VISUAL_ID:
			return getComponentPartVariable_3003ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableEditPart.VISUAL_ID:
			return getMultiPortVariable_3004ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariableEditPart.VISUAL_ID:
			return getSinglePortVariable_3005ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable2EditPart.VISUAL_ID:
			return getSinglePortVariable_3006ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariable2EditPart.VISUAL_ID:
			return getMultiPortVariable_3007ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable3EditPart.VISUAL_ID:
			return getSinglePortVariable_3008ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.FadingComponentPartVariableEditPart.VISUAL_ID:
			return getFadingComponentPartVariable_3009ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.EdgeEditPart.VISUAL_ID:
			return getEdge_4001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.AssemblyVariableEditPart.VISUAL_ID:
			return getAssemblyVariable_4002ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableEditPart.VISUAL_ID:
			return getDelegationVariable_4003ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortOrderConstraintEditPart.VISUAL_ID:
			return getMultiPortOrderConstraint_4004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeEditPart.VISUAL_ID:
			return getComponentStoryPatternNode_2003IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.LeafNodeEditPart.VISUAL_ID:
			return getLeafNode_2002IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2004IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternEditPart.VISUAL_ID:
			return getComponentStoryPattern_3001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableEditPart.VISUAL_ID:
			return getComponentVariable_3002IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentPartVariableEditPart.VISUAL_ID:
			return getComponentPartVariable_3003IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableEditPart.VISUAL_ID:
			return getMultiPortVariable_3004IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariableEditPart.VISUAL_ID:
			return getSinglePortVariable_3005IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable2EditPart.VISUAL_ID:
			return getSinglePortVariable_3006IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariable2EditPart.VISUAL_ID:
			return getMultiPortVariable_3007IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable3EditPart.VISUAL_ID:
			return getSinglePortVariable_3008IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.FadingComponentPartVariableEditPart.VISUAL_ID:
			return getFadingComponentPartVariable_3009IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.EdgeEditPart.VISUAL_ID:
			return getEdge_4001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.AssemblyVariableEditPart.VISUAL_ID:
			return getAssemblyVariable_4002IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableEditPart.VISUAL_ID:
			return getDelegationVariable_4003IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortOrderConstraintEditPart.VISUAL_ID:
			return getMultiPortOrderConstraint_4004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeEditPart.VISUAL_ID:
			return getComponentStoryPatternNode_2003OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.LeafNodeEditPart.VISUAL_ID:
			return getLeafNode_2002OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2004OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternEditPart.VISUAL_ID:
			return getComponentStoryPattern_3001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableEditPart.VISUAL_ID:
			return getComponentVariable_3002OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentPartVariableEditPart.VISUAL_ID:
			return getComponentPartVariable_3003OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableEditPart.VISUAL_ID:
			return getMultiPortVariable_3004OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariableEditPart.VISUAL_ID:
			return getSinglePortVariable_3005OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable2EditPart.VISUAL_ID:
			return getSinglePortVariable_3006OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariable2EditPart.VISUAL_ID:
			return getMultiPortVariable_3007OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable3EditPart.VISUAL_ID:
			return getSinglePortVariable_3008OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.FadingComponentPartVariableEditPart.VISUAL_ID:
			return getFadingComponentPartVariable_3009OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.EdgeEditPart.VISUAL_ID:
			return getEdge_4001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.AssemblyVariableEditPart.VISUAL_ID:
			return getAssemblyVariable_4002OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableEditPart.VISUAL_ID:
			return getDelegationVariable_4003OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortOrderConstraintEditPart.VISUAL_ID:
			return getMultiPortOrderConstraint_4004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getComponentStoryDecisionDiagram_1000ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryDecisionDiagram modelElement = (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryDecisionDiagram) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getComponentStoryPatternNode_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getLeafNode_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getInitialNode_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getComponentStoryPattern_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getComponentVariable_3002ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable modelElement = (de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AssemblyVariable_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DelegationVariable_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getComponentPartVariable_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getMultiPortVariable_3004ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable modelElement = (de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_MultiPortOrderConstraint_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getSinglePortVariable_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getSinglePortVariable_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getMultiPortVariable_3007ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable modelElement = (de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_MultiPortOrderConstraint_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getSinglePortVariable_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getFadingComponentPartVariable_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getEdge_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getAssemblyVariable_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getDelegationVariable_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getMultiPortOrderConstraint_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getComponentStoryPatternNode_2003IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryPatternNode modelElement = (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryPatternNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getLeafNode_2002IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.verification.sdd.LeafNode modelElement = (de.uni_paderborn.fujaba.muml.verification.sdd.LeafNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getInitialNode_2004IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.InitialNode modelElement = (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.InitialNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getComponentStoryPattern_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getComponentVariable_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getComponentPartVariable_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getMultiPortVariable_3004IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable modelElement = (de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyVariable_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationVariable_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getSinglePortVariable_3005IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable modelElement = (de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyVariable_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationVariable_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MultiPortOrderConstraint_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getSinglePortVariable_3006IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable modelElement = (de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyVariable_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationVariable_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MultiPortOrderConstraint_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getMultiPortVariable_3007IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable modelElement = (de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyVariable_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationVariable_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getSinglePortVariable_3008IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable modelElement = (de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyVariable_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationVariable_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MultiPortOrderConstraint_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getFadingComponentPartVariable_3009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getEdge_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getAssemblyVariable_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getDelegationVariable_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getMultiPortOrderConstraint_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getComponentStoryPatternNode_2003OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryPatternNode modelElement = (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryPatternNode) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getLeafNode_2002OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.verification.sdd.LeafNode modelElement = (de.uni_paderborn.fujaba.muml.verification.sdd.LeafNode) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getInitialNode_2004OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.InitialNode modelElement = (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.InitialNode) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getComponentStoryPattern_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getComponentVariable_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getComponentPartVariable_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getMultiPortVariable_3004OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable modelElement = (de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyVariable_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationVariable_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getSinglePortVariable_3005OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable modelElement = (de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyVariable_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationVariable_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MultiPortOrderConstraint_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getSinglePortVariable_3006OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable modelElement = (de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyVariable_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationVariable_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MultiPortOrderConstraint_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getMultiPortVariable_3007OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable modelElement = (de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyVariable_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationVariable_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getSinglePortVariable_3008OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable modelElement = (de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyVariable_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationVariable_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MultiPortOrderConstraint_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getFadingComponentPartVariable_3009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getEdge_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getAssemblyVariable_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getDelegationVariable_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getMultiPortOrderConstraint_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getContainedTypeModelFacetLinks_Edge_4001(
			de.uni_paderborn.fujaba.muml.verification.sdd.AbstractStoryDecisionDiagram container) {
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.verification.sdd.Edge) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.verification.sdd.Edge link = (de.uni_paderborn.fujaba.muml.verification.sdd.Edge) linkObject;
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.EdgeEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.verification.sdd.Node dst = link
					.getTargetNode();
			de.uni_paderborn.fujaba.muml.verification.sdd.Node src = link
					.getSourceNode();
			result.add(new de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.Edge_4001,
					de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getContainedTypeModelFacetLinks_AssemblyVariable_4002(
			de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable container) {
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorVariables().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.componentstorypattern.AssemblyVariable) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.componentstorypattern.AssemblyVariable link = (de.uni_paderborn.fujaba.muml.componentstorypattern.AssemblyVariable) linkObject;
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.AssemblyVariableEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint dst = (org.muml.pim.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint src = (org.muml.pim.connector.ConnectorEndpoint) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.AssemblyVariable_4002,
					de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.AssemblyVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getContainedTypeModelFacetLinks_DelegationVariable_4003(
			de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable container) {
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorVariables().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.componentstorypattern.DelegationVariable) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.componentstorypattern.DelegationVariable link = (de.uni_paderborn.fujaba.muml.componentstorypattern.DelegationVariable) linkObject;
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint dst = (org.muml.pim.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint src = (org.muml.pim.connector.ConnectorEndpoint) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.DelegationVariable_4003,
					de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getContainedTypeModelFacetLinks_MultiPortOrderConstraint_4004(
			de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable container) {
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		for (Iterator<?> links = container.getOrderConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortOrderConstraint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortOrderConstraint link = (de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortOrderConstraint) linkObject;
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortOrderConstraintEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable dst = link
					.getTgtSubPortVariable();
			de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable src = link
					.getSrcSubPortVariable();
			result.add(new de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.MultiPortOrderConstraint_4004,
					de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortOrderConstraintEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getIncomingTypeModelFacetLinks_Edge_4001(
			de.uni_paderborn.fujaba.muml.verification.sdd.Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.verification.sdd.SDDPackage.eINSTANCE
					.getEdge_TargetNode()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.verification.sdd.Edge) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.verification.sdd.Edge link = (de.uni_paderborn.fujaba.muml.verification.sdd.Edge) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.EdgeEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.verification.sdd.Node src = link
					.getSourceNode();
			result.add(new de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.Edge_4001,
					de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getIncomingTypeModelFacetLinks_AssemblyVariable_4002(
			org.muml.pim.connector.ConnectorEndpoint target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != org.muml.pim.connector.ConnectorPackage.eINSTANCE
					.getConnector_ConnectorEndpoints()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.componentstorypattern.AssemblyVariable) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.componentstorypattern.AssemblyVariable link = (de.uni_paderborn.fujaba.muml.componentstorypattern.AssemblyVariable) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.AssemblyVariableEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint src = (org.muml.pim.connector.ConnectorEndpoint) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.AssemblyVariable_4002,
					de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.AssemblyVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getIncomingTypeModelFacetLinks_DelegationVariable_4003(
			org.muml.pim.connector.ConnectorEndpoint target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != org.muml.pim.connector.ConnectorPackage.eINSTANCE
					.getConnector_ConnectorEndpoints()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.componentstorypattern.DelegationVariable) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.componentstorypattern.DelegationVariable link = (de.uni_paderborn.fujaba.muml.componentstorypattern.DelegationVariable) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint src = (org.muml.pim.connector.ConnectorEndpoint) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.DelegationVariable_4003,
					de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getIncomingTypeModelFacetLinks_MultiPortOrderConstraint_4004(
			de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getMultiPortOrderConstraint_TgtSubPortVariable()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortOrderConstraint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortOrderConstraint link = (de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortOrderConstraint) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortOrderConstraintEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable src = link
					.getSrcSubPortVariable();
			result.add(new de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.MultiPortOrderConstraint_4004,
					de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortOrderConstraintEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getOutgoingTypeModelFacetLinks_Edge_4001(
			de.uni_paderborn.fujaba.muml.verification.sdd.Node source) {
		de.uni_paderborn.fujaba.muml.verification.sdd.AbstractStoryDecisionDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.verification.sdd.AbstractStoryDecisionDiagram) {
				container = (de.uni_paderborn.fujaba.muml.verification.sdd.AbstractStoryDecisionDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.verification.sdd.Edge) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.verification.sdd.Edge link = (de.uni_paderborn.fujaba.muml.verification.sdd.Edge) linkObject;
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.EdgeEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.verification.sdd.Node dst = link
					.getTargetNode();
			de.uni_paderborn.fujaba.muml.verification.sdd.Node src = link
					.getSourceNode();
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.Edge_4001,
					de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getOutgoingTypeModelFacetLinks_AssemblyVariable_4002(
			org.muml.pim.connector.ConnectorEndpoint source) {
		de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable) {
				container = (de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorVariables().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.componentstorypattern.AssemblyVariable) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.componentstorypattern.AssemblyVariable link = (de.uni_paderborn.fujaba.muml.componentstorypattern.AssemblyVariable) linkObject;
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.AssemblyVariableEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint dst = (org.muml.pim.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint src = (org.muml.pim.connector.ConnectorEndpoint) theSource;
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.AssemblyVariable_4002,
					de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.AssemblyVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getOutgoingTypeModelFacetLinks_DelegationVariable_4003(
			org.muml.pim.connector.ConnectorEndpoint source) {
		de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable) {
				container = (de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorVariables().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.componentstorypattern.DelegationVariable) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.componentstorypattern.DelegationVariable link = (de.uni_paderborn.fujaba.muml.componentstorypattern.DelegationVariable) linkObject;
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets
					.get(targets.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint dst = (org.muml.pim.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof org.muml.pim.connector.ConnectorEndpoint) {
				continue;
			}
			org.muml.pim.connector.ConnectorEndpoint src = (org.muml.pim.connector.ConnectorEndpoint) theSource;
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.DelegationVariable_4003,
					de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getOutgoingTypeModelFacetLinks_MultiPortOrderConstraint_4004(
			de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable source) {
		de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable) {
				container = (de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor>();
		for (Iterator<?> links = container.getOrderConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortOrderConstraint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortOrderConstraint link = (de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortOrderConstraint) linkObject;
			if (de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortOrderConstraintEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable dst = link
					.getTgtSubPortVariable();
			de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable src = link
					.getSrcSubPortVariable();
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.MultiPortOrderConstraint_4004,
					de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortOrderConstraintEditPart.VISUAL_ID));
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
		public List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDNodeDescriptor> getSemanticChildren(
				View view) {
			return ComponentSDDDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getContainedLinks(
				View view) {
			return ComponentSDDDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getIncomingLinks(
				View view) {
			return ComponentSDDDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDLinkDescriptor> getOutgoingLinks(
				View view) {
			return ComponentSDDDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
