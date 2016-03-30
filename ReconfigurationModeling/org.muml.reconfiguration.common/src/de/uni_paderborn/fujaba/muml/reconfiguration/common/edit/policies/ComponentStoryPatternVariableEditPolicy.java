package de.uni_paderborn.fujaba.muml.reconfiguration.common.edit.policies;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ScalablePolygonShape;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.LineType;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.RGB;
import org.muml.core.common.edit.policies.EditPolicyUtils;
import org.muml.core.common.edit.policies.NotifyingGraphicalEditPolicy;
import org.storydriven.storydiagrams.patterns.BindingOperator;
import org.storydriven.storydiagrams.patterns.BindingSemantics;

import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPatternVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage;

/**
 * This edit policy updates the visualization of a
 * ComponentStoryPatternVariable.
 * 
 * The binding semantics decides if the figure is shown as optional (dashed) or
 * negative (strike-through).
 * 
 * Strike-through is implemented by adding a figure to the edit parts
 * content-pane, which looks like an X. For this to work okay, it is necessary
 * that the content-pane's root figure has a stack layout assigned.
 * 
 * Dashed outlines are implemented by setting the line style of the outline to
 * dashed.
 */
public class ComponentStoryPatternVariableEditPolicy extends
		NotifyingGraphicalEditPolicy {

	public static final RGB RGB_CHECK = new RGB(0, 0, 0);
	public static final RGB RGB_CREATE = new RGB(0, 192, 0);
	public static final RGB RGB_DESTROY = new RGB(192, 0, 0);

	/**
	 * This field stores if the X figure is currently added.
	 */
	private boolean negative = false;

	/**
	 * The X figure that is added to the host's content pane, if
	 * bindingSemantics are negative.
	 */
	private ScalableXFigure negativeFigure;

	/**
	 * Remembers if we already initialized the view.
	 */
	private boolean viewInitialized;

	/**
	 * Convenience method, is designed to be overriden by subclasses.
	 * 
	 * @return The ComponentStoryPatternVariable.
	 */
	protected ComponentStoryPatternVariable getComponentStoryPatternVariable() {
		return (ComponentStoryPatternVariable) getSemanticElement();
	}

	/**
	 * Initializes this edit policy.
	 */
	@Override
	public void activate() {
		super.activate();

		negativeFigure = createFigureNegative();

		// Initially show the correct visualization for negative
		BindingSemantics bindingSemantics = (BindingSemantics) getSemanticElement()
				.eGet(ComponentstorypatternPackage.Literals.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_SEMANTICS);
		setNegative(bindingSemantics == BindingSemantics.NEGATIVE);
	}

	/**
	 * Cleanup this edit policy, remove all modifications from the host's
	 * content pane.
	 */
	@Override
	public void deactivate() {
		// Remove all visualizations
		setNegative(false);
		negativeFigure = null;

		super.deactivate();
	}

	/**
	 * Creates a figure for the negative visualization; can be overridden.
	 * 
	 * @return The negative figure.
	 */
	protected ScalableXFigure createFigureNegative() {
		return new ScalableXFigure();
	}

	/**
	 * Update visualization on model changes.
	 */
	@Override
	public void handleNotificationEvent(Notification notification) {
		if (ComponentstorypatternPackage.Literals.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_SEMANTICS
				.equals(notification.getFeature())) {
			updateBindingSemantics((BindingSemantics) notification
					.getNewValue());
		} else if (ComponentstorypatternPackage.Literals.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_OPERATOR
				.equals(notification.getFeature())) {
			updateBindingOperator((BindingOperator) notification.getNewValue());
		} else if (NotationPackage.Literals.LINE_TYPE_STYLE__LINE_TYPE == notification
				.getFeature()) {

			// Some nasty EditParts do not refresh their primary shape; so we do
			// this always.
			int lineType = EditPolicyUtils.getLineType(getPrimaryView());
			IFigure contentPane = getContentPane();
			if (contentPane instanceof Shape) {
				Shape shape = (Shape) contentPane;
				shape.setLineStyle(lineType);
			}
		}

		// We abuse this notification event to initialize the view within a
		// write-enabled transaction.
		if (!viewInitialized) {
			initializeView();
		}

		super.handleNotificationEvent(notification);
	}

	protected void initializeView() {
		View view = getNotationView();

		if (view.getStyle(NotationPackage.Literals.LINE_TYPE_STYLE) == null) {
			view.createStyle(NotationPackage.Literals.LINE_TYPE_STYLE);
		}

		updateBindingOperator((BindingOperator) getSemanticElement()
				.eGet(ComponentstorypatternPackage.Literals.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_OPERATOR));
		updateBindingSemantics((BindingSemantics) getSemanticElement()
				.eGet(ComponentstorypatternPackage.Literals.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_SEMANTICS));

		viewInitialized = true;
	}

	/**
	 * Update visualization for a changed binding semantics.
	 * 
	 * @param bindingSemantics
	 *            The current value of binding semantics.
	 */
	protected void updateBindingSemantics(BindingSemantics bindingSemantics) {
		setNegative(bindingSemantics == BindingSemantics.NEGATIVE);
		setOptional(bindingSemantics == BindingSemantics.OPTIONAL);
	}

	/**
	 * Update view's foreground color depending on the binding operator.
	 * 
	 * @param bindingOperator
	 *            The current value of binding operator.
	 */
	protected void updateBindingOperator(BindingOperator bindingOperator) {
		// Set the view's color based on the bindingOperator value.
		final org.eclipse.swt.graphics.RGB lineRGB = getLineColor(bindingOperator);
		final View view = ((GraphicalEditPart) getHost()).getNotationView();

		getEditingDomain().getCommandStack().execute(new ChangeCommand(view) {

			@Override
			protected void doExecute() {

				ViewUtil.setStructuralFeatureValue(
						view,
						org.eclipse.gmf.runtime.notation.NotationPackage.Literals.LINE_STYLE__LINE_COLOR,
						org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities
								.RGBToInteger(lineRGB));

				ViewUtil.setStructuralFeatureValue(
						view,
						org.eclipse.gmf.runtime.notation.NotationPackage.Literals.FONT_STYLE__FONT_COLOR,
						org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities
								.RGBToInteger(lineRGB));
			}

		});
	}

	/**
	 * Gets the line color depending on the binding operator; can be overriden.
	 * 
	 * @return the line color
	 */
	protected RGB getLineColor(BindingOperator bindingOperator) {
		org.eclipse.swt.graphics.RGB lineRGB = RGB_CHECK;

		if (BindingOperator.CREATE.equals(bindingOperator)) {
			lineRGB = RGB_CREATE;
		} else if (BindingOperator.DESTROY.equals(bindingOperator)) {
			lineRGB = RGB_DESTROY;
		}
		return lineRGB;
	}

	/**
	 * Adds the X figure to the host's content pane, or removes it.
	 * 
	 * @param negative
	 *            Add or remove?
	 */
	private void setNegative(boolean negative) {
		if (negative != this.negative) {
			this.negative = negative;

			// Add or remove the negative figure from the content pane and its
			// layout
			IFigure contentPane = getContentPane();
			if (negative) {
				contentPane.add(negativeFigure);

			} else {
				contentPane.remove(negativeFigure);
				if (contentPane.getLayoutManager() != null) {
					contentPane.getLayoutManager().remove(negativeFigure);
				}
			}
		}
	}

	/**
	 * Makes the content pane figure dashed, if optional is <code>true</code>.
	 */
	private void setOptional(boolean optional) {
		// Make sure a LineTypeStyle is registered in the view.
		// Deactivated; we require one to be installed
		// registerLineTypeStyle();

		// Set LineTypeStyle for view
		final View view = ((GraphicalEditPart) getHost()).getNotationView();
		final LineType lineType = optional ? LineType.DASH_LITERAL
				: LineType.SOLID_LITERAL;
		getEditingDomain().getCommandStack().execute(new ChangeCommand(view) {
			@Override
			protected void doExecute() {
				// This also sends a notification which the PortBaseEditPolicy
				// receives.
				ViewUtil.setStructuralFeatureValue(view,
						NotationPackage.Literals.LINE_TYPE_STYLE__LINE_TYPE,
						lineType);
			}
		});

	}

	/**
	 * Convenience method.
	 * 
	 * @return The host's content pane.
	 */
	private IFigure getContentPane() {
		return ((GraphicalEditPart) getHost()).getContentPane();
	}

	/**
	 * The scalable figure that displays an X.
	 */
	public class ScalableXFigure extends ScalablePolygonShape {

		public ScalableXFigure() {
			setFill(false);
			setOutline(true);

			addPoint(new Point(0, 0));
			addPoint(new Point(2, 2));
			addPoint(new Point(1, 1));
			addPoint(new Point(2, 0));
			addPoint(new Point(0, 2));
		}

	}

	/**
	 * Convenience method to return the host's primary view.
	 * 
	 * @return primary view.
	 */
	protected View getPrimaryView() {
		return ((GraphicalEditPart) getHost()).getPrimaryView();
	}

}
