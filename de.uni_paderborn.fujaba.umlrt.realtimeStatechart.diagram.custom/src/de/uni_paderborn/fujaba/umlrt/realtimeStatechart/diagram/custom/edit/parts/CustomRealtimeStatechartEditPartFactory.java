package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.HistoryStateEditPart;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPartFactory;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry;

/**
 * The custom EditPartFactory that creates our overridden EditParts.
 * 
 * @author bingo
 * 
 */
public class CustomRealtimeStatechartEditPartFactory extends
		RealtimeStatechartEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (RealtimeStatechartVisualIDRegistry.getVisualID(view)) {
			case HistoryStateEditPart.VISUAL_ID:
				return new CustomHistoryStateEditPart(view);
			}
		}
		return super.createEditPart(context, model);
	}

}
