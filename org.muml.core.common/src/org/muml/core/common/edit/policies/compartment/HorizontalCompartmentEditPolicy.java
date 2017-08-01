package org.muml.core.common.edit.policies.compartment;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gef.editpolicies.GraphicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;

public class HorizontalCompartmentEditPolicy extends GraphicalEditPolicy {

	private boolean horizontal;

	@Override
	public void activate() {
		super.activate();

		// Set horizontal list-layout.
		ConstrainedToolbarLayout layout = getLayout();
		if (layout != null) {
			horizontal = layout.isHorizontal();
			layout.setHorizontal(true);
		}
	}

	@Override
	public void deactivate() {
		// Set old list-layout.
		ConstrainedToolbarLayout layout = getLayout();
		if (layout != null) {
			horizontal = layout.isHorizontal();
			layout.setHorizontal(horizontal);
		}
		super.deactivate();
	}
	
	private ConstrainedToolbarLayout getLayout() {
		IFigure figure = getHostFigure();
		if (figure instanceof ResizableCompartmentFigure) {
			ResizableCompartmentFigure compartmentFigure = (ResizableCompartmentFigure) figure;

			LayoutManager layoutManager = compartmentFigure.getContentPane()
					.getLayoutManager();
			if (layoutManager instanceof ConstrainedToolbarLayout) {
				ConstrainedToolbarLayout constrainedToolbarLayout = (ConstrainedToolbarLayout) layoutManager;
				return constrainedToolbarLayout;
			}
		}
		return null;
	}


}
