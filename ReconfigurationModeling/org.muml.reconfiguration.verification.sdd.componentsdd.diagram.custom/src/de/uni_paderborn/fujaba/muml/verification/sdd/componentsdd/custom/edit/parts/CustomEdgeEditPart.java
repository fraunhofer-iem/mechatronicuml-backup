package de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.custom.edit.parts;

import org.eclipse.draw2d.Graphics;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.verification.sdd.Edge;
import de.uni_paderborn.fujaba.muml.verification.sdd.EdgeType;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.EdgeEditPart;



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
