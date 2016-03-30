package de.uni_paderborn.fujaba.muml.reconfiguration.common.edit.policies;

import org.eclipse.draw2d.AncestorListener;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.muml.common.edit.policies.NotifyingGraphicalEditPolicy;
import org.muml.core.impl.CorePackageImpl;

import de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortPositionConstraint;
import de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortPositionConstraintType;
import de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentstorypatternPackageImpl;

public class EmbeddedSinglePortVariableExternalLabelsEditPolicy extends
		NotifyingGraphicalEditPolicy implements AncestorListener {
	protected WrappingLabel nameLabel;
	protected WrappingLabel firstLabel;
	protected WrappingLabel lastLabel;

	protected IFigure parent;
	
	private static final String GUILLEMET_CLOSE = "\u00ab"; //$NON-NLS-1$
	private static final String GUILLEMET_OPEN = "\u00bb"; //$NON-NLS-1$

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

		updateText();
		updatePosition();

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

		EList<Object> relevantFeatures = new BasicEList<Object>();
		relevantFeatures.add(CorePackageImpl.eINSTANCE.getNamedElement_Name());
		relevantFeatures.add(ComponentstorypatternPackageImpl.eINSTANCE
				.getMultiPortPositionConstraint_PositionConstraintType());
		relevantFeatures.add(ComponentstorypatternPackageImpl.eINSTANCE
				.getSinglePortVariable_PositionConstraints());

		if (relevantFeatures.contains(notification.getFeature())) {
			// update listeners
			if (modelElement != null) {
				for (MultiPortPositionConstraint constraint : modelElement
						.getPositionConstraints()) {
					removeNotificationListener(constraint);
					addNotificationListener(constraint);
				}
			}

			updateText();
		}

	}

	private void updatePosition() {

		IFigure hostFigure = ((GraphicalEditPart) getHost()).getFigure();

		Point hostPosition = hostFigure.getBounds().getTopLeft();
		hostFigure.translateToAbsolute(hostPosition);

		// NORTH/SOUTH: counted from center of Component(Part)Variable
		// EAST/WEST: counted from top to bottom
		Point firstPosition = new Point(hostPosition);
		Point secondPosition = new Point(hostPosition);
		Point thirdPosition = new Point(hostPosition);

		parent.translateToRelative(secondPosition);
		parent.translateToRelative(firstPosition);
		parent.translateToRelative(thirdPosition);

		// NORTH/SOUTH: counted from center of Component(Part)Variable
		// EAST/WEST: counted from top to bottom
		WrappingLabel firstLabel = getFirstLabel();
		WrappingLabel thirdLabel = getThirdLabel();
		WrappingLabel secondLabel = getSecondLabel();

		firstLabel.setSize(firstLabel.getPreferredSize());
		secondLabel.setSize(secondLabel.getPreferredSize());
		thirdLabel.setSize(thirdLabel.getPreferredSize());

		BorderItemLocator locator = findBorderItemLocator(hostFigure);

		int positionPadding = hostFigure.getBounds().height / 3;
		int paddingWE = 13;
		int paddingNS = 8;

		// use WEST as default
		int side = PositionConstants.WEST;
		if (locator != null) {
			side = locator.getCurrentSideOfParent();
		}

		// position the label
		if (side == PositionConstants.NORTH) {
			secondPosition.y -= secondLabel.getSize().height + paddingNS
					+ positionPadding +2;
			secondPosition.x += (hostFigure.getBounds().width - secondLabel
					.getSize().width) / 2;

			
			firstPosition.y -= firstLabel.getSize().height + paddingNS;
			firstPosition.x += (hostFigure.getBounds().width - firstLabel
					.getSize().width) / 2;

			
			thirdPosition.y -= thirdLabel.getSize().height + paddingNS
					+ 2*positionPadding;
			thirdPosition.x += (hostFigure.getBounds().width - thirdLabel
					.getSize().width) / 2;
		}
		if (side == PositionConstants.SOUTH) {
			secondPosition.y += hostFigure.getBounds().height + paddingNS + positionPadding;
			secondPosition.x += (hostFigure.getBounds().width - secondLabel
					.getSize().width) / 2;

			firstPosition.y += hostFigure.getBounds().height + paddingNS;
			firstPosition.x += (hostFigure.getBounds().width - firstLabel
					.getSize().width) / 2;

			thirdPosition.y += hostFigure.getBounds().height + paddingNS
					+ 2*positionPadding;
			thirdPosition.x += (hostFigure.getBounds().width - thirdLabel
					.getSize().width) / 2;
		}

		if (side == PositionConstants.WEST) {
			secondPosition.x -= secondLabel.getSize().width + paddingWE;
			secondPosition.y += (hostFigure.getBounds().height - secondLabel
					.getSize().height) / 2 - 1;

			firstPosition.x -= firstLabel.getSize().width + paddingWE;
			firstPosition.y += (hostFigure.getBounds().height - firstLabel
					.getSize().height) / 2 - positionPadding;

			thirdPosition.x -= thirdLabel.getSize().width + paddingWE;
			thirdPosition.y += (hostFigure.getBounds().height - thirdLabel
					.getSize().height) / 2 + positionPadding;
		}

		if (side == PositionConstants.EAST) {
			secondPosition.x += hostFigure.getBounds().width + paddingWE;
			secondPosition.y += (hostFigure.getBounds().height - secondLabel
					.getSize().height) / 2 - 2;

			firstPosition.x +=  hostFigure.getBounds().width + paddingWE;
			firstPosition.y += (hostFigure.getBounds().height - firstLabel
					.getSize().height) / 2 - positionPadding;

			thirdPosition.x +=  hostFigure.getBounds().width + paddingWE;
			thirdPosition.y += (hostFigure.getBounds().height - thirdLabel
					.getSize().height) / 2 + positionPadding;
		}

		firstLabel.setLocation(firstPosition);
		secondLabel.setLocation(secondPosition);
		thirdLabel.setLocation(thirdPosition);

	}

	private void updateText() {

		SinglePortVariable modelElement = getModelElement();

		if (modelElement != null) {
			if (getPostionConstraint(modelElement,
					MultiPortPositionConstraintType.FIRST) != null)
				firstLabel.setText(GUILLEMET_CLOSE+"first"+GUILLEMET_OPEN);

			else
				firstLabel.setText("");

			if (getPostionConstraint(modelElement,
					MultiPortPositionConstraintType.LAST) != null)
				lastLabel.setText(GUILLEMET_CLOSE+"last"+GUILLEMET_OPEN);
			else
				lastLabel.setText("");

			nameLabel.setText(modelElement.getName());
		}

		firstLabel.setSize(firstLabel.getPreferredSize());
		nameLabel.setSize(nameLabel.getPreferredSize());
		lastLabel.setSize(lastLabel.getPreferredSize());

		updatePosition();

	}

	protected WrappingLabel getFirstLabel() {
		SinglePortVariable modelElement = getModelElement();

		if (getPostionConstraint(modelElement,
				MultiPortPositionConstraintType.FIRST) != null)
			return firstLabel;

		if (!(modelElement.getName() == null || modelElement.getName().equals(
				"")))
			return nameLabel;

		if (getPostionConstraint(modelElement,
				MultiPortPositionConstraintType.LAST) != null)
			return lastLabel;

		return firstLabel;
	}

	protected WrappingLabel getSecondLabel() {
		SinglePortVariable modelElement = getModelElement();

		if (getPostionConstraint(modelElement,
				MultiPortPositionConstraintType.FIRST) == null)
			return firstLabel;

		if (getPostionConstraint(modelElement,
				MultiPortPositionConstraintType.LAST) == null)
			return lastLabel;

		return nameLabel;

	}

	protected WrappingLabel getThirdLabel() {
		SinglePortVariable modelElement = getModelElement();

		if (getPostionConstraint(modelElement,
				MultiPortPositionConstraintType.LAST) != null)
			return lastLabel;

		if (!(modelElement.getName() == null || modelElement.getName().equals("")) && getPostionConstraint(modelElement,
				MultiPortPositionConstraintType.FIRST) != null)
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
