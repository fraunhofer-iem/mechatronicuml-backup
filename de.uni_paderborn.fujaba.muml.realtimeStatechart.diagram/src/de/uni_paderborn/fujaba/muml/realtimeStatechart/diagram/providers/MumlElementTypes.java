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
	public static final IElementType FujabaRealtimeStatechart_1000 = getElementType("de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.FujabaRealtimeStatechart_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType State_2001 = getElementType("de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.State_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Clock_2002 = getElementType("de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.Clock_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EntryOrExitEvent_3001 = getElementType("de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.EntryOrExitEvent_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DoEvent_3002 = getElementType("de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.DoEvent_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EntryOrExitEvent_3003 = getElementType("de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.EntryOrExitEvent_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ClockConstraint_3004 = getElementType("de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.ClockConstraint_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SynchronizationChannel_3005 = getElementType("de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.SynchronizationChannel_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Region_3006 = getElementType("de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.Region_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Transition_4001 = getElementType("de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.Transition_4001"); //$NON-NLS-1$

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
					FujabaRealtimeStatechart_1000,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getFujabaRealtimeStatechart());

			elements.put(
					State_2001,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getState());

			elements.put(
					Clock_2002,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getClock());

			elements.put(
					EntryOrExitEvent_3001,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getEntryOrExitEvent());

			elements.put(
					DoEvent_3002,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getDoEvent());

			elements.put(
					EntryOrExitEvent_3003,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getEntryOrExitEvent());

			elements.put(
					ClockConstraint_3004,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getClockConstraint());

			elements.put(
					SynchronizationChannel_3005,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getSynchronizationChannel());

			elements.put(
					Region_3006,
					de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getRegion());

			elements.put(
					Transition_4001,
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
			KNOWN_ELEMENT_TYPES.add(State_2001);
			KNOWN_ELEMENT_TYPES.add(Clock_2002);
			KNOWN_ELEMENT_TYPES.add(EntryOrExitEvent_3001);
			KNOWN_ELEMENT_TYPES.add(DoEvent_3002);
			KNOWN_ELEMENT_TYPES.add(EntryOrExitEvent_3003);
			KNOWN_ELEMENT_TYPES.add(ClockConstraint_3004);
			KNOWN_ELEMENT_TYPES.add(SynchronizationChannel_3005);
			KNOWN_ELEMENT_TYPES.add(Region_3006);
			KNOWN_ELEMENT_TYPES.add(Transition_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.FujabaRealtimeStatechartEditPart.VISUAL_ID:
			return FujabaRealtimeStatechart_1000;
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return State_2001;
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ClockEditPart.VISUAL_ID:
			return Clock_2002;
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EEActionEditPart.VISUAL_ID:
			return EntryOrExitEvent_3001;
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.SynchroChannel2EditPart.VISUAL_ID:
			return DoEvent_3002;
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.DoActionEditPart.VISUAL_ID:
			return EntryOrExitEvent_3003;
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.SynchroChannelEditPart.VISUAL_ID:
			return ClockConstraint_3004;
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EEAction2EditPart.VISUAL_ID:
			return SynchronizationChannel_3005;
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TimeInvariantEditPart.VISUAL_ID:
			return Region_3006;
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return Transition_4001;
		}
		return null;
	}

}
