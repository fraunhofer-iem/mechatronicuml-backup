package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.edit.policies;

import org.eclipse.draw2d.AncestorListener;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import de.uni_paderborn.fujaba.common.edit.policies.NotifyingGraphicalEditPolicy;
import de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortPositionConstraint;
import de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortPositionConstraintType;
import de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable;

public class EmbeddedSinglePortVariableExternalLabelsEditPolicy extends
		NotifyingGraphicalEditPolicy implements AncestorListener {
	protected WrappingLabel nameLabel;
	protected WrappingLabel firstLabel;
	protected WrappingLabel lastLabel;

	protected IFigure parent;

	@Override
	public void activate() {
		super.activate();
		GraphicalEditPart parentPart = ((GraphicalEditPart) getHost()
				.getViewer().getRootEditPart().getChildren().get(0));
		parent = parentPart.getContentPane();

		nameLabel = new PortVariableNameFigure();
		firstLabel = new MultiPortPositionConstraintsFigure();
		lastLabel = new MultiPortPositionConstraintsFigure();

		IFigure hostFigure = ((GraphicalEditPart) getHost()).getFigure();
		hostFigure.addAncestorListener(this);

		parent.add(nameLabel);
		parent.add(firstLabel);
		parent.add(lastLabel);

		updatePosition();
		updateText();

	}

	@Override
	public void deactivate() {
		super.deactivate();
		parent.remove(nameLabel);
		parent.remove(firstLabel);
		parent.remove(lastLabel);
	}

	@Override
	public void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		SinglePortVariable modelElement = getModelElement();
		Object notificationElement = notification.getNotifier();

		if (modelElement != null && modelElement == notificationElement)
			updateText();
	}


	private void updatePosition() {

		IFigure hostFigure = ((GraphicalEditPart) getHost()).getFigure();

		Point hostPosition = hostFigure.getBounds().getTopLeft();
		hostFigure.translateToAbsolute(hostPosition);

		Point centerPosition = hostPosition;
		Point topPosition = hostPosition;
		Point bottomPosition = hostPosition;

		parent.translateToRelative(centerPosition);
		parent.translateToRelative(topPosition);
		parent.translateToRelative(bottomPosition);
		
		WrappingLabel topLabel = getTopLabel();
		WrappingLabel centerLabel = getCenterLabel();
		WrappingLabel bottomLabel = getBottomLabel();

		topLabel.setSize(topLabel.getPreferredSize());
		centerLabel.setSize(centerLabel.getPreferredSize());
		bottomLabel.setSize(bottomLabel.getPreferredSize());

		BorderItemLocator locator = findBorderItemLocator(hostFigure);

		// use WEST as default
		int side = PositionConstants.WEST;
		int padding = 10;
		if (locator != null) {
			side = locator.getCurrentSideOfParent();
		}

		// position the label
		if (side == PositionConstants.NORTH) {
			centerPosition.y -= centerLabel.getSize().height + padding;
			centerPosition.x += (hostFigure.getBounds().width - centerLabel
					.getSize().width) / 2;

			// compute positions for first

			// compute positions for last
		}
		if (side == PositionConstants.SOUTH) {
			centerPosition.y += hostFigure.getBounds().height + padding;
			centerPosition.x += (hostFigure.getBounds().width - centerLabel
					.getSize().width) / 2;

			// compute positions for first

			// compute positions for last
		}
		if (side == PositionConstants.WEST) {
			centerPosition.x -= centerLabel.getSize().width + padding;
			centerPosition.y += (hostFigure.getBounds().height - centerLabel
					.getSize().height) / 2;

			// compute positions for first
			// constraintFirstPosition.x = namePosition.x;
			// constraintFirstPosition.y = namePosition.y + 10;
			//
			// // compute positions for last
			// constraintFirstPosition.x = namePosition.x;
			// constraintFirstPosition.y = namePosition.y - 10;

		}
		if (side == PositionConstants.EAST) {
			centerPosition.x += hostFigure.getBounds().width + padding;
			centerPosition.y += (hostFigure.getBounds().height - centerLabel
					.getSize().height) / 2;

			// compute positions for first

			// compute positions for last
		}

		topLabel.setLocation(topPosition);
		centerLabel.setLocation(centerPosition);
		bottomLabel.setLocation(bottomPosition);

	}

	private void updateText() {

		SinglePortVariable modelElement = getModelElement();

		if (modelElement != null) {
			if (getPostionConstraint(modelElement,
					MultiPortPositionConstraintType.FIRST) != null)
				firstLabel.setText("«first»");

			else
				firstLabel.setText("");

			if (getPostionConstraint(modelElement,
					MultiPortPositionConstraintType.LAST) != null)
				lastLabel.setText("«last»");
			else
				lastLabel.setText("");

			nameLabel.setText(modelElement.getName());
		}

		updatePosition();

	}

	protected WrappingLabel getTopLabel() {
		SinglePortVariable modelElement = getModelElement();

		if (getPostionConstraint(modelElement,
				MultiPortPositionConstraintType.FIRST) != null)
			return firstLabel;
		
		if (!(modelElement.getName() == null || modelElement.getName().equals("")))
			return nameLabel;

		if (getPostionConstraint(modelElement,
				MultiPortPositionConstraintType.LAST) != null)
			return lastLabel;

		return firstLabel;
	}

	protected WrappingLabel getCenterLabel() {
		SinglePortVariable modelElement = getModelElement();

		if (getPostionConstraint(modelElement,
				MultiPortPositionConstraintType.FIRST) == null)
			return firstLabel;

		if (getPostionConstraint(modelElement,
				MultiPortPositionConstraintType.LAST) == null)
			return lastLabel;

		return nameLabel;

	}
	
	protected WrappingLabel getBottomLabel() {
		SinglePortVariable modelElement = getModelElement();
		
		if (getPostionConstraint(modelElement,
				MultiPortPositionConstraintType.LAST) != null)
			return lastLabel;

		if (!(modelElement.getName() == null || modelElement.getName().equals("")))
			return nameLabel;

		return lastLabel;
	}

	protected SinglePortVariable getModelElement() {
		if (getHost().getModel() instanceof Shape)
			return (SinglePortVariable) ((Shape) getHost().getModel())
					.getElement();

		return null;
	}

	/**
	 * Returns the first {@link MultiPortPositionConstraint} of
	 * <code>type</code> that can be found in <code>variable</code>'s
	 * <code>positionConstraints</code> reference.
	 */
	protected MultiPortPositionConstraint getPostionConstraint(
			SinglePortVariable variable, MultiPortPositionConstraintType type) {

		for (MultiPortPositionConstraint constraint : variable
				.getPositionConstraints())
			if (constraint.getPositionConstraintType() == type)
				return constraint;

		return null;
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

	@Override
	public void ancestorAdded(IFigure ancestor) {
		updatePosition();
	}

	@Override
	public void ancestorMoved(IFigure ancestor) {
		updatePosition();
	}

	@Override
	public void ancestorRemoved(IFigure ancestor) {
		updatePosition();
	}

}
