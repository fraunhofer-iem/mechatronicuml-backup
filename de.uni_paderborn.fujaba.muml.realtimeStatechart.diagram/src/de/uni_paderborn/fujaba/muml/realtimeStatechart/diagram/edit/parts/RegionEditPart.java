package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts;

import java.util.Collections;
import java.util.List;
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
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
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
public class RegionEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3006;

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
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.policies.RegionItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
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
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionNameEditPart) {
			((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureRegionNameLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionPriorityEditPart) {
			((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionPriorityEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureRegionPriorityLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel8EditPart) {
			((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel8EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureRegionVariablesLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionFujabaRealtimeStatechartCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureFujabaRealtimeStatechartCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionFujabaRealtimeStatechartCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionNameEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionPriorityEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel8EditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionFujabaRealtimeStatechartCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureFujabaRealtimeStatechartCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionFujabaRealtimeStatechartCompartmentEditPart) childEditPart)
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
		if (editPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionFujabaRealtimeStatechartCompartmentEditPart) {
			return getPrimaryShape()
					.getFigureFujabaRealtimeStatechartCompartment();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
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
		return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class RegionFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureFujabaRealtimeStatechartCompartment;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegionNameLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegionPriorityLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegionVariablesLabel;

		/**
		 * @generated
		 */
		public RegionFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setFill(false);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure regionTitleArea0 = new RectangleFigure();
			regionTitleArea0.setFill(false);
			regionTitleArea0.setOutline(false);

			GridData constraintRegionTitleArea0 = new GridData();
			constraintRegionTitleArea0.verticalAlignment = GridData.CENTER;
			constraintRegionTitleArea0.horizontalAlignment = GridData.FILL;
			constraintRegionTitleArea0.horizontalIndent = 0;
			constraintRegionTitleArea0.horizontalSpan = 1;
			constraintRegionTitleArea0.verticalSpan = 1;
			constraintRegionTitleArea0.grabExcessHorizontalSpace = true;
			constraintRegionTitleArea0.grabExcessVerticalSpace = false;
			this.add(regionTitleArea0, constraintRegionTitleArea0);

			GridLayout layoutRegionTitleArea0 = new GridLayout();
			layoutRegionTitleArea0.numColumns = 3;
			layoutRegionTitleArea0.makeColumnsEqualWidth = false;
			regionTitleArea0.setLayoutManager(layoutRegionTitleArea0);

			fFigureRegionNameLabel = new WrappingLabel();
			fFigureRegionNameLabel.setText("");

			regionTitleArea0.add(fFigureRegionNameLabel);

			fFigureRegionVariablesLabel = new WrappingLabel();
			fFigureRegionVariablesLabel.setText("");

			GridData constraintFFigureRegionVariablesLabel = new GridData();
			constraintFFigureRegionVariablesLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureRegionVariablesLabel.horizontalAlignment = GridData.FILL;
			constraintFFigureRegionVariablesLabel.horizontalIndent = 0;
			constraintFFigureRegionVariablesLabel.horizontalSpan = 1;
			constraintFFigureRegionVariablesLabel.verticalSpan = 1;
			constraintFFigureRegionVariablesLabel.grabExcessHorizontalSpace = true;
			constraintFFigureRegionVariablesLabel.grabExcessVerticalSpace = false;
			regionTitleArea0.add(fFigureRegionVariablesLabel,
					constraintFFigureRegionVariablesLabel);

			Ellipse regionPriority1 = new Ellipse();

			regionTitleArea0.add(regionPriority1);
			regionPriority1.setLayoutManager(new StackLayout());

			fFigureRegionPriorityLabel = new WrappingLabel();
			fFigureRegionPriorityLabel.setText("");

			fFigureRegionPriorityLabel.setFont(FFIGUREREGIONPRIORITYLABEL_FONT);

			fFigureRegionPriorityLabel.setBorder(new MarginBorder(getMapMode()
					.DPtoLP(2), getMapMode().DPtoLP(5), getMapMode().DPtoLP(2),
					getMapMode().DPtoLP(5)));

			regionPriority1.add(fFigureRegionPriorityLabel);

			fFigureFujabaRealtimeStatechartCompartment = new RectangleFigure();
			fFigureFujabaRealtimeStatechartCompartment.setFill(false);
			fFigureFujabaRealtimeStatechartCompartment.setOutline(false);

			GridData constraintFFigureFujabaRealtimeStatechartCompartment = new GridData();
			constraintFFigureFujabaRealtimeStatechartCompartment.verticalAlignment = GridData.FILL;
			constraintFFigureFujabaRealtimeStatechartCompartment.horizontalAlignment = GridData.FILL;
			constraintFFigureFujabaRealtimeStatechartCompartment.horizontalIndent = 0;
			constraintFFigureFujabaRealtimeStatechartCompartment.horizontalSpan = 1;
			constraintFFigureFujabaRealtimeStatechartCompartment.verticalSpan = 1;
			constraintFFigureFujabaRealtimeStatechartCompartment.grabExcessHorizontalSpace = true;
			constraintFFigureFujabaRealtimeStatechartCompartment.grabExcessVerticalSpace = true;
			this.add(fFigureFujabaRealtimeStatechartCompartment,
					constraintFFigureFujabaRealtimeStatechartCompartment);

		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureFujabaRealtimeStatechartCompartment() {
			return fFigureFujabaRealtimeStatechartCompartment;
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
		public WrappingLabel getFigureRegionPriorityLabel() {
			return fFigureRegionPriorityLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRegionVariablesLabel() {
			return fFigureRegionVariablesLabel;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREREGIONPRIORITYLABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 8, SWT.NORMAL);

}