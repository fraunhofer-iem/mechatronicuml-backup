package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineShape;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.common.figures.PolyarcFigure;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart;

public class CustomStateEditPart extends StateEditPart {
	private StateBehavior stateBehavior = new StateBehavior();

	public CustomStateEditPart(View view) {
		super(view);
	}

	@Override
	protected NodeFigure createNodePlate() {
		return stateBehavior.createNodePlate();
	}

	@Override
	public void activate() {
		stateBehavior.setEditPart(this);
		super.activate();
	}

	@Override
	public void deactivate() {
		stateBehavior.setEditPart(null);
		super.deactivate();
	}

	@Override
	protected boolean addFixedChild(EditPart childEditPart) {
		boolean result = super.addFixedChild(childEditPart);
		stateBehavior.afterAddFixedChild(childEditPart);
		return result;
	}

	protected IFigure createNodeShape() {
		State state = (State) getNotationView().getElement();
		StateFigure stateFigure = new StateFigure();
		stateFigure.getFigureInitialStateEllipse().setBackgroundColor(ColorConstants.black);
		primaryShape = stateFigure;

		PolyarcFigure initialStateArc = stateFigure.getFigureInitialStateArc();
		PolylineShape initialStateArrow = stateFigure
				.getFigureInitialStateArrow();
		stateBehavior.setStateInnerFigures(getMapMode(), initialStateArc,
				initialStateArrow, stateFigure.getFigureStateContainer(),
				stateFigure.getFigureInitialStateEllipse(),
				stateFigure.getFigureInnerContainer());
		stateBehavior.setInitialState(state.isInitial());
		stateBehavior.setFinalState(state.isFinal());
		return primaryShape;
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		stateBehavior.handleNotificationEvent(notification);

		super.handleNotificationEvent(notification);
	}
}
