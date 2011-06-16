package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers;

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
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class MumlElementTypes {

	/**
	 * @generated
	 */
	private MumlElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ComponentInstanceConfiguration_1000 = getElementType("de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.ComponentInstanceConfiguration_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentInstance_2004 = getElementType("de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.ComponentInstance_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PortInstance_3005 = getElementType("de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.PortInstance_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentInstance_3006 = getElementType("de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.ComponentInstance_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PortInstance_3007 = getElementType("de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.PortInstance_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AssemblyInstance_4003 = getElementType("de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.AssemblyInstance_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DelegationInstance_4004 = getElementType("de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.DelegationInstance_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
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
					ComponentInstanceConfiguration_1000,
					de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
							.getComponentInstanceConfiguration());

			elements.put(
					ComponentInstance_2004,
					de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
							.getComponentInstance());

			elements.put(
					PortInstance_3005,
					de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
							.getPortInstance());

			elements.put(
					ComponentInstance_3006,
					de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
							.getComponentInstance());

			elements.put(
					PortInstance_3007,
					de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
							.getPortInstance());

			elements.put(
					AssemblyInstance_4003,
					de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
							.getAssemblyInstance());

			elements.put(
					DelegationInstance_4004,
					de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
							.getDelegationInstance());
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
			KNOWN_ELEMENT_TYPES.add(ComponentInstanceConfiguration_1000);
			KNOWN_ELEMENT_TYPES.add(ComponentInstance_2004);
			KNOWN_ELEMENT_TYPES.add(PortInstance_3005);
			KNOWN_ELEMENT_TYPES.add(ComponentInstance_3006);
			KNOWN_ELEMENT_TYPES.add(PortInstance_3007);
			KNOWN_ELEMENT_TYPES.add(AssemblyInstance_4003);
			KNOWN_ELEMENT_TYPES.add(DelegationInstance_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID:
			return ComponentInstanceConfiguration_1000;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceEditPart.VISUAL_ID:
			return ComponentInstance_2004;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstanceEditPart.VISUAL_ID:
			return PortInstance_3005;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstance2EditPart.VISUAL_ID:
			return ComponentInstance_3006;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstance2EditPart.VISUAL_ID:
			return PortInstance_3007;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID:
			return AssemblyInstance_4003;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID:
			return DelegationInstance_4004;
		}
		return null;
	}

}
