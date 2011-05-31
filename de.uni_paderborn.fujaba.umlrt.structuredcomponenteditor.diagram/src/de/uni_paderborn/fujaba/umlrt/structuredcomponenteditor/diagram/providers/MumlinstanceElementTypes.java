package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers;

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
public class MumlinstanceElementTypes {

	/**
	 * @generated
	 */
	private MumlinstanceElementTypes() {
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
	public static final IElementType ModelElementCategory_1000 = getElementType("de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.ModelElementCategory_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StructuredComponent_2002 = getElementType("de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.StructuredComponent_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Port_3004 = getElementType("de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.Port_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentPart_3005 = getElementType("de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.ComponentPart_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Port_3006 = getElementType("de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.Port_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Delegation_4003 = getElementType("de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.Delegation_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assembly_4004 = getElementType("de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.Assembly_4004"); //$NON-NLS-1$

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
				return de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
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
					ModelElementCategory_1000,
					de.uni_paderborn.fujaba.modelinstance.ModelinstancePackage.eINSTANCE
							.getModelElementCategory());

			elements.put(
					StructuredComponent_2002,
					de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
							.getStructuredComponent());

			elements.put(
					Port_3004,
					de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
							.getPort());

			elements.put(
					ComponentPart_3005,
					de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
							.getComponentPart());

			elements.put(
					Port_3006,
					de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
							.getPort());

			elements.put(
					Delegation_4003,
					de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
							.getDelegation());

			elements.put(
					Assembly_4004,
					de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
							.getAssembly());
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
			KNOWN_ELEMENT_TYPES.add(ModelElementCategory_1000);
			KNOWN_ELEMENT_TYPES.add(StructuredComponent_2002);
			KNOWN_ELEMENT_TYPES.add(Port_3004);
			KNOWN_ELEMENT_TYPES.add(ComponentPart_3005);
			KNOWN_ELEMENT_TYPES.add(Port_3006);
			KNOWN_ELEMENT_TYPES.add(Delegation_4003);
			KNOWN_ELEMENT_TYPES.add(Assembly_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentDiagramEditPart.VISUAL_ID:
			return ModelElementCategory_1000;
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentEditPart.VISUAL_ID:
			return StructuredComponent_2002;
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return Port_3004;
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
			return ComponentPart_3005;
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.Port2EditPart.VISUAL_ID:
			return Port_3006;
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return Delegation_4003;
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart.VISUAL_ID:
			return Assembly_4004;
		}
		return null;
	}

}
