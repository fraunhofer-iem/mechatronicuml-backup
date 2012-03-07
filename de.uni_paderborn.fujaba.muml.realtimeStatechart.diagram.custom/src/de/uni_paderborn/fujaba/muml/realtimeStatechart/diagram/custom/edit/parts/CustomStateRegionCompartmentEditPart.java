package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import java.awt.Color;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartmentEditPart;

public class CustomStateRegionCompartmentEditPart extends
		StateRegionCompartmentEditPart {

	public CustomStateRegionCompartmentEditPart(View view) {
		super(view);
	}

	@Override
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		LayoutManager layoutManager = result.getContentPane()
				.getLayoutManager();
		if (layoutManager instanceof ConstrainedToolbarLayout) {
			ConstrainedToolbarLayout constrainedToolbarLayout = (ConstrainedToolbarLayout) layoutManager;
			constrainedToolbarLayout.setStretchMajorAxis(true);
			constrainedToolbarLayout.setStretchMinorAxis(true);
		}

		return result;
	}

	@Override
	protected void addChildVisual(EditPart childEditPart, int index) {
		super.addChildVisual(childEditPart, index);
		updateRegionBorders();
	}

	@Override
	protected void removeChildVisual(EditPart childEditPart) {
		super.removeChildVisual(childEditPart);
		updateRegionBorders();
	}

	// Convenience method to make sure all Regions, except the Region at the
	// bottom have a dashed bottom border.
	private void updateRegionBorders() {
		LineBorder lastLineBorder = null;
		for (Object editPart : getChildren()) {
			if (editPart instanceof RegionEditPart) {
				RegionEditPart regionEditPart = (RegionEditPart) editPart;
				if (getContentPane().getChildren().contains(
						regionEditPart.getFigure())) {
					Border border = regionEditPart.getPrimaryShape()
							.getBorder();
					if (border instanceof LineBorder) {
						LineBorder lineBorder = (LineBorder) border;
						lineBorder.setColor(ColorConstants.black);
						lastLineBorder = lineBorder;
					}
				}
			}
		}
		if (lastLineBorder != null) {
			lastLineBorder.setColor(ColorConstants.white);
		}
	}

}
