package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
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
	public class RegionFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegionVariablesLabel;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureFujabaRealtimeStatechartCompartment;

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

			WrappingLabel regionNameLabel1 = new WrappingLabel();
			regionNameLabel1.setText("name");

			regionTitleArea0.add(regionNameLabel1);

			fFigureRegionVariablesLabel = new WrappingLabel();
			fFigureRegionVariablesLabel.setText("text");

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

			WrappingLabel regionPriorityLabel2 = new WrappingLabel();
			regionPriorityLabel2.setText("3");

			regionPriorityLabel2.setFont(REGIONPRIORITYLABEL2_FONT);

			regionPriorityLabel2.setBorder(new MarginBorder(getMapMode()
					.DPtoLP(2), getMapMode().DPtoLP(5), getMapMode().DPtoLP(2),
					getMapMode().DPtoLP(5)));

			regionPriority1.add(regionPriorityLabel2);

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
		public WrappingLabel getFigureRegionVariablesLabel() {
			return fFigureRegionVariablesLabel;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureFujabaRealtimeStatechartCompartment() {
			return fFigureFujabaRealtimeStatechartCompartment;
		}

	}

	/**
	 * @generated
	 */
	static final Font REGIONPRIORITYLABEL2_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 8, SWT.NORMAL);

}
