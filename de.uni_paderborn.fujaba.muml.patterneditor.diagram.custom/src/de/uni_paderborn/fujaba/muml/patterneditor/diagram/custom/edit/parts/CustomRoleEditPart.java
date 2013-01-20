package de.uni_paderborn.fujaba.muml.patterneditor.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.common.edit.parts.RoleBehavior;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleEditPart;

public class CustomRoleEditPart extends RoleEditPart {

	/**
	 * All behavior is delegated, to reduce duplicate code.
	 */
	private RoleBehavior behavior;

	
	public CustomRoleEditPart(View view) {
		super(view);
	}
	
	/**
	 * Creates the custom figure.
	 */
	@Override
	protected IFigure createNodeShape() {
		CustomPortFigure roleFigure = new CustomPortFigure();
		roleFigure.setPortSide(PositionConstants.WEST);
		getBehavior().setFigure(roleFigure);
		primaryShape = roleFigure;
		return primaryShape;
	}

	/**
	 * Creates the node plate, which is defines the size and is responsible to
	 * return custom PolygonPoints that help connecting Connections at the right
	 * Point.
	 */
	@Override
	protected NodeFigure createNodePlate() {
		return getBehavior().createNodePlate();
	}

	/**
	 * Gets the PortBehavior object or lazily creates it. It will never return
	 * null.
	 * 
	 * @return The PortBehavior object.
	 */
	private RoleBehavior getBehavior() {
		if (behavior == null) {
			behavior = new RoleBehavior(this);
		}
		return behavior;
	}

	/**
	 * Updates the visual representation of this Port according to model
	 * changes.
	 */
	@Override
	protected final void handleNotificationEvent(final Notification notification) {
		getBehavior().handleNotificationEvent(notification);
		super.handleNotificationEvent(notification);
	}

	/**
	 * Initializes this EditPart, when it is activated.
	 */
	@Override
	public void activate() {
		getBehavior().activate();
		super.activate();
	}

	/**
	 * Cleanup this EditPart.
	 */
	@Override
	public void deactivate() {
		getBehavior().deactivate();
		super.deactivate();
	}



}
