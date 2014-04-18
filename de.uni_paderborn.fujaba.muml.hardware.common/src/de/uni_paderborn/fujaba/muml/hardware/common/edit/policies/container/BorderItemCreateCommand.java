package de.uni_paderborn.fujaba.muml.hardware.common.edit.policies.container;


import java.rmi.registry.LocateRegistry;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.requests.LocationRequest;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.realtimestatechart.impl.EntryPointImpl;

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
		if(shape !=null && shape.getElement() instanceof EntryPointImpl ){
			System.out.println("test");
			Rectangle containerBounds=container.getFigure().getBounds().getCopy();
			//container.getFigure().translateToRelative(containerBounds);
			int containerWestX = containerBounds.getLeft().translate(containerBounds.getTopLeft().getNegated()).x;
			int containerEastX = containerBounds.getRight().translate(containerBounds.getTopLeft().getNegated()).x;
			int containerNorthY = containerBounds.getTop().translate(containerBounds.getTopLeft().getNegated()).y;
			int containerSouthY = containerBounds.getBottom().translate(containerBounds.getTopLeft().getNegated()).y;

			Location newBounds=NotationFactory.eINSTANCE.createLocation();
			Point diff=location.translate(containerBounds.getTopLeft().getNegated());
			newBounds.setX(diff.x);
			newBounds.setY(diff.y);
			int position=getPosition(containerBounds, location,containerBounds.width/2-10,containerBounds.height/2-10);
			if(position==PositionConstants.WEST){
				newBounds.setX(containerWestX);
			}
			
			else if(position==PositionConstants.EAST){
				newBounds.setX(containerEastX);
			}
			else if(position==PositionConstants.NORTH){
				newBounds.setY(containerNorthY);
			}
			
			
			shape.setLayoutConstraint(newBounds);
			
			
		//	Point diff=location.translate(containerBounds.getTopLeft().getNegated());
		//	shape.setLayoutConstraint(newBounds);
		////	shape.setLayoutConstraint(newBounds);
		//	diff.performTranslate(containerBounds.x, containerBounds.y);
			//Point diff=location;o
		//	SetBoundsCommand cmd = new SetBoundsCommand(getEditingDomain(), DiagramUIMessages.MoveLabelCommand_Label_Location, new EObjectAdapter(shape), diff);
		//	cmd.execute(monitor, info);
		}
		return result;
}
	
	
	public int getPosition(Rectangle container,Point p,int intervallX,int intervallY) {
		int result = PositionConstants.NONE;

		if (p.x() < container.x+intervallX)
			result = PositionConstants.WEST;
		else if (p.x() >= (container.x + container.width)-intervallX)
			result = PositionConstants.EAST;

		if (p.y() < container.y+intervallY)
			result = result | PositionConstants.NORTH;
		else if (p.y() >= (container.y + container.height)-intervallY)
			result = result | PositionConstants.SOUTH;

		return result;
	}
}
