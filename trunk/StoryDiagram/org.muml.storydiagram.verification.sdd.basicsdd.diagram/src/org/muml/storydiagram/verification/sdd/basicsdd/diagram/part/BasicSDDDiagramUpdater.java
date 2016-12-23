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
import org.muml.storydiagram.verification.sdd.AbstractStoryDecisionDiagram;
import org.muml.storydiagram.verification.sdd.Edge;
import org.muml.storydiagram.verification.sdd.LeafNode;
import org.muml.storydiagram.verification.sdd.Node;
import org.muml.storydiagram.verification.sdd.SDDPackage;
import org.muml.storydiagram.verification.sdd.basicsdd.StoryDecisionDiagram;
import org.muml.storydiagram.verification.sdd.basicsdd.StoryPatternNode;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.AttributeAssignmentEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableCollectionVariableConstraintsCompartmentEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.Constraint2EditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ConstraintEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.EdgeEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LeafNodeEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LinkVariableEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ObjectVariableEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ObjectVariableObjectVariableConstraintsCompartmentEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryDecisionDiagramEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodeEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodePatternNodeContentCompartmentEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternStoryPatternConstraintsCompartmentEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternStoryPatternContentCompartmentEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes;

/**
 * @generated
 */
public class BasicSDDDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<BasicSDDNodeDescriptor> getSemanticChildren(View view) {
		switch (BasicSDDVisualIDRegistry.getVisualID(view)) {
		case StoryDecisionDiagramEditPart.VISUAL_ID:
			return getStoryDecisionDiagram_1000SemanticChildren(view);
		case StoryPatternNodePatternNodeContentCompartmentEditPart.VISUAL_ID:
			return getStoryPatternNodePatternNodeContentCompartment_7012SemanticChildren(view);
		case StoryPatternStoryPatternContentCompartmentEditPart.VISUAL_ID:
			return getStoryPatternStoryPatternContentCompartment_7013SemanticChildren(view);
		case StoryPatternStoryPatternConstraintsCompartmentEditPart.VISUAL_ID:
			return getStoryPatternStoryPatternConstraintsCompartment_7014SemanticChildren(view);
		case CollectionVariableCollectionVariableConstraintsCompartmentEditPart.VISUAL_ID:
			return getCollectionVariableCollectionVariableConstraintsCompartment_7008SemanticChildren(view);
		case CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
			return getCollectionVariableCollectionVariableAttributeAssignmentsCompartment_7009SemanticChildren(view);
		case ObjectVariableObjectVariableConstraintsCompartmentEditPart.VISUAL_ID:
			return getObjectVariableObjectVariableConstraintsCompartment_7010SemanticChildren(view);
		case ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
			return getObjectVariableObjectVariableAttributeAssignmentsCompartment_7011SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDNodeDescriptor> getStoryDecisionDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		StoryDecisionDiagram modelElement = (StoryDecisionDiagram) view.getElement();
		LinkedList<BasicSDDNodeDescriptor> result = new LinkedList<BasicSDDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = BasicSDDVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StoryPatternNodeEditPart.VISUAL_ID) {
				result.add(new BasicSDDNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LeafNodeEditPart.VISUAL_ID) {
				result.add(new BasicSDDNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDNodeDescriptor> getStoryPatternNodePatternNodeContentCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		StoryPatternNode modelElement = (StoryPatternNode) containerView.getElement();
		LinkedList<BasicSDDNodeDescriptor> result = new LinkedList<BasicSDDNodeDescriptor>();
		{
			StoryPattern childElement = modelElement.getPattern();
			int visualID = BasicSDDVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StoryPatternEditPart.VISUAL_ID) {
				result.add(new BasicSDDNodeDescriptor(childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDNodeDescriptor> getStoryPatternStoryPatternContentCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		StoryPattern modelElement = (StoryPattern) containerView.getElement();
		LinkedList<BasicSDDNodeDescriptor> result = new LinkedList<BasicSDDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getVariables().iterator(); it.hasNext();) {
			AbstractVariable childElement = (AbstractVariable) it.next();
			int visualID = BasicSDDVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CollectionVariableEditPart.VISUAL_ID) {
				result.add(new BasicSDDNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ObjectVariableEditPart.VISUAL_ID) {
				result.add(new BasicSDDNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDNodeDescriptor> getStoryPatternStoryPatternConstraintsCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		StoryPattern modelElement = (StoryPattern) containerView.getElement();
		LinkedList<BasicSDDNodeDescriptor> result = new LinkedList<BasicSDDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConstraints().iterator(); it.hasNext();) {
			Constraint childElement = (Constraint) it.next();
			int visualID = BasicSDDVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Constraint2EditPart.VISUAL_ID) {
				result.add(new BasicSDDNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDNodeDescriptor> getCollectionVariableCollectionVariableConstraintsCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CollectionVariable modelElement = (CollectionVariable) containerView.getElement();
		LinkedList<BasicSDDNodeDescriptor> result = new LinkedList<BasicSDDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConstraints().iterator(); it.hasNext();) {
			Constraint childElement = (Constraint) it.next();
			int visualID = BasicSDDVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ConstraintEditPart.VISUAL_ID) {
				result.add(new BasicSDDNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDNodeDescriptor> getCollectionVariableCollectionVariableAttributeAssignmentsCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CollectionVariable modelElement = (CollectionVariable) containerView.getElement();
		LinkedList<BasicSDDNodeDescriptor> result = new LinkedList<BasicSDDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributeAssignments().iterator(); it.hasNext();) {
			AttributeAssignment childElement = (AttributeAssignment) it.next();
			int visualID = BasicSDDVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AttributeAssignmentEditPart.VISUAL_ID) {
				result.add(new BasicSDDNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDNodeDescriptor> getObjectVariableObjectVariableConstraintsCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ObjectVariable modelElement = (ObjectVariable) containerView.getElement();
		LinkedList<BasicSDDNodeDescriptor> result = new LinkedList<BasicSDDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConstraints().iterator(); it.hasNext();) {
			Constraint childElement = (Constraint) it.next();
			int visualID = BasicSDDVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ConstraintEditPart.VISUAL_ID) {
				result.add(new BasicSDDNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDNodeDescriptor> getObjectVariableObjectVariableAttributeAssignmentsCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ObjectVariable modelElement = (ObjectVariable) containerView.getElement();
		LinkedList<BasicSDDNodeDescriptor> result = new LinkedList<BasicSDDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributeAssignments().iterator(); it.hasNext();) {
			AttributeAssignment childElement = (AttributeAssignment) it.next();
			int visualID = BasicSDDVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AttributeAssignmentEditPart.VISUAL_ID) {
				result.add(new BasicSDDNodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getContainedLinks(View view) {
		switch (BasicSDDVisualIDRegistry.getVisualID(view)) {
		case StoryDecisionDiagramEditPart.VISUAL_ID:
			return getStoryDecisionDiagram_1000ContainedLinks(view);
		case StoryPatternNodeEditPart.VISUAL_ID:
			return getStoryPatternNode_2003ContainedLinks(view);
		case LeafNodeEditPart.VISUAL_ID:
			return getLeafNode_2004ContainedLinks(view);
		case StoryPatternEditPart.VISUAL_ID:
			return getStoryPattern_3011ContainedLinks(view);
		case CollectionVariableEditPart.VISUAL_ID:
			return getCollectionVariable_3006ContainedLinks(view);
		case AttributeAssignmentEditPart.VISUAL_ID:
			return getAttributeAssignment_3007ContainedLinks(view);
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_3008ContainedLinks(view);
		case ObjectVariableEditPart.VISUAL_ID:
			return getObjectVariable_3009ContainedLinks(view);
		case Constraint2EditPart.VISUAL_ID:
			return getConstraint_3010ContainedLinks(view);
		case EdgeEditPart.VISUAL_ID:
			return getEdge_4001ContainedLinks(view);
		case LinkVariableEditPart.VISUAL_ID:
			return getLinkVariable_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getIncomingLinks(View view) {
		switch (BasicSDDVisualIDRegistry.getVisualID(view)) {
		case StoryPatternNodeEditPart.VISUAL_ID:
			return getStoryPatternNode_2003IncomingLinks(view);
		case LeafNodeEditPart.VISUAL_ID:
			return getLeafNode_2004IncomingLinks(view);
		case StoryPatternEditPart.VISUAL_ID:
			return getStoryPattern_3011IncomingLinks(view);
		case CollectionVariableEditPart.VISUAL_ID:
			return getCollectionVariable_3006IncomingLinks(view);
		case AttributeAssignmentEditPart.VISUAL_ID:
			return getAttributeAssignment_3007IncomingLinks(view);
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_3008IncomingLinks(view);
		case ObjectVariableEditPart.VISUAL_ID:
			return getObjectVariable_3009IncomingLinks(view);
		case Constraint2EditPart.VISUAL_ID:
			return getConstraint_3010IncomingLinks(view);
		case EdgeEditPart.VISUAL_ID:
			return getEdge_4001IncomingLinks(view);
		case LinkVariableEditPart.VISUAL_ID:
			return getLinkVariable_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getOutgoingLinks(View view) {
		switch (BasicSDDVisualIDRegistry.getVisualID(view)) {
		case StoryPatternNodeEditPart.VISUAL_ID:
			return getStoryPatternNode_2003OutgoingLinks(view);
		case LeafNodeEditPart.VISUAL_ID:
			return getLeafNode_2004OutgoingLinks(view);
		case StoryPatternEditPart.VISUAL_ID:
			return getStoryPattern_3011OutgoingLinks(view);
		case CollectionVariableEditPart.VISUAL_ID:
			return getCollectionVariable_3006OutgoingLinks(view);
		case AttributeAssignmentEditPart.VISUAL_ID:
			return getAttributeAssignment_3007OutgoingLinks(view);
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_3008OutgoingLinks(view);
		case ObjectVariableEditPart.VISUAL_ID:
			return getObjectVariable_3009OutgoingLinks(view);
		case Constraint2EditPart.VISUAL_ID:
			return getConstraint_3010OutgoingLinks(view);
		case EdgeEditPart.VISUAL_ID:
			return getEdge_4001OutgoingLinks(view);
		case LinkVariableEditPart.VISUAL_ID:
			return getLinkVariable_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getStoryDecisionDiagram_1000ContainedLinks(View view) {
		StoryDecisionDiagram modelElement = (StoryDecisionDiagram) view.getElement();
		LinkedList<BasicSDDLinkDescriptor> result = new LinkedList<BasicSDDLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getStoryPatternNode_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getLeafNode_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getStoryPattern_3011ContainedLinks(View view) {
		StoryPattern modelElement = (StoryPattern) view.getElement();
		LinkedList<BasicSDDLinkDescriptor> result = new LinkedList<BasicSDDLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_LinkVariable_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getCollectionVariable_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getAttributeAssignment_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getConstraint_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getObjectVariable_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getConstraint_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getEdge_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getLinkVariable_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getStoryPatternNode_2003IncomingLinks(View view) {
		StoryPatternNode modelElement = (StoryPatternNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<BasicSDDLinkDescriptor> result = new LinkedList<BasicSDDLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getLeafNode_2004IncomingLinks(View view) {
		LeafNode modelElement = (LeafNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<BasicSDDLinkDescriptor> result = new LinkedList<BasicSDDLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getStoryPattern_3011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getCollectionVariable_3006IncomingLinks(View view) {
		CollectionVariable modelElement = (CollectionVariable) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<BasicSDDLinkDescriptor> result = new LinkedList<BasicSDDLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_LinkVariable_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getAttributeAssignment_3007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getConstraint_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getObjectVariable_3009IncomingLinks(View view) {
		ObjectVariable modelElement = (ObjectVariable) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<BasicSDDLinkDescriptor> result = new LinkedList<BasicSDDLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_LinkVariable_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getConstraint_3010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getEdge_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getLinkVariable_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getStoryPatternNode_2003OutgoingLinks(View view) {
		StoryPatternNode modelElement = (StoryPatternNode) view.getElement();
		LinkedList<BasicSDDLinkDescriptor> result = new LinkedList<BasicSDDLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getLeafNode_2004OutgoingLinks(View view) {
		LeafNode modelElement = (LeafNode) view.getElement();
		LinkedList<BasicSDDLinkDescriptor> result = new LinkedList<BasicSDDLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getStoryPattern_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getCollectionVariable_3006OutgoingLinks(View view) {
		CollectionVariable modelElement = (CollectionVariable) view.getElement();
		LinkedList<BasicSDDLinkDescriptor> result = new LinkedList<BasicSDDLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkVariable_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getAttributeAssignment_3007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getConstraint_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getObjectVariable_3009OutgoingLinks(View view) {
		ObjectVariable modelElement = (ObjectVariable) view.getElement();
		LinkedList<BasicSDDLinkDescriptor> result = new LinkedList<BasicSDDLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkVariable_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getConstraint_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getEdge_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BasicSDDLinkDescriptor> getLinkVariable_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<BasicSDDLinkDescriptor> getContainedTypeModelFacetLinks_Edge_4001(
			AbstractStoryDecisionDiagram container) {
		LinkedList<BasicSDDLinkDescriptor> result = new LinkedList<BasicSDDLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Edge) {
				continue;
			}
			Edge link = (Edge) linkObject;
			if (EdgeEditPart.VISUAL_ID != BasicSDDVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTargetNode();
			Node src = link.getSourceNode();
			result.add(
					new BasicSDDLinkDescriptor(src, dst, link, BasicSDDElementTypes.Edge_4001, EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BasicSDDLinkDescriptor> getContainedTypeModelFacetLinks_LinkVariable_4003(
			StoryPattern container) {
		LinkedList<BasicSDDLinkDescriptor> result = new LinkedList<BasicSDDLinkDescriptor>();
		for (Iterator<?> links = container.getLinkVariables().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LinkVariable) {
				continue;
			}
			LinkVariable link = (LinkVariable) linkObject;
			if (LinkVariableEditPart.VISUAL_ID != BasicSDDVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractVariable dst = link.getTarget();
			ObjectVariable src = link.getSource();
			result.add(new BasicSDDLinkDescriptor(src, dst, link, BasicSDDElementTypes.LinkVariable_4003,
					LinkVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<BasicSDDLinkDescriptor> getIncomingTypeModelFacetLinks_Edge_4001(Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<BasicSDDLinkDescriptor> result = new LinkedList<BasicSDDLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != SDDPackage.eINSTANCE.getEdge_TargetNode()
					|| false == setting.getEObject() instanceof Edge) {
				continue;
			}
			Edge link = (Edge) setting.getEObject();
			if (EdgeEditPart.VISUAL_ID != BasicSDDVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSourceNode();
			result.add(new BasicSDDLinkDescriptor(src, target, link, BasicSDDElementTypes.Edge_4001,
					EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BasicSDDLinkDescriptor> getIncomingTypeModelFacetLinks_LinkVariable_4003(
			AbstractVariable target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<BasicSDDLinkDescriptor> result = new LinkedList<BasicSDDLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != PatternsPackage.eINSTANCE.getAbstractLinkVariable_Target()
					|| false == setting.getEObject() instanceof LinkVariable) {
				continue;
			}
			LinkVariable link = (LinkVariable) setting.getEObject();
			if (LinkVariableEditPart.VISUAL_ID != BasicSDDVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ObjectVariable src = link.getSource();
			result.add(new BasicSDDLinkDescriptor(src, target, link, BasicSDDElementTypes.LinkVariable_4003,
					LinkVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<BasicSDDLinkDescriptor> getOutgoingTypeModelFacetLinks_Edge_4001(Node source) {
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
		LinkedList<BasicSDDLinkDescriptor> result = new LinkedList<BasicSDDLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Edge) {
				continue;
			}
			Edge link = (Edge) linkObject;
			if (EdgeEditPart.VISUAL_ID != BasicSDDVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTargetNode();
			Node src = link.getSourceNode();
			if (src != source) {
				continue;
			}
			result.add(
					new BasicSDDLinkDescriptor(src, dst, link, BasicSDDElementTypes.Edge_4001, EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BasicSDDLinkDescriptor> getOutgoingTypeModelFacetLinks_LinkVariable_4003(
			ObjectVariable source) {
		StoryPattern container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof StoryPattern) {
				container = (StoryPattern) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<BasicSDDLinkDescriptor> result = new LinkedList<BasicSDDLinkDescriptor>();
		for (Iterator<?> links = container.getLinkVariables().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LinkVariable) {
				continue;
			}
			LinkVariable link = (LinkVariable) linkObject;
			if (LinkVariableEditPart.VISUAL_ID != BasicSDDVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractVariable dst = link.getTarget();
			ObjectVariable src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new BasicSDDLinkDescriptor(src, dst, link, BasicSDDElementTypes.LinkVariable_4003,
					LinkVariableEditPart.VISUAL_ID));
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

		public List<BasicSDDNodeDescriptor> getSemanticChildren(View view) {
			return BasicSDDDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<BasicSDDLinkDescriptor> getContainedLinks(View view) {
			return BasicSDDDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<BasicSDDLinkDescriptor> getIncomingLinks(View view) {
			return BasicSDDDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<BasicSDDLinkDescriptor> getOutgoingLinks(View view) {
			return BasicSDDDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
