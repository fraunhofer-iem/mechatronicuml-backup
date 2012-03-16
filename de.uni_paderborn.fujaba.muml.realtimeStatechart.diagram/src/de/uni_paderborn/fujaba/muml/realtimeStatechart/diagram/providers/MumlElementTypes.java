package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers;

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
	public static final IElementType RealtimeStatechart_1000 = getElementType("de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.RealtimeStatechart_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RealtimeStatechart_2006 = getElementType("de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.RealtimeStatechart_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType State_3017 = getElementType("de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.State_3017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EntryEvent_3018 = getElementType("de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.EntryEvent_3018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DoEvent_3019 = getElementType("de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.DoEvent_3019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExitEvent_3020 = getElementType("de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.ExitEvent_3020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ClockConstraint_3021 = getElementType("de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.ClockConstraint_3021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SynchronizationChannel_3022 = getElementType("de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.SynchronizationChannel_3022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Region_3023 = getElementType("de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.Region_3023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RealtimeStatechart_3024 = getElementType("de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.RealtimeStatechart_3024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EntryPoint_3025 = getElementType("de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.EntryPoint_3025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExitPoint_3026 = getElementType("de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.ExitPoint_3026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StateEntryPoint_3027 = getElementType("de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.StateEntryPoint_3027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StateExitPoint_3028 = getElementType("de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.StateExitPoint_3028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Transition_4002 = getElementType("de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.Transition_4002"); //$NON-NLS-1$

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
				return de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
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
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getRealtimeStatechart());

			elements.put(
					RealtimeStatechart_2006,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getRealtimeStatechart());

			elements.put(
					State_3017,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getState());

			elements.put(
					EntryEvent_3018,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getEntryEvent());

			elements.put(
					DoEvent_3019,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getDoEvent());

			elements.put(
					ExitEvent_3020,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getExitEvent());

			elements.put(
					ClockConstraint_3021,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getClockConstraint());

			elements.put(
					SynchronizationChannel_3022,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getSynchronizationChannel());

			elements.put(
					Region_3023,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getRegion());

			elements.put(
					RealtimeStatechart_3024,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getRealtimeStatechart());

			elements.put(
					EntryPoint_3025,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getEntryPoint());

			elements.put(
					ExitPoint_3026,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getExitPoint());

			elements.put(
					StateEntryPoint_3027,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getStateEntryPoint());

			elements.put(
					StateExitPoint_3028,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getStateExitPoint());

			elements.put(
					Transition_4002,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
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
			KNOWN_ELEMENT_TYPES.add(RealtimeStatechart_2006);
			KNOWN_ELEMENT_TYPES.add(State_3017);
			KNOWN_ELEMENT_TYPES.add(EntryEvent_3018);
			KNOWN_ELEMENT_TYPES.add(DoEvent_3019);
			KNOWN_ELEMENT_TYPES.add(ExitEvent_3020);
			KNOWN_ELEMENT_TYPES.add(ClockConstraint_3021);
			KNOWN_ELEMENT_TYPES.add(SynchronizationChannel_3022);
			KNOWN_ELEMENT_TYPES.add(Region_3023);
			KNOWN_ELEMENT_TYPES.add(RealtimeStatechart_3024);
			KNOWN_ELEMENT_TYPES.add(EntryPoint_3025);
			KNOWN_ELEMENT_TYPES.add(ExitPoint_3026);
			KNOWN_ELEMENT_TYPES.add(StateEntryPoint_3027);
			KNOWN_ELEMENT_TYPES.add(StateExitPoint_3028);
			KNOWN_ELEMENT_TYPES.add(Transition_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return RealtimeStatechart_1000;
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID:
			return RealtimeStatechart_2006;
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return State_3017;
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryEventEditPart.VISUAL_ID:
			return EntryEvent_3018;
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.DoEventEditPart.VISUAL_ID:
			return DoEvent_3019;
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitEventEditPart.VISUAL_ID:
			return ExitEvent_3020;
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID:
			return ClockConstraint_3021;
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID:
			return SynchronizationChannel_3022;
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID:
			return Region_3023;
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RealtimeStatechart2EditPart.VISUAL_ID:
			return RealtimeStatechart_3024;
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryPointEditPart.VISUAL_ID:
			return EntryPoint_3025;
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitPointEditPart.VISUAL_ID:
			return ExitPoint_3026;
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEntryPointEditPart.VISUAL_ID:
			return StateEntryPoint_3027;
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateExitPointEditPart.VISUAL_ID:
			return StateExitPoint_3028;
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return Transition_4002;
		}
		return null;
	}

}
