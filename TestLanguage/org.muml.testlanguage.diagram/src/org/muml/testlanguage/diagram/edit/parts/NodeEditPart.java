package org.muml.testlanguage.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
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
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
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
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class NodeEditPart extends ShapeNodeEditPart {

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
	public NodeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(
				EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						org.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new org.muml.testlanguage.diagram.edit.policies.NodeItemSemanticEditPolicy());
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
		return primaryShape = new NodeFigure();
	}

	/**
	 * @generated
	 */
	public NodeFigure getPrimaryShape() {
		return (NodeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof org.muml.testlanguage.diagram.edit.parts.NodeLabelEditPart) {
			((org.muml.testlanguage.diagram.edit.parts.NodeLabelEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureNodeLabelFigure());
			return true;
		}
		if (childEditPart instanceof org.muml.testlanguage.diagram.edit.parts.NodeNodeFigureCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureNodeCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((org.muml.testlanguage.diagram.edit.parts.NodeNodeFigureCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof org.muml.testlanguage.diagram.edit.parts.NodeLabelEditPart) {
			return true;
		}
		if (childEditPart instanceof org.muml.testlanguage.diagram.edit.parts.NodeNodeFigureCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureNodeCompartmentFigure();
			pane.remove(((org.muml.testlanguage.diagram.edit.parts.NodeNodeFigureCompartmentEditPart) childEditPart)
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
		if (editPart instanceof org.muml.testlanguage.diagram.edit.parts.NodeNodeFigureCompartmentEditPart) {
			return getPrimaryShape().getFigureNodeCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * @generated
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		EditPolicy result = super.getPrimaryDragEditPolicy();
		if (result instanceof ResizableEditPolicy) {
			ResizableEditPolicy ep = (ResizableEditPolicy) result;
			ep.setResizeDirections(PositionConstants.WEST
					| PositionConstants.EAST);
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
	protected org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure createNodeFigure() {
		org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure figure = createNodePlate();
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
		return getChildBySemanticHint(org.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry
				.getType(org.muml.testlanguage.diagram.edit.parts.NodeLabelEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == org.muml.testlanguage.diagram.providers.TestLanguageElementTypes.Input_3001) {
				return getChildBySemanticHint(org.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry
						.getType(org.muml.testlanguage.diagram.edit.parts.NodeNodeFigureCompartmentEditPart.VISUAL_ID));
			}
			if (type == org.muml.testlanguage.diagram.providers.TestLanguageElementTypes.Output_3002) {
				return getChildBySemanticHint(org.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry
						.getType(org.muml.testlanguage.diagram.edit.parts.NodeNodeFigureCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class NodeFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureNodeCompartmentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodeLabelFigure;

		/**
		 * @generated
		 */
		public NodeFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = false;
			layoutThis.horizontalSpacing = 0;
			layoutThis.verticalSpacing = 0;
			layoutThis.marginWidth = 0;
			layoutThis.marginHeight = 0;
			this.setLayoutManager(layoutThis);

			this.setLineWidth(2);
			this.setForegroundColor(ColorConstants.black);
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(100),
					getMapMode().DPtoLP(0)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure fig0 = new RectangleFigure();

			fig0.setOutline(false);
			fig0.setFill(false);
			fig0.setOpaque(false);

			fig0.setBorder(new MarginBorder(getMapMode().DPtoLP(3),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(2),
					getMapMode().DPtoLP(2)));

			GridData constraintFig0 = new GridData();
			constraintFig0.verticalAlignment = GridData.FILL;
			constraintFig0.horizontalAlignment = GridData.FILL;
			constraintFig0.horizontalIndent = 0;
			constraintFig0.horizontalSpan = 1;
			constraintFig0.verticalSpan = 1;
			constraintFig0.grabExcessHorizontalSpace = true;
			constraintFig0.grabExcessVerticalSpace = false;
			this.add(fig0, constraintFig0);

			FlowLayout layoutFig0 = new FlowLayout();
			layoutFig0.setStretchMinorAxis(false);
			layoutFig0.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutFig0.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutFig0.setMajorSpacing(5);
			layoutFig0.setMinorSpacing(5);
			layoutFig0.setHorizontal(true);

			fig0.setLayoutManager(layoutFig0);

			fFigureNodeLabelFigure = new WrappingLabel();

			fFigureNodeLabelFigure.setText("");

			fig0.add(fFigureNodeLabelFigure);

			fFigureNodeCompartmentFigure = new RectangleFigure();

			fFigureNodeCompartmentFigure.setFill(false);
			fFigureNodeCompartmentFigure.setOutline(false);
			fFigureNodeCompartmentFigure.setLineWidth(0);

			fFigureNodeCompartmentFigure.setBorder(new MarginBorder(
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));

			GridData constraintFFigureNodeCompartmentFigure = new GridData();
			constraintFFigureNodeCompartmentFigure.verticalAlignment = GridData.FILL;
			constraintFFigureNodeCompartmentFigure.horizontalAlignment = GridData.FILL;
			constraintFFigureNodeCompartmentFigure.horizontalIndent = 0;
			constraintFFigureNodeCompartmentFigure.horizontalSpan = 1;
			constraintFFigureNodeCompartmentFigure.verticalSpan = 1;
			constraintFFigureNodeCompartmentFigure.grabExcessHorizontalSpace = true;
			constraintFFigureNodeCompartmentFigure.grabExcessVerticalSpace = false;
			this.add(fFigureNodeCompartmentFigure,
					constraintFFigureNodeCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureNodeCompartmentFigure() {
			return fFigureNodeCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodeLabelFigure() {
			return fFigureNodeLabelFigure;
		}

	}

}
