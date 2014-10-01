package de.uni_paderborn.fujaba.muml.deployment.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class AllocationElementTypes {

	/**
	 * @generated
	 */
	private AllocationElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Deployment_1000 = getElementType("de.uni_paderborn.fujaba.muml.deployment.diagram.Deployment_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HardwareNode_2003 = getElementType("de.uni_paderborn.fujaba.muml.deployment.diagram.HardwareNode_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HardwarePort_3003 = getElementType("de.uni_paderborn.fujaba.muml.deployment.diagram.HardwarePort_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CommunicationLink_4003 = getElementType("de.uni_paderborn.fujaba.muml.deployment.diagram.CommunicationLink_4003"); //$NON-NLS-1$

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
					Deployment_1000,
					de.uni_paderborn.fujaba.muml.psm.deployment.DeploymentPackage.eINSTANCE
							.getDeployment());

			elements.put(
					HardwareNode_2003,
					de.uni_paderborn.fujaba.muml.psm.deployment.DeploymentPackage.eINSTANCE
							.getHardwareNode());

			elements.put(
					HardwarePort_3003,
					de.uni_paderborn.fujaba.muml.psm.deployment.DeploymentPackage.eINSTANCE
							.getHardwarePort());

			elements.put(
					CommunicationLink_4003,
					de.uni_paderborn.fujaba.muml.psm.deployment.DeploymentPackage.eINSTANCE
							.getCommunicationLink());
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
			KNOWN_ELEMENT_TYPES.add(Deployment_1000);
			KNOWN_ELEMENT_TYPES.add(HardwareNode_2003);
			KNOWN_ELEMENT_TYPES.add(HardwarePort_3003);
			KNOWN_ELEMENT_TYPES.add(CommunicationLink_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.DeploymentEditPart.VISUAL_ID:
			return Deployment_1000;
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeEditPart.VISUAL_ID:
			return HardwareNode_2003;
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortEditPart.VISUAL_ID:
			return HardwarePort_3003;
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.CommunicationLinkEditPart.VISUAL_ID:
			return CommunicationLink_4003;
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
			return de.uni_paderborn.fujaba.muml.deployment.diagram.providers.AllocationElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return de.uni_paderborn.fujaba.muml.deployment.diagram.providers.AllocationElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return de.uni_paderborn.fujaba.muml.deployment.diagram.providers.AllocationElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
