package org.muml.pm.hardware.platform.diagram.edit.parts;

import java.util.Collection;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ScalablePolygonShape;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
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
import org.muml.core.common.edit.policies.compartment.EnlargeCompartmentEditPolicy;
import org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy;
import org.muml.pm.hardware.platform.diagram.edit.policies.BusItemSemanticEditPolicy;
import org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry;

/**
 * @generated
 */
public class BusEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3025;

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
	public BusEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new BusItemSemanticEditPolicy());
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
		return primaryShape = new BusFigure();
	}

	/**
	 * @generated
	 */
	public BusFigure getPrimaryShape() {
		return (BusFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel2EditPart) {
			((WrappingLabel2EditPart) childEditPart).setLabel(getPrimaryShape().getFigureBusBandwidthFigure());
			return true;
		}
		if (childEditPart instanceof WrappingLabel3EditPart) {
			((WrappingLabel3EditPart) childEditPart).setLabel(getPrimaryShape().getFigureBusProtocolFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel2EditPart) {
			return true;
		}
		if (childEditPart instanceof WrappingLabel3EditPart) {
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
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(130, 50) {
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
		return getChildBySemanticHint(HardwareVisualIDRegistry.getType(WrappingLabel2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class BusFigure extends ScalablePolygonShape {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureBusProtocolFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureBusBandwidthFigure;

		/**
		 * @generated
		 */
		public BusFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = false;
			this.setLayoutManager(layoutThis);

			this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode().DPtoLP(2)));
			this.addPoint(new Point(getMapMode().DPtoLP(1), getMapMode().DPtoLP(4)));
			this.addPoint(new Point(getMapMode().DPtoLP(1), getMapMode().DPtoLP(3)));
			this.addPoint(new Point(getMapMode().DPtoLP(5), getMapMode().DPtoLP(3)));
			this.addPoint(new Point(getMapMode().DPtoLP(5), getMapMode().DPtoLP(4)));
			this.addPoint(new Point(getMapMode().DPtoLP(6), getMapMode().DPtoLP(2)));
			this.addPoint(new Point(getMapMode().DPtoLP(5), getMapMode().DPtoLP(0)));
			this.addPoint(new Point(getMapMode().DPtoLP(5), getMapMode().DPtoLP(1)));
			this.addPoint(new Point(getMapMode().DPtoLP(1), getMapMode().DPtoLP(1)));
			this.addPoint(new Point(getMapMode().DPtoLP(1), getMapMode().DPtoLP(0)));
			this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode().DPtoLP(2)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure busContainer0 = new RectangleFigure();

			busContainer0.setOutline(false);

			GridData constraintBusContainer0 = new GridData();
			constraintBusContainer0.verticalAlignment = GridData.CENTER;
			constraintBusContainer0.horizontalAlignment = GridData.CENTER;
			constraintBusContainer0.horizontalIndent = 0;
			constraintBusContainer0.horizontalSpan = 1;
			constraintBusContainer0.verticalSpan = 1;
			constraintBusContainer0.grabExcessHorizontalSpace = true;
			constraintBusContainer0.grabExcessVerticalSpace = true;
			this.add(busContainer0, constraintBusContainer0);

			GridLayout layoutBusContainer0 = new GridLayout();
			layoutBusContainer0.numColumns = 1;
			layoutBusContainer0.makeColumnsEqualWidth = false;
			busContainer0.setLayoutManager(layoutBusContainer0);

			fFigureBusProtocolFigure = new WrappingLabel();

			fFigureBusProtocolFigure.setText("<...>");

			fFigureBusProtocolFigure.setFont(FFIGUREBUSPROTOCOLFIGURE_FONT);

			GridData constraintFFigureBusProtocolFigure = new GridData();
			constraintFFigureBusProtocolFigure.verticalAlignment = GridData.BEGINNING;
			constraintFFigureBusProtocolFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureBusProtocolFigure.horizontalIndent = 0;
			constraintFFigureBusProtocolFigure.horizontalSpan = 1;
			constraintFFigureBusProtocolFigure.verticalSpan = 0;
			constraintFFigureBusProtocolFigure.grabExcessHorizontalSpace = true;
			constraintFFigureBusProtocolFigure.grabExcessVerticalSpace = true;
			busContainer0.add(fFigureBusProtocolFigure, constraintFFigureBusProtocolFigure);

			fFigureBusBandwidthFigure = new WrappingLabel();

			fFigureBusBandwidthFigure.setText("<...>");

			GridData constraintFFigureBusBandwidthFigure = new GridData();
			constraintFFigureBusBandwidthFigure.verticalAlignment = GridData.BEGINNING;
			constraintFFigureBusBandwidthFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureBusBandwidthFigure.horizontalIndent = 0;
			constraintFFigureBusBandwidthFigure.horizontalSpan = 1;
			constraintFFigureBusBandwidthFigure.verticalSpan = 1;
			constraintFFigureBusBandwidthFigure.grabExcessHorizontalSpace = true;
			constraintFFigureBusBandwidthFigure.grabExcessVerticalSpace = true;
			busContainer0.add(fFigureBusBandwidthFigure, constraintFFigureBusBandwidthFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBusProtocolFigure() {
			return fFigureBusProtocolFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBusBandwidthFigure() {
			return fFigureBusBandwidthFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREBUSPROTOCOLFIGURE_FONT = new Font(Display.getCurrent(), "BOLD", 9, SWT.BOLD);

}
