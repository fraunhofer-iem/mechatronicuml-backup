package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.edit.parts;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.common.edit.policies.statechart.StateEditPolicy;
import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.edit.commands.CustomTransitionCreateCommand;
import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.edit.commands.CustomTransitionReorientCommand;
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

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.SEMANTIC_ROLE);
		installEditPolicy(
				org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.policies.ExitPointItemSemanticEditPolicy() {

					protected Command getStartCreateRelationshipCommand(
							CreateRelationshipRequest req) {
						if (de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.Transition_4003 == req
								.getElementType()) {
							return getGEFWrapper(new CustomTransitionCreateCommand(
									req, req.getSource(), req.getTarget()));
						}
						return null;
					}

					protected Command getCompleteCreateRelationshipCommand(
							CreateRelationshipRequest req) {
						if (de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.Transition_4003 == req
								.getElementType()) {
							return getGEFWrapper(new CustomTransitionCreateCommand(
									req, req.getSource(), req.getTarget()));
						}
						return null;
					}

					protected Command getReorientRelationshipCommand(
							ReorientRelationshipRequest req) {
						switch (getVisualID(req)) {
						case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
							return getGEFWrapper(new CustomTransitionReorientCommand(
									req));
						}
						return super.getReorientRelationshipCommand(req);
					}
				});
	}

}
