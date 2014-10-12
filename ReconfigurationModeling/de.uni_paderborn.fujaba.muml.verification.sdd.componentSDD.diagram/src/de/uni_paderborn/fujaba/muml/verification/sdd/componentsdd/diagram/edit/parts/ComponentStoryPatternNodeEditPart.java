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
package de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts;

import java.util.Collection;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ScalablePolygonShape;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
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
public class ComponentStoryPatternNodeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2003;

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
	public ComponentStoryPatternNodeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.policies.ComponentStoryPatternNodeItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);

		installEditPolicy(
				EditPolicy.GRAPHICAL_NODE_ROLE,
				new de.uni_paderborn.fujaba.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy());

		installEditPolicy(
				de.uni_paderborn.fujaba.common.edit.policies.EditPolicyRoles.ERROR_FEEDBACK_ROLE,
				new de.uni_paderborn.fujaba.common.edit.policies.ErrorFeedbackEditPolicy());

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
		return primaryShape = new PatternNodeFigure();
	}

	/**
	 * @generated
	 */
	public PatternNodeFigure getPrimaryShape() {
		return (PatternNodeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeNameEditPart) {
			((de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigurePatternNodeNameFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeTypeEditPart) {
			((de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeTypeEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigurePatternNodeTypeFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodePatternNodeContentCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigurePatternNodeElementsPolygon();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodePatternNodeContentCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeNameEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeTypeEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodePatternNodeContentCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigurePatternNodeElementsPolygon();
			pane.remove(((de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodePatternNodeContentCompartmentEditPart) childEditPart)
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
		if (editPart instanceof de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodePatternNodeContentCompartmentEditPart) {
			return getPrimaryShape().getFigurePatternNodeElementsPolygon();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(150, 100);

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
		return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class PatternNodeFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigurePatternNodeNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePatternNodeTypeFigure;
		/**
		 * @generated
		 */
		private ScalablePolygonShape fFigurePatternNodeElementsPolygon;

		/**
		 * @generated
		 */
		public PatternNodeFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			layoutThis.horizontalSpacing = 0;
			layoutThis.verticalSpacing = 0;
			layoutThis.marginWidth = 0;
			layoutThis.marginHeight = 0;
			this.setLayoutManager(layoutThis);

			this.setFill(false);
			this.setForegroundColor(ColorConstants.black);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(150),
					getMapMode().DPtoLP(100)));

			this.setBorder(new MarginBorder(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			ScalablePolygonShape patternNodeLabelPolygon0 = new ScalablePolygonShape();

			patternNodeLabelPolygon0.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));
			patternNodeLabelPolygon0.addPoint(new Point(
					getMapMode().DPtoLP(75), getMapMode().DPtoLP(0)));
			patternNodeLabelPolygon0.addPoint(new Point(
					getMapMode().DPtoLP(75), getMapMode().DPtoLP(100)));
			patternNodeLabelPolygon0.addPoint(new Point(
					getMapMode().DPtoLP(75), getMapMode().DPtoLP(0)));
			patternNodeLabelPolygon0.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));
			patternNodeLabelPolygon0.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(100)));
			patternNodeLabelPolygon0.setFill(true);

			GridData constraintPatternNodeLabelPolygon0 = new GridData();
			constraintPatternNodeLabelPolygon0.verticalAlignment = GridData.BEGINNING;
			constraintPatternNodeLabelPolygon0.horizontalAlignment = GridData.FILL;
			constraintPatternNodeLabelPolygon0.horizontalIndent = 0;
			constraintPatternNodeLabelPolygon0.horizontalSpan = 1;
			constraintPatternNodeLabelPolygon0.verticalSpan = 1;
			constraintPatternNodeLabelPolygon0.grabExcessHorizontalSpace = true;
			constraintPatternNodeLabelPolygon0.grabExcessVerticalSpace = false;
			this.add(patternNodeLabelPolygon0,
					constraintPatternNodeLabelPolygon0);

			GridLayout layoutPatternNodeLabelPolygon0 = new GridLayout();
			layoutPatternNodeLabelPolygon0.numColumns = 4;
			layoutPatternNodeLabelPolygon0.makeColumnsEqualWidth = false;
			layoutPatternNodeLabelPolygon0.horizontalSpacing = 0;
			layoutPatternNodeLabelPolygon0.verticalSpacing = 0;
			layoutPatternNodeLabelPolygon0.marginWidth = 0;
			layoutPatternNodeLabelPolygon0.marginHeight = 0;
			patternNodeLabelPolygon0
					.setLayoutManager(layoutPatternNodeLabelPolygon0);

			ScalablePolygonShape insetBottomPolygon1 = new ScalablePolygonShape();

			insetBottomPolygon1.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(100)));
			insetBottomPolygon1.addPoint(new Point(getMapMode().DPtoLP(100),
					getMapMode().DPtoLP(100)));

			GridData constraintInsetBottomPolygon1 = new GridData();
			constraintInsetBottomPolygon1.verticalAlignment = GridData.BEGINNING;
			constraintInsetBottomPolygon1.horizontalAlignment = GridData.BEGINNING;
			constraintInsetBottomPolygon1.horizontalIndent = 0;
			constraintInsetBottomPolygon1.horizontalSpan = 1;
			constraintInsetBottomPolygon1.verticalSpan = 1;
			constraintInsetBottomPolygon1.grabExcessHorizontalSpace = false;
			constraintInsetBottomPolygon1.grabExcessVerticalSpace = false;
			patternNodeLabelPolygon0.add(insetBottomPolygon1,
					constraintInsetBottomPolygon1);

			ToolbarLayout layoutInsetBottomPolygon1 = new ToolbarLayout();
			layoutInsetBottomPolygon1.setStretchMinorAxis(true);
			layoutInsetBottomPolygon1
					.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutInsetBottomPolygon1.setSpacing(0);
			layoutInsetBottomPolygon1.setVertical(false);

			insetBottomPolygon1.setLayoutManager(layoutInsetBottomPolygon1);

			fFigurePatternNodeNameFigure = new WrappingLabel();

			fFigurePatternNodeNameFigure.setText("");

			fFigurePatternNodeNameFigure
					.setFont(FFIGUREPATTERNNODENAMEFIGURE_FONT);

			fFigurePatternNodeNameFigure.setBorder(new MarginBorder(
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));

			insetBottomPolygon1.add(fFigurePatternNodeNameFigure);

			WrappingLabel colonFigure2 = new WrappingLabel();

			colonFigure2.setText(": ");

			colonFigure2.setFont(COLONFIGURE2_FONT);

			insetBottomPolygon1.add(colonFigure2);

			fFigurePatternNodeTypeFigure = new WrappingLabel();

			fFigurePatternNodeTypeFigure.setText("");

			fFigurePatternNodeTypeFigure
					.setFont(FFIGUREPATTERNNODETYPEFIGURE_FONT);

			insetBottomPolygon1.add(fFigurePatternNodeTypeFigure);

			ScalablePolygonShape insetRightPolygon1 = new ScalablePolygonShape();

			insetRightPolygon1.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(100)));
			insetRightPolygon1.addPoint(new Point(getMapMode().DPtoLP(100),
					getMapMode().DPtoLP(50)));
			insetRightPolygon1.addPoint(new Point(getMapMode().DPtoLP(100),
					getMapMode().DPtoLP(0)));
			insetRightPolygon1.addPoint(new Point(getMapMode().DPtoLP(100),
					getMapMode().DPtoLP(50)));
			insetRightPolygon1.setFill(true);

			GridData constraintInsetRightPolygon1 = new GridData();
			constraintInsetRightPolygon1.verticalAlignment = GridData.BEGINNING;
			constraintInsetRightPolygon1.horizontalAlignment = GridData.BEGINNING;
			constraintInsetRightPolygon1.horizontalIndent = 0;
			constraintInsetRightPolygon1.horizontalSpan = 1;
			constraintInsetRightPolygon1.verticalSpan = 1;
			constraintInsetRightPolygon1.grabExcessHorizontalSpace = false;
			constraintInsetRightPolygon1.grabExcessVerticalSpace = false;
			patternNodeLabelPolygon0.add(insetRightPolygon1,
					constraintInsetRightPolygon1);

			ToolbarLayout layoutInsetRightPolygon1 = new ToolbarLayout();
			layoutInsetRightPolygon1.setStretchMinorAxis(false);
			layoutInsetRightPolygon1
					.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutInsetRightPolygon1.setSpacing(0);
			layoutInsetRightPolygon1.setVertical(false);

			insetRightPolygon1.setLayoutManager(layoutInsetRightPolygon1);

			WrappingLabel whitespaceLabel2 = new WrappingLabel();

			whitespaceLabel2.setText("  ");

			insetRightPolygon1.add(whitespaceLabel2);

			fFigurePatternNodeElementsPolygon = new ScalablePolygonShape();

			fFigurePatternNodeElementsPolygon.addPoint(new Point(getMapMode()
					.DPtoLP(0), getMapMode().DPtoLP(0)));
			fFigurePatternNodeElementsPolygon.addPoint(new Point(getMapMode()
					.DPtoLP(0), getMapMode().DPtoLP(99)));
			fFigurePatternNodeElementsPolygon.addPoint(new Point(getMapMode()
					.DPtoLP(100), getMapMode().DPtoLP(99)));
			fFigurePatternNodeElementsPolygon.addPoint(new Point(getMapMode()
					.DPtoLP(100), getMapMode().DPtoLP(0)));
			fFigurePatternNodeElementsPolygon.addPoint(new Point(getMapMode()
					.DPtoLP(100), getMapMode().DPtoLP(99)));
			fFigurePatternNodeElementsPolygon.addPoint(new Point(getMapMode()
					.DPtoLP(0), getMapMode().DPtoLP(99)));
			fFigurePatternNodeElementsPolygon.setFill(true);

			GridData constraintFFigurePatternNodeElementsPolygon = new GridData();
			constraintFFigurePatternNodeElementsPolygon.verticalAlignment = GridData.FILL;
			constraintFFigurePatternNodeElementsPolygon.horizontalAlignment = GridData.FILL;
			constraintFFigurePatternNodeElementsPolygon.horizontalIndent = 0;
			constraintFFigurePatternNodeElementsPolygon.horizontalSpan = 1;
			constraintFFigurePatternNodeElementsPolygon.verticalSpan = 1;
			constraintFFigurePatternNodeElementsPolygon.grabExcessHorizontalSpace = true;
			constraintFFigurePatternNodeElementsPolygon.grabExcessVerticalSpace = true;
			this.add(fFigurePatternNodeElementsPolygon,
					constraintFFigurePatternNodeElementsPolygon);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePatternNodeNameFigure() {
			return fFigurePatternNodeNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePatternNodeTypeFigure() {
			return fFigurePatternNodeTypeFigure;
		}

		/**
		 * @generated
		 */
		public ScalablePolygonShape getFigurePatternNodeElementsPolygon() {
			return fFigurePatternNodeElementsPolygon;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREPATTERNNODENAMEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Font COLONFIGURE2_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 9,
			SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Font FFIGUREPATTERNNODETYPEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.NORMAL);

}
