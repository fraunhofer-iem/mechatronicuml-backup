package org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts;

import java.util.Collection;

import org.eclipse.draw2d.ConnectionAnchor;
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
import org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy;
import org.muml.core.common.edit.policies.anchor.IConnectionAnchorCreationEditPolicy;
import org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy;
import org.muml.core.common.figures.CustomExternalLabelBorderItemLocator;
import org.muml.pim.common.edit.policies.IBackgroundColorEditPolicy;
import org.muml.reconfiguration.common.edit.policies.ComponentStoryPatternVariableEditPolicy;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.policies.ComponentVariableCanonicalEditPolicy;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.policies.ComponentVariableItemSemanticEditPolicy;
import org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry;

/**
 * @generated
 */
public class ComponentVariableEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3012;

	/**
	 * MUML FIX, see code comments.
	 *
	 * @generated
	 */
	@Override
	protected Collection<?> disableCanonicalFor(Request request) {

		@SuppressWarnings("unchecked")
		Collection<Object> hosts = super.disableCanonicalFor(request);

		// MUML FIX: Make sure that commands disable ALL canonical editpolicies,
		// because GMF supports adding additional commands using Edit Helpers concept,
		// which could trigger refresh of any canonical edit policy.
		// So it should be the cleanest solution to disable all canonical edit policies. 
		EditPart part = this;
		while (part != null) {
			hosts.add(part);
			part = part.getParent();
		}
		return hosts;
	}

	/**
	* MUML FIX: Adapt background color if IBackgroundColorEditPolicy is registered.
	* 
	* @generated
	*/
	@Override
	protected void refreshBackgroundColor() {
		EditPolicy backgroundColorPolicy = getEditPolicy(
				org.muml.core.common.edit.policies.EditPolicyRoles.BACKGROUND_COLOR_ROLE);
		if (backgroundColorPolicy instanceof IBackgroundColorEditPolicy) {
			setBackgroundColor(((IBackgroundColorEditPolicy) backgroundColorPolicy).getCurrentBackgroundColor());
		} else {
			super.refreshBackgroundColor();
		}
	}

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
	public ComponentVariableEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(ComponentStoryDiagramVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ComponentVariableItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new ComponentVariableCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());

		installEditPolicy(
				org.muml.pim.common.edit.policies.EditPolicyRoles.COMPONENTSTORYPATTERNVARIABLE_VISUALIZATION_ROLE,
				new ComponentStoryPatternVariableEditPolicy());

		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);

		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new ConnectionConfigureHelperGraphicalNodeEditPolicy());

		installEditPolicy(org.muml.core.common.edit.policies.EditPolicyRoles.ERROR_FEEDBACK_ROLE,
				new ErrorFeedbackEditPolicy());

	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (ComponentStoryDiagramVisualIDRegistry.getVisualID(childView)) {
				case ComponentVariableOperatorEditPart.VISUAL_ID:
					return new org.muml.core.common.edit.policies.BorderItemSelectionEditPolicy();
				case MultiPortVariable2EditPart.VISUAL_ID:
				case SinglePortVariable3EditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy();
				}
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
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
		return primaryShape = new ComponentVariableFigure();
	}

	/**
	 * @generated
	 */
	public ComponentVariableFigure getPrimaryShape() {
		return (ComponentVariableFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ComponentVariableNameEditPart) {
			((ComponentVariableNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureComponentVariableNameFigure());
			return true;
		}
		if (childEditPart instanceof ComponentVariableComponentVariableCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureChildren();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ComponentVariableComponentVariableCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof MultiPortVariable2EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.NORTH);
			getBorderedFigure().getBorderItemContainer().add(((MultiPortVariable2EditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		if (childEditPart instanceof SinglePortVariable3EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.NORTH);
			getBorderedFigure().getBorderItemContainer().add(((SinglePortVariable3EditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ComponentVariableNameEditPart) {
			return true;
		}
		if (childEditPart instanceof ComponentVariableComponentVariableCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureChildren();
			pane.remove(((ComponentVariableComponentVariableCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof MultiPortVariable2EditPart) {
			getBorderedFigure().getBorderItemContainer()
					.remove(((MultiPortVariable2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof SinglePortVariable3EditPart) {
			getBorderedFigure().getBorderItemContainer()
					.remove(((SinglePortVariable3EditPart) childEditPart).getFigure());
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
		if (editPart instanceof ComponentVariableComponentVariableCompartmentEditPart) {
			return getPrimaryShape().getFigureChildren();
		}
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected void addBorderItem(IFigure borderItemContainer, IBorderItemEditPart borderItemEditPart) {
		if (borderItemEditPart instanceof ComponentVariableOperatorEditPart) {
			// bug-fix: allows the free positioning of external Labels
			CustomExternalLabelBorderItemLocator locator = new CustomExternalLabelBorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			locator.setBorderItemOffset(new Dimension(-20, -20));
			borderItemContainer.add(borderItemEditPart.getFigure(), locator);
		} else {
			super.addBorderItem(borderItemContainer, borderItemEditPart);
		}
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40) {
			@Override
			public ConnectionAnchor createDefaultAnchor() {
				IConnectionAnchorCreationEditPolicy connectionAnchorCreationEditPolicy = (IConnectionAnchorCreationEditPolicy) getEditPolicy(
						org.muml.core.common.edit.policies.EditPolicyRoles.CONNECTION_ANCHOR_CREATION_ROLE);
				if (connectionAnchorCreationEditPolicy != null) {
					return connectionAnchorCreationEditPolicy.createDefaultAnchor();
				}
				return super.createDefaultAnchor();
			}
		};

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
		return getChildBySemanticHint(
				ComponentStoryDiagramVisualIDRegistry.getType(ComponentVariableOperatorEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ComponentVariableFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureComponentVariableNameFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureChildren;

		/**
		 * @generated
		 */
		public ComponentVariableFigure() {
			this.setLayoutManager(new StackLayout());
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure componentVariableContent0 = new RectangleFigure();

			componentVariableContent0.setFill(false);
			componentVariableContent0.setOutline(false);

			this.add(componentVariableContent0);

			GridLayout layoutComponentVariableContent0 = new GridLayout();
			layoutComponentVariableContent0.numColumns = 1;
			layoutComponentVariableContent0.makeColumnsEqualWidth = true;
			componentVariableContent0.setLayoutManager(layoutComponentVariableContent0);

			RectangleFigure container1 = new RectangleFigure();

			container1.setFill(false);
			container1.setOutline(false);
			container1.setBorder(new MarginBorder(getMapMode().DPtoLP(3), getMapMode().DPtoLP(3),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(3)));

			GridData constraintContainer1 = new GridData();
			constraintContainer1.verticalAlignment = GridData.BEGINNING;
			constraintContainer1.horizontalAlignment = GridData.FILL;
			constraintContainer1.horizontalIndent = 0;
			constraintContainer1.horizontalSpan = 1;
			constraintContainer1.verticalSpan = 1;
			constraintContainer1.grabExcessHorizontalSpace = true;
			constraintContainer1.grabExcessVerticalSpace = false;
			componentVariableContent0.add(container1, constraintContainer1);

			GridLayout layoutContainer1 = new GridLayout();
			layoutContainer1.numColumns = 3;
			layoutContainer1.makeColumnsEqualWidth = true;
			container1.setLayoutManager(layoutContainer1);

			RectangleFigure fake2 = new RectangleFigure();

			fake2.setFill(false);
			fake2.setOutline(false);

			container1.add(fake2);

			fFigureComponentVariableNameFigure = new WrappingLabel();

			fFigureComponentVariableNameFigure.setText("this");

			fFigureComponentVariableNameFigure.setFont(FFIGURECOMPONENTVARIABLENAMEFIGURE_FONT);

			GridData constraintFFigureComponentVariableNameFigure = new GridData();
			constraintFFigureComponentVariableNameFigure.verticalAlignment = GridData.BEGINNING;
			constraintFFigureComponentVariableNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureComponentVariableNameFigure.horizontalIndent = 0;
			constraintFFigureComponentVariableNameFigure.horizontalSpan = 1;
			constraintFFigureComponentVariableNameFigure.verticalSpan = 1;
			constraintFFigureComponentVariableNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureComponentVariableNameFigure.grabExcessVerticalSpace = false;
			container1.add(fFigureComponentVariableNameFigure, constraintFFigureComponentVariableNameFigure);

			RectangleFigure componentIconFigure2 = new RectangleFigure();

			componentIconFigure2.setFill(false);
			componentIconFigure2.setOutline(false);
			componentIconFigure2.setPreferredSize(new Dimension(getMapMode().DPtoLP(20), getMapMode().DPtoLP(20)));

			GridData constraintComponentIconFigure2 = new GridData();
			constraintComponentIconFigure2.verticalAlignment = GridData.BEGINNING;
			constraintComponentIconFigure2.horizontalAlignment = GridData.END;
			constraintComponentIconFigure2.horizontalIndent = 0;
			constraintComponentIconFigure2.horizontalSpan = 1;
			constraintComponentIconFigure2.verticalSpan = 1;
			constraintComponentIconFigure2.grabExcessHorizontalSpace = true;
			constraintComponentIconFigure2.grabExcessVerticalSpace = false;
			container1.add(componentIconFigure2, constraintComponentIconFigure2);

			componentIconFigure2.setLayoutManager(new StackLayout());

			RectangleFigure componentIconOuter3 = new RectangleFigure();

			componentIconOuter3.setFill(false);
			componentIconOuter3.setOutline(false);

			componentIconFigure2.add(componentIconOuter3);
			componentIconOuter3.setLayoutManager(new XYLayout());

			RectangleFigure b14 = new RectangleFigure();

			componentIconOuter3.add(b14, new Rectangle(getMapMode().DPtoLP(4), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(16), getMapMode().DPtoLP(20)));

			RectangleFigure componentIconInner13 = new RectangleFigure();

			componentIconInner13.setFill(false);
			componentIconInner13.setOutline(false);

			componentIconFigure2.add(componentIconInner13);
			componentIconInner13.setLayoutManager(new XYLayout());

			RectangleFigure c14 = new RectangleFigure();

			componentIconInner13.add(c14, new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(2),
					getMapMode().DPtoLP(12), getMapMode().DPtoLP(6)));

			RectangleFigure componentIconInner23 = new RectangleFigure();

			componentIconInner23.setFill(false);
			componentIconInner23.setOutline(false);

			componentIconFigure2.add(componentIconInner23);
			componentIconInner23.setLayoutManager(new XYLayout());

			RectangleFigure d14 = new RectangleFigure();

			componentIconInner23.add(d14, new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(12), getMapMode().DPtoLP(6)));

			// Process FigureRef details

			container1.add(componentIconFigure2);

			fFigureChildren = new RectangleFigure();

			fFigureChildren.setFill(false);
			fFigureChildren.setOutline(false);

			GridData constraintFFigureChildren = new GridData();
			constraintFFigureChildren.verticalAlignment = GridData.FILL;
			constraintFFigureChildren.horizontalAlignment = GridData.FILL;
			constraintFFigureChildren.horizontalIndent = 0;
			constraintFFigureChildren.horizontalSpan = 1;
			constraintFFigureChildren.verticalSpan = 1;
			constraintFFigureChildren.grabExcessHorizontalSpace = true;
			constraintFFigureChildren.grabExcessVerticalSpace = true;
			componentVariableContent0.add(fFigureChildren, constraintFFigureChildren);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureComponentVariableNameFigure() {
			return fFigureComponentVariableNameFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureChildren() {
			return fFigureChildren;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGURECOMPONENTVARIABLENAMEFIGURE_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 9, SWT.BOLD);

}
