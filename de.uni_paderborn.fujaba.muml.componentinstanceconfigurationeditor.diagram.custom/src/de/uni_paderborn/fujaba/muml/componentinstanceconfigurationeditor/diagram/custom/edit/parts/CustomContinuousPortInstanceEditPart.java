package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.common.edit.parts.ContinuousPortInstanceBehavior;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.policies.CustomPortGraphicalNodeEditPolicy;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.policies.CustomPortInstanceItemSemanticEditPolicy;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceEditPart;

/**
 * A customized PortEditPart. It is responsible for ports around
 * ComponentInstances and ComponentParts.
 * 
 * @author bingo
 * 
 */
public class CustomContinuousPortInstanceEditPart extends ContinuousPortInstanceEditPart {

	/**
	 * All behavior is delegated, to reduce duplicate code.
	 */
	private ContinuousPortInstanceBehavior delegation;

	/**
	 * Constructs this EditPart.
	 * 
	 * @param view
	 *            The graphical model.
	 */
	public CustomContinuousPortInstanceEditPart(View view) {
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
	private ContinuousPortInstanceBehavior getDelegation() {
		if (delegation == null) {
			delegation = new ContinuousPortInstanceBehavior(this);
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

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();

		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new CustomPortGraphicalNodeEditPolicy());

		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CustomPortInstanceItemSemanticEditPolicy());

	}

}
