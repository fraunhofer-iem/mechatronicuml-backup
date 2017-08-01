/*
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.pim.realtimestatechart.diagram.providers;

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
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.diagram.edit.parts.ClockConstraintEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.DoEventEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.EntryEventEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.EntryPointEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.ExitEventEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.ExitPointEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.ModelElementCategoryEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RealtimeStatechart2EditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RealtimeStatechartEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RegionEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.StateEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.SynchronizationChannelEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.TransitionEditPart;
import org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin;

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
			RealtimestatechartDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType RealtimeStatechart_1000 = getElementType(
			"org.muml.pim.realtimestatechart.diagram.RealtimeStatechart_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RealtimeStatechart_2007 = getElementType(
			"org.muml.pim.realtimestatechart.diagram.RealtimeStatechart_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType State_3032 = getElementType("org.muml.pim.realtimestatechart.diagram.State_3032"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EntryEvent_3033 = getElementType(
			"org.muml.pim.realtimestatechart.diagram.EntryEvent_3033"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DoEvent_3034 = getElementType(
			"org.muml.pim.realtimestatechart.diagram.DoEvent_3034"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExitEvent_3035 = getElementType(
			"org.muml.pim.realtimestatechart.diagram.ExitEvent_3035"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ClockConstraint_3036 = getElementType(
			"org.muml.pim.realtimestatechart.diagram.ClockConstraint_3036"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SynchronizationChannel_3037 = getElementType(
			"org.muml.pim.realtimestatechart.diagram.SynchronizationChannel_3037"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Region_3042 = getElementType(
			"org.muml.pim.realtimestatechart.diagram.Region_3042"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RealtimeStatechart_3043 = getElementType(
			"org.muml.pim.realtimestatechart.diagram.RealtimeStatechart_3043"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EntryPoint_3040 = getElementType(
			"org.muml.pim.realtimestatechart.diagram.EntryPoint_3040"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExitPoint_3041 = getElementType(
			"org.muml.pim.realtimestatechart.diagram.ExitPoint_3041"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Transition_4003 = getElementType(
			"org.muml.pim.realtimestatechart.diagram.Transition_4003"); //$NON-NLS-1$

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

			elements.put(RealtimeStatechart_1000, RealtimestatechartPackage.eINSTANCE.getRealtimeStatechart());

			elements.put(RealtimeStatechart_2007, RealtimestatechartPackage.eINSTANCE.getRealtimeStatechart());

			elements.put(State_3032, RealtimestatechartPackage.eINSTANCE.getState());

			elements.put(EntryEvent_3033, RealtimestatechartPackage.eINSTANCE.getEntryEvent());

			elements.put(DoEvent_3034, RealtimestatechartPackage.eINSTANCE.getDoEvent());

			elements.put(ExitEvent_3035, RealtimestatechartPackage.eINSTANCE.getExitEvent());

			elements.put(ClockConstraint_3036, RealtimestatechartPackage.eINSTANCE.getClockConstraint());

			elements.put(SynchronizationChannel_3037, RealtimestatechartPackage.eINSTANCE.getSynchronizationChannel());

//			elements.put(Region_3042, RealtimestatechartPackage.eINSTANCE.getRegion());

			elements.put(RealtimeStatechart_3043, RealtimestatechartPackage.eINSTANCE.getRealtimeStatechart());

			elements.put(EntryPoint_3040, RealtimestatechartPackage.eINSTANCE.getEntryPoint());

			elements.put(ExitPoint_3041, RealtimestatechartPackage.eINSTANCE.getExitPoint());

			elements.put(Transition_4003, RealtimestatechartPackage.eINSTANCE.getTransition());
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
		case ModelElementCategoryEditPart.VISUAL_ID:
			return RealtimeStatechart_1000;
		case RealtimeStatechartEditPart.VISUAL_ID:
			return RealtimeStatechart_2007;
		case StateEditPart.VISUAL_ID:
			return State_3032;
		case EntryEventEditPart.VISUAL_ID:
			return EntryEvent_3033;
		case DoEventEditPart.VISUAL_ID:
			return DoEvent_3034;
		case ExitEventEditPart.VISUAL_ID:
			return ExitEvent_3035;
		case ClockConstraintEditPart.VISUAL_ID:
			return ClockConstraint_3036;
		case SynchronizationChannelEditPart.VISUAL_ID:
			return SynchronizationChannel_3037;
		case RegionEditPart.VISUAL_ID:
			return Region_3042;
		case RealtimeStatechart2EditPart.VISUAL_ID:
			return RealtimeStatechart_3043;
		case EntryPointEditPart.VISUAL_ID:
			return EntryPoint_3040;
		case ExitPointEditPart.VISUAL_ID:
			return ExitPoint_3041;
		case TransitionEditPart.VISUAL_ID:
			return Transition_4003;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.getElement(elementTypeAdapter);
		}
	};

}
