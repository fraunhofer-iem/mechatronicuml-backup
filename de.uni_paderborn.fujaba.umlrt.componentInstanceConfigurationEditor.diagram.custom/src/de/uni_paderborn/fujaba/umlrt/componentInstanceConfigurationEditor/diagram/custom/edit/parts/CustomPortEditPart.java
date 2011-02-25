package de.uni_paderborn.fujaba.umlrt.componentInstanceConfigurationEditor.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutListener;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.umlrt.model.component.Port;
import de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.PortEditPart;
import de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPart;
import de.uni_paderborn.fujaba.umlrt.componentInstanceConfigurationEditor.diagram.custom.policies.CustomPortItemSemanticEditPolicy;

/**
 * 
 * @author bingo
 * 
 */
public class CustomPortEditPart extends PortEditPart {

	private Dimension offset = new Dimension(12, 12);

	private PortDecoration portDecoration;

	private LayoutListener portContainerLayoutListener;

	public CustomPortEditPart(View view) {
		super(view);
	}
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();

		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new CustomPortItemSemanticEditPolicy(this));
		}

	@Override
	protected IFigure createNodeShape() {
		// Create a new PortFigure...
		CustomPortFigure portFigure = new CustomPortFigure();
		primaryShape = portFigure;

		// Create PortDecoration
		EObject element = getNotationView().getElement();
		if (element instanceof Port) {
			Port port = (Port) getNotationView().getElement();
			portDecoration = new PortDecoration(portFigure, port);
		}

		// We are ready
		return primaryShape;
	}

	@Override
	protected final void handleNotificationEvent(final Notification notification) {
		EObject element = getNotationView().getElement();
		Object feature = notification.getFeature();

		if (feature instanceof EReference && element instanceof Port
				&& portDecoration != null) {

			EReference reference = (EReference) feature;

			switch (reference.getFeatureID()) {
			case ComponentPackage.PORT__PROVIDED:
			case ComponentPackage.PORT__REQUIRED:
			case ComponentPackage.PORT__CARDINALITY:
				portDecoration.update();
				break;
			}
		}

		super.handleNotificationEvent(notification);
	}

	@Override
	public void activate() {
		IBorderItemLocator locator = getBorderItemLocator();
		if (locator instanceof BorderItemLocator) {
			((BorderItemLocator) locator).setBorderItemOffset(offset);
		}

		EditPart parentEditPart = this.getParent();
		if (parentEditPart instanceof ComponentInstanceConfigurationEditPart) {
			IFigure figure = ((ComponentInstanceConfigurationEditPart) parentEditPart)
					.getFigure();

			if (figure instanceof BorderedNodeFigure) {
				BorderedNodeFigure bnf = (BorderedNodeFigure) figure;
				IFigure bicf = bnf.getBorderItemContainer();
				portContainerLayoutListener = new PortContainerLayoutListener(
						this, portDecoration);
				bicf.addLayoutListener(portContainerLayoutListener);
			}
		}
		super.activate();
	}

	@Override
	public void deactivate() {
		if (portContainerLayoutListener != null) {
			EditPart parentEditPart = this.getParent();
			if (parentEditPart instanceof ComponentInstanceConfigurationEditPart) {
				IFigure figure = ((ComponentInstanceConfigurationEditPart) parentEditPart)
						.getFigure();

				if (figure instanceof BorderedNodeFigure) {
					BorderedNodeFigure bnf = (BorderedNodeFigure) figure;
					IFigure bicf = bnf.getBorderItemContainer();
					portContainerLayoutListener = new PortContainerLayoutListener(
							this, portDecoration);
					bicf.removeLayoutListener(portContainerLayoutListener);
				}
			}
		}
		super.deactivate();
	}

	public class CustomPortFigure
			extends
			de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.PortEditPart.PortFigure
			implements IPortFigure {

	}

}
