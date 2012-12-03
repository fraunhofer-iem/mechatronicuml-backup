package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryPointEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitPointEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.MumlEditPartFactory;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RealtimeStatechart2EditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartment2EditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionRegionContentsCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateActionCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateChannelCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateInvariantCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel6EditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry;

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
				
			case RealtimeStatechart2EditPart.VISUAL_ID:
				return new CustomRealtimeStatechart2EditPart(view);
				
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
//			case StateEntryPointEditPart.VISUAL_ID:
//				return new CustomStateEntryPointEditPart(view);
//			case StateExitPointEditPart.VISUAL_ID:
//				return new CustomStateExitPointEditPart(view);
				
//			case StateEntryPoint2EditPart.VISUAL_ID:
//				return new CustomStateEntryPoint2EditPart(view);
//			case StateExitPoint2EditPart.VISUAL_ID:
//				return new CustomStateExitPoint2EditPart(view);
				
			case RegionEditPart.VISUAL_ID:
				return new CustomRegionEditPart(view);
			case RegionRegionContentsCompartmentEditPart.VISUAL_ID:
				return new CustomRegionRegionContentsCompartmentEditPart(view);
			case RealtimeStatechartStatechartContentsCompartmentEditPart.VISUAL_ID:
				return new CustomRealtimeStatechartStatechartContentsCompartmentEditPart(
						view);
			case RealtimeStatechartStatechartContentsCompartment2EditPart.VISUAL_ID:
				return new CustomRealtimeStatechartStatechartContentsCompartment2EditPart(
						view);
				
			
				
			case WrappingLabel6EditPart.VISUAL_ID:
				return new CustomWrappingLabel6EditPart(view);
			default:
				break;
			}
		}
		return super.createEditPart(context, model);
	}

}
