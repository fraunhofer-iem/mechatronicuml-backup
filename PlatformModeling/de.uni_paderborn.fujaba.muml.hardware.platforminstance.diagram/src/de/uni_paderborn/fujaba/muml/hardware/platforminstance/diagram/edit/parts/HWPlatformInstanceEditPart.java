package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts;

import java.util.Collection;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
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
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
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
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class HWPlatformInstanceEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2005;

	/**
	 * MUML FIX, see code comments.
	 *
	 * @generated
	 */
	@Override
	protected Collection<?> disableCanonicalFor(Request request) {

		@SuppressWarnings("unchecked")
		Collection<Object> hosts = super.disableCanonicalFor(request);

		// MUML FIX: Make sure that commands disable ALL canonical editpolicies,
		// because GMF supports adding additional commands using Edit Helpers concept,
		// which could trigger refresh of any canonical edit policy.
		// So it should be the cleanest solution to disable all canonical edit policies. 
		EditPart part = this;
		while (part != null) {
			hosts.add(part);
			part = part.getParent();
		}
		return hosts;
	}

	/**
	* MUML FIX: Adapt background color if IBackgroundColorEditPolicy is registered.
	* 
	* @generated
	*/
	@Override
	protected void refreshBackgroundColor() {
		EditPolicy backgroundColorPolicy = getEditPolicy(
				de.uni_paderborn.fujaba.common.edit.policies.EditPolicyRoles.BACKGROUND_COLOR_ROLE);
		if (backgroundColorPolicy instanceof de.uni_paderborn.fujaba.muml.common.edit.policies.IBackgroundColorEditPolicy) {
			setBackgroundColor(
					((de.uni_paderborn.fujaba.muml.common.edit.policies.IBackgroundColorEditPolicy) backgroundColorPolicy)
							.getCurrentBackgroundColor());
		} else {
			super.refreshBackgroundColor();
		}
	}

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
	public HWPlatformInstanceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicyWithCustomReparent(
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.policies.HWPlatformInstanceItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.policies.HWPlatformInstanceCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);

		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new de.uni_paderborn.fujaba.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy());

		installEditPolicy(de.uni_paderborn.fujaba.common.edit.policies.EditPolicyRoles.ERROR_FEEDBACK_ROLE,
				new de.uni_paderborn.fujaba.common.edit.policies.ErrorFeedbackEditPolicy());

	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getVisualID(childView)) {
				case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy();
				}
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
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
		return primaryShape = new HWPlatform();
	}

	/**
	 * @generated
	 */
	public HWPlatform getPrimaryShape() {
		return (HWPlatform) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceNameEditPart) {
			((de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureHWPlatformNameLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceHWPlatformCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureHWPlatformCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(
					((de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceHWPlatformCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.EAST);
			getBorderedFigure().getBorderItemContainer()
					.add(((de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart) childEditPart)
							.getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceNameEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceHWPlatformCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureHWPlatformCompartment();
			pane.remove(
					((de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceHWPlatformCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart) {
			getBorderedFigure().getBorderItemContainer()
					.remove(((de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart) childEditPart)
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
		if (editPart instanceof de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceHWPlatformCompartmentEditPart) {
			return getPrimaryShape().getFigureHWPlatformCompartment();
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
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(400, 400) {
			@Override
			public ConnectionAnchor createDefaultAnchor() {
				de.uni_paderborn.fujaba.common.edit.policies.anchor.IConnectionAnchorCreationEditPolicy connectionAnchorCreationEditPolicy = (de.uni_paderborn.fujaba.common.edit.policies.anchor.IConnectionAnchorCreationEditPolicy) getEditPolicy(
						de.uni_paderborn.fujaba.common.edit.policies.EditPolicyRoles.CONNECTION_ANCHOR_CREATION_ROLE);
				if (connectionAnchorCreationEditPolicy != null) {
					return connectionAnchorCreationEditPolicy.createDefaultAnchor();
				}
				return super.createDefaultAnchor();
			}
		};

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
		return getChildBySemanticHint(
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry.getType(
						de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceNameEditPart.VISUAL_ID));
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPlatformInstanceConfiguration_3039) {
				return getChildBySemanticHint(
						de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
								.getType(
										de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceHWPlatformCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class HWPlatform extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureHWPlatformNameLabel;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureHWPlatformCompartment;

		/**
		 * @generated
		 */
		public HWPlatform() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = false;
			this.setLayoutManager(layoutThis);

			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure hWPlatformTitleAreaFigure0 = new RectangleFigure();

			hWPlatformTitleAreaFigure0.setFill(false);
			hWPlatformTitleAreaFigure0.setOutline(false);

			GridData constraintHWPlatformTitleAreaFigure0 = new GridData();
			constraintHWPlatformTitleAreaFigure0.verticalAlignment = GridData.CENTER;
			constraintHWPlatformTitleAreaFigure0.horizontalAlignment = GridData.FILL;
			constraintHWPlatformTitleAreaFigure0.horizontalIndent = 0;
			constraintHWPlatformTitleAreaFigure0.horizontalSpan = 1;
			constraintHWPlatformTitleAreaFigure0.verticalSpan = 1;
			constraintHWPlatformTitleAreaFigure0.grabExcessHorizontalSpace = true;
			constraintHWPlatformTitleAreaFigure0.grabExcessVerticalSpace = false;
			this.add(hWPlatformTitleAreaFigure0, constraintHWPlatformTitleAreaFigure0);

			GridLayout layoutHWPlatformTitleAreaFigure0 = new GridLayout();
			layoutHWPlatformTitleAreaFigure0.numColumns = 1;
			layoutHWPlatformTitleAreaFigure0.makeColumnsEqualWidth = false;
			hWPlatformTitleAreaFigure0.setLayoutManager(layoutHWPlatformTitleAreaFigure0);

			fFigureHWPlatformNameLabel = new WrappingLabel();

			fFigureHWPlatformNameLabel.setText("<...>");

			hWPlatformTitleAreaFigure0.add(fFigureHWPlatformNameLabel);

			fFigureHWPlatformCompartment = new RectangleFigure();

			fFigureHWPlatformCompartment.setOutline(false);

			GridData constraintFFigureHWPlatformCompartment = new GridData();
			constraintFFigureHWPlatformCompartment.verticalAlignment = GridData.FILL;
			constraintFFigureHWPlatformCompartment.horizontalAlignment = GridData.FILL;
			constraintFFigureHWPlatformCompartment.horizontalIndent = 0;
			constraintFFigureHWPlatformCompartment.horizontalSpan = 1;
			constraintFFigureHWPlatformCompartment.verticalSpan = 1;
			constraintFFigureHWPlatformCompartment.grabExcessHorizontalSpace = true;
			constraintFFigureHWPlatformCompartment.grabExcessVerticalSpace = true;
			this.add(fFigureHWPlatformCompartment, constraintFFigureHWPlatformCompartment);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHWPlatformNameLabel() {
			return fFigureHWPlatformNameLabel;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureHWPlatformCompartment() {
			return fFigureHWPlatformCompartment;
		}

	}

}
