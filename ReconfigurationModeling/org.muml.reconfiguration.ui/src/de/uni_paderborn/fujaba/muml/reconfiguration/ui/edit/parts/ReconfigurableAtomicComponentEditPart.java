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

/**
 * @generated
 */
public class ReconfigurableAtomicComponentEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2078;

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
	public ReconfigurableAtomicComponentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(
				EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.policies.ReconfigurableAtomicComponentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.policies.ReconfigurableAtomicComponentCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(
				EditPolicyRoles.OPEN_ROLE,
				new org.muml.pim.common.edit.policies.opendiagram.OpenBehaviorDiagramEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);

		installEditPolicy(
				EditPolicy.GRAPHICAL_NODE_ROLE,
				new org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy());

		installEditPolicy(
				org.muml.pim.common.edit.policies.EditPolicyRoles.ERROR_FEEDBACK_ROLE,
				new org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy());

	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
						.getVisualID(childView)) {
				case org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
				case org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
				case org.muml.pim.component.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationExecutionPortEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.BroadcastPortEditPart.VISUAL_ID:
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
		return primaryShape = new ComponentFigure();
	}

	/**
	 * @generated
	 */
	public ComponentFigure getPrimaryShape() {
		return (ComponentFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentNameEditPart) {
			((org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureComponentNameFigure());
			return true;
		}
		if (childEditPart instanceof org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			getBorderedFigure()
					.getBorderItemContainer()
					.add(((org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart) childEditPart)
							.getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			getBorderedFigure()
					.getBorderItemContainer()
					.add(((org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart) childEditPart)
							.getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof org.muml.pim.component.diagram.edit.parts.HybridPortEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			getBorderedFigure()
					.getBorderItemContainer()
					.add(((org.muml.pim.component.diagram.edit.parts.HybridPortEditPart) childEditPart)
							.getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationExecutionPortEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			getBorderedFigure()
					.getBorderItemContainer()
					.add(((de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationExecutionPortEditPart) childEditPart)
							.getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			getBorderedFigure()
					.getBorderItemContainer()
					.add(((de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart) childEditPart)
							.getFigure(), locator);
			return true;
		}
		
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.BroadcastPortEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			getBorderedFigure()
					.getBorderItemContainer()
					.add(((de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.BroadcastPortEditPart) childEditPart)
							.getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentNameEditPart) {
			return true;
		}
		if (childEditPart instanceof org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart) {
			getBorderedFigure()
					.getBorderItemContainer()
					.remove(((org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart) {
			getBorderedFigure()
					.getBorderItemContainer()
					.remove(((org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof org.muml.pim.component.diagram.edit.parts.HybridPortEditPart) {
			getBorderedFigure()
					.getBorderItemContainer()
					.remove(((org.muml.pim.component.diagram.edit.parts.HybridPortEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart) {
			getBorderedFigure()
					.getBorderItemContainer()
					.remove(((de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationExecutionPortEditPart) {
			getBorderedFigure()
					.getBorderItemContainer()
					.remove(((de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationExecutionPortEditPart) childEditPart)
							.getFigure());
			return true;
		}
		
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.BroadcastPortEditPart) {
			getBorderedFigure()
					.getBorderItemContainer()
					.remove(((de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.BroadcastPortEditPart) childEditPart)
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
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(130, 47);

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
		return getChildBySemanticHint(org.muml.pim.component.diagram.part.MumlVisualIDRegistry
				.getType(org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ComponentFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureComponentNameFigure;

		/**
		 * @generated
		 */
		public ComponentFigure() {
			this.setLayoutManager(new StackLayout());
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
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
					.DPtoLP(20), getMapMode().DPtoLP(20)));

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
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(16),
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
	static final Font FFIGURECOMPONENTNAMEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

}
