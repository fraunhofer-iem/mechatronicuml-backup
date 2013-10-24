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
	public static final IElementType HWPlatform_2007 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.HWPlatform_2007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Bus_3008 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.Bus_3008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Bridge_3009 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.Bridge_3009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HWPlatformPart_3010 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.HWPlatformPart_3010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HWPortPart_3007 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.HWPortPart_3007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType BusPortInstance_3011 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.BusPortInstance_3011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ResourceInstancePart_3012 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.ResourceInstancePart_3012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HWPortPart_3005 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.HWPortPart_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LinkPortInstance_3013 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.LinkPortInstance_3013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Delegation_4001 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.Delegation_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Link_4002 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.Link_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HWPortPartConnectedMedia_4027 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.HWPortPartConnectedMedia_4027"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CommunicationMediaConnectedBridges_4023 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.CommunicationMediaConnectedBridges_4023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Link_4011 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.Link_4011"); //$NON-NLS-1$

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
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getHWPlatform());

			elements.put(
					HWPlatform_2007,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getHWPlatform());

			elements.put(
					Bus_3008,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getBus());

			elements.put(
					Bridge_3009,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getBridge());

			elements.put(
					HWPlatformPart_3010,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getHWPlatformPart());

			elements.put(
					HWPortPart_3007,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getHWPortPart());

			elements.put(
					BusPortInstance_3011,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getBusPortInstance());

			elements.put(
					ResourceInstancePart_3012,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getResourceInstancePart());

			elements.put(
					HWPortPart_3005,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getHWPortPart());

			elements.put(
					LinkPortInstance_3013,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getLinkPortInstance());

			elements.put(
					Delegation_4001,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getDelegation());

			elements.put(
					Link_4002,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getLink());

			elements.put(
					HWPortPartConnectedMedia_4027,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getHWPortPart_ConnectedMedia());

			elements.put(
					CommunicationMediaConnectedBridges_4023,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getCommunicationMedia_ConnectedBridges());

			elements.put(
					Link_4011,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getLink());
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
			KNOWN_ELEMENT_TYPES.add(HWPlatform_2007);
			KNOWN_ELEMENT_TYPES.add(Bus_3008);
			KNOWN_ELEMENT_TYPES.add(Bridge_3009);
			KNOWN_ELEMENT_TYPES.add(HWPlatformPart_3010);
			KNOWN_ELEMENT_TYPES.add(HWPortPart_3007);
			KNOWN_ELEMENT_TYPES.add(BusPortInstance_3011);
			KNOWN_ELEMENT_TYPES.add(ResourceInstancePart_3012);
			KNOWN_ELEMENT_TYPES.add(HWPortPart_3005);
			KNOWN_ELEMENT_TYPES.add(LinkPortInstance_3013);
			KNOWN_ELEMENT_TYPES.add(Delegation_4001);
			KNOWN_ELEMENT_TYPES.add(Link_4002);
			KNOWN_ELEMENT_TYPES.add(HWPortPartConnectedMedia_4027);
			KNOWN_ELEMENT_TYPES.add(CommunicationMediaConnectedBridges_4023);
			KNOWN_ELEMENT_TYPES.add(Link_4011);
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
			return HWPlatform_2007;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusEditPart.VISUAL_ID:
			return Bus_3008;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BridgeEditPart.VISUAL_ID:
			return Bridge_3009;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart.VISUAL_ID:
			return HWPlatformPart_3010;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPart2EditPart.VISUAL_ID:
			return HWPortPart_3007;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusPortInstanceEditPart.VISUAL_ID:
			return BusPortInstance_3011;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourceInstancePartEditPart.VISUAL_ID:
			return ResourceInstancePart_3012;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID:
			return HWPortPart_3005;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.LinkPortInstanceEditPart.VISUAL_ID:
			return LinkPortInstance_3013;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return Delegation_4001;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return Link_4002;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPartConnectedMediaEditPart.VISUAL_ID:
			return HWPortPartConnectedMedia_4027;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.CommunicationMediaConnectedBridgesEditPart.VISUAL_ID:
			return CommunicationMediaConnectedBridges_4023;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.Link2EditPart.VISUAL_ID:
			return Link_4011;
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
