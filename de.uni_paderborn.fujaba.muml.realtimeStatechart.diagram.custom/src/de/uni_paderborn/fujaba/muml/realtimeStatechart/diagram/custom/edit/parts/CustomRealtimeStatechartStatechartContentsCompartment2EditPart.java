package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartment2EditPart;

public class CustomRealtimeStatechartStatechartContentsCompartment2EditPart
		extends RealtimeStatechartStatechartContentsCompartment2EditPart {

	public CustomRealtimeStatechartStatechartContentsCompartment2EditPart(
			View view) {
		super(view);
	}

	@Override
	public IFigure createFigure() {
		IFigure result = super.createFigure();

		// Begin: Fix for Mechatronic-UML Bug #116
		result.setBorder(null);
		// End Fix

		return result;

	}

}
