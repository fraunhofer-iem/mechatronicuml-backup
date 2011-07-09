package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PolylineShape;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart;

public class CustomStateEditPart extends StateEditPart {

	public CustomStateEditPart(View view) {
		super(view);
	}

	protected IFigure createNodeShape() {
		State state = (State) getNotationView().getElement();
		return primaryShape = new CustomStateFigure(state.isInitial(), state.isFinal());
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {

		Object feature = notification.getFeature();
		if (feature instanceof EStructuralFeature) {
			EStructuralFeature structuralFeature = (EStructuralFeature) feature;
			if (structuralFeature.getContainerClass() == State.class) {
				int featureID = notification.getFeatureID(State.class);
				switch (featureID) {
				case RealtimestatechartPackage.STATE__INITIAL:
					((CustomStateFigure)primaryShape).setInitial(notification.getNewBooleanValue());
					break;
				case RealtimestatechartPackage.STATE__FINAL:
					((CustomStateFigure)primaryShape).setFinal(notification.getNewBooleanValue());
					break;
				}
			}
		}

		super.handleNotificationEvent(notification);
	}

	public class CustomStateFigure extends StateEditPart.StateFigure {
		
		public CustomStateFigure(boolean initialState, boolean finalState) {
			super();
			initializeArc();
			setInitial(initialState);
			setFinal(finalState);
		}
		
		protected void initializeArc() {
			PolylineShape fFigureInitialStateArc = getFigureInitialStateArc();
			fFigureInitialStateArc.addPoint(new Point(getMapMode().DPtoLP(13),
					getMapMode().DPtoLP(6)));
			fFigureInitialStateArc.addPoint(new Point(
					getMapMode().DPtoLP(30), getMapMode().DPtoLP(13)));
		}

		@Override
		public void paint(Graphics graphics) {
			// TODO Auto-generated method stub
			super.paint(graphics);
		}

		public void setInitial(boolean initialState) {
			getFigureInitialStateArrow().setVisible(initialState);
			getFigureInitialStateArc().setVisible(initialState);
			MarginBorder marginBorder;
			if (initialState) {
				marginBorder = new MarginBorder(13, 0, 0, 0);
			} else {
				marginBorder = new MarginBorder(0, 0, 0, 0);
			}
			getFigureStateContainer().setBorder(marginBorder);
			getFigureInitialStateEllipse().setVisible(initialState);
		}
		
		public void setFinal(boolean finalState) {
			MarginBorder marginBorder;
			if (finalState) {
				marginBorder = new MarginBorder(4, 4, 4, 4);
			} else {
				marginBorder = new MarginBorder(0, 0, 0, 0);
			}
			getFigureInnerContainer().setBorder(marginBorder);
		}

	}

}
