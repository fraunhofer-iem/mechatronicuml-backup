package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.common.figures.TransitionPriorityDecoration;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart;

public class CustomTransitionEditPart extends TransitionEditPart {

	public CustomTransitionEditPart(View view) {
		super(view);
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		Transition transition = (Transition) getNotationView().getElement();
		Object feature = notification.getFeature();
		if (RealtimestatechartPackage.Literals.PRIORITIZED_ELEMENT__PRIORITY
				.equals(feature)) {
			((CustomTransitionFigure) getFigure()).setPriority(transition
					.getPriority());
		}
		super.handleNotificationEvent(notification);
	}

	protected Connection createConnectionFigure() {
		CustomTransitionFigure transitionFigure = new CustomTransitionFigure();
		Transition transition = (Transition) getNotationView().getElement();
		transitionFigure.setPriority(transition.getPriority());
		return transitionFigure;
	}

	public class CustomTransitionFigure extends TransitionFigure {

		public CustomTransitionFigure() {
			super();
			getFigureTransitionDeadlineLabelFigure().setTextWrap(true);
			getFigureTransitionDeadlineLabelFigure().setTextJustification(
					PositionConstants.RIGHT);
		}

		public void setPriority(int priority) {
			TransitionPriorityDecoration priorityDecoration = (TransitionPriorityDecoration) getSourceDecoration();
			priorityDecoration.setPriority(priority);
		}

	}

}
