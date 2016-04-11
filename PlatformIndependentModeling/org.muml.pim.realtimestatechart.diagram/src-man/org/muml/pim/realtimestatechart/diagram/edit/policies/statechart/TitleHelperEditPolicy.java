package org.muml.pim.realtimestatechart.diagram.edit.policies.statechart;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.muml.core.common.edit.policies.NotifyingGraphicalEditPolicy;
import org.muml.pim.realtimestatechart.diagram.edit.parts.ClockConstraintEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.SynchronizationChannelEditPart;

public class TitleHelperEditPolicy extends NotifyingGraphicalEditPolicy {

	@Override
	public void activate() {
		super.activate();
		updateTitle();
	}

	@Override
	protected void addListeners() {
		super.addListeners();
		EObject element = getSemanticElement();
		if (element != null && element.eContainer() != null) {
			addNotificationListener(element.eContainer());
		}
	}
	private void updateTitle() {
		IFigure figure = ((GraphicalEditPart)getHost()).getContentPane();
		if (figure instanceof ClockConstraintEditPart.StateItemFigure) {
			((ClockConstraintEditPart.StateItemFigure) figure).getFigureStatetemBoldLabel().setText(isFirst() ? "invariant" : "");
		} else if (figure instanceof SynchronizationChannelEditPart.StateItemFigure && isFirst()) {
			((SynchronizationChannelEditPart.StateItemFigure) figure).getFigureStatetemBoldLabel().setText(isFirst() ? "channel" : "");
		}
	}

	private boolean isFirst() {
		return getHost().getParent() != null && !getHost().getParent().getChildren().isEmpty() && getHost().getParent().getChildren().get(0) == getHost();	
//		EObject element = getSemanticElement();
//		if (element != null) {
//			if (!element.eContainingFeature().isMany()) {
//				return true;
//			}
//			Collection<?> siblings = ((Collection<?>)element.eContainer().eGet(element.eContainingFeature()));
//			if (!siblings.isEmpty() && siblings.iterator().next() == element) {
//				return true;
//			}
//		}
//		return false;
	}
	@Override
	public void handleNotificationEvent(Notification notification) {
		updateTitle();
	}
}
