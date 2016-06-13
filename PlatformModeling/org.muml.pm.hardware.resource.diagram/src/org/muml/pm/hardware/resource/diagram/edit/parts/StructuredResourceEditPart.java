package org.muml.pm.hardware.resource.diagram.edit.parts;

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
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy;
import org.muml.core.common.edit.policies.IBackgroundColorEditPolicy;
import org.muml.core.common.edit.policies.anchor.IConnectionAnchorCreationEditPolicy;
import org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy;
import org.muml.pm.hardware.common.figures.CustomIconFigure;
import org.muml.pm.hardware.resource.diagram.edit.policies.StructuredResourceItemSemanticEditPolicy;
import org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry;

/**
 * @generated
 */
public class StructuredResourceEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2007;

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
	public StructuredResourceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new StructuredResourceItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
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
		return primaryShape = new StructuredResourceFigure();
	}

	/**
	 * @generated
	 */
	public StructuredResourceFigure getPrimaryShape() {
		return (StructuredResourceFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof StructuredResourceNameEditPart) {
			((StructuredResourceNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureStructuredResourceNameFigure());
			return true;
		}
		if (childEditPart instanceof WrappingLabel3EditPart) {
			((WrappingLabel3EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureStructuredResourceKindFigure());
			return true;
		}
		if (childEditPart instanceof WrappingLabel4EditPart) {
			((WrappingLabel4EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureStructuredResourceCardinalityFigure());
			return true;
		}
		if (childEditPart instanceof StructuredResourceStructuredResourceCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureEmbeddedAtomicResources();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((StructuredResourceStructuredResourceCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof StructuredResourceNameEditPart) {
			return true;
		}
		if (childEditPart instanceof WrappingLabel3EditPart) {
			return true;
		}
		if (childEditPart instanceof WrappingLabel4EditPart) {
			return true;
		}
		if (childEditPart instanceof StructuredResourceStructuredResourceCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureEmbeddedAtomicResources();
			pane.remove(((StructuredResourceStructuredResourceCompartmentEditPart) childEditPart).getFigure());
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
		if (editPart instanceof StructuredResourceStructuredResourceCompartmentEditPart) {
			return getPrimaryShape().getFigureEmbeddedAtomicResources();
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
		return getChildBySemanticHint(HardwareVisualIDRegistry.getType(StructuredResourceNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class StructuredResourceFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureEmbeddedAtomicResources;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureStructuredResourceCardinalityFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureStructuredResourceNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureStructuredResourceKindFigure;
		/**
		 * @generated
		 */
		private CustomIconFigure fFigureCustomStructuredIconFigure;

		/**
		 * @generated
		 */
		private CustomIconFigure myCustomStructuredIconFigure;

		/**
		 * @generated
		 */
		public StructuredResourceFigure() {

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

			RectangleFigure structuredContainer0 = new RectangleFigure();

			structuredContainer0.setFill(false);
			structuredContainer0.setOutline(false);
			structuredContainer0.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5)));

			GridData constraintStructuredContainer0 = new GridData();
			constraintStructuredContainer0.verticalAlignment = GridData.BEGINNING;
			constraintStructuredContainer0.horizontalAlignment = GridData.FILL;
			constraintStructuredContainer0.horizontalIndent = 0;
			constraintStructuredContainer0.horizontalSpan = 1;
			constraintStructuredContainer0.verticalSpan = 1;
			constraintStructuredContainer0.grabExcessHorizontalSpace = true;
			constraintStructuredContainer0.grabExcessVerticalSpace = false;
			this.add(structuredContainer0, constraintStructuredContainer0);

			GridLayout layoutStructuredContainer0 = new GridLayout();
			layoutStructuredContainer0.numColumns = 2;
			layoutStructuredContainer0.makeColumnsEqualWidth = false;
			structuredContainer0.setLayoutManager(layoutStructuredContainer0);

			RectangleFigure structuredName1 = new RectangleFigure();

			structuredName1.setFill(false);
			structuredName1.setOutline(false);

			GridData constraintStructuredName1 = new GridData();
			constraintStructuredName1.verticalAlignment = GridData.FILL;
			constraintStructuredName1.horizontalAlignment = GridData.FILL;
			constraintStructuredName1.horizontalIndent = 0;
			constraintStructuredName1.horizontalSpan = 1;
			constraintStructuredName1.verticalSpan = 1;
			constraintStructuredName1.grabExcessHorizontalSpace = true;
			constraintStructuredName1.grabExcessVerticalSpace = true;
			structuredContainer0.add(structuredName1, constraintStructuredName1);

			GridLayout layoutStructuredName1 = new GridLayout();
			layoutStructuredName1.numColumns = 3;
			layoutStructuredName1.makeColumnsEqualWidth = false;
			structuredName1.setLayoutManager(layoutStructuredName1);

			fFigureStructuredResourceNameFigure = new WrappingLabel();

			fFigureStructuredResourceNameFigure.setText("<...>");

			fFigureStructuredResourceNameFigure.setFont(FFIGURESTRUCTUREDRESOURCENAMEFIGURE_FONT);

			GridData constraintFFigureStructuredResourceNameFigure = new GridData();
			constraintFFigureStructuredResourceNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureStructuredResourceNameFigure.horizontalAlignment = GridData.END;
			constraintFFigureStructuredResourceNameFigure.horizontalIndent = 0;
			constraintFFigureStructuredResourceNameFigure.horizontalSpan = 1;
			constraintFFigureStructuredResourceNameFigure.verticalSpan = 1;
			constraintFFigureStructuredResourceNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureStructuredResourceNameFigure.grabExcessVerticalSpace = true;
			structuredName1.add(fFigureStructuredResourceNameFigure, constraintFFigureStructuredResourceNameFigure);

			fFigureStructuredResourceKindFigure = new WrappingLabel();

			fFigureStructuredResourceKindFigure.setText("<...>");

			fFigureStructuredResourceKindFigure.setFont(FFIGURESTRUCTUREDRESOURCEKINDFIGURE_FONT);

			GridData constraintFFigureStructuredResourceKindFigure = new GridData();
			constraintFFigureStructuredResourceKindFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureStructuredResourceKindFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureStructuredResourceKindFigure.horizontalIndent = 0;
			constraintFFigureStructuredResourceKindFigure.horizontalSpan = 1;
			constraintFFigureStructuredResourceKindFigure.verticalSpan = 1;
			constraintFFigureStructuredResourceKindFigure.grabExcessHorizontalSpace = true;
			constraintFFigureStructuredResourceKindFigure.grabExcessVerticalSpace = true;
			structuredName1.add(fFigureStructuredResourceKindFigure, constraintFFigureStructuredResourceKindFigure);

			fFigureStructuredResourceCardinalityFigure = new WrappingLabel();

			fFigureStructuredResourceCardinalityFigure.setText("<...>");

			fFigureStructuredResourceCardinalityFigure.setFont(FFIGURESTRUCTUREDRESOURCECARDINALITYFIGURE_FONT);

			GridData constraintFFigureStructuredResourceCardinalityFigure = new GridData();
			constraintFFigureStructuredResourceCardinalityFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureStructuredResourceCardinalityFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureStructuredResourceCardinalityFigure.horizontalIndent = 0;
			constraintFFigureStructuredResourceCardinalityFigure.horizontalSpan = 1;
			constraintFFigureStructuredResourceCardinalityFigure.verticalSpan = 1;
			constraintFFigureStructuredResourceCardinalityFigure.grabExcessHorizontalSpace = true;
			constraintFFigureStructuredResourceCardinalityFigure.grabExcessVerticalSpace = true;
			structuredName1.add(fFigureStructuredResourceCardinalityFigure,
					constraintFFigureStructuredResourceCardinalityFigure);

			myCustomStructuredIconFigure = new CustomIconFigure();

			GridData constraintMyCustomStructuredIconFigure = new GridData();
			constraintMyCustomStructuredIconFigure.verticalAlignment = GridData.FILL;
			constraintMyCustomStructuredIconFigure.horizontalAlignment = GridData.FILL;
			constraintMyCustomStructuredIconFigure.horizontalIndent = 0;
			constraintMyCustomStructuredIconFigure.horizontalSpan = 1;
			constraintMyCustomStructuredIconFigure.verticalSpan = 1;
			constraintMyCustomStructuredIconFigure.grabExcessHorizontalSpace = true;
			constraintMyCustomStructuredIconFigure.grabExcessVerticalSpace = true;
			structuredContainer0.add(myCustomStructuredIconFigure, constraintMyCustomStructuredIconFigure);

			fFigureEmbeddedAtomicResources = new RectangleFigure();

			GridData constraintFFigureEmbeddedAtomicResources = new GridData();
			constraintFFigureEmbeddedAtomicResources.verticalAlignment = GridData.FILL;
			constraintFFigureEmbeddedAtomicResources.horizontalAlignment = GridData.FILL;
			constraintFFigureEmbeddedAtomicResources.horizontalIndent = 0;
			constraintFFigureEmbeddedAtomicResources.horizontalSpan = 1;
			constraintFFigureEmbeddedAtomicResources.verticalSpan = 1;
			constraintFFigureEmbeddedAtomicResources.grabExcessHorizontalSpace = true;
			constraintFFigureEmbeddedAtomicResources.grabExcessVerticalSpace = true;
			this.add(fFigureEmbeddedAtomicResources, constraintFFigureEmbeddedAtomicResources);

		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureEmbeddedAtomicResources() {
			return fFigureEmbeddedAtomicResources;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStructuredResourceCardinalityFigure() {
			return fFigureStructuredResourceCardinalityFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStructuredResourceNameFigure() {
			return fFigureStructuredResourceNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStructuredResourceKindFigure() {
			return fFigureStructuredResourceKindFigure;
		}

		/**
		 * @generated
		 */
		public CustomIconFigure getFigureCustomStructuredIconFigure() {
			return myCustomStructuredIconFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGURESTRUCTUREDRESOURCENAMEFIGURE_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 9, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font FFIGURESTRUCTUREDRESOURCEKINDFIGURE_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 9, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font FFIGURESTRUCTUREDRESOURCECARDINALITYFIGURE_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 9, SWT.BOLD);

}
