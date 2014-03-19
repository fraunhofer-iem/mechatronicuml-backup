package de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers;

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
			de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ResourceTypeRepository_1000 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.ResourceTypeRepository_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Device_2005 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.Device_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StructuredResource_2007 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.StructuredResource_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HWPort_3001 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.HWPort_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Cache_3002 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.Cache_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Processor_3003 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.Processor_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProgrammableLogicDevice_3004 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.ProgrammableLogicDevice_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MemoryResource_3005 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.MemoryResource_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProcessorOwnedCache_4001 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.ProcessorOwnedCache_4001"); //$NON-NLS-1$

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
					ResourceTypeRepository_1000,
					de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
							.getResourceTypeRepository());

			elements.put(
					Device_2005,
					de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
							.getDevice());

			elements.put(
					StructuredResource_2007,
					de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
							.getStructuredResource());

			elements.put(
					HWPort_3001,
					de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
							.getHWPort());

			elements.put(
					Cache_3002,
					de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
							.getCache());

			elements.put(
					Processor_3003,
					de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
							.getProcessor());

			elements.put(
					ProgrammableLogicDevice_3004,
					de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
							.getProgrammableLogicDevice());

			elements.put(
					MemoryResource_3005,
					de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
							.getMemoryResource());

			elements.put(
					ProcessorOwnedCache_4001,
					de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
							.getProcessor_OwnedCache());
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
			KNOWN_ELEMENT_TYPES.add(ResourceTypeRepository_1000);
			KNOWN_ELEMENT_TYPES.add(Device_2005);
			KNOWN_ELEMENT_TYPES.add(StructuredResource_2007);
			KNOWN_ELEMENT_TYPES.add(HWPort_3001);
			KNOWN_ELEMENT_TYPES.add(Cache_3002);
			KNOWN_ELEMENT_TYPES.add(Processor_3003);
			KNOWN_ELEMENT_TYPES.add(ProgrammableLogicDevice_3004);
			KNOWN_ELEMENT_TYPES.add(MemoryResource_3005);
			KNOWN_ELEMENT_TYPES.add(ProcessorOwnedCache_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ResourceTypeRepositoryEditPart.VISUAL_ID:
			return ResourceTypeRepository_1000;
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.DeviceEditPart.VISUAL_ID:
			return Device_2005;
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.StructuredResourceEditPart.VISUAL_ID:
			return StructuredResource_2007;
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.HWPortEditPart.VISUAL_ID:
			return HWPort_3001;
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.CacheEditPart.VISUAL_ID:
			return Cache_3002;
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return Processor_3003;
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProgrammableLogicDeviceEditPart.VISUAL_ID:
			return ProgrammableLogicDevice_3004;
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.MemoryResourceEditPart.VISUAL_ID:
			return MemoryResource_3005;
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProcessorOwnedCacheEditPart.VISUAL_ID:
			return ProcessorOwnedCache_4001;
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
			return de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
