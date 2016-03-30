package de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
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
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;


public class FadingComponentEditPart extends AbstractBorderedShapeEditPart {

	
	public static final int VISUAL_ID = 2079;

	
	protected IFigure contentPane;

	
	protected IFigure primaryShape;

	
	public FadingComponentEditPart(View view) {
		super(view);
	}

	
	protected void createDefaultEditPolicies() {
		installEditPolicy(
				EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.policies.FadingComponentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.policies.FadingComponentCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(
				EditPolicyRoles.OPEN_ROLE,
				new de.uni_paderborn.fujaba.muml.common.edit.policies.opendiagram.OpenBehaviorDiagramEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that
		// would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);

		installEditPolicy(
				EditPolicy.GRAPHICAL_NODE_ROLE,
				new org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy());

		installEditPolicy(
				de.uni_paderborn.fujaba.muml.common.edit.policies.EditPolicyRoles.ERROR_FEEDBACK_ROLE,
				new org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy());
		installEditPolicy(
				org.muml.core.common.edit.policies.EditPolicyRoles.BACKGROUND_COLOR_ROLE,
				new de.uni_paderborn.fujaba.muml.common.edit.policies.component.ComponentColorEditPolicy());

	}

	
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
						.getVisualID(childView)) {
				case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
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

	
	protected IFigure createNodeShape() {
		return primaryShape = new FadingComponentFigure();
	}

	
	public FadingComponentFigure getPrimaryShape() {
		return (FadingComponentFigure) primaryShape;
	}

	
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticAtomicComponentNameEditPart) {
			((de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticAtomicComponentNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureComponentNameFigure());
			return true;
		}

		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			getBorderedFigure()
					.getBorderItemContainer()
					.add(((de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortEditPart) childEditPart)
							.getFigure(), locator);
			return true;
		}

		return false;
	}

	
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticAtomicComponentNameEditPart) {
			return true;
		}

		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortEditPart) {
			getBorderedFigure()
					.getBorderItemContainer()
					.remove(((de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortEditPart) childEditPart)
							.getFigure());
			return true;
		}

		return false;
	}

	
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}

	
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(130, 47);

		// Ensures that the element can be shrinked (Muml Bug #62).
		result.setMinimumSize(new Dimension(0, 0));

		return result;
	}

	
	protected NodeFigure createMainFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane. Respects
	 * layout one may have set for generated figure.
	 * 
	 * @param nodeShape
	 *            instance of generated figure class
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
		return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticAtomicComponentNameEditPart.VISUAL_ID));
	}

	
	public class FadingComponentFigure extends RectangleFigure {

		
		private WrappingLabel fFigureComponentNameFigure;

		
		public FadingComponentFigure() {
			this.setLayoutManager(new StackLayout());
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		
		private void createContents() {

			RectangleFigure componentIconRectangle0 = new RectangleFigure();

			componentIconRectangle0.setFill(false);
			componentIconRectangle0.setOutline(false);

			this.add(componentIconRectangle0);

			GridLayout layoutComponentIconRectangle0 = new GridLayout();
			layoutComponentIconRectangle0.numColumns = 1;
			layoutComponentIconRectangle0.makeColumnsEqualWidth = false;
			componentIconRectangle0
					.setLayoutManager(layoutComponentIconRectangle0);

			RectangleFigure componentIconFigure1 = new RectangleFigure();

			componentIconFigure1.setFill(false);
			componentIconFigure1.setOutline(false);
			componentIconFigure1.setPreferredSize(new Dimension(getMapMode()
					.DPtoLP(35), getMapMode().DPtoLP(20)));

			GridData constraintComponentIconFigure1 = new GridData();
			constraintComponentIconFigure1.verticalAlignment = GridData.BEGINNING;
			constraintComponentIconFigure1.horizontalAlignment = GridData.END;
			constraintComponentIconFigure1.horizontalIndent = 0;
			constraintComponentIconFigure1.horizontalSpan = 1;
			constraintComponentIconFigure1.verticalSpan = 1;
			constraintComponentIconFigure1.grabExcessHorizontalSpace = true;
			constraintComponentIconFigure1.grabExcessVerticalSpace = false;
			componentIconRectangle0.add(componentIconFigure1,
					constraintComponentIconFigure1);

			componentIconFigure1.setLayoutManager(new StackLayout());

			RectangleFigure componentIconOuter2 = new RectangleFigure();

			componentIconOuter2.setFill(false);
			componentIconOuter2.setOutline(false);

			componentIconFigure1.add(componentIconOuter2);
			componentIconOuter2.setLayoutManager(new XYLayout());

			RectangleFigure b13 = new RectangleFigure();

			componentIconOuter2.add(b13, new Rectangle(getMapMode().DPtoLP(4),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(30),
					getMapMode().DPtoLP(20)));

			RectangleFigure componentIconInner12 = new RectangleFigure();

			componentIconInner12.setFill(false);
			componentIconInner12.setOutline(false);

			componentIconFigure1.add(componentIconInner12);
			componentIconInner12.setLayoutManager(new XYLayout());

			RectangleFigure c13 = new RectangleFigure();

			componentIconInner12.add(c13, new Rectangle(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(2), getMapMode().DPtoLP(12),
					getMapMode().DPtoLP(6)));

			RectangleFigure componentIconInner22 = new RectangleFigure();

			componentIconInner22.setFill(false);
			componentIconInner22.setOutline(false);

			componentIconFigure1.add(componentIconInner22);
			componentIconInner22.setLayoutManager(new XYLayout());

			RectangleFigure d13 = new RectangleFigure();

			componentIconInner22.add(d13, new Rectangle(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(10), getMapMode().DPtoLP(12),
					getMapMode().DPtoLP(6)));

			// FadingComponent specific
			
			Color green = new Color(Display.getCurrent(), 0, 150, 0);
			RectangleFigure plusFigure = new RectangleFigure();

			plusFigure.setFill(false);
			plusFigure.setOutline(true);
			plusFigure.setForegroundColor(green);

			plusFigure.setLayoutManager(new XYLayout());
			WrappingLabel plus = new WrappingLabel();

			plus.setText("+");
			plus.setAlignment(PositionConstants.CENTER);

			plus.setForegroundColor(green);
			
			plus.setFont(new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 7, SWT.NORMAL));

			plusFigure.add(plus, new Rectangle(getMapMode()
					.DPtoLP(0), getMapMode().DPtoLP(-1), getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(10)));

			componentIconOuter2.add(plusFigure, new Rectangle(getMapMode()
					.DPtoLP(13), getMapMode().DPtoLP(5), getMapMode().DPtoLP(9),
					getMapMode().DPtoLP(10)));
			
			
			Color red = new Color(Display.getCurrent(), 150, 0, 0);
			RectangleFigure minusFigure = new RectangleFigure();

			minusFigure.setFill(false);
			minusFigure.setOutline(true);
			minusFigure.setForegroundColor(red);

			minusFigure.setLayoutManager(new XYLayout());
			
			WrappingLabel minus = new WrappingLabel();
			minus.setText("-");
			minus.setAlignment(PositionConstants.TOP);
			minus.setForegroundColor(red);
			minus.setFont(new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
			.getFontData()[0].getName(), 7, SWT.NORMAL));

			minusFigure.add(minus,  new Rectangle(getMapMode()
					.DPtoLP(-1), getMapMode().DPtoLP(-2), getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(10)));

			componentIconOuter2.add(minusFigure, new Rectangle(getMapMode()
					.DPtoLP(23), getMapMode().DPtoLP(5), getMapMode().DPtoLP(9),
					getMapMode().DPtoLP(10)));
			
			
			// Process FigureRef details

			componentIconRectangle0.add(componentIconFigure1);

			RectangleFigure componentNameRectangle0 = new RectangleFigure();

			componentNameRectangle0.setFill(false);
			componentNameRectangle0.setOutline(false);

			this.add(componentNameRectangle0);

			GridLayout layoutComponentNameRectangle0 = new GridLayout();
			layoutComponentNameRectangle0.numColumns = 1;
			layoutComponentNameRectangle0.makeColumnsEqualWidth = false;
			componentNameRectangle0
					.setLayoutManager(layoutComponentNameRectangle0);

			fFigureComponentNameFigure = new WrappingLabel();

			fFigureComponentNameFigure.setText("");

			fFigureComponentNameFigure.setFont(FFIGURECOMPONENTNAMEFIGURE_FONT);

			GridData constraintFFigureComponentNameFigure = new GridData();
			constraintFFigureComponentNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureComponentNameFigure.horizontalAlignment = GridData.FILL;
			constraintFFigureComponentNameFigure.horizontalIndent = 0;
			constraintFFigureComponentNameFigure.horizontalSpan = 1;
			constraintFFigureComponentNameFigure.verticalSpan = 1;
			constraintFFigureComponentNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureComponentNameFigure.grabExcessVerticalSpace = true;
			componentNameRectangle0.add(fFigureComponentNameFigure,
					constraintFFigureComponentNameFigure);

		}

		
		public WrappingLabel getFigureComponentNameFigure() {
			return fFigureComponentNameFigure;
		}
	

	}

	/**
	 * @generated
	 */
	static final Font FFIGURECOMPONENTNAMEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

}
