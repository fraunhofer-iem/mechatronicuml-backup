package org.muml.storydiagram.verification.sdd.basicsdd.diagram.part;

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
import org.muml.storydiagram.patterns.AbstractVariable;
import org.muml.storydiagram.patterns.AttributeAssignment;
import org.muml.storydiagram.patterns.CollectionVariable;
import org.muml.storydiagram.patterns.Constraint;
import org.muml.storydiagram.patterns.LinkVariable;
import org.muml.storydiagram.patterns.ObjectVariable;
import org.muml.storydiagram.patterns.PatternsPackage;
import org.muml.storydiagram.patterns.StoryPattern;

/**
 * @generated
 */
public class BasicSDDDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor> getSemanticChildren(
			View view) {
		switch (org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
				.getVisualID(view)) {
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryDecisionDiagramEditPart.VISUAL_ID:
			return getStoryDecisionDiagram_1000SemanticChildren(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodePatternNodeContentCompartmentEditPart.VISUAL_ID:
			return getStoryPatternNodePatternNodeContentCompartment_7012SemanticChildren(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternStoryPatternContentCompartmentEditPart.VISUAL_ID:
			return getStoryPatternStoryPatternContentCompartment_7013SemanticChildren(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternStoryPatternConstraintsCompartmentEditPart.VISUAL_ID:
			return getStoryPatternStoryPatternConstraintsCompartment_7014SemanticChildren(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableCollectionVariableConstraintsCompartmentEditPart.VISUAL_ID:
			return getCollectionVariableCollectionVariableConstraintsCompartment_7008SemanticChildren(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
			return getCollectionVariableCollectionVariableAttributeAssignmentsCompartment_7009SemanticChildren(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ObjectVariableObjectVariableConstraintsCompartmentEditPart.VISUAL_ID:
			return getObjectVariableObjectVariableConstraintsCompartment_7010SemanticChildren(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
			return getObjectVariableObjectVariableAttributeAssignmentsCompartment_7011SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor> getStoryDecisionDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.storydiagram.verification.sdd.basicsdd.StoryDecisionDiagram modelElement = (org.muml.storydiagram.verification.sdd.basicsdd.StoryDecisionDiagram) view
				.getElement();
		LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor> result = new LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			org.muml.storydiagram.verification.sdd.Node childElement = (org.muml.storydiagram.verification.sdd.Node) it
					.next();
			int visualID = org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodeEditPart.VISUAL_ID) {
				result.add(new org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LeafNodeEditPart.VISUAL_ID) {
				result.add(new org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor> getStoryPatternNodePatternNodeContentCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.storydiagram.verification.sdd.basicsdd.StoryPatternNode modelElement = (org.muml.storydiagram.verification.sdd.basicsdd.StoryPatternNode) containerView
				.getElement();
		LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor> result = new LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor>();
		{
			StoryPattern childElement = modelElement.getPattern();
			int visualID = org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternEditPart.VISUAL_ID) {
				result.add(new org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor(
						childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor> getStoryPatternStoryPatternContentCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		StoryPattern modelElement = (StoryPattern) containerView.getElement();
		LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor> result = new LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getVariables().iterator(); it
				.hasNext();) {
			AbstractVariable childElement = (AbstractVariable) it.next();
			int visualID = org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableEditPart.VISUAL_ID) {
				result.add(new org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ObjectVariableEditPart.VISUAL_ID) {
				result.add(new org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor> getStoryPatternStoryPatternConstraintsCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		StoryPattern modelElement = (StoryPattern) containerView.getElement();
		LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor> result = new LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConstraints().iterator(); it
				.hasNext();) {
			Constraint childElement = (Constraint) it.next();
			int visualID = org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.Constraint2EditPart.VISUAL_ID) {
				result.add(new org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor> getCollectionVariableCollectionVariableConstraintsCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CollectionVariable modelElement = (CollectionVariable) containerView
				.getElement();
		LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor> result = new LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConstraints().iterator(); it
				.hasNext();) {
			Constraint childElement = (Constraint) it.next();
			int visualID = org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ConstraintEditPart.VISUAL_ID) {
				result.add(new org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor> getCollectionVariableCollectionVariableAttributeAssignmentsCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CollectionVariable modelElement = (CollectionVariable) containerView
				.getElement();
		LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor> result = new LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributeAssignments().iterator(); it
				.hasNext();) {
			AttributeAssignment childElement = (AttributeAssignment) it.next();
			int visualID = org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.AttributeAssignmentEditPart.VISUAL_ID) {
				result.add(new org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor> getObjectVariableObjectVariableConstraintsCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ObjectVariable modelElement = (ObjectVariable) containerView
				.getElement();
		LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor> result = new LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConstraints().iterator(); it
				.hasNext();) {
			Constraint childElement = (Constraint) it.next();
			int visualID = org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ConstraintEditPart.VISUAL_ID) {
				result.add(new org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor> getObjectVariableObjectVariableAttributeAssignmentsCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ObjectVariable modelElement = (ObjectVariable) containerView
				.getElement();
		LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor> result = new LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributeAssignments().iterator(); it
				.hasNext();) {
			AttributeAssignment childElement = (AttributeAssignment) it.next();
			int visualID = org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.AttributeAssignmentEditPart.VISUAL_ID) {
				result.add(new org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getContainedLinks(
			View view) {
		switch (org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
				.getVisualID(view)) {
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryDecisionDiagramEditPart.VISUAL_ID:
			return getStoryDecisionDiagram_1000ContainedLinks(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodeEditPart.VISUAL_ID:
			return getStoryPatternNode_2003ContainedLinks(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LeafNodeEditPart.VISUAL_ID:
			return getLeafNode_2004ContainedLinks(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternEditPart.VISUAL_ID:
			return getStoryPattern_3011ContainedLinks(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableEditPart.VISUAL_ID:
			return getCollectionVariable_3006ContainedLinks(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.AttributeAssignmentEditPart.VISUAL_ID:
			return getAttributeAssignment_3007ContainedLinks(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ConstraintEditPart.VISUAL_ID:
			return getConstraint_3008ContainedLinks(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ObjectVariableEditPart.VISUAL_ID:
			return getObjectVariable_3009ContainedLinks(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.Constraint2EditPart.VISUAL_ID:
			return getConstraint_3010ContainedLinks(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.EdgeEditPart.VISUAL_ID:
			return getEdge_4001ContainedLinks(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LinkVariableEditPart.VISUAL_ID:
			return getLinkVariable_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getIncomingLinks(
			View view) {
		switch (org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
				.getVisualID(view)) {
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodeEditPart.VISUAL_ID:
			return getStoryPatternNode_2003IncomingLinks(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LeafNodeEditPart.VISUAL_ID:
			return getLeafNode_2004IncomingLinks(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternEditPart.VISUAL_ID:
			return getStoryPattern_3011IncomingLinks(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableEditPart.VISUAL_ID:
			return getCollectionVariable_3006IncomingLinks(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.AttributeAssignmentEditPart.VISUAL_ID:
			return getAttributeAssignment_3007IncomingLinks(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ConstraintEditPart.VISUAL_ID:
			return getConstraint_3008IncomingLinks(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ObjectVariableEditPart.VISUAL_ID:
			return getObjectVariable_3009IncomingLinks(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.Constraint2EditPart.VISUAL_ID:
			return getConstraint_3010IncomingLinks(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.EdgeEditPart.VISUAL_ID:
			return getEdge_4001IncomingLinks(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LinkVariableEditPart.VISUAL_ID:
			return getLinkVariable_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
				.getVisualID(view)) {
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodeEditPart.VISUAL_ID:
			return getStoryPatternNode_2003OutgoingLinks(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LeafNodeEditPart.VISUAL_ID:
			return getLeafNode_2004OutgoingLinks(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternEditPart.VISUAL_ID:
			return getStoryPattern_3011OutgoingLinks(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableEditPart.VISUAL_ID:
			return getCollectionVariable_3006OutgoingLinks(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.AttributeAssignmentEditPart.VISUAL_ID:
			return getAttributeAssignment_3007OutgoingLinks(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ConstraintEditPart.VISUAL_ID:
			return getConstraint_3008OutgoingLinks(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ObjectVariableEditPart.VISUAL_ID:
			return getObjectVariable_3009OutgoingLinks(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.Constraint2EditPart.VISUAL_ID:
			return getConstraint_3010OutgoingLinks(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.EdgeEditPart.VISUAL_ID:
			return getEdge_4001OutgoingLinks(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LinkVariableEditPart.VISUAL_ID:
			return getLinkVariable_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getStoryDecisionDiagram_1000ContainedLinks(
			View view) {
		org.muml.storydiagram.verification.sdd.basicsdd.StoryDecisionDiagram modelElement = (org.muml.storydiagram.verification.sdd.basicsdd.StoryDecisionDiagram) view
				.getElement();
		LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> result = new LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getStoryPatternNode_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getLeafNode_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getStoryPattern_3011ContainedLinks(
			View view) {
		StoryPattern modelElement = (StoryPattern) view.getElement();
		LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> result = new LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_LinkVariable_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getCollectionVariable_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getAttributeAssignment_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getConstraint_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getObjectVariable_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getConstraint_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getEdge_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getLinkVariable_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getStoryPatternNode_2003IncomingLinks(
			View view) {
		org.muml.storydiagram.verification.sdd.basicsdd.StoryPatternNode modelElement = (org.muml.storydiagram.verification.sdd.basicsdd.StoryPatternNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> result = new LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getLeafNode_2004IncomingLinks(
			View view) {
		org.muml.storydiagram.verification.sdd.LeafNode modelElement = (org.muml.storydiagram.verification.sdd.LeafNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> result = new LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getStoryPattern_3011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getCollectionVariable_3006IncomingLinks(
			View view) {
		CollectionVariable modelElement = (CollectionVariable) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> result = new LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_LinkVariable_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getAttributeAssignment_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getConstraint_3008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getObjectVariable_3009IncomingLinks(
			View view) {
		ObjectVariable modelElement = (ObjectVariable) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> result = new LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_LinkVariable_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getConstraint_3010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getEdge_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getLinkVariable_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getStoryPatternNode_2003OutgoingLinks(
			View view) {
		org.muml.storydiagram.verification.sdd.basicsdd.StoryPatternNode modelElement = (org.muml.storydiagram.verification.sdd.basicsdd.StoryPatternNode) view
				.getElement();
		LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> result = new LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getLeafNode_2004OutgoingLinks(
			View view) {
		org.muml.storydiagram.verification.sdd.LeafNode modelElement = (org.muml.storydiagram.verification.sdd.LeafNode) view
				.getElement();
		LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> result = new LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getStoryPattern_3011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getCollectionVariable_3006OutgoingLinks(
			View view) {
		CollectionVariable modelElement = (CollectionVariable) view
				.getElement();
		LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> result = new LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkVariable_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getAttributeAssignment_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getConstraint_3008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getObjectVariable_3009OutgoingLinks(
			View view) {
		ObjectVariable modelElement = (ObjectVariable) view.getElement();
		LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> result = new LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkVariable_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getConstraint_3010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getEdge_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getLinkVariable_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getContainedTypeModelFacetLinks_Edge_4001(
			org.muml.storydiagram.verification.sdd.AbstractStoryDecisionDiagram container) {
		LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> result = new LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof org.muml.storydiagram.verification.sdd.Edge) {
				continue;
			}
			org.muml.storydiagram.verification.sdd.Edge link = (org.muml.storydiagram.verification.sdd.Edge) linkObject;
			if (org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.EdgeEditPart.VISUAL_ID != org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			org.muml.storydiagram.verification.sdd.Node dst = link
					.getTargetNode();
			org.muml.storydiagram.verification.sdd.Node src = link
					.getSourceNode();
			result.add(new org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor(
					src,
					dst,
					link,
					org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.Edge_4001,
					org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getContainedTypeModelFacetLinks_LinkVariable_4003(
			StoryPattern container) {
		LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> result = new LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor>();
		for (Iterator<?> links = container.getLinkVariables().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LinkVariable) {
				continue;
			}
			LinkVariable link = (LinkVariable) linkObject;
			if (org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LinkVariableEditPart.VISUAL_ID != org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractVariable dst = link.getTarget();
			ObjectVariable src = link.getSource();
			result.add(new org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor(
					src,
					dst,
					link,
					org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.LinkVariable_4003,
					org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LinkVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getIncomingTypeModelFacetLinks_Edge_4001(
			org.muml.storydiagram.verification.sdd.Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> result = new LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != org.muml.storydiagram.verification.sdd.SDDPackage.eINSTANCE
					.getEdge_TargetNode()
					|| false == setting.getEObject() instanceof org.muml.storydiagram.verification.sdd.Edge) {
				continue;
			}
			org.muml.storydiagram.verification.sdd.Edge link = (org.muml.storydiagram.verification.sdd.Edge) setting
					.getEObject();
			if (org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.EdgeEditPart.VISUAL_ID != org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			org.muml.storydiagram.verification.sdd.Node src = link
					.getSourceNode();
			result.add(new org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor(
					src,
					target,
					link,
					org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.Edge_4001,
					org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getIncomingTypeModelFacetLinks_LinkVariable_4003(
			AbstractVariable target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> result = new LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != PatternsPackage.eINSTANCE
					.getAbstractLinkVariable_Target()
					|| false == setting.getEObject() instanceof LinkVariable) {
				continue;
			}
			LinkVariable link = (LinkVariable) setting.getEObject();
			if (org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LinkVariableEditPart.VISUAL_ID != org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ObjectVariable src = link.getSource();
			result.add(new org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor(
					src,
					target,
					link,
					org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.LinkVariable_4003,
					org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LinkVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getOutgoingTypeModelFacetLinks_Edge_4001(
			org.muml.storydiagram.verification.sdd.Node source) {
		org.muml.storydiagram.verification.sdd.AbstractStoryDecisionDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof org.muml.storydiagram.verification.sdd.AbstractStoryDecisionDiagram) {
				container = (org.muml.storydiagram.verification.sdd.AbstractStoryDecisionDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> result = new LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof org.muml.storydiagram.verification.sdd.Edge) {
				continue;
			}
			org.muml.storydiagram.verification.sdd.Edge link = (org.muml.storydiagram.verification.sdd.Edge) linkObject;
			if (org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.EdgeEditPart.VISUAL_ID != org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			org.muml.storydiagram.verification.sdd.Node dst = link
					.getTargetNode();
			org.muml.storydiagram.verification.sdd.Node src = link
					.getSourceNode();
			if (src != source) {
				continue;
			}
			result.add(new org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor(
					src,
					dst,
					link,
					org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.Edge_4001,
					org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getOutgoingTypeModelFacetLinks_LinkVariable_4003(
			ObjectVariable source) {
		StoryPattern container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof StoryPattern) {
				container = (StoryPattern) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> result = new LinkedList<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor>();
		for (Iterator<?> links = container.getLinkVariables().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LinkVariable) {
				continue;
			}
			LinkVariable link = (LinkVariable) linkObject;
			if (org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LinkVariableEditPart.VISUAL_ID != org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractVariable dst = link.getTarget();
			ObjectVariable src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor(
					src,
					dst,
					link,
					org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.LinkVariable_4003,
					org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LinkVariableEditPart.VISUAL_ID));
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
		public List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDNodeDescriptor> getSemanticChildren(
				View view) {
			return BasicSDDDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getContainedLinks(
				View view) {
			return BasicSDDDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getIncomingLinks(
				View view) {
			return BasicSDDDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDLinkDescriptor> getOutgoingLinks(
				View view) {
			return BasicSDDDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
