package org.muml.pm.hardware.platforminstance.diagram.providers;

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
import org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.BusInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfiguration2EditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPortInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkBridgeInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkConnectorInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin;

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
			PlatformInstanceDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType HWPlatformInstanceConfiguration_1000 = getElementType(
			"org.muml.pm.hardware.platforminstance.diagram.HWPlatformInstanceConfiguration_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HWPlatformInstance_2005 = getElementType(
			"org.muml.pm.hardware.platforminstance.diagram.HWPlatformInstance_2005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HWPlatformInstanceConfiguration_3039 = getElementType(
			"org.muml.pm.hardware.platforminstance.diagram.HWPlatformInstanceConfiguration_3039"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HWPlatformInstance_3040 = getElementType(
			"org.muml.pm.hardware.platforminstance.diagram.HWPlatformInstance_3040"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DelegationHWPortInstance_3041 = getElementType(
			"org.muml.pm.hardware.platforminstance.diagram.DelegationHWPortInstance_3041"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StructuredResourceInstance_3042 = getElementType(
			"org.muml.pm.hardware.platforminstance.diagram.StructuredResourceInstance_3042"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HWPortInstance_3043 = getElementType(
			"org.muml.pm.hardware.platforminstance.diagram.HWPortInstance_3043"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ActuatorInstance_3044 = getElementType(
			"org.muml.pm.hardware.platforminstance.diagram.ActuatorInstance_3044"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SensorInstance_3045 = getElementType(
			"org.muml.pm.hardware.platforminstance.diagram.SensorInstance_3045"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType BusInstance_3046 = getElementType(
			"org.muml.pm.hardware.platforminstance.diagram.BusInstance_3046"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NetworkBridgeInstance_3047 = getElementType(
			"org.muml.pm.hardware.platforminstance.diagram.NetworkBridgeInstance_3047"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NetworkConnectorInstance_4012 = getElementType(
			"org.muml.pm.hardware.platforminstance.diagram.NetworkConnectorInstance_4012"); //$NON-NLS-1$

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

			elements.put(HWPlatformInstanceConfiguration_1000,
					HwplatforminstancePackage.eINSTANCE.getHWPlatformInstanceConfiguration());

			elements.put(HWPlatformInstance_2005, HwplatforminstancePackage.eINSTANCE.getHWPlatformInstance());

			elements.put(HWPlatformInstanceConfiguration_3039,
					HwplatforminstancePackage.eINSTANCE.getHWPlatformInstanceConfiguration());

			elements.put(HWPlatformInstance_3040, HwplatforminstancePackage.eINSTANCE.getHWPlatformInstance());

			elements.put(DelegationHWPortInstance_3041,
					HwplatforminstancePackage.eINSTANCE.getDelegationHWPortInstance());

			elements.put(StructuredResourceInstance_3042,
					HwresourceinstancePackage.eINSTANCE.getStructuredResourceInstance());

			elements.put(HWPortInstance_3043, HwplatforminstancePackage.eINSTANCE.getHWPortInstance());

			elements.put(ActuatorInstance_3044, HwresourceinstancePackage.eINSTANCE.getActuatorInstance());

			elements.put(SensorInstance_3045, HwresourceinstancePackage.eINSTANCE.getSensorInstance());

			elements.put(BusInstance_3046, HwplatforminstancePackage.eINSTANCE.getBusInstance());

			elements.put(NetworkBridgeInstance_3047, HwplatforminstancePackage.eINSTANCE.getNetworkBridgeInstance());

			elements.put(NetworkConnectorInstance_4012,
					HwplatforminstancePackage.eINSTANCE.getNetworkConnectorInstance());
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
		case HWPlatformInstanceConfigurationEditPart.VISUAL_ID:
			return HWPlatformInstanceConfiguration_1000;
		case HWPlatformInstanceEditPart.VISUAL_ID:
			return HWPlatformInstance_2005;
		case HWPlatformInstanceConfiguration2EditPart.VISUAL_ID:
			return HWPlatformInstanceConfiguration_3039;
		case HWPlatformInstance2EditPart.VISUAL_ID:
			return HWPlatformInstance_3040;
		case DelegationHWPortInstanceEditPart.VISUAL_ID:
			return DelegationHWPortInstance_3041;
		case StructuredResourceInstanceEditPart.VISUAL_ID:
			return StructuredResourceInstance_3042;
		case HWPortInstanceEditPart.VISUAL_ID:
			return HWPortInstance_3043;
		case ActuatorInstanceEditPart.VISUAL_ID:
			return ActuatorInstance_3044;
		case SensorInstanceEditPart.VISUAL_ID:
			return SensorInstance_3045;
		case BusInstanceEditPart.VISUAL_ID:
			return BusInstance_3046;
		case NetworkBridgeInstanceEditPart.VISUAL_ID:
			return NetworkBridgeInstance_3047;
		case NetworkConnectorInstanceEditPart.VISUAL_ID:
			return NetworkConnectorInstance_4012;
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
			return org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes
					.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes
					.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
