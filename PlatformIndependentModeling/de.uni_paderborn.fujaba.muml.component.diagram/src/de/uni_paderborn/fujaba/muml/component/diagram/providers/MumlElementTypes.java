package de.uni_paderborn.fujaba.muml.component.diagram.providers;

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
			de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ModelElementCategory_1000 = getElementType("de.uni_paderborn.fujaba.muml.component.diagram.ModelElementCategory_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StaticAtomicComponent_2006 = getElementType("de.uni_paderborn.fujaba.muml.component.diagram.StaticAtomicComponent_2006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StaticStructuredComponent_2005 = getElementType("de.uni_paderborn.fujaba.muml.component.diagram.StaticStructuredComponent_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DiscretePort_3010 = getElementType("de.uni_paderborn.fujaba.muml.component.diagram.DiscretePort_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContinuousPort_3011 = getElementType("de.uni_paderborn.fujaba.muml.component.diagram.ContinuousPort_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HybridPort_3013 = getElementType("de.uni_paderborn.fujaba.muml.component.diagram.HybridPort_3013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentPart_3012 = getElementType("de.uni_paderborn.fujaba.muml.component.diagram.ComponentPart_3012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PortPart_3022 = getElementType("de.uni_paderborn.fujaba.muml.component.diagram.PortPart_3022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CoordinationProtocolPart_3016 = getElementType("de.uni_paderborn.fujaba.muml.component.diagram.CoordinationProtocolPart_3016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AssemblyConnector_4001 = getElementType("de.uni_paderborn.fujaba.muml.component.diagram.AssemblyConnector_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DelegationConnector_4002 = getElementType("de.uni_paderborn.fujaba.muml.component.diagram.DelegationConnector_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PortPartCoordinationProtocolPart_4004 = getElementType("de.uni_paderborn.fujaba.muml.component.diagram.PortPartCoordinationProtocolPart_4004"); //$NON-NLS-1$

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
					ModelElementCategory_1000,
					de.uni_paderborn.fujaba.modelinstance.ModelinstancePackage.eINSTANCE
							.getModelElementCategory());

			elements.put(
					StaticAtomicComponent_2006,
					de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
							.getStaticAtomicComponent());

			elements.put(
					StaticStructuredComponent_2005,
					de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
							.getStaticStructuredComponent());

			elements.put(
					DiscretePort_3010,
					de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
							.getDiscretePort());

			elements.put(
					ContinuousPort_3011,
					de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
							.getContinuousPort());

			elements.put(
					HybridPort_3013,
					de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
							.getHybridPort());

			elements.put(
					ComponentPart_3012,
					de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
							.getComponentPart());

			elements.put(
					PortPart_3022,
					de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
							.getPortPart());

			elements.put(
					CoordinationProtocolPart_3016,
					de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
							.getCoordinationProtocolPart());

			elements.put(
					AssemblyConnector_4001,
					de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
							.getAssemblyConnector());

			elements.put(
					DelegationConnector_4002,
					de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
							.getDelegationConnector());

			elements.put(
					PortPartCoordinationProtocolPart_4004,
					de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
							.getPortPart_CoordinationProtocolPart());
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
		case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return ModelElementCategory_1000;
		case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID:
			return StaticAtomicComponent_2006;
		case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID:
			return StaticStructuredComponent_2005;
		case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
			return DiscretePort_3010;
		case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
			return ContinuousPort_3011;
		case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
			return HybridPort_3013;
		case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
			return ComponentPart_3012;
		case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartEditPart.VISUAL_ID:
			return PortPart_3022;
		case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.CoordinationProtocolPartEditPart.VISUAL_ID:
			return CoordinationProtocolPart_3016;
		case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID:
			return AssemblyConnector_4001;
		case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID:
			return DelegationConnector_4002;
		case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartCoordinationProtocolPartEditPart.VISUAL_ID:
			return PortPartCoordinationProtocolPart_4004;
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
			return de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
