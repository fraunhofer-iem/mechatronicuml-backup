package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers;

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
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType HWPlatformInstanceConfiguration_1000 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.HWPlatformInstanceConfiguration_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HWPlatformInstance_2004 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.HWPlatformInstance_2004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HWPlatformInstance_3031 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.HWPlatformInstance_3031"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HWPlatformInstanceConfiguration_3032 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.HWPlatformInstanceConfiguration_3032"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StructuredResourceInstance_3033 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.StructuredResourceInstance_3033"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HWPortInstance_3030 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.HWPortInstance_3030"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ActuatorInstance_3034 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.ActuatorInstance_3034"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SensorInstance_3035 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.SensorInstance_3035"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType BusInstance_3036 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.BusInstance_3036"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NetworkBridgeInstance_3038 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.NetworkBridgeInstance_3038"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NetworkConnectorInstance_4011 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.NetworkConnectorInstance_4011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DelegationHWPortInstance_3028 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.DelegationHWPortInstance_3028"); //$NON-NLS-1$

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
					HWPlatformInstanceConfiguration_1000,
					de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
							.getHWPlatformInstanceConfiguration());

			elements.put(
					HWPlatformInstance_2004,
					de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
							.getHWPlatformInstance());

			elements.put(
					HWPlatformInstanceConfiguration_3032,
					de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
							.getHWPlatformInstanceConfiguration());

			elements.put(
					HWPlatformInstance_3031,
					de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
							.getHWPlatformInstance());

			elements.put(
					DelegationHWPortInstance_3028,
					de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
							.getDelegationHWPortInstance());

			elements.put(
					StructuredResourceInstance_3033,
					de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
							.getStructuredResourceInstance());

			elements.put(
					HWPortInstance_3030,
					de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
							.getHWPortInstance());

			elements.put(
					ActuatorInstance_3034,
					de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
							.getActuatorInstance());

			elements.put(
					SensorInstance_3035,
					de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
							.getSensorInstance());

			elements.put(
					BusInstance_3036,
					de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
							.getBusInstance());

			elements.put(
					NetworkBridgeInstance_3038,
					de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
							.getNetworkBridgeInstance());

			elements.put(
					NetworkConnectorInstance_4011,
					de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
							.getNetworkConnectorInstance());
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
			KNOWN_ELEMENT_TYPES.add(HWPlatformInstanceConfiguration_1000);
			KNOWN_ELEMENT_TYPES.add(HWPlatformInstance_2004);
			KNOWN_ELEMENT_TYPES.add(HWPlatformInstanceConfiguration_3032);
			KNOWN_ELEMENT_TYPES.add(HWPlatformInstance_3031);
			KNOWN_ELEMENT_TYPES.add(DelegationHWPortInstance_3028);
			KNOWN_ELEMENT_TYPES.add(StructuredResourceInstance_3033);
			KNOWN_ELEMENT_TYPES.add(HWPortInstance_3030);
			KNOWN_ELEMENT_TYPES.add(ActuatorInstance_3034);
			KNOWN_ELEMENT_TYPES.add(SensorInstance_3035);
			KNOWN_ELEMENT_TYPES.add(BusInstance_3036);
			KNOWN_ELEMENT_TYPES.add(NetworkBridgeInstance_3038);
			KNOWN_ELEMENT_TYPES.add(NetworkConnectorInstance_4011);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationEditPart.VISUAL_ID:
			return HWPlatformInstanceConfiguration_1000;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart.VISUAL_ID:
			return HWPlatformInstance_2004;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfiguration3EditPart.VISUAL_ID:
			return HWPlatformInstanceConfiguration_3032;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart.VISUAL_ID:
			return HWPlatformInstance_3031;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart.VISUAL_ID:
			return DelegationHWPortInstance_3028;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return StructuredResourceInstance_3033;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPortInstanceEditPart.VISUAL_ID:
			return HWPortInstance_3030;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return ActuatorInstance_3034;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
			return SensorInstance_3035;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusInstanceEditPart.VISUAL_ID:
			return BusInstance_3036;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.NetworkBridgeInstanceEditPart.VISUAL_ID:
			return NetworkBridgeInstance_3038;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.NetworkConnectorInstanceEditPart.VISUAL_ID:
			return NetworkConnectorInstance_4011;
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
			return de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
