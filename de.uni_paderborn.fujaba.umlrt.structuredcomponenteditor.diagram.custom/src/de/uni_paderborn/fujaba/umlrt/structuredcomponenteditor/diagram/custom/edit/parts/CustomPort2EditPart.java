package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.parts;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.parts.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.policies.CustomPort2ItemSemanticEditPolicy;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.policies.CustomPortGraphicalNodeEditPolicy;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.Port2EditPart;

/**
 * A customized PortEditPart. It is responsible for ports around ComponentParts.
 * 
 * @author bingo
 * 
 */
public class CustomPort2EditPart extends Port2EditPart {

	/**
	 * All logic that is common between CustomPortEditPart and
	 * CustomPort2EditPart is delegated, to reduce duplicate code.
	 */
	private CustomPortEditPartDelegation delegation;

	/**
	 * Constructs this EditPart.
	 * 
	 * @param view
	 *            The graphical model.
	 */
	public CustomPort2EditPart(View view) {
		super(view);

	}

	/**
	 * Creates the custom figure.
	 */
	@Override
	protected IFigure createNodeShape() {
		return primaryShape = new CustomPortFigure(getMapMode());
	}

	/**
	 * Updates the visual representation of this Port according to model
	 * changes.
	 */
	@Override
	protected final void handleNotificationEvent(final Notification notification) {
		if (delegation != null) {
			delegation.handleNotificationEvent(notification);
		}
		super.handleNotificationEvent(notification);
	}

	/**
	 * Initializes this EditPart, when it is activated.
	 */
	@Override
	public void activate() {
		delegation = new CustomPortEditPartDelegation(this,
				(CustomPortFigure) primaryShape);
		delegation.activate();

		EditPart parentEditPart = getParent();
		if (parentEditPart instanceof ComponentPartEditPart) {
			IFigure figure = ((ComponentPartEditPart) parentEditPart)
					.getFigure();

			if (figure instanceof BorderedNodeFigure) {
				BorderedNodeFigure bnf = (BorderedNodeFigure) figure;
				IFigure portContainerFigure = bnf.getBorderItemContainer();
				delegation.addPortContainerLayoutListener(portContainerFigure);
			}
		}

		super.activate();
	}

	/**
	 * Cleanup this EditPart.
	 */
	@Override
	public void deactivate() {
		if (delegation != null) {
			EditPart parentEditPart = getParent();
			if (parentEditPart instanceof ComponentPartEditPart) {
				IFigure figure = ((ComponentPartEditPart) parentEditPart)
						.getFigure();

				if (figure instanceof BorderedNodeFigure) {
					BorderedNodeFigure bnf = (BorderedNodeFigure) figure;
					IFigure portContainerFigure = bnf.getBorderItemContainer();
					delegation
							.removePortContainerLayoutListener(portContainerFigure);
				}
			}

			delegation.deactivate();
			delegation = null;
		}
		super.deactivate();
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new CustomPortGraphicalNodeEditPolicy());
		
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CustomPort2ItemSemanticEditPolicy());

	}

}
