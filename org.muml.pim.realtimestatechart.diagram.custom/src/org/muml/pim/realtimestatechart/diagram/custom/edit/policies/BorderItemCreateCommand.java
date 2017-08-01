package org.muml.pim.realtimestatechart.diagram.custom.edit.policies;


import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;

public class BorderItemCreateCommand extends CreateCommand {
	Point location;
	IGraphicalEditPart container;
	
	public BorderItemCreateCommand (TransactionalEditingDomain editingDomain, ViewDescriptor viewDescriptor,
			View containerView, Point location, IGraphicalEditPart container) {
		super(editingDomain, viewDescriptor, containerView);
		this.location=location;
		this.container=container;
	}
	
	@Override
    protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
    throws ExecutionException {
		
		CommandResult result = super.doExecuteWithResult(monitor, info);
		
		Shape shape = (Shape) super.viewDescriptor.getAdapter(Shape.class);
		if(shape !=null && RealtimestatechartPackage.Literals.STATE_CONNECTION_POINT.isSuperTypeOf(shape.getElement().eClass()) ){
			Rectangle containerBounds=container.getFigure().getBounds().getCopy();
			Location newBounds=NotationFactory.eINSTANCE.createLocation();
			Point diff=location.translate(containerBounds.getTopLeft().getNegated());
			newBounds.setX(diff.x);
			newBounds.setY(diff.y);
			
			shape.setLayoutConstraint(newBounds);
		}
		return result;
}
	
	
	
}
