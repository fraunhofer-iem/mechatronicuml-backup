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
public class StateEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3032;

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
	public StateEditPart(View view) {
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
				new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.policies.StateItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.policies.StateCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);

		installEditPolicy(
				EditPolicy.GRAPHICAL_NODE_ROLE,
				new de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy());

		installEditPolicy(
				de.uni_paderborn.fujaba.muml.common.edit.policies.ErrorFeedbackEditPolicy.ERROR_FEEDBACK_ROLE,
				new de.uni_paderborn.fujaba.muml.common.edit.policies.ErrorFeedbackEditPolicy());

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
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateNameEditPart) {
			((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureStateNameLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateActionCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureActionCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateActionCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureRegionsCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateChannelCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureChannelCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateChannelCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateInvariantCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureInvariantCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateInvariantCompartmentEditPart) childEditPart)
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
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateNameEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateActionCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureActionCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateActionCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureRegionsCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateChannelCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureChannelCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateChannelCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateInvariantCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureInvariantCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateInvariantCompartmentEditPart) childEditPart)
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
		if (editPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateActionCompartmentEditPart) {
			return getPrimaryShape().getFigureActionCompartment();
		}
		if (editPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartmentEditPart) {
			return getPrimaryShape().getFigureRegionsCompartment();
		}
		if (editPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateChannelCompartmentEditPart) {
			return getPrimaryShape().getFigureChannelCompartment();
		}
		if (editPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateInvariantCompartmentEditPart) {
			return getPrimaryShape().getFigureInvariantCompartment();
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
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4003);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryPointEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4003);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitPointEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4003) {
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.State_3032);
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.EntryPoint_3040);
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.ExitPoint_3041);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Transition_4003) {
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.State_3032);
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.EntryPoint_3040);
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.ExitPoint_3041);
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
			if (type == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.EntryEvent_3033) {
				return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateActionCompartmentEditPart.VISUAL_ID));
			}
			if (type == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.DoEvent_3034) {
				return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateActionCompartmentEditPart.VISUAL_ID));
			}
			if (type == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.ExitEvent_3035) {
				return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateActionCompartmentEditPart.VISUAL_ID));
			}
			if (type == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Region_3038) {
				return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartmentEditPart.VISUAL_ID));
			}
			if (type == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.SynchronizationChannel_3037) {
				return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateChannelCompartmentEditPart.VISUAL_ID));
			}
			if (type == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.ClockConstraint_3036) {
				return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateInvariantCompartmentEditPart.VISUAL_ID));
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
		private RectangleFigure fFigureActionCompartment;
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
		private RectangleFigure fFigureChannelCompartment;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureInvariantCompartment;

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

			fFigureInvariantCompartment = new RectangleFigure();
			fFigureInvariantCompartment.setOutline(false);

			GridData constraintFFigureInvariantCompartment = new GridData();
			constraintFFigureInvariantCompartment.verticalAlignment = GridData.CENTER;
			constraintFFigureInvariantCompartment.horizontalAlignment = GridData.FILL;
			constraintFFigureInvariantCompartment.horizontalIndent = 0;
			constraintFFigureInvariantCompartment.horizontalSpan = 1;
			constraintFFigureInvariantCompartment.verticalSpan = 1;
			constraintFFigureInvariantCompartment.grabExcessHorizontalSpace = false;
			constraintFFigureInvariantCompartment.grabExcessVerticalSpace = false;
			stateFigure2.add(fFigureInvariantCompartment,
					constraintFFigureInvariantCompartment);

			fFigureChannelCompartment = new RectangleFigure();
			fFigureChannelCompartment.setOutline(false);

			GridData constraintFFigureChannelCompartment = new GridData();
			constraintFFigureChannelCompartment.verticalAlignment = GridData.CENTER;
			constraintFFigureChannelCompartment.horizontalAlignment = GridData.FILL;
			constraintFFigureChannelCompartment.horizontalIndent = 0;
			constraintFFigureChannelCompartment.horizontalSpan = 1;
			constraintFFigureChannelCompartment.verticalSpan = 1;
			constraintFFigureChannelCompartment.grabExcessHorizontalSpace = true;
			constraintFFigureChannelCompartment.grabExcessVerticalSpace = false;
			stateFigure2.add(fFigureChannelCompartment,
					constraintFFigureChannelCompartment);

			fFigureActionCompartment = new RectangleFigure();
			fFigureActionCompartment.setOutline(false);

			GridData constraintFFigureActionCompartment = new GridData();
			constraintFFigureActionCompartment.verticalAlignment = GridData.CENTER;
			constraintFFigureActionCompartment.horizontalAlignment = GridData.FILL;
			constraintFFigureActionCompartment.horizontalIndent = 0;
			constraintFFigureActionCompartment.horizontalSpan = 1;
			constraintFFigureActionCompartment.verticalSpan = 1;
			constraintFFigureActionCompartment.grabExcessHorizontalSpace = true;
			constraintFFigureActionCompartment.grabExcessVerticalSpace = false;
			stateFigure2.add(fFigureActionCompartment,
					constraintFFigureActionCompartment);

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
		public RectangleFigure getFigureActionCompartment() {
			return fFigureActionCompartment;
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

		/**
		 * @generated
		 */
		public RectangleFigure getFigureChannelCompartment() {
			return fFigureChannelCompartment;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureInvariantCompartment() {
			return fFigureInvariantCompartment;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGURESTATENAMELABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 10, SWT.BOLD);

}
