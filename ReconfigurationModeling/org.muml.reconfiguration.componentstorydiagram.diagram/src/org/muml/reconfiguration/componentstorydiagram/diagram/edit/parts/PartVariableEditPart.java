package org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts;

import java.util.Collection;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
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
import org.muml.reconfiguration.common.edit.policies.ComponentPartVariableTriggerEmbeddedComponentExpressionLabelEditPolicy;
import org.muml.reconfiguration.common.edit.policies.ComponentStoryPatternVariableEditPolicy;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.policies.PartVariableCanonicalEditPolicy;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.policies.PartVariableItemSemanticEditPolicy;
import org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry;

/**
 * @generated
 */
public class PartVariableEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3014;

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
	public PartVariableEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(ComponentStoryDiagramVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new PartVariableItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new PartVariableCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());

		installEditPolicy(
				org.muml.pim.common.edit.policies.EditPolicyRoles.COMPONENTSTORYPATTERNVARIABLE_VISUALIZATION_ROLE,
				new ComponentStoryPatternVariableEditPolicy());

		installEditPolicy(
				org.muml.reconfiguration.common.edit.policies.EditPolicyRoles.TRIGGER_EMBEDDED_COMPONENT_EXPRESSION_LABEL_ROLE,
				new ComponentPartVariableTriggerEmbeddedComponentExpressionLabelEditPolicy());

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
				case WrappingLabelEditPart.VISUAL_ID:
					return new org.muml.core.common.edit.policies.BorderItemSelectionEditPolicy();
				case MultiPortVariableEditPart.VISUAL_ID:
				case SinglePortVariable2EditPart.VISUAL_ID:
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
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel2EditPart) {
			((WrappingLabel2EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureTriggerEmbeddedComponentExpressionFigure());
			return true;
		}
		if (childEditPart instanceof WrappingLabel7EditPart) {
			((WrappingLabel7EditPart) childEditPart).setLabel(getPrimaryShape().getFigurePartVariableNameFigure());
			return true;
		}
		if (childEditPart instanceof MultiPortVariableEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.NORTH);
			getBorderedFigure().getBorderItemContainer().add(((MultiPortVariableEditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		if (childEditPart instanceof SinglePortVariable2EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.NORTH);
			getBorderedFigure().getBorderItemContainer().add(((SinglePortVariable2EditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel2EditPart) {
			return true;
		}
		if (childEditPart instanceof WrappingLabel7EditPart) {
			return true;
		}
		if (childEditPart instanceof MultiPortVariableEditPart) {
			getBorderedFigure().getBorderItemContainer()
					.remove(((MultiPortVariableEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof SinglePortVariable2EditPart) {
			getBorderedFigure().getBorderItemContainer()
					.remove(((SinglePortVariable2EditPart) childEditPart).getFigure());
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
	protected void addBorderItem(IFigure borderItemContainer, IBorderItemEditPart borderItemEditPart) {
		if (borderItemEditPart instanceof WrappingLabelEditPart) {
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
		return getChildBySemanticHint(ComponentStoryDiagramVisualIDRegistry.getType(WrappingLabelEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class PartVariableFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigurePartVariableNameFigure;

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriggerEmbeddedComponentExpressionFigure;

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

			partVariable0.setFill(false);
			partVariable0.setOutline(false);

			this.add(partVariable0);

			GridLayout layoutPartVariable0 = new GridLayout();
			layoutPartVariable0.numColumns = 2;
			layoutPartVariable0.makeColumnsEqualWidth = false;
			partVariable0.setLayoutManager(layoutPartVariable0);

			RectangleFigure nameContainer1 = new RectangleFigure();

			nameContainer1.setFill(false);
			nameContainer1.setOutline(false);

			GridData constraintNameContainer1 = new GridData();
			constraintNameContainer1.verticalAlignment = GridData.CENTER;
			constraintNameContainer1.horizontalAlignment = GridData.CENTER;
			constraintNameContainer1.horizontalIndent = 0;
			constraintNameContainer1.horizontalSpan = 1;
			constraintNameContainer1.verticalSpan = 1;
			constraintNameContainer1.grabExcessHorizontalSpace = true;
			constraintNameContainer1.grabExcessVerticalSpace = false;
			partVariable0.add(nameContainer1, constraintNameContainer1);

			GridLayout layoutNameContainer1 = new GridLayout();
			layoutNameContainer1.numColumns = 1;
			layoutNameContainer1.makeColumnsEqualWidth = false;
			nameContainer1.setLayoutManager(layoutNameContainer1);

			fFigurePartVariableNameFigure = new WrappingLabel();

			fFigurePartVariableNameFigure.setText("");

			fFigurePartVariableNameFigure.setFont(FFIGUREPARTVARIABLENAMEFIGURE_FONT);

			fFigurePartVariableNameFigure.setTextUnderline(true);

			GridData constraintFFigurePartVariableNameFigure = new GridData();
			constraintFFigurePartVariableNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigurePartVariableNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigurePartVariableNameFigure.horizontalIndent = 0;
			constraintFFigurePartVariableNameFigure.horizontalSpan = 1;
			constraintFFigurePartVariableNameFigure.verticalSpan = 1;
			constraintFFigurePartVariableNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigurePartVariableNameFigure.grabExcessVerticalSpace = true;
			nameContainer1.add(fFigurePartVariableNameFigure, constraintFFigurePartVariableNameFigure);

			RectangleFigure iconContainer1 = new RectangleFigure();

			iconContainer1.setFill(false);
			iconContainer1.setOutline(false);

			GridData constraintIconContainer1 = new GridData();
			constraintIconContainer1.verticalAlignment = GridData.CENTER;
			constraintIconContainer1.horizontalAlignment = GridData.END;
			constraintIconContainer1.horizontalIndent = 0;
			constraintIconContainer1.horizontalSpan = 1;
			constraintIconContainer1.verticalSpan = 1;
			constraintIconContainer1.grabExcessHorizontalSpace = false;
			constraintIconContainer1.grabExcessVerticalSpace = false;
			partVariable0.add(iconContainer1, constraintIconContainer1);

			GridLayout layoutIconContainer1 = new GridLayout();
			layoutIconContainer1.numColumns = 1;
			layoutIconContainer1.makeColumnsEqualWidth = false;
			iconContainer1.setLayoutManager(layoutIconContainer1);

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
			iconContainer1.add(componentIconFigure2, constraintComponentIconFigure2);

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

			iconContainer1.add(componentIconFigure2);

			RectangleFigure triggerEmbeddedComponentExpressionContainer1 = new RectangleFigure();

			triggerEmbeddedComponentExpressionContainer1.setOutline(false);

			GridData constraintTriggerEmbeddedComponentExpressionContainer1 = new GridData();
			constraintTriggerEmbeddedComponentExpressionContainer1.verticalAlignment = GridData.END;
			constraintTriggerEmbeddedComponentExpressionContainer1.horizontalAlignment = GridData.CENTER;
			constraintTriggerEmbeddedComponentExpressionContainer1.horizontalIndent = 0;
			constraintTriggerEmbeddedComponentExpressionContainer1.horizontalSpan = 1;
			constraintTriggerEmbeddedComponentExpressionContainer1.verticalSpan = 1;
			constraintTriggerEmbeddedComponentExpressionContainer1.grabExcessHorizontalSpace = false;
			constraintTriggerEmbeddedComponentExpressionContainer1.grabExcessVerticalSpace = false;
			partVariable0.add(triggerEmbeddedComponentExpressionContainer1,
					constraintTriggerEmbeddedComponentExpressionContainer1);

			GridLayout layoutTriggerEmbeddedComponentExpressionContainer1 = new GridLayout();
			layoutTriggerEmbeddedComponentExpressionContainer1.numColumns = 1;
			layoutTriggerEmbeddedComponentExpressionContainer1.makeColumnsEqualWidth = true;
			triggerEmbeddedComponentExpressionContainer1
					.setLayoutManager(layoutTriggerEmbeddedComponentExpressionContainer1);

			fFigureTriggerEmbeddedComponentExpressionFigure = new WrappingLabel();

			fFigureTriggerEmbeddedComponentExpressionFigure.setText("");

			fFigureTriggerEmbeddedComponentExpressionFigure
					.setFont(FFIGURETRIGGEREMBEDDEDCOMPONENTEXPRESSIONFIGURE_FONT);

			GridData constraintFFigureTriggerEmbeddedComponentExpressionFigure = new GridData();
			constraintFFigureTriggerEmbeddedComponentExpressionFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureTriggerEmbeddedComponentExpressionFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureTriggerEmbeddedComponentExpressionFigure.horizontalIndent = 0;
			constraintFFigureTriggerEmbeddedComponentExpressionFigure.horizontalSpan = 1;
			constraintFFigureTriggerEmbeddedComponentExpressionFigure.verticalSpan = 1;
			constraintFFigureTriggerEmbeddedComponentExpressionFigure.grabExcessHorizontalSpace = true;
			constraintFFigureTriggerEmbeddedComponentExpressionFigure.grabExcessVerticalSpace = true;
			triggerEmbeddedComponentExpressionContainer1.add(fFigureTriggerEmbeddedComponentExpressionFigure,
					constraintFFigureTriggerEmbeddedComponentExpressionFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePartVariableNameFigure() {
			return fFigurePartVariableNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriggerEmbeddedComponentExpressionFigure() {
			return fFigureTriggerEmbeddedComponentExpressionFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREPARTVARIABLENAMEFIGURE_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 9, SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Font FFIGURETRIGGEREMBEDDEDCOMPONENTEXPRESSIONFIGURE_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 9, SWT.NORMAL);

}
