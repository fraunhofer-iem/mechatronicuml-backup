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
	public static final IElementType CacheInstance_3017 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.CacheInstance_3017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProgrammableLogicDeviceInstance_3018 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.ProgrammableLogicDeviceInstance_3018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProcessorInstance_3019 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.ProcessorInstance_3019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProcessingMemoryInstance_3020 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.ProcessingMemoryInstance_3020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StorageMemoryInstance_3021 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.StorageMemoryInstance_3021"); //$NON-NLS-1$
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
	public static final IElementType BridgeInstance_3037 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.BridgeInstance_3037"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DelegationHWPortInstance_3028 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.DelegationHWPortInstance_3028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DelegationInstance_4008 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.DelegationInstance_4008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LinkInstance_4009 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.LinkInstance_4009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BusConnectorInstance_4010 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.BusConnectorInstance_4010"); //$NON-NLS-1$

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
					CacheInstance_3017,
					de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
							.getCacheInstance());

			elements.put(
					ProgrammableLogicDeviceInstance_3018,
					de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
							.getProgrammableLogicDeviceInstance());

			elements.put(
					ProcessorInstance_3019,
					de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
							.getProcessorInstance());

			elements.put(
					ProcessingMemoryInstance_3020,
					de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
							.getProcessingMemoryInstance());

			elements.put(
					StorageMemoryInstance_3021,
					de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
							.getStorageMemoryInstance());

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
					BridgeInstance_3037,
					de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
							.getBridgeInstance());

			elements.put(
					DelegationInstance_4008,
					de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
							.getDelegationInstance());

			elements.put(
					LinkInstance_4009,
					de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
							.getLinkInstance());

			elements.put(
					BusConnectorInstance_4010,
					de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
							.getBusConnectorInstance());
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
			KNOWN_ELEMENT_TYPES.add(CacheInstance_3017);
			KNOWN_ELEMENT_TYPES.add(ProgrammableLogicDeviceInstance_3018);
			KNOWN_ELEMENT_TYPES.add(ProcessorInstance_3019);
			KNOWN_ELEMENT_TYPES.add(ProcessingMemoryInstance_3020);
			KNOWN_ELEMENT_TYPES.add(StorageMemoryInstance_3021);
			KNOWN_ELEMENT_TYPES.add(HWPortInstance_3030);
			KNOWN_ELEMENT_TYPES.add(ActuatorInstance_3034);
			KNOWN_ELEMENT_TYPES.add(SensorInstance_3035);
			KNOWN_ELEMENT_TYPES.add(BusInstance_3036);
			KNOWN_ELEMENT_TYPES.add(BridgeInstance_3037);
			KNOWN_ELEMENT_TYPES.add(DelegationInstance_4008);
			KNOWN_ELEMENT_TYPES.add(LinkInstance_4009);
			KNOWN_ELEMENT_TYPES.add(BusConnectorInstance_4010);
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
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.CacheInstanceEditPart.VISUAL_ID:
			return CacheInstance_3017;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
			return ProgrammableLogicDeviceInstance_3018;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessorInstanceEditPart.VISUAL_ID:
			return ProcessorInstance_3019;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID:
			return ProcessingMemoryInstance_3020;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID:
			return StorageMemoryInstance_3021;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPortInstanceEditPart.VISUAL_ID:
			return HWPortInstance_3030;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return ActuatorInstance_3034;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
			return SensorInstance_3035;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusInstanceEditPart.VISUAL_ID:
			return BusInstance_3036;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeInstanceEditPart.VISUAL_ID:
			return BridgeInstance_3037;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID:
			return DelegationInstance_4008;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.LinkInstanceEditPart.VISUAL_ID:
			return LinkInstance_4009;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusConnectorInstanceEditPart.VISUAL_ID:
			return BusConnectorInstance_4010;
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
