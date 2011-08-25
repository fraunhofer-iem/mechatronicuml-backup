package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.FujabaRealtimeStatechartEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.MumlEditPartFactory;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionFujabaRealtimeStatechartCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.State2EditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateCompoundCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEntryPointEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateExitPointEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart;
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
			case FujabaRealtimeStatechartEditPart.VISUAL_ID:
				return new CustomFujabaRealtimeStatechartEditPart(view);
			case StateEditPart.VISUAL_ID:
				return new CustomStateEditPart(view);
			case State2EditPart.VISUAL_ID:
				return new CustomState2EditPart(view);
			case TransitionEditPart.VISUAL_ID:
				return new CustomTransitionEditPart(view);
			case StateCompoundCompartmentEditPart.VISUAL_ID:
				return new CustomStateCompoundCompartmentEditPart(view);
			case StateRegionCompartmentEditPart.VISUAL_ID:
				return new CustomStateRegionCompartmentEditPart(view);
			case StateEntryPointEditPart.VISUAL_ID:
				return new CustomStateEntryPointEditPart(view);
			case StateExitPointEditPart.VISUAL_ID:
				return new CustomStateExitPointEditPart(view);
			case RegionEditPart.VISUAL_ID:
				return new CustomRegionEditPart(view);
			case RegionFujabaRealtimeStatechartCompartmentEditPart.VISUAL_ID:
				return new CustomRegionFujabaRealtimeStatechartCompartmentEditPart(view);

			default:
				break;
			}
		}
		return super.createEditPart(context, model);
	}

}
