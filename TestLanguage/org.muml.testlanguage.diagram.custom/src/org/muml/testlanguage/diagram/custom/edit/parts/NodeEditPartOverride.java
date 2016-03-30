package org.muml.testlanguage.diagram.custom.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.testlanguage.diagram.custom.edit.policy.NodeSpecificationModelChangedEditPolicy;
import org.muml.testlanguage.diagram.custom.providers.NodeSpecificationListenerProvider;
import org.muml.testlanguage.diagram.edit.parts.NodeEditPart;

public class NodeEditPartOverride extends NodeEditPart implements
		NodeSpecificationListenerProvider {

	// Some settings for the visuals of the ports.
	public static int PORT_HEIGHT = 20;
	public static int ARROW_WIDTH = 6;
	public static int HALF_ARROW_WIDTH = (int) (ARROW_WIDTH / 2.);
	public static int ARROW_HEIGHT = 16;
	public static int HALF_ARROW_HEIGHT = (int) (ARROW_HEIGHT / 2.);
	public static int ARROW_INDENT = 1;

	public NodeEditPartOverride(View view) {
		super(view);
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();

		String role = NodeSpecificationModelChangedEditPolicy.MODEL_CHANGED_ROLE;
		EditPolicy originalPolicy = this.getEditPolicy(role);
		NodeSpecificationModelChangedEditPolicy policy = new NodeSpecificationModelChangedEditPolicy(
				role, originalPolicy);
		this.installEditPolicy(role, policy);
	}

	@Override
	public void installListenerFilter(String filterId,
			NotificationListener listener, EObject element) {
		addListenerFilter(filterId, listener, element);
	}

	@Override
	public void uninstallListenerFilter(String filterId) {
		removeListenerFilter(filterId);
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ExtendedNodeFigure();
	}

	public class ExtendedNodeFigure extends NodeEditPart.NodeFigure {

		public ExtendedNodeFigure() {
			this.setOutline(true);
			this.setLineWidth(2);
			this.setForegroundColor(ColorConstants.black);
		}

		@Override
		public void paintFigure(Graphics graphics) {
			super.paintFigure(graphics);

			Rectangle bounds = this.getBounds();

			graphics.translate(bounds.x, bounds.y);
			graphics.setBackgroundColor(ColorConstants.black);
			graphics.fillRectangle(bounds.width - NodeEditPartOverride.ARROW_WIDTH, 0, bounds.width, bounds.height);

		}

	}
}
