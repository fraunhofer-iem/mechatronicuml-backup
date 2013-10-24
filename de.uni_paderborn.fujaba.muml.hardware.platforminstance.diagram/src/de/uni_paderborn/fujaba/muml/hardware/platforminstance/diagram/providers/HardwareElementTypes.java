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
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareDiagramEditorPlugin
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
	public static final IElementType HWPlatformInstance_2001 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.HWPlatformInstance_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StructuredResourceInstance_3001 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.StructuredResourceInstance_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CacheInstance_3002 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.CacheInstance_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProgrammableLogicDeviceInstance_3003 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.ProgrammableLogicDeviceInstance_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProcessorInstance_3004 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.ProcessorInstance_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StorageMemoryInstance_3005 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.StorageMemoryInstance_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProcessingMemoryInstance_3006 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.ProcessingMemoryInstance_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BusPortInstance_3007 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.BusPortInstance_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LinkPortInstance_3008 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.LinkPortInstance_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Bus_3009 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.Bus_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Bridge_3010 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.Bridge_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HWPlatformInstance_3011 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.HWPlatformInstance_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BusPortInstance_3012 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.BusPortInstance_3012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActuatorInstance_3013 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.ActuatorInstance_3013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SensorInstance_3014 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.SensorInstance_3014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Delegation_4001 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.Delegation_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Link_4002 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.Link_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HWPortPartConnectedMedia_4003 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.HWPortPartConnectedMedia_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CommunicationMediaConnectedBridges_4004 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.CommunicationMediaConnectedBridges_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Link_4005 = getElementType("de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.Link_4005"); //$NON-NLS-1$

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
					de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage.eINSTANCE
							.getHWPlatformInstanceConfiguration());

			elements.put(
					HWPlatformInstance_2001,
					de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage.eINSTANCE
							.getHWPlatformInstance());

			elements.put(
					StructuredResourceInstance_3001,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getStructuredResourceInstance());

			elements.put(
					CacheInstance_3002,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getCacheInstance());

			elements.put(
					ProgrammableLogicDeviceInstance_3003,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getProgrammableLogicDeviceInstance());

			elements.put(
					ProcessorInstance_3004,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getProcessorInstance());

			elements.put(
					StorageMemoryInstance_3005,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getStorageMemoryInstance());

			elements.put(
					ProcessingMemoryInstance_3006,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getProcessingMemoryInstance());

			elements.put(
					BusPortInstance_3007,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getBusPortInstance());

			elements.put(
					LinkPortInstance_3008,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getLinkPortInstance());

			elements.put(
					Bus_3009,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getBus());

			elements.put(
					Bridge_3010,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getBridge());

			elements.put(
					HWPlatformInstance_3011,
					de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage.eINSTANCE
							.getHWPlatformInstance());

			elements.put(
					BusPortInstance_3012,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getBusPortInstance());

			elements.put(
					ActuatorInstance_3013,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getActuatorInstance());

			elements.put(
					SensorInstance_3014,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getSensorInstance());

			elements.put(
					Delegation_4001,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getDelegation());

			elements.put(
					Link_4002,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getLink());

			elements.put(
					HWPortPartConnectedMedia_4003,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getHWPortPart_ConnectedMedia());

			elements.put(
					CommunicationMediaConnectedBridges_4004,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getCommunicationMedia_ConnectedBridges());

			elements.put(
					Link_4005,
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
			KNOWN_ELEMENT_TYPES.add(HWPlatformInstanceConfiguration_1000);
			KNOWN_ELEMENT_TYPES.add(HWPlatformInstance_2001);
			KNOWN_ELEMENT_TYPES.add(StructuredResourceInstance_3001);
			KNOWN_ELEMENT_TYPES.add(CacheInstance_3002);
			KNOWN_ELEMENT_TYPES.add(ProgrammableLogicDeviceInstance_3003);
			KNOWN_ELEMENT_TYPES.add(ProcessorInstance_3004);
			KNOWN_ELEMENT_TYPES.add(StorageMemoryInstance_3005);
			KNOWN_ELEMENT_TYPES.add(ProcessingMemoryInstance_3006);
			KNOWN_ELEMENT_TYPES.add(BusPortInstance_3007);
			KNOWN_ELEMENT_TYPES.add(LinkPortInstance_3008);
			KNOWN_ELEMENT_TYPES.add(Bus_3009);
			KNOWN_ELEMENT_TYPES.add(Bridge_3010);
			KNOWN_ELEMENT_TYPES.add(HWPlatformInstance_3011);
			KNOWN_ELEMENT_TYPES.add(BusPortInstance_3012);
			KNOWN_ELEMENT_TYPES.add(ActuatorInstance_3013);
			KNOWN_ELEMENT_TYPES.add(SensorInstance_3014);
			KNOWN_ELEMENT_TYPES.add(Delegation_4001);
			KNOWN_ELEMENT_TYPES.add(Link_4002);
			KNOWN_ELEMENT_TYPES.add(HWPortPartConnectedMedia_4003);
			KNOWN_ELEMENT_TYPES.add(CommunicationMediaConnectedBridges_4004);
			KNOWN_ELEMENT_TYPES.add(Link_4005);
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
			return HWPlatformInstance_2001;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return StructuredResourceInstance_3001;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.CacheInstanceEditPart.VISUAL_ID:
			return CacheInstance_3002;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
			return ProgrammableLogicDeviceInstance_3003;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessorInstanceEditPart.VISUAL_ID:
			return ProcessorInstance_3004;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID:
			return StorageMemoryInstance_3005;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID:
			return ProcessingMemoryInstance_3006;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusPortInstanceEditPart.VISUAL_ID:
			return BusPortInstance_3007;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.LinkPortInstanceEditPart.VISUAL_ID:
			return LinkPortInstance_3008;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusEditPart.VISUAL_ID:
			return Bus_3009;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeEditPart.VISUAL_ID:
			return Bridge_3010;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart.VISUAL_ID:
			return HWPlatformInstance_3011;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusPortInstance2EditPart.VISUAL_ID:
			return BusPortInstance_3012;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return ActuatorInstance_3013;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
			return SensorInstance_3014;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return Delegation_4001;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return Link_4002;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPortPartConnectedMediaEditPart.VISUAL_ID:
			return HWPortPartConnectedMedia_4003;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.CommunicationMediaConnectedBridgesEditPart.VISUAL_ID:
			return CommunicationMediaConnectedBridges_4004;
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.Link2EditPart.VISUAL_ID:
			return Link_4005;
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
