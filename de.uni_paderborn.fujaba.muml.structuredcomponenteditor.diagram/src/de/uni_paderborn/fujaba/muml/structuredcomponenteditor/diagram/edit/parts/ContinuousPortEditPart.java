package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ScalablePolygonShape;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.BorderedBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
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
public class ContinuousPortEditPart extends BorderedBorderItemEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3003;

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
	public ContinuousPortEditPart(View view) {
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
				new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.policies.ContinuousPortItemSemanticEditPolicy());
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
				switch (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
						.getVisualID(childView)) {
				case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPortNameEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy() {

						protected List createSelectionHandles() {
							MoveHandle mh = new MoveHandle(
									(GraphicalEditPart) getHost());
							mh.setBorder(null);
							return Collections.singletonList(mh);
						}
					};
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
		return primaryShape = new PortFigure();
	}

	/**
	 * @generated
	 */
	public PortFigure getPrimaryShape() {
		return (PortFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected void addBorderItem(IFigure borderItemContainer,
			IBorderItemEditPart borderItemEditPart) {
		if (borderItemEditPart instanceof de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPortNameEditPart) {
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
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(24, 24);

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
		return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPortNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Delegation_4001);
		types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Assembly_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HybridPortEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Delegation_4001);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePortEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Delegation_4001);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPortEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Delegation_4001);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HybridPort2EditPart) {
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Delegation_4001);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePort2EditPart) {
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Delegation_4001);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPort2EditPart) {
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Delegation_4001);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HybridPortEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Assembly_4002);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePortEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Assembly_4002);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPortEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Assembly_4002);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HybridPort2EditPart) {
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Assembly_4002);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePort2EditPart) {
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Assembly_4002);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPort2EditPart) {
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Assembly_4002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Delegation_4001) {
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.HybridPort_3001);
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.DiscretePort_3002);
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.ContinuousPort_3003);
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.HybridPort_3006);
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.DiscretePort_3007);
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.ContinuousPort_3008);
		} else if (relationshipType == de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Assembly_4002) {
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.HybridPort_3001);
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.DiscretePort_3002);
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.ContinuousPort_3003);
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.HybridPort_3006);
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.DiscretePort_3007);
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.ContinuousPort_3008);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Delegation_4001);
		types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Assembly_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Delegation_4001) {
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.HybridPort_3001);
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.DiscretePort_3002);
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.ContinuousPort_3003);
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.HybridPort_3006);
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.DiscretePort_3007);
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.ContinuousPort_3008);
		} else if (relationshipType == de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Assembly_4002) {
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.HybridPort_3001);
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.DiscretePort_3002);
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.ContinuousPort_3003);
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.HybridPort_3006);
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.DiscretePort_3007);
			types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.ContinuousPort_3008);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class PortFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private ScalablePolygonShape fFigureInPolygon;
		/**
		 * @generated
		 */
		private ScalablePolygonShape fFigureOutPolygon;
		/**
		 * @generated
		 */
		private ScalablePolygonShape fFigureInOutPolygon;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureInnerRectContainer;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureOutlineRectangle;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureShadowRectangle;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHardwareTypeLabel;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureInPolygonContainer;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureOutPolygonContainer;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureInOutPolygonContainer;

		/**
		 * @generated
		 */
		public PortFigure() {
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
			aux10.setBorder(new MarginBorder(getMapMode().DPtoLP(3),
					getMapMode().DPtoLP(3), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));

			this.add(aux10);
			aux10.setLayoutManager(new StackLayout());

			fFigureShadowRectangle = new RectangleFigure();

			aux10.add(fFigureShadowRectangle);

			fFigureInnerRectContainer = new RectangleFigure();
			fFigureInnerRectContainer.setFill(false);
			fFigureInnerRectContainer.setOutline(false);
			fFigureInnerRectContainer.setBorder(new MarginBorder(getMapMode()
					.DPtoLP(0), getMapMode().DPtoLP(0), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));

			this.add(fFigureInnerRectContainer);
			fFigureInnerRectContainer.setLayoutManager(new StackLayout());

			fFigureOutlineRectangle = new RectangleFigure();

			fFigureInnerRectContainer.add(fFigureOutlineRectangle);

			fFigureInPolygonContainer = new RectangleFigure();
			fFigureInPolygonContainer.setFill(false);
			fFigureInPolygonContainer.setOutline(false);
			fFigureInPolygonContainer.setBorder(new MarginBorder(getMapMode()
					.DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));

			fFigureInnerRectContainer.add(fFigureInPolygonContainer);
			fFigureInPolygonContainer.setLayoutManager(new StackLayout());

			fFigureInPolygon = new ScalablePolygonShape();
			fFigureInPolygon.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));
			fFigureInPolygon.addPoint(new Point(getMapMode().DPtoLP(1),
					getMapMode().DPtoLP(1)));
			fFigureInPolygon.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(2)));
			fFigureInPolygon.setFill(true);
			fFigureInPolygon.setOutline(false);
			fFigureInPolygon.setBackgroundColor(ColorConstants.black);

			fFigureInPolygonContainer.add(fFigureInPolygon);

			fFigureOutPolygonContainer = new RectangleFigure();
			fFigureOutPolygonContainer.setFill(false);
			fFigureOutPolygonContainer.setOutline(false);
			fFigureOutPolygonContainer.setBorder(new MarginBorder(getMapMode()
					.DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));

			fFigureInnerRectContainer.add(fFigureOutPolygonContainer);
			fFigureOutPolygonContainer.setLayoutManager(new StackLayout());

			fFigureOutPolygon = new ScalablePolygonShape();
			fFigureOutPolygon.addPoint(new Point(getMapMode().DPtoLP(1),
					getMapMode().DPtoLP(0)));
			fFigureOutPolygon.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(1)));
			fFigureOutPolygon.addPoint(new Point(getMapMode().DPtoLP(1),
					getMapMode().DPtoLP(2)));
			fFigureOutPolygon.setFill(true);
			fFigureOutPolygon.setOutline(false);
			fFigureOutPolygon.setBackgroundColor(ColorConstants.black);

			fFigureOutPolygonContainer.add(fFigureOutPolygon);

			fFigureInOutPolygonContainer = new RectangleFigure();
			fFigureInOutPolygonContainer.setFill(false);
			fFigureInOutPolygonContainer.setOutline(false);
			fFigureInOutPolygonContainer.setBorder(new MarginBorder(
					getMapMode().DPtoLP(3), getMapMode().DPtoLP(3),
					getMapMode().DPtoLP(3), getMapMode().DPtoLP(3)));

			fFigureInnerRectContainer.add(fFigureInOutPolygonContainer);
			fFigureInOutPolygonContainer.setLayoutManager(new StackLayout());

			fFigureInOutPolygon = new ScalablePolygonShape();
			fFigureInOutPolygon.addPoint(new Point(getMapMode().DPtoLP(6),
					getMapMode().DPtoLP(0)));
			fFigureInOutPolygon.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(3)));
			fFigureInOutPolygon.addPoint(new Point(getMapMode().DPtoLP(6),
					getMapMode().DPtoLP(6)));
			fFigureInOutPolygon.addPoint(new Point(getMapMode().DPtoLP(1),
					getMapMode().DPtoLP(5)));
			fFigureInOutPolygon.addPoint(new Point(getMapMode().DPtoLP(7),
					getMapMode().DPtoLP(8)));
			fFigureInOutPolygon.addPoint(new Point(getMapMode().DPtoLP(1),
					getMapMode().DPtoLP(11)));
			fFigureInOutPolygon.setFill(true);
			fFigureInOutPolygon.setOutline(false);
			fFigureInOutPolygon.setBackgroundColor(ColorConstants.black);

			fFigureInOutPolygonContainer.add(fFigureInOutPolygon);

			fFigureHardwareTypeLabel = new WrappingLabel();
			fFigureHardwareTypeLabel.setText("");

			fFigureHardwareTypeLabel.setFont(FFIGUREHARDWARETYPELABEL_FONT);

			fFigureInnerRectContainer.add(fFigureHardwareTypeLabel);

		}

		/**
		 * @generated
		 */
		public ScalablePolygonShape getFigureInPolygon() {
			return fFigureInPolygon;
		}

		/**
		 * @generated
		 */
		public ScalablePolygonShape getFigureOutPolygon() {
			return fFigureOutPolygon;
		}

		/**
		 * @generated
		 */
		public ScalablePolygonShape getFigureInOutPolygon() {
			return fFigureInOutPolygon;
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
		public RectangleFigure getFigureOutlineRectangle() {
			return fFigureOutlineRectangle;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureShadowRectangle() {
			return fFigureShadowRectangle;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHardwareTypeLabel() {
			return fFigureHardwareTypeLabel;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureInPolygonContainer() {
			return fFigureInPolygonContainer;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureOutPolygonContainer() {
			return fFigureOutPolygonContainer;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureInOutPolygonContainer() {
			return fFigureInOutPolygonContainer;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREHARDWARETYPELABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 7, SWT.NORMAL);

}
