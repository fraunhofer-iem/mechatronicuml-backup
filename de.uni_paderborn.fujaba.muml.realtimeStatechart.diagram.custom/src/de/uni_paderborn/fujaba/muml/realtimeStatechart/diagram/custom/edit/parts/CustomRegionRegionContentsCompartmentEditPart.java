package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionRegionContentsCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartmentEditPart;

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

	//
	// @Override
	// protected void createDefaultEditPolicies() {
	// super.createDefaultEditPolicies();
	// removeEditPolicy(EditPolicyRoles.SEMANTIC_ROLE);
	// installEditPolicy(
	// EditPolicyRoles.SEMANTIC_ROLE,
	// new CustomRegionRegionContentsCompartmentItemSemanticEditPolicy());
	// }

	@Override
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		LayoutManager layoutManager = result.getContentPane()
				.getLayoutManager();
		if (layoutManager instanceof ConstrainedToolbarLayout) {
			ConstrainedToolbarLayout constrainedToolbarLayout = (ConstrainedToolbarLayout) layoutManager;
			constrainedToolbarLayout.setStretchMajorAxis(true);
			constrainedToolbarLayout.setStretchMinorAxis(true);
		}
		return result;

	}

}
