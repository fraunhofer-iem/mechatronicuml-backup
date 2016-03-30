package org.muml.reconfiguration.verification.sdd.componentsdd.diagram.custom.edit.parts;

import org.eclipse.draw2d.Graphics;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.EdgeEditPart;
import org.muml.storydiagram.verification.sdd.Edge;
import org.muml.storydiagram.verification.sdd.EdgeType;



public class CustomEdgeEditPart extends EdgeEditPart {

	
	public CustomEdgeEditPart(View view) {
		super(view);
	}
	
	
	private void updateFigure() {
		
		Edge edge = ((Edge) ((View) getModel()).getElement());
		
		if (edge != null) {
			
			EdgeFigure figure = (EdgeFigure) getFigure();
			if (edge.getType() == EdgeType.HIGH) {
				figure.setLineStyle(Graphics.LINE_SOLID);
			}
			else if (edge.getType() == EdgeType.LOW) {
				figure.setLineStyle(Graphics.LINE_DASH);
			}
			
		}
	
	}
		
	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
		updateFigure();
		super.refreshVisuals();
	}

	
	@Override 
	public void refresh() {
		super.refresh();
		updateFigure();
	}

}
