package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.FujabaRealtimeStatechartEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.UmlrtEditPartFactory;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry;

/**
 * The custom EditPartFactory that creates our overridden EditParts.
 * 
 * @author braund
 * 
 */
public class CustomRealtimeStatechartEditPartFactory extends
		UmlrtEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (UmlrtVisualIDRegistry.getVisualID(view)) {
			case TransitionEditPart.VISUAL_ID:
				return new CustomTransitionEditPart(view);
			case FujabaRealtimeStatechartEditPart.VISUAL_ID:
				return new CustomFujabaRealtimeStatechartEditPart(view);
			default:
				break;
			}
		}
		return super.createEditPart(context, model);
	}

}
