package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.common.edit.parts.ContinuousPortBehavior;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPort2EditPart;

/**
 * A customized PortEditPart for continuous ports.
 * 
 * @author bingo
 * 
 */
public class CustomContinuousPort2EditPart extends ContinuousPort2EditPart {

	/**
	 * All behavior is delegated, to reduce duplicate code.
	 */
	private ContinuousPortBehavior behavior;

	/**
	 * Constructs this EditPart.
	 * 
	 * @param view
	 *            The graphical model.
	 */
	public CustomContinuousPort2EditPart(View view) {
		super(view);
	}

	/**
	 * Creates the custom figure.
	 */
	@Override
	protected IFigure createNodeShape() {
		CustomPortFigure portFigure = new CustomPortFigure(getMapMode());
		primaryShape = portFigure;
		getBehavior().setFigure(portFigure);
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
	private ContinuousPortBehavior getBehavior() {
		if (behavior == null) {
			behavior = new ContinuousPortBehavior(this);
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
