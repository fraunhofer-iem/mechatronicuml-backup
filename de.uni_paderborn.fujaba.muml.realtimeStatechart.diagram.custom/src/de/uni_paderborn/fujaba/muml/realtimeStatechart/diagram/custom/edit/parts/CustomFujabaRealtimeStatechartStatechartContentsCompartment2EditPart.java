package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.FujabaRealtimeStatechartStatechartContentsCompartment2EditPart;

public class CustomFujabaRealtimeStatechartStatechartContentsCompartment2EditPart
		extends FujabaRealtimeStatechartStatechartContentsCompartment2EditPart {

	public CustomFujabaRealtimeStatechartStatechartContentsCompartment2EditPart(
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
