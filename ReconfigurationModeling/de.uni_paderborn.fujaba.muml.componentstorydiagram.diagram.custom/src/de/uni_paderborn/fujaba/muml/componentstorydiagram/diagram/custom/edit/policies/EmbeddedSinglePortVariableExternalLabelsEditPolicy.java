package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.edit.policies;

import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.eclipse.draw2d.ColorConstants;

import de.uni_paderborn.fujaba.common.edit.policies.NotifyingGraphicalEditPolicy;
import de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortPositionConstraint;
import de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortPositionConstraintType;
import de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable;

public class EmbeddedSinglePortVariableExternalLabelsEditPolicy extends
		NotifyingGraphicalEditPolicy implements FigureListener {
	protected WrappingLabel portNameLabel;
	protected WrappingLabel positionConstraintsLabelFirst;
	protected WrappingLabel positionConstraintsLabelLast;
	protected MultiPortPositionConstraint firstConstraint;
	protected MultiPortPositionConstraint lastConstraint;

	protected IFigure parent;
	SinglePortVariable modelElement;

	@Override
	public void activate() {
		super.activate();
		GraphicalEditPart parentPart = ((GraphicalEditPart) getHost()
				.getViewer().getRootEditPart().getChildren().get(0));
		parent = parentPart.getContentPane();
		if (getHost().getModel() instanceof Shape)
			modelElement = (SinglePortVariable) ((Shape) getHost().getModel())
					.getElement();

		portNameLabel = new PortVariableNameFigure();
		positionConstraintsLabelFirst = new MultiPortPositionConstraintsFigure();

		IFigure hostFigure = ((GraphicalEditPart) getHost()).getFigure();
		hostFigure.addFigureListener(this);

		updateConstraints();

		parent.add(portNameLabel);
		parent.add(positionConstraintsLabelFirst);
		parent.add(positionConstraintsLabelLast);

		updatePosition();
		updateText();

	}

	@Override
	public void deactivate() {
		super.deactivate();
		parent.remove(portNameLabel);
		parent.remove(positionConstraintsLabelFirst);
		parent.remove(positionConstraintsLabelFirst);
	}

	@Override
	public void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		if (getHost().getModel() instanceof Shape) {
			EObject element = ((Shape) getHost().getModel()).getElement();
			if (element == notification.getNotifier()) {
				updateConstraints();
				updateText();
			}
		}
	}

	@Override
	public void figureMoved(IFigure source) {
		updatePosition();
	}

	private void updatePosition() {

		IFigure hostFigure = ((GraphicalEditPart) getHost()).getFigure();

		Point hostPosition = hostFigure.getBounds().getTopLeft();
		hostFigure.translateToAbsolute(hostPosition);

		Point namePosition = hostPosition;
		Point constraintFirstPosition = hostPosition;
		Point constraintLastPosition = hostPosition;

		parent.translateToRelative(namePosition);
		parent.translateToRelative(constraintFirstPosition);
		parent.translateToRelative(constraintLastPosition);

		portNameLabel.setSize(portNameLabel.getPreferredSize());
		positionConstraintsLabelFirst.setSize(positionConstraintsLabelFirst
				.getPreferredSize());
		positionConstraintsLabelLast.setSize(positionConstraintsLabelLast
				.getPreferredSize());

		BorderItemLocator locator = findBorderItemLocator(hostFigure);

		// use WEST as default
		int side = PositionConstants.WEST;
		int padding = 10;
		if (locator != null) {
			side = locator.getCurrentSideOfParent();
		}

		// position the label
		if (side == PositionConstants.NORTH) {
			namePosition.y -= portNameLabel.getSize().height + padding;
			namePosition.x += (hostFigure.getBounds().width - portNameLabel
					.getSize().width) / 2;

			// compute positions for first

			// compute positions for last
		}
		if (side == PositionConstants.SOUTH) {
			namePosition.y += hostFigure.getBounds().height + padding;
			namePosition.x += (hostFigure.getBounds().width - portNameLabel
					.getSize().width) / 2;

			// compute positions for first

			// compute positions for last
		}
		if (side == PositionConstants.WEST) {
			namePosition.x -= portNameLabel.getSize().width + padding;
			namePosition.y += (hostFigure.getBounds().height - portNameLabel
					.getSize().height) / 2;

			// compute positions for first
			constraintFirstPosition.x = namePosition.x;
			constraintFirstPosition.y = namePosition.y +10;

			// compute positions for last
			constraintFirstPosition.x = namePosition.x;
			constraintFirstPosition.y = namePosition.y -10;
			
		}
		if (side == PositionConstants.EAST) {
			namePosition.x += hostFigure.getBounds().width + padding;
			namePosition.y += (hostFigure.getBounds().height - portNameLabel
					.getSize().height) / 2;

			// compute positions for first

			// compute positions for last
		}

		portNameLabel.setLocation(namePosition);
		positionConstraintsLabelFirst.setLocation(namePosition);

	}

	private void updateText() {

		if (firstConstraint != null)
			positionConstraintsLabelFirst.setText("«first»");

		if (lastConstraint != null)
			positionConstraintsLabelLast.setText("«last»");

		if (modelElement != null) {
			portNameLabel.setText(modelElement.getName());

			for (MultiPortPositionConstraint constraint : modelElement
					.getPositionConstraints()) {
				if (constraint.getPositionConstraintType() == MultiPortPositionConstraintType.FIRST)
					positionConstraintsLabelFirst.setText("«first»");
				if (constraint.getPositionConstraintType() == MultiPortPositionConstraintType.LAST)
					positionConstraintsLabelLast.setText("«last»");
			}

		}
	}

	private void updateConstraints() {

		firstConstraint = null;
		lastConstraint = null;

		if (modelElement != null) {
			portNameLabel.setText(modelElement.getName());

			for (MultiPortPositionConstraint constraint : modelElement
					.getPositionConstraints()) {
				if (constraint.getPositionConstraintType() == MultiPortPositionConstraintType.FIRST)
					firstConstraint = constraint;
				if (constraint.getPositionConstraintType() == MultiPortPositionConstraintType.LAST)
					lastConstraint = constraint;
			}

		}
	}

	/**
	 * Searches parent figures of <code>type</code> for the
	 * {@link BorderItemLocator} used to determine its orientation.
	 */
	protected BorderItemLocator findBorderItemLocator(IFigure figure) {
		while (figure != null && figure.getParent() != null) {
			if (figure.getParent().getLayoutManager() != null
					&& figure.getParent().getLayoutManager()
							.getConstraint(figure) instanceof BorderItemLocator) {
				return (BorderItemLocator) figure.getParent()
						.getLayoutManager().getConstraint(figure);
			}
			figure = figure.getParent();
		}
		return null;
	}

	static final Font THIS_FONT = new Font(Display.getCurrent(), Display
			.getDefault().getSystemFont().getFontData()[0].getName(), 8,
			SWT.NORMAL);

	public class PortVariableNameFigure extends WrappingLabel {

		public PortVariableNameFigure() {
			this.setFont(THIS_FONT);
			this.setTextUnderline(true);
		}

	}

	public class MultiPortPositionConstraintsFigure extends WrappingLabel {

		public MultiPortPositionConstraintsFigure() {
			this.setFont(THIS_FONT);
			this.setForegroundColor(ColorConstants.gray);
		}

	}

}
