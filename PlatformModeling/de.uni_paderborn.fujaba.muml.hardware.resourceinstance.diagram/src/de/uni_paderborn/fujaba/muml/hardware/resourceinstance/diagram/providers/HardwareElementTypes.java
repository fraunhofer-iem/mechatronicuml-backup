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
	public static final IElementType SensorInstance_2007 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.SensorInstance_2007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ActuatorInstance_2008 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.ActuatorInstance_2008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StructuredResourceInstance_2009 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.StructuredResourceInstance_2009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HWPort_3017 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.HWPort_3017"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CacheInstance_3018 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.CacheInstance_3018"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ProgrammableLogicDeviceInstance_3019 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.ProgrammableLogicDeviceInstance_3019"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ProcessorInstance_3020 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.ProcessorInstance_3020"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ProcessingMemoryInstance_3021 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.ProcessingMemoryInstance_3021"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StorageMemoryInstance_3022 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.StorageMemoryInstance_3022"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ProcessorInstanceOwnedCacheInstance_4003 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.ProcessorInstanceOwnedCacheInstance_4003"); //$NON-NLS-1$

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
					de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
							.getResourceInstanceRepository());

			elements.put(
					SensorInstance_2007,
					de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
							.getSensorInstance());

			elements.put(
					ActuatorInstance_2008,
					de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
							.getActuatorInstance());

			elements.put(
					StructuredResourceInstance_2009,
					de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
							.getStructuredResourceInstance());

			elements.put(
					HWPort_3017,
					de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
							.getHWPort());

			elements.put(
					CacheInstance_3018,
					de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
							.getCacheInstance());

			elements.put(
					ProgrammableLogicDeviceInstance_3019,
					de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
							.getProgrammableLogicDeviceInstance());

			elements.put(
					ProcessorInstance_3020,
					de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
							.getProcessorInstance());

			elements.put(
					ProcessingMemoryInstance_3021,
					de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
							.getProcessingMemoryInstance());

			elements.put(
					StorageMemoryInstance_3022,
					de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
							.getStorageMemoryInstance());

			elements.put(
					ProcessorInstanceOwnedCacheInstance_4003,
					de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
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
			KNOWN_ELEMENT_TYPES.add(SensorInstance_2007);
			KNOWN_ELEMENT_TYPES.add(ActuatorInstance_2008);
			KNOWN_ELEMENT_TYPES.add(StructuredResourceInstance_2009);
			KNOWN_ELEMENT_TYPES.add(HWPort_3017);
			KNOWN_ELEMENT_TYPES.add(CacheInstance_3018);
			KNOWN_ELEMENT_TYPES.add(ProgrammableLogicDeviceInstance_3019);
			KNOWN_ELEMENT_TYPES.add(ProcessorInstance_3020);
			KNOWN_ELEMENT_TYPES.add(ProcessingMemoryInstance_3021);
			KNOWN_ELEMENT_TYPES.add(StorageMemoryInstance_3022);
			KNOWN_ELEMENT_TYPES.add(ProcessorInstanceOwnedCacheInstance_4003);
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
			return SensorInstance_2007;
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return ActuatorInstance_2008;
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return StructuredResourceInstance_2009;
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.HWPortEditPart.VISUAL_ID:
			return HWPort_3017;
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.CacheInstanceEditPart.VISUAL_ID:
			return CacheInstance_3018;
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
			return ProgrammableLogicDeviceInstance_3019;
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceEditPart.VISUAL_ID:
			return ProcessorInstance_3020;
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID:
			return ProcessingMemoryInstance_3021;
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID:
			return StorageMemoryInstance_3022;
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceOwnedCacheInstanceEditPart.VISUAL_ID:
			return ProcessorInstanceOwnedCacheInstance_4003;
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
