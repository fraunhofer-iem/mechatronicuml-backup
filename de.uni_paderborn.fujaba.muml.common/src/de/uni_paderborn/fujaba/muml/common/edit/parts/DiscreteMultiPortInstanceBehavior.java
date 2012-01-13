package de.uni_paderborn.fujaba.muml.common.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutListener;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.internal.figures.BorderItemContainerFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;

import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortKind;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortType;

public class DiscreteMultiPortInstanceBehavior extends
		AbstractPortInstanceBehavior {

	public DiscreteMultiPortInstanceBehavior(GraphicalEditPart editPart) {
		super(editPart);
	}

	public void updatePortType() {
		// Do not visualize it
	}

	public void updateCardinality() {
		// Do not visualize it
	}

	@Override
	public PortKind getPortKind() {
		return CustomPortFigure.PortKind.DISCRETE;
	}

	@Override
	public PortType getPortType() {
		return CustomPortFigure.PortType.NONE;
	}

	/**
	 * Creates the container layout listener.
	 * 
	 * @return the container layout listener.
	 */
	public LayoutListener createContainerLayoutListener() {

		/**
		 * A LayoutListener that listens to changes in the container's layout.
		 * After the ports are layouted, we check at which side they are, to
		 * rotate the compartment.
		 * 
		 */
		return new LayoutListener.Stub() {

			/**
			 * Rotate the port's compartment according to the side that the port
			 * currently is at.
			 */
			@Override
			public void postLayout(IFigure container) {
//				IBorderItemLocator borderItemLocator = ((AbstractBorderItemEditPart) editPart)
//						.getBorderItemLocator();
//				if (borderItemLocator != null) {
//					borderItemLocator.relocate(editPart.getFigure());
//					int side = borderItemLocator.getCurrentSideOfParent();
//					boolean vertical = side == PositionConstants.WEST
//							|| side == PositionConstants.EAST;
//					for (Object child : editPart.getChildren()) {
//						if (child instanceof AbstractGraphicalEditPart) {
//							IFigure figure = ((AbstractGraphicalEditPart) child)
//									.getFigure();
//							if (figure instanceof ResizableCompartmentFigure) {
//								ResizableCompartmentFigure result = (ResizableCompartmentFigure) figure;
//
//								LayoutManager layoutManager = result
//										.getContentPane().getLayoutManager();
//								if (layoutManager instanceof ConstrainedToolbarLayout) {
//									ConstrainedToolbarLayout constrainedToolbarLayout = (ConstrainedToolbarLayout) layoutManager;
//									boolean oldVerticalValue = !constrainedToolbarLayout.isHorizontal();
//									if (vertical != oldVerticalValue) {
//										constrainedToolbarLayout
//												.setVertical(vertical);
//										result.validate();
//									}
//								}
//							}
//						}
//					}
//				}
			}
		};
	}

}
