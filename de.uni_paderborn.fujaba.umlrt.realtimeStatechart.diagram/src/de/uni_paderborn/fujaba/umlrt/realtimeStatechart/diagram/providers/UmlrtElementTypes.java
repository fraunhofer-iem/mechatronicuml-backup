package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers;

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
public class UmlrtElementTypes {

	/**
	 * @generated
	 */
	private UmlrtElementTypes() {
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
	public static final IElementType FujabaRealtimeStatechart_1000 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.FujabaRealtimeStatechart_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType State_2020 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.State_2020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType State_2021 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.State_2021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType State_2022 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.State_2022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HistoryState_2023 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.HistoryState_2023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Clock_2024 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.Clock_2024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EntryAction_3025 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.EntryAction_3025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DoAction_3026 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.DoAction_3026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExitAction_3027 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.ExitAction_3027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ClockConstraint_3028 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.ClockConstraint_3028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SynchronizationChannel_3029 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.SynchronizationChannel_3029"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Region_3030 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.Region_3030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Transition_4002 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.Transition_4002"); //$NON-NLS-1$

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
				return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
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
					FujabaRealtimeStatechart_1000,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getFujabaRealtimeStatechart());

			elements.put(
					State_2020,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getState());

			elements.put(
					State_2021,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getState());

			elements.put(
					State_2022,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getState());

			elements.put(
					HistoryState_2023,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getHistoryState());

			elements.put(
					Clock_2024,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getClock());

			elements.put(
					EntryAction_3025,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getEntryAction());

			elements.put(
					DoAction_3026,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getDoAction());

			elements.put(
					ExitAction_3027,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getExitAction());

			elements.put(
					ClockConstraint_3028,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getClockConstraint());

			elements.put(
					SynchronizationChannel_3029,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getSynchronizationChannel());

			elements.put(
					Region_3030,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getRegion());

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
			KNOWN_ELEMENT_TYPES.add(FujabaRealtimeStatechart_1000);
			KNOWN_ELEMENT_TYPES.add(State_2020);
			KNOWN_ELEMENT_TYPES.add(State_2021);
			KNOWN_ELEMENT_TYPES.add(State_2022);
			KNOWN_ELEMENT_TYPES.add(HistoryState_2023);
			KNOWN_ELEMENT_TYPES.add(Clock_2024);
			KNOWN_ELEMENT_TYPES.add(EntryAction_3025);
			KNOWN_ELEMENT_TYPES.add(DoAction_3026);
			KNOWN_ELEMENT_TYPES.add(ExitAction_3027);
			KNOWN_ELEMENT_TYPES.add(ClockConstraint_3028);
			KNOWN_ELEMENT_TYPES.add(SynchronizationChannel_3029);
			KNOWN_ELEMENT_TYPES.add(Region_3030);
			KNOWN_ELEMENT_TYPES.add(Transition_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID:
			return FujabaRealtimeStatechart_1000;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return State_2020;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.State2EditPart.VISUAL_ID:
			return State_2021;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.State3EditPart.VISUAL_ID:
			return State_2022;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.HistoryStateEditPart.VISUAL_ID:
			return HistoryState_2023;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ClockEditPart.VISUAL_ID:
			return Clock_2024;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.EntryActionEditPart.VISUAL_ID:
			return EntryAction_3025;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.DoActionEditPart.VISUAL_ID:
			return DoAction_3026;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ExitActionEditPart.VISUAL_ID:
			return ExitAction_3027;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID:
			return ClockConstraint_3028;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID:
			return SynchronizationChannel_3029;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID:
			return Region_3030;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return Transition_4002;
		}
		return null;
	}

}
