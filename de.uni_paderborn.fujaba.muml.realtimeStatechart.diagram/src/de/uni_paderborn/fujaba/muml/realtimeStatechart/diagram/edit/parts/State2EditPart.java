package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PolylineShape;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
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
public class State2EditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3007;

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
	public State2EditPart(View view) {
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
				new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.policies.State2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.policies.State2CanonicalEditPolicy());
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
				case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEntryPointEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateExitPointEditPart.VISUAL_ID:
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
		return primaryShape = new StateFigure();
	}

	/**
	 * @generated
	 */
	public StateFigure getPrimaryShape() {
		return (StateFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateName2EditPart) {
			((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateName2EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureStateNameLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateCompoundCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getFigureCompoundCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateCompoundCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getFigureRegionsCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEntryPointEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.WEST);
			getBorderedFigure()
					.getBorderItemContainer()
					.add(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEntryPointEditPart) childEditPart)
							.getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateExitPointEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.EAST);
			getBorderedFigure()
					.getBorderItemContainer()
					.add(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateExitPointEditPart) childEditPart)
							.getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateName2EditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateCompoundCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getFigureCompoundCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateCompoundCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getFigureRegionsCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEntryPointEditPart) {
			getBorderedFigure()
					.getBorderItemContainer()
					.remove(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEntryPointEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateExitPointEditPart) {
			getBorderedFigure()
					.getBorderItemContainer()
					.remove(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateExitPointEditPart) childEditPart)
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
		if (editPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateCompoundCompartment2EditPart) {
			return getPrimaryShape().getFigureCompoundCompartment();
		}
		if (editPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartment2EditPart) {
			return getPrimaryShape().getFigureRegionsCompartment();
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
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4001);
		types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.State2EditPart) {
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEntryPointEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateExitPointEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4002);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.State2EditPart) {
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4002);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEntryPointEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4002);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateExitPointEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4001) {
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.State_2003);
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.State_3007);
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.StateEntryPoint_3008);
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.StateExitPoint_3009);
		} else if (relationshipType == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4002) {
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.State_2003);
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.State_3007);
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.StateEntryPoint_3008);
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.StateExitPoint_3009);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4001);
		types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4001) {
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.State_2003);
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.State_3007);
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.StateEntryPoint_3008);
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.StateExitPoint_3009);
		} else if (relationshipType == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4002) {
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.State_2003);
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.State_3007);
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.StateEntryPoint_3008);
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.StateExitPoint_3009);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.EntryEvent_3001) {
				return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateCompoundCompartment2EditPart.VISUAL_ID));
			}
			if (type == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.DoEvent_3002) {
				return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateCompoundCompartment2EditPart.VISUAL_ID));
			}
			if (type == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.ExitEvent_3003) {
				return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateCompoundCompartment2EditPart.VISUAL_ID));
			}
			if (type == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.ClockConstraint_3004) {
				return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateCompoundCompartment2EditPart.VISUAL_ID));
			}
			if (type == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.SynchronizationChannel_3005) {
				return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateCompoundCompartment2EditPart.VISUAL_ID));
			}
			if (type == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Region_3006) {
				return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartment2EditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class StateFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureStateNameLabel;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureCompoundCompartment;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureRegionsCompartment;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureInnerContainer;
		/**
		 * @generated
		 */
		private RoundedRectangle fFigureFinalStateOutline;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureStateContainer;
		/**
		 * @generated
		 */
		private PolylineShape fFigureInitialStateArrow;
		/**
		 * @generated
		 */
		private Ellipse fFigureInitialStateEllipse;
		/**
		 * @generated
		 */
		private de.uni_paderborn.fujaba.muml.common.figures.PolyarcFigure fFigureInitialStateArc;

		/**
		 * @generated
		 */
		public StateFigure() {
			this.setLayoutManager(new StackLayout());
			this.setFill(false);
			this.setOutline(false);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureInitialStateArc = new de.uni_paderborn.fujaba.muml.common.figures.PolyarcFigure();

			this.add(fFigureInitialStateArc);

			fFigureInitialStateArrow = new PolylineShape();
			fFigureInitialStateArrow.addPoint(new Point(
					getMapMode().DPtoLP(26), getMapMode().DPtoLP(8)));
			fFigureInitialStateArrow.addPoint(new Point(
					getMapMode().DPtoLP(31), getMapMode().DPtoLP(13)));
			fFigureInitialStateArrow.addPoint(new Point(
					getMapMode().DPtoLP(33), getMapMode().DPtoLP(6)));

			this.add(fFigureInitialStateArrow);

			RectangleFigure initialStateFigureContainer0 = new RectangleFigure();
			initialStateFigureContainer0.setFill(false);
			initialStateFigureContainer0.setOutline(false);

			this.add(initialStateFigureContainer0);
			initialStateFigureContainer0.setLayoutManager(new XYLayout());

			fFigureInitialStateEllipse = new Ellipse();
			fFigureInitialStateEllipse.setBackgroundColor(ColorConstants.gray);

			initialStateFigureContainer0.add(
					fFigureInitialStateEllipse,
					new Rectangle(getMapMode().DPtoLP(10), getMapMode().DPtoLP(
							0), getMapMode().DPtoLP(10), getMapMode()
							.DPtoLP(10)));

			fFigureStateContainer = new RectangleFigure();
			fFigureStateContainer.setFill(false);
			fFigureStateContainer.setOutline(false);
			fFigureStateContainer.setBorder(new MarginBorder(getMapMode()
					.DPtoLP(0), getMapMode().DPtoLP(30),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));

			this.add(fFigureStateContainer);
			fFigureStateContainer.setLayoutManager(new StackLayout());

			fFigureFinalStateOutline = new RoundedRectangle();
			fFigureFinalStateOutline.setCornerDimensions(new Dimension(
					getMapMode().DPtoLP(12), getMapMode().DPtoLP(12)));

			fFigureStateContainer.add(fFigureFinalStateOutline);

			fFigureInnerContainer = new RectangleFigure();
			fFigureInnerContainer.setFill(false);
			fFigureInnerContainer.setOutline(false);
			fFigureInnerContainer.setBorder(new MarginBorder(getMapMode()
					.DPtoLP(4), getMapMode().DPtoLP(4), getMapMode().DPtoLP(4),
					getMapMode().DPtoLP(4)));

			fFigureStateContainer.add(fFigureInnerContainer);
			fFigureInnerContainer.setLayoutManager(new StackLayout());

			RoundedRectangle stateFigure2 = new RoundedRectangle();
			stateFigure2.setCornerDimensions(new Dimension(getMapMode().DPtoLP(
					12), getMapMode().DPtoLP(12)));

			fFigureInnerContainer.add(stateFigure2);

			GridLayout layoutStateFigure2 = new GridLayout();
			layoutStateFigure2.numColumns = 1;
			layoutStateFigure2.makeColumnsEqualWidth = false;
			stateFigure2.setLayoutManager(layoutStateFigure2);

			fFigureStateNameLabel = new WrappingLabel();
			fFigureStateNameLabel.setText("");

			fFigureStateNameLabel.setFont(FFIGURESTATENAMELABEL_FONT);

			GridData constraintFFigureStateNameLabel = new GridData();
			constraintFFigureStateNameLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureStateNameLabel.horizontalAlignment = GridData.CENTER;
			constraintFFigureStateNameLabel.horizontalIndent = 0;
			constraintFFigureStateNameLabel.horizontalSpan = 1;
			constraintFFigureStateNameLabel.verticalSpan = 1;
			constraintFFigureStateNameLabel.grabExcessHorizontalSpace = true;
			constraintFFigureStateNameLabel.grabExcessVerticalSpace = false;
			stateFigure2.add(fFigureStateNameLabel,
					constraintFFigureStateNameLabel);

			fFigureCompoundCompartment = new RectangleFigure();
			fFigureCompoundCompartment.setOutline(false);

			GridData constraintFFigureCompoundCompartment = new GridData();
			constraintFFigureCompoundCompartment.verticalAlignment = GridData.CENTER;
			constraintFFigureCompoundCompartment.horizontalAlignment = GridData.FILL;
			constraintFFigureCompoundCompartment.horizontalIndent = 0;
			constraintFFigureCompoundCompartment.horizontalSpan = 1;
			constraintFFigureCompoundCompartment.verticalSpan = 1;
			constraintFFigureCompoundCompartment.grabExcessHorizontalSpace = true;
			constraintFFigureCompoundCompartment.grabExcessVerticalSpace = false;
			stateFigure2.add(fFigureCompoundCompartment,
					constraintFFigureCompoundCompartment);

			fFigureRegionsCompartment = new RectangleFigure();
			fFigureRegionsCompartment.setOutline(false);

			GridData constraintFFigureRegionsCompartment = new GridData();
			constraintFFigureRegionsCompartment.verticalAlignment = GridData.FILL;
			constraintFFigureRegionsCompartment.horizontalAlignment = GridData.FILL;
			constraintFFigureRegionsCompartment.horizontalIndent = 0;
			constraintFFigureRegionsCompartment.horizontalSpan = 1;
			constraintFFigureRegionsCompartment.verticalSpan = 1;
			constraintFFigureRegionsCompartment.grabExcessHorizontalSpace = true;
			constraintFFigureRegionsCompartment.grabExcessVerticalSpace = true;
			stateFigure2.add(fFigureRegionsCompartment,
					constraintFFigureRegionsCompartment);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStateNameLabel() {
			return fFigureStateNameLabel;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCompoundCompartment() {
			return fFigureCompoundCompartment;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureRegionsCompartment() {
			return fFigureRegionsCompartment;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureInnerContainer() {
			return fFigureInnerContainer;
		}

		/**
		 * @generated
		 */
		public RoundedRectangle getFigureFinalStateOutline() {
			return fFigureFinalStateOutline;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureStateContainer() {
			return fFigureStateContainer;
		}

		/**
		 * @generated
		 */
		public PolylineShape getFigureInitialStateArrow() {
			return fFigureInitialStateArrow;
		}

		/**
		 * @generated
		 */
		public Ellipse getFigureInitialStateEllipse() {
			return fFigureInitialStateEllipse;
		}

		/**
		 * @generated
		 */
		public de.uni_paderborn.fujaba.muml.common.figures.PolyarcFigure getFigureInitialStateArc() {
			return fFigureInitialStateArc;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGURESTATENAMELABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 10, SWT.BOLD);

}
