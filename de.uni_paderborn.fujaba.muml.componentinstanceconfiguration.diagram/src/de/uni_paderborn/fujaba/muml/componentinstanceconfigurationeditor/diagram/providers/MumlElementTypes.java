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
	public static final IElementType HybridPortInstance_2021 = getElementType("de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.HybridPortInstance_2021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DiscreteSinglePortInstance_2022 = getElementType("de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.DiscreteSinglePortInstance_2022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DiscreteMultiPortInstance_2023 = getElementType("de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.DiscreteMultiPortInstance_2023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContinuousPortInstance_2024 = getElementType("de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.ContinuousPortInstance_2024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtomicComponentInstance_2016 = getElementType("de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.AtomicComponentInstance_2016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StructuredComponentInstance_2015 = getElementType("de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.StructuredComponentInstance_2015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DiscreteSinglePortInstance_3026 = getElementType("de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.DiscreteSinglePortInstance_3026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HybridPortInstance_3031 = getElementType("de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.HybridPortInstance_3031"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DiscreteSinglePortInstance_3032 = getElementType("de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.DiscreteSinglePortInstance_3032"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DiscreteMultiPortInstance_3033 = getElementType("de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.DiscreteMultiPortInstance_3033"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContinuousPortInstance_3034 = getElementType("de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.ContinuousPortInstance_3034"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentInstanceConfiguration_3023 = getElementType("de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.ComponentInstanceConfiguration_3023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtomicComponentInstance_3024 = getElementType("de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.AtomicComponentInstance_3024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StructuredComponentInstance_3025 = getElementType("de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.StructuredComponentInstance_3025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AssemblyConnectorInstance_4001 = getElementType("de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.AssemblyConnectorInstance_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DelegationConnectorInstance_4002 = getElementType("de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.DelegationConnectorInstance_4002"); //$NON-NLS-1$

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
					HybridPortInstance_2021,
					de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
							.getHybridPortInstance());

			elements.put(
					DiscreteSinglePortInstance_2022,
					de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
							.getDiscreteSinglePortInstance());

			elements.put(
					DiscreteMultiPortInstance_2023,
					de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
							.getDiscreteMultiPortInstance());

			elements.put(
					ContinuousPortInstance_2024,
					de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
							.getContinuousPortInstance());

			elements.put(
					AtomicComponentInstance_2016,
					de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
							.getAtomicComponentInstance());

			elements.put(
					StructuredComponentInstance_2015,
					de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
							.getStructuredComponentInstance());

			elements.put(
					DiscreteSinglePortInstance_3026,
					de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
							.getDiscreteSinglePortInstance());

			elements.put(
					HybridPortInstance_3031,
					de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
							.getHybridPortInstance());

			elements.put(
					DiscreteSinglePortInstance_3032,
					de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
							.getDiscreteSinglePortInstance());

			elements.put(
					DiscreteMultiPortInstance_3033,
					de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
							.getDiscreteMultiPortInstance());

			elements.put(
					ContinuousPortInstance_3034,
					de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
							.getContinuousPortInstance());

			elements.put(
					ComponentInstanceConfiguration_3023,
					de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
							.getComponentInstanceConfiguration());

			elements.put(
					AtomicComponentInstance_3024,
					de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
							.getAtomicComponentInstance());

			elements.put(
					StructuredComponentInstance_3025,
					de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
							.getStructuredComponentInstance());

			elements.put(
					AssemblyConnectorInstance_4001,
					de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
							.getAssemblyConnectorInstance());

			elements.put(
					DelegationConnectorInstance_4002,
					de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
							.getDelegationConnectorInstance());
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
			KNOWN_ELEMENT_TYPES.add(HybridPortInstance_2021);
			KNOWN_ELEMENT_TYPES.add(DiscreteSinglePortInstance_2022);
			KNOWN_ELEMENT_TYPES.add(DiscreteMultiPortInstance_2023);
			KNOWN_ELEMENT_TYPES.add(ContinuousPortInstance_2024);
			KNOWN_ELEMENT_TYPES.add(AtomicComponentInstance_2016);
			KNOWN_ELEMENT_TYPES.add(StructuredComponentInstance_2015);
			KNOWN_ELEMENT_TYPES.add(DiscreteSinglePortInstance_3026);
			KNOWN_ELEMENT_TYPES.add(HybridPortInstance_3031);
			KNOWN_ELEMENT_TYPES.add(DiscreteSinglePortInstance_3032);
			KNOWN_ELEMENT_TYPES.add(DiscreteMultiPortInstance_3033);
			KNOWN_ELEMENT_TYPES.add(ContinuousPortInstance_3034);
			KNOWN_ELEMENT_TYPES.add(ComponentInstanceConfiguration_3023);
			KNOWN_ELEMENT_TYPES.add(AtomicComponentInstance_3024);
			KNOWN_ELEMENT_TYPES.add(StructuredComponentInstance_3025);
			KNOWN_ELEMENT_TYPES.add(AssemblyConnectorInstance_4001);
			KNOWN_ELEMENT_TYPES.add(DelegationConnectorInstance_4002);
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
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstanceEditPart.VISUAL_ID:
			return HybridPortInstance_2021;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID:
			return DiscreteSinglePortInstance_2022;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceEditPart.VISUAL_ID:
			return DiscreteMultiPortInstance_2023;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID:
			return ContinuousPortInstance_2024;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AtomicComponentInstanceEditPart.VISUAL_ID:
			return AtomicComponentInstance_2016;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstanceEditPart.VISUAL_ID:
			return StructuredComponentInstance_2015;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID:
			return DiscreteSinglePortInstance_3026;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID:
			return HybridPortInstance_3031;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID:
			return DiscreteSinglePortInstance_3032;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID:
			return DiscreteMultiPortInstance_3033;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID:
			return ContinuousPortInstance_3034;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceConfigurationEditPart.VISUAL_ID:
			return ComponentInstanceConfiguration_3023;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AtomicComponentInstance2EditPart.VISUAL_ID:
			return AtomicComponentInstance_3024;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstance2EditPart.VISUAL_ID:
			return StructuredComponentInstance_3025;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID:
			return AssemblyConnectorInstance_4001;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID:
			return DelegationConnectorInstance_4002;
		}
		return null;
	}

}
