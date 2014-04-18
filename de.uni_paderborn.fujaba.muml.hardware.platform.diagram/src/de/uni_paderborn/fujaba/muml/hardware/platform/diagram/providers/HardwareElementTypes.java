package de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers;

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
public class HardwareElementTypes {

	/**
	 * @generated
	 */
	private HardwareElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType HWPlatform_1000 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.HWPlatform_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HWPlatform_2008 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.HWPlatform_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BusPart_3014 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.BusPart_3014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BridgePart_3015 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.BridgePart_3015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HWPlatformPart_3016 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.HWPlatformPart_3016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HWPortPart_3017 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.HWPortPart_3017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DelegationHWPort_3018 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.DelegationHWPort_3018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ResourcePart_3019 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.ResourcePart_3019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Delegation_4028 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.Delegation_4028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LinkPart_4029 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.LinkPart_4029"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BusConnector_4030 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.BusConnector_4030"); //$NON-NLS-1$

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
					HWPlatform_1000,
					de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage.eINSTANCE
							.getHWPlatform());

			elements.put(
					HWPlatform_2008,
					de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage.eINSTANCE
							.getHWPlatform());

			elements.put(
					BusPart_3014,
					de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage.eINSTANCE
							.getBusPart());

			elements.put(
					BridgePart_3015,
					de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage.eINSTANCE
							.getBridgePart());

			elements.put(
					HWPlatformPart_3016,
					de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage.eINSTANCE
							.getHWPlatformPart());

			elements.put(
					HWPortPart_3017,
					de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage.eINSTANCE
							.getHWPortPart());

			elements.put(
					DelegationHWPort_3018,
					de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage.eINSTANCE
							.getDelegationHWPort());

			elements.put(
					ResourcePart_3019,
					de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage.eINSTANCE
							.getResourcePart());

			elements.put(
					Delegation_4028,
					de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage.eINSTANCE
							.getDelegation());

			elements.put(
					LinkPart_4029,
					de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage.eINSTANCE
							.getLinkPart());

			elements.put(
					BusConnector_4030,
					de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage.eINSTANCE
							.getBusConnector());
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
			KNOWN_ELEMENT_TYPES.add(HWPlatform_1000);
			KNOWN_ELEMENT_TYPES.add(HWPlatform_2008);
			KNOWN_ELEMENT_TYPES.add(BusPart_3014);
			KNOWN_ELEMENT_TYPES.add(BridgePart_3015);
			KNOWN_ELEMENT_TYPES.add(HWPlatformPart_3016);
			KNOWN_ELEMENT_TYPES.add(HWPortPart_3017);
			KNOWN_ELEMENT_TYPES.add(DelegationHWPort_3018);
			KNOWN_ELEMENT_TYPES.add(ResourcePart_3019);
			KNOWN_ELEMENT_TYPES.add(Delegation_4028);
			KNOWN_ELEMENT_TYPES.add(LinkPart_4029);
			KNOWN_ELEMENT_TYPES.add(BusConnector_4030);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformEditPart.VISUAL_ID:
			return HWPlatform_1000;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatform2EditPart.VISUAL_ID:
			return HWPlatform_2008;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusPartEditPart.VISUAL_ID:
			return BusPart_3014;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BridgePartEditPart.VISUAL_ID:
			return BridgePart_3015;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart.VISUAL_ID:
			return HWPlatformPart_3016;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID:
			return HWPortPart_3017;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationHWPortEditPart.VISUAL_ID:
			return DelegationHWPort_3018;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourcePartEditPart.VISUAL_ID:
			return ResourcePart_3019;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return Delegation_4028;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.LinkPartEditPart.VISUAL_ID:
			return LinkPart_4029;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusConnectorEditPart.VISUAL_ID:
			return BusConnector_4030;
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
			return de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
