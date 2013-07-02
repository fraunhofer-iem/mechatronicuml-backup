package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.edit.parts;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.common.edit.policies.statechart.StateEditPolicy;
import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateEditPart;

public class CustomStateEditPart extends StateEditPart {

	public CustomStateEditPart(View view) {
		super(view);
	}

	@Override
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure plate = new DefaultSizeNodeFigure(40, 40) {

			public PointList getPolygonPoints() {
				StateEditPolicy stateEditPolicy = (StateEditPolicy) getEditPolicy(de.uni_paderborn.fujaba.muml.common.edit.policies.EditPolicyRoles.STATE_VISUALIZATION_ROLE);
				if (stateEditPolicy != null) {
					return stateEditPolicy.getPolygonPoints(this);
				}
				return super.getPolygonPoints();
			}
		};
		plate.setMinimumSize(new Dimension(0, 0));
		return plate;
	}

}
