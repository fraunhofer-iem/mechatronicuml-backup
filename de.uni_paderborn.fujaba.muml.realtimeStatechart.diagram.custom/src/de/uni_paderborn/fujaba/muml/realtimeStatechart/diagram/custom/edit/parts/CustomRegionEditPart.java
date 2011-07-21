package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionEditPart;

public class CustomRegionEditPart extends RegionEditPart {

	public CustomRegionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new CustomRegionFigure();
	}

	public class CustomRegionFigure extends RegionFigure {

		public CustomRegionFigure() {
			super();
			getFigureRegionVariablesLabel().setAlignment(
					PositionConstants.RIGHT);
			getFigureRegionVariablesLabel().setTextJustification(
					PositionConstants.RIGHT);
		}
	}

//	@Override
//	protected void handleNotificationEvent(Notification notification) {
//		Object feature = notification.getFeature();
//		if (feature instanceof EStructuralFeature) {
//			EStructuralFeature structuralFeature = (EStructuralFeature) feature;
//			if (Region.class.isAssignableFrom(structuralFeature.getContainerClass())) {
//				int featureID = notification.getFeatureID(Region.class);
//				if (featureID == RealtimestatechartPackage.REGION__TRANSITIONS) {
//					Region region = (Region) getNotationView().getElement();
//					FujabaRealtimeStatechart statechart = region
//							.getStatechart();
//					// if (notification.getOldValue() == sourceElement
//					// || notification.getOldValue() == targetElement) {
//					List<CanonicalEditPolicy> editPolicies = CanonicalEditPolicy
//							.getRegisteredEditPolicies(statechart);
//					for (CanonicalEditPolicy editPolicy : editPolicies) {
//						editPolicy.refresh();
//					}
//					// }
//
//				}
//			}
//		}
//		super.handleNotificationEvent(notification);
//	}

}
