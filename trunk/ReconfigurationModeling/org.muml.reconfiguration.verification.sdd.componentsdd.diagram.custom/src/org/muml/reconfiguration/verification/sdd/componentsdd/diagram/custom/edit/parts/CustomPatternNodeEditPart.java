package org.muml.reconfiguration.verification.sdd.componentsdd.diagram.custom.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ScrollPane;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeEditPart;
import org.muml.storydiagram.verification.sdd.PatternNode;


public class CustomPatternNodeEditPart extends ComponentStoryPatternNodeEditPart {
	
	public CustomPatternNodeEditPart(View view) {
		super(view);
	}
		
	private void updateFigure() {
		if(((PatternNode) ((View) getModel()).getElement()) != null) {
					
			IFigure rectangle = (IFigure) ((IFigure) getFigure().getChildren().get(0)).getChildren().get(1);
			
			if(!rectangle.getChildren().isEmpty())
			{
				ResizableCompartmentFigure compartment = (ResizableCompartmentFigure) rectangle.getChildren().get(0);
				compartment.getScrollPane().setHorizontalScrollBarVisibility(ScrollPane.NEVER);
				compartment.getScrollPane().setVerticalScrollBarVisibility(ScrollPane.NEVER);
				compartment.setLayoutManager(new BorderLayout());
				
				if (!((EditPart) this.getChildren().get(2)).getChildren().isEmpty()) {
				compartment.add(((AbstractGraphicalEditPart) ((EditPart) this.getChildren().get(2)).getChildren().get(0)).getFigure(), 
									BorderLayout.CENTER); }
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
