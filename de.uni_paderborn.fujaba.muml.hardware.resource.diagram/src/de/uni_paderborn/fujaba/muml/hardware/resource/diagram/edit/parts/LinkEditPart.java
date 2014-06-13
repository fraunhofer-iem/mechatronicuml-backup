package de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.PolylineShape;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ScalablePolygonShape;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class LinkEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2004;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public LinkEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.policies.LinkItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);

		installEditPolicy(
				EditPolicy.GRAPHICAL_NODE_ROLE,
				new de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy());

		installEditPolicy(
				de.uni_paderborn.fujaba.muml.common.edit.policies.EditPolicyRoles.ERROR_FEEDBACK_ROLE,
				new de.uni_paderborn.fujaba.muml.common.edit.policies.ErrorFeedbackEditPolicy());

	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new LinkResourceFigure();
	}

	/**
	 * @generated
	 */
	public LinkResourceFigure getPrimaryShape() {
		return (LinkResourceFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel21EditPart) {
			((de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel21EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureLinkResourceLabel1());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel22EditPart) {
			((de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel22EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureLinkResourceLabel2());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel21EditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel22EditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(150, 100);

		// Ensures that the element can be shrinked (Muml Bug #62).
		result.setMinimumSize(new Dimension(0, 0));

		return result;
	}

	/**
	 * @generated
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		EditPolicy result = super.getPrimaryDragEditPolicy();
		if (result instanceof ResizableEditPolicy) {
			ResizableEditPolicy ep = (ResizableEditPolicy) result;
			ep.setResizeDirections(PositionConstants.NONE);
		}
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel21EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class LinkResourceFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkResourceLabel1;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkResourceLabel2;

		/**
		 * @generated
		 */
		public LinkResourceFigure() {
			this.setLayoutManager(new StackLayout());
			this.setOutline(false);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure busContainer0 = new RectangleFigure();

			busContainer0.setFill(false);
			busContainer0.setOutline(false);

			GridData constraintBusContainer0 = new GridData();
			constraintBusContainer0.verticalAlignment = GridData.CENTER;
			constraintBusContainer0.horizontalAlignment = GridData.CENTER;
			constraintBusContainer0.horizontalIndent = 0;
			constraintBusContainer0.horizontalSpan = 1;
			constraintBusContainer0.verticalSpan = 1;
			constraintBusContainer0.grabExcessHorizontalSpace = true;
			constraintBusContainer0.grabExcessVerticalSpace = true;
			this.add(busContainer0, constraintBusContainer0);

			GridLayout layoutBusContainer0 = new GridLayout();
			layoutBusContainer0.numColumns = 1;
			layoutBusContainer0.makeColumnsEqualWidth = false;
			busContainer0.setLayoutManager(layoutBusContainer0);

			fFigureLinkResourceLabel1 = new WrappingLabel();

			fFigureLinkResourceLabel1.setText("<...>");

			fFigureLinkResourceLabel1.setFont(FFIGURELINKRESOURCELABEL1_FONT);

			GridData constraintFFigureLinkResourceLabel1 = new GridData();
			constraintFFigureLinkResourceLabel1.verticalAlignment = GridData.BEGINNING;
			constraintFFigureLinkResourceLabel1.horizontalAlignment = GridData.CENTER;
			constraintFFigureLinkResourceLabel1.horizontalIndent = 0;
			constraintFFigureLinkResourceLabel1.horizontalSpan = 1;
			constraintFFigureLinkResourceLabel1.verticalSpan = 0;
			constraintFFigureLinkResourceLabel1.grabExcessHorizontalSpace = true;
			constraintFFigureLinkResourceLabel1.grabExcessVerticalSpace = true;
			busContainer0.add(fFigureLinkResourceLabel1,
					constraintFFigureLinkResourceLabel1);

			fFigureLinkResourceLabel2 = new WrappingLabel();

			fFigureLinkResourceLabel2.setText("<...>");

			GridData constraintFFigureLinkResourceLabel2 = new GridData();
			constraintFFigureLinkResourceLabel2.verticalAlignment = GridData.BEGINNING;
			constraintFFigureLinkResourceLabel2.horizontalAlignment = GridData.CENTER;
			constraintFFigureLinkResourceLabel2.horizontalIndent = 0;
			constraintFFigureLinkResourceLabel2.horizontalSpan = 1;
			constraintFFigureLinkResourceLabel2.verticalSpan = 0;
			constraintFFigureLinkResourceLabel2.grabExcessHorizontalSpace = true;
			constraintFFigureLinkResourceLabel2.grabExcessVerticalSpace = true;
			busContainer0.add(fFigureLinkResourceLabel2,
					constraintFFigureLinkResourceLabel2);

			PolylineShape line0 = new PolylineShape();

			line0.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
					.DPtoLP(40)));
			line0.addPoint(new Point(getMapMode().DPtoLP(150), getMapMode()
					.DPtoLP(40)));
			line0.setLineWidth(3);

			this.add(line0);

			Ellipse circle11 = new Ellipse();

			circle11.setOutline(false);
			circle11.setBackgroundColor(ColorConstants.black);
			circle11.setLocation(new Point(getMapMode().DPtoLP(0), getMapMode()
					.DPtoLP(30)));
			circle11.setSize(getMapMode().DPtoLP(20), getMapMode().DPtoLP(20));

			line0.add(circle11);

			Ellipse circle21 = new Ellipse();

			circle21.setOutline(false);
			circle21.setBackgroundColor(ColorConstants.black);
			circle21.setLocation(new Point(getMapMode().DPtoLP(132),
					getMapMode().DPtoLP(30)));
			circle21.setSize(getMapMode().DPtoLP(20), getMapMode().DPtoLP(20));

			line0.add(circle21);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkResourceLabel1() {
			return fFigureLinkResourceLabel1;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkResourceLabel2() {
			return fFigureLinkResourceLabel2;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGURELINKRESOURCELABEL1_FONT = new Font(
			Display.getCurrent(), "BOLD", 9, SWT.BOLD);

}
