package de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PolygonShape;
import org.eclipse.draw2d.PolylineShape;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
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
public class HardwareNodeEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

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
	public HardwareNodeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.muml.deployment.diagram.edit.policies.HardwareNodeItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new de.uni_paderborn.fujaba.muml.deployment.diagram.edit.policies.HardwareNodeCanonicalEditPolicy());
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
				View childView = (View) child.getModel();
				switch (de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlVisualIDRegistry
						.getVisualID(childView)) {
				case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy();
				}
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
		return primaryShape = new HardwareNodeFigure();
	}

	/**
	 * @generated
	 */
	public HardwareNodeFigure getPrimaryShape() {
		return (HardwareNodeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeNameEditPart) {
			((de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureComponentNameFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.WEST);
			getBorderedFigure()
					.getBorderItemContainer()
					.add(((de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortEditPart) childEditPart)
							.getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeNameEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortEditPart) {
			getBorderedFigure()
					.getBorderItemContainer()
					.remove(((de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortEditPart) childEditPart)
							.getFigure());
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
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);

		// Ensures that the element can be shrinked (Muml Bug #62).
		result.setMinimumSize(new Dimension(0, 0));

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
	protected NodeFigure createMainFigure() {
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
		return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class HardwareNodeFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureComponentNameFigure;

		/**
		 * @generated
		 */
		public HardwareNodeFigure() {
			this.setLayoutManager(new StackLayout());
			this.setFill(false);
			this.setOutline(false);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure upperShadow0 = new RectangleFigure();
			upperShadow0.setFill(false);
			upperShadow0.setOutline(false);

			this.add(upperShadow0);

			BorderLayout layoutUpperShadow0 = new BorderLayout();
			upperShadow0.setLayoutManager(layoutUpperShadow0);

			RectangleFigure upperLeftRectangle1 = new RectangleFigure();
			upperLeftRectangle1.setFill(false);
			upperLeftRectangle1.setOutline(false);
			upperLeftRectangle1.setSize(getMapMode().DPtoLP(16), getMapMode()
					.DPtoLP(16));

			upperShadow0.add(upperLeftRectangle1, BorderLayout.LEFT);
			upperLeftRectangle1.setLayoutManager(new StackLayout());

			PolygonShape leftPolygon2 = new PolygonShape();
			leftPolygon2.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(16)));
			leftPolygon2.addPoint(new Point(getMapMode().DPtoLP(16),
					getMapMode().DPtoLP(16)));
			leftPolygon2.addPoint(new Point(getMapMode().DPtoLP(16),
					getMapMode().DPtoLP(0)));
			leftPolygon2.setFill(true);
			leftPolygon2.setOutline(false);
			leftPolygon2.setForegroundColor(LEFTPOLYGON2_FORE);
			leftPolygon2.setBackgroundColor(LEFTPOLYGON2_BACK);
			leftPolygon2.setPreferredSize(new Dimension(
					getMapMode().DPtoLP(16), getMapMode().DPtoLP(16)));
			leftPolygon2.setMinimumSize(new Dimension(getMapMode().DPtoLP(16),
					getMapMode().DPtoLP(16)));
			leftPolygon2.setSize(getMapMode().DPtoLP(16),
					getMapMode().DPtoLP(16));

			upperLeftRectangle1.add(leftPolygon2);

			PolylineShape leftLine2 = new PolylineShape();
			leftLine2.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
					.DPtoLP(16)));
			leftLine2.addPoint(new Point(getMapMode().DPtoLP(16), getMapMode()
					.DPtoLP(0)));
			leftLine2.setForegroundColor(LEFTLINE2_FORE);

			upperLeftRectangle1.add(leftLine2);

			RectangleFigure upperMiddleRectangle1 = new RectangleFigure();
			upperMiddleRectangle1.setOutline(false);
			upperMiddleRectangle1.setLineWidth(0);
			upperMiddleRectangle1
					.setBackgroundColor(UPPERMIDDLERECTANGLE1_BACK);

			upperShadow0.add(upperMiddleRectangle1, BorderLayout.CENTER);

			BorderLayout layoutUpperMiddleRectangle1 = new BorderLayout();
			upperMiddleRectangle1.setLayoutManager(layoutUpperMiddleRectangle1);

			RectangleFigure upperLine2 = new RectangleFigure();
			upperLine2.setForegroundColor(UPPERLINE2_FORE);
			upperLine2.setBackgroundColor(UPPERLINE2_BACK);
			upperLine2.setSize(getMapMode().DPtoLP(0), getMapMode().DPtoLP(1));

			upperMiddleRectangle1.add(upperLine2, BorderLayout.TOP);

			RectangleFigure rightShadow1 = new RectangleFigure();
			rightShadow1.setFill(false);
			rightShadow1.setOutline(false);
			rightShadow1.setLineWidth(0);

			upperShadow0.add(rightShadow1, BorderLayout.RIGHT);

			BorderLayout layoutRightShadow1 = new BorderLayout();
			rightShadow1.setLayoutManager(layoutRightShadow1);

			RectangleFigure upperRightRectangle2 = new RectangleFigure();
			upperRightRectangle2.setFill(false);
			upperRightRectangle2.setOutline(false);
			upperRightRectangle2.setLineWidth(0);
			upperRightRectangle2.setPreferredSize(new Dimension(getMapMode()
					.DPtoLP(16), getMapMode().DPtoLP(16)));
			upperRightRectangle2.setMinimumSize(new Dimension(getMapMode()
					.DPtoLP(16), getMapMode().DPtoLP(16)));
			upperRightRectangle2.setSize(getMapMode().DPtoLP(16), getMapMode()
					.DPtoLP(16));

			rightShadow1.add(upperRightRectangle2, BorderLayout.TOP);
			upperRightRectangle2.setLayoutManager(new StackLayout());

			RectangleFigure upperRightFilledRectangle3 = new RectangleFigure();
			upperRightFilledRectangle3.setOutline(false);
			upperRightFilledRectangle3.setLineWidth(0);
			upperRightFilledRectangle3
					.setBackgroundColor(UPPERRIGHTFILLEDRECTANGLE3_BACK);
			upperRightFilledRectangle3.setPreferredSize(new Dimension(
					getMapMode().DPtoLP(16), getMapMode().DPtoLP(16)));
			upperRightFilledRectangle3.setMinimumSize(new Dimension(
					getMapMode().DPtoLP(16), getMapMode().DPtoLP(16)));
			upperRightFilledRectangle3.setSize(getMapMode().DPtoLP(16),
					getMapMode().DPtoLP(16));

			upperRightRectangle2.add(upperRightFilledRectangle3);

			PolylineShape diagonalLine3 = new PolylineShape();
			diagonalLine3.addPoint(new Point(getMapMode().DPtoLP(15),
					getMapMode().DPtoLP(0)));
			diagonalLine3.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(15)));
			diagonalLine3.setForegroundColor(DIAGONALLINE3_FORE);

			upperRightRectangle2.add(diagonalLine3);

			PolylineShape upperRightLine3 = new PolylineShape();
			upperRightLine3.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));
			upperRightLine3.addPoint(new Point(getMapMode().DPtoLP(15),
					getMapMode().DPtoLP(0)));
			upperRightLine3.setForegroundColor(UPPERRIGHTLINE3_FORE);

			upperRightRectangle2.add(upperRightLine3);

			PolylineShape rightUpperLine3 = new PolylineShape();
			rightUpperLine3.addPoint(new Point(getMapMode().DPtoLP(15),
					getMapMode().DPtoLP(1)));
			rightUpperLine3.addPoint(new Point(getMapMode().DPtoLP(15),
					getMapMode().DPtoLP(15)));
			rightUpperLine3.setForegroundColor(RIGHTUPPERLINE3_FORE);

			upperRightRectangle2.add(rightUpperLine3);

			RectangleFigure middleRightRectangle2 = new RectangleFigure();
			middleRightRectangle2.setOutline(false);
			middleRightRectangle2.setLineWidth(0);
			middleRightRectangle2
					.setBackgroundColor(MIDDLERIGHTRECTANGLE2_BACK);

			rightShadow1.add(middleRightRectangle2, BorderLayout.CENTER);

			BorderLayout layoutMiddleRightRectangle2 = new BorderLayout();
			middleRightRectangle2.setLayoutManager(layoutMiddleRightRectangle2);

			RectangleFigure rightLine3 = new RectangleFigure();
			rightLine3.setBackgroundColor(RIGHTLINE3_BACK);
			rightLine3.setSize(getMapMode().DPtoLP(1), getMapMode().DPtoLP(0));

			middleRightRectangle2.add(rightLine3, BorderLayout.RIGHT);

			RectangleFigure lowerRightRectangle2 = new RectangleFigure();
			lowerRightRectangle2.setFill(false);
			lowerRightRectangle2.setOutline(false);
			lowerRightRectangle2.setLineWidth(0);

			rightShadow1.add(lowerRightRectangle2, BorderLayout.BOTTOM);
			lowerRightRectangle2.setLayoutManager(new StackLayout());

			PolygonShape rightPolygon3 = new PolygonShape();
			rightPolygon3.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(15)));
			rightPolygon3.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));
			rightPolygon3.addPoint(new Point(getMapMode().DPtoLP(15),
					getMapMode().DPtoLP(0)));
			rightPolygon3.setFill(true);
			rightPolygon3.setOutline(false);
			rightPolygon3.setLineWidth(0);
			rightPolygon3.setBackgroundColor(RIGHTPOLYGON3_BACK);
			rightPolygon3.setPreferredSize(new Dimension(getMapMode()
					.DPtoLP(16), getMapMode().DPtoLP(16)));
			rightPolygon3.setMinimumSize(new Dimension(getMapMode().DPtoLP(16),
					getMapMode().DPtoLP(16)));
			rightPolygon3.setSize(getMapMode().DPtoLP(16),
					getMapMode().DPtoLP(16));

			lowerRightRectangle2.add(rightPolygon3);

			PolylineShape lowerRightLine3 = new PolylineShape();
			lowerRightLine3.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(15)));
			lowerRightLine3.addPoint(new Point(getMapMode().DPtoLP(15),
					getMapMode().DPtoLP(0)));
			lowerRightLine3.setForegroundColor(LOWERRIGHTLINE3_FORE);

			lowerRightRectangle2.add(lowerRightLine3);

			RectangleFigure innerRectangleHelper0 = new RectangleFigure();
			innerRectangleHelper0.setFill(false);
			innerRectangleHelper0.setOutline(false);
			innerRectangleHelper0.setBorder(new MarginBorder(getMapMode()
					.DPtoLP(16), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(16)));

			this.add(innerRectangleHelper0);
			innerRectangleHelper0.setLayoutManager(new StackLayout());

			RectangleFigure innerHardwareNode1 = new RectangleFigure();
			innerHardwareNode1.setForegroundColor(INNERHARDWARENODE1_FORE);
			innerHardwareNode1.setBorder(new MarginBorder(getMapMode()
					.DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));

			innerRectangleHelper0.add(innerHardwareNode1);
			innerHardwareNode1.setLayoutManager(new StackLayout());

			RectangleFigure componentIconRectangle2 = new RectangleFigure();
			componentIconRectangle2.setFill(false);
			componentIconRectangle2.setOutline(false);

			innerHardwareNode1.add(componentIconRectangle2);

			GridLayout layoutComponentIconRectangle2 = new GridLayout();
			layoutComponentIconRectangle2.numColumns = 1;
			layoutComponentIconRectangle2.makeColumnsEqualWidth = false;
			componentIconRectangle2
					.setLayoutManager(layoutComponentIconRectangle2);

			RectangleFigure componentIconFigure3 = new RectangleFigure();
			componentIconFigure3.setFill(false);
			componentIconFigure3.setOutline(false);
			componentIconFigure3.setPreferredSize(new Dimension(getMapMode()
					.DPtoLP(20), getMapMode().DPtoLP(20)));

			GridData constraintComponentIconFigure3 = new GridData();
			constraintComponentIconFigure3.verticalAlignment = GridData.BEGINNING;
			constraintComponentIconFigure3.horizontalAlignment = GridData.END;
			constraintComponentIconFigure3.horizontalIndent = 0;
			constraintComponentIconFigure3.horizontalSpan = 1;
			constraintComponentIconFigure3.verticalSpan = 1;
			constraintComponentIconFigure3.grabExcessHorizontalSpace = true;
			constraintComponentIconFigure3.grabExcessVerticalSpace = false;
			componentIconRectangle2.add(componentIconFigure3,
					constraintComponentIconFigure3);

			componentIconFigure3.setLayoutManager(new StackLayout());

			RectangleFigure componentIconOuter4 = new RectangleFigure();
			componentIconOuter4.setFill(false);
			componentIconOuter4.setOutline(false);

			componentIconFigure3.add(componentIconOuter4);
			componentIconOuter4.setLayoutManager(new XYLayout());

			RectangleFigure b15 = new RectangleFigure();
			b15.setForegroundColor(B15_FORE);

			componentIconOuter4.add(b15, new Rectangle(getMapMode().DPtoLP(4),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(16),
					getMapMode().DPtoLP(20)));

			RectangleFigure componentIconInner14 = new RectangleFigure();
			componentIconInner14.setFill(false);
			componentIconInner14.setOutline(false);

			componentIconFigure3.add(componentIconInner14);
			componentIconInner14.setLayoutManager(new XYLayout());

			RectangleFigure c15 = new RectangleFigure();
			c15.setForegroundColor(C15_FORE);

			componentIconInner14.add(c15, new Rectangle(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(2), getMapMode().DPtoLP(12),
					getMapMode().DPtoLP(6)));

			RectangleFigure componentIconInner24 = new RectangleFigure();
			componentIconInner24.setFill(false);
			componentIconInner24.setOutline(false);

			componentIconFigure3.add(componentIconInner24);
			componentIconInner24.setLayoutManager(new XYLayout());

			RectangleFigure d15 = new RectangleFigure();
			d15.setForegroundColor(D15_FORE);

			componentIconInner24.add(d15, new Rectangle(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(10), getMapMode().DPtoLP(12),
					getMapMode().DPtoLP(6)));

			RectangleFigure componentNameRectangle2 = new RectangleFigure();
			componentNameRectangle2.setFill(false);
			componentNameRectangle2.setOutline(false);

			innerHardwareNode1.add(componentNameRectangle2);

			GridLayout layoutComponentNameRectangle2 = new GridLayout();
			layoutComponentNameRectangle2.numColumns = 1;
			layoutComponentNameRectangle2.makeColumnsEqualWidth = false;
			componentNameRectangle2
					.setLayoutManager(layoutComponentNameRectangle2);

			fFigureComponentNameFigure = new WrappingLabel();
			fFigureComponentNameFigure.setText("");
			fFigureComponentNameFigure
					.setForegroundColor(FFIGURECOMPONENTNAMEFIGURE_FORE);

			fFigureComponentNameFigure.setFont(FFIGURECOMPONENTNAMEFIGURE_FONT);

			GridData constraintFFigureComponentNameFigure = new GridData();
			constraintFFigureComponentNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureComponentNameFigure.horizontalAlignment = GridData.FILL;
			constraintFFigureComponentNameFigure.horizontalIndent = 0;
			constraintFFigureComponentNameFigure.horizontalSpan = 1;
			constraintFFigureComponentNameFigure.verticalSpan = 1;
			constraintFFigureComponentNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureComponentNameFigure.grabExcessVerticalSpace = true;
			componentNameRectangle2.add(fFigureComponentNameFigure,
					constraintFFigureComponentNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureComponentNameFigure() {
			return fFigureComponentNameFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color LEFTPOLYGON2_FORE = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Color LEFTPOLYGON2_BACK = new Color(null, 140, 140, 140);

	/**
	 * @generated
	 */
	static final Color LEFTLINE2_FORE = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Color UPPERMIDDLERECTANGLE1_BACK = new Color(null, 140, 140,
			140);

	/**
	 * @generated
	 */
	static final Color UPPERLINE2_FORE = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Color UPPERLINE2_BACK = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Color UPPERRIGHTFILLEDRECTANGLE3_BACK = new Color(null, 140,
			140, 140);

	/**
	 * @generated
	 */
	static final Color DIAGONALLINE3_FORE = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Color UPPERRIGHTLINE3_FORE = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Color RIGHTUPPERLINE3_FORE = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Color MIDDLERIGHTRECTANGLE2_BACK = new Color(null, 140, 140,
			140);

	/**
	 * @generated
	 */
	static final Color RIGHTLINE3_BACK = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Color RIGHTPOLYGON3_BACK = new Color(null, 140, 140, 140);

	/**
	 * @generated
	 */
	static final Color LOWERRIGHTLINE3_FORE = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Color INNERHARDWARENODE1_FORE = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Color B15_FORE = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Color C15_FORE = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Color D15_FORE = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Color FFIGURECOMPONENTNAMEFIGURE_FORE = new Color(null, 0, 0,
			0);

	/**
	 * @generated
	 */
	static final Font FFIGURECOMPONENTNAMEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

}
