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
package de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts;

import java.util.Collection;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ComponentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.GroupRequestViaKeyboard;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class ConnectorQualityOfServiceAssumptionsEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3014;

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
	public ConnectorQualityOfServiceAssumptionsEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.policies.ConnectorQualityOfServiceAssumptionsItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());

		removeEditPolicy(EditPolicy.COMPONENT_ROLE);
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new ComponentEditPolicy() {
			@Override
			public Command getCommand(Request request) {
				// If the user presses the delete key, don't delete
				boolean keyboardDelete = request instanceof GroupRequestViaKeyboard
						&& RequestConstants.REQ_DELETE.equals(request.getType());
				if (request.getType() == RequestConstants.REQ_DELETE || keyboardDelete) {
					return UnexecutableCommand.INSTANCE;
				}

				return super.getCommand(request);
			}
		});
		removeEditPolicy(EditPolicyRoles.SEMANTIC_ROLE);
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.policies.ConnectorQualityOfServiceAssumptionsItemSemanticEditPolicy() {
					@Override
					protected Command getSemanticCommand(IEditCommandRequest request) {
						if (request instanceof DestroyRequest) {
							return null;
						}
						return super.getSemanticCommand(request);
					}
				});

		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);

		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new de.uni_paderborn.fujaba.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy());

		installEditPolicy(de.uni_paderborn.fujaba.common.edit.policies.EditPolicyRoles.ERROR_FEEDBACK_ROLE,
				new de.uni_paderborn.fujaba.common.edit.policies.ErrorFeedbackEditPolicy());

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
		return primaryShape = new QualityOfServiceAssumptionsFigureDescriptor();
	}

	/**
	 * @generated
	 */
	public QualityOfServiceAssumptionsFigureDescriptor getPrimaryShape() {
		return (QualityOfServiceAssumptionsFigureDescriptor) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.WrappingLabel2EditPart) {
			((de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.WrappingLabel2EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureMsgLossLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.WrappingLabel3EditPart) {
			((de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.WrappingLabel3EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureMaxDelayLabel());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.WrappingLabel2EditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.WrappingLabel3EditPart) {
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
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40) {
			@Override
			public ConnectionAnchor createDefaultAnchor() {
				de.uni_paderborn.fujaba.common.edit.policies.anchor.IConnectionAnchorCreationEditPolicy connectionAnchorCreationEditPolicy = (de.uni_paderborn.fujaba.common.edit.policies.anchor.IConnectionAnchorCreationEditPolicy) getEditPolicy(
						de.uni_paderborn.fujaba.common.edit.policies.EditPolicyRoles.CONNECTION_ANCHOR_CREATION_ROLE);
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
				de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.part.MumlVisualIDRegistry.getType(
						de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class QualityOfServiceAssumptionsFigureDescriptor extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMsgLossLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMaxDelayLabel;

		/**
		 * @generated
		 */
		public QualityOfServiceAssumptionsFigureDescriptor() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = false;
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			this.setBackgroundColor(THIS_BACK);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			WrappingLabel staticheadlinelabel0 = new WrappingLabel();

			staticheadlinelabel0.setText("QoS Assumptions:");

			staticheadlinelabel0.setFont(STATICHEADLINELABEL0_FONT);

			GridData constraintStaticheadlinelabel0 = new GridData();
			constraintStaticheadlinelabel0.verticalAlignment = GridData.CENTER;
			constraintStaticheadlinelabel0.horizontalAlignment = GridData.BEGINNING;
			constraintStaticheadlinelabel0.horizontalIndent = 0;
			constraintStaticheadlinelabel0.horizontalSpan = 2;
			constraintStaticheadlinelabel0.verticalSpan = 1;
			constraintStaticheadlinelabel0.grabExcessHorizontalSpace = true;
			constraintStaticheadlinelabel0.grabExcessVerticalSpace = false;
			this.add(staticheadlinelabel0, constraintStaticheadlinelabel0);

			fFigureMsgLossLabel = new WrappingLabel();

			fFigureMsgLossLabel.setText("");

			GridData constraintFFigureMsgLossLabel = new GridData();
			constraintFFigureMsgLossLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureMsgLossLabel.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureMsgLossLabel.horizontalIndent = 0;
			constraintFFigureMsgLossLabel.horizontalSpan = 1;
			constraintFFigureMsgLossLabel.verticalSpan = 1;
			constraintFFigureMsgLossLabel.grabExcessHorizontalSpace = false;
			constraintFFigureMsgLossLabel.grabExcessVerticalSpace = false;
			this.add(fFigureMsgLossLabel, constraintFFigureMsgLossLabel);

			fFigureMaxDelayLabel = new WrappingLabel();

			fFigureMaxDelayLabel.setText("");

			GridData constraintFFigureMaxDelayLabel = new GridData();
			constraintFFigureMaxDelayLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureMaxDelayLabel.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureMaxDelayLabel.horizontalIndent = 0;
			constraintFFigureMaxDelayLabel.horizontalSpan = 1;
			constraintFFigureMaxDelayLabel.verticalSpan = 1;
			constraintFFigureMaxDelayLabel.grabExcessHorizontalSpace = false;
			constraintFFigureMaxDelayLabel.grabExcessVerticalSpace = false;
			this.add(fFigureMaxDelayLabel, constraintFFigureMaxDelayLabel);

			WrappingLabel staticPreserveMsgOrderLabel0 = new WrappingLabel();

			staticPreserveMsgOrderLabel0.setText("PreserveMsgOrder: true");

			this.add(staticPreserveMsgOrderLabel0);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMsgLossLabel() {
			return fFigureMsgLossLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMaxDelayLabel() {
			return fFigureMaxDelayLabel;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 255, 255, 150);

	/**
	 * @generated
	 */
	static final Font STATICHEADLINELABEL0_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 9, SWT.BOLD);

}
