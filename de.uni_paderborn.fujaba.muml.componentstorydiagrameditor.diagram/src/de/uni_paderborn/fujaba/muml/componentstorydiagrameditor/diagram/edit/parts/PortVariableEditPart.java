package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ScalablePolygonShape;
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
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class PortVariableEditPart extends BorderedBorderItemEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3004;

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
	public PortVariableEditPart(View view) {
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
				new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.policies.PortVariableItemSemanticEditPolicy());
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
				switch (de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
						.getVisualID(childView)) {
				case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PortVariableNameEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy() {

						// BEGIN FIX: Muml-Bug #58
						// (Copied from NonResizableLabelEditPolicy and slightly modified, see comments below)
						private Polyline tether = null;

						protected void eraseChangeBoundsFeedback(
								ChangeBoundsRequest request) {
							super.eraseChangeBoundsFeedback(request);
							if (tether != null)
								removeFeedback(tether);
							tether = null;
						}

						protected IFigure createDragSourceFeedbackFigure() {
							IFigure feedback = super
									.createDragSourceFeedbackFigure();
							tether = new Polyline();
							tether.setLineStyle(Graphics.LINE_DASHDOT);
							tether.setForegroundColor(((IGraphicalEditPart) getHost())
									.getFigure().getForegroundColor());
							addFeedback(tether);
							return feedback;
						}

						protected void showChangeBoundsFeedback(
								ChangeBoundsRequest request) {

							IFigure p = getDragSourceFeedbackFigure();
							Rectangle r = p.getBounds();
							Point refPoint = ((LabelEditPart) getHost())
									.getReferencePoint();

							// translate the feedback figure
							PrecisionRectangle rect = new PrecisionRectangle(
									getInitialFeedbackBounds().getCopy());
							getHostFigure().translateToAbsolute(rect);
							rect.translate(request.getMoveDelta());
							rect.resize(request.getSizeDelta());
							p.translateToRelative(rect);

							/* BEGIN MODIFIED for Muml-Bug #58 */
							/* Commented out the following line ... */

							//p.setBounds(rect);

							/* ... and replaced it with super call */
							super.showChangeBoundsFeedback(request);
							/* END MODIFIED for Muml-Bug #58 */

							Rectangle centerMain = null;
							// TODO: remove this hack. We should be using the reference point for
							// the teher end, however,
							// the reference point is causing miscaculation when positioning. This
							// has to be redone in version 2.
							if (((IGraphicalEditPart) getHost().getParent())
									.getFigure() instanceof Connection) {
								centerMain = new Rectangle(refPoint.x,
										refPoint.y, 0, 0);
								getHostFigure().translateToAbsolute(centerMain);
								p.translateToRelative(centerMain);
							} else {
								centerMain = ((IGraphicalEditPart) getHost()
										.getParent()).getFigure().getBounds()
										.getCopy();
								centerMain.translate(centerMain.width / 2,
										centerMain.height / 2);
								getHostFigure().translateToAbsolute(centerMain);
								p.translateToRelative(centerMain);
							}

							PrecisionRectangle ref = new PrecisionRectangle(
									centerMain);

							Point midTop = new Point(r.x + r.width / 2, r.y);
							Point midBottom = new Point(r.x + r.width / 2, r.y
									+ r.height);
							Point midLeft = new Point(r.x, r.y + r.height / 2);
							Point midRight = new Point(r.x + r.width, r.y
									+ r.height / 2);

							Point startPoint = midTop;

							int x = r.x + r.width / 2 - refPoint.x;
							int y = r.y + r.height / 2 - refPoint.y;

							if (y > 0 && y > x && y > -x)
								startPoint = midTop;
							else if (y < 0 && y < x && y < -x)
								startPoint = midBottom;
							else if (x < 0 && y > x && y < -x)
								startPoint = midRight;
							else
								startPoint = midLeft;

							tether.setStart(startPoint);
							tether.setEnd(ref.getLocation());
						}

						// END FIX: Muml-Bug #58

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
		return primaryShape = new PortVariableFigure();
	}

	/**
	 * @generated
	 */
	public PortVariableFigure getPrimaryShape() {
		return (PortVariableFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected void addBorderItem(IFigure borderItemContainer,
			IBorderItemEditPart borderItemEditPart) {
		if (borderItemEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.WrappingLabelEditPart
				|| borderItemEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PortVariableNameEditPart) {
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
		return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4002);
		types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PortVariableEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4002);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PortVariable2EditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4002);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PortVariableEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4003);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PortVariable2EditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4002) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.PortVariable_3004);
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.PortVariable_3006);
		} else if (relationshipType == de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4003) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.PortVariable_3004);
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.PortVariable_3006);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4002);
		types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4002) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.PortVariable_3004);
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.PortVariable_3006);
		} else if (relationshipType == de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4003) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.PortVariable_3004);
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.PortVariable_3006);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class PortVariableFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private ScalablePolygonShape fFigureNegativePort;

		/**
		 * @generated
		 */
		public PortVariableFigure() {
			this.setLayoutManager(new StackLayout());
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure portVariable0 = new RectangleFigure();
			portVariable0.setPreferredSize(new Dimension(getMapMode()
					.DPtoLP(20), getMapMode().DPtoLP(20)));
			portVariable0.setMaximumSize(new Dimension(getMapMode().DPtoLP(20),
					getMapMode().DPtoLP(20)));
			portVariable0.setMinimumSize(new Dimension(getMapMode().DPtoLP(20),
					getMapMode().DPtoLP(20)));
			portVariable0.setSize(getMapMode().DPtoLP(20),
					getMapMode().DPtoLP(20));

			this.add(portVariable0);

			fFigureNegativePort = new ScalablePolygonShape();
			fFigureNegativePort.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));
			fFigureNegativePort.addPoint(new Point(getMapMode().DPtoLP(1),
					getMapMode().DPtoLP(1)));
			fFigureNegativePort.addPoint(new Point(getMapMode().DPtoLP(1),
					getMapMode().DPtoLP(0)));
			fFigureNegativePort.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(1)));
			fFigureNegativePort.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));
			fFigureNegativePort.setFill(true);

			this.add(fFigureNegativePort);

		}

		/**
		 * @generated
		 */
		public ScalablePolygonShape getFigureNegativePort() {
			return fFigureNegativePort;
		}

	}

}
