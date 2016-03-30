package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.edit.policies;

import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramRootEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapModeUtil;
import org.eclipse.gmf.runtime.notation.Shape;
import org.muml.common.edit.policies.NotifyingGraphicalEditPolicy;

import de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentStoryNode;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeEditPart.ComponentStoryNodeRoundedFigureForEach;

public class ComponentStoryNodeFigureEditPolicy extends NotifyingGraphicalEditPolicy {

	@Override
	public void handleNotificationEvent(Notification notification) {
		ComponentStoryNodeRoundedFigureForEach iconFigure = ((ComponentStoryNodeEditPart) getHost())
				.getPrimaryShape();

		Shape view = (Shape) ((ComponentStoryNodeEditPart) getHost())
				.getModel();
		ComponentStoryNode semanticModelElement = (ComponentStoryNode) view.getElement();

		setForEachVisuals(iconFigure, semanticModelElement.isForEach());
	}
	
	@Override
	public void activate() {
		ComponentStoryNodeRoundedFigureForEach iconFigure = ((ComponentStoryNodeEditPart) getHost())
				.getPrimaryShape();

		Shape view = (Shape) ((ComponentStoryNodeEditPart) getHost())
				.getModel();
		ComponentStoryNode semanticModelElement = (ComponentStoryNode) view.getElement();

		setForEachVisuals(iconFigure, semanticModelElement.isForEach());
		super.activate();
	}
	
	public static void setForEachVisuals(ComponentStoryNodeRoundedFigureForEach figure, boolean isForEach) {
		// Calculate new Margin for top and right.
		int marginTop = 0;
		int marginRight = 0;
		if (isForEach) {
			marginTop = 8;
			marginRight = 3;
		}

		// Calculate new preferred size, which is the original size
		// minus the margin.
		if (figure.getParent() != null) {
			Dimension preferredSize = figure.getParent().getPreferredSize()
					.getCopy();
			preferredSize.expand(-marginRight, -marginTop);

			// Set the new margin and the new preferred size.
			RoundedRectangle innerRectContainer = figure.getFigureInnerRoundedRectangleContainer();
			innerRectContainer.setBorder(new MarginBorder(marginTop, 0, 0,
					marginRight));
			innerRectContainer.setPreferredSize(preferredSize);
		}
	}

	protected IMapMode getMapMode() {
		RootEditPart root = getHost().getRoot();
		if (root instanceof DiagramRootEditPart) {
			DiagramRootEditPart dgrmRoot = (DiagramRootEditPart) root;
			return dgrmRoot.getMapMode();
		}

		return MapModeUtil.getMapMode();
	}

}
