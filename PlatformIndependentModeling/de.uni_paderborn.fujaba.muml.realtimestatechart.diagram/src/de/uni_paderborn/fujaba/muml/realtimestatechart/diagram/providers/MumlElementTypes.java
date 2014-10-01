package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
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
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

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
	public static final IElementType Region_3042 = getElementType("de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.Region_3042"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RealtimeStatechart_3043 = getElementType("de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.RealtimeStatechart_3043"); //$NON-NLS-1$

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
					Region_3042,
					de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getRegion());

			elements.put(
					RealtimeStatechart_3043,
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
			KNOWN_ELEMENT_TYPES.add(Region_3042);
			KNOWN_ELEMENT_TYPES.add(RealtimeStatechart_3043);
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
			return Region_3042;
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechart2EditPart.VISUAL_ID:
			return RealtimeStatechart_3043;
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryPointEditPart.VISUAL_ID:
			return EntryPoint_3040;
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ExitPointEditPart.VISUAL_ID:
			return ExitPoint_3041;
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return Transition_4003;
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
			return de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
