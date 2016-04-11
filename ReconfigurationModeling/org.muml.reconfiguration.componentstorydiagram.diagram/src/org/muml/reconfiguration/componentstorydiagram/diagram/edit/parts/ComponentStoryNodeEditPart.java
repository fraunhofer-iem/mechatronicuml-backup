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
package org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts;

import java.util.Collection;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
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
import org.eclipse.swt.graphics.Color;
import org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy;
import org.muml.core.common.edit.policies.anchor.IConnectionAnchorCreationEditPolicy;
import org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy;
import org.muml.pim.common.edit.policies.IBackgroundColorEditPolicy;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.policies.ComponentStoryNodeItemSemanticEditPolicy;
import org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry;
import org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes;

/**
 * @generated
 */
public class ComponentStoryNodeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3001;

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
	public ComponentStoryNodeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(ComponentStoryDiagramVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ComponentStoryNodeItemSemanticEditPolicy());
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
		return primaryShape = new ComponentStoryNodeRoundedFigureForEach();
	}

	/**
	 * @generated
	 */
	public ComponentStoryNodeRoundedFigureForEach getPrimaryShape() {
		return (ComponentStoryNodeRoundedFigureForEach) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ComponentStoryNodeNameEditPart) {
			((ComponentStoryNodeNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureComponentStoryNodeName());
			return true;
		}
		if (childEditPart instanceof ComponentStoryNodeComponentStoryNodeCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureComponentStoryNodePatternContainer();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ComponentStoryNodeComponentStoryNodeCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ComponentStoryNodeNameEditPart) {
			return true;
		}
		if (childEditPart instanceof ComponentStoryNodeComponentStoryNodeCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureComponentStoryNodePatternContainer();
			pane.remove(((ComponentStoryNodeComponentStoryNodeCompartmentEditPart) childEditPart).getFigure());
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
		if (editPart instanceof ComponentStoryNodeComponentStoryNodeCompartmentEditPart) {
			return getPrimaryShape().getFigureComponentStoryNodePatternContainer();
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
		return getChildBySemanticHint(
				ComponentStoryDiagramVisualIDRegistry.getType(ComponentStoryNodeNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == ComponentStoryDiagramElementTypes.ComponentStoryPattern_3011) {
				return getChildBySemanticHint(ComponentStoryDiagramVisualIDRegistry
						.getType(ComponentStoryNodeComponentStoryNodeCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class ComponentStoryNodeRoundedFigureForEach extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureComponentStoryNodeName;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureComponentStoryNodePatternContainer;

		/**
		 * @generated
		 */
		private RoundedRectangle fFigureInnerRoundedRectangleContainer;

		/**
		 * @generated
		 */
		public ComponentStoryNodeRoundedFigureForEach() {
			this.setLayoutManager(new StackLayout());
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(12), getMapMode().DPtoLP(12)));
			this.setFill(false);
			this.setOutline(false);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RoundedRectangle aux10 = new RoundedRectangle();

			aux10.setCornerDimensions(new Dimension(getMapMode().DPtoLP(12), getMapMode().DPtoLP(12)));
			aux10.setFill(false);
			aux10.setOutline(false);
			aux10.setBorder(new MarginBorder(getMapMode().DPtoLP(0), getMapMode().DPtoLP(3), getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(0)));

			this.add(aux10);
			aux10.setLayoutManager(new StackLayout());

			RoundedRectangle shadow1 = new RoundedRectangle();

			shadow1.setCornerDimensions(new Dimension(getMapMode().DPtoLP(12), getMapMode().DPtoLP(12)));

			aux10.add(shadow1);

			fFigureInnerRoundedRectangleContainer = new RoundedRectangle();

			fFigureInnerRoundedRectangleContainer
					.setCornerDimensions(new Dimension(getMapMode().DPtoLP(12), getMapMode().DPtoLP(12)));
			fFigureInnerRoundedRectangleContainer.setFill(false);
			fFigureInnerRoundedRectangleContainer.setOutline(false);
			fFigureInnerRoundedRectangleContainer.setBorder(new MarginBorder(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(0), getMapMode().DPtoLP(3)));

			this.add(fFigureInnerRoundedRectangleContainer);
			fFigureInnerRoundedRectangleContainer.setLayoutManager(new StackLayout());

			RoundedRectangle componentStoryNodeRoundedFigure1 = new RoundedRectangle();

			componentStoryNodeRoundedFigure1
					.setCornerDimensions(new Dimension(getMapMode().DPtoLP(12), getMapMode().DPtoLP(12)));

			fFigureInnerRoundedRectangleContainer.add(componentStoryNodeRoundedFigure1);

			BorderLayout layoutComponentStoryNodeRoundedFigure1 = new BorderLayout();
			componentStoryNodeRoundedFigure1.setLayoutManager(layoutComponentStoryNodeRoundedFigure1);

			RectangleFigure storyNodeNameContainer2 = new RectangleFigure();

			storyNodeNameContainer2.setFill(false);
			storyNodeNameContainer2.setOutline(false);

			componentStoryNodeRoundedFigure1.add(storyNodeNameContainer2, BorderLayout.TOP);

			GridLayout layoutStoryNodeNameContainer2 = new GridLayout();
			layoutStoryNodeNameContainer2.numColumns = 1;
			layoutStoryNodeNameContainer2.makeColumnsEqualWidth = true;
			storyNodeNameContainer2.setLayoutManager(layoutStoryNodeNameContainer2);

			fFigureComponentStoryNodeName = new WrappingLabel();

			fFigureComponentStoryNodeName.setText("");

			GridData constraintFFigureComponentStoryNodeName = new GridData();
			constraintFFigureComponentStoryNodeName.verticalAlignment = GridData.CENTER;
			constraintFFigureComponentStoryNodeName.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureComponentStoryNodeName.horizontalIndent = 0;
			constraintFFigureComponentStoryNodeName.horizontalSpan = 1;
			constraintFFigureComponentStoryNodeName.verticalSpan = 1;
			constraintFFigureComponentStoryNodeName.grabExcessHorizontalSpace = false;
			constraintFFigureComponentStoryNodeName.grabExcessVerticalSpace = false;
			storyNodeNameContainer2.add(fFigureComponentStoryNodeName, constraintFFigureComponentStoryNodeName);

			RectangleFigure componentStoryNodeContentContainer2 = new RectangleFigure();

			componentStoryNodeContentContainer2.setFill(false);
			componentStoryNodeContentContainer2.setOutline(false);

			componentStoryNodeRoundedFigure1.add(componentStoryNodeContentContainer2, BorderLayout.CENTER);

			BorderLayout layoutComponentStoryNodeContentContainer2 = new BorderLayout();
			componentStoryNodeContentContainer2.setLayoutManager(layoutComponentStoryNodeContentContainer2);

			fFigureComponentStoryNodePatternContainer = new RectangleFigure();

			fFigureComponentStoryNodePatternContainer.setFill(false);
			fFigureComponentStoryNodePatternContainer.setOutline(false);

			componentStoryNodeContentContainer2.add(fFigureComponentStoryNodePatternContainer, BorderLayout.CENTER);

			// Process FigureRef details

			fFigureInnerRoundedRectangleContainer.add(componentStoryNodeRoundedFigure1);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureComponentStoryNodeName() {
			return fFigureComponentStoryNodeName;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureComponentStoryNodePatternContainer() {
			return fFigureComponentStoryNodePatternContainer;
		}

		/**
		 * @generated
		 */
		public RoundedRectangle getFigureInnerRoundedRectangleContainer() {
			return fFigureInnerRoundedRectangleContainer;
		}

	}

}
