package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers;

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
	public static final IElementType RealtimeStatechart_1000 = getElementType("de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.RealtimeStatechart_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RealtimeStatechart_2007 = getElementType("de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.RealtimeStatechart_2007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType State_3032 = getElementType("de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.State_3032"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EntryEvent_3033 = getElementType("de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.EntryEvent_3033"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DoEvent_3034 = getElementType("de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.DoEvent_3034"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ExitEvent_3035 = getElementType("de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.ExitEvent_3035"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ClockConstraint_3036 = getElementType("de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.ClockConstraint_3036"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SynchronizationChannel_3037 = getElementType("de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.SynchronizationChannel_3037"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Region_3038 = getElementType("de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.Region_3038"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RealtimeStatechart_3039 = getElementType("de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.RealtimeStatechart_3039"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EntryPoint_3040 = getElementType("de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.EntryPoint_3040"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ExitPoint_3041 = getElementType("de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.ExitPoint_3041"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Transition_4003 = getElementType("de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.Transition_4003"); //$NON-NLS-1$

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
				return de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
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
					RealtimeStatechart_1000,
					de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getRealtimeStatechart());

			elements.put(
					RealtimeStatechart_2007,
					de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getRealtimeStatechart());

			elements.put(
					State_3032,
					de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getState());

			elements.put(
					EntryEvent_3033,
					de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getEntryEvent());

			elements.put(
					DoEvent_3034,
					de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getDoEvent());

			elements.put(
					ExitEvent_3035,
					de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getExitEvent());

			elements.put(
					ClockConstraint_3036,
					de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getClockConstraint());

			elements.put(
					SynchronizationChannel_3037,
					de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getSynchronizationChannel());

			elements.put(
					Region_3038,
					de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getRegion());

			elements.put(
					RealtimeStatechart_3039,
					de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getRealtimeStatechart());

			elements.put(
					EntryPoint_3040,
					de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getEntryPoint());

			elements.put(
					ExitPoint_3041,
					de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getExitPoint());

			elements.put(
					Transition_4003,
					de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getTransition());
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
			KNOWN_ELEMENT_TYPES.add(RealtimeStatechart_1000);
			KNOWN_ELEMENT_TYPES.add(RealtimeStatechart_2007);
			KNOWN_ELEMENT_TYPES.add(State_3032);
			KNOWN_ELEMENT_TYPES.add(EntryEvent_3033);
			KNOWN_ELEMENT_TYPES.add(DoEvent_3034);
			KNOWN_ELEMENT_TYPES.add(ExitEvent_3035);
			KNOWN_ELEMENT_TYPES.add(ClockConstraint_3036);
			KNOWN_ELEMENT_TYPES.add(SynchronizationChannel_3037);
			KNOWN_ELEMENT_TYPES.add(Region_3038);
			KNOWN_ELEMENT_TYPES.add(RealtimeStatechart_3039);
			KNOWN_ELEMENT_TYPES.add(EntryPoint_3040);
			KNOWN_ELEMENT_TYPES.add(ExitPoint_3041);
			KNOWN_ELEMENT_TYPES.add(Transition_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return RealtimeStatechart_1000;
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID:
			return RealtimeStatechart_2007;
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return State_3032;
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryEventEditPart.VISUAL_ID:
			return EntryEvent_3033;
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.DoEventEditPart.VISUAL_ID:
			return DoEvent_3034;
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ExitEventEditPart.VISUAL_ID:
			return ExitEvent_3035;
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID:
			return ClockConstraint_3036;
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID:
			return SynchronizationChannel_3037;
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID:
			return Region_3038;
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechart2EditPart.VISUAL_ID:
			return RealtimeStatechart_3039;
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryPointEditPart.VISUAL_ID:
			return EntryPoint_3040;
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ExitPointEditPart.VISUAL_ID:
			return ExitPoint_3041;
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return Transition_4003;
		}
		return null;
	}

}
