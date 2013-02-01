package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.BorderLayout;
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
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class ComponentStoryNodeEditPart extends ShapeNodeEditPart {

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
	public ComponentStoryNodeEditPart(View view) {
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
				new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.policies.ComponentStoryNodeItemSemanticEditPolicy());
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
		return primaryShape = new ComponentStoryNodeRoundedFigure();
	}

	/**
	 * @generated
	 */
	public ComponentStoryNodeRoundedFigure getPrimaryShape() {
		return (ComponentStoryNodeRoundedFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryNodeNameEditPart) {
			((de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryNodeNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureComponentStoryNodeName());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryNodeComponentStoryNodeCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureComponentStoryNodePatternContainer();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryNodeComponentStoryNodeCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryNodeNameEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryNodeComponentStoryNodeCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureComponentStoryNodePatternContainer();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryNodeComponentStoryNodeCompartmentEditPart) childEditPart)
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
		if (editPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryNodeComponentStoryNodeCompartmentEditPart) {
			return getPrimaryShape()
					.getFigureComponentStoryNodePatternContainer();
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
		return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryNodeNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.ActivityEdge_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryNodeEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.InitialNodeEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.JunctionNodeEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityFinalNodeEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ControllerExchangeNodeEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.ActivityEdge_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.ActivityEdge_4001) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.ComponentStoryNode_3001);
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.InitialNode_3007);
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.JunctionNode_3008);
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.ActivityFinalNode_3010);
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.ControllerExchangeNode_3021);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.ActivityEdge_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.ActivityEdge_4001) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.ComponentStoryNode_3001);
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.InitialNode_3007);
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.JunctionNode_3008);
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.ActivityFinalNode_3010);
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.ControllerExchangeNode_3021);
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
			if (type == de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.ComponentStoryPattern_3011) {
				return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryNodeComponentStoryNodeCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class ComponentStoryNodeRoundedFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureComponentStoryNodeName;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureComponentStoryNodePatternContainer;

		/**
		 * @generated
		 */
		public ComponentStoryNodeRoundedFigure() {

			BorderLayout layoutThis = new BorderLayout();
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(12),
					getMapMode().DPtoLP(12)));
			this.setFill(false);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure storyNodeNameContainer0 = new RectangleFigure();
			storyNodeNameContainer0.setFill(false);
			storyNodeNameContainer0.setOutline(false);

			this.add(storyNodeNameContainer0, BorderLayout.TOP);

			GridLayout layoutStoryNodeNameContainer0 = new GridLayout();
			layoutStoryNodeNameContainer0.numColumns = 1;
			layoutStoryNodeNameContainer0.makeColumnsEqualWidth = true;
			storyNodeNameContainer0
					.setLayoutManager(layoutStoryNodeNameContainer0);

			fFigureComponentStoryNodeName = new WrappingLabel();
			fFigureComponentStoryNodeName.setText("");

			GridData constraintFFigureComponentStoryNodeName = new GridData();
			constraintFFigureComponentStoryNodeName.verticalAlignment = GridData.CENTER;
			constraintFFigureComponentStoryNodeName.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureComponentStoryNodeName.horizontalIndent = 0;
			constraintFFigureComponentStoryNodeName.horizontalSpan = 1;
			constraintFFigureComponentStoryNodeName.verticalSpan = 1;
			constraintFFigureComponentStoryNodeName.grabExcessHorizontalSpace = false;
			constraintFFigureComponentStoryNodeName.grabExcessVerticalSpace = false;
			storyNodeNameContainer0.add(fFigureComponentStoryNodeName,
					constraintFFigureComponentStoryNodeName);

			RectangleFigure componentStoryNodeContentContainer0 = new RectangleFigure();
			componentStoryNodeContentContainer0.setFill(false);
			componentStoryNodeContentContainer0.setOutline(false);

			this.add(componentStoryNodeContentContainer0, BorderLayout.CENTER);

			GridLayout layoutComponentStoryNodeContentContainer0 = new GridLayout();
			layoutComponentStoryNodeContentContainer0.numColumns = 1;
			layoutComponentStoryNodeContentContainer0.makeColumnsEqualWidth = true;
			componentStoryNodeContentContainer0
					.setLayoutManager(layoutComponentStoryNodeContentContainer0);

			fFigureComponentStoryNodePatternContainer = new RectangleFigure();
			fFigureComponentStoryNodePatternContainer.setFill(false);
			fFigureComponentStoryNodePatternContainer.setOutline(false);

			GridData constraintFFigureComponentStoryNodePatternContainer = new GridData();
			constraintFFigureComponentStoryNodePatternContainer.verticalAlignment = GridData.FILL;
			constraintFFigureComponentStoryNodePatternContainer.horizontalAlignment = GridData.FILL;
			constraintFFigureComponentStoryNodePatternContainer.horizontalIndent = 0;
			constraintFFigureComponentStoryNodePatternContainer.horizontalSpan = 1;
			constraintFFigureComponentStoryNodePatternContainer.verticalSpan = 1;
			constraintFFigureComponentStoryNodePatternContainer.grabExcessHorizontalSpace = true;
			constraintFFigureComponentStoryNodePatternContainer.grabExcessVerticalSpace = true;
			componentStoryNodeContentContainer0.add(
					fFigureComponentStoryNodePatternContainer,
					constraintFFigureComponentStoryNodePatternContainer);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureComponentStoryNodeName() {
			return fFigureComponentStoryNodeName;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureComponentStoryNodePatternContainer() {
			return fFigureComponentStoryNodePatternContainer;
		}

	}

}
