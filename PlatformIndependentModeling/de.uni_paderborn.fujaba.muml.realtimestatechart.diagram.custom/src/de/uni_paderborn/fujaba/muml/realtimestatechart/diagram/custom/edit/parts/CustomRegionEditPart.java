package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.edit.parts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionEditPart;

public class CustomRegionEditPart extends RegionEditPart {

	public CustomRegionEditPart(View view) {
		super(view);
	}
//
//	protected IFigure createNodeShape() {
//		RegionFigure regionFigure = (RegionFigure) super.createNodeShape();
//		regionFigure.getFigureStatechartVariablesLabel().setAlignment(
//				PositionConstants.RIGHT);
//		regionFigure.getFigureStatechartVariablesLabel().setTextJustification(
//				PositionConstants.RIGHT);
//
//		regionFigure.getFigureStatechartVariablesLabel().setTextWrap(true);
//
//		
//		primaryShape = regionFigure;
//		return regionFigure;
//	}

	private Region getRegion() {
		return (Region) getNotationView().getElement();
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {

		if (notification.getFeature() == RealtimestatechartPackage.Literals.PRIORITIZED_ELEMENT__PRIORITY) {
			Region region = (Region) notification.getNotifier();
			State parentState = region.getParentState();
			List<Region> regions = new ArrayList<Region>(parentState.getEmbeddedRegions());
			Collections.sort(regions, new Comparator<Region>() {
				@Override
				public int compare(Region lhs, Region rhs) {
					return lhs.getPriority() - rhs.getPriority();
				}
			});
			Command command = SetCommand.create(
									getEditingDomain(),
									parentState,
									RealtimestatechartPackage.Literals.STATE__EMBEDDED_REGIONS,
									regions);
			getEditingDomain().getCommandStack().execute(command);
		}

		super.handleNotificationEvent(notification);
	}

}
