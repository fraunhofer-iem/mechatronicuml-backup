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
package de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers;

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

/**
 * @generated
 */
public class ComponentSDDElementTypes {

	/**
	 * @generated
	 */
	private ComponentSDDElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ComponentStoryDecisionDiagram_1000 = getElementType("de.uni_paderborn.fujaba.muml.verification.sdd.componentSDD.diagram.ComponentStoryDecisionDiagram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentStoryPatternNode_2003 = getElementType("de.uni_paderborn.fujaba.muml.verification.sdd.componentSDD.diagram.ComponentStoryPatternNode_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LeafNode_2002 = getElementType("de.uni_paderborn.fujaba.muml.verification.sdd.componentSDD.diagram.LeafNode_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InitialNode_2004 = getElementType("de.uni_paderborn.fujaba.muml.verification.sdd.componentSDD.diagram.InitialNode_2004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ComponentStoryPattern_3001 = getElementType("de.uni_paderborn.fujaba.muml.verification.sdd.componentSDD.diagram.ComponentStoryPattern_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentVariable_3002 = getElementType("de.uni_paderborn.fujaba.muml.verification.sdd.componentSDD.diagram.ComponentVariable_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentPartVariable_3003 = getElementType("de.uni_paderborn.fujaba.muml.verification.sdd.componentSDD.diagram.ComponentPartVariable_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultiPortVariable_3004 = getElementType("de.uni_paderborn.fujaba.muml.verification.sdd.componentSDD.diagram.MultiPortVariable_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SinglePortVariable_3005 = getElementType("de.uni_paderborn.fujaba.muml.verification.sdd.componentSDD.diagram.SinglePortVariable_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SinglePortVariable_3006 = getElementType("de.uni_paderborn.fujaba.muml.verification.sdd.componentSDD.diagram.SinglePortVariable_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultiPortVariable_3007 = getElementType("de.uni_paderborn.fujaba.muml.verification.sdd.componentSDD.diagram.MultiPortVariable_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SinglePortVariable_3008 = getElementType("de.uni_paderborn.fujaba.muml.verification.sdd.componentSDD.diagram.SinglePortVariable_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FadingComponentPartVariable_3009 = getElementType("de.uni_paderborn.fujaba.muml.verification.sdd.componentSDD.diagram.FadingComponentPartVariable_3009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Edge_4001 = getElementType("de.uni_paderborn.fujaba.muml.verification.sdd.componentSDD.diagram.Edge_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AssemblyVariable_4002 = getElementType("de.uni_paderborn.fujaba.muml.verification.sdd.componentSDD.diagram.AssemblyVariable_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DelegationVariable_4003 = getElementType("de.uni_paderborn.fujaba.muml.verification.sdd.componentSDD.diagram.DelegationVariable_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MultiPortOrderConstraint_4004 = getElementType("de.uni_paderborn.fujaba.muml.verification.sdd.componentSDD.diagram.MultiPortOrderConstraint_4004"); //$NON-NLS-1$

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

			elements.put(
					ComponentStoryDecisionDiagram_1000,
					de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentsddPackage.eINSTANCE
							.getComponentStoryDecisionDiagram());

			elements.put(
					ComponentStoryPatternNode_2003,
					de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentsddPackage.eINSTANCE
							.getComponentStoryPatternNode());

			elements.put(
					LeafNode_2002,
					de.uni_paderborn.fujaba.muml.verification.sdd.SDDPackage.eINSTANCE
							.getLeafNode());

			elements.put(
					InitialNode_2004,
					de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentsddPackage.eINSTANCE
							.getInitialNode());

			elements.put(
					ComponentStoryPattern_3001,
					de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getComponentStoryPattern());

			elements.put(
					ComponentVariable_3002,
					de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getComponentVariable());

			elements.put(
					ComponentPartVariable_3003,
					de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getComponentPartVariable());

			elements.put(
					MultiPortVariable_3004,
					de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getMultiPortVariable());

			elements.put(
					SinglePortVariable_3005,
					de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getSinglePortVariable());

			elements.put(
					SinglePortVariable_3006,
					de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getSinglePortVariable());

			elements.put(
					MultiPortVariable_3007,
					de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getMultiPortVariable());

			elements.put(
					SinglePortVariable_3008,
					de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getSinglePortVariable());

			elements.put(
					FadingComponentPartVariable_3009,
					de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getFadingComponentPartVariable());

			elements.put(
					Edge_4001,
					de.uni_paderborn.fujaba.muml.verification.sdd.SDDPackage.eINSTANCE
							.getEdge());

			elements.put(
					AssemblyVariable_4002,
					de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getAssemblyVariable());

			elements.put(
					DelegationVariable_4003,
					de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getDelegationVariable());

			elements.put(
					MultiPortOrderConstraint_4004,
					de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
							.getMultiPortOrderConstraint());
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
			KNOWN_ELEMENT_TYPES.add(ComponentStoryDecisionDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(ComponentStoryPatternNode_2003);
			KNOWN_ELEMENT_TYPES.add(LeafNode_2002);
			KNOWN_ELEMENT_TYPES.add(InitialNode_2004);
			KNOWN_ELEMENT_TYPES.add(ComponentStoryPattern_3001);
			KNOWN_ELEMENT_TYPES.add(ComponentVariable_3002);
			KNOWN_ELEMENT_TYPES.add(ComponentPartVariable_3003);
			KNOWN_ELEMENT_TYPES.add(MultiPortVariable_3004);
			KNOWN_ELEMENT_TYPES.add(SinglePortVariable_3005);
			KNOWN_ELEMENT_TYPES.add(SinglePortVariable_3006);
			KNOWN_ELEMENT_TYPES.add(MultiPortVariable_3007);
			KNOWN_ELEMENT_TYPES.add(SinglePortVariable_3008);
			KNOWN_ELEMENT_TYPES.add(FadingComponentPartVariable_3009);
			KNOWN_ELEMENT_TYPES.add(Edge_4001);
			KNOWN_ELEMENT_TYPES.add(AssemblyVariable_4002);
			KNOWN_ELEMENT_TYPES.add(DelegationVariable_4003);
			KNOWN_ELEMENT_TYPES.add(MultiPortOrderConstraint_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryDecisionDiagramEditPart.VISUAL_ID:
			return ComponentStoryDecisionDiagram_1000;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeEditPart.VISUAL_ID:
			return ComponentStoryPatternNode_2003;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.LeafNodeEditPart.VISUAL_ID:
			return LeafNode_2002;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
			return InitialNode_2004;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternEditPart.VISUAL_ID:
			return ComponentStoryPattern_3001;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableEditPart.VISUAL_ID:
			return ComponentVariable_3002;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentPartVariableEditPart.VISUAL_ID:
			return ComponentPartVariable_3003;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableEditPart.VISUAL_ID:
			return MultiPortVariable_3004;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariableEditPart.VISUAL_ID:
			return SinglePortVariable_3005;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable2EditPart.VISUAL_ID:
			return SinglePortVariable_3006;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariable2EditPart.VISUAL_ID:
			return MultiPortVariable_3007;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable3EditPart.VISUAL_ID:
			return SinglePortVariable_3008;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.FadingComponentPartVariableEditPart.VISUAL_ID:
			return FadingComponentPartVariable_3009;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.EdgeEditPart.VISUAL_ID:
			return Edge_4001;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.AssemblyVariableEditPart.VISUAL_ID:
			return AssemblyVariable_4002;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableEditPart.VISUAL_ID:
			return DelegationVariable_4003;
		case de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortOrderConstraintEditPart.VISUAL_ID:
			return MultiPortOrderConstraint_4004;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
