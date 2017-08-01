package org.muml.pim.realtimestatechart.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartmentEditPart;

public class CustomRealtimeStatechartStatechartContentsCompartmentEditPart
		extends RealtimeStatechartStatechartContentsCompartmentEditPart {

	public CustomRealtimeStatechartStatechartContentsCompartmentEditPart(
			View view) {
		super(view);
	}

	@Override
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();

		// Remove compartment border (#116)
		result.setBorder(null);

		// Set horizontal list-layout.
		LayoutManager layoutManager = result.getContentPane()
				.getLayoutManager();
		if (layoutManager instanceof ConstrainedToolbarLayout) {
			ConstrainedToolbarLayout constrainedToolbarLayout = (ConstrainedToolbarLayout) layoutManager;
			constrainedToolbarLayout.setHorizontal(true);
		}

		return result;
	}

}
