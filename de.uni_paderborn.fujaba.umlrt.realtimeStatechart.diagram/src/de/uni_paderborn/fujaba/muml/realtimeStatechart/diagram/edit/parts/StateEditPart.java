package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class StateEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

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
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateActionsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureStateCompartmentActionsFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateActionsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateInvariantCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureStateCompartmentInvariants();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateInvariantCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateSynchroChannelsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureStateCompartmentSynchroChannel();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateSynchroChannelsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureStateCompartmentRegions();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartmentEditPart) childEditPart)
					.getFigure());
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
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateActionsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureStateCompartmentActionsFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateActionsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateInvariantCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureStateCompartmentInvariants();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateInvariantCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateSynchroChannelsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureStateCompartmentSynchroChannel();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateSynchroChannelsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureStateCompartmentRegions();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartmentEditPart) childEditPart)
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
		if (editPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateActionsCompartmentEditPart) {
			return getPrimaryShape().getFigureStateCompartmentActionsFigure();
		}
		if (editPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateInvariantCompartmentEditPart) {
			return getPrimaryShape().getFigureStateCompartmentInvariants();
		}
		if (editPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateSynchroChannelsCompartmentEditPart) {
			return getPrimaryShape().getFigureStateCompartmentSynchroChannel();
		}
		if (editPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartmentEditPart) {
			return getPrimaryShape().getFigureStateCompartmentRegions();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(130, 90);
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
		return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.Transition_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.Transition_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.Transition_4001) {
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.State_2001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.Transition_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.Transition_4001) {
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.State_2001);
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
			if (type == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.EntryOrExitEvent_3010) {
				return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateActionsCompartmentEditPart.VISUAL_ID));
			}
			if (type == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.DoEvent_3008) {
				return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateActionsCompartmentEditPart.VISUAL_ID));
			}
			if (type == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.EntryOrExitEvent_3011) {
				return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateActionsCompartmentEditPart.VISUAL_ID));
			}
			if (type == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.ClockConstraint_3004) {
				return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateInvariantCompartmentEditPart.VISUAL_ID));
			}
			if (type == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.SynchronizationChannel_3005) {
				return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateSynchroChannelsCompartmentEditPart.VISUAL_ID));
			}
			if (type == de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.Region_3006) {
				return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class StateFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureStateNameLabel;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureStateCompartmentInvariants;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureStateCompartmentActionsFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureStateCompartmentSynchroChannel;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureStateCompartmentRegions;

		/**
		 * @generated
		 */
		public StateFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = false;
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(12),
					getMapMode().DPtoLP(12)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

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
			this.add(fFigureStateNameLabel, constraintFFigureStateNameLabel);

			fFigureStateCompartmentInvariants = new RectangleFigure();
			fFigureStateCompartmentInvariants.setOutline(false);

			GridData constraintFFigureStateCompartmentInvariants = new GridData();
			constraintFFigureStateCompartmentInvariants.verticalAlignment = GridData.CENTER;
			constraintFFigureStateCompartmentInvariants.horizontalAlignment = GridData.FILL;
			constraintFFigureStateCompartmentInvariants.horizontalIndent = 0;
			constraintFFigureStateCompartmentInvariants.horizontalSpan = 1;
			constraintFFigureStateCompartmentInvariants.verticalSpan = 1;
			constraintFFigureStateCompartmentInvariants.grabExcessHorizontalSpace = true;
			constraintFFigureStateCompartmentInvariants.grabExcessVerticalSpace = false;
			this.add(fFigureStateCompartmentInvariants,
					constraintFFigureStateCompartmentInvariants);

			fFigureStateCompartmentActionsFigure = new RectangleFigure();
			fFigureStateCompartmentActionsFigure.setOutline(false);

			GridData constraintFFigureStateCompartmentActionsFigure = new GridData();
			constraintFFigureStateCompartmentActionsFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureStateCompartmentActionsFigure.horizontalAlignment = GridData.FILL;
			constraintFFigureStateCompartmentActionsFigure.horizontalIndent = 0;
			constraintFFigureStateCompartmentActionsFigure.horizontalSpan = 1;
			constraintFFigureStateCompartmentActionsFigure.verticalSpan = 1;
			constraintFFigureStateCompartmentActionsFigure.grabExcessHorizontalSpace = true;
			constraintFFigureStateCompartmentActionsFigure.grabExcessVerticalSpace = false;
			this.add(fFigureStateCompartmentActionsFigure,
					constraintFFigureStateCompartmentActionsFigure);

			fFigureStateCompartmentSynchroChannel = new RectangleFigure();
			fFigureStateCompartmentSynchroChannel.setOutline(false);

			GridData constraintFFigureStateCompartmentSynchroChannel = new GridData();
			constraintFFigureStateCompartmentSynchroChannel.verticalAlignment = GridData.FILL;
			constraintFFigureStateCompartmentSynchroChannel.horizontalAlignment = GridData.FILL;
			constraintFFigureStateCompartmentSynchroChannel.horizontalIndent = 0;
			constraintFFigureStateCompartmentSynchroChannel.horizontalSpan = 1;
			constraintFFigureStateCompartmentSynchroChannel.verticalSpan = 1;
			constraintFFigureStateCompartmentSynchroChannel.grabExcessHorizontalSpace = true;
			constraintFFigureStateCompartmentSynchroChannel.grabExcessVerticalSpace = true;
			this.add(fFigureStateCompartmentSynchroChannel,
					constraintFFigureStateCompartmentSynchroChannel);

			fFigureStateCompartmentRegions = new RectangleFigure();
			fFigureStateCompartmentRegions.setOutline(false);

			GridData constraintFFigureStateCompartmentRegions = new GridData();
			constraintFFigureStateCompartmentRegions.verticalAlignment = GridData.FILL;
			constraintFFigureStateCompartmentRegions.horizontalAlignment = GridData.FILL;
			constraintFFigureStateCompartmentRegions.horizontalIndent = 0;
			constraintFFigureStateCompartmentRegions.horizontalSpan = 1;
			constraintFFigureStateCompartmentRegions.verticalSpan = 1;
			constraintFFigureStateCompartmentRegions.grabExcessHorizontalSpace = true;
			constraintFFigureStateCompartmentRegions.grabExcessVerticalSpace = true;
			this.add(fFigureStateCompartmentRegions,
					constraintFFigureStateCompartmentRegions);

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
		public RectangleFigure getFigureStateCompartmentInvariants() {
			return fFigureStateCompartmentInvariants;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureStateCompartmentActionsFigure() {
			return fFigureStateCompartmentActionsFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureStateCompartmentSynchroChannel() {
			return fFigureStateCompartmentSynchroChannel;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureStateCompartmentRegions() {
			return fFigureStateCompartmentRegions;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGURESTATENAMELABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 10, SWT.BOLD);

}
