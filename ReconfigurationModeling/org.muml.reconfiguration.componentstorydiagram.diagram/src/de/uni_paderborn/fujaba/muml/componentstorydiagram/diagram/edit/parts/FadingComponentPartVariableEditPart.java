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
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
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

/**
 * @generated
 */
public class FadingComponentPartVariableEditPart extends
		AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3024;

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
	public FadingComponentPartVariableEditPart(View view) {
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
				new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.policies.FadingComponentPartVariableItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.policies.FadingComponentPartVariableCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(
				de.uni_paderborn.fujaba.muml.common.edit.policies.EditPolicyRoles.COMPONENTSTORYPATTERNVARIABLE_VISUALIZATION_ROLE,
				new de.uni_paderborn.fujaba.muml.reconfiguration.common.edit.policies.ComponentStoryPatternVariableEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);

		installEditPolicy(
				EditPolicy.GRAPHICAL_NODE_ROLE,
				new org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy());

		installEditPolicy(
				org.muml.core.common.edit.policies.EditPolicyRoles.ERROR_FEEDBACK_ROLE,
				new org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy());

	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry
						.getVisualID(childView)) {
				case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
					return new org.muml.core.common.edit.policies.BorderItemSelectionEditPolicy();
				case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.MultiPortVariableEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.SinglePortVariable2EditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy();
				}
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
		return primaryShape = new FadingComponentVariableFigure();
	}

	/**
	 * @generated
	 */
	public FadingComponentVariableFigure getPrimaryShape() {
		return (FadingComponentVariableFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabel5EditPart) {
			((de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabel5EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureFadingComponentVariableNameFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabel9EditPart) {
			((de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabel9EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureFadingFunctionLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.MultiPortVariableEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.NORTH);
			getBorderedFigure()
					.getBorderItemContainer()
					.add(((de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.MultiPortVariableEditPart) childEditPart)
							.getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.SinglePortVariable2EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.NORTH);
			getBorderedFigure()
					.getBorderItemContainer()
					.add(((de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.SinglePortVariable2EditPart) childEditPart)
							.getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabel5EditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabel9EditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.MultiPortVariableEditPart) {
			getBorderedFigure()
					.getBorderItemContainer()
					.remove(((de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.MultiPortVariableEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.SinglePortVariable2EditPart) {
			getBorderedFigure()
					.getBorderItemContainer()
					.remove(((de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.SinglePortVariable2EditPart) childEditPart)
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
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected void addBorderItem(IFigure borderItemContainer,
			IBorderItemEditPart borderItemEditPart) {
		if (borderItemEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabel6EditPart) {
			// bug-fix: allows the free positioning of external Labels
			org.muml.core.common.figures.CustomExternalLabelBorderItemLocator locator = new org.muml.core.common.figures.CustomExternalLabelBorderItemLocator(
					getMainFigure(), PositionConstants.SOUTH);
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
		return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class FadingComponentVariableFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureFadingComponentVariableNameFigure;

		/**
		 * @generated
		 */
		private WrappingLabel fFigureFadingFunctionLabel;

		/**
		 * @generated
		 */
		public FadingComponentVariableFigure() {
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure fadingComponentVariable0 = new RectangleFigure();

			fadingComponentVariable0.setFill(false);
			fadingComponentVariable0.setOutline(false);

			this.add(fadingComponentVariable0);

			GridLayout layoutFadingComponentVariable0 = new GridLayout();
			layoutFadingComponentVariable0.numColumns = 2;
			layoutFadingComponentVariable0.makeColumnsEqualWidth = false;
			fadingComponentVariable0
					.setLayoutManager(layoutFadingComponentVariable0);

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
			fadingComponentVariable0.add(nameContainer1,
					constraintNameContainer1);

			GridLayout layoutNameContainer1 = new GridLayout();
			layoutNameContainer1.numColumns = 1;
			layoutNameContainer1.makeColumnsEqualWidth = false;
			nameContainer1.setLayoutManager(layoutNameContainer1);

			fFigureFadingComponentVariableNameFigure = new WrappingLabel();

			fFigureFadingComponentVariableNameFigure.setText("");

			fFigureFadingComponentVariableNameFigure
					.setFont(FFIGUREFADINGCOMPONENTVARIABLENAMEFIGURE_FONT);

			fFigureFadingComponentVariableNameFigure.setTextUnderline(true);

			GridData constraintFFigureFadingComponentVariableNameFigure = new GridData();
			constraintFFigureFadingComponentVariableNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureFadingComponentVariableNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureFadingComponentVariableNameFigure.horizontalIndent = 0;
			constraintFFigureFadingComponentVariableNameFigure.horizontalSpan = 1;
			constraintFFigureFadingComponentVariableNameFigure.verticalSpan = 1;
			constraintFFigureFadingComponentVariableNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureFadingComponentVariableNameFigure.grabExcessVerticalSpace = true;
			nameContainer1.add(fFigureFadingComponentVariableNameFigure,
					constraintFFigureFadingComponentVariableNameFigure);

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
			fadingComponentVariable0.add(iconContainer1,
					constraintIconContainer1);

			GridLayout layoutIconContainer1 = new GridLayout();
			layoutIconContainer1.numColumns = 1;
			layoutIconContainer1.makeColumnsEqualWidth = false;
			iconContainer1.setLayoutManager(layoutIconContainer1);

			RectangleFigure fadingComponentIconFigure2 = new RectangleFigure();

			fadingComponentIconFigure2.setFill(false);
			fadingComponentIconFigure2.setOutline(false);
			fadingComponentIconFigure2.setPreferredSize(new Dimension(
					getMapMode().DPtoLP(40), getMapMode().DPtoLP(22)));

			GridData constraintFadingComponentIconFigure2 = new GridData();
			constraintFadingComponentIconFigure2.verticalAlignment = GridData.BEGINNING;
			constraintFadingComponentIconFigure2.horizontalAlignment = GridData.END;
			constraintFadingComponentIconFigure2.horizontalIndent = 0;
			constraintFadingComponentIconFigure2.horizontalSpan = 1;
			constraintFadingComponentIconFigure2.verticalSpan = 1;
			constraintFadingComponentIconFigure2.grabExcessHorizontalSpace = true;
			constraintFadingComponentIconFigure2.grabExcessVerticalSpace = false;
			iconContainer1.add(fadingComponentIconFigure2,
					constraintFadingComponentIconFigure2);

			fadingComponentIconFigure2.setLayoutManager(new XYLayout());

			RectangleFigure componentIconOuter3 = new RectangleFigure();

			componentIconOuter3.setFill(false);
			componentIconOuter3.setOutline(false);

			fadingComponentIconFigure2.add(componentIconOuter3, new Rectangle(
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(2),
					getMapMode().DPtoLP(40), getMapMode().DPtoLP(20)));
			componentIconOuter3.setLayoutManager(new XYLayout());

			RectangleFigure b14 = new RectangleFigure();

			componentIconOuter3.add(b14, new Rectangle(getMapMode().DPtoLP(4),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(36),
					getMapMode().DPtoLP(20)));
			b14.setLayoutManager(new XYLayout());

			RectangleFigure plus5 = new RectangleFigure();

			plus5.setForegroundColor(PLUS5_FORE);

			b14.add(plus5, new Rectangle(getMapMode().DPtoLP(10), getMapMode()
					.DPtoLP(5), getMapMode().DPtoLP(10), getMapMode()
					.DPtoLP(10)));

			GridLayout layoutPlus5 = new GridLayout();
			layoutPlus5.numColumns = 1;
			layoutPlus5.makeColumnsEqualWidth = true;
			plus5.setLayoutManager(layoutPlus5);

			RectangleFigure minus5 = new RectangleFigure();

			minus5.setForegroundColor(MINUS5_FORE);

			b14.add(minus5, new Rectangle(getMapMode().DPtoLP(23), getMapMode()
					.DPtoLP(5), getMapMode().DPtoLP(10), getMapMode()
					.DPtoLP(10)));

			GridLayout layoutMinus5 = new GridLayout();
			layoutMinus5.numColumns = 1;
			layoutMinus5.makeColumnsEqualWidth = true;
			minus5.setLayoutManager(layoutMinus5);

			RectangleFigure componentIconInner13 = new RectangleFigure();

			componentIconInner13.setFill(false);
			componentIconInner13.setOutline(false);

			fadingComponentIconFigure2.add(componentIconInner13, new Rectangle(
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(2),
					getMapMode().DPtoLP(40), getMapMode().DPtoLP(20)));
			componentIconInner13.setLayoutManager(new XYLayout());

			RectangleFigure c14 = new RectangleFigure();

			componentIconInner13.add(c14, new Rectangle(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(2), getMapMode().DPtoLP(12),
					getMapMode().DPtoLP(6)));

			RectangleFigure componentIconInner23 = new RectangleFigure();

			componentIconInner23.setFill(false);
			componentIconInner23.setOutline(false);

			fadingComponentIconFigure2.add(componentIconInner23, new Rectangle(
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(1),
					getMapMode().DPtoLP(40), getMapMode().DPtoLP(20)));
			componentIconInner23.setLayoutManager(new XYLayout());

			RectangleFigure d14 = new RectangleFigure();

			componentIconInner23.add(d14, new Rectangle(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(10), getMapMode().DPtoLP(12),
					getMapMode().DPtoLP(6)));

			RectangleFigure plusLabelContainer3 = new RectangleFigure();

			plusLabelContainer3.setFill(false);
			plusLabelContainer3.setOutline(false);
			plusLabelContainer3.setForegroundColor(PLUSLABELCONTAINER3_FORE);

			fadingComponentIconFigure2.add(plusLabelContainer3, new Rectangle(
					getMapMode().DPtoLP(9), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(20), getMapMode().DPtoLP(21)));

			GridLayout layoutPlusLabelContainer3 = new GridLayout();
			layoutPlusLabelContainer3.numColumns = 1;
			layoutPlusLabelContainer3.makeColumnsEqualWidth = true;
			plusLabelContainer3.setLayoutManager(layoutPlusLabelContainer3);

			WrappingLabel plusLabel4 = new WrappingLabel();

			plusLabel4.setText("+");

			plusLabel4.setFont(PLUSLABEL4_FONT);

			GridData constraintPlusLabel4 = new GridData();
			constraintPlusLabel4.verticalAlignment = GridData.BEGINNING;
			constraintPlusLabel4.horizontalAlignment = GridData.CENTER;
			constraintPlusLabel4.horizontalIndent = 0;
			constraintPlusLabel4.horizontalSpan = 1;
			constraintPlusLabel4.verticalSpan = 1;
			constraintPlusLabel4.grabExcessHorizontalSpace = true;
			constraintPlusLabel4.grabExcessVerticalSpace = true;
			plusLabelContainer3.add(plusLabel4, constraintPlusLabel4);

			RectangleFigure minusLabelContainer3 = new RectangleFigure();

			minusLabelContainer3.setFill(false);
			minusLabelContainer3.setOutline(false);
			minusLabelContainer3.setForegroundColor(MINUSLABELCONTAINER3_FORE);

			fadingComponentIconFigure2.add(minusLabelContainer3, new Rectangle(
					getMapMode().DPtoLP(22), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(20), getMapMode().DPtoLP(21)));

			GridLayout layoutMinusLabelContainer3 = new GridLayout();
			layoutMinusLabelContainer3.numColumns = 1;
			layoutMinusLabelContainer3.makeColumnsEqualWidth = true;
			minusLabelContainer3.setLayoutManager(layoutMinusLabelContainer3);

			WrappingLabel minusLabel4 = new WrappingLabel();

			minusLabel4.setText("-");

			minusLabel4.setFont(MINUSLABEL4_FONT);

			GridData constraintMinusLabel4 = new GridData();
			constraintMinusLabel4.verticalAlignment = GridData.BEGINNING;
			constraintMinusLabel4.horizontalAlignment = GridData.CENTER;
			constraintMinusLabel4.horizontalIndent = 0;
			constraintMinusLabel4.horizontalSpan = 1;
			constraintMinusLabel4.verticalSpan = 1;
			constraintMinusLabel4.grabExcessHorizontalSpace = true;
			constraintMinusLabel4.grabExcessVerticalSpace = true;
			minusLabelContainer3.add(minusLabel4, constraintMinusLabel4);

			// Process FigureRef details

			iconContainer1.add(fadingComponentIconFigure2);

			fFigureFadingFunctionLabel = new WrappingLabel();

			fFigureFadingFunctionLabel.setText("");

			GridData constraintFFigureFadingFunctionLabel = new GridData();
			constraintFFigureFadingFunctionLabel.verticalAlignment = GridData.END;
			constraintFFigureFadingFunctionLabel.horizontalAlignment = GridData.CENTER;
			constraintFFigureFadingFunctionLabel.horizontalIndent = 0;
			constraintFFigureFadingFunctionLabel.horizontalSpan = 1;
			constraintFFigureFadingFunctionLabel.verticalSpan = 1;
			constraintFFigureFadingFunctionLabel.grabExcessHorizontalSpace = false;
			constraintFFigureFadingFunctionLabel.grabExcessVerticalSpace = false;
			fadingComponentVariable0.add(fFigureFadingFunctionLabel,
					constraintFFigureFadingFunctionLabel);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFadingComponentVariableNameFigure() {
			return fFigureFadingComponentVariableNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFadingFunctionLabel() {
			return fFigureFadingFunctionLabel;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREFADINGCOMPONENTVARIABLENAMEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Color PLUS5_FORE = new Color(null, 0, 192, 0);

	/**
	 * @generated
	 */
	static final Color MINUS5_FORE = new Color(null, 192, 0, 0);

	/**
	 * @generated
	 */
	static final Color PLUSLABELCONTAINER3_FORE = new Color(null, 0, 192, 0);

	/**
	 * @generated
	 */
	static final Font PLUSLABEL4_FONT = new Font(Display.getCurrent(), Display
			.getDefault().getSystemFont().getFontData()[0].getName(), 7,
			SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Color MINUSLABELCONTAINER3_FORE = new Color(null, 192, 0, 0);

	/**
	 * @generated
	 */
	static final Font MINUSLABEL4_FONT = new Font(Display.getCurrent(), Display
			.getDefault().getSystemFont().getFontData()[0].getName(), 7,
			SWT.NORMAL);

}
