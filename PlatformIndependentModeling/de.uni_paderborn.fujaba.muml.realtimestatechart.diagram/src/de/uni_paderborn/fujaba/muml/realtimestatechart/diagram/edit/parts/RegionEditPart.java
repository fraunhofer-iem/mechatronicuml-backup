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
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicyWithCustomReparent(
				de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.policies.RegionItemSemanticEditPolicy());
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
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionNameEditPart) {
			((de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureStatechartNameLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionPriorityEditPart) {
			((de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionPriorityEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureRegionPriorityLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel7EditPart) {
			((de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel7EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureRegionOperationLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionRegionContentsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureRegionContentsCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(
					((de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionRegionContentsCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionNameEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionPriorityEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel7EditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionRegionContentsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureRegionContentsCompartment();
			pane.remove(
					((de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionRegionContentsCompartmentEditPart) childEditPart)
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
		if (editPart instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionRegionContentsCompartmentEditPart) {
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
						de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.RealtimeStatechart_3043) {
				return getChildBySemanticHint(
						de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
								de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionRegionContentsCompartmentEditPart.VISUAL_ID));
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
		private WrappingLabel fFigureRegionPriorityLabel;
		/**
		* @generated
		*/
		private WrappingLabel fFigureRegionNameLabel;
		/**
		* @generated
		*/
		private WrappingLabel fFigureRegionOperationLabel;
		/**
		* @generated
		*/
		private WrappingLabel fFigureRegionClockLabel;
		/**
		* @generated
		*/
		private WrappingLabel fFigureRegionVariableLabel;

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
			layoutStatechartTitleAreaFigure1.numColumns = 2;
			layoutStatechartTitleAreaFigure1.makeColumnsEqualWidth = false;
			statechartTitleAreaFigure1.setLayoutManager(layoutStatechartTitleAreaFigure1);

			fFigureStatechartNameLabel = new WrappingLabel();

			fFigureStatechartNameLabel.setText("");

			statechartTitleAreaFigure1.add(fFigureStatechartNameLabel);

			RectangleFigure statechartInformation2 = new RectangleFigure();

			GridData constraintStatechartInformation2 = new GridData();
			constraintStatechartInformation2.verticalAlignment = GridData.CENTER;
			constraintStatechartInformation2.horizontalAlignment = GridData.END;
			constraintStatechartInformation2.horizontalIndent = 0;
			constraintStatechartInformation2.horizontalSpan = 1;
			constraintStatechartInformation2.verticalSpan = 1;
			constraintStatechartInformation2.grabExcessHorizontalSpace = true;
			constraintStatechartInformation2.grabExcessVerticalSpace = false;
			statechartTitleAreaFigure1.add(statechartInformation2, constraintStatechartInformation2);

			GridLayout layoutStatechartInformation2 = new GridLayout();
			layoutStatechartInformation2.numColumns = 1;
			layoutStatechartInformation2.makeColumnsEqualWidth = true;
			statechartInformation2.setLayoutManager(layoutStatechartInformation2);

			RectangleFigure operationRectangle3 = new RectangleFigure();

			statechartInformation2.add(operationRectangle3);

			GridLayout layoutOperationRectangle3 = new GridLayout();
			layoutOperationRectangle3.numColumns = 2;
			layoutOperationRectangle3.makeColumnsEqualWidth = false;
			operationRectangle3.setLayoutManager(layoutOperationRectangle3);

			WrappingLabel operation4 = new WrappingLabel();

			operation4.setText("operation");

			operation4.setFont(OPERATION4_FONT);

			GridData constraintOperation4 = new GridData();
			constraintOperation4.verticalAlignment = GridData.CENTER;
			constraintOperation4.horizontalAlignment = GridData.BEGINNING;
			constraintOperation4.horizontalIndent = 0;
			constraintOperation4.horizontalSpan = 1;
			constraintOperation4.verticalSpan = 1;
			constraintOperation4.grabExcessHorizontalSpace = false;
			constraintOperation4.grabExcessVerticalSpace = false;
			operationRectangle3.add(operation4, constraintOperation4);

			WrappingLabel operationLabel4 = new WrappingLabel();

			operationLabel4.setText("");

			GridData constraintOperationLabel4 = new GridData();
			constraintOperationLabel4.verticalAlignment = GridData.CENTER;
			constraintOperationLabel4.horizontalAlignment = GridData.FILL;
			constraintOperationLabel4.horizontalIndent = 0;
			constraintOperationLabel4.horizontalSpan = 1;
			constraintOperationLabel4.verticalSpan = 1;
			constraintOperationLabel4.grabExcessHorizontalSpace = false;
			constraintOperationLabel4.grabExcessVerticalSpace = false;
			operationRectangle3.add(operationLabel4, constraintOperationLabel4);

			RectangleFigure clockVariableRectangle3 = new RectangleFigure();

			statechartInformation2.add(clockVariableRectangle3);

			GridLayout layoutClockVariableRectangle3 = new GridLayout();
			layoutClockVariableRectangle3.numColumns = 4;
			layoutClockVariableRectangle3.makeColumnsEqualWidth = false;
			clockVariableRectangle3.setLayoutManager(layoutClockVariableRectangle3);

			WrappingLabel clock4 = new WrappingLabel();

			clock4.setText("clock");

			clock4.setFont(CLOCK4_FONT);

			GridData constraintClock4 = new GridData();
			constraintClock4.verticalAlignment = GridData.CENTER;
			constraintClock4.horizontalAlignment = GridData.BEGINNING;
			constraintClock4.horizontalIndent = 0;
			constraintClock4.horizontalSpan = 1;
			constraintClock4.verticalSpan = 1;
			constraintClock4.grabExcessHorizontalSpace = false;
			constraintClock4.grabExcessVerticalSpace = false;
			clockVariableRectangle3.add(clock4, constraintClock4);

			WrappingLabel clockLabel4 = new WrappingLabel();

			clockLabel4.setText("");

			GridData constraintClockLabel4 = new GridData();
			constraintClockLabel4.verticalAlignment = GridData.CENTER;
			constraintClockLabel4.horizontalAlignment = GridData.FILL;
			constraintClockLabel4.horizontalIndent = 0;
			constraintClockLabel4.horizontalSpan = 1;
			constraintClockLabel4.verticalSpan = 1;
			constraintClockLabel4.grabExcessHorizontalSpace = false;
			constraintClockLabel4.grabExcessVerticalSpace = false;
			clockVariableRectangle3.add(clockLabel4, constraintClockLabel4);

			WrappingLabel variable4 = new WrappingLabel();

			variable4.setText("variable");

			variable4.setFont(VARIABLE4_FONT);

			GridData constraintVariable4 = new GridData();
			constraintVariable4.verticalAlignment = GridData.CENTER;
			constraintVariable4.horizontalAlignment = GridData.BEGINNING;
			constraintVariable4.horizontalIndent = 0;
			constraintVariable4.horizontalSpan = 1;
			constraintVariable4.verticalSpan = 1;
			constraintVariable4.grabExcessHorizontalSpace = false;
			constraintVariable4.grabExcessVerticalSpace = false;
			clockVariableRectangle3.add(variable4, constraintVariable4);

			WrappingLabel variableLabel4 = new WrappingLabel();

			variableLabel4.setText("");

			GridData constraintVariableLabel4 = new GridData();
			constraintVariableLabel4.verticalAlignment = GridData.CENTER;
			constraintVariableLabel4.horizontalAlignment = GridData.FILL;
			constraintVariableLabel4.horizontalIndent = 0;
			constraintVariableLabel4.horizontalSpan = 1;
			constraintVariableLabel4.verticalSpan = 1;
			constraintVariableLabel4.grabExcessHorizontalSpace = false;
			constraintVariableLabel4.grabExcessVerticalSpace = false;
			clockVariableRectangle3.add(variableLabel4, constraintVariableLabel4);

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
		public WrappingLabel getFigureRegionPriorityLabel() {
			return fFigureRegionPriorityLabel;
		}

		/**
		* @generated
		*/
		public WrappingLabel getFigureRegionNameLabel() {
			return fFigureRegionNameLabel;
		}

		/**
		* @generated
		*/
		public WrappingLabel getFigureRegionOperationLabel() {
			return fFigureRegionOperationLabel;
		}

		/**
		* @generated
		*/
		public WrappingLabel getFigureRegionClockLabel() {
			return fFigureRegionClockLabel;
		}

		/**
		* @generated
		*/
		public WrappingLabel getFigureRegionVariableLabel() {
			return fFigureRegionVariableLabel;
		}

	}

	/**
	* @generated
	*/
	static final Font OPERATION4_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 8, SWT.BOLD);

	/**
	* @generated
	*/
	static final Font CLOCK4_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 8, SWT.BOLD);

	/**
	* @generated
	*/
	static final Font VARIABLE4_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 8, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font FFIGUREREGIONPRIORITYLABEL_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 8, SWT.NORMAL);

}
