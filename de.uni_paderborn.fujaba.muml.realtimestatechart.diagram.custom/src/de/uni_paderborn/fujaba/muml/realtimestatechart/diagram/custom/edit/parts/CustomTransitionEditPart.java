package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.common.figures.TransitionPriorityDecoration;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.TransitionEditPart;

public class CustomTransitionEditPart extends TransitionEditPart {

	public CustomTransitionEditPart(View view) {
		super(view);
	}

	@Override
	public void activate() {
		super.activate();
		updatePriority();
		updateUrgent();
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		Object feature = notification.getFeature();
		if (RealtimestatechartPackage.Literals.PRIORITIZED_ELEMENT__PRIORITY
				.equals(feature)) {

			updatePriority();

		} else if (RealtimestatechartPackage.Literals.TRANSITION__SOURCE
				.equals(feature)) {
			updatePriority();
		} else if (RealtimestatechartPackage.Literals.TRANSITION__URGENT
				.equals(feature)) {
			updateUrgent();
		}

		super.handleNotificationEvent(notification);
	}

	private void updatePriority() {
		Transition transition = (Transition) getNotationView().getElement();
		CustomTransitionFigure figure = ((CustomTransitionFigure) getFigure());
		figure.setPriority(transition.getPriority());
		figure.showPriority(transition.getSource() instanceof State);
	}

	/**
	 * If a transition is urgent, then the line should be solid, else dashed.
	 * @since MUML 0.4
	 */
	private void updateUrgent() {
		Transition transition = (Transition) getNotationView().getElement();
		CustomTransitionFigure figure = ((CustomTransitionFigure) getFigure());
		if (transition.isUrgent()) {
			figure.setLineStyle(org.eclipse.swt.SWT.LINE_SOLID);
		} else {
			figure.setLineStyle(org.eclipse.swt.SWT.LINE_DASH);
		}
	}

	protected Connection createConnectionFigure() {
		return new CustomTransitionFigure();
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

		public void showPriority(boolean show) {
			getSourceDecoration().setVisible(show);
		}

	}

}
