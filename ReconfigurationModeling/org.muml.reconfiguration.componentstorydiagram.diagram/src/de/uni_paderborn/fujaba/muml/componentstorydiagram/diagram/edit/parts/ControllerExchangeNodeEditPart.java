/*
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts;

import java.util.Collection;

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
				new org.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy());

		installEditPolicy(
				org.muml.common.edit.policies.EditPolicyRoles.ERROR_FEEDBACK_ROLE,
				new org.muml.common.edit.policies.ErrorFeedbackEditPolicy());

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
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabel8EditPart) {
			((de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabel8EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureDeadlineLabel());
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
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabel8EditPart) {
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
		private WrappingLabel fFigureControllerExchangeNodeIconLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureControllerExchangeNodeIconDeadline;

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDeadlineLabel;

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

			RectangleFigure iconRow2 = new RectangleFigure();

			controllerExchangeNodeIconContainer1
					.add(iconRow2, BorderLayout.TOP);

			BorderLayout layoutIconRow2 = new BorderLayout();
			iconRow2.setLayoutManager(layoutIconRow2);

			RectangleFigure controllerExchangeNodeIconHelper3 = new RectangleFigure();

			controllerExchangeNodeIconHelper3.setOutline(false);

			iconRow2.add(controllerExchangeNodeIconHelper3, BorderLayout.CENTER);

			RectangleFigure controllerExchangeNodeIcon3 = new RectangleFigure();

			iconRow2.add(controllerExchangeNodeIcon3, BorderLayout.RIGHT);

			BorderLayout layoutControllerExchangeNodeIcon3 = new BorderLayout();
			controllerExchangeNodeIcon3
					.setLayoutManager(layoutControllerExchangeNodeIcon3);

			RectangleFigure leftIconRectangle4 = new RectangleFigure();

			leftIconRectangle4.setOutline(false);

			controllerExchangeNodeIcon3.add(leftIconRectangle4,
					BorderLayout.LEFT);

			BorderLayout layoutLeftIconRectangle4 = new BorderLayout();
			leftIconRectangle4.setLayoutManager(layoutLeftIconRectangle4);

			RectangleFigure upperLeftIconRectangle5 = new RectangleFigure();

			upperLeftIconRectangle5.setOutline(false);

			leftIconRectangle4.add(upperLeftIconRectangle5, BorderLayout.TOP);

			BorderLayout layoutUpperLeftIconRectangle5 = new BorderLayout();
			upperLeftIconRectangle5
					.setLayoutManager(layoutUpperLeftIconRectangle5);

			RectangleFigure greenIconRectangle6 = new RectangleFigure();

			greenIconRectangle6.setForegroundColor(GREENICONRECTANGLE6_FORE);
			greenIconRectangle6.setPreferredSize(new Dimension(getMapMode()
					.DPtoLP(14), getMapMode().DPtoLP(14)));
			greenIconRectangle6.setMaximumSize(new Dimension(getMapMode()
					.DPtoLP(14), getMapMode().DPtoLP(14)));
			greenIconRectangle6.setMinimumSize(new Dimension(getMapMode()
					.DPtoLP(14), getMapMode().DPtoLP(14)));
			greenIconRectangle6.setSize(getMapMode().DPtoLP(14), getMapMode()
					.DPtoLP(14));

			upperLeftIconRectangle5.add(greenIconRectangle6, BorderLayout.LEFT);

			RectangleFigure leftArrowPolygonRectangle6 = new RectangleFigure();

			leftArrowPolygonRectangle6.setFill(false);
			leftArrowPolygonRectangle6.setOutline(false);
			leftArrowPolygonRectangle6.setPreferredSize(new Dimension(
					getMapMode().DPtoLP(7), getMapMode().DPtoLP(14)));

			upperLeftIconRectangle5.add(leftArrowPolygonRectangle6,
					BorderLayout.RIGHT);

			PolygonShape leftArrowPolygon7 = new PolygonShape();

			leftArrowPolygon7.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(7)));
			leftArrowPolygon7.addPoint(new Point(getMapMode().DPtoLP(7),
					getMapMode().DPtoLP(0)));
			leftArrowPolygon7.addPoint(new Point(getMapMode().DPtoLP(7),
					getMapMode().DPtoLP(14)));
			leftArrowPolygon7.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(7)));
			leftArrowPolygon7.setFill(true);
			leftArrowPolygon7.setForegroundColor(ColorConstants.black);
			leftArrowPolygon7.setBackgroundColor(ColorConstants.black);
			leftArrowPolygon7.setPreferredSize(new Dimension(getMapMode()
					.DPtoLP(7), getMapMode().DPtoLP(14)));
			leftArrowPolygon7.setMaximumSize(new Dimension(getMapMode().DPtoLP(
					7), getMapMode().DPtoLP(14)));
			leftArrowPolygon7.setMinimumSize(new Dimension(getMapMode().DPtoLP(
					7), getMapMode().DPtoLP(14)));
			leftArrowPolygon7.setSize(getMapMode().DPtoLP(7), getMapMode()
					.DPtoLP(14));

			leftArrowPolygonRectangle6.add(leftArrowPolygon7);

			RectangleFigure lowerLeftIconRectangle5 = new RectangleFigure();

			lowerLeftIconRectangle5.setOutline(false);

			leftIconRectangle4
					.add(lowerLeftIconRectangle5, BorderLayout.CENTER);

			RectangleFigure middleIconRectangle4 = new RectangleFigure();

			middleIconRectangle4.setOutline(false);

			controllerExchangeNodeIcon3.add(middleIconRectangle4,
					BorderLayout.CENTER);

			GridLayout layoutMiddleIconRectangle4 = new GridLayout();
			layoutMiddleIconRectangle4.numColumns = 1;
			layoutMiddleIconRectangle4.makeColumnsEqualWidth = true;
			middleIconRectangle4.setLayoutManager(layoutMiddleIconRectangle4);

			RectangleFigure upperLineHelper5 = new RectangleFigure();

			upperLineHelper5.setFill(false);
			upperLineHelper5.setOutline(false);
			upperLineHelper5.setPreferredSize(new Dimension(getMapMode()
					.DPtoLP(1), getMapMode().DPtoLP(6)));
			upperLineHelper5.setMaximumSize(new Dimension(getMapMode()
					.DPtoLP(1), getMapMode().DPtoLP(6)));
			upperLineHelper5.setMinimumSize(new Dimension(getMapMode()
					.DPtoLP(1), getMapMode().DPtoLP(6)));
			upperLineHelper5.setSize(getMapMode().DPtoLP(1), getMapMode()
					.DPtoLP(6));

			GridData constraintUpperLineHelper5 = new GridData();
			constraintUpperLineHelper5.verticalAlignment = GridData.BEGINNING;
			constraintUpperLineHelper5.horizontalAlignment = GridData.BEGINNING;
			constraintUpperLineHelper5.horizontalIndent = 0;
			constraintUpperLineHelper5.horizontalSpan = 1;
			constraintUpperLineHelper5.verticalSpan = 1;
			constraintUpperLineHelper5.grabExcessHorizontalSpace = false;
			constraintUpperLineHelper5.grabExcessVerticalSpace = false;
			middleIconRectangle4.add(upperLineHelper5,
					constraintUpperLineHelper5);

			ScalablePolygonShape linePolygon5 = new ScalablePolygonShape();

			linePolygon5.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));
			linePolygon5.addPoint(new Point(getMapMode().DPtoLP(1),
					getMapMode().DPtoLP(0)));
			linePolygon5.setFill(true);
			linePolygon5.setLineWidth(2);

			GridData constraintLinePolygon5 = new GridData();
			constraintLinePolygon5.verticalAlignment = GridData.FILL;
			constraintLinePolygon5.horizontalAlignment = GridData.CENTER;
			constraintLinePolygon5.horizontalIndent = 0;
			constraintLinePolygon5.horizontalSpan = 1;
			constraintLinePolygon5.verticalSpan = 1;
			constraintLinePolygon5.grabExcessHorizontalSpace = false;
			constraintLinePolygon5.grabExcessVerticalSpace = true;
			middleIconRectangle4.add(linePolygon5, constraintLinePolygon5);

			RectangleFigure labelRectangle5 = new RectangleFigure();

			labelRectangle5.setOutline(false);

			GridData constraintLabelRectangle5 = new GridData();
			constraintLabelRectangle5.verticalAlignment = GridData.END;
			constraintLabelRectangle5.horizontalAlignment = GridData.FILL;
			constraintLabelRectangle5.horizontalIndent = 0;
			constraintLabelRectangle5.horizontalSpan = 1;
			constraintLabelRectangle5.verticalSpan = 1;
			constraintLabelRectangle5.grabExcessHorizontalSpace = false;
			constraintLabelRectangle5.grabExcessVerticalSpace = false;
			middleIconRectangle4
					.add(labelRectangle5, constraintLabelRectangle5);

			BorderLayout layoutLabelRectangle5 = new BorderLayout();
			labelRectangle5.setLayoutManager(layoutLabelRectangle5);

			fFigureControllerExchangeNodeIconLabel = new WrappingLabel();

			fFigureControllerExchangeNodeIconLabel.setText("");

			fFigureControllerExchangeNodeIconLabel
					.setFont(FFIGURECONTROLLEREXCHANGENODEICONLABEL_FONT);

			labelRectangle5.add(fFigureControllerExchangeNodeIconLabel,
					BorderLayout.LEFT);

			fFigureControllerExchangeNodeIconDeadline = new WrappingLabel();

			fFigureControllerExchangeNodeIconDeadline.setText("");

			fFigureControllerExchangeNodeIconDeadline
					.setFont(FFIGURECONTROLLEREXCHANGENODEICONDEADLINE_FONT);

			labelRectangle5.add(fFigureControllerExchangeNodeIconDeadline,
					BorderLayout.RIGHT);

			RectangleFigure rightIconRectangle4 = new RectangleFigure();

			rightIconRectangle4.setOutline(false);

			controllerExchangeNodeIcon3.add(rightIconRectangle4,
					BorderLayout.RIGHT);

			BorderLayout layoutRightIconRectangle4 = new BorderLayout();
			rightIconRectangle4.setLayoutManager(layoutRightIconRectangle4);

			RectangleFigure upperRightIconRectangle5 = new RectangleFigure();

			upperRightIconRectangle5.setOutline(false);

			rightIconRectangle4.add(upperRightIconRectangle5, BorderLayout.TOP);

			BorderLayout layoutUpperRightIconRectangle5 = new BorderLayout();
			upperRightIconRectangle5
					.setLayoutManager(layoutUpperRightIconRectangle5);

			RectangleFigure rightArrowPolygonRectangle6 = new RectangleFigure();

			rightArrowPolygonRectangle6.setFill(false);
			rightArrowPolygonRectangle6.setOutline(false);
			rightArrowPolygonRectangle6.setPreferredSize(new Dimension(
					getMapMode().DPtoLP(7), getMapMode().DPtoLP(14)));

			upperRightIconRectangle5.add(rightArrowPolygonRectangle6,
					BorderLayout.LEFT);

			PolygonShape rightArrowPolygon7 = new PolygonShape();

			rightArrowPolygon7.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));
			rightArrowPolygon7.addPoint(new Point(getMapMode().DPtoLP(7),
					getMapMode().DPtoLP(7)));
			rightArrowPolygon7.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(14)));
			rightArrowPolygon7.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));
			rightArrowPolygon7.setFill(true);
			rightArrowPolygon7.setForegroundColor(ColorConstants.black);
			rightArrowPolygon7.setBackgroundColor(ColorConstants.black);
			rightArrowPolygon7.setPreferredSize(new Dimension(getMapMode()
					.DPtoLP(7), getMapMode().DPtoLP(14)));
			rightArrowPolygon7.setMaximumSize(new Dimension(getMapMode()
					.DPtoLP(7), getMapMode().DPtoLP(14)));
			rightArrowPolygon7.setMinimumSize(new Dimension(getMapMode()
					.DPtoLP(7), getMapMode().DPtoLP(14)));
			rightArrowPolygon7.setSize(getMapMode().DPtoLP(7), getMapMode()
					.DPtoLP(14));

			rightArrowPolygonRectangle6.add(rightArrowPolygon7);

			RectangleFigure redIconRectangle6 = new RectangleFigure();

			redIconRectangle6.setForegroundColor(REDICONRECTANGLE6_FORE);
			redIconRectangle6.setPreferredSize(new Dimension(getMapMode()
					.DPtoLP(14), getMapMode().DPtoLP(14)));

			upperRightIconRectangle5.add(redIconRectangle6, BorderLayout.RIGHT);

			RectangleFigure lowerRightIconRectangle5 = new RectangleFigure();

			lowerRightIconRectangle5.setOutline(false);

			rightIconRectangle4.add(lowerRightIconRectangle5,
					BorderLayout.CENTER);

			RectangleFigure deadlineRow2 = new RectangleFigure();

			controllerExchangeNodeIconContainer1.add(deadlineRow2,
					BorderLayout.BOTTOM);

			BorderLayout layoutDeadlineRow2 = new BorderLayout();
			deadlineRow2.setLayoutManager(layoutDeadlineRow2);

			RectangleFigure controllerExchangeNodeDeadlineHelper3 = new RectangleFigure();

			controllerExchangeNodeDeadlineHelper3.setOutline(false);

			deadlineRow2.add(controllerExchangeNodeDeadlineHelper3,
					BorderLayout.CENTER);

			RectangleFigure deadlineLabelContainer3 = new RectangleFigure();

			deadlineLabelContainer3.setOutline(false);

			deadlineRow2.add(deadlineLabelContainer3, BorderLayout.RIGHT);

			GridLayout layoutDeadlineLabelContainer3 = new GridLayout();
			layoutDeadlineLabelContainer3.numColumns = 1;
			layoutDeadlineLabelContainer3.makeColumnsEqualWidth = true;
			deadlineLabelContainer3
					.setLayoutManager(layoutDeadlineLabelContainer3);

			fFigureDeadlineLabel = new WrappingLabel();

			fFigureDeadlineLabel.setText("");

			deadlineLabelContainer3.add(fFigureDeadlineLabel);

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
		public WrappingLabel getFigureControllerExchangeNodeIconLabel() {
			return fFigureControllerExchangeNodeIconLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureControllerExchangeNodeIconDeadline() {
			return fFigureControllerExchangeNodeIconDeadline;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDeadlineLabel() {
			return fFigureDeadlineLabel;
		}

	}

	/**
	 * @generated
	 */
	static final Color GREENICONRECTANGLE6_FORE = new Color(null, 0, 192, 0);

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
	static final Color REDICONRECTANGLE6_FORE = new Color(null, 192, 0, 0);

}
