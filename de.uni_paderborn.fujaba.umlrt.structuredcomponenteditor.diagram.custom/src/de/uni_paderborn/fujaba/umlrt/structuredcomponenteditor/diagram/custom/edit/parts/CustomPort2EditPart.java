package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutListener;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.umlrt.model.component.Port;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.Port2EditPart;

public class CustomPort2EditPart extends Port2EditPart {

	private Dimension offset = new Dimension(12, 12);

	private PortDecoration portDecoration;

	private LayoutListener portContainerLayoutListener;

	public CustomPort2EditPart(View view) {
		super(view);
	}

	@Override
	protected IFigure createNodeShape() {
		// Create a new PortFigure...
		CustomPort2Figure portFigure = new CustomPort2Figure();
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
		if (parentEditPart instanceof ComponentPartEditPart) {
			IFigure figure = ((ComponentPartEditPart) parentEditPart)
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
			if (parentEditPart instanceof ComponentPartEditPart) {
				IFigure figure = ((ComponentPartEditPart) parentEditPart)
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

	public class CustomPort2Figure
			extends
			de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.Port2EditPart.PortFigure
			implements IPortFigure {

	}

}
