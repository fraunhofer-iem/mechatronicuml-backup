package org.muml.pm.hardware.resourceinstance.diagram.providers;

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
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.CacheInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.HWPortEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceOwnedCacheInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ResourceInstanceRepositoryEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.SensorInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin;

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
			ResourceInstanceDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ResourceInstanceRepository_1000 = getElementType(
			"org.muml.pm.hardware.resourceinstance.diagram.ResourceInstanceRepository_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SensorInstance_2007 = getElementType(
			"org.muml.pm.hardware.resourceinstance.diagram.SensorInstance_2007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ActuatorInstance_2008 = getElementType(
			"org.muml.pm.hardware.resourceinstance.diagram.ActuatorInstance_2008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StructuredResourceInstance_2009 = getElementType(
			"org.muml.pm.hardware.resourceinstance.diagram.StructuredResourceInstance_2009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HWPort_3017 = getElementType(
			"org.muml.pm.hardware.resourceinstance.diagram.HWPort_3017"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CacheInstance_3018 = getElementType(
			"org.muml.pm.hardware.resourceinstance.diagram.CacheInstance_3018"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ProgrammableLogicDeviceInstance_3019 = getElementType(
			"org.muml.pm.hardware.resourceinstance.diagram.ProgrammableLogicDeviceInstance_3019"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ProcessorInstance_3020 = getElementType(
			"org.muml.pm.hardware.resourceinstance.diagram.ProcessorInstance_3020"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ProcessingMemoryInstance_3021 = getElementType(
			"org.muml.pm.hardware.resourceinstance.diagram.ProcessingMemoryInstance_3021"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StorageMemoryInstance_3022 = getElementType(
			"org.muml.pm.hardware.resourceinstance.diagram.StorageMemoryInstance_3022"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ProcessorInstanceOwnedCacheInstance_4003 = getElementType(
			"org.muml.pm.hardware.resourceinstance.diagram.ProcessorInstanceOwnedCacheInstance_4003"); //$NON-NLS-1$

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

			elements.put(ResourceInstanceRepository_1000,
					HwresourceinstancePackage.eINSTANCE.getResourceInstanceRepository());

			elements.put(SensorInstance_2007, HwresourceinstancePackage.eINSTANCE.getSensorInstance());

			elements.put(ActuatorInstance_2008, HwresourceinstancePackage.eINSTANCE.getActuatorInstance());

			elements.put(StructuredResourceInstance_2009,
					HwresourceinstancePackage.eINSTANCE.getStructuredResourceInstance());

			elements.put(HWPort_3017, HwresourceinstancePackage.eINSTANCE.getHWPort());

			elements.put(CacheInstance_3018, HwresourceinstancePackage.eINSTANCE.getCacheInstance());

			elements.put(ProgrammableLogicDeviceInstance_3019,
					HwresourceinstancePackage.eINSTANCE.getProgrammableLogicDeviceInstance());

			elements.put(ProcessorInstance_3020, HwresourceinstancePackage.eINSTANCE.getProcessorInstance());

			elements.put(ProcessingMemoryInstance_3021,
					HwresourceinstancePackage.eINSTANCE.getProcessingMemoryInstance());

			elements.put(StorageMemoryInstance_3022, HwresourceinstancePackage.eINSTANCE.getStorageMemoryInstance());

			elements.put(ProcessorInstanceOwnedCacheInstance_4003,
					HwresourceinstancePackage.eINSTANCE.getProcessorInstance_OwnedCacheInstance());
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
		case ResourceInstanceRepositoryEditPart.VISUAL_ID:
			return ResourceInstanceRepository_1000;
		case SensorInstanceEditPart.VISUAL_ID:
			return SensorInstance_2007;
		case ActuatorInstanceEditPart.VISUAL_ID:
			return ActuatorInstance_2008;
		case StructuredResourceInstanceEditPart.VISUAL_ID:
			return StructuredResourceInstance_2009;
		case HWPortEditPart.VISUAL_ID:
			return HWPort_3017;
		case CacheInstanceEditPart.VISUAL_ID:
			return CacheInstance_3018;
		case ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
			return ProgrammableLogicDeviceInstance_3019;
		case ProcessorInstanceEditPart.VISUAL_ID:
			return ProcessorInstance_3020;
		case ProcessingMemoryInstanceEditPart.VISUAL_ID:
			return ProcessingMemoryInstance_3021;
		case StorageMemoryInstanceEditPart.VISUAL_ID:
			return StorageMemoryInstance_3022;
		case ProcessorInstanceOwnedCacheInstanceEditPart.VISUAL_ID:
			return ProcessorInstanceOwnedCacheInstance_4003;
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
			return org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes
					.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes
					.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
