package org.muml.pm.hardware.resourceinstance.diagram.edit.parts;

import java.util.Collection;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
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
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy;
import org.muml.core.common.edit.policies.IBackgroundColorEditPolicy;
import org.muml.core.common.edit.policies.anchor.IConnectionAnchorCreationEditPolicy;
import org.muml.core.common.edit.policies.compartment.EnlargeCompartmentEditPolicy;
import org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy;
import org.muml.pm.hardware.common.edit.policies.resource.ResourceInstanceEditPolicy;
import org.muml.pm.hardware.common.figures.CustomIconFigure;
import org.muml.pm.hardware.resourceinstance.diagram.edit.policies.CacheInstanceItemSemanticEditPolicy;
import org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry;

/**
 * @generated
 */
public class CacheInstanceEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3018;

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
	public CacheInstanceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new CacheInstanceItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());

		installEditPolicy(org.muml.pm.hardware.common.edit.policies.EditPolicyRoles.RESOURCE_VISUALIZATION_ROLE,
				new ResourceInstanceEditPolicy());

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
		return primaryShape = new ResourceFigure();
	}

	/**
	 * @generated
	 */
	public ResourceFigure getPrimaryShape() {
		return (ResourceFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CacheInstanceNameEditPart) {
			((CacheInstanceNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureResourceNameFigure());
			return true;
		}
		if (childEditPart instanceof WrappingLabel7EditPart) {
			((WrappingLabel7EditPart) childEditPart).setLabel(getPrimaryShape().getFigureResourceCardinalityFigure());
			return true;
		}
		if (childEditPart instanceof WrappingLabel8EditPart) {
			((WrappingLabel8EditPart) childEditPart).setLabel(getPrimaryShape().getFigureResourceKindFigure());
			return true;
		}
		if (childEditPart instanceof WrappingLabel9EditPart) {
			((WrappingLabel9EditPart) childEditPart).setLabel(getPrimaryShape().getFigureResourceInfo1());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CacheInstanceNameEditPart) {
			return true;
		}
		if (childEditPart instanceof WrappingLabel7EditPart) {
			return true;
		}
		if (childEditPart instanceof WrappingLabel8EditPart) {
			return true;
		}
		if (childEditPart instanceof WrappingLabel9EditPart) {
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
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(130, 47) {
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
		return getChildBySemanticHint(HardwareVisualIDRegistry.getType(CacheInstanceNameEditPart.VISUAL_ID));
	}

	/**
	* @generated
	*/
	public class ResourceFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureResourceNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureResourceKindFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureResourceCardinalityFigure;
		/**
		 * @generated
		 */
		private CustomIconFigure fFigureCustomIconFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureResourceInfo1;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureResourceInfo2;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureResourceRectangleInfo;

		/**
		 * @generated
		 */
		private CustomIconFigure myCustomIconFigure;

		/**
		 * @generated
		 */
		public ResourceFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure resourceContainerFigure0 = new RectangleFigure();

			resourceContainerFigure0.setFill(false);
			resourceContainerFigure0.setOutline(false);
			resourceContainerFigure0.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5)));

			GridData constraintResourceContainerFigure0 = new GridData();
			constraintResourceContainerFigure0.verticalAlignment = GridData.FILL;
			constraintResourceContainerFigure0.horizontalAlignment = GridData.FILL;
			constraintResourceContainerFigure0.horizontalIndent = 0;
			constraintResourceContainerFigure0.horizontalSpan = 1;
			constraintResourceContainerFigure0.verticalSpan = 1;
			constraintResourceContainerFigure0.grabExcessHorizontalSpace = true;
			constraintResourceContainerFigure0.grabExcessVerticalSpace = true;
			this.add(resourceContainerFigure0, constraintResourceContainerFigure0);

			GridLayout layoutResourceContainerFigure0 = new GridLayout();
			layoutResourceContainerFigure0.numColumns = 2;
			layoutResourceContainerFigure0.makeColumnsEqualWidth = false;
			resourceContainerFigure0.setLayoutManager(layoutResourceContainerFigure0);

			RectangleFigure resourceNameRectangle1 = new RectangleFigure();

			resourceNameRectangle1.setFill(false);
			resourceNameRectangle1.setOutline(false);

			GridData constraintResourceNameRectangle1 = new GridData();
			constraintResourceNameRectangle1.verticalAlignment = GridData.FILL;
			constraintResourceNameRectangle1.horizontalAlignment = GridData.CENTER;
			constraintResourceNameRectangle1.horizontalIndent = 0;
			constraintResourceNameRectangle1.horizontalSpan = 1;
			constraintResourceNameRectangle1.verticalSpan = 1;
			constraintResourceNameRectangle1.grabExcessHorizontalSpace = true;
			constraintResourceNameRectangle1.grabExcessVerticalSpace = true;
			resourceContainerFigure0.add(resourceNameRectangle1, constraintResourceNameRectangle1);

			GridLayout layoutResourceNameRectangle1 = new GridLayout();
			layoutResourceNameRectangle1.numColumns = 3;
			layoutResourceNameRectangle1.makeColumnsEqualWidth = false;
			resourceNameRectangle1.setLayoutManager(layoutResourceNameRectangle1);

			fFigureResourceNameFigure = new WrappingLabel();

			fFigureResourceNameFigure.setText("<...>");

			GridData constraintFFigureResourceNameFigure = new GridData();
			constraintFFigureResourceNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureResourceNameFigure.horizontalAlignment = GridData.END;
			constraintFFigureResourceNameFigure.horizontalIndent = 0;
			constraintFFigureResourceNameFigure.horizontalSpan = 1;
			constraintFFigureResourceNameFigure.verticalSpan = 1;
			constraintFFigureResourceNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureResourceNameFigure.grabExcessVerticalSpace = true;
			resourceNameRectangle1.add(fFigureResourceNameFigure, constraintFFigureResourceNameFigure);

			fFigureResourceKindFigure = new WrappingLabel();

			fFigureResourceKindFigure.setText("<...>");

			GridData constraintFFigureResourceKindFigure = new GridData();
			constraintFFigureResourceKindFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureResourceKindFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureResourceKindFigure.horizontalIndent = 0;
			constraintFFigureResourceKindFigure.horizontalSpan = 1;
			constraintFFigureResourceKindFigure.verticalSpan = 1;
			constraintFFigureResourceKindFigure.grabExcessHorizontalSpace = true;
			constraintFFigureResourceKindFigure.grabExcessVerticalSpace = true;
			resourceNameRectangle1.add(fFigureResourceKindFigure, constraintFFigureResourceKindFigure);

			fFigureResourceCardinalityFigure = new WrappingLabel();

			fFigureResourceCardinalityFigure.setText("<...>");

			GridData constraintFFigureResourceCardinalityFigure = new GridData();
			constraintFFigureResourceCardinalityFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureResourceCardinalityFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureResourceCardinalityFigure.horizontalIndent = 0;
			constraintFFigureResourceCardinalityFigure.horizontalSpan = 1;
			constraintFFigureResourceCardinalityFigure.verticalSpan = 1;
			constraintFFigureResourceCardinalityFigure.grabExcessHorizontalSpace = true;
			constraintFFigureResourceCardinalityFigure.grabExcessVerticalSpace = true;
			resourceNameRectangle1.add(fFigureResourceCardinalityFigure, constraintFFigureResourceCardinalityFigure);

			RectangleFigure resourceIconRectangle1 = new RectangleFigure();

			resourceIconRectangle1.setFill(false);
			resourceIconRectangle1.setOutline(false);

			GridData constraintResourceIconRectangle1 = new GridData();
			constraintResourceIconRectangle1.verticalAlignment = GridData.CENTER;
			constraintResourceIconRectangle1.horizontalAlignment = GridData.CENTER;
			constraintResourceIconRectangle1.horizontalIndent = 0;
			constraintResourceIconRectangle1.horizontalSpan = 1;
			constraintResourceIconRectangle1.verticalSpan = 1;
			constraintResourceIconRectangle1.grabExcessHorizontalSpace = true;
			constraintResourceIconRectangle1.grabExcessVerticalSpace = true;
			resourceContainerFigure0.add(resourceIconRectangle1, constraintResourceIconRectangle1);

			GridLayout layoutResourceIconRectangle1 = new GridLayout();
			layoutResourceIconRectangle1.numColumns = 1;
			layoutResourceIconRectangle1.makeColumnsEqualWidth = false;
			resourceIconRectangle1.setLayoutManager(layoutResourceIconRectangle1);

			myCustomIconFigure = new CustomIconFigure();

			resourceIconRectangle1.add(myCustomIconFigure);

			fFigureResourceRectangleInfo = new RectangleFigure();

			GridData constraintFFigureResourceRectangleInfo = new GridData();
			constraintFFigureResourceRectangleInfo.verticalAlignment = GridData.FILL;
			constraintFFigureResourceRectangleInfo.horizontalAlignment = GridData.FILL;
			constraintFFigureResourceRectangleInfo.horizontalIndent = 0;
			constraintFFigureResourceRectangleInfo.horizontalSpan = 1;
			constraintFFigureResourceRectangleInfo.verticalSpan = 1;
			constraintFFigureResourceRectangleInfo.grabExcessHorizontalSpace = true;
			constraintFFigureResourceRectangleInfo.grabExcessVerticalSpace = true;
			this.add(fFigureResourceRectangleInfo, constraintFFigureResourceRectangleInfo);

			GridLayout layoutFFigureResourceRectangleInfo = new GridLayout();
			layoutFFigureResourceRectangleInfo.numColumns = 1;
			layoutFFigureResourceRectangleInfo.makeColumnsEqualWidth = false;
			fFigureResourceRectangleInfo.setLayoutManager(layoutFFigureResourceRectangleInfo);

			fFigureResourceInfo1 = new WrappingLabel();

			fFigureResourceInfo1.setText("");

			GridData constraintFFigureResourceInfo1 = new GridData();
			constraintFFigureResourceInfo1.verticalAlignment = GridData.CENTER;
			constraintFFigureResourceInfo1.horizontalAlignment = GridData.CENTER;
			constraintFFigureResourceInfo1.horizontalIndent = 0;
			constraintFFigureResourceInfo1.horizontalSpan = 1;
			constraintFFigureResourceInfo1.verticalSpan = 1;
			constraintFFigureResourceInfo1.grabExcessHorizontalSpace = true;
			constraintFFigureResourceInfo1.grabExcessVerticalSpace = false;
			fFigureResourceRectangleInfo.add(fFigureResourceInfo1, constraintFFigureResourceInfo1);

			fFigureResourceInfo2 = new WrappingLabel();

			fFigureResourceInfo2.setText("");

			GridData constraintFFigureResourceInfo2 = new GridData();
			constraintFFigureResourceInfo2.verticalAlignment = GridData.CENTER;
			constraintFFigureResourceInfo2.horizontalAlignment = GridData.CENTER;
			constraintFFigureResourceInfo2.horizontalIndent = 0;
			constraintFFigureResourceInfo2.horizontalSpan = 1;
			constraintFFigureResourceInfo2.verticalSpan = 1;
			constraintFFigureResourceInfo2.grabExcessHorizontalSpace = true;
			constraintFFigureResourceInfo2.grabExcessVerticalSpace = false;
			fFigureResourceRectangleInfo.add(fFigureResourceInfo2, constraintFFigureResourceInfo2);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureResourceNameFigure() {
			return fFigureResourceNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureResourceKindFigure() {
			return fFigureResourceKindFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureResourceCardinalityFigure() {
			return fFigureResourceCardinalityFigure;
		}

		/**
		 * @generated
		 */
		public CustomIconFigure getFigureCustomIconFigure() {
			return myCustomIconFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureResourceInfo1() {
			return fFigureResourceInfo1;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureResourceInfo2() {
			return fFigureResourceInfo2;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureResourceRectangleInfo() {
			return fFigureResourceRectangleInfo;
		}

	}

}
