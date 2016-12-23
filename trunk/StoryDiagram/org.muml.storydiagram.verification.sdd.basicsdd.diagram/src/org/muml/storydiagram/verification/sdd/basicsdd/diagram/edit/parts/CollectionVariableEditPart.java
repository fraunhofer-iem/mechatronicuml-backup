package org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy;
import org.muml.core.common.edit.policies.IBackgroundColorEditPolicy;
import org.muml.core.common.edit.policies.anchor.IConnectionAnchorCreationEditPolicy;
import org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.policies.CollectionVariableItemSemanticEditPolicy;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes;

/**
 * @generated
 */
public class CollectionVariableEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3006;

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
	public CollectionVariableEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(BasicSDDVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new CollectionVariableItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
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
		return primaryShape = new CollectionVariableFigureDescriptor();
	}

	/**
	 * @generated
	 */
	public CollectionVariableFigureDescriptor getPrimaryShape() {
		return (CollectionVariableFigureDescriptor) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabelEditPart) {
			((WrappingLabelEditPart) childEditPart).setLabel(getPrimaryShape().getCollectionVariableOperatorLabel());
			return true;
		}
		if (childEditPart instanceof CollectionVariableNameEditPart) {
			((CollectionVariableNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getCollectionVariableNameLabel());
			return true;
		}
		if (childEditPart instanceof WrappingLabel2EditPart) {
			((WrappingLabel2EditPart) childEditPart).setLabel(getPrimaryShape().getCollectionVariableTypeLabel());
			return true;
		}
		if (childEditPart instanceof CollectionVariableCollectionVariableConstraintsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getCollectionVariableConstraintsRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((CollectionVariableCollectionVariableConstraintsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getCollectionVariableAttributeAssignmentsRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabelEditPart) {
			return true;
		}
		if (childEditPart instanceof CollectionVariableNameEditPart) {
			return true;
		}
		if (childEditPart instanceof WrappingLabel2EditPart) {
			return true;
		}
		if (childEditPart instanceof CollectionVariableCollectionVariableConstraintsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getCollectionVariableConstraintsRectangle();
			pane.remove(
					((CollectionVariableCollectionVariableConstraintsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getCollectionVariableAttributeAssignmentsRectangle();
			pane.remove(((CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart) childEditPart)
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
		if (editPart instanceof CollectionVariableCollectionVariableConstraintsCompartmentEditPart) {
			return getPrimaryShape().getCollectionVariableConstraintsRectangle();
		}
		if (editPart instanceof CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart) {
			return getPrimaryShape().getCollectionVariableAttributeAssignmentsRectangle();
		}
		return getContentPane();
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
		return getChildBySemanticHint(BasicSDDVisualIDRegistry.getType(WrappingLabelEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == BasicSDDElementTypes.Constraint_3008) {
				return getChildBySemanticHint(BasicSDDVisualIDRegistry
						.getType(CollectionVariableCollectionVariableConstraintsCompartmentEditPart.VISUAL_ID));
			}
			if (type == BasicSDDElementTypes.AttributeAssignment_3007) {
				return getChildBySemanticHint(BasicSDDVisualIDRegistry.getType(
						CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class CollectionVariableFigureDescriptor extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fCollectionVariableNameLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fCollectionVariableOperatorLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fCollectionVariableTypeLabel;
		/**
		 * @generated
		 */
		private RectangleFigure fCollectionVariableConstraintsRectangle;
		/**
		 * @generated
		 */
		private RectangleFigure fCollectionVariableAttributeAssignmentsRectangle;

		/**
		 * @generated
		 */
		public CollectionVariableFigureDescriptor() {
			this.setLayoutManager(new StackLayout());
			this.setFill(false);
			this.setOutline(false);
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure collectionVariableShadeRectangle0 = new RectangleFigure();

			collectionVariableShadeRectangle0.setForegroundColor(ColorConstants.black);
			collectionVariableShadeRectangle0.setBackgroundColor(ColorConstants.white);

			collectionVariableShadeRectangle0.setBorder(new MarginBorder(getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(10), getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));

			this.add(collectionVariableShadeRectangle0);

			RectangleFigure collectionVariableContainerRectangle0 = new RectangleFigure();

			collectionVariableContainerRectangle0.setFill(false);
			collectionVariableContainerRectangle0.setOutline(false);
			collectionVariableContainerRectangle0.setForegroundColor(ColorConstants.black);
			collectionVariableContainerRectangle0.setBackgroundColor(ColorConstants.white);

			collectionVariableContainerRectangle0.setBorder(new MarginBorder(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));

			this.add(collectionVariableContainerRectangle0);

			BorderLayout layoutCollectionVariableContainerRectangle0 = new BorderLayout();
			collectionVariableContainerRectangle0.setLayoutManager(layoutCollectionVariableContainerRectangle0);

			RectangleFigure collectionVariableNameRectangle1 = new RectangleFigure();

			collectionVariableContainerRectangle0.add(collectionVariableNameRectangle1, BorderLayout.TOP);

			GridLayout layoutCollectionVariableNameRectangle1 = new GridLayout();
			layoutCollectionVariableNameRectangle1.numColumns = 1;
			layoutCollectionVariableNameRectangle1.makeColumnsEqualWidth = true;
			collectionVariableNameRectangle1.setLayoutManager(layoutCollectionVariableNameRectangle1);

			fCollectionVariableOperatorLabel = new WrappingLabel();

			fCollectionVariableOperatorLabel.setText("");

			fCollectionVariableOperatorLabel.setFont(FCOLLECTIONVARIABLEOPERATORLABEL_FONT);

			GridData constraintFCollectionVariableOperatorLabel = new GridData();
			constraintFCollectionVariableOperatorLabel.verticalAlignment = GridData.BEGINNING;
			constraintFCollectionVariableOperatorLabel.horizontalAlignment = GridData.CENTER;
			constraintFCollectionVariableOperatorLabel.horizontalIndent = 0;
			constraintFCollectionVariableOperatorLabel.horizontalSpan = 1;
			constraintFCollectionVariableOperatorLabel.verticalSpan = 1;
			constraintFCollectionVariableOperatorLabel.grabExcessHorizontalSpace = true;
			constraintFCollectionVariableOperatorLabel.grabExcessVerticalSpace = false;
			collectionVariableNameRectangle1.add(fCollectionVariableOperatorLabel,
					constraintFCollectionVariableOperatorLabel);

			fCollectionVariableNameLabel = new WrappingLabel();

			fCollectionVariableNameLabel.setText("");

			fCollectionVariableNameLabel.setFont(FCOLLECTIONVARIABLENAMELABEL_FONT);

			GridData constraintFCollectionVariableNameLabel = new GridData();
			constraintFCollectionVariableNameLabel.verticalAlignment = GridData.CENTER;
			constraintFCollectionVariableNameLabel.horizontalAlignment = GridData.CENTER;
			constraintFCollectionVariableNameLabel.horizontalIndent = 0;
			constraintFCollectionVariableNameLabel.horizontalSpan = 1;
			constraintFCollectionVariableNameLabel.verticalSpan = 1;
			constraintFCollectionVariableNameLabel.grabExcessHorizontalSpace = true;
			constraintFCollectionVariableNameLabel.grabExcessVerticalSpace = false;
			collectionVariableNameRectangle1.add(fCollectionVariableNameLabel, constraintFCollectionVariableNameLabel);

			fCollectionVariableTypeLabel = new WrappingLabel();

			fCollectionVariableTypeLabel.setText("");

			fCollectionVariableTypeLabel.setFont(FCOLLECTIONVARIABLETYPELABEL_FONT);

			GridData constraintFCollectionVariableTypeLabel = new GridData();
			constraintFCollectionVariableTypeLabel.verticalAlignment = GridData.END;
			constraintFCollectionVariableTypeLabel.horizontalAlignment = GridData.CENTER;
			constraintFCollectionVariableTypeLabel.horizontalIndent = 0;
			constraintFCollectionVariableTypeLabel.horizontalSpan = 1;
			constraintFCollectionVariableTypeLabel.verticalSpan = 1;
			constraintFCollectionVariableTypeLabel.grabExcessHorizontalSpace = true;
			constraintFCollectionVariableTypeLabel.grabExcessVerticalSpace = false;
			collectionVariableNameRectangle1.add(fCollectionVariableTypeLabel, constraintFCollectionVariableTypeLabel);

			RectangleFigure collectionVariableBodyRectangle1 = new RectangleFigure();

			collectionVariableBodyRectangle1.setFill(false);
			collectionVariableBodyRectangle1.setOutline(false);

			collectionVariableContainerRectangle0.add(collectionVariableBodyRectangle1, BorderLayout.CENTER);

			BorderLayout layoutCollectionVariableBodyRectangle1 = new BorderLayout();
			collectionVariableBodyRectangle1.setLayoutManager(layoutCollectionVariableBodyRectangle1);

			fCollectionVariableConstraintsRectangle = new RectangleFigure();

			fCollectionVariableConstraintsRectangle.setFill(false);
			fCollectionVariableConstraintsRectangle.setOutline(false);

			collectionVariableBodyRectangle1.add(fCollectionVariableConstraintsRectangle, BorderLayout.TOP);

			fCollectionVariableAttributeAssignmentsRectangle = new RectangleFigure();

			fCollectionVariableAttributeAssignmentsRectangle.setFill(false);
			fCollectionVariableAttributeAssignmentsRectangle.setOutline(false);

			collectionVariableBodyRectangle1.add(fCollectionVariableAttributeAssignmentsRectangle, BorderLayout.CENTER);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getCollectionVariableNameLabel() {
			return fCollectionVariableNameLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getCollectionVariableOperatorLabel() {
			return fCollectionVariableOperatorLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getCollectionVariableTypeLabel() {
			return fCollectionVariableTypeLabel;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getCollectionVariableConstraintsRectangle() {
			return fCollectionVariableConstraintsRectangle;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getCollectionVariableAttributeAssignmentsRectangle() {
			return fCollectionVariableAttributeAssignmentsRectangle;
		}

	}

	/**
	 * @generated
	 */
	static final Font FCOLLECTIONVARIABLEOPERATORLABEL_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 9, SWT.ITALIC);

	/**
	 * @generated
	 */
	static final Font FCOLLECTIONVARIABLENAMELABEL_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 9, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font FCOLLECTIONVARIABLETYPELABEL_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 9, SWT.BOLD);

}
