package de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import org.storydriven.storydiagrams.patterns.PatternsPackage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class BasicSDDVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "de.uni_paderborn.fujaba.muml.verification.sdd.basicsdd.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryDecisionDiagramEditPart.MODEL_ID
					.equals(view.getType())) {
				return de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryDecisionDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDVisualIDRegistry
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
				de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDDiagramEditorPlugin
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
		if (de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.BasicSDDPackage.eINSTANCE
				.getStoryDecisionDiagram()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.StoryDecisionDiagram) domainElement)) {
			return de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryDecisionDiagramEditPart.VISUAL_ID;
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
		String containerModelID = de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDVisualIDRegistry
				.getModelID(containerView);
		if (!de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryDecisionDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryDecisionDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryDecisionDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryDecisionDiagramEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.BasicSDDPackage.eINSTANCE
					.getStoryPatternNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeEditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.SDDPackage.eINSTANCE
					.getLeafNode().isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.LeafNodeEditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodePatternNodeContentCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getStoryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternEditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternStoryPatternContentCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getCollectionVariable()
					.isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.CollectionVariableEditPart.VISUAL_ID;
			}
			if (PatternsPackage.eINSTANCE.getObjectVariable().isSuperTypeOf(
					domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableEditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternStoryPatternConstraintsCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getConstraint().isSuperTypeOf(
					domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.Constraint2EditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.CollectionVariableCollectionVariableConstraintsCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getConstraint().isSuperTypeOf(
					domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ConstraintEditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getAttributeAssignment()
					.isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.AttributeAssignmentEditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableObjectVariableConstraintsCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getConstraint().isSuperTypeOf(
					domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ConstraintEditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getAttributeAssignment()
					.isSuperTypeOf(domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.AttributeAssignmentEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDVisualIDRegistry
				.getModelID(containerView);
		if (!de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryDecisionDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryDecisionDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryDecisionDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryDecisionDiagramEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.LeafNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodePatternNodeContentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternStoryPatternContentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternStoryPatternConstraintsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.CollectionVariableEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.CollectionVariableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.CollectionVariableCollectionVariableConstraintsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableObjectVariableConstraintsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodePatternNodeContentCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternStoryPatternContentCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.CollectionVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternStoryPatternConstraintsCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.Constraint2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.CollectionVariableCollectionVariableConstraintsCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ConstraintEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.AttributeAssignmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableObjectVariableConstraintsCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ConstraintEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.AttributeAssignmentEditPart.VISUAL_ID == nodeVisualID) {
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
			return de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.EdgeEditPart.VISUAL_ID;
		}
		if (PatternsPackage.eINSTANCE.getLinkVariable().isSuperTypeOf(
				domainElement.eClass())) {
			return de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.LinkVariableEditPart.VISUAL_ID;
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
			de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.StoryDecisionDiagram element) {
		return true;
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
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodePatternNodeContentCompartmentEditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternStoryPatternContentCompartmentEditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternStoryPatternConstraintsCompartmentEditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.CollectionVariableCollectionVariableConstraintsCompartmentEditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableObjectVariableConstraintsCompartmentEditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
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
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryDecisionDiagramEditPart.VISUAL_ID:
			return false;
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.LeafNodeEditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.AttributeAssignmentEditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ConstraintEditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.Constraint2EditPart.VISUAL_ID:
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
			return de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
