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
package org.muml.pim.componentinstanceconfiguration.diagram.edit.parts;

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
import org.muml.pim.componentinstanceconfiguration.diagram.edit.policies.StructuredComponentInstanceCanonicalEditPolicy;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.policies.StructuredComponentInstanceItemSemanticEditPolicy;
import org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry;
import org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes;

/**
 * @generated
 */
public class StructuredComponentInstanceEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2015;

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
	public StructuredComponentInstanceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(MumlVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new StructuredComponentInstanceItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new StructuredComponentInstanceCanonicalEditPolicy());
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
				View childView = (View) child.getModel();
				switch (MumlVisualIDRegistry.getVisualID(childView)) {
				case HybridPortInstance2EditPart.VISUAL_ID:
				case DiscreteSinglePortInstance3EditPart.VISUAL_ID:
				case DiscreteMultiPortInstance2EditPart.VISUAL_ID:
				case ContinuousPortInstance2EditPart.VISUAL_ID:
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
		return primaryShape = new StructuredComponentFigure();
	}

	/**
	 * @generated
	 */
	public StructuredComponentFigure getPrimaryShape() {
		return (StructuredComponentFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabelEditPart) {
			((WrappingLabelEditPart) childEditPart).setLabel(getPrimaryShape().getFigureComponentNameFigure());
			return true;
		}
		if (childEditPart instanceof StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureChildren();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof HybridPortInstance2EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.NORTH);
			getBorderedFigure().getBorderItemContainer().add(((HybridPortInstance2EditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		if (childEditPart instanceof DiscreteSinglePortInstance3EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.NORTH);
			getBorderedFigure().getBorderItemContainer()
					.add(((DiscreteSinglePortInstance3EditPart) childEditPart).getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof DiscreteMultiPortInstance2EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.NORTH);
			getBorderedFigure().getBorderItemContainer()
					.add(((DiscreteMultiPortInstance2EditPart) childEditPart).getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof ContinuousPortInstance2EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.NORTH);
			getBorderedFigure().getBorderItemContainer()
					.add(((ContinuousPortInstance2EditPart) childEditPart).getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabelEditPart) {
			return true;
		}
		if (childEditPart instanceof StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureChildren();
			pane.remove(((StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof HybridPortInstance2EditPart) {
			getBorderedFigure().getBorderItemContainer()
					.remove(((HybridPortInstance2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof DiscreteSinglePortInstance3EditPart) {
			getBorderedFigure().getBorderItemContainer()
					.remove(((DiscreteSinglePortInstance3EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof DiscreteMultiPortInstance2EditPart) {
			getBorderedFigure().getBorderItemContainer()
					.remove(((DiscreteMultiPortInstance2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ContinuousPortInstance2EditPart) {
			getBorderedFigure().getBorderItemContainer()
					.remove(((ContinuousPortInstance2EditPart) childEditPart).getFigure());
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
		if (editPart instanceof StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart) {
			return getPrimaryShape().getFigureChildren();
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
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(130, 47) {
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
		return getChildBySemanticHint(MumlVisualIDRegistry.getType(WrappingLabelEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == MumlElementTypes.ComponentInstanceConfiguration_3023) {
				return getChildBySemanticHint(MumlVisualIDRegistry
						.getType(StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class StructuredComponentFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureComponentNameFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureChildren;

		/**
		 * @generated
		 */
		public StructuredComponentFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure container0 = new RectangleFigure();

			container0.setFill(false);
			container0.setOutline(false);
			container0.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5)));

			GridData constraintContainer0 = new GridData();
			constraintContainer0.verticalAlignment = GridData.BEGINNING;
			constraintContainer0.horizontalAlignment = GridData.FILL;
			constraintContainer0.horizontalIndent = 0;
			constraintContainer0.horizontalSpan = 1;
			constraintContainer0.verticalSpan = 1;
			constraintContainer0.grabExcessHorizontalSpace = true;
			constraintContainer0.grabExcessVerticalSpace = false;
			this.add(container0, constraintContainer0);

			GridLayout layoutContainer0 = new GridLayout();
			layoutContainer0.numColumns = 2;
			layoutContainer0.makeColumnsEqualWidth = false;
			container0.setLayoutManager(layoutContainer0);

			fFigureComponentNameFigure = new WrappingLabel();

			fFigureComponentNameFigure.setText("");

			fFigureComponentNameFigure.setFont(FFIGURECOMPONENTNAMEFIGURE_FONT);

			GridData constraintFFigureComponentNameFigure = new GridData();
			constraintFFigureComponentNameFigure.verticalAlignment = GridData.BEGINNING;
			constraintFFigureComponentNameFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureComponentNameFigure.horizontalIndent = 0;
			constraintFFigureComponentNameFigure.horizontalSpan = 1;
			constraintFFigureComponentNameFigure.verticalSpan = 1;
			constraintFFigureComponentNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureComponentNameFigure.grabExcessVerticalSpace = false;
			container0.add(fFigureComponentNameFigure, constraintFFigureComponentNameFigure);

			RectangleFigure componentIconFigure1 = new RectangleFigure();

			componentIconFigure1.setFill(false);
			componentIconFigure1.setOutline(false);
			componentIconFigure1.setPreferredSize(new Dimension(getMapMode().DPtoLP(20), getMapMode().DPtoLP(20)));

			GridData constraintComponentIconFigure1 = new GridData();
			constraintComponentIconFigure1.verticalAlignment = GridData.BEGINNING;
			constraintComponentIconFigure1.horizontalAlignment = GridData.END;
			constraintComponentIconFigure1.horizontalIndent = 0;
			constraintComponentIconFigure1.horizontalSpan = 1;
			constraintComponentIconFigure1.verticalSpan = 1;
			constraintComponentIconFigure1.grabExcessHorizontalSpace = true;
			constraintComponentIconFigure1.grabExcessVerticalSpace = false;
			container0.add(componentIconFigure1, constraintComponentIconFigure1);

			componentIconFigure1.setLayoutManager(new StackLayout());

			RectangleFigure componentIconOuter2 = new RectangleFigure();

			componentIconOuter2.setFill(false);
			componentIconOuter2.setOutline(false);

			componentIconFigure1.add(componentIconOuter2);
			componentIconOuter2.setLayoutManager(new XYLayout());

			RectangleFigure b13 = new RectangleFigure();

			componentIconOuter2.add(b13, new Rectangle(getMapMode().DPtoLP(4), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(16), getMapMode().DPtoLP(20)));

			RectangleFigure componentIconInner12 = new RectangleFigure();

			componentIconInner12.setFill(false);
			componentIconInner12.setOutline(false);

			componentIconFigure1.add(componentIconInner12);
			componentIconInner12.setLayoutManager(new XYLayout());

			RectangleFigure c13 = new RectangleFigure();

			componentIconInner12.add(c13, new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(2),
					getMapMode().DPtoLP(12), getMapMode().DPtoLP(6)));

			RectangleFigure componentIconInner22 = new RectangleFigure();

			componentIconInner22.setFill(false);
			componentIconInner22.setOutline(false);

			componentIconFigure1.add(componentIconInner22);
			componentIconInner22.setLayoutManager(new XYLayout());

			RectangleFigure d13 = new RectangleFigure();

			componentIconInner22.add(d13, new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(12), getMapMode().DPtoLP(6)));

			// Process FigureRef details

			container0.add(componentIconFigure1);

			fFigureChildren = new RectangleFigure();

			fFigureChildren.setFill(false);
			fFigureChildren.setOutline(false);

			GridData constraintFFigureChildren = new GridData();
			constraintFFigureChildren.verticalAlignment = GridData.FILL;
			constraintFFigureChildren.horizontalAlignment = GridData.FILL;
			constraintFFigureChildren.horizontalIndent = 0;
			constraintFFigureChildren.horizontalSpan = 1;
			constraintFFigureChildren.verticalSpan = 1;
			constraintFFigureChildren.grabExcessHorizontalSpace = true;
			constraintFFigureChildren.grabExcessVerticalSpace = true;
			this.add(fFigureChildren, constraintFFigureChildren);

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
		public RectangleFigure getFigureChildren() {
			return fFigureChildren;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGURECOMPONENTNAMEFIGURE_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 9, SWT.BOLD);

}
