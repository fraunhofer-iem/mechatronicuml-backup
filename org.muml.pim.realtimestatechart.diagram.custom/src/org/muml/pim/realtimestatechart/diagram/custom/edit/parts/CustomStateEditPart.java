package org.muml.pim.realtimestatechart.diagram.custom.edit.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.common.edit.policies.statechart.StateEditPolicy;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.Region;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.diagram.custom.edit.policies.BorderItemCreationEditPolicy;
import org.muml.pim.realtimestatechart.diagram.edit.parts.StateEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.StateRegionCompartmentEditPart;
import org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry;

public class CustomStateEditPart extends StateEditPart {

	public CustomStateEditPart(View view) {
		super(view);
	}

	@Override
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure plate = new DefaultSizeNodeFigure(40, 40) {

			public PointList getPolygonPoints() {
				StateEditPolicy stateEditPolicy = (StateEditPolicy) getEditPolicy(org.muml.pim.common.edit.policies.EditPolicyRoles.STATE_VISUALIZATION_ROLE);
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
	protected void handleNotificationEvent(Notification notification) {
		if (notification.getFeature() == RealtimestatechartPackage.Literals.STATE__EMBEDDED_REGIONS && notification.getEventType() == Notification.MOVE) {
			// #72: Reorder notation views when region order changes, to force re-ordering in the editor; also see comparator in CustomStateRegionCompartmentEditPart
			State state = (State) resolveSemanticElement();
			View regionCompartment = getChildView(getNotationView(), StateRegionCompartmentEditPart.VISUAL_ID);
			if (regionCompartment != null) {
				List<View> orderedViews = new ArrayList<View>();
				for (Region region : state.getEmbeddedRegions()) {
					for (Object child : regionCompartment.getPersistedChildren()) {
						View childView = (View) child;
						if (childView.getElement() == region) {
							orderedViews.add(childView);
							break; // break inner loop
						}
					}
				}
				getEditingDomain().getCommandStack().execute(SetCommand.create(getEditingDomain(), regionCompartment, NotationPackage.Literals.VIEW__PERSISTED_CHILDREN, orderedViews));
			}
			
		}
		
		super.handleNotificationEvent(notification);
	}

	private static View getChildView(View view, int visualId) {
		List<View> views = getChildViews(view, visualId);
		if (!views.isEmpty()) {
			return views.get(0);
		}
		return null;
	}

	private static List<View> getChildViews(View view, int visualId) {
		List<View> childViews = new ArrayList<View>();
		String type = MumlVisualIDRegistry.getType(visualId);

		for (Object child : view.getChildren()) {
			View childView = (View) child;
			if (type.equals(childView.getType())) {
				childViews.add(childView);
			}
		}
	
		return childViews;
	}

	@Override
	protected void createDefaultEditPolicies() {
		// TODO Auto-generated method stub
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.CREATION_ROLE,
				new BorderItemCreationEditPolicy());
	}

}
