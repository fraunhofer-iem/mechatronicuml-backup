package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart;

public class CustomRealtimeStatechartEditPart extends
		RealtimeStatechartEditPart {
	private RealtimeStatechartBehavior statechartBehavior = new RealtimeStatechartBehavior();

	public CustomRealtimeStatechartEditPart(View view) {
		super(view);
	}

	@Override
	public void activate() {
		statechartBehavior.setEditPart(this);
		super.activate();
	}

	@Override
	public void deactivate() {
		statechartBehavior.setEditPart(null);
		super.deactivate();
	}

	@Override
	protected boolean addFixedChild(EditPart childEditPart) {
		boolean result = super.addFixedChild(childEditPart);
		statechartBehavior.afterAddFixedChild(childEditPart);
		return result;
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		if (RealtimestatechartPackage.Literals.REALTIME_STATECHART__HISTORY
				.equals(notification.getFeature())) {
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
		RealtimeStatechart statechart = (RealtimeStatechart) ((View) getModel())
				.getElement();
		getPrimaryShape().getFigureHistoryFigure().setVisible(
				statechart.isHistory());
	}
}
