package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers;

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

import de.fujaba.modelinstance.ModelinstancePackage;

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
	public static final IElementType ModelElementCategory_1000 = getElementType("de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.ModelElementCategory_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StructuredComponent_2001 = getElementType("de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.StructuredComponent_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HybridPort_3001 = getElementType("de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.HybridPort_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DiscretePort_3002 = getElementType("de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.DiscretePort_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContinuousPort_3003 = getElementType("de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.ContinuousPort_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentPart_3005 = getElementType("de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.ComponentPart_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HybridPort_3006 = getElementType("de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.HybridPort_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DiscretePort_3007 = getElementType("de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.DiscretePort_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContinuousPort_3008 = getElementType("de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.ContinuousPort_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Delegation_4001 = getElementType("de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.Delegation_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assembly_4002 = getElementType("de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.Assembly_4002"); //$NON-NLS-1$

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
				return de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
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

			elements.put(ModelElementCategory_1000,
					ModelinstancePackage.eINSTANCE.getModelElementCategory());

			elements.put(
					StructuredComponent_2001,
					de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
							.getStructuredComponent());

			elements.put(
					HybridPort_3001,
					de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
							.getHybridPort());

			elements.put(
					DiscretePort_3002,
					de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
							.getDiscretePort());

			elements.put(
					ContinuousPort_3003,
					de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
							.getContinuousPort());

			elements.put(
					ComponentPart_3005,
					de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
							.getComponentPart());

			elements.put(
					HybridPort_3006,
					de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
							.getHybridPort());

			elements.put(
					DiscretePort_3007,
					de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
							.getDiscretePort());

			elements.put(
					ContinuousPort_3008,
					de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
							.getContinuousPort());

			elements.put(
					Delegation_4001,
					de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
							.getDelegation());

			elements.put(
					Assembly_4002,
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
			KNOWN_ELEMENT_TYPES.add(StructuredComponent_2001);
			KNOWN_ELEMENT_TYPES.add(HybridPort_3001);
			KNOWN_ELEMENT_TYPES.add(DiscretePort_3002);
			KNOWN_ELEMENT_TYPES.add(ContinuousPort_3003);
			KNOWN_ELEMENT_TYPES.add(ComponentPart_3005);
			KNOWN_ELEMENT_TYPES.add(HybridPort_3006);
			KNOWN_ELEMENT_TYPES.add(DiscretePort_3007);
			KNOWN_ELEMENT_TYPES.add(ContinuousPort_3008);
			KNOWN_ELEMENT_TYPES.add(Delegation_4001);
			KNOWN_ELEMENT_TYPES.add(Assembly_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StructuredComponentDiagramEditPart.VISUAL_ID:
			return ModelElementCategory_1000;
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StructuredComponentEditPart.VISUAL_ID:
			return StructuredComponent_2001;
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
			return HybridPort_3001;
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
			return DiscretePort_3002;
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
			return ContinuousPort_3003;
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
			return ComponentPart_3005;
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HybridPort2EditPart.VISUAL_ID:
			return HybridPort_3006;
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePort2EditPart.VISUAL_ID:
			return DiscretePort_3007;
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPort2EditPart.VISUAL_ID:
			return ContinuousPort_3008;
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return Delegation_4001;
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart.VISUAL_ID:
			return Assembly_4002;
		}
		return null;
	}

}
