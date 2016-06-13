package org.muml.pm.hardware.platform.diagram.edit.parts;

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
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
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
import org.muml.pm.hardware.common.figures.CustomIconFigure;
import org.muml.pm.hardware.platform.diagram.edit.policies.HWPlatformPartCanonicalEditPolicy;
import org.muml.pm.hardware.platform.diagram.edit.policies.HWPlatformPartItemSemanticEditPolicy;
import org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry;

/**
 * @generated
 */
public class HWPlatformPartEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3027;

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
	public HWPlatformPartEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(HardwareVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new HWPlatformPartItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new HWPlatformPartCanonicalEditPolicy());
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
				case HWPortPartEditPart.VISUAL_ID:
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
		return primaryShape = new SimpleResourceFigure();
	}

	/**
	 * @generated
	 */
	public SimpleResourceFigure getPrimaryShape() {
		return (SimpleResourceFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof HWPlatformPartNameEditPart) {
			((HWPlatformPartNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureResourceNameFigure());
			return true;
		}
		if (childEditPart instanceof WrappingLabel5EditPart) {
			((WrappingLabel5EditPart) childEditPart).setLabel(getPrimaryShape().getFigureResourceKindFigure());
			return true;
		}
		if (childEditPart instanceof WrappingLabel6EditPart) {
			((WrappingLabel6EditPart) childEditPart).setLabel(getPrimaryShape().getFigureResourceCardinalityFigure());
			return true;
		}
		if (childEditPart instanceof HWPortPartEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.EAST);
			getBorderedFigure().getBorderItemContainer().add(((HWPortPartEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof HWPlatformPartNameEditPart) {
			return true;
		}
		if (childEditPart instanceof WrappingLabel5EditPart) {
			return true;
		}
		if (childEditPart instanceof WrappingLabel6EditPart) {
			return true;
		}
		if (childEditPart instanceof HWPortPartEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(((HWPortPartEditPart) childEditPart).getFigure());
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
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
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
		return getChildBySemanticHint(HardwareVisualIDRegistry.getType(HWPlatformPartNameEditPart.VISUAL_ID));
	}

	/**
	* @generated
	*/
	public class SimpleResourceFigure extends RectangleFigure {

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
		private CustomIconFigure myCustomIconFigure;

		/**
		 * @generated
		 */
		public SimpleResourceFigure() {

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
			layoutResourceContainerFigure0.numColumns = 3;
			layoutResourceContainerFigure0.makeColumnsEqualWidth = false;
			resourceContainerFigure0.setLayoutManager(layoutResourceContainerFigure0);

			RectangleFigure simpleResourceNameRectangle1 = new RectangleFigure();

			simpleResourceNameRectangle1.setFill(false);
			simpleResourceNameRectangle1.setOutline(false);

			resourceContainerFigure0.add(simpleResourceNameRectangle1);

			GridLayout layoutSimpleResourceNameRectangle1 = new GridLayout();
			layoutSimpleResourceNameRectangle1.numColumns = 3;
			layoutSimpleResourceNameRectangle1.makeColumnsEqualWidth = false;
			simpleResourceNameRectangle1.setLayoutManager(layoutSimpleResourceNameRectangle1);

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
			simpleResourceNameRectangle1.add(fFigureResourceNameFigure, constraintFFigureResourceNameFigure);

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
			simpleResourceNameRectangle1.add(fFigureResourceKindFigure, constraintFFigureResourceKindFigure);

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
			simpleResourceNameRectangle1.add(fFigureResourceCardinalityFigure,
					constraintFFigureResourceCardinalityFigure);

			RectangleFigure simpleResourceIconRectangle1 = new RectangleFigure();

			simpleResourceIconRectangle1.setFill(false);
			simpleResourceIconRectangle1.setOutline(false);

			GridData constraintSimpleResourceIconRectangle1 = new GridData();
			constraintSimpleResourceIconRectangle1.verticalAlignment = GridData.CENTER;
			constraintSimpleResourceIconRectangle1.horizontalAlignment = GridData.CENTER;
			constraintSimpleResourceIconRectangle1.horizontalIndent = 0;
			constraintSimpleResourceIconRectangle1.horizontalSpan = 1;
			constraintSimpleResourceIconRectangle1.verticalSpan = 1;
			constraintSimpleResourceIconRectangle1.grabExcessHorizontalSpace = true;
			constraintSimpleResourceIconRectangle1.grabExcessVerticalSpace = true;
			resourceContainerFigure0.add(simpleResourceIconRectangle1, constraintSimpleResourceIconRectangle1);

			GridLayout layoutSimpleResourceIconRectangle1 = new GridLayout();
			layoutSimpleResourceIconRectangle1.numColumns = 1;
			layoutSimpleResourceIconRectangle1.makeColumnsEqualWidth = false;
			simpleResourceIconRectangle1.setLayoutManager(layoutSimpleResourceIconRectangle1);

			myCustomIconFigure = new CustomIconFigure();

			simpleResourceIconRectangle1.add(myCustomIconFigure);

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

	}

}
