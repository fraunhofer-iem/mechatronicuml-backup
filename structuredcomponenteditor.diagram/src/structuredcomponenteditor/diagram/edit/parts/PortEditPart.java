package structuredcomponenteditor.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutListener;
import org.eclipse.draw2d.PolygonShape;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Transform;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import structuredcomponenteditor.diagram.edit.policies.PortItemSemanticEditPolicy;
import structuredcomponenteditor.diagram.providers.StructuredcomponentElementTypes;

/**
 * @generated
 */
public class PortEditPart extends AbstractBorderItemEditPart {

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
	public PortEditPart(View view) {
		super(view);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart#activate()
	 */
	@Override
	public void activate() {
		IBorderItemLocator locator = getBorderItemLocator();
		if (locator instanceof BorderItemLocator) {
			((BorderItemLocator) locator).setBorderItemOffset(new Dimension(10,
					10));
		}
		EditPart parentEditPart = this.getParent();
		if (parentEditPart instanceof StructuredComponentEditPart) {
			IFigure figure = ((StructuredComponentEditPart) parentEditPart).getFigure();
			if (figure instanceof BorderedNodeFigure) {
				BorderedNodeFigure bnf = (BorderedNodeFigure) figure;
				IFigure bicf = bnf.getBorderItemContainer();
				bicf.addLayoutListener(new LayoutListener.Stub() {
					@Override
					public void postLayout(IFigure container) {
						getBorderItemLocator().relocate(getFigure());
						int position = getBorderItemLocator()
								.getCurrentSideOfParent();
						int rotation = 0;
						switch (position) {
						case PositionConstants.WEST:
							break;
						case PositionConstants.NORTH:
							rotation = 90;
							break;
						case PositionConstants.EAST:
							rotation = 180;
							break;
						case PositionConstants.SOUTH:
							rotation = 270;
							break;
						default:
							break;
						}
						getPrimaryShape().getFigurePolygon().setRotationInDegrees(rotation);
					}
				});
			}
		}
		super.activate();
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				getPrimaryDragEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PortItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that
		// would let children add reasonable editpolicies
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
		return primaryShape = new InPortFigure();
	}

	/**
	 * @generated
	 */
	public InPortFigure getPrimaryShape() {
		return (InPortFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(20, 20);

		// FIXME: workaround for #154536
		result.getBounds().setSize(result.getPreferredSize());
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model so
	 * you may safely remove <i>generated</i> tag and modify it.
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
	 * Default implementation treats passed figure as content pane. Respects
	 * layout one may have set for generated figure.
	 * 
	 * @param nodeShape
	 *            instance of generated figure class
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
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(StructuredcomponentElementTypes.Delegation_4001);
		types.add(StructuredcomponentElementTypes.Assembly_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof structuredcomponenteditor.diagram.edit.parts.PortEditPart) {
			types.add(StructuredcomponentElementTypes.Delegation_4001);
		}
		if (targetEditPart instanceof Port2EditPart) {
			types.add(StructuredcomponentElementTypes.Delegation_4001);
		}
		if (targetEditPart instanceof structuredcomponenteditor.diagram.edit.parts.PortEditPart) {
			types.add(StructuredcomponentElementTypes.Assembly_4002);
		}
		if (targetEditPart instanceof Port2EditPart) {
			types.add(StructuredcomponentElementTypes.Assembly_4002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == StructuredcomponentElementTypes.Delegation_4001) {
			types.add(StructuredcomponentElementTypes.Port_3001);
			types.add(StructuredcomponentElementTypes.Port_3003);
		} else if (relationshipType == StructuredcomponentElementTypes.Assembly_4002) {
			types.add(StructuredcomponentElementTypes.Port_3001);
			types.add(StructuredcomponentElementTypes.Port_3003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(StructuredcomponentElementTypes.Delegation_4001);
		types.add(StructuredcomponentElementTypes.Assembly_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == StructuredcomponentElementTypes.Delegation_4001) {
			types.add(StructuredcomponentElementTypes.Port_3001);
			types.add(StructuredcomponentElementTypes.Port_3003);
		} else if (relationshipType == StructuredcomponentElementTypes.Assembly_4002) {
			types.add(StructuredcomponentElementTypes.Port_3001);
			types.add(StructuredcomponentElementTypes.Port_3003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class InPortFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private RotablePolygonShape fFigurePolygon;

		/**
		 * @generated
		 */
		public InPortFigure() {
			this.setLayoutManager(new StackLayout());
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigurePolygon = new RotablePolygonShape();
			fFigurePolygon.addPoint(new Point(getMapMode().DPtoLP(6),
					getMapMode().DPtoLP(6)));
			fFigurePolygon.addPoint(new Point(getMapMode().DPtoLP(14),
					getMapMode().DPtoLP(10)));
			fFigurePolygon.addPoint(new Point(getMapMode().DPtoLP(6),
					getMapMode().DPtoLP(14)));
			fFigurePolygon.setFill(true);

			this.add(fFigurePolygon);

		}

		/**
		 * @generated
		 */
		public RotablePolygonShape getFigurePolygon() {
			return fFigurePolygon;
		}

		public class RotablePolygonShape extends PolygonShape {
			private PointList pointList = new PointList();
			private Transform transform = new Transform();

			@Override
			public void addPoint(Point pt) {
				pointList.addPoint(pt);
				updatePoints();
			}

			@Override
			public void setPoints(PointList pointList) {
				this.pointList = pointList.getCopy();
				updatePoints();
			}

			public void setRotationInDegrees(double degrees) {
				transform.setRotation(degrees / 180.0 * Math.PI);
				updatePoints();
			}

			private void updatePoints() {
				PointList transformedPoints = new PointList();
				Dimension size = this.getSize(); //new Dimension(20, 20);
				for (int i = 0; i < pointList.size(); i++) {
					Point point = pointList.getPoint(i);
					point = point.translate(-size.width / 2, -size.height / 2);
					point = transform.getTransformed(point);
					point = point.translate(size.width / 2, size.height / 2);
					transformedPoints.addPoint(point);
				}
				super.setPoints(transformedPoints);
			}
		}

	}

}
