package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PolylineShape;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;

import de.uni_paderborn.fujaba.muml.common.figures.PolyarcFigure;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.State;

public class StateBehaviour {

	private PolyarcFigure initialStateArc;
	private PolylineShape initialStateArrow;
	private RectangleFigure stateContainer;
	private Ellipse initialStateEllipse;
	private RectangleFigure innerContainer;

	public void handleNotificationEvent(Notification notification) {

		Object feature = notification.getFeature();
		if (feature instanceof EStructuralFeature) {
			EStructuralFeature structuralFeature = (EStructuralFeature) feature;
			if (structuralFeature.getContainerClass() == State.class) {
				int featureID = notification.getFeatureID(State.class);
				switch (featureID) {
				case RealtimestatechartPackage.STATE__INITIAL:
					setInitialState(notification.getNewBooleanValue());
					break;
				case RealtimestatechartPackage.STATE__FINAL:
					setFinalState(notification.getNewBooleanValue());
					break;
				}
			}
		}
	}

	public void setInitialState(boolean initialState) {
		initialStateArrow.setVisible(initialState);
		initialStateArc.setVisible(initialState);
		MarginBorder marginBorder;
		if (initialState) {
			marginBorder = new MarginBorder(13, 0, 0, 0);
		} else {
			marginBorder = new MarginBorder(0, 0, 0, 0);
		}
		stateContainer.setBorder(marginBorder);
		initialStateEllipse.setVisible(initialState);
	}

	public void setFinalState(boolean finalState) {
		MarginBorder marginBorder;
		if (finalState) {
			marginBorder = new MarginBorder(4, 4, 4, 4);
		} else {
			marginBorder = new MarginBorder(0, 0, 0, 0);
		}
		innerContainer.setBorder(marginBorder);
	}

	public void setStateInnerFigures(IMapMode mapMode, PolyarcFigure initialStateArc,
			PolylineShape initialStateArrow, RectangleFigure stateContainer,
			Ellipse initialStateEllipse, RectangleFigure innerContainer) {
		this.initialStateArc = initialStateArc;
		this.initialStateArrow = initialStateArrow;
		this.stateContainer = stateContainer;
		this.initialStateEllipse = initialStateEllipse;
		this.innerContainer = innerContainer;

		PolylineShape fFigureInitialStateArc = initialStateArc;
		fFigureInitialStateArc.addPoint(new Point(mapMode.DPtoLP(13),
				mapMode.DPtoLP(9)));
		fFigureInitialStateArc.addPoint(new Point(mapMode.DPtoLP(30),
				mapMode.DPtoLP(16)));

	}

}
