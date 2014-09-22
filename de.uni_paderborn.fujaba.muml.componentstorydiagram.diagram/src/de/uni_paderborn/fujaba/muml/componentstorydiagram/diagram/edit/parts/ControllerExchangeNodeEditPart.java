package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonShape;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
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
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.OneLineBorder;
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

/**
 * @generated
 */
public class ControllerExchangeNodeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3021;

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
	public ControllerExchangeNodeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(
				EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.policies.ControllerExchangeNodeItemSemanticEditPolicy());
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
		return primaryShape = new ControllerExchangeNodeFigure();
	}

	/**
	 * @generated
	 */
	public ControllerExchangeNodeFigure getPrimaryShape() {
		return (ControllerExchangeNodeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeNameEditPart) {
			((de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureControllerExchangeNodeName());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeControllerExchangeNodeFadingFunctionsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureControllerExchangeNodePatternContainer();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeControllerExchangeNodeFadingFunctionsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeNameEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeControllerExchangeNodeFadingFunctionsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureControllerExchangeNodePatternContainer();
			pane.remove(((de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeControllerExchangeNodeFadingFunctionsCompartmentEditPart) childEditPart)
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
		if (editPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeControllerExchangeNodeFadingFunctionsCompartmentEditPart) {
			return getPrimaryShape()
					.getFigureControllerExchangeNodePatternContainer();
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
		return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeNameEditPart.VISUAL_ID));
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
			if (type == de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ComponentStoryPattern_3022) {
				return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeControllerExchangeNodeFadingFunctionsCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class ControllerExchangeNodeFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureControllerExchangeNodeName;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureControllerExchangeNodePatternContainer;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureControllerExchangeNodeFadingFunctionsContainer;

		/**
		 * @generated
		 */
		private WrappingLabel fFigureControllerExchangeNodeIconLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureControllerExchangeNodeIconDeadline;

		/**
		 * @generated
		 */
		public ControllerExchangeNodeFigure() {

			BorderLayout layoutThis = new BorderLayout();
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(12),
					getMapMode().DPtoLP(12)));
			this.setFill(false);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure controllerExchangeNodeNameContainer0 = new RectangleFigure();

			controllerExchangeNodeNameContainer0.setFill(false);
			controllerExchangeNodeNameContainer0.setOutline(false);
			controllerExchangeNodeNameContainer0.setBorder(createBorder0());

			this.add(controllerExchangeNodeNameContainer0, BorderLayout.TOP);

			GridLayout layoutControllerExchangeNodeNameContainer0 = new GridLayout();
			layoutControllerExchangeNodeNameContainer0.numColumns = 1;
			layoutControllerExchangeNodeNameContainer0.makeColumnsEqualWidth = true;
			controllerExchangeNodeNameContainer0
					.setLayoutManager(layoutControllerExchangeNodeNameContainer0);

			fFigureControllerExchangeNodeName = new WrappingLabel();

			fFigureControllerExchangeNodeName.setText("");

			GridData constraintFFigureControllerExchangeNodeName = new GridData();
			constraintFFigureControllerExchangeNodeName.verticalAlignment = GridData.CENTER;
			constraintFFigureControllerExchangeNodeName.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureControllerExchangeNodeName.horizontalIndent = 0;
			constraintFFigureControllerExchangeNodeName.horizontalSpan = 1;
			constraintFFigureControllerExchangeNodeName.verticalSpan = 1;
			constraintFFigureControllerExchangeNodeName.grabExcessHorizontalSpace = true;
			constraintFFigureControllerExchangeNodeName.grabExcessVerticalSpace = true;
			controllerExchangeNodeNameContainer0.add(
					fFigureControllerExchangeNodeName,
					constraintFFigureControllerExchangeNodeName);

			RectangleFigure controllerExchangeNodeContentContainer0 = new RectangleFigure();

			controllerExchangeNodeContentContainer0.setFill(false);
			controllerExchangeNodeContentContainer0.setOutline(false);

			this.add(controllerExchangeNodeContentContainer0,
					BorderLayout.CENTER);

			GridLayout layoutControllerExchangeNodeContentContainer0 = new GridLayout();
			layoutControllerExchangeNodeContentContainer0.numColumns = 1;
			layoutControllerExchangeNodeContentContainer0.makeColumnsEqualWidth = true;
			controllerExchangeNodeContentContainer0
					.setLayoutManager(layoutControllerExchangeNodeContentContainer0);

			RectangleFigure controllerExchangeNodeIconContainer1 = new RectangleFigure();

			controllerExchangeNodeIconContainer1.setOutline(false);

			GridData constraintControllerExchangeNodeIconContainer1 = new GridData();
			constraintControllerExchangeNodeIconContainer1.verticalAlignment = GridData.BEGINNING;
			constraintControllerExchangeNodeIconContainer1.horizontalAlignment = GridData.FILL;
			constraintControllerExchangeNodeIconContainer1.horizontalIndent = 0;
			constraintControllerExchangeNodeIconContainer1.horizontalSpan = 1;
			constraintControllerExchangeNodeIconContainer1.verticalSpan = 1;
			constraintControllerExchangeNodeIconContainer1.grabExcessHorizontalSpace = true;
			constraintControllerExchangeNodeIconContainer1.grabExcessVerticalSpace = false;
			controllerExchangeNodeContentContainer0.add(
					controllerExchangeNodeIconContainer1,
					constraintControllerExchangeNodeIconContainer1);

			BorderLayout layoutControllerExchangeNodeIconContainer1 = new BorderLayout();
			controllerExchangeNodeIconContainer1
					.setLayoutManager(layoutControllerExchangeNodeIconContainer1);

			RectangleFigure controllerExchangeNodeIconHelper2 = new RectangleFigure();

			controllerExchangeNodeIconHelper2.setOutline(false);

			controllerExchangeNodeIconContainer1.add(
					controllerExchangeNodeIconHelper2, BorderLayout.CENTER);

			RectangleFigure controllerExchangeNodeIcon2 = new RectangleFigure();

			controllerExchangeNodeIconContainer1.add(
					controllerExchangeNodeIcon2, BorderLayout.RIGHT);

			BorderLayout layoutControllerExchangeNodeIcon2 = new BorderLayout();
			controllerExchangeNodeIcon2
					.setLayoutManager(layoutControllerExchangeNodeIcon2);

			RectangleFigure leftIconRectangle3 = new RectangleFigure();

			leftIconRectangle3.setOutline(false);

			controllerExchangeNodeIcon2.add(leftIconRectangle3,
					BorderLayout.LEFT);

			BorderLayout layoutLeftIconRectangle3 = new BorderLayout();
			leftIconRectangle3.setLayoutManager(layoutLeftIconRectangle3);

			RectangleFigure upperLeftIconRectangle4 = new RectangleFigure();

			upperLeftIconRectangle4.setOutline(false);

			leftIconRectangle3.add(upperLeftIconRectangle4, BorderLayout.TOP);

			BorderLayout layoutUpperLeftIconRectangle4 = new BorderLayout();
			upperLeftIconRectangle4
					.setLayoutManager(layoutUpperLeftIconRectangle4);

			RectangleFigure greenIconRectangle5 = new RectangleFigure();

			greenIconRectangle5.setForegroundColor(GREENICONRECTANGLE5_FORE);
			greenIconRectangle5.setPreferredSize(new Dimension(getMapMode()
					.DPtoLP(14), getMapMode().DPtoLP(14)));
			greenIconRectangle5.setMaximumSize(new Dimension(getMapMode()
					.DPtoLP(14), getMapMode().DPtoLP(14)));
			greenIconRectangle5.setMinimumSize(new Dimension(getMapMode()
					.DPtoLP(14), getMapMode().DPtoLP(14)));
			greenIconRectangle5.setSize(getMapMode().DPtoLP(14), getMapMode()
					.DPtoLP(14));

			upperLeftIconRectangle4.add(greenIconRectangle5, BorderLayout.LEFT);

			RectangleFigure leftArrowPolygonRectangle5 = new RectangleFigure();

			leftArrowPolygonRectangle5.setFill(false);
			leftArrowPolygonRectangle5.setOutline(false);
			leftArrowPolygonRectangle5.setPreferredSize(new Dimension(
					getMapMode().DPtoLP(7), getMapMode().DPtoLP(14)));

			upperLeftIconRectangle4.add(leftArrowPolygonRectangle5,
					BorderLayout.RIGHT);

			PolygonShape leftArrowPolygon6 = new PolygonShape();

			leftArrowPolygon6.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(7)));
			leftArrowPolygon6.addPoint(new Point(getMapMode().DPtoLP(7),
					getMapMode().DPtoLP(0)));
			leftArrowPolygon6.addPoint(new Point(getMapMode().DPtoLP(7),
					getMapMode().DPtoLP(14)));
			leftArrowPolygon6.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(7)));
			leftArrowPolygon6.setFill(true);
			leftArrowPolygon6.setForegroundColor(ColorConstants.black);
			leftArrowPolygon6.setBackgroundColor(ColorConstants.black);
			leftArrowPolygon6.setPreferredSize(new Dimension(getMapMode()
					.DPtoLP(7), getMapMode().DPtoLP(14)));
			leftArrowPolygon6.setMaximumSize(new Dimension(getMapMode().DPtoLP(
					7), getMapMode().DPtoLP(14)));
			leftArrowPolygon6.setMinimumSize(new Dimension(getMapMode().DPtoLP(
					7), getMapMode().DPtoLP(14)));
			leftArrowPolygon6.setSize(getMapMode().DPtoLP(7), getMapMode()
					.DPtoLP(14));

			leftArrowPolygonRectangle5.add(leftArrowPolygon6);

			RectangleFigure lowerLeftIconRectangle4 = new RectangleFigure();

			lowerLeftIconRectangle4.setOutline(false);

			leftIconRectangle3
					.add(lowerLeftIconRectangle4, BorderLayout.CENTER);

			RectangleFigure middleIconRectangle3 = new RectangleFigure();

			middleIconRectangle3.setOutline(false);

			controllerExchangeNodeIcon2.add(middleIconRectangle3,
					BorderLayout.CENTER);

			GridLayout layoutMiddleIconRectangle3 = new GridLayout();
			layoutMiddleIconRectangle3.numColumns = 1;
			layoutMiddleIconRectangle3.makeColumnsEqualWidth = true;
			middleIconRectangle3.setLayoutManager(layoutMiddleIconRectangle3);

			RectangleFigure upperLineHelper4 = new RectangleFigure();

			upperLineHelper4.setFill(false);
			upperLineHelper4.setOutline(false);
			upperLineHelper4.setPreferredSize(new Dimension(getMapMode()
					.DPtoLP(1), getMapMode().DPtoLP(6)));
			upperLineHelper4.setMaximumSize(new Dimension(getMapMode()
					.DPtoLP(1), getMapMode().DPtoLP(6)));
			upperLineHelper4.setMinimumSize(new Dimension(getMapMode()
					.DPtoLP(1), getMapMode().DPtoLP(6)));
			upperLineHelper4.setSize(getMapMode().DPtoLP(1), getMapMode()
					.DPtoLP(6));

			GridData constraintUpperLineHelper4 = new GridData();
			constraintUpperLineHelper4.verticalAlignment = GridData.BEGINNING;
			constraintUpperLineHelper4.horizontalAlignment = GridData.BEGINNING;
			constraintUpperLineHelper4.horizontalIndent = 0;
			constraintUpperLineHelper4.horizontalSpan = 1;
			constraintUpperLineHelper4.verticalSpan = 1;
			constraintUpperLineHelper4.grabExcessHorizontalSpace = false;
			constraintUpperLineHelper4.grabExcessVerticalSpace = false;
			middleIconRectangle3.add(upperLineHelper4,
					constraintUpperLineHelper4);

			ScalablePolygonShape linePolygon4 = new ScalablePolygonShape();

			linePolygon4.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));
			linePolygon4.addPoint(new Point(getMapMode().DPtoLP(1),
					getMapMode().DPtoLP(0)));
			linePolygon4.setFill(true);
			linePolygon4.setLineWidth(2);

			GridData constraintLinePolygon4 = new GridData();
			constraintLinePolygon4.verticalAlignment = GridData.FILL;
			constraintLinePolygon4.horizontalAlignment = GridData.CENTER;
			constraintLinePolygon4.horizontalIndent = 0;
			constraintLinePolygon4.horizontalSpan = 1;
			constraintLinePolygon4.verticalSpan = 1;
			constraintLinePolygon4.grabExcessHorizontalSpace = false;
			constraintLinePolygon4.grabExcessVerticalSpace = true;
			middleIconRectangle3.add(linePolygon4, constraintLinePolygon4);

			RectangleFigure labelRectangle4 = new RectangleFigure();

			labelRectangle4.setOutline(false);

			GridData constraintLabelRectangle4 = new GridData();
			constraintLabelRectangle4.verticalAlignment = GridData.END;
			constraintLabelRectangle4.horizontalAlignment = GridData.FILL;
			constraintLabelRectangle4.horizontalIndent = 0;
			constraintLabelRectangle4.horizontalSpan = 1;
			constraintLabelRectangle4.verticalSpan = 1;
			constraintLabelRectangle4.grabExcessHorizontalSpace = false;
			constraintLabelRectangle4.grabExcessVerticalSpace = false;
			middleIconRectangle3
					.add(labelRectangle4, constraintLabelRectangle4);

			BorderLayout layoutLabelRectangle4 = new BorderLayout();
			labelRectangle4.setLayoutManager(layoutLabelRectangle4);

			fFigureControllerExchangeNodeIconLabel = new WrappingLabel();

			fFigureControllerExchangeNodeIconLabel.setText("");

			fFigureControllerExchangeNodeIconLabel
					.setFont(FFIGURECONTROLLEREXCHANGENODEICONLABEL_FONT);

			labelRectangle4.add(fFigureControllerExchangeNodeIconLabel,
					BorderLayout.LEFT);

			fFigureControllerExchangeNodeIconDeadline = new WrappingLabel();

			fFigureControllerExchangeNodeIconDeadline.setText("");

			fFigureControllerExchangeNodeIconDeadline
					.setFont(FFIGURECONTROLLEREXCHANGENODEICONDEADLINE_FONT);

			labelRectangle4.add(fFigureControllerExchangeNodeIconDeadline,
					BorderLayout.RIGHT);

			RectangleFigure rightIconRectangle3 = new RectangleFigure();

			rightIconRectangle3.setOutline(false);

			controllerExchangeNodeIcon2.add(rightIconRectangle3,
					BorderLayout.RIGHT);

			BorderLayout layoutRightIconRectangle3 = new BorderLayout();
			rightIconRectangle3.setLayoutManager(layoutRightIconRectangle3);

			RectangleFigure upperRightIconRectangle4 = new RectangleFigure();

			upperRightIconRectangle4.setOutline(false);

			rightIconRectangle3.add(upperRightIconRectangle4, BorderLayout.TOP);

			BorderLayout layoutUpperRightIconRectangle4 = new BorderLayout();
			upperRightIconRectangle4
					.setLayoutManager(layoutUpperRightIconRectangle4);

			RectangleFigure rightArrowPolygonRectangle5 = new RectangleFigure();

			rightArrowPolygonRectangle5.setFill(false);
			rightArrowPolygonRectangle5.setOutline(false);
			rightArrowPolygonRectangle5.setPreferredSize(new Dimension(
					getMapMode().DPtoLP(7), getMapMode().DPtoLP(14)));

			upperRightIconRectangle4.add(rightArrowPolygonRectangle5,
					BorderLayout.LEFT);

			PolygonShape rightArrowPolygon6 = new PolygonShape();

			rightArrowPolygon6.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));
			rightArrowPolygon6.addPoint(new Point(getMapMode().DPtoLP(7),
					getMapMode().DPtoLP(7)));
			rightArrowPolygon6.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(14)));
			rightArrowPolygon6.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));
			rightArrowPolygon6.setFill(true);
			rightArrowPolygon6.setForegroundColor(ColorConstants.black);
			rightArrowPolygon6.setBackgroundColor(ColorConstants.black);
			rightArrowPolygon6.setPreferredSize(new Dimension(getMapMode()
					.DPtoLP(7), getMapMode().DPtoLP(14)));
			rightArrowPolygon6.setMaximumSize(new Dimension(getMapMode()
					.DPtoLP(7), getMapMode().DPtoLP(14)));
			rightArrowPolygon6.setMinimumSize(new Dimension(getMapMode()
					.DPtoLP(7), getMapMode().DPtoLP(14)));
			rightArrowPolygon6.setSize(getMapMode().DPtoLP(7), getMapMode()
					.DPtoLP(14));

			rightArrowPolygonRectangle5.add(rightArrowPolygon6);

			RectangleFigure redIconRectangle5 = new RectangleFigure();

			redIconRectangle5.setForegroundColor(REDICONRECTANGLE5_FORE);
			redIconRectangle5.setPreferredSize(new Dimension(getMapMode()
					.DPtoLP(14), getMapMode().DPtoLP(14)));

			upperRightIconRectangle4.add(redIconRectangle5, BorderLayout.RIGHT);

			RectangleFigure lowerRightIconRectangle4 = new RectangleFigure();

			lowerRightIconRectangle4.setOutline(false);

			rightIconRectangle3.add(lowerRightIconRectangle4,
					BorderLayout.CENTER);

			fFigureControllerExchangeNodeFadingFunctionsContainer = new RectangleFigure();

			fFigureControllerExchangeNodeFadingFunctionsContainer
					.setOutline(false);

			GridData constraintFFigureControllerExchangeNodeFadingFunctionsContainer = new GridData();
			constraintFFigureControllerExchangeNodeFadingFunctionsContainer.verticalAlignment = GridData.CENTER;
			constraintFFigureControllerExchangeNodeFadingFunctionsContainer.horizontalAlignment = GridData.FILL;
			constraintFFigureControllerExchangeNodeFadingFunctionsContainer.horizontalIndent = 0;
			constraintFFigureControllerExchangeNodeFadingFunctionsContainer.horizontalSpan = 1;
			constraintFFigureControllerExchangeNodeFadingFunctionsContainer.verticalSpan = 1;
			constraintFFigureControllerExchangeNodeFadingFunctionsContainer.grabExcessHorizontalSpace = true;
			constraintFFigureControllerExchangeNodeFadingFunctionsContainer.grabExcessVerticalSpace = false;
			controllerExchangeNodeContentContainer0
					.add(fFigureControllerExchangeNodeFadingFunctionsContainer,
							constraintFFigureControllerExchangeNodeFadingFunctionsContainer);

			fFigureControllerExchangeNodePatternContainer = new RectangleFigure();

			fFigureControllerExchangeNodePatternContainer.setFill(false);
			fFigureControllerExchangeNodePatternContainer.setOutline(false);

			GridData constraintFFigureControllerExchangeNodePatternContainer = new GridData();
			constraintFFigureControllerExchangeNodePatternContainer.verticalAlignment = GridData.FILL;
			constraintFFigureControllerExchangeNodePatternContainer.horizontalAlignment = GridData.FILL;
			constraintFFigureControllerExchangeNodePatternContainer.horizontalIndent = 0;
			constraintFFigureControllerExchangeNodePatternContainer.horizontalSpan = 1;
			constraintFFigureControllerExchangeNodePatternContainer.verticalSpan = 1;
			constraintFFigureControllerExchangeNodePatternContainer.grabExcessHorizontalSpace = true;
			constraintFFigureControllerExchangeNodePatternContainer.grabExcessVerticalSpace = true;
			controllerExchangeNodeContentContainer0.add(
					fFigureControllerExchangeNodePatternContainer,
					constraintFFigureControllerExchangeNodePatternContainer);

		}

		/**
		 * @generated
		 */
		private Border createBorder0() {
			OneLineBorder result = new OneLineBorder();
			result.setPosition(PositionConstants.BOTTOM);

			return result;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureControllerExchangeNodeName() {
			return fFigureControllerExchangeNodeName;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureControllerExchangeNodePatternContainer() {
			return fFigureControllerExchangeNodePatternContainer;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureControllerExchangeNodeFadingFunctionsContainer() {
			return fFigureControllerExchangeNodeFadingFunctionsContainer;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureControllerExchangeNodeIconLabel() {
			return fFigureControllerExchangeNodeIconLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureControllerExchangeNodeIconDeadline() {
			return fFigureControllerExchangeNodeIconDeadline;
		}

	}

	/**
	 * @generated
	 */
	static final Color GREENICONRECTANGLE5_FORE = new Color(null, 0, 192, 0);

	/**
	 * @generated
	 */
	static final Font FFIGURECONTROLLEREXCHANGENODEICONLABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 8, SWT.ITALIC);

	/**
	 * @generated
	 */
	static final Font FFIGURECONTROLLEREXCHANGENODEICONDEADLINE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 8, SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Color REDICONRECTANGLE5_FORE = new Color(null, 192, 0, 0);

}
