package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionFujabaRealtimeStatechartCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.policies.FreeformLayerCanonicalEditPolicy;

public class CustomRegionFujabaRealtimeStatechartCompartmentEditPart extends
		RegionFujabaRealtimeStatechartCompartmentEditPart {

	public CustomRegionFujabaRealtimeStatechartCompartmentEditPart(View view) {
		super(view);
	}

	@Override
	public void refresh() {
		super.refresh();

		FreeformLayerCanonicalEditPolicy policy = ((FreeformLayerCanonicalEditPolicy) getRoot()
				.getContents().getEditPolicy(EditPolicyRoles.CANONICAL_ROLE));
		policy.refresh();
	}
}
