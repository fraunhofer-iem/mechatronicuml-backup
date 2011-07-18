package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineShape;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.common.figures.PolyarcFigure;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.policies.CustomState2ItemSemanticEditPolicy;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.State2EditPart;

public class CustomState2EditPart extends State2EditPart {
	private StateBehaviour stateBehaviour = new StateBehaviour();

	public CustomState2EditPart(View view) {
		super(view);
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		removeEditPolicy(EditPolicyRoles.SEMANTIC_ROLE);
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CustomState2ItemSemanticEditPolicy());

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
