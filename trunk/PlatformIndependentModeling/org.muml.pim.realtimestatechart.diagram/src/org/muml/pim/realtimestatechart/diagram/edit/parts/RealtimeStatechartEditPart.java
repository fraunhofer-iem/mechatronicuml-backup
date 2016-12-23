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

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
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
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy;
import org.muml.core.common.edit.policies.IBackgroundColorEditPolicy;
import org.muml.core.common.edit.policies.anchor.IConnectionAnchorCreationEditPolicy;
import org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy;
import org.muml.pim.realtimestatechart.diagram.edit.policies.RealtimeStatechartItemSemanticEditPolicy;
import org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry;

/**
 * @generated
 */
public class RealtimeStatechartEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2007;

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
	public RealtimeStatechartEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new RealtimeStatechartItemSemanticEditPolicy());
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
		return primaryShape = new StatechartFigure();
	}

	/**
	 * @generated
	 */
	public StatechartFigure getPrimaryShape() {
		return (StatechartFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof RealtimeStatechartNameEditPart) {
			((RealtimeStatechartNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureStatechartNameLabel());
			return true;
		}
		if (childEditPart instanceof WrappingLabelEditPart) {
			((WrappingLabelEditPart) childEditPart).setLabel(getPrimaryShape().getFigureStatechartVariablesLabel());
			return true;
		}
		if (childEditPart instanceof RealtimeStatechartStatechartContentsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureStatechartContentsCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((RealtimeStatechartStatechartContentsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof RealtimeStatechartNameEditPart) {
			return true;
		}
		if (childEditPart instanceof WrappingLabelEditPart) {
			return true;
		}
		if (childEditPart instanceof RealtimeStatechartStatechartContentsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureStatechartContentsCompartment();
			pane.remove(((RealtimeStatechartStatechartContentsCompartmentEditPart) childEditPart).getFigure());
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
		if (editPart instanceof RealtimeStatechartStatechartContentsCompartmentEditPart) {
			return getPrimaryShape().getFigureStatechartContentsCompartment();
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
		return getChildBySemanticHint(MumlVisualIDRegistry.getType(RealtimeStatechartNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class StatechartFigure extends RectangleFigure {

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
		private RectangleFigure fFigureStatechartContentsCompartment;
		/**
		 * @generated
		 */
		private Ellipse fFigureHistoryFigure;

		/**
		 * @generated
		 */
		public StatechartFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = false;
			this.setLayoutManager(layoutThis);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure statechartTitleAreaFigure0 = new RectangleFigure();

			statechartTitleAreaFigure0.setFill(false);
			statechartTitleAreaFigure0.setOutline(false);

			GridData constraintStatechartTitleAreaFigure0 = new GridData();
			constraintStatechartTitleAreaFigure0.verticalAlignment = GridData.CENTER;
			constraintStatechartTitleAreaFigure0.horizontalAlignment = GridData.FILL;
			constraintStatechartTitleAreaFigure0.horizontalIndent = 0;
			constraintStatechartTitleAreaFigure0.horizontalSpan = 1;
			constraintStatechartTitleAreaFigure0.verticalSpan = 1;
			constraintStatechartTitleAreaFigure0.grabExcessHorizontalSpace = true;
			constraintStatechartTitleAreaFigure0.grabExcessVerticalSpace = false;
			this.add(statechartTitleAreaFigure0, constraintStatechartTitleAreaFigure0);

			GridLayout layoutStatechartTitleAreaFigure0 = new GridLayout();
			layoutStatechartTitleAreaFigure0.numColumns = 3;
			layoutStatechartTitleAreaFigure0.makeColumnsEqualWidth = false;
			statechartTitleAreaFigure0.setLayoutManager(layoutStatechartTitleAreaFigure0);

			fFigureHistoryFigure = new Ellipse();

			GridData constraintFFigureHistoryFigure = new GridData();
			constraintFFigureHistoryFigure.verticalAlignment = GridData.BEGINNING;
			constraintFFigureHistoryFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureHistoryFigure.horizontalIndent = 0;
			constraintFFigureHistoryFigure.horizontalSpan = 1;
			constraintFFigureHistoryFigure.verticalSpan = 1;
			constraintFFigureHistoryFigure.grabExcessHorizontalSpace = false;
			constraintFFigureHistoryFigure.grabExcessVerticalSpace = false;
			statechartTitleAreaFigure0.add(fFigureHistoryFigure, constraintFFigureHistoryFigure);

			GridLayout layoutFFigureHistoryFigure = new GridLayout();
			layoutFFigureHistoryFigure.numColumns = 1;
			layoutFFigureHistoryFigure.makeColumnsEqualWidth = true;
			fFigureHistoryFigure.setLayoutManager(layoutFFigureHistoryFigure);

			WrappingLabel historyLabel2 = new WrappingLabel();

			historyLabel2.setText(" H ");

			GridData constraintHistoryLabel2 = new GridData();
			constraintHistoryLabel2.verticalAlignment = GridData.CENTER;
			constraintHistoryLabel2.horizontalAlignment = GridData.CENTER;
			constraintHistoryLabel2.horizontalIndent = 0;
			constraintHistoryLabel2.horizontalSpan = 1;
			constraintHistoryLabel2.verticalSpan = 1;
			constraintHistoryLabel2.grabExcessHorizontalSpace = true;
			constraintHistoryLabel2.grabExcessVerticalSpace = true;
			fFigureHistoryFigure.add(historyLabel2, constraintHistoryLabel2);

			fFigureStatechartNameLabel = new WrappingLabel();

			fFigureStatechartNameLabel.setText("");

			fFigureStatechartNameLabel.setFont(FFIGURESTATECHARTNAMELABEL_FONT);

			statechartTitleAreaFigure0.add(fFigureStatechartNameLabel);

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
			statechartTitleAreaFigure0.add(fFigureStatechartVariablesLabel, constraintFFigureStatechartVariablesLabel);

			// Process FigureRef details

			this.add(statechartTitleAreaFigure0);

			fFigureStatechartContentsCompartment = new RectangleFigure();

			fFigureStatechartContentsCompartment.setFill(false);
			fFigureStatechartContentsCompartment.setOutline(false);

			GridData constraintFFigureStatechartContentsCompartment = new GridData();
			constraintFFigureStatechartContentsCompartment.verticalAlignment = GridData.FILL;
			constraintFFigureStatechartContentsCompartment.horizontalAlignment = GridData.FILL;
			constraintFFigureStatechartContentsCompartment.horizontalIndent = 0;
			constraintFFigureStatechartContentsCompartment.horizontalSpan = 1;
			constraintFFigureStatechartContentsCompartment.verticalSpan = 1;
			constraintFFigureStatechartContentsCompartment.grabExcessHorizontalSpace = true;
			constraintFFigureStatechartContentsCompartment.grabExcessVerticalSpace = true;
			this.add(fFigureStatechartContentsCompartment, constraintFFigureStatechartContentsCompartment);

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
		public RectangleFigure getFigureStatechartContentsCompartment() {
			return fFigureStatechartContentsCompartment;
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

}
