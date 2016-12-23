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
package org.muml.pim.realtimestatechart.diagram.edit.parts;

import java.util.Collection;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
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
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
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
import org.muml.pim.common.edit.policies.statechart.StateEditPolicy;
import org.muml.pim.realtimestatechart.diagram.edit.policies.StateCanonicalEditPolicy;
import org.muml.pim.realtimestatechart.diagram.edit.policies.StateItemSemanticEditPolicy;
import org.muml.pim.realtimestatechart.diagram.edit.policies.statechart.StateColorEditPolicy;
import org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry;
import org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes;

/**
 * @generated
 */
public class StateEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3032;

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
	public StateEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(MumlVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new StateItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new StateCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());

		installEditPolicy(org.muml.pim.common.edit.policies.EditPolicyRoles.STATE_VISUALIZATION_ROLE,
				new StateEditPolicy());

		installEditPolicy(org.muml.pim.common.edit.policies.EditPolicyRoles.STATE_COLOR_ROLE,
				new StateColorEditPolicy());

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
				switch (MumlVisualIDRegistry.getVisualID(childView)) {
				case EntryPointEditPart.VISUAL_ID:
				case ExitPointEditPart.VISUAL_ID:
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
		return primaryShape = new StateFigure();
	}

	/**
	 * @generated
	 */
	public StateFigure getPrimaryShape() {
		return (StateFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof StateNameEditPart) {
			((StateNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureStateNameLabel());
			return true;
		}
		if (childEditPart instanceof StateActionCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureActionCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((StateActionCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof StateRegionCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureRegionsCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((StateRegionCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof StateChannelCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureChannelCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((StateChannelCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof StateInvariantCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureInvariantCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((StateInvariantCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof EntryPointEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.WEST);
			getBorderedFigure().getBorderItemContainer().add(((EntryPointEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof ExitPointEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.EAST);
			getBorderedFigure().getBorderItemContainer().add(((ExitPointEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof StateNameEditPart) {
			return true;
		}
		if (childEditPart instanceof StateActionCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureActionCompartment();
			pane.remove(((StateActionCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof StateRegionCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureRegionsCompartment();
			pane.remove(((StateRegionCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof StateChannelCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureChannelCompartment();
			pane.remove(((StateChannelCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof StateInvariantCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureInvariantCompartment();
			pane.remove(((StateInvariantCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof EntryPointEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(((EntryPointEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ExitPointEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(((ExitPointEditPart) childEditPart).getFigure());
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
		if (editPart instanceof StateActionCompartmentEditPart) {
			return getPrimaryShape().getFigureActionCompartment();
		}
		if (editPart instanceof StateRegionCompartmentEditPart) {
			return getPrimaryShape().getFigureRegionsCompartment();
		}
		if (editPart instanceof StateChannelCompartmentEditPart) {
			return getPrimaryShape().getFigureChannelCompartment();
		}
		if (editPart instanceof StateInvariantCompartmentEditPart) {
			return getPrimaryShape().getFigureInvariantCompartment();
		}
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
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
		return getChildBySemanticHint(MumlVisualIDRegistry.getType(StateNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == MumlElementTypes.EntryEvent_3033) {
				return getChildBySemanticHint(MumlVisualIDRegistry.getType(StateActionCompartmentEditPart.VISUAL_ID));
			}
			if (type == MumlElementTypes.DoEvent_3034) {
				return getChildBySemanticHint(MumlVisualIDRegistry.getType(StateActionCompartmentEditPart.VISUAL_ID));
			}
			if (type == MumlElementTypes.ExitEvent_3035) {
				return getChildBySemanticHint(MumlVisualIDRegistry.getType(StateActionCompartmentEditPart.VISUAL_ID));
			}
			if (type == MumlElementTypes.Region_3042) {
				return getChildBySemanticHint(MumlVisualIDRegistry.getType(StateRegionCompartmentEditPart.VISUAL_ID));
			}
			if (type == MumlElementTypes.SynchronizationChannel_3037) {
				return getChildBySemanticHint(MumlVisualIDRegistry.getType(StateChannelCompartmentEditPart.VISUAL_ID));
			}
			if (type == MumlElementTypes.ClockConstraint_3036) {
				return getChildBySemanticHint(
						MumlVisualIDRegistry.getType(StateInvariantCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class StateFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureStateNameLabel;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureActionCompartment;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureRegionsCompartment;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureChannelCompartment;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureInvariantCompartment;

		/**
		 * @generated
		 */
		public StateFigure() {
			this.setLayoutManager(new StackLayout());
			this.setFill(false);
			this.setOutline(false);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RoundedRectangle undecoratedStateFigure0 = new RoundedRectangle();

			undecoratedStateFigure0
					.setCornerDimensions(new Dimension(getMapMode().DPtoLP(12), getMapMode().DPtoLP(12)));

			this.add(undecoratedStateFigure0);

			GridLayout layoutUndecoratedStateFigure0 = new GridLayout();
			layoutUndecoratedStateFigure0.numColumns = 1;
			layoutUndecoratedStateFigure0.makeColumnsEqualWidth = false;
			undecoratedStateFigure0.setLayoutManager(layoutUndecoratedStateFigure0);

			fFigureStateNameLabel = new WrappingLabel();

			fFigureStateNameLabel.setText("");

			fFigureStateNameLabel.setFont(FFIGURESTATENAMELABEL_FONT);

			GridData constraintFFigureStateNameLabel = new GridData();
			constraintFFigureStateNameLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureStateNameLabel.horizontalAlignment = GridData.CENTER;
			constraintFFigureStateNameLabel.horizontalIndent = 0;
			constraintFFigureStateNameLabel.horizontalSpan = 1;
			constraintFFigureStateNameLabel.verticalSpan = 1;
			constraintFFigureStateNameLabel.grabExcessHorizontalSpace = true;
			constraintFFigureStateNameLabel.grabExcessVerticalSpace = false;
			undecoratedStateFigure0.add(fFigureStateNameLabel, constraintFFigureStateNameLabel);

			fFigureInvariantCompartment = new RectangleFigure();

			fFigureInvariantCompartment.setFill(false);
			fFigureInvariantCompartment.setOutline(false);

			GridData constraintFFigureInvariantCompartment = new GridData();
			constraintFFigureInvariantCompartment.verticalAlignment = GridData.CENTER;
			constraintFFigureInvariantCompartment.horizontalAlignment = GridData.FILL;
			constraintFFigureInvariantCompartment.horizontalIndent = 0;
			constraintFFigureInvariantCompartment.horizontalSpan = 1;
			constraintFFigureInvariantCompartment.verticalSpan = 1;
			constraintFFigureInvariantCompartment.grabExcessHorizontalSpace = false;
			constraintFFigureInvariantCompartment.grabExcessVerticalSpace = false;
			undecoratedStateFigure0.add(fFigureInvariantCompartment, constraintFFigureInvariantCompartment);

			fFigureChannelCompartment = new RectangleFigure();

			fFigureChannelCompartment.setFill(false);
			fFigureChannelCompartment.setOutline(false);

			GridData constraintFFigureChannelCompartment = new GridData();
			constraintFFigureChannelCompartment.verticalAlignment = GridData.CENTER;
			constraintFFigureChannelCompartment.horizontalAlignment = GridData.FILL;
			constraintFFigureChannelCompartment.horizontalIndent = 0;
			constraintFFigureChannelCompartment.horizontalSpan = 1;
			constraintFFigureChannelCompartment.verticalSpan = 1;
			constraintFFigureChannelCompartment.grabExcessHorizontalSpace = true;
			constraintFFigureChannelCompartment.grabExcessVerticalSpace = false;
			undecoratedStateFigure0.add(fFigureChannelCompartment, constraintFFigureChannelCompartment);

			fFigureActionCompartment = new RectangleFigure();

			fFigureActionCompartment.setOutline(false);

			GridData constraintFFigureActionCompartment = new GridData();
			constraintFFigureActionCompartment.verticalAlignment = GridData.CENTER;
			constraintFFigureActionCompartment.horizontalAlignment = GridData.FILL;
			constraintFFigureActionCompartment.horizontalIndent = 0;
			constraintFFigureActionCompartment.horizontalSpan = 1;
			constraintFFigureActionCompartment.verticalSpan = 1;
			constraintFFigureActionCompartment.grabExcessHorizontalSpace = true;
			constraintFFigureActionCompartment.grabExcessVerticalSpace = false;
			undecoratedStateFigure0.add(fFigureActionCompartment, constraintFFigureActionCompartment);

			fFigureRegionsCompartment = new RectangleFigure();

			fFigureRegionsCompartment.setOutline(false);
			fFigureRegionsCompartment.setBackgroundColor(ColorConstants.white);

			GridData constraintFFigureRegionsCompartment = new GridData();
			constraintFFigureRegionsCompartment.verticalAlignment = GridData.FILL;
			constraintFFigureRegionsCompartment.horizontalAlignment = GridData.FILL;
			constraintFFigureRegionsCompartment.horizontalIndent = 0;
			constraintFFigureRegionsCompartment.horizontalSpan = 1;
			constraintFFigureRegionsCompartment.verticalSpan = 1;
			constraintFFigureRegionsCompartment.grabExcessHorizontalSpace = true;
			constraintFFigureRegionsCompartment.grabExcessVerticalSpace = true;
			undecoratedStateFigure0.add(fFigureRegionsCompartment, constraintFFigureRegionsCompartment);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStateNameLabel() {
			return fFigureStateNameLabel;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureActionCompartment() {
			return fFigureActionCompartment;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureRegionsCompartment() {
			return fFigureRegionsCompartment;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureChannelCompartment() {
			return fFigureChannelCompartment;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureInvariantCompartment() {
			return fFigureInvariantCompartment;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGURESTATENAMELABEL_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 10, SWT.BOLD);

}
