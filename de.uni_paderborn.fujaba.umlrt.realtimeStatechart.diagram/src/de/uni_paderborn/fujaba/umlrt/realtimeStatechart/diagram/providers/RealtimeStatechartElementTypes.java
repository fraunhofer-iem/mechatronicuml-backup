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
public class RealtimeStatechartElementTypes {

	/**
	 * @generated
	 */
	private RealtimeStatechartElementTypes() {
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
	public static final IElementType RealtimeStatechart_1000 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.RealtimeStatechart_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType State_2008 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.State_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InitialState_2009 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.InitialState_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FinalState_2010 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.FinalState_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HistoryState_2011 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.HistoryState_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Clock_2012 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.Clock_2012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Transition_2013 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.Transition_2013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EntryEvent_3005 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.EntryEvent_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DoEvent_3002 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.DoEvent_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ExitEvent_3006 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.ExitEvent_3006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ClockConstraint_3007 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.ClockConstraint_3007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SynchronizationChannel_3008 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.SynchronizationChannel_3008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Region_3009 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.Region_3009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AbsoluteDeadline_3010 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.AbsoluteDeadline_3010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RelativeDeadline_3011 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.RelativeDeadline_3011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ClockConstraint_3018 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.ClockConstraint_3018"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AsynchronousEvent_3019 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.AsynchronousEvent_3019"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AsynchronousEvent_3020 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.AsynchronousEvent_3020"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Action_3015 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.Action_3015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Synchronization_3016 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.Synchronization_3016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Synchronization_3017 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.Synchronization_3017"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Transition_4001 = getElementType("de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.Transition_4001"); //$NON-NLS-1$

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
				return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
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
					de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechartPackage.eINSTANCE
							.getRealtimeStatechart());

			elements.put(
					State_2008,
					de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getState());

			elements.put(
					InitialState_2009,
					de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getInitialState());

			elements.put(
					FinalState_2010,
					de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getFinalState());

			elements.put(
					HistoryState_2011,
					de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getHistoryState());

			elements.put(
					Clock_2012,
					de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getClock());

			elements.put(
					Transition_2013,
					de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getTransition());

			elements.put(
					EntryEvent_3005,
					de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getEntryEvent());

			elements.put(
					DoEvent_3002,
					de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getDoEvent());

			elements.put(
					ExitEvent_3006,
					de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getExitEvent());

			elements.put(
					ClockConstraint_3007,
					de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getClockConstraint());

			elements.put(
					SynchronizationChannel_3008,
					de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getSynchronizationChannel());

			elements.put(
					Region_3009,
					de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getRegion());

			elements.put(
					AbsoluteDeadline_3010,
					de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getAbsoluteDeadline());

			elements.put(
					RelativeDeadline_3011,
					de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getRelativeDeadline());

			elements.put(
					ClockConstraint_3018,
					de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getClockConstraint());

			elements.put(
					AsynchronousEvent_3019,
					de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getAsynchronousEvent());

			elements.put(
					AsynchronousEvent_3020,
					de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getAsynchronousEvent());

			elements.put(
					Action_3015,
					de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getAction());

			elements.put(
					Synchronization_3016,
					de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getSynchronization());

			elements.put(
					Synchronization_3017,
					de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getSynchronization());

			elements.put(
					Transition_4001,
					de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
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
			KNOWN_ELEMENT_TYPES.add(State_2008);
			KNOWN_ELEMENT_TYPES.add(InitialState_2009);
			KNOWN_ELEMENT_TYPES.add(FinalState_2010);
			KNOWN_ELEMENT_TYPES.add(HistoryState_2011);
			KNOWN_ELEMENT_TYPES.add(Clock_2012);
			KNOWN_ELEMENT_TYPES.add(Transition_2013);
			KNOWN_ELEMENT_TYPES.add(EntryEvent_3005);
			KNOWN_ELEMENT_TYPES.add(DoEvent_3002);
			KNOWN_ELEMENT_TYPES.add(ExitEvent_3006);
			KNOWN_ELEMENT_TYPES.add(ClockConstraint_3007);
			KNOWN_ELEMENT_TYPES.add(SynchronizationChannel_3008);
			KNOWN_ELEMENT_TYPES.add(Region_3009);
			KNOWN_ELEMENT_TYPES.add(AbsoluteDeadline_3010);
			KNOWN_ELEMENT_TYPES.add(RelativeDeadline_3011);
			KNOWN_ELEMENT_TYPES.add(ClockConstraint_3018);
			KNOWN_ELEMENT_TYPES.add(AsynchronousEvent_3019);
			KNOWN_ELEMENT_TYPES.add(AsynchronousEvent_3020);
			KNOWN_ELEMENT_TYPES.add(Action_3015);
			KNOWN_ELEMENT_TYPES.add(Synchronization_3016);
			KNOWN_ELEMENT_TYPES.add(Synchronization_3017);
			KNOWN_ELEMENT_TYPES.add(Transition_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID:
			return RealtimeStatechart_1000;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return State_2008;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.InitialStateEditPart.VISUAL_ID:
			return InitialState_2009;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.FinalStateEditPart.VISUAL_ID:
			return FinalState_2010;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.HistoryStateEditPart.VISUAL_ID:
			return HistoryState_2011;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ClockEditPart.VISUAL_ID:
			return Clock_2012;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.Transition2EditPart.VISUAL_ID:
			return Transition_2013;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.EntryEventEditPart.VISUAL_ID:
			return EntryEvent_3005;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.DoEventEditPart.VISUAL_ID:
			return DoEvent_3002;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ExitEventEditPart.VISUAL_ID:
			return ExitEvent_3006;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID:
			return ClockConstraint_3007;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID:
			return SynchronizationChannel_3008;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID:
			return Region_3009;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.AbsoluteDeadlineEditPart.VISUAL_ID:
			return AbsoluteDeadline_3010;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RelativeDeadlineEditPart.VISUAL_ID:
			return RelativeDeadline_3011;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ClockConstraint2EditPart.VISUAL_ID:
			return ClockConstraint_3018;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.AsynchronousEventEditPart.VISUAL_ID:
			return AsynchronousEvent_3019;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.AsynchronousEvent2EditPart.VISUAL_ID:
			return AsynchronousEvent_3020;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return Action_3015;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.SynchronizationEditPart.VISUAL_ID:
			return Synchronization_3016;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.Synchronization2EditPart.VISUAL_ID:
			return Synchronization_3017;
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return Transition_4001;
		}
		return null;
	}

}
