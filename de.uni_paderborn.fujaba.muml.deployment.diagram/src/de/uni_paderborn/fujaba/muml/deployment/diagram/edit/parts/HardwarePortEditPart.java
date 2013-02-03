package de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.BorderedBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
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
public class HardwarePortEditPart extends BorderedBorderItemEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3001;

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
	public HardwarePortEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				getPrimaryDragEditPolicy());
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.muml.deployment.diagram.edit.policies.HardwarePortItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);

		installEditPolicy(
				EditPolicy.GRAPHICAL_NODE_ROLE,
				new de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy());

		installEditPolicy(
				de.uni_paderborn.fujaba.muml.common.edit.policies.EditPolicyRoles.ERROR_FEEDBACK_ROLE,
				new de.uni_paderborn.fujaba.muml.common.edit.policies.ErrorFeedbackEditPolicy());

	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlVisualIDRegistry
						.getVisualID(childView)) {
				case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortNameEditPart.VISUAL_ID:
					return new de.uni_paderborn.fujaba.muml.common.edit.policies.BorderItemSelectionEditPolicy();
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
		return primaryShape = new HardwarePortFigure();
	}

	/**
	 * @generated
	 */
	public HardwarePortFigure getPrimaryShape() {
		return (HardwarePortFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected void addBorderItem(IFigure borderItemContainer,
			IBorderItemEditPart borderItemEditPart) {
		if (borderItemEditPart instanceof de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortNameEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			locator.setBorderItemOffset(new Dimension(-20, -20));
			borderItemContainer.add(borderItemEditPart.getFigure(), locator);
		} else {
			super.addBorderItem(borderItemContainer, borderItemEditPart);
		}
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(20, 20);

		//FIXME: workaround for #154536
		result.getBounds().setSize(result.getPreferredSize());

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
		return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(de.uni_paderborn.fujaba.muml.deployment.diagram.providers.MumlElementTypes.CommunicationLink_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.deployment.diagram.providers.MumlElementTypes.CommunicationLink_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.deployment.diagram.providers.MumlElementTypes.CommunicationLink_4001) {
			types.add(de.uni_paderborn.fujaba.muml.deployment.diagram.providers.MumlElementTypes.HardwarePort_3001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(de.uni_paderborn.fujaba.muml.deployment.diagram.providers.MumlElementTypes.CommunicationLink_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.deployment.diagram.providers.MumlElementTypes.CommunicationLink_4001) {
			types.add(de.uni_paderborn.fujaba.muml.deployment.diagram.providers.MumlElementTypes.HardwarePort_3001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class HardwarePortFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureInOutContainer;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureInContainer;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureOutContainer;

		/**
		 * @generated
		 */
		public HardwarePortFigure() {
			this.setLayoutManager(new StackLayout());
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(20),
					getMapMode().DPtoLP(20)));
			this.setMaximumSize(new Dimension(getMapMode().DPtoLP(20),
					getMapMode().DPtoLP(20)));
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(20),
					getMapMode().DPtoLP(20)));
			this.setSize(getMapMode().DPtoLP(20), getMapMode().DPtoLP(20));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(1),
					getMapMode().DPtoLP(1), getMapMode().DPtoLP(1),
					getMapMode().DPtoLP(1)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureInContainer = new RectangleFigure();
			fFigureInContainer.setOutline(false);
			fFigureInContainer.setBorder(new MarginBorder(getMapMode()
					.DPtoLP(2), getMapMode().DPtoLP(7), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));

			this.add(fFigureInContainer);
			fFigureInContainer.setLayoutManager(new StackLayout());

			WrappingLabel inLabel1 = new WrappingLabel();
			inLabel1.setText("i");
			inLabel1.setForegroundColor(INLABEL1_FORE);

			inLabel1.setFont(INLABEL1_FONT);

			fFigureInContainer.add(inLabel1);

			fFigureOutContainer = new RectangleFigure();
			fFigureOutContainer.setOutline(false);
			fFigureOutContainer.setBorder(new MarginBorder(getMapMode().DPtoLP(
					2), getMapMode().DPtoLP(6), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));

			this.add(fFigureOutContainer);
			fFigureOutContainer.setLayoutManager(new StackLayout());

			WrappingLabel outLabel1 = new WrappingLabel();
			outLabel1.setText("o");
			outLabel1.setForegroundColor(OUTLABEL1_FORE);

			outLabel1.setFont(OUTLABEL1_FONT);

			fFigureOutContainer.add(outLabel1);

			fFigureInOutContainer = new RectangleFigure();
			fFigureInOutContainer.setOutline(false);
			fFigureInOutContainer.setBorder(new MarginBorder(getMapMode()
					.DPtoLP(2), getMapMode().DPtoLP(4), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));

			this.add(fFigureInOutContainer);
			fFigureInOutContainer.setLayoutManager(new StackLayout());

			WrappingLabel inOutLabel1 = new WrappingLabel();
			inOutLabel1.setText("i/o");
			inOutLabel1.setForegroundColor(INOUTLABEL1_FORE);

			inOutLabel1.setFont(INOUTLABEL1_FONT);

			fFigureInOutContainer.add(inOutLabel1);

		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureInOutContainer() {
			return fFigureInOutContainer;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureInContainer() {
			return fFigureInContainer;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureOutContainer() {
			return fFigureOutContainer;
		}

	}

	/**
	 * @generated
	 */
	static final Color INLABEL1_FORE = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Font INLABEL1_FONT = new Font(Display.getCurrent(), Display
			.getDefault().getSystemFont().getFontData()[0].getName(), 7,
			SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Color OUTLABEL1_FORE = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Font OUTLABEL1_FONT = new Font(Display.getCurrent(), Display
			.getDefault().getSystemFont().getFontData()[0].getName(), 7,
			SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Color INOUTLABEL1_FORE = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Font INOUTLABEL1_FONT = new Font(Display.getCurrent(), Display
			.getDefault().getSystemFont().getFontData()[0].getName(), 7,
			SWT.NORMAL);

}
