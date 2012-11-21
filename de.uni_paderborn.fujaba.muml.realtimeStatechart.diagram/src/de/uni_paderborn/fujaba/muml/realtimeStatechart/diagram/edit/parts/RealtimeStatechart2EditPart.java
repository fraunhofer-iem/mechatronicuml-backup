package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
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
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class RealtimeStatechart2EditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3024;

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
	public RealtimeStatechart2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.policies.RealtimeStatechart2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.policies.RealtimeStatechart2CanonicalEditPolicy());
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
				View childView = (View) child.getModel();
				switch (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
						.getVisualID(childView)) {
				case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryPointEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitPointEditPart.VISUAL_ID:
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
		return primaryShape = new InnerStatechartFigure();
	}

	/**
	 * @generated
	 */
	public InnerStatechartFigure getPrimaryShape() {
		return (InnerStatechartFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureStatechartContentsCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryPointEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.WEST);
			getBorderedFigure()
					.getBorderItemContainer()
					.add(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryPointEditPart) childEditPart)
							.getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitPointEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.EAST);
			getBorderedFigure()
					.getBorderItemContainer()
					.add(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitPointEditPart) childEditPart)
							.getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureStatechartContentsCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryPointEditPart) {
			getBorderedFigure()
					.getBorderItemContainer()
					.remove(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryPointEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitPointEditPart) {
			getBorderedFigure()
					.getBorderItemContainer()
					.remove(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitPointEditPart) childEditPart)
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
		if (editPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartment2EditPart) {
			return getPrimaryShape().getFigureStatechartContentsCompartment();
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
	public class InnerStatechartFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureStatechartContentsCompartment;

		/**
		 * @generated
		 */
		public InnerStatechartFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = false;
			this.setLayoutManager(layoutThis);

			this.setFill(false);
			this.setOutline(false);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

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
		public RectangleFigure getFigureStatechartContentsCompartment() {
			return fFigureStatechartContentsCompartment;
		}

	}

}
