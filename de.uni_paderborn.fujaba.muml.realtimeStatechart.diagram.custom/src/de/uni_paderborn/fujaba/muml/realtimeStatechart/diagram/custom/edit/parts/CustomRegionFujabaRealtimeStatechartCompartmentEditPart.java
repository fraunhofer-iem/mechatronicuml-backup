package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.policies.CustomRegionFujabaRealtimeStatechartCompartmentItemSemanticEditPolicy;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionFujabaRealtimeStatechartCompartmentEditPart;

public class CustomRegionFujabaRealtimeStatechartCompartmentEditPart extends
		RegionFujabaRealtimeStatechartCompartmentEditPart {

	public CustomRegionFujabaRealtimeStatechartCompartmentEditPart(View view) {
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
