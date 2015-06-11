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
	public static final IElementType HWPlatform_2009 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.HWPlatform_2009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Bus_3025 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.Bus_3025"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NetworkBridge_3026 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.NetworkBridge_3026"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HWPlatformPart_3027 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.HWPlatformPart_3027"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HWPortPart_3028 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.HWPortPart_3028"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DelegationHWPort_3029 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.DelegationHWPort_3029"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ResourcePart_3030 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.ResourcePart_3030"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NetworkConnector_4032 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platform.diagram.NetworkConnector_4032"); //$NON-NLS-1$

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
					HWPlatform_2009,
					de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage.eINSTANCE
							.getHWPlatform());

			elements.put(
					Bus_3025,
					de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage.eINSTANCE
							.getBus());

			elements.put(
					NetworkBridge_3026,
					de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage.eINSTANCE
							.getNetworkBridge());

			elements.put(
					HWPlatformPart_3027,
					de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage.eINSTANCE
							.getHWPlatformPart());

			elements.put(
					HWPortPart_3028,
					de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage.eINSTANCE
							.getHWPortPart());

			elements.put(
					DelegationHWPort_3029,
					de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage.eINSTANCE
							.getDelegationHWPort());

			elements.put(
					ResourcePart_3030,
					de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage.eINSTANCE
							.getResourcePart());

			elements.put(
					NetworkConnector_4032,
					de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage.eINSTANCE
							.getNetworkConnector());
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
			KNOWN_ELEMENT_TYPES.add(HWPlatform_2009);
			KNOWN_ELEMENT_TYPES.add(Bus_3025);
			KNOWN_ELEMENT_TYPES.add(NetworkBridge_3026);
			KNOWN_ELEMENT_TYPES.add(HWPlatformPart_3027);
			KNOWN_ELEMENT_TYPES.add(HWPortPart_3028);
			KNOWN_ELEMENT_TYPES.add(DelegationHWPort_3029);
			KNOWN_ELEMENT_TYPES.add(ResourcePart_3030);
			KNOWN_ELEMENT_TYPES.add(NetworkConnector_4032);
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
			return HWPlatform_2009;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusEditPart.VISUAL_ID:
			return Bus_3025;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart.VISUAL_ID:
			return NetworkBridge_3026;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart.VISUAL_ID:
			return HWPlatformPart_3027;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID:
			return HWPortPart_3028;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationHWPortEditPart.VISUAL_ID:
			return DelegationHWPort_3029;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourcePartEditPart.VISUAL_ID:
			return ResourcePart_3030;
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.NetworkConnectorEditPart.VISUAL_ID:
			return NetworkConnector_4032;
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
