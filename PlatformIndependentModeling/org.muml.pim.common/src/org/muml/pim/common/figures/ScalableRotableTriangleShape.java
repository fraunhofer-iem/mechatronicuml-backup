package org.muml.pim.common.figures;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.ScalablePolygonShape;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.geometry.Transform;

// TODO:  Maybe we should use the Decorator-Pattern, when multiple variants of functionality is needed.

/**
 * Renders a scaled, rotable polygon shape, whereas each group of three Points
 * are assumed to be one polygon. This way it is easy to display multiple
 * triangles that are not connected with each other.
 * 
 * @author bingo
 * 
 */
public class ScalableRotableTriangleShape extends ScalablePolygonShape {

	/**
	 * The List of triangular polygons.
	 */
	private List<PointList> triangles = null;

	/**
	 * The transformation to apply (currently only used for rotation).
	 */
	private Transform transform = new Transform();

	/**
	 * Fills all triangular polygons.
	 */
	protected void fillShape(Graphics graphics) {
		graphics.pushState();
		graphics.translate(getLocation());
		for (PointList scaledTrianglePoints : getTriangles(getRotatedPoints(getScaledPoints()))) {
			graphics.fillPolygon(scaledTrianglePoints);
		}
		graphics.popState();
	}

	/**
	 * Outlines all triangular polygons.
	 */
	protected void outlineShape(Graphics graphics) {
		graphics.pushState();
		graphics.translate(getLocation());
		for (PointList scaledTrianglePoints : getTriangles(getRotatedPoints(getScaledPoints()))) {
			graphics.drawPolygon(scaledTrianglePoints);
		}
		graphics.popState();
	}

	/**
	 * Rotates all points within the given PointList and moves them back into
	 * the origin.
	 * 
	 * @param points
	 *            the points to rotate.
	 * @return the rotated points.
	 */
	public PointList getRotatedPoints(PointList points) {
		// Don't modify the original PointList
		points = points.getCopy();

		// Transform each point
		for (int i = 0; i < points.size(); i++) {
			Point point = points.getPoint(i);
			point = transform.getTransformed(point);
			points.setPoint(point, i);
		}

		// Move Points into the origin.
		Point topLeft = points.getBounds().getTopLeft();
		points.translate(-topLeft.x, -topLeft.y);
		return points;
	}

	/**
	 * Get a List of Triangles that is created from the given PointList.
	 * 
	 * @param points
	 *            The PointList to triangulate.
	 * @return the List of Triangles.
	 */
	public List<PointList> getTriangles(PointList points) {
		if (triangles != null) {
			return triangles;
		}
		triangles = new LinkedList<PointList>();
		PointList triangle = null;
		for (int i = 0; i < points.size(); i++) {
			if ((i % 3) == 0) {
				triangle = new PointList();
				triangles.add(triangle);
			}
			triangle.addPoint(points.getPoint(i));
		}
		return triangles;
	}

	/**
	 * Sets the rotation to use in degrees.
	 * 
	 * @param degrees
	 *            rotation in degrees.
	 */
	public void setRotationInDegrees(double degrees) {
		invalidatePoints();
		transform.setRotation(degrees / 360.0 * Math.PI * 2);
	}

	/**
	 * Invalidates the cached triangles.
	 */
	protected void invalidatePoints() {
		triangles = null;
	}

	public void addPoint(Point pt) {
		invalidatePoints();
		super.addPoint(pt);
	}

	public void insertPoint(Point pt, int index) {
		invalidatePoints();
		super.insertPoint(pt, index);
	}

	public void removeAllPoints() {
		invalidatePoints();
		super.removeAllPoints();
	}

	public void removePoint(int index) {
		invalidatePoints();
		super.removePoint(index);
	}

	public void setStart(Point start) {
		invalidatePoints();
		super.setStart(start);
	}

	public void setEnd(Point end) {
		invalidatePoints();
		super.setEnd(end);
	}

	public void setPoint(Point pt, int index) {
		invalidatePoints();
		super.setPoint(pt, index);
	}

	public void setPoints(PointList points) {
		invalidatePoints();
		super.setPoints(points);
	}

	public void setBounds(Rectangle rect) {
		invalidatePoints();
		super.setBounds(rect);
	}

	public void setLineWidth(int w) {
		invalidatePoints();
		super.setLineWidth(w);
	}
}
