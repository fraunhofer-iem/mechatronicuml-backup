package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.common.edit.parts.SinglePortVariableBehavior;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.SinglePortVariable3EditPart;

public class CustomSinglePortVariable4EditPart extends
		SinglePortVariable3EditPart {

	/**
	 * All behavior is delegated, to reduce duplicate code.
	 */
	private SinglePortVariableBehavior delegation;

	public CustomSinglePortVariable4EditPart(View view) {
		super(view);
	}

	/**
	 * Creates the custom figure.
	 */
	@Override
	protected IFigure createNodeShape() {
		CustomPortFigure portFigure = new CustomPortFigure(getMapMode());
		primaryShape = portFigure;
		getDelegation().setFigure(portFigure);
		return primaryShape;
	}

	/**
	 * Creates the node plate, which is defines the size and is responsible to
	 * return custom PolygonPoints that help connecting Connections at the right
	 * Point.
	 */
	@Override
	protected NodeFigure createNodePlate() {
		return getDelegation().createNodePlate();
	}

	/**
	 * Gets the PortBehavior object or lazily creates it. It will never return
	 * null.
	 * 
	 * @return The PortBehavior object.
	 */
	private SinglePortVariableBehavior getDelegation() {
		if (delegation == null) {
			delegation = new SinglePortVariableBehavior(this);
		}
		return delegation;
	}

	/**
	 * Updates the visual representation of this Port according to model
	 * changes.
	 */
	@Override
	protected final void handleNotificationEvent(final Notification notification) {
		getDelegation().handleNotificationEvent(notification);
		super.handleNotificationEvent(notification);
	}

	/**
	 * Initializes this EditPart, when it is activated.
	 */
	@Override
	public void activate() {
		getDelegation().activate();
		super.activate();
	}

	/**
	 * Cleanup this EditPart.
	 */
	@Override
	public void deactivate() {
		getDelegation().deactivate();
		super.deactivate();
	}


}
