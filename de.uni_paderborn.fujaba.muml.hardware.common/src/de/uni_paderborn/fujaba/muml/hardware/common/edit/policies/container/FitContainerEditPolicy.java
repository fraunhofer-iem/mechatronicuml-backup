package de.uni_paderborn.fujaba.muml.hardware.common.edit.policies.container;

/** 
 * 
 * @author adann
 */

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;

import de.uni_paderborn.fujaba.muml.common.edit.policies.NotifyingGraphicalEditPolicy;


public class FitContainerEditPolicy extends NotifyingGraphicalEditPolicy {
	public static final int SPACEING = 25;

	@Override
	public void handleNotificationEvent(Notification notification) {
		// TODO Auto-generated method stub
		
		if(Notification.ADD ==notification.getEventType()){
			layoutChildren();
		}
		
	}
	
	protected void layoutChildren(){
		IFigure containerFigure = getHostFigure().getParent();
		Rectangle result = containerFigure.getBounds().getCopy();
	//	containerFigure.translateToAbsolute(result);

		PrecisionRectangle transformedChildRect = null;
		List<IGraphicalEditPart> childEditParts = getHost().getChildren();
		for (IGraphicalEditPart chidEditPart : childEditParts) {
			if (chidEditPart != getHost()) {
				transformedChildRect = new PrecisionRectangle(
						chidEditPart.getFigure().getBounds());
				transformedChildRect.expand(SPACEING,SPACEING);
		//		chidEditPart.getFigure().translateToAbsolute(
		//				transformedChildRect);
				result.union(transformedChildRect);
			}
		}
	//	containerFigure.translateToRelative(result);

		setBounds(containerFigure, result);
	}
	
	protected void setBounds(IFigure figure, Rectangle bounds) {
		figure.setBounds(bounds);
		figure.getParent().setConstraint(figure, bounds);
	}


}
