package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.figures.CustomHistoryFigure;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.FujabaRealtimeStatechartEditPart;

public class CustomFujabaRealtimeStatechartEditPart extends
		FujabaRealtimeStatechartEditPart {

	private static final int ELLIPSE_RADIUS = 20;

	private CustomHistoryFigure historyFigure;

	public CustomFujabaRealtimeStatechartEditPart(View view) {
		super(view);
	}

	@Override
	protected IFigure createFigure() {
		IFigure diagram = super.createFigure();
		historyFigure = new CustomHistoryFigure();
		historyFigure.setSize(ELLIPSE_RADIUS * 2, ELLIPSE_RADIUS * 2);
		diagram.add(historyFigure);
		FujabaRealtimeStatechart statechart = (FujabaRealtimeStatechart) getNotationView()
				.getElement();
		updateHistoryState(statechart.isHistory());
		return diagram;
	}

	@Override
	protected final void handleNotificationEvent(final Notification notification) {
		Object feature = notification.getFeature();
		if (feature instanceof EStructuralFeature) {
			EStructuralFeature structuralFeature = (EStructuralFeature) feature;
			if (structuralFeature.getContainerClass() == FujabaRealtimeStatechart.class) {
				int featureID = notification
						.getFeatureID(FujabaRealtimeStatechart.class);
				if (featureID == RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__HISTORY) {
					Object newState = notification.getNewValue();
					if (newState instanceof Boolean) {
						updateHistoryState((Boolean) newState);
					}
				}
			}
		}
		super.handleNotificationEvent(notification);
	}

	private void updateHistoryState(boolean newState) {
		historyFigure.setVisible(newState);
	}

}
