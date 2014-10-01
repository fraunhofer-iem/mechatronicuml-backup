package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateInvariantCompartmentEditPart;

public class CustomStateInvariantCompartmentEditPart extends
		StateInvariantCompartmentEditPart {

	public CustomStateInvariantCompartmentEditPart(View view) {
		super(view);
	}
	
	@Override
	public IFigure createFigure() {
		ResizableCompartmentFigure rcf = (ResizableCompartmentFigure) super.createFigure();
		LayoutManager layoutManager = rcf.getContentPane().getLayoutManager();
		if (layoutManager instanceof ConstrainedToolbarLayout) {
			ConstrainedToolbarLayout constrainedToolbarLayout = (ConstrainedToolbarLayout) layoutManager;
			// use horizontal layout
			constrainedToolbarLayout.setHorizontal(true);
		}
		return rcf;
	}

}
