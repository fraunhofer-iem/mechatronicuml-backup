package org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.muml.storydiagram.patterns.PatternsPackage;
import org.muml.storydiagram.verification.sdd.SDDPackage;
import org.muml.storydiagram.verification.sdd.basicsdd.BasicSDDPackage;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.AttributeAssignmentEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.Constraint2EditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ConstraintEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.EdgeEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LeafNodeEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LinkVariableEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ObjectVariableEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryDecisionDiagramEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodeEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDDiagramEditorPlugin;

/**
 * @generated
 */
public class BasicSDDElementTypes {

	/**
	 * @generated
	 */
	private BasicSDDElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			BasicSDDDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType StoryDecisionDiagram_1000 = getElementType(
			"org.muml.storydiagram.verification.sdd.basicsdd.diagram.StoryDecisionDiagram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StoryPatternNode_2003 = getElementType(
			"org.muml.storydiagram.verification.sdd.basicsdd.diagram.StoryPatternNode_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LeafNode_2004 = getElementType(
			"org.muml.storydiagram.verification.sdd.basicsdd.diagram.LeafNode_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StoryPattern_3011 = getElementType(
			"org.muml.storydiagram.verification.sdd.basicsdd.diagram.StoryPattern_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CollectionVariable_3006 = getElementType(
			"org.muml.storydiagram.verification.sdd.basicsdd.diagram.CollectionVariable_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AttributeAssignment_3007 = getElementType(
			"org.muml.storydiagram.verification.sdd.basicsdd.diagram.AttributeAssignment_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Constraint_3008 = getElementType(
			"org.muml.storydiagram.verification.sdd.basicsdd.diagram.Constraint_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ObjectVariable_3009 = getElementType(
			"org.muml.storydiagram.verification.sdd.basicsdd.diagram.ObjectVariable_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Constraint_3010 = getElementType(
			"org.muml.storydiagram.verification.sdd.basicsdd.diagram.Constraint_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Edge_4001 = getElementType(
			"org.muml.storydiagram.verification.sdd.basicsdd.diagram.Edge_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LinkVariable_4003 = getElementType(
			"org.muml.storydiagram.verification.sdd.basicsdd.diagram.LinkVariable_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(StoryDecisionDiagram_1000, BasicSDDPackage.eINSTANCE.getStoryDecisionDiagram());

			elements.put(StoryPatternNode_2003, BasicSDDPackage.eINSTANCE.getStoryPatternNode());

			elements.put(LeafNode_2004, SDDPackage.eINSTANCE.getLeafNode());

			elements.put(StoryPattern_3011, PatternsPackage.eINSTANCE.getStoryPattern());

			elements.put(CollectionVariable_3006, PatternsPackage.eINSTANCE.getCollectionVariable());

			elements.put(AttributeAssignment_3007, PatternsPackage.eINSTANCE.getAttributeAssignment());

			elements.put(Constraint_3008, PatternsPackage.eINSTANCE.getConstraint());

			elements.put(ObjectVariable_3009, PatternsPackage.eINSTANCE.getObjectVariable());

			elements.put(Constraint_3010, PatternsPackage.eINSTANCE.getConstraint());

			elements.put(Edge_4001, SDDPackage.eINSTANCE.getEdge());

			elements.put(LinkVariable_4003, PatternsPackage.eINSTANCE.getLinkVariable());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(StoryDecisionDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(StoryPatternNode_2003);
			KNOWN_ELEMENT_TYPES.add(LeafNode_2004);
			KNOWN_ELEMENT_TYPES.add(StoryPattern_3011);
			KNOWN_ELEMENT_TYPES.add(CollectionVariable_3006);
			KNOWN_ELEMENT_TYPES.add(AttributeAssignment_3007);
			KNOWN_ELEMENT_TYPES.add(Constraint_3008);
			KNOWN_ELEMENT_TYPES.add(ObjectVariable_3009);
			KNOWN_ELEMENT_TYPES.add(Constraint_3010);
			KNOWN_ELEMENT_TYPES.add(Edge_4001);
			KNOWN_ELEMENT_TYPES.add(LinkVariable_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case StoryDecisionDiagramEditPart.VISUAL_ID:
			return StoryDecisionDiagram_1000;
		case StoryPatternNodeEditPart.VISUAL_ID:
			return StoryPatternNode_2003;
		case LeafNodeEditPart.VISUAL_ID:
			return LeafNode_2004;
		case StoryPatternEditPart.VISUAL_ID:
			return StoryPattern_3011;
		case CollectionVariableEditPart.VISUAL_ID:
			return CollectionVariable_3006;
		case AttributeAssignmentEditPart.VISUAL_ID:
			return AttributeAssignment_3007;
		case ConstraintEditPart.VISUAL_ID:
			return Constraint_3008;
		case ObjectVariableEditPart.VISUAL_ID:
			return ObjectVariable_3009;
		case Constraint2EditPart.VISUAL_ID:
			return Constraint_3010;
		case EdgeEditPart.VISUAL_ID:
			return Edge_4001;
		case LinkVariableEditPart.VISUAL_ID:
			return LinkVariable_4003;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes
					.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes
					.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
