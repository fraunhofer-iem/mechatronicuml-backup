package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ScrollPane;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.componentstorydiagram.controlflow.ControllerExchangeNode;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeEditPart;

public class CustomControllerExchangeNodeEditPart extends
		ControllerExchangeNodeEditPart {

	public CustomControllerExchangeNodeEditPart(View view) {
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
		if (((ControllerExchangeNode) ((View) getModel()).getElement()) != null) {

			// resize the pattern compartment
			RectangleFigure patternRectangle = getPrimaryShape().getFigureControllerExchangeNodePatternContainer();
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
