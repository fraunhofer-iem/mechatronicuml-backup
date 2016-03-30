package org.muml.reconfiguration.componentstorydiagram.diagram.custom.edit.parts;

import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityEditPart;

public class CustomActivityEditPart extends ActivityEditPart {

	public CustomActivityEditPart(View view) {
		super(view);
	}
	
	protected IFigure setupContentPane(IFigure nodeShape) {
		nodeShape = super.setupContentPane(nodeShape);
		if (nodeShape.getLayoutManager() instanceof ConstrainedToolbarLayout) {
			ConstrainedToolbarLayout layout = (ConstrainedToolbarLayout) nodeShape.getLayoutManager();
			layout.setSpacing(0); // Set spacing to zero
			layout.setStretchMajorAxis(true);
			layout.setStretchMinorAxis(true);
			nodeShape.setLayoutManager(layout);
		} 
		if (nodeShape.getLayoutManager() instanceof GridLayout) {
			GridLayout layout = (GridLayout) nodeShape.getLayoutManager();
			layout.marginHeight = layout.marginWidth = 0;
			layout.verticalSpacing = layout.horizontalSpacing = 0;
		}
		return nodeShape;
	}

}
