package org.muml.core.common.figures;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;

public class CustomExternalLabelBorderItemLocator extends BorderItemLocator {
	
	
	/**
	 * The preferred side determines placement of figure.
	 * 
	 * @param interval interval between border items used in collision resolving (must be > 0)
	 * @param parentFigure
	 */
	public CustomExternalLabelBorderItemLocator(int interval, IFigure parentFigure) {
		super(interval, parentFigure);
	}

	/**
	 * The preferred side determines placement of figure.
	 * 
	 * @param parentFigure
	 */
	public CustomExternalLabelBorderItemLocator(IFigure parentFigure) {
		super(parentFigure);
	}

	/**
	 * The preferred side determines placement of figure.
	 * 
	 * @param parentFigure
	 * @param preferredSide
	 *            the preferred side of the parent figure on which to place this
	 *            border item as defined in {@link PositionConstants}
	 */
	public CustomExternalLabelBorderItemLocator(IFigure parentFigure, int preferredSide) {
		super(parentFigure, preferredSide);
	}
	
	/**
	 * The preferred side determines placement of figure.
	 * 
	 * @param parentFigure
	 * @param preferredSide
	 *            the preferred side of the parent figure on which to place this
	 *            border item as defined in {@link PositionConstants}
	 * @param interval interval between border items used in collision resolving (must be > 0)
	 */
	public CustomExternalLabelBorderItemLocator(IFigure parentFigure, int preferredSide, int interval) {
		super(parentFigure, preferredSide, interval);
	}
	
	/**
	 * The preferred location overrides the preferred side.
	 * 
	 * @param parentFigure
	 * @param constraint
	 */
	public CustomExternalLabelBorderItemLocator(IFigure borderItem, IFigure parentFigure,
			Rectangle constraint) {
		super(borderItem, parentFigure, constraint);
	}

	/**
	 * The preferred location overrides the preferred side.
	 * 
	 * @param parentFigure
	 * @param constraint
	 * @param interval interval between border items used in collision resolving (must be > 0)
	 */
	public CustomExternalLabelBorderItemLocator(IFigure borderItem, IFigure parentFigure,
			Rectangle constraint, int interval) {
		super(borderItem, parentFigure, constraint, interval);
	}
	
	

	@Override
	protected Point locateOnParent(Point suggestedLocation,
			int suggestedSide, IFigure borderItem) {
		return suggestedLocation;
	}

	@Override
	public Rectangle getValidLocation(Rectangle proposedLocation,
			IFigure borderItem) {
		return proposedLocation;
	}

}
