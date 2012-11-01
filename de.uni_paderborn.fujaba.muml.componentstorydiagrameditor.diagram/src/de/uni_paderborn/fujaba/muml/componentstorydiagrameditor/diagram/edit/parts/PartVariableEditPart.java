package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ScalablePolygonShape;
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
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
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
public class PartVariableEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3005;

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
	public PartVariableEditPart(View view) {
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
				new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.policies.PartVariableItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.policies.PartVariableCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
						.getVisualID(childView)) {
				case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PortVariable2EditPart.VISUAL_ID:
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
		return primaryShape = new PartVariableFigure();
	}

	/**
	 * @generated
	 */
	public PartVariableFigure getPrimaryShape() {
		return (PartVariableFigure) primaryShape;
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
	public class PartVariableFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureComponentPartVariableNameFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigurePartChildren;
		/**
		 * @generated
		 */
		private ScalablePolygonShape fFigureNegative;

		/**
		 * @generated
		 */
		public PartVariableFigure() {
			this.setLayoutManager(new StackLayout());
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure partVariable0 = new RectangleFigure();

			this.add(partVariable0);

			GridLayout layoutPartVariable0 = new GridLayout();
			layoutPartVariable0.numColumns = 1;
			layoutPartVariable0.makeColumnsEqualWidth = true;
			partVariable0.setLayoutManager(layoutPartVariable0);

			RectangleFigure container1 = new RectangleFigure();
			container1.setFill(false);
			container1.setOutline(false);
			container1.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));

			GridData constraintContainer1 = new GridData();
			constraintContainer1.verticalAlignment = GridData.CENTER;
			constraintContainer1.horizontalAlignment = GridData.CENTER;
			constraintContainer1.horizontalIndent = 0;
			constraintContainer1.horizontalSpan = 1;
			constraintContainer1.verticalSpan = 1;
			constraintContainer1.grabExcessHorizontalSpace = true;
			constraintContainer1.grabExcessVerticalSpace = true;
			partVariable0.add(container1, constraintContainer1);

			GridLayout layoutContainer1 = new GridLayout();
			layoutContainer1.numColumns = 2;
			layoutContainer1.makeColumnsEqualWidth = true;
			container1.setLayoutManager(layoutContainer1);

			fFigureComponentPartVariableNameFigure = new WrappingLabel();
			fFigureComponentPartVariableNameFigure.setText("");

			fFigureComponentPartVariableNameFigure
					.setFont(FFIGURECOMPONENTPARTVARIABLENAMEFIGURE_FONT);

			GridData constraintFFigureComponentPartVariableNameFigure = new GridData();
			constraintFFigureComponentPartVariableNameFigure.verticalAlignment = GridData.BEGINNING;
			constraintFFigureComponentPartVariableNameFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureComponentPartVariableNameFigure.horizontalIndent = 0;
			constraintFFigureComponentPartVariableNameFigure.horizontalSpan = 1;
			constraintFFigureComponentPartVariableNameFigure.verticalSpan = 1;
			constraintFFigureComponentPartVariableNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureComponentPartVariableNameFigure.grabExcessVerticalSpace = false;
			container1.add(fFigureComponentPartVariableNameFigure,
					constraintFFigureComponentPartVariableNameFigure);

			/*FIXME referenced figures are just not yet fully-functional; need process attrs and layout here*/

			RectangleFigure componentIconFigure2 = new RectangleFigure();
			componentIconFigure2.setFill(false);
			componentIconFigure2.setOutline(false);
			componentIconFigure2.setPreferredSize(new Dimension(getMapMode()
					.DPtoLP(20), getMapMode().DPtoLP(20)));

			GridData constraintComponentIconFigure2 = new GridData();
			constraintComponentIconFigure2.verticalAlignment = GridData.BEGINNING;
			constraintComponentIconFigure2.horizontalAlignment = GridData.END;
			constraintComponentIconFigure2.horizontalIndent = 0;
			constraintComponentIconFigure2.horizontalSpan = 1;
			constraintComponentIconFigure2.verticalSpan = 1;
			constraintComponentIconFigure2.grabExcessHorizontalSpace = true;
			constraintComponentIconFigure2.grabExcessVerticalSpace = false;
			container1
					.add(componentIconFigure2, constraintComponentIconFigure2);

			componentIconFigure2.setLayoutManager(new StackLayout());

			RectangleFigure componentIconOuter3 = new RectangleFigure();
			componentIconOuter3.setFill(false);
			componentIconOuter3.setOutline(false);

			componentIconFigure2.add(componentIconOuter3);
			componentIconOuter3.setLayoutManager(new XYLayout());

			RectangleFigure b14 = new RectangleFigure();

			componentIconOuter3.add(b14, new Rectangle(getMapMode().DPtoLP(4),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(16),
					getMapMode().DPtoLP(20)));

			RectangleFigure componentIconInner13 = new RectangleFigure();
			componentIconInner13.setFill(false);
			componentIconInner13.setOutline(false);

			componentIconFigure2.add(componentIconInner13);
			componentIconInner13.setLayoutManager(new XYLayout());

			RectangleFigure c14 = new RectangleFigure();

			componentIconInner13.add(c14, new Rectangle(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(2), getMapMode().DPtoLP(12),
					getMapMode().DPtoLP(6)));

			RectangleFigure componentIconInner23 = new RectangleFigure();
			componentIconInner23.setFill(false);
			componentIconInner23.setOutline(false);

			componentIconFigure2.add(componentIconInner23);
			componentIconInner23.setLayoutManager(new XYLayout());

			RectangleFigure d14 = new RectangleFigure();

			componentIconInner23.add(d14, new Rectangle(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(10), getMapMode().DPtoLP(12),
					getMapMode().DPtoLP(6)));

			RectangleFigure children1 = new RectangleFigure();
			children1.setFill(false);
			children1.setOutline(false);

			GridData constraintChildren1 = new GridData();
			constraintChildren1.verticalAlignment = GridData.FILL;
			constraintChildren1.horizontalAlignment = GridData.FILL;
			constraintChildren1.horizontalIndent = 0;
			constraintChildren1.horizontalSpan = 1;
			constraintChildren1.verticalSpan = 1;
			constraintChildren1.grabExcessHorizontalSpace = true;
			constraintChildren1.grabExcessVerticalSpace = true;
			partVariable0.add(children1, constraintChildren1);

			fFigureNegative = new ScalablePolygonShape();
			fFigureNegative.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));
			fFigureNegative.addPoint(new Point(getMapMode().DPtoLP(1),
					getMapMode().DPtoLP(1)));
			fFigureNegative.addPoint(new Point(getMapMode().DPtoLP(1),
					getMapMode().DPtoLP(0)));
			fFigureNegative.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(1)));
			fFigureNegative.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));

			this.add(fFigureNegative);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureComponentPartVariableNameFigure() {
			return fFigureComponentPartVariableNameFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigurePartChildren() {
			return fFigurePartChildren;
		}

		/**
		 * @generated
		 */
		public ScalablePolygonShape getFigureNegative() {
			return fFigureNegative;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGURECOMPONENTPARTVARIABLENAMEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.NORMAL);

}
