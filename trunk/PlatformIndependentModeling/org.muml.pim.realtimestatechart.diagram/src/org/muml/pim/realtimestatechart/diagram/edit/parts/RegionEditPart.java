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

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Ellipse;
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
import org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy;
import org.muml.core.common.edit.policies.IBackgroundColorEditPolicy;
import org.muml.core.common.edit.policies.anchor.IConnectionAnchorCreationEditPolicy;
import org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy;
import org.muml.pim.realtimestatechart.diagram.edit.policies.RegionItemSemanticEditPolicy;
import org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry;
import org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes;

/**
 * @generated
 */
public class RegionEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3042;

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
	public RegionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(MumlVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new RegionItemSemanticEditPolicy());
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
		return primaryShape = new RegionFigure();
	}

	/**
	 * @generated
	 */
	public RegionFigure getPrimaryShape() {
		return (RegionFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof RegionNameEditPart) {
			((RegionNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureStatechartNameLabel());
			return true;
		}
		if (childEditPart instanceof RegionPriorityEditPart) {
			((RegionPriorityEditPart) childEditPart).setLabel(getPrimaryShape().getFigureRegionPriorityLabel());
			return true;
		}
		if (childEditPart instanceof WrappingLabel7EditPart) {
			((WrappingLabel7EditPart) childEditPart).setLabel(getPrimaryShape().getFigureStatechartVariablesLabel());
			return true;
		}
		if (childEditPart instanceof RegionRegionContentsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureRegionContentsCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((RegionRegionContentsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof RegionNameEditPart) {
			return true;
		}
		if (childEditPart instanceof RegionPriorityEditPart) {
			return true;
		}
		if (childEditPart instanceof WrappingLabel7EditPart) {
			return true;
		}
		if (childEditPart instanceof RegionRegionContentsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureRegionContentsCompartment();
			pane.remove(((RegionRegionContentsCompartmentEditPart) childEditPart).getFigure());
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
		if (editPart instanceof RegionRegionContentsCompartmentEditPart) {
			return getPrimaryShape().getFigureRegionContentsCompartment();
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
		return getChildBySemanticHint(MumlVisualIDRegistry.getType(RegionNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == MumlElementTypes.RealtimeStatechart_3043) {
				return getChildBySemanticHint(
						MumlVisualIDRegistry.getType(RegionRegionContentsCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class RegionFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureRegionContentsCompartment;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureStatechartNameLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureStatechartVariablesLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegionPriorityLabel;
		/**
		 * @generated
		 */
		private Ellipse fFigureHistoryFigure;

		/**
		 * @generated
		 */
		public RegionFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setFill(false);
			this.setOutline(false);
			this.setBorder(createBorder0());
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure regionTitleAreaFigure0 = new RectangleFigure();

			regionTitleAreaFigure0.setFill(false);
			regionTitleAreaFigure0.setOutline(false);

			GridData constraintRegionTitleAreaFigure0 = new GridData();
			constraintRegionTitleAreaFigure0.verticalAlignment = GridData.CENTER;
			constraintRegionTitleAreaFigure0.horizontalAlignment = GridData.FILL;
			constraintRegionTitleAreaFigure0.horizontalIndent = 0;
			constraintRegionTitleAreaFigure0.horizontalSpan = 1;
			constraintRegionTitleAreaFigure0.verticalSpan = 1;
			constraintRegionTitleAreaFigure0.grabExcessHorizontalSpace = true;
			constraintRegionTitleAreaFigure0.grabExcessVerticalSpace = false;
			this.add(regionTitleAreaFigure0, constraintRegionTitleAreaFigure0);

			GridLayout layoutRegionTitleAreaFigure0 = new GridLayout();
			layoutRegionTitleAreaFigure0.numColumns = 2;
			layoutRegionTitleAreaFigure0.makeColumnsEqualWidth = false;
			regionTitleAreaFigure0.setLayoutManager(layoutRegionTitleAreaFigure0);

			RectangleFigure statechartTitleAreaFigure1 = new RectangleFigure();

			statechartTitleAreaFigure1.setFill(false);
			statechartTitleAreaFigure1.setOutline(false);

			GridData constraintStatechartTitleAreaFigure1 = new GridData();
			constraintStatechartTitleAreaFigure1.verticalAlignment = GridData.CENTER;
			constraintStatechartTitleAreaFigure1.horizontalAlignment = GridData.FILL;
			constraintStatechartTitleAreaFigure1.horizontalIndent = 0;
			constraintStatechartTitleAreaFigure1.horizontalSpan = 1;
			constraintStatechartTitleAreaFigure1.verticalSpan = 1;
			constraintStatechartTitleAreaFigure1.grabExcessHorizontalSpace = true;
			constraintStatechartTitleAreaFigure1.grabExcessVerticalSpace = false;
			regionTitleAreaFigure0.add(statechartTitleAreaFigure1, constraintStatechartTitleAreaFigure1);

			GridLayout layoutStatechartTitleAreaFigure1 = new GridLayout();
			layoutStatechartTitleAreaFigure1.numColumns = 3;
			layoutStatechartTitleAreaFigure1.makeColumnsEqualWidth = false;
			statechartTitleAreaFigure1.setLayoutManager(layoutStatechartTitleAreaFigure1);

			fFigureHistoryFigure = new Ellipse();

			GridData constraintFFigureHistoryFigure = new GridData();
			constraintFFigureHistoryFigure.verticalAlignment = GridData.BEGINNING;
			constraintFFigureHistoryFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureHistoryFigure.horizontalIndent = 0;
			constraintFFigureHistoryFigure.horizontalSpan = 1;
			constraintFFigureHistoryFigure.verticalSpan = 1;
			constraintFFigureHistoryFigure.grabExcessHorizontalSpace = false;
			constraintFFigureHistoryFigure.grabExcessVerticalSpace = false;
			statechartTitleAreaFigure1.add(fFigureHistoryFigure, constraintFFigureHistoryFigure);

			GridLayout layoutFFigureHistoryFigure = new GridLayout();
			layoutFFigureHistoryFigure.numColumns = 1;
			layoutFFigureHistoryFigure.makeColumnsEqualWidth = true;
			fFigureHistoryFigure.setLayoutManager(layoutFFigureHistoryFigure);

			WrappingLabel historyLabel3 = new WrappingLabel();

			historyLabel3.setText(" H ");

			GridData constraintHistoryLabel3 = new GridData();
			constraintHistoryLabel3.verticalAlignment = GridData.CENTER;
			constraintHistoryLabel3.horizontalAlignment = GridData.CENTER;
			constraintHistoryLabel3.horizontalIndent = 0;
			constraintHistoryLabel3.horizontalSpan = 1;
			constraintHistoryLabel3.verticalSpan = 1;
			constraintHistoryLabel3.grabExcessHorizontalSpace = true;
			constraintHistoryLabel3.grabExcessVerticalSpace = true;
			fFigureHistoryFigure.add(historyLabel3, constraintHistoryLabel3);

			fFigureStatechartNameLabel = new WrappingLabel();

			fFigureStatechartNameLabel.setText("");

			fFigureStatechartNameLabel.setFont(FFIGURESTATECHARTNAMELABEL_FONT);

			statechartTitleAreaFigure1.add(fFigureStatechartNameLabel);

			fFigureStatechartVariablesLabel = new WrappingLabel();

			fFigureStatechartVariablesLabel.setText("");

			GridData constraintFFigureStatechartVariablesLabel = new GridData();
			constraintFFigureStatechartVariablesLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureStatechartVariablesLabel.horizontalAlignment = GridData.END;
			constraintFFigureStatechartVariablesLabel.horizontalIndent = 0;
			constraintFFigureStatechartVariablesLabel.horizontalSpan = 1;
			constraintFFigureStatechartVariablesLabel.verticalSpan = 1;
			constraintFFigureStatechartVariablesLabel.grabExcessHorizontalSpace = true;
			constraintFFigureStatechartVariablesLabel.grabExcessVerticalSpace = false;
			statechartTitleAreaFigure1.add(fFigureStatechartVariablesLabel, constraintFFigureStatechartVariablesLabel);

			// Process FigureRef details

			regionTitleAreaFigure0.add(statechartTitleAreaFigure1);

			Ellipse regionPriority1 = new Ellipse();

			regionTitleAreaFigure0.add(regionPriority1);
			regionPriority1.setLayoutManager(new StackLayout());

			fFigureRegionPriorityLabel = new WrappingLabel();

			fFigureRegionPriorityLabel.setText("");

			fFigureRegionPriorityLabel.setFont(FFIGUREREGIONPRIORITYLABEL_FONT);

			fFigureRegionPriorityLabel.setBorder(new MarginBorder(getMapMode().DPtoLP(2), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(2), getMapMode().DPtoLP(5)));

			regionPriority1.add(fFigureRegionPriorityLabel);

			// Process FigureRef details

			this.add(regionTitleAreaFigure0);

			fFigureRegionContentsCompartment = new RectangleFigure();

			fFigureRegionContentsCompartment.setFill(false);
			fFigureRegionContentsCompartment.setOutline(false);

			GridData constraintFFigureRegionContentsCompartment = new GridData();
			constraintFFigureRegionContentsCompartment.verticalAlignment = GridData.FILL;
			constraintFFigureRegionContentsCompartment.horizontalAlignment = GridData.FILL;
			constraintFFigureRegionContentsCompartment.horizontalIndent = 0;
			constraintFFigureRegionContentsCompartment.horizontalSpan = 1;
			constraintFFigureRegionContentsCompartment.verticalSpan = 1;
			constraintFFigureRegionContentsCompartment.grabExcessHorizontalSpace = true;
			constraintFFigureRegionContentsCompartment.grabExcessVerticalSpace = true;
			this.add(fFigureRegionContentsCompartment, constraintFFigureRegionContentsCompartment);

		}

		/**
		 * @generated
		 */
		private Border createBorder0() {
			OneLineBorder result = new OneLineBorder();
			result.setPosition(PositionConstants.BOTTOM);
			result.setStyle(SWT.LINE_DASH);

			return result;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureRegionContentsCompartment() {
			return fFigureRegionContentsCompartment;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStatechartNameLabel() {
			return fFigureStatechartNameLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStatechartVariablesLabel() {
			return fFigureStatechartVariablesLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRegionPriorityLabel() {
			return fFigureRegionPriorityLabel;
		}

		/**
		 * @generated
		 */
		public Ellipse getFigureHistoryFigure() {
			return fFigureHistoryFigure;
		}

	}

	/**
	* @generated
	*/
	static final Font FFIGURESTATECHARTNAMELABEL_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 9, SWT.ITALIC);

	/**
	 * @generated
	 */
	static final Font FFIGUREREGIONPRIORITYLABEL_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 8, SWT.NORMAL);

}
