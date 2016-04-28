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
package org.muml.pim.component.diagram.providers;

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
import org.muml.mumlcore.modelinstance.ModelinstancePackage;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.component.diagram.edit.parts.AssemblyConnectorEditPart;
import org.muml.pim.component.diagram.edit.parts.ComponentPartEditPart;
import org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart;
import org.muml.pim.component.diagram.edit.parts.CoordinationProtocolPartEditPart;
import org.muml.pim.component.diagram.edit.parts.DelegationConnectorEditPart;
import org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart;
import org.muml.pim.component.diagram.edit.parts.HybridPortEditPart;
import org.muml.pim.component.diagram.edit.parts.ModelElementCategoryEditPart;
import org.muml.pim.component.diagram.edit.parts.PortPartCoordinationProtocolPartEditPart;
import org.muml.pim.component.diagram.edit.parts.PortPartEditPart;
import org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentEditPart;
import org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentEditPart;
import org.muml.pim.component.diagram.part.ComponentDiagramEditorPlugin;

/**
 * @generated
 */
public class MumlElementTypes {

	/**
	 * @generated
	 */
	private MumlElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ComponentDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ModelElementCategory_1000 = getElementType(
			"org.muml.pim.component.diagram.ModelElementCategory_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StaticAtomicComponent_2006 = getElementType(
			"org.muml.pim.component.diagram.StaticAtomicComponent_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StaticStructuredComponent_2005 = getElementType(
			"org.muml.pim.component.diagram.StaticStructuredComponent_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DiscretePort_3010 = getElementType(
			"org.muml.pim.component.diagram.DiscretePort_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContinuousPort_3011 = getElementType(
			"org.muml.pim.component.diagram.ContinuousPort_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HybridPort_3013 = getElementType("org.muml.pim.component.diagram.HybridPort_3013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentPart_3012 = getElementType(
			"org.muml.pim.component.diagram.ComponentPart_3012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PortPart_3022 = getElementType("org.muml.pim.component.diagram.PortPart_3022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CoordinationProtocolPart_3016 = getElementType(
			"org.muml.pim.component.diagram.CoordinationProtocolPart_3016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AssemblyConnector_4001 = getElementType(
			"org.muml.pim.component.diagram.AssemblyConnector_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DelegationConnector_4002 = getElementType(
			"org.muml.pim.component.diagram.DelegationConnector_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PortPartCoordinationProtocolPart_4004 = getElementType(
			"org.muml.pim.component.diagram.PortPartCoordinationProtocolPart_4004"); //$NON-NLS-1$

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

			elements.put(ModelElementCategory_1000, ModelinstancePackage.eINSTANCE.getModelElementCategory());

			elements.put(StaticAtomicComponent_2006, ComponentPackage.eINSTANCE.getStaticAtomicComponent());

			elements.put(StaticStructuredComponent_2005, ComponentPackage.eINSTANCE.getStaticStructuredComponent());

			elements.put(DiscretePort_3010, ComponentPackage.eINSTANCE.getDiscretePort());

			elements.put(ContinuousPort_3011, ComponentPackage.eINSTANCE.getContinuousPort());

			elements.put(HybridPort_3013, ComponentPackage.eINSTANCE.getHybridPort());

			elements.put(ComponentPart_3012, ComponentPackage.eINSTANCE.getComponentPart());

			elements.put(PortPart_3022, ComponentPackage.eINSTANCE.getPortPart());

			elements.put(CoordinationProtocolPart_3016, ComponentPackage.eINSTANCE.getCoordinationProtocolPart());

			elements.put(AssemblyConnector_4001, ComponentPackage.eINSTANCE.getAssemblyConnector());

			elements.put(DelegationConnector_4002, ComponentPackage.eINSTANCE.getDelegationConnector());

			elements.put(PortPartCoordinationProtocolPart_4004,
					ComponentPackage.eINSTANCE.getPortPart_CoordinationProtocolPart());
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
			KNOWN_ELEMENT_TYPES.add(ModelElementCategory_1000);
			KNOWN_ELEMENT_TYPES.add(StaticAtomicComponent_2006);
			KNOWN_ELEMENT_TYPES.add(StaticStructuredComponent_2005);
			KNOWN_ELEMENT_TYPES.add(DiscretePort_3010);
			KNOWN_ELEMENT_TYPES.add(ContinuousPort_3011);
			KNOWN_ELEMENT_TYPES.add(HybridPort_3013);
			KNOWN_ELEMENT_TYPES.add(ComponentPart_3012);
			KNOWN_ELEMENT_TYPES.add(PortPart_3022);
			KNOWN_ELEMENT_TYPES.add(CoordinationProtocolPart_3016);
			KNOWN_ELEMENT_TYPES.add(AssemblyConnector_4001);
			KNOWN_ELEMENT_TYPES.add(DelegationConnector_4002);
			KNOWN_ELEMENT_TYPES.add(PortPartCoordinationProtocolPart_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ModelElementCategoryEditPart.VISUAL_ID:
			return ModelElementCategory_1000;
		case StaticAtomicComponentEditPart.VISUAL_ID:
			return StaticAtomicComponent_2006;
		case StaticStructuredComponentEditPart.VISUAL_ID:
			return StaticStructuredComponent_2005;
		case DiscretePortEditPart.VISUAL_ID:
			return DiscretePort_3010;
		case ContinuousPortEditPart.VISUAL_ID:
			return ContinuousPort_3011;
		case HybridPortEditPart.VISUAL_ID:
			return HybridPort_3013;
		case ComponentPartEditPart.VISUAL_ID:
			return ComponentPart_3012;
		case PortPartEditPart.VISUAL_ID:
			return PortPart_3022;
		case CoordinationProtocolPartEditPart.VISUAL_ID:
			return CoordinationProtocolPart_3016;
		case AssemblyConnectorEditPart.VISUAL_ID:
			return AssemblyConnector_4001;
		case DelegationConnectorEditPart.VISUAL_ID:
			return DelegationConnector_4002;
		case PortPartCoordinationProtocolPartEditPart.VISUAL_ID:
			return PortPartCoordinationProtocolPart_4004;
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
			return org.muml.pim.component.diagram.providers.MumlElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return org.muml.pim.component.diagram.providers.MumlElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return org.muml.pim.component.diagram.providers.MumlElementTypes.getElement(elementTypeAdapter);
		}
	};

}
