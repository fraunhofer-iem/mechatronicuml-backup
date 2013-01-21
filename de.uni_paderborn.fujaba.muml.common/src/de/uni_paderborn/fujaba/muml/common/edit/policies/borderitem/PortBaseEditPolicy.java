package de.uni_paderborn.fujaba.muml.common.edit.policies.borderitem;

import org.eclipse.draw2d.LayoutListener;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;

import de.uni_paderborn.fujaba.muml.common.edit.policies.borderitem.layout.DefaultLayoutListener;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.model.valuetype.NaturalNumber;
import de.uni_paderborn.fujaba.muml.model.valuetype.Range;

/**
 * Base edit policy for all border items that use the CustomPortFigure. Provides
 * handling model notifications and updating the port figure accordingly. This
 * base implementation does not depend on any semantic classes, but subclasses
 * should override handleNotificationEvent() and call update*() methods.
 * 
 * @author bingo
 * 
 */
public class PortBaseEditPolicy extends BorderItemEditPolicy{

	public void activate() {
		super.activate();
		updatePortType();
		updateCardinality();
	}

	public LayoutListener createContainerLayoutListener() {
		return new DefaultLayoutListener(getBorderItemEditPart()) {
			@Override
			protected void sideChanged(int side) {
				getPortFigure().setPortSide(side);
			}
		};
	}

	protected void updateCardinality() {
		getPortFigure().setMulti(false);
		getPortFigure().setMandatory(true);
	}

	protected void updatePortType() {
		getPortFigure().setPortKindAndPortType(
				CustomPortFigure.PortKind.CONTINUOUS,
				CustomPortFigure.PortType.NONE);
	}

	public CustomPortFigure getPortFigure() {
		return (CustomPortFigure) getContentPane();
	}

	// TODO: Not yet used:
	/**
	 * The Port's Node Plate to use. It defines the size to use and is
	 * responsible to return custom PolygonPoints, that help connecting
	 * Connections at the right Point.
	 * 
	 * @return The Port's Node Plate to use.
	 */
	public NodeFigure createNodePlate() {
		// Copied from generated PortEditPart.java.
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(24, 24) {
			public PointList getPolygonPoints() {
				PointList customPolygonPoints = getPortFigure()
						.getCustomPolygonPoints(getHandleBounds());
				if (customPolygonPoints != null) {
					return customPolygonPoints;
				}
				return super.getPolygonPoints();
			}
		};

		// workaround for #154536
		result.getBounds().setSize(result.getPreferredSize());
		return result;
	}

	/**
	 * Convenience method to use a range as cardinality
	 */
	protected void setCardinality(Range cardinality) {
		if (cardinality == null) {
			return;
		}

		boolean isMulti = false, mandatory = false;
		NaturalNumber upperBound = cardinality.getUpperBound();
		if (upperBound != null
				&& (upperBound.isInfinity() || upperBound.getValue() > 1)) {
			isMulti = true;
		}
		NaturalNumber lowerBound = cardinality.getLowerBound();

		if (lowerBound != null
				&& (lowerBound.isInfinity() || lowerBound.getValue() > 0)) {
			mandatory = true;
		}
		getPortFigure().setMulti(isMulti);
		getPortFigure().setMandatory(mandatory);
	}
}
