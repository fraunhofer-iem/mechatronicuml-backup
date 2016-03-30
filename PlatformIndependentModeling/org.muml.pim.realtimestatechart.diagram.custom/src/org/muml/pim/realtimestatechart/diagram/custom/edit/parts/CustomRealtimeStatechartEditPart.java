package org.muml.pim.realtimestatechart.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RealtimeStatechartEditPart;

public class CustomRealtimeStatechartEditPart extends
		RealtimeStatechartEditPart {

	public CustomRealtimeStatechartEditPart(View view) {
		super(view);
	}
	
	@Override
	protected IFigure createNodeShape() {
		StatechartFigure figure = (StatechartFigure) super.createNodeShape();
		figure.getFigureStatechartVariablesLabel().setTextWrap(true);
		return figure;
	}

	@Override
	public void activate() {
		super.activate();
		RealtimeStatechart statechart = (RealtimeStatechart) getNotationView()
				.getElement();
		if (statechart != null) {
			// updateHistory(statechart.isHistory());
			updateHistory(false);
		}
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
//		Object feature = notification.getFeature();
//		if (RealtimestatechartPackage.Literals.REALTIME_STATECHART__HISTORY
//				.equals(feature)) {
//			updateHistory(notification.getNewBooleanValue());
//		}
		super.handleNotificationEvent(notification);
	}

	private void updateHistory(boolean history) {
		getPrimaryShape().getFigureHistoryFigure().setVisible(history);
	}

}
