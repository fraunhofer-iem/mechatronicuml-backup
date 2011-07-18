package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineShape;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.common.figures.PolyarcFigure;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart;

public class CustomStateEditPart extends StateEditPart {
	private StateBehaviour stateBehaviour = new StateBehaviour();

	public CustomStateEditPart(View view) {
		super(view);
	}

	protected IFigure createNodeShape() {
		State state = (State) getNotationView().getElement();
		StateFigure stateFigure = new StateFigure();
		primaryShape = stateFigure;

		PolyarcFigure initialStateArc = stateFigure.getFigureInitialStateArc();
		PolylineShape initialStateArrow = stateFigure
				.getFigureInitialStateArrow();
		stateBehaviour.setStateInnerFigures(getMapMode(), initialStateArc,
				initialStateArrow, stateFigure.getFigureStateContainer(),
				stateFigure.getFigureInitialStateEllipse(),
				stateFigure.getFigureInnerContainer());
		stateBehaviour.setInitialState(state.isInitial());
		stateBehaviour.setFinalState(state.isFinal());
		return primaryShape;
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		stateBehaviour.handleNotificationEvent(notification);

		super.handleNotificationEvent(notification);
	}
}
