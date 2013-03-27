package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionEditPart;
import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartEditPart.StatechartFigure;

public class CustomRegionEditPart extends RegionEditPart {

	public CustomRegionEditPart(View view) {
		super(view);
	}

	protected IFigure createNodeShape() {
		RegionFigure regionFigure = (RegionFigure) super.createNodeShape();
		regionFigure.getFigureStatechartVariablesLabel().setAlignment(
				PositionConstants.RIGHT);
		regionFigure.getFigureStatechartVariablesLabel().setTextJustification(
				PositionConstants.RIGHT);

		regionFigure.getFigureStatechartVariablesLabel().setTextWrap(true);

		
		primaryShape = regionFigure;
		return regionFigure;
	}

	private Region getRegion() {
		return (Region) getNotationView().getElement();
	}



	@Override
	protected void handleNotificationEvent(Notification notification) {
		Object feature = notification.getFeature();
		if (RealtimestatechartPackage.Literals.REGION__EMBEDS_HISTORY_STATECHART
				.equals(feature)) {
			updateHistory();
		}

		super.handleNotificationEvent(notification);
	}

	@Override
	protected void refreshVisuals() {
		updateHistory();
		super.refreshVisuals();
	}

	private void updateHistory() {
		Region region = (Region) getRegion();
		RegionFigure regionFigure = getPrimaryShape();
		if (region != null && regionFigure != null) {
			regionFigure.getFigureHistoryFigure().setVisible(
					getRegion().isEmbedsHistoryStatechart());
		}
	}
}
