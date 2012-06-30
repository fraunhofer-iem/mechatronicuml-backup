package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel7EditPart;

public class CustomRegionEditPart extends RegionEditPart {

	private RealtimeStatechart statechart = null;
	private AdapterImpl rtscAdapter = new AdapterImpl() {
		@Override
		public void notifyChanged(Notification notification) {
			handleNotificationEvent(notification);
		}
	};

	public CustomRegionEditPart(View view) {
		super(view);
	}

	protected IFigure createNodeShape() {
		RegionFigure regionFigure = (RegionFigure) super.createNodeShape();
		regionFigure.getFigureStatechartVariablesLabel().setAlignment(
				PositionConstants.RIGHT);
		regionFigure.getFigureStatechartVariablesLabel().setTextJustification(
				PositionConstants.RIGHT);

		primaryShape = regionFigure;
		return regionFigure;
	}

	private Region getRegion() {
		return (Region) getNotationView().getElement();
	}

	@Override
	public void activate() {
		super.activate();
		statechartChanged(getRegion().getStatechart());
	}

	@Override
	public void deactivate() {
		statechartChanged(null);
		super.deactivate();
	}

	private void statechartChanged(RealtimeStatechart newStatechart) {
		if (statechart != null) {
			statechart.eAdapters().remove(rtscAdapter);
		}

		statechart = newStatechart;

		if (statechart != null) {
			statechart.eAdapters().add(rtscAdapter);
		}
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		Object feature = notification.getFeature();
		if (RealtimestatechartPackage.Literals.REGION__STATECHART
				.equals(feature)) {
			statechartChanged((RealtimeStatechart) notification.getNewValue());
		} else if (notification.getNotifier() instanceof RealtimeStatechart) {
			for(Object child : getChildren()) {
				if (child instanceof WrappingLabel7EditPart) {
					WrappingLabel7EditPart editPart = (WrappingLabel7EditPart) child;
					editPart.refresh();
				}
			}
		}

		super.handleNotificationEvent(notification);
	}
}
