package org.muml.pim.realtimestatechart.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.realtimestatechart.diagram.edit.parts.EntryPointEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.ExitPointEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.MumlEditPartFactory;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RealtimeStatechartEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartment2EditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartmentEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RegionEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RegionRegionContentsCompartmentEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.StateActionCompartmentEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.StateChannelCompartmentEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.StateEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.StateInvariantCompartmentEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.StateRegionCompartmentEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.TransitionEditPart;
import org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry;

/**
 * The custom EditPartFactory that creates our overridden EditParts.
 * 
 * @author braund
 * 
 */
public class CustomRealtimeStatechartEditPartFactory extends
		MumlEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (MumlVisualIDRegistry.getVisualID(view)) {
			case RealtimeStatechartEditPart.VISUAL_ID:
				return new CustomRealtimeStatechartEditPart(view);
			case RegionEditPart.VISUAL_ID:
				return new CustomRegionEditPart(view);
			case StateEditPart.VISUAL_ID:
				return new CustomStateEditPart(view);
			case EntryPointEditPart.VISUAL_ID:
				return new CustomEntryPointEditPart(view);
			case ExitPointEditPart.VISUAL_ID:
				return new CustomExitPointEditPart(view);
			case TransitionEditPart.VISUAL_ID:
				return new CustomTransitionEditPart(view);
			case StateActionCompartmentEditPart.VISUAL_ID:
				return new CustomStateActionCompartmentEditPart(view);
			case StateRegionCompartmentEditPart.VISUAL_ID:
				return new CustomStateRegionCompartmentEditPart(view);
			case StateChannelCompartmentEditPart.VISUAL_ID:
				return new CustomStateChannelCompartmentEditPart(view);
			case StateInvariantCompartmentEditPart.VISUAL_ID:
				return new CustomStateInvariantCompartmentEditPart(view);
			case RegionRegionContentsCompartmentEditPart.VISUAL_ID:
				return new CustomRegionRegionContentsCompartmentEditPart(view);
			case RealtimeStatechartStatechartContentsCompartmentEditPart.VISUAL_ID:
				return new CustomRealtimeStatechartStatechartContentsCompartmentEditPart(
						view);
			case RealtimeStatechartStatechartContentsCompartment2EditPart.VISUAL_ID:
				return new CustomRealtimeStatechartStatechartContentsCompartment2EditPart(
						view);
			default:
				break;
			}
		}
		return super.createEditPart(context, model);
	}

}
