package org.muml.pm.hardware.resource.diagram.providers;

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
			org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ResourceRepository_1000 = getElementType(
			"org.muml.pm.hardware.resource.diagram.ResourceRepository_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Device_2006 = getElementType(
			"org.muml.pm.hardware.resource.diagram.Device_2006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StructuredResource_2007 = getElementType(
			"org.muml.pm.hardware.resource.diagram.StructuredResource_2007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CommunicationProtocolRepository_2008 = getElementType(
			"org.muml.pm.hardware.resource.diagram.CommunicationProtocolRepository_2008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CommunicationResource_3011 = getElementType(
			"org.muml.pm.hardware.resource.diagram.CommunicationResource_3011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CommunicationResource_3012 = getElementType(
			"org.muml.pm.hardware.resource.diagram.CommunicationResource_3012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Cache_3013 = getElementType(
			"org.muml.pm.hardware.resource.diagram.Cache_3013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Processor_3014 = getElementType(
			"org.muml.pm.hardware.resource.diagram.Processor_3014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ProgrammableLogicDevice_3015 = getElementType(
			"org.muml.pm.hardware.resource.diagram.ProgrammableLogicDevice_3015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MemoryResource_3016 = getElementType(
			"org.muml.pm.hardware.resource.diagram.MemoryResource_3016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType BusProtocol_3017 = getElementType(
			"org.muml.pm.hardware.resource.diagram.BusProtocol_3017"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LinkProtocol_3018 = getElementType(
			"org.muml.pm.hardware.resource.diagram.LinkProtocol_3018"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ProcessorOwnedCache_4002 = getElementType(
			"org.muml.pm.hardware.resource.diagram.ProcessorOwnedCache_4002"); //$NON-NLS-1$

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

			elements.put(ResourceRepository_1000,
					org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
							.getResourceRepository());

			elements.put(Device_2006,
					org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE.getDevice());

			elements.put(StructuredResource_2007,
					org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
							.getStructuredResource());

			elements.put(CommunicationProtocolRepository_2008,
					org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
							.getCommunicationProtocolRepository());

			elements.put(CommunicationResource_3011,
					org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
							.getCommunicationResource());

			elements.put(CommunicationResource_3012,
					org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
							.getCommunicationResource());

			elements.put(Cache_3013,
					org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE.getCache());

			elements.put(Processor_3014,
					org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE.getProcessor());

			elements.put(ProgrammableLogicDevice_3015,
					org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
							.getProgrammableLogicDevice());

			elements.put(MemoryResource_3016,
					org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE.getMemoryResource());

			elements.put(BusProtocol_3017,
					org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE.getBusProtocol());

			elements.put(LinkProtocol_3018,
					org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE.getLinkProtocol());

			elements.put(ProcessorOwnedCache_4002,
					org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
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
			KNOWN_ELEMENT_TYPES.add(Device_2006);
			KNOWN_ELEMENT_TYPES.add(StructuredResource_2007);
			KNOWN_ELEMENT_TYPES.add(CommunicationProtocolRepository_2008);
			KNOWN_ELEMENT_TYPES.add(CommunicationResource_3011);
			KNOWN_ELEMENT_TYPES.add(CommunicationResource_3012);
			KNOWN_ELEMENT_TYPES.add(Cache_3013);
			KNOWN_ELEMENT_TYPES.add(Processor_3014);
			KNOWN_ELEMENT_TYPES.add(ProgrammableLogicDevice_3015);
			KNOWN_ELEMENT_TYPES.add(MemoryResource_3016);
			KNOWN_ELEMENT_TYPES.add(BusProtocol_3017);
			KNOWN_ELEMENT_TYPES.add(LinkProtocol_3018);
			KNOWN_ELEMENT_TYPES.add(ProcessorOwnedCache_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case org.muml.pm.hardware.resource.diagram.edit.parts.ResourceRepositoryEditPart.VISUAL_ID:
			return ResourceRepository_1000;
		case org.muml.pm.hardware.resource.diagram.edit.parts.DeviceEditPart.VISUAL_ID:
			return Device_2006;
		case org.muml.pm.hardware.resource.diagram.edit.parts.StructuredResourceEditPart.VISUAL_ID:
			return StructuredResource_2007;
		case org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryEditPart.VISUAL_ID:
			return CommunicationProtocolRepository_2008;
		case org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationResourceEditPart.VISUAL_ID:
			return CommunicationResource_3011;
		case org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationResource2EditPart.VISUAL_ID:
			return CommunicationResource_3012;
		case org.muml.pm.hardware.resource.diagram.edit.parts.CacheEditPart.VISUAL_ID:
			return Cache_3013;
		case org.muml.pm.hardware.resource.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return Processor_3014;
		case org.muml.pm.hardware.resource.diagram.edit.parts.ProgrammableLogicDeviceEditPart.VISUAL_ID:
			return ProgrammableLogicDevice_3015;
		case org.muml.pm.hardware.resource.diagram.edit.parts.MemoryResourceEditPart.VISUAL_ID:
			return MemoryResource_3016;
		case org.muml.pm.hardware.resource.diagram.edit.parts.BusProtocolEditPart.VISUAL_ID:
			return BusProtocol_3017;
		case org.muml.pm.hardware.resource.diagram.edit.parts.LinkProtocolEditPart.VISUAL_ID:
			return LinkProtocol_3018;
		case org.muml.pm.hardware.resource.diagram.edit.parts.ProcessorOwnedCacheEditPart.VISUAL_ID:
			return ProcessorOwnedCache_4002;
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
			return org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes
					.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes
					.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
