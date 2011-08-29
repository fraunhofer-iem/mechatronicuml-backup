package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.policies.CustomRegionFujabaRealtimeStatechartCompartmentItemSemanticEditPolicy;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionRegionContentsCompartmentEditPart;

public class CustomRegionRegionContentsCompartmentEditPart extends
		RegionRegionContentsCompartmentEditPart {

	@Override
	protected void handleNotificationEvent(Notification event) {

		// BEGIN: Bugfix (MechatronicUML)
		// TODO: Create Bug for this and reference its ID
		List<CanonicalEditPolicy> editPolicies = CanonicalEditPolicy
				.getRegisteredEditPolicies(this.getDiagramView().getElement());
		for (Iterator<CanonicalEditPolicy> it = editPolicies.iterator(); it
				.hasNext();) {
			CanonicalEditPolicy nextEditPolicy = it.next();
			nextEditPolicy.refresh();
		}
		// END: Bugfix
		
		super.handleNotificationEvent(event);
	}

	public CustomRegionRegionContentsCompartmentEditPart(View view) {
		super(view);
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		removeEditPolicy(EditPolicyRoles.SEMANTIC_ROLE);
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new CustomRegionFujabaRealtimeStatechartCompartmentItemSemanticEditPolicy());
	}

	//
	// @Override
	// public void refresh() {
	// super.refresh();
	//
	// FreeformLayerCanonicalEditPolicy policy =
	// ((FreeformLayerCanonicalEditPolicy) getRoot()
	// .getContents().getEditPolicy(EditPolicyRoles.CANONICAL_ROLE));
	// policy.refresh();
	// getRoot().getContents().refresh();
	// }

}
