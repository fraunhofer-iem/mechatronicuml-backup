package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.FujabaRealtimeStatechartEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.MumlEditPartFactory;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart;
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
			case TransitionEditPart.VISUAL_ID:
				return new CustomTransitionEditPart(view);
			default:
				break;
			}
		}
		return super.createEditPart(context, model);
	}

}
