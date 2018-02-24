package org.muml.pim.realtimestatechart.design.edit.part;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.ui.edit.api.part.AbstractNotSelectableShapeNodeEditPart;
import org.eclipse.sirius.diagram.ui.edit.api.part.IStyleEditPart;
import org.eclipse.sirius.diagram.ui.tools.api.figure.AirStyleDefaultSizeNodeFigure;

public class MyStyleEditPart extends AbstractNotSelectableShapeNodeEditPart implements IStyleEditPart {
	
	public static final String STYLE_ID = "org.muml.pim.realtimestatechart.design.edit.part.MY_STYLE_ID";
	protected IFigure contentPane;
	protected ImageFigure primaryShape;

	public MyStyleEditPart(View view) {
		super(view);
	}

	public DragTracker getDragTracker(Request request) {
		return getParent().getDragTracker(request);
	}

	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new XYLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	private NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new AirStyleDefaultSizeNodeFigure(getMapMode().DPtoLP(40),
				getMapMode().DPtoLP(40));
		return result;
	}

	/**
	 * Create the instance role figure.
	 * 
	 * @return the created figure.
	 */
	protected ImageFigure createNodeShape() {
		if (primaryShape == null) {
			primaryShape = new ImageFigure();
		}
		return primaryShape;
	}

	/**
	 * Return the instance role figure.
	 * 
	 * @return the instance role figure.
	 */
	public ImageFigure getPrimaryShape() {
		return primaryShape;
	}

	/**
	 * Default implementation treats passed figure as content pane. Respects layout
	 * one may have set for generated figure.
	 * 
	 * @param nodeShape
	 *            instance of generated figure class
	 * @return the figure
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		return nodeShape; // use nodeShape itself as contentPane
	}

	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	protected void refreshVisuals() {
//		CustomStyle customStyle = (CustomStyle) this.resolveSemanticElement();
//		if (customStyle.eContainer() instanceof DNode) {
////			this.getPrimaryShape().setImage(
////					ViewpointPlugin.getDefault().getBundledImage(((DNode) customStyle.eContainer()).getName()));
//		}
	}

	protected void createDefaultEditPolicies() {
		// empty.
	}
}
