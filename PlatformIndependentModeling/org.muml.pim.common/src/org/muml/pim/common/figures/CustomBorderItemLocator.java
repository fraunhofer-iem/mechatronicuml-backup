package org.muml.pim.common.figures;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;

/**
 * This BorderItemLocator is able to handle a border item offset, which can be
 * different for each side.
 * 
 * @author bingo
 * 
 */
public class CustomBorderItemLocator extends BorderItemLocator {
	
	protected Dimension offsetTopLeft = new Dimension();
	protected Dimension offsetBottomRight = new Dimension();

	/**
	 * The preferred side determines placement of figure.
	 * 
	 * @param interval interval between border items used in collision resolving (must be > 0)
	 * @param parentFigure
	 */
	public CustomBorderItemLocator(int interval, IFigure parentFigure) {
		super(interval, parentFigure);
	}

	/**
	 * The preferred side determines placement of figure.
	 * 
	 * @param parentFigure
	 */
	public CustomBorderItemLocator(IFigure parentFigure) {
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
	public CustomBorderItemLocator(IFigure parentFigure, int preferredSide) {
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
	public CustomBorderItemLocator(IFigure parentFigure, int preferredSide, int interval) {
		super(parentFigure, preferredSide, interval);
	}
	
	/**
	 * The preferred location overrides the preferred side.
	 * 
	 * @param parentFigure
	 * @param constraint
	 */
	public CustomBorderItemLocator(IFigure borderItem, IFigure parentFigure,
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
	public CustomBorderItemLocator(IFigure borderItem, IFigure parentFigure,
			Rectangle constraint, int interval) {
		super(borderItem, parentFigure, constraint, interval);
	}

	@Override
	public void setBorderItemOffset(Dimension borderItemOffset) {
		super.setBorderItemOffset(borderItemOffset);
		offsetTopLeft = borderItemOffset;
		offsetBottomRight = borderItemOffset;
	}

	public void setBorderItemOffset(Dimension offsetTopLeft, Dimension offsetBottomRight) {
		this.offsetTopLeft = offsetTopLeft;
		this.offsetBottomRight = offsetBottomRight;
	}

	@Override
	protected Point getPreferredLocation(int side, IFigure borderItem) {
		// Copied from BorderItemLocator and changed to use offsetTopLeft and offsetBottomRight.
		Rectangle bounds = getParentBorder();
		int parentFigureWidth = bounds.width;
		int parentFigureHeight = bounds.height;
		int parentFigureX = bounds.x;
		int parentFigureY = bounds.y;
		int x = parentFigureX;
		int y = parentFigureY;

		Dimension borderItemSize = getSize(borderItem);

		if (side == PositionConstants.WEST) {
			x = parentFigureX - borderItemSize.width
				+ offsetTopLeft.width;
			y += parentFigureHeight / 2;
		} else if (side == PositionConstants.EAST) {
			x = parentFigureX + parentFigureWidth - offsetBottomRight.width;
			y += parentFigureHeight / 2;
		} else if (side == PositionConstants.NORTH) {
			y = parentFigureY - borderItemSize.height
				+ offsetTopLeft.height;
			x += parentFigureWidth / 2;
		} else if (side == PositionConstants.SOUTH) {
			x += parentFigureWidth / 2;
			y = parentFigureY + parentFigureHeight
				- offsetBottomRight.height;
		}
		return new Point(x, y);
	}

	@Override
	protected Point locateOnParent(Point suggestedLocation, int suggestedSide,
			IFigure borderItem) {
		// Copied from BorderItemLocator and changed to use offsetTopLeft and offsetBottomRight.
		Rectangle bounds = getParentBorder();
		int parentFigureWidth = bounds.width;
		int parentFigureHeight = bounds.height;
		int parentFigureX = bounds.x;
		int parentFigureY = bounds.y;
		Dimension borderItemSize = getSize(borderItem);
		int newX = suggestedLocation.x;
		int newY = suggestedLocation.y;
		int westX = parentFigureX - borderItemSize.width
			+ offsetTopLeft.width;
		int eastX = parentFigureX + parentFigureWidth
			- offsetBottomRight.width;
		int southY = parentFigureY + parentFigureHeight
			- offsetBottomRight.height;
		int northY = parentFigureY - borderItemSize.height
			+ offsetTopLeft.height;
		if (suggestedSide == PositionConstants.WEST) {
			if (suggestedLocation.x != westX) {
				newX = westX;
			}
			if (suggestedLocation.y < bounds.getTopLeft().y) {
				newY = northY + borderItemSize.height;
			} else if (suggestedLocation.y > bounds.getBottomLeft().y
				- borderItemSize.height) {
				newY = southY - borderItemSize.height;
			}
		} else if (suggestedSide == PositionConstants.EAST) {
			if (suggestedLocation.x != eastX) {
				newX = eastX;
			}
			if (suggestedLocation.y < bounds.getTopLeft().y) {
				newY = northY + borderItemSize.height;
			} else if (suggestedLocation.y > bounds.getBottomLeft().y
				- borderItemSize.height) {
				newY = southY - borderItemSize.height;
			}
		} else if (suggestedSide == PositionConstants.SOUTH) {
			if (suggestedLocation.y != southY) {
				newY = southY;
			}
			if (suggestedLocation.x < bounds.getBottomLeft().x) {
				newX = westX + borderItemSize.width;
			} else if (suggestedLocation.x > bounds.getBottomRight().x
				- borderItemSize.width) {
				newX = eastX - borderItemSize.width;
			}
		} else { // NORTH
			if (suggestedLocation.y != northY) {
				newY = northY;
			}
			if (suggestedLocation.x < bounds.getBottomLeft().x) {
				newX = westX + borderItemSize.width;
			} else if (suggestedLocation.x > bounds.getBottomRight().x
				- borderItemSize.width) {
				newX = eastX - borderItemSize.width;
			}
		}
		return new Point(newX, newY);
	}

}
