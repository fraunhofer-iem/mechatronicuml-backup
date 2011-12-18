package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryPointEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitPointEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ModelElementCategoryEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.MumlEditPartFactory;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartment2EditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionRegionContentsCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateChannelCompartmentEditPart;
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
			case ModelElementCategoryEditPart.VISUAL_ID:
				return new CustomModelElementCategoryEditPart(view);
			case RealtimeStatechartEditPart.VISUAL_ID:
				return new CustomRealtimeStatechartEditPart(view);
			case StateEditPart.VISUAL_ID:
				return new CustomStateEditPart(view);
			case EntryPointEditPart.VISUAL_ID:
				return new CustomEntryPointEditPart(view);
			case ExitPointEditPart.VISUAL_ID:
				return new CustomExitPointEditPart(view);
			case TransitionEditPart.VISUAL_ID:
				return new CustomTransitionEditPart(view);
			case StateCompoundCompartmentEditPart.VISUAL_ID:
				return new CustomStateCompoundCompartmentEditPart(view);
			case StateRegionCompartmentEditPart.VISUAL_ID:
				return new CustomStateRegionCompartmentEditPart(view);
			case StateChannelCompartmentEditPart.VISUAL_ID:
				return new CustomStateChannelCompartmentEditPart(view);
			case StateEntryPointEditPart.VISUAL_ID:
				return new CustomStateEntryPointEditPart(view);
			case StateExitPointEditPart.VISUAL_ID:
				return new CustomStateExitPointEditPart(view);
			case RegionEditPart.VISUAL_ID:
				return new CustomRegionEditPart(view);
			case RegionRegionContentsCompartmentEditPart.VISUAL_ID:
				return new CustomRegionRegionContentsCompartmentEditPart(view);
			case RealtimeStatechartStatechartContentsCompartmentEditPart.VISUAL_ID:
				return new CustomRealtimeStatechartStatechartContentsCompartmentEditPart(view);
			case RealtimeStatechartStatechartContentsCompartment2EditPart.VISUAL_ID:
				return new CustomRealtimeStatechartStatechartContentsCompartment2EditPart(view);

			default:
				break;
			}
		}
		return super.createEditPart(context, model);
	}

}
