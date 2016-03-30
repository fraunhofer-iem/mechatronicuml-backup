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
package de.uni_paderborn.fujaba.muml.component.diagram.edit.parts;

import java.util.Collection;

import org.eclipse.draw2d.ConnectionAnchor;
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
public class ComponentPartEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3012;

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
				org.muml.common.edit.policies.EditPolicyRoles.BACKGROUND_COLOR_ROLE);
		if (backgroundColorPolicy instanceof de.uni_paderborn.fujaba.muml.common.edit.policies.IBackgroundColorEditPolicy) {
			setBackgroundColor(
					((de.uni_paderborn.fujaba.muml.common.edit.policies.IBackgroundColorEditPolicy) backgroundColorPolicy)
							.getCurrentBackgroundColor());
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
	public ComponentPartEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicyWithCustomReparent(
				de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.muml.component.diagram.edit.policies.ComponentPartItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new de.uni_paderborn.fujaba.muml.component.diagram.edit.policies.ComponentPartCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());

		installEditPolicy(org.muml.common.edit.policies.EditPolicyRoles.BACKGROUND_COLOR_ROLE,
				new de.uni_paderborn.fujaba.muml.common.edit.policies.component.ComponentColorEditPolicy());

		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);

		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new org.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy());

		installEditPolicy(org.muml.common.edit.policies.EditPolicyRoles.ERROR_FEEDBACK_ROLE,
				new org.muml.common.edit.policies.ErrorFeedbackEditPolicy());

	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
						.getVisualID(childView)) {
				case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartEditPart.VISUAL_ID:
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
		return primaryShape = new ComponentMultiFigure();
	}

	/**
	 * @generated
	 */
	public ComponentMultiFigure getPrimaryShape() {
		return (ComponentMultiFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.WrappingLabel3EditPart) {
			((de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.WrappingLabel3EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureComponentNameFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.SOUTH);
			getBorderedFigure().getBorderItemContainer()
					.add(((de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartEditPart) childEditPart)
							.getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.WrappingLabel3EditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartEditPart) {
			getBorderedFigure().getBorderItemContainer()
					.remove(((de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartEditPart) childEditPart)
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
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(130, 47) {
			@Override
			public ConnectionAnchor createDefaultAnchor() {
				org.muml.common.edit.policies.anchor.IConnectionAnchorCreationEditPolicy connectionAnchorCreationEditPolicy = (org.muml.common.edit.policies.anchor.IConnectionAnchorCreationEditPolicy) getEditPolicy(
						org.muml.common.edit.policies.EditPolicyRoles.CONNECTION_ANCHOR_CREATION_ROLE);
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
		return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ComponentMultiFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureComponentNameFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureInnerRectContainer;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureComponentIconRectangle;

		/**
		 * @generated
		 */
		public ComponentMultiFigure() {
			this.setLayoutManager(new StackLayout());
			this.setFill(false);
			this.setOutline(false);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure aux10 = new RectangleFigure();

			aux10.setFill(false);
			aux10.setOutline(false);
			aux10.setBorder(new MarginBorder(getMapMode().DPtoLP(0), getMapMode().DPtoLP(3), getMapMode().DPtoLP(3),
					getMapMode().DPtoLP(0)));

			this.add(aux10);
			aux10.setLayoutManager(new StackLayout());

			RectangleFigure shadow1 = new RectangleFigure();

			aux10.add(shadow1);

			fFigureInnerRectContainer = new RectangleFigure();

			fFigureInnerRectContainer.setFill(false);
			fFigureInnerRectContainer.setOutline(false);
			fFigureInnerRectContainer.setBorder(new MarginBorder(getMapMode().DPtoLP(8), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(3)));

			this.add(fFigureInnerRectContainer);
			fFigureInnerRectContainer.setLayoutManager(new StackLayout());

			RectangleFigure componentFigure1 = new RectangleFigure();

			componentFigure1.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5)));

			fFigureInnerRectContainer.add(componentFigure1);
			componentFigure1.setLayoutManager(new StackLayout());

			fFigureComponentIconRectangle = new RectangleFigure();

			fFigureComponentIconRectangle.setFill(false);
			fFigureComponentIconRectangle.setOutline(false);

			componentFigure1.add(fFigureComponentIconRectangle);

			GridLayout layoutFFigureComponentIconRectangle = new GridLayout();
			layoutFFigureComponentIconRectangle.numColumns = 1;
			layoutFFigureComponentIconRectangle.makeColumnsEqualWidth = false;
			fFigureComponentIconRectangle.setLayoutManager(layoutFFigureComponentIconRectangle);

			RectangleFigure componentIconFigure3 = new RectangleFigure();

			componentIconFigure3.setFill(false);
			componentIconFigure3.setOutline(false);
			componentIconFigure3.setPreferredSize(new Dimension(getMapMode().DPtoLP(20), getMapMode().DPtoLP(20)));

			GridData constraintComponentIconFigure3 = new GridData();
			constraintComponentIconFigure3.verticalAlignment = GridData.BEGINNING;
			constraintComponentIconFigure3.horizontalAlignment = GridData.END;
			constraintComponentIconFigure3.horizontalIndent = 0;
			constraintComponentIconFigure3.horizontalSpan = 1;
			constraintComponentIconFigure3.verticalSpan = 1;
			constraintComponentIconFigure3.grabExcessHorizontalSpace = true;
			constraintComponentIconFigure3.grabExcessVerticalSpace = false;
			fFigureComponentIconRectangle.add(componentIconFigure3, constraintComponentIconFigure3);

			componentIconFigure3.setLayoutManager(new StackLayout());

			RectangleFigure componentIconOuter4 = new RectangleFigure();

			componentIconOuter4.setFill(false);
			componentIconOuter4.setOutline(false);

			componentIconFigure3.add(componentIconOuter4);
			componentIconOuter4.setLayoutManager(new XYLayout());

			RectangleFigure b15 = new RectangleFigure();

			componentIconOuter4.add(b15, new Rectangle(getMapMode().DPtoLP(4), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(16), getMapMode().DPtoLP(20)));

			RectangleFigure componentIconInner14 = new RectangleFigure();

			componentIconInner14.setFill(false);
			componentIconInner14.setOutline(false);

			componentIconFigure3.add(componentIconInner14);
			componentIconInner14.setLayoutManager(new XYLayout());

			RectangleFigure c15 = new RectangleFigure();

			componentIconInner14.add(c15, new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(2),
					getMapMode().DPtoLP(12), getMapMode().DPtoLP(6)));

			RectangleFigure componentIconInner24 = new RectangleFigure();

			componentIconInner24.setFill(false);
			componentIconInner24.setOutline(false);

			componentIconFigure3.add(componentIconInner24);
			componentIconInner24.setLayoutManager(new XYLayout());

			RectangleFigure d15 = new RectangleFigure();

			componentIconInner24.add(d15, new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(12), getMapMode().DPtoLP(6)));

			// Process FigureRef details

			fFigureComponentIconRectangle.add(componentIconFigure3);

			RectangleFigure componentNameRectangle2 = new RectangleFigure();

			componentNameRectangle2.setFill(false);
			componentNameRectangle2.setOutline(false);

			componentFigure1.add(componentNameRectangle2);

			GridLayout layoutComponentNameRectangle2 = new GridLayout();
			layoutComponentNameRectangle2.numColumns = 1;
			layoutComponentNameRectangle2.makeColumnsEqualWidth = false;
			componentNameRectangle2.setLayoutManager(layoutComponentNameRectangle2);

			fFigureComponentNameFigure = new WrappingLabel();

			fFigureComponentNameFigure.setText("");

			fFigureComponentNameFigure.setFont(FFIGURECOMPONENTNAMEFIGURE_FONT);

			GridData constraintFFigureComponentNameFigure = new GridData();
			constraintFFigureComponentNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureComponentNameFigure.horizontalAlignment = GridData.FILL;
			constraintFFigureComponentNameFigure.horizontalIndent = 0;
			constraintFFigureComponentNameFigure.horizontalSpan = 1;
			constraintFFigureComponentNameFigure.verticalSpan = 1;
			constraintFFigureComponentNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureComponentNameFigure.grabExcessVerticalSpace = true;
			componentNameRectangle2.add(fFigureComponentNameFigure, constraintFFigureComponentNameFigure);

			// Process FigureRef details

			fFigureInnerRectContainer.add(componentFigure1);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureComponentNameFigure() {
			return fFigureComponentNameFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureInnerRectContainer() {
			return fFigureInnerRectContainer;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureComponentIconRectangle() {
			return fFigureComponentIconRectangle;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGURECOMPONENTNAMEFIGURE_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 9, SWT.BOLD);

}
