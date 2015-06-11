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
	public static final IElementType HWPlatformInstance_2005 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.HWPlatformInstance_2005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HWPlatformInstanceConfiguration_3039 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.HWPlatformInstanceConfiguration_3039"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HWPlatformInstance_3040 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.HWPlatformInstance_3040"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DelegationHWPortInstance_3041 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.DelegationHWPortInstance_3041"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StructuredResourceInstance_3042 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.StructuredResourceInstance_3042"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HWPortInstance_3043 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.HWPortInstance_3043"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ActuatorInstance_3044 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.ActuatorInstance_3044"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SensorInstance_3045 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.SensorInstance_3045"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType BusInstance_3046 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.BusInstance_3046"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NetworkBridgeInstance_3047 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.NetworkBridgeInstance_3047"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NetworkConnectorInstance_4012 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.NetworkConnectorInstance_4012"); //$NON-NLS-1$

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
					HWPlatformInstance_2005,
					de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
							.getHWPlatformInstance());

			elements.put(
					HWPlatformInstanceConfiguration_3039,
					de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
							.getHWPlatformInstanceConfiguration());

			elements.put(
					HWPlatformInstance_3040,
					de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
							.getHWPlatformInstance());

			elements.put(
					DelegationHWPortInstance_3041,
					de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
							.getDelegationHWPortInstance());

			elements.put(
					StructuredResourceInstance_3042,
					de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
							.getStructuredResourceInstance());

			elements.put(
					HWPortInstance_3043,
					de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
							.getHWPortInstance());

			elements.put(
					ActuatorInstance_3044,
					de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
							.getActuatorInstance());

			elements.put(
					SensorInstance_3045,
					de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
							.getSensorInstance());

			elements.put(
					BusInstance_3046,
					de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
							.getBusInstance());

			elements.put(
					NetworkBridgeInstance_3047,
					de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
							.getNetworkBridgeInstance());

			elements.put(
					NetworkConnectorInstance_4012,
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
			KNOWN_ELEMENT_TYPES.add(HWPlatformInstance_2005);
			KNOWN_ELEMENT_TYPES.add(HWPlatformInstanceConfiguration_3039);
			KNOWN_ELEMENT_TYPES.add(HWPlatformInstance_3040);
			KNOWN_ELEMENT_TYPES.add(DelegationHWPortInstance_3041);
			KNOWN_ELEMENT_TYPES.add(StructuredResourceInstance_3042);
			KNOWN_ELEMENT_TYPES.add(HWPortInstance_3043);
			KNOWN_ELEMENT_TYPES.add(ActuatorInstance_3044);
			KNOWN_ELEMENT_TYPES.add(SensorInstance_3045);
			KNOWN_ELEMENT_TYPES.add(BusInstance_3046);
			KNOWN_ELEMENT_TYPES.add(NetworkBridgeInstance_3047);
			KNOWN_ELEMENT_TYPES.add(NetworkConnectorInstance_4012);
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
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart.VISUAL_ID:
			return HWPlatformInstance_2005;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfiguration2EditPart.VISUAL_ID:
			return HWPlatformInstanceConfiguration_3039;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart.VISUAL_ID:
			return HWPlatformInstance_3040;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart.VISUAL_ID:
			return DelegationHWPortInstance_3041;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return StructuredResourceInstance_3042;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPortInstanceEditPart.VISUAL_ID:
			return HWPortInstance_3043;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return ActuatorInstance_3044;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
			return SensorInstance_3045;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusInstanceEditPart.VISUAL_ID:
			return BusInstance_3046;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.NetworkBridgeInstanceEditPart.VISUAL_ID:
			return NetworkBridgeInstance_3047;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.NetworkConnectorInstanceEditPart.VISUAL_ID:
			return NetworkConnectorInstance_4012;
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
