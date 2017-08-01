package org.muml.pim.realtimestatechart.diagram.custom.edit.parts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.common.figures.TransitionPriorityDecoration;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.Region;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.pim.realtimestatechart.Vertex;
import org.muml.pim.realtimestatechart.diagram.edit.parts.TransitionEditPart;

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
//		if (RealtimestatechartPackage.Literals.PRIORITIZED_ELEMENT__PRIORITY
//				.equals(feature)) {
//
//			// Update priority visualization
//			updatePriority();
//
//		} else
		if (RealtimestatechartPackage.Literals.TRANSITION__SOURCE
				.equals(feature)) {
			updatePriority();
		} else if (RealtimestatechartPackage.Literals.TRANSITION__URGENT
				.equals(feature)) {
			updateUrgent();
		}

		super.handleNotificationEvent(notification);
	}

	private void updatePriority() {
		// Update visualiation
		Transition transition = (Transition) resolveSemanticElement();
		CustomTransitionFigure figure = ((CustomTransitionFigure) getFigure());
		if (transition == null || figure == null) {
			return;
		}

		figure.setPriority(transition.getPriority());
		figure.showPriority(transition.getSource() instanceof State);
		

		// Update order of outgoing transitions at source vertex
		Vertex sourceVertex = transition.getSource();
		List<Transition> transitions = new ArrayList<Transition>(sourceVertex.getOutgoingTransitions());
		Collections.sort(transitions, new Comparator<Transition>() {
			@Override
			public int compare(Transition lhs, Transition rhs) {
				return lhs.getPriority() - rhs.getPriority();
			}
		});
		Command command = SetCommand.create(
								getEditingDomain(),
								sourceVertex,
								RealtimestatechartPackage.Literals.VERTEX__OUTGOING_TRANSITIONS,
								transitions);
		getEditingDomain().getCommandStack().execute(command);
	}

	/**
	 * If a transition is urgent, then the line should be solid, else dashed.
	 * @since MUML 0.4
	 */
	private void updateUrgent() {
		Transition transition = (Transition) getNotationView().getElement();
		CustomTransitionFigure figure = ((CustomTransitionFigure) getFigure());
		if (transition == null || figure == null) {
			return;
		}
		
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
