package org.muml.pim.operationrepository.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.operationrepository.diagram.edit.parts.OperationParametersCompartmentEditPart;

public class CustomOperationParametersCompartmentEditPart extends OperationParametersCompartmentEditPart{

	public CustomOperationParametersCompartmentEditPart(View view) {
		super(view);
	}

	@Override
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();

		// Remove compartment border
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
