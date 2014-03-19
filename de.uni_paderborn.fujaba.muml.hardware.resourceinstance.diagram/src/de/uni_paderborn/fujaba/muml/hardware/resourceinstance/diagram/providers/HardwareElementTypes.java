package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers;

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
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ResourceInstanceRepository_1000 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.ResourceInstanceRepository_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SensorInstance_2001 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.SensorInstance_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActuatorInstance_2002 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.ActuatorInstance_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StructuredResourceInstance_2003 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.StructuredResourceInstance_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BusPortInstance_3001 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.BusPortInstance_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LinkPortInstance_3002 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.LinkPortInstance_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CacheInstance_3003 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.CacheInstance_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProgrammableLogicDeviceInstance_3004 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.ProgrammableLogicDeviceInstance_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProcessorInstance_3005 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.ProcessorInstance_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StorageMemoryInstance_3006 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.StorageMemoryInstance_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProcessingMemoryInstance_3007 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.ProcessingMemoryInstance_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProcessorInstanceOwnedCacheInstance_4001 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.ProcessorInstanceOwnedCacheInstance_4001"); //$NON-NLS-1$

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
					ResourceInstanceRepository_1000,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getResourceInstanceRepository());

			elements.put(
					SensorInstance_2001,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getSensorInstance());

			elements.put(
					ActuatorInstance_2002,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getActuatorInstance());

			elements.put(
					StructuredResourceInstance_2003,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getStructuredResourceInstance());

			elements.put(
					BusPortInstance_3001,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getBusPortInstance());

			elements.put(
					LinkPortInstance_3002,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getLinkPortInstance());

			elements.put(
					CacheInstance_3003,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getCacheInstance());

			elements.put(
					ProgrammableLogicDeviceInstance_3004,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getProgrammableLogicDeviceInstance());

			elements.put(
					ProcessorInstance_3005,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getProcessorInstance());

			elements.put(
					StorageMemoryInstance_3006,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getStorageMemoryInstance());

			elements.put(
					ProcessingMemoryInstance_3007,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getProcessingMemoryInstance());

			elements.put(
					ProcessorInstanceOwnedCacheInstance_4001,
					de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
							.getProcessorInstance_OwnedCacheInstance());
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
			KNOWN_ELEMENT_TYPES.add(ResourceInstanceRepository_1000);
			KNOWN_ELEMENT_TYPES.add(SensorInstance_2001);
			KNOWN_ELEMENT_TYPES.add(ActuatorInstance_2002);
			KNOWN_ELEMENT_TYPES.add(StructuredResourceInstance_2003);
			KNOWN_ELEMENT_TYPES.add(BusPortInstance_3001);
			KNOWN_ELEMENT_TYPES.add(LinkPortInstance_3002);
			KNOWN_ELEMENT_TYPES.add(CacheInstance_3003);
			KNOWN_ELEMENT_TYPES.add(ProgrammableLogicDeviceInstance_3004);
			KNOWN_ELEMENT_TYPES.add(ProcessorInstance_3005);
			KNOWN_ELEMENT_TYPES.add(StorageMemoryInstance_3006);
			KNOWN_ELEMENT_TYPES.add(ProcessingMemoryInstance_3007);
			KNOWN_ELEMENT_TYPES.add(ProcessorInstanceOwnedCacheInstance_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ResourceInstanceRepositoryEditPart.VISUAL_ID:
			return ResourceInstanceRepository_1000;
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
			return SensorInstance_2001;
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return ActuatorInstance_2002;
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return StructuredResourceInstance_2003;
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.BusPortInstanceEditPart.VISUAL_ID:
			return BusPortInstance_3001;
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.LinkPortInstanceEditPart.VISUAL_ID:
			return LinkPortInstance_3002;
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.CacheInstanceEditPart.VISUAL_ID:
			return CacheInstance_3003;
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
			return ProgrammableLogicDeviceInstance_3004;
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceEditPart.VISUAL_ID:
			return ProcessorInstance_3005;
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID:
			return StorageMemoryInstance_3006;
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID:
			return ProcessingMemoryInstance_3007;
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceOwnedCacheInstanceEditPart.VISUAL_ID:
			return ProcessorInstanceOwnedCacheInstance_4001;
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
			return de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
