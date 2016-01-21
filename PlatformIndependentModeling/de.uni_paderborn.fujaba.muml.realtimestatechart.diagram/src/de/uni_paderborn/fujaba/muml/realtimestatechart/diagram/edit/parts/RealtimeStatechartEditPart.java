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
package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts;

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
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.policies.RealtimeStatechartItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
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
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartNameEditPart) {
			((de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureStatechartNameLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabelEditPart) {
			((de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabelEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureStatechartOperationLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel10EditPart) {
			((de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel10EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureStatechartClockLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel11EditPart) {
			((de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel11EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureStatechartVariableLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureStatechartContentsCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(
					((de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartNameEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabelEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel10EditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel11EditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureStatechartContentsCompartment();
			pane.remove(
					((de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartmentEditPart) childEditPart)
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
		if (editPart instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartmentEditPart) {
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
				de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
						de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartNameEditPart.VISUAL_ID));
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
		private RectangleFigure fFigureStatechartContentsCompartment;
		/**
		* @generated
		*/
		private WrappingLabel fFigureStatechartOperationLabel;
		/**
		* @generated
		*/
		private WrappingLabel fFigureStatechartClockLabel;
		/**
		* @generated
		*/
		private WrappingLabel fFigureStatechartVariableLabel;

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
			layoutStatechartTitleAreaFigure0.numColumns = 2;
			layoutStatechartTitleAreaFigure0.makeColumnsEqualWidth = false;
			statechartTitleAreaFigure0.setLayoutManager(layoutStatechartTitleAreaFigure0);

			fFigureStatechartNameLabel = new WrappingLabel();

			fFigureStatechartNameLabel.setText("");

			statechartTitleAreaFigure0.add(fFigureStatechartNameLabel);

			RectangleFigure statechartInformation1 = new RectangleFigure();

			GridData constraintStatechartInformation1 = new GridData();
			constraintStatechartInformation1.verticalAlignment = GridData.CENTER;
			constraintStatechartInformation1.horizontalAlignment = GridData.END;
			constraintStatechartInformation1.horizontalIndent = 0;
			constraintStatechartInformation1.horizontalSpan = 1;
			constraintStatechartInformation1.verticalSpan = 1;
			constraintStatechartInformation1.grabExcessHorizontalSpace = true;
			constraintStatechartInformation1.grabExcessVerticalSpace = false;
			statechartTitleAreaFigure0.add(statechartInformation1, constraintStatechartInformation1);

			GridLayout layoutStatechartInformation1 = new GridLayout();
			layoutStatechartInformation1.numColumns = 1;
			layoutStatechartInformation1.makeColumnsEqualWidth = true;
			statechartInformation1.setLayoutManager(layoutStatechartInformation1);

			RectangleFigure operationRectangle2 = new RectangleFigure();

			statechartInformation1.add(operationRectangle2);

			GridLayout layoutOperationRectangle2 = new GridLayout();
			layoutOperationRectangle2.numColumns = 2;
			layoutOperationRectangle2.makeColumnsEqualWidth = false;
			operationRectangle2.setLayoutManager(layoutOperationRectangle2);

			WrappingLabel operation3 = new WrappingLabel();

			operation3.setText("operation");

			operation3.setFont(OPERATION3_FONT);

			GridData constraintOperation3 = new GridData();
			constraintOperation3.verticalAlignment = GridData.CENTER;
			constraintOperation3.horizontalAlignment = GridData.BEGINNING;
			constraintOperation3.horizontalIndent = 0;
			constraintOperation3.horizontalSpan = 1;
			constraintOperation3.verticalSpan = 1;
			constraintOperation3.grabExcessHorizontalSpace = false;
			constraintOperation3.grabExcessVerticalSpace = false;
			operationRectangle2.add(operation3, constraintOperation3);

			WrappingLabel operationLabel3 = new WrappingLabel();

			operationLabel3.setText("");

			GridData constraintOperationLabel3 = new GridData();
			constraintOperationLabel3.verticalAlignment = GridData.CENTER;
			constraintOperationLabel3.horizontalAlignment = GridData.FILL;
			constraintOperationLabel3.horizontalIndent = 0;
			constraintOperationLabel3.horizontalSpan = 1;
			constraintOperationLabel3.verticalSpan = 1;
			constraintOperationLabel3.grabExcessHorizontalSpace = false;
			constraintOperationLabel3.grabExcessVerticalSpace = false;
			operationRectangle2.add(operationLabel3, constraintOperationLabel3);

			RectangleFigure clockVariableRectangle2 = new RectangleFigure();

			statechartInformation1.add(clockVariableRectangle2);

			GridLayout layoutClockVariableRectangle2 = new GridLayout();
			layoutClockVariableRectangle2.numColumns = 4;
			layoutClockVariableRectangle2.makeColumnsEqualWidth = false;
			clockVariableRectangle2.setLayoutManager(layoutClockVariableRectangle2);

			WrappingLabel clock3 = new WrappingLabel();

			clock3.setText("clock");

			clock3.setFont(CLOCK3_FONT);

			GridData constraintClock3 = new GridData();
			constraintClock3.verticalAlignment = GridData.CENTER;
			constraintClock3.horizontalAlignment = GridData.BEGINNING;
			constraintClock3.horizontalIndent = 0;
			constraintClock3.horizontalSpan = 1;
			constraintClock3.verticalSpan = 1;
			constraintClock3.grabExcessHorizontalSpace = false;
			constraintClock3.grabExcessVerticalSpace = false;
			clockVariableRectangle2.add(clock3, constraintClock3);

			WrappingLabel clockLabel3 = new WrappingLabel();

			clockLabel3.setText("");

			GridData constraintClockLabel3 = new GridData();
			constraintClockLabel3.verticalAlignment = GridData.CENTER;
			constraintClockLabel3.horizontalAlignment = GridData.FILL;
			constraintClockLabel3.horizontalIndent = 0;
			constraintClockLabel3.horizontalSpan = 1;
			constraintClockLabel3.verticalSpan = 1;
			constraintClockLabel3.grabExcessHorizontalSpace = false;
			constraintClockLabel3.grabExcessVerticalSpace = false;
			clockVariableRectangle2.add(clockLabel3, constraintClockLabel3);

			WrappingLabel variable3 = new WrappingLabel();

			variable3.setText("variable");

			variable3.setFont(VARIABLE3_FONT);

			GridData constraintVariable3 = new GridData();
			constraintVariable3.verticalAlignment = GridData.CENTER;
			constraintVariable3.horizontalAlignment = GridData.BEGINNING;
			constraintVariable3.horizontalIndent = 0;
			constraintVariable3.horizontalSpan = 1;
			constraintVariable3.verticalSpan = 1;
			constraintVariable3.grabExcessHorizontalSpace = false;
			constraintVariable3.grabExcessVerticalSpace = false;
			clockVariableRectangle2.add(variable3, constraintVariable3);

			WrappingLabel variableLabel3 = new WrappingLabel();

			variableLabel3.setText("");

			GridData constraintVariableLabel3 = new GridData();
			constraintVariableLabel3.verticalAlignment = GridData.CENTER;
			constraintVariableLabel3.horizontalAlignment = GridData.FILL;
			constraintVariableLabel3.horizontalIndent = 0;
			constraintVariableLabel3.horizontalSpan = 1;
			constraintVariableLabel3.verticalSpan = 1;
			constraintVariableLabel3.grabExcessHorizontalSpace = false;
			constraintVariableLabel3.grabExcessVerticalSpace = false;
			clockVariableRectangle2.add(variableLabel3, constraintVariableLabel3);

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
		public RectangleFigure getFigureStatechartContentsCompartment() {
			return fFigureStatechartContentsCompartment;
		}

		/**
		* @generated
		*/
		public WrappingLabel getFigureStatechartOperationLabel() {
			return fFigureStatechartOperationLabel;
		}

		/**
		* @generated
		*/
		public WrappingLabel getFigureStatechartClockLabel() {
			return fFigureStatechartClockLabel;
		}

		/**
		* @generated
		*/
		public WrappingLabel getFigureStatechartVariableLabel() {
			return fFigureStatechartVariableLabel;
		}

	}

	/**
	* @generated
	*/
	static final Font OPERATION3_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 8, SWT.BOLD);

	/**
	* @generated
	*/
	static final Font CLOCK3_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 8, SWT.BOLD);

	/**
	* @generated
	*/
	static final Font VARIABLE3_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 8, SWT.BOLD);

}
