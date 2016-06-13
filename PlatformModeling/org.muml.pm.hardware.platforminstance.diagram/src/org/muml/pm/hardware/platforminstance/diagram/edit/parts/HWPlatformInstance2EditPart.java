package org.muml.pm.hardware.platforminstance.diagram.edit.parts;

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
import org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy;
import org.muml.core.common.edit.policies.IBackgroundColorEditPolicy;
import org.muml.core.common.edit.policies.anchor.IConnectionAnchorCreationEditPolicy;
import org.muml.core.common.edit.policies.compartment.EnlargeCompartmentEditPolicy;
import org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy;
import org.muml.pm.hardware.platforminstance.diagram.edit.policies.HWPlatformInstance2CanonicalEditPolicy;
import org.muml.pm.hardware.platforminstance.diagram.edit.policies.HWPlatformInstance2ItemSemanticEditPolicy;
import org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry;
import org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes;

/**
 * @generated
 */
public class HWPlatformInstance2EditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3040;

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
				org.muml.core.common.edit.policies.EditPolicyRoles.BACKGROUND_COLOR_ROLE);
		if (backgroundColorPolicy instanceof IBackgroundColorEditPolicy) {
			setBackgroundColor(((IBackgroundColorEditPolicy) backgroundColorPolicy).getCurrentBackgroundColor());
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
	public HWPlatformInstance2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(HardwareVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new HWPlatformInstance2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new HWPlatformInstance2CanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());

		installEditPolicy(org.muml.core.common.edit.policies.EditPolicyRoles.ENLARGE_COMPARTMENT_ROLE,
				new EnlargeCompartmentEditPolicy());

		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);

		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new ConnectionConfigureHelperGraphicalNodeEditPolicy());

		installEditPolicy(org.muml.core.common.edit.policies.EditPolicyRoles.ERROR_FEEDBACK_ROLE,
				new ErrorFeedbackEditPolicy());

	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (HardwareVisualIDRegistry.getVisualID(childView)) {
				case DelegationHWPortInstanceEditPart.VISUAL_ID:
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
		if (childEditPart instanceof HWPlatformInstanceName2EditPart) {
			((HWPlatformInstanceName2EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureHWPlatformNameLabel());
			return true;
		}
		if (childEditPart instanceof HWPlatformInstanceHWPlatformCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getFigureHWPlatformCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((HWPlatformInstanceHWPlatformCompartment2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof DelegationHWPortInstanceEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.EAST);
			getBorderedFigure().getBorderItemContainer()
					.add(((DelegationHWPortInstanceEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof HWPlatformInstanceName2EditPart) {
			return true;
		}
		if (childEditPart instanceof HWPlatformInstanceHWPlatformCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getFigureHWPlatformCompartment();
			pane.remove(((HWPlatformInstanceHWPlatformCompartment2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof DelegationHWPortInstanceEditPart) {
			getBorderedFigure().getBorderItemContainer()
					.remove(((DelegationHWPortInstanceEditPart) childEditPart).getFigure());
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
		if (editPart instanceof HWPlatformInstanceHWPlatformCompartment2EditPart) {
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
				IConnectionAnchorCreationEditPolicy connectionAnchorCreationEditPolicy = (IConnectionAnchorCreationEditPolicy) getEditPolicy(
						org.muml.core.common.edit.policies.EditPolicyRoles.CONNECTION_ANCHOR_CREATION_ROLE);
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
		return getChildBySemanticHint(HardwareVisualIDRegistry.getType(HWPlatformInstanceName2EditPart.VISUAL_ID));
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == HardwareElementTypes.HWPlatformInstanceConfiguration_3039) {
				return getChildBySemanticHint(
						HardwareVisualIDRegistry.getType(HWPlatformInstanceHWPlatformCompartment2EditPart.VISUAL_ID));
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
