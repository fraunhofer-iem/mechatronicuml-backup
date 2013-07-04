package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class MumlEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
					.getVisualID(view)) {

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ModelElementCategoryEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabelEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryEventEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryEventEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.DoEventEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.DoEventEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel3EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ExitEventEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ExitEventEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel4EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ClockConstraintEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel5EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.SynchronizationChannelEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel6EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionPriorityEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionPriorityEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel7EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechart2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechart2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryPointEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryPointEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryPointNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryPointNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ExitPointEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ExitPointEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ExitPointNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ExitPointNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateActionCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateActionCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateRegionCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateRegionCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateChannelCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateChannelCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateInvariantCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateInvariantCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionRegionContentsCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionRegionContentsCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartment2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartment2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.TransitionEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel8EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel9EditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
