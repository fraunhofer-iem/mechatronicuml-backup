package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
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
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class FujabaRealtimeStatechartEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2004;

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
	public FujabaRealtimeStatechartEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.policies.FujabaRealtimeStatechartItemSemanticEditPolicy());
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
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.FujabaRealtimeStatechartNameEditPart) {
			((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.FujabaRealtimeStatechartNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureStatechartNameLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.FujabaRealtimeStatechartStatechartContentsCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureStatechartContentsCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.FujabaRealtimeStatechartStatechartContentsCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.FujabaRealtimeStatechartNameEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.FujabaRealtimeStatechartStatechartContentsCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureStatechartContentsCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.FujabaRealtimeStatechartStatechartContentsCompartment2EditPart) childEditPart)
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
		if (editPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.FujabaRealtimeStatechartStatechartContentsCompartment2EditPart) {
			return getPrimaryShape().getFigureStatechartContentsCompartment();
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
				.getType(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.FujabaRealtimeStatechartNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class StatechartFigure extends RoundedRectangle {

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
		public StatechartFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = false;
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {
			/*FIXME referenced figures are just not yet fully-functional; need process attrs and layout here*/

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
			this.add(statechartTitleAreaFigure0,
					constraintStatechartTitleAreaFigure0);

			GridLayout layoutStatechartTitleAreaFigure0 = new GridLayout();
			layoutStatechartTitleAreaFigure0.numColumns = 2;
			layoutStatechartTitleAreaFigure0.makeColumnsEqualWidth = false;
			statechartTitleAreaFigure0
					.setLayoutManager(layoutStatechartTitleAreaFigure0);

			fFigureStatechartNameLabel = new WrappingLabel();
			fFigureStatechartNameLabel.setText("");

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
			statechartTitleAreaFigure0.add(fFigureStatechartVariablesLabel,
					constraintFFigureStatechartVariablesLabel);

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
			this.add(fFigureStatechartContentsCompartment,
					constraintFFigureStatechartContentsCompartment);

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

	}

}
