package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.policies.State2ItemSemanticEditPolicy;

/**
 * @generated
 */
public class CustomState2ItemSemanticEditPolicy extends
		State2ItemSemanticEditPolicy {

	@Override
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
//
//		if (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4002 == req
//				.getElementType()) {
//			View parentView = ViewUtil.getContainerView((View) getHost()
//					.getModel());
//
//			return getGEFWrapper(new CustomTransition2CreateCommand(req,
//					req.getSource(), req.getTarget(),
//					(Region) parentView.getElement()));
//		}
		return super.getStartCreateRelationshipCommand(req);
	}

	@Override
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
//		if (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4002 == req
//				.getElementType()) {
//			View parentView = ViewUtil.getContainerView((View) getHost()
//					.getModel());
//			return getGEFWrapper(new CustomTransition2CreateCommand(req,
//					req.getSource(), req.getTarget(),
//					(Region) parentView.getElement()));
//		}
		return super.getCompleteCreateRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
//		switch (getVisualID(req)) {
//		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.Transition2EditPart.VISUAL_ID:
//
//			return getGEFWrapper(new CustomTransition2ReorientCommand(
//					req));
//		}
		return super.getReorientRelationshipCommand(req);
	}
}
