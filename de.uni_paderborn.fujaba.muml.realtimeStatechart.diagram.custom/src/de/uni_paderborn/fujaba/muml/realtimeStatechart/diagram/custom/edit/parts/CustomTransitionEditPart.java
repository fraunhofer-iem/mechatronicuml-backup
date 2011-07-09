package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.common.figures.TransitionPriorityDecoration;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Prioritizable;
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
		if (feature instanceof EStructuralFeature) {
			EStructuralFeature structuralFeature = (EStructuralFeature) feature;
			if (structuralFeature.getContainerClass() == Prioritizable.class) {
				int featureID = notification.getFeatureID(Prioritizable.class);
				if (featureID == RealtimestatechartPackage.TRANSITION__PRIORITY) {
					((CustomTransitionFigure) getFigure()).setPriority(transition.getPriority());
				}
			}
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
			getFigureTransitionDeadlineLabelFigure().setTextJustification(PositionConstants.CENTER);
		}

		public void setPriority(int priority) {
			TransitionPriorityDecoration priorityDecoration = (TransitionPriorityDecoration) getSourceDecoration();
			priorityDecoration.setPriority(priority);
		}
		
	}
	
	

}
