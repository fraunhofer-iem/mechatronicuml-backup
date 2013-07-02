package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.edit.parts;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.edit.commands.CustomTransitionCreateCommand;
import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.edit.commands.CustomTransitionReorientCommand;
import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryPointEditPart;

public class CustomEntryPointEditPart extends EntryPointEditPart {

	public CustomEntryPointEditPart(View view) {
		super(view);
	}

	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(25, 25) {

			@Override
			public ConnectionAnchor getConnectionAnchor(String terminal) {
				return createDefaultAnchor();
			}

			@Override
			public ConnectionAnchor createDefaultAnchor() {
				return new EllipseAnchor(this);
			}
		};

		// FIXME: workaround for #154536
		result.getBounds().setSize(result.getPreferredSize());

		return result;
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		removeEditPolicy(EditPolicyRoles.SEMANTIC_ROLE);
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.policies.EntryPointItemSemanticEditPolicy() {

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
							return getGEFWrapper(new CustomTransitionCreateCommand(req, req.getSource(), req.getTarget()));
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
