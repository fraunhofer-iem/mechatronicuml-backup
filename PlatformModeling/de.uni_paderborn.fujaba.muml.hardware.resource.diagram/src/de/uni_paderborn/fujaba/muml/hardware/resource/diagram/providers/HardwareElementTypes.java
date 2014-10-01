package de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers;

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
			de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ResourceRepository_1000 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resource.diagram.ResourceRepository_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Device_2001 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resource.diagram.Device_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StructuredResource_2002 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resource.diagram.StructuredResource_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Bus_2003 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resource.diagram.Bus_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Link_2004 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resource.diagram.Link_2004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CommunicationProtocolRepository_2005 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resource.diagram.CommunicationProtocolRepository_2005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CommunicationResource_3001 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resource.diagram.CommunicationResource_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CommunicationResource_3008 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resource.diagram.CommunicationResource_3008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Cache_3002 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resource.diagram.Cache_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Processor_3003 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resource.diagram.Processor_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProgrammableLogicDevice_3004 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resource.diagram.ProgrammableLogicDevice_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MemoryResource_3005 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resource.diagram.MemoryResource_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BusProtocol_3006 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resource.diagram.BusProtocol_3006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LinkProtocol_3007 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resource.diagram.LinkProtocol_3007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ProcessorOwnedCache_4001 = getElementType("de.uni_paderborn.fujaba.muml.hardware.resource.diagram.ProcessorOwnedCache_4001"); //$NON-NLS-1$

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
					ResourceRepository_1000,
					de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
							.getResourceRepository());

			elements.put(
					Device_2001,
					de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
							.getDevice());

			elements.put(
					StructuredResource_2002,
					de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
							.getStructuredResource());

			elements.put(
					Bus_2003,
					de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
							.getBus());

			elements.put(
					Link_2004,
					de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
							.getLink());

			elements.put(
					CommunicationProtocolRepository_2005,
					de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
							.getCommunicationProtocolRepository());

			elements.put(
					CommunicationResource_3001,
					de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
							.getCommunicationResource());

			elements.put(
					CommunicationResource_3008,
					de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
							.getCommunicationResource());

			elements.put(
					Cache_3002,
					de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
							.getCache());

			elements.put(
					Processor_3003,
					de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
							.getProcessor());

			elements.put(
					ProgrammableLogicDevice_3004,
					de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
							.getProgrammableLogicDevice());

			elements.put(
					MemoryResource_3005,
					de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
							.getMemoryResource());

			elements.put(
					BusProtocol_3006,
					de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
							.getBusProtocol());

			elements.put(
					LinkProtocol_3007,
					de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
							.getLinkProtocol());

			elements.put(
					ProcessorOwnedCache_4001,
					de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
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
			KNOWN_ELEMENT_TYPES.add(ResourceRepository_1000);
			KNOWN_ELEMENT_TYPES.add(Device_2001);
			KNOWN_ELEMENT_TYPES.add(StructuredResource_2002);
			KNOWN_ELEMENT_TYPES.add(Bus_2003);
			KNOWN_ELEMENT_TYPES.add(Link_2004);
			KNOWN_ELEMENT_TYPES.add(CommunicationProtocolRepository_2005);
			KNOWN_ELEMENT_TYPES.add(CommunicationResource_3001);
			KNOWN_ELEMENT_TYPES.add(CommunicationResource_3008);
			KNOWN_ELEMENT_TYPES.add(Cache_3002);
			KNOWN_ELEMENT_TYPES.add(Processor_3003);
			KNOWN_ELEMENT_TYPES.add(ProgrammableLogicDevice_3004);
			KNOWN_ELEMENT_TYPES.add(MemoryResource_3005);
			KNOWN_ELEMENT_TYPES.add(BusProtocol_3006);
			KNOWN_ELEMENT_TYPES.add(LinkProtocol_3007);
			KNOWN_ELEMENT_TYPES.add(ProcessorOwnedCache_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ResourceRepositoryEditPart.VISUAL_ID:
			return ResourceRepository_1000;
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.DeviceEditPart.VISUAL_ID:
			return Device_2001;
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.StructuredResourceEditPart.VISUAL_ID:
			return StructuredResource_2002;
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.BusEditPart.VISUAL_ID:
			return Bus_2003;
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return Link_2004;
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryEditPart.VISUAL_ID:
			return CommunicationProtocolRepository_2005;
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationResourceEditPart.VISUAL_ID:
			return CommunicationResource_3001;
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationResource2EditPart.VISUAL_ID:
			return CommunicationResource_3008;
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CacheEditPart.VISUAL_ID:
			return Cache_3002;
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return Processor_3003;
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProgrammableLogicDeviceEditPart.VISUAL_ID:
			return ProgrammableLogicDevice_3004;
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.MemoryResourceEditPart.VISUAL_ID:
			return MemoryResource_3005;
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.BusProtocolEditPart.VISUAL_ID:
			return BusProtocol_3006;
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.LinkProtocolEditPart.VISUAL_ID:
			return LinkProtocol_3007;
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProcessorOwnedCacheEditPart.VISUAL_ID:
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
			return de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
