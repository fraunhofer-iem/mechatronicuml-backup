package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ScrollPane;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeEditPart;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryNode;

public class CustomComponentStoryNodeEditPart extends
		ComponentStoryNodeEditPart {

	public CustomComponentStoryNodeEditPart(View view) {
		super(view);
	}
	
	@Override
	public void refresh() {
		super.refresh();
//		updateFigure();
	}

	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
//		updateFigure();
		super.refreshVisuals();
	}

	private void updateFigure() {
		if (((ComponentStoryNode) ((View) getModel()).getElement()) != null) {

			// resize the pattern compartment
			RectangleFigure patternRectangle = getPrimaryShape().getFigureComponentStoryNodePatternContainer();
			if (!patternRectangle.getChildren().isEmpty()) {
				ResizableCompartmentFigure patternCompartment = (ResizableCompartmentFigure) patternRectangle
						.getChildren().get(0);
				patternCompartment.getScrollPane().setHorizontalScrollBarVisibility(ScrollPane.NEVER);
				patternCompartment.getScrollPane().setVerticalScrollBarVisibility(ScrollPane.NEVER);
				patternCompartment.setLayoutManager(new BorderLayout());

				if (!getChildren().isEmpty()){
					if (!((EditPart) getChildren().get(1)).getChildren().isEmpty()) {
						patternCompartment.add(((AbstractGraphicalEditPart) ((EditPart) getChildren().get(1)).getChildren()
							.get(0)).getFigure(), BorderLayout.CENTER);
					}
				}
			}
		}
	}

}
