package de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts;

import java.util.Collection;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineShape;
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

/**
 * @generated
 */
public class MessageBufferEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3004;

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
	public MessageBufferEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.policies.MessageBufferItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);

		installEditPolicy(
				EditPolicy.GRAPHICAL_NODE_ROLE,
				new de.uni_paderborn.fujaba.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy());

		installEditPolicy(
				de.uni_paderborn.fujaba.common.edit.policies.EditPolicyRoles.ERROR_FEEDBACK_ROLE,
				new de.uni_paderborn.fujaba.common.edit.policies.ErrorFeedbackEditPolicy());

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
		return primaryShape = new MessageBuffferFigure();
	}

	/**
	 * @generated
	 */
	public MessageBuffferFigure getPrimaryShape() {
		return (MessageBuffferFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageBufferNameEditPart) {
			((de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageBufferNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMessageBufferNameLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabelEditPart) {
			((de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabelEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMessageBufferSizeLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabel6EditPart) {
			((de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabel6EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMessageBufferOverFlowAvoidanceStrategyLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabel7EditPart) {
			((de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabel7EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMessageBufferNameLabel());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageBufferNameEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabelEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabel6EditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabel7EditPart) {
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
		return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageBufferNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class MessageBuffferFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMessageBufferNameLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMessageBufferSizeLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMessageBufferOverFlowAvoidanceStrategyLabel;

		/**
		 * @generated
		 */
		public MessageBuffferFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 2;
			layoutThis.makeColumnsEqualWidth = false;
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setBackgroundColor(THIS_BACK);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureMessageBufferNameLabel = new WrappingLabel();

			fFigureMessageBufferNameLabel.setText("");
			fFigureMessageBufferNameLabel
					.setForegroundColor(FFIGUREMESSAGEBUFFERNAMELABEL_FORE);
			fFigureMessageBufferNameLabel
					.setBackgroundColor(FFIGUREMESSAGEBUFFERNAMELABEL_BACK);

			fFigureMessageBufferNameLabel
					.setFont(FFIGUREMESSAGEBUFFERNAMELABEL_FONT);

			GridData constraintFFigureMessageBufferNameLabel = new GridData();
			constraintFFigureMessageBufferNameLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureMessageBufferNameLabel.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureMessageBufferNameLabel.horizontalIndent = 0;
			constraintFFigureMessageBufferNameLabel.horizontalSpan = 2;
			constraintFFigureMessageBufferNameLabel.verticalSpan = 1;
			constraintFFigureMessageBufferNameLabel.grabExcessHorizontalSpace = true;
			constraintFFigureMessageBufferNameLabel.grabExcessVerticalSpace = false;
			this.add(fFigureMessageBufferNameLabel,
					constraintFFigureMessageBufferNameLabel);

			fFigureMessageBufferSizeLabel = new WrappingLabel();

			fFigureMessageBufferSizeLabel.setText("Name:");

			GridData constraintFFigureMessageBufferSizeLabel = new GridData();
			constraintFFigureMessageBufferSizeLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureMessageBufferSizeLabel.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureMessageBufferSizeLabel.horizontalIndent = 0;
			constraintFFigureMessageBufferSizeLabel.horizontalSpan = 2;
			constraintFFigureMessageBufferSizeLabel.verticalSpan = 1;
			constraintFFigureMessageBufferSizeLabel.grabExcessHorizontalSpace = true;
			constraintFFigureMessageBufferSizeLabel.grabExcessVerticalSpace = false;
			this.add(fFigureMessageBufferSizeLabel,
					constraintFFigureMessageBufferSizeLabel);

			fFigureMessageBufferOverFlowAvoidanceStrategyLabel = new WrappingLabel();

			fFigureMessageBufferOverFlowAvoidanceStrategyLabel.setText("");

			GridData constraintFFigureMessageBufferOverFlowAvoidanceStrategyLabel = new GridData();
			constraintFFigureMessageBufferOverFlowAvoidanceStrategyLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureMessageBufferOverFlowAvoidanceStrategyLabel.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureMessageBufferOverFlowAvoidanceStrategyLabel.horizontalIndent = 0;
			constraintFFigureMessageBufferOverFlowAvoidanceStrategyLabel.horizontalSpan = 2;
			constraintFFigureMessageBufferOverFlowAvoidanceStrategyLabel.verticalSpan = 1;
			constraintFFigureMessageBufferOverFlowAvoidanceStrategyLabel.grabExcessHorizontalSpace = true;
			constraintFFigureMessageBufferOverFlowAvoidanceStrategyLabel.grabExcessVerticalSpace = false;
			this.add(fFigureMessageBufferOverFlowAvoidanceStrategyLabel,
					constraintFFigureMessageBufferOverFlowAvoidanceStrategyLabel);

			WrappingLabel messageTypesStaticLabel0 = new WrappingLabel();

			messageTypesStaticLabel0.setText("Messages:");

			GridData constraintMessageTypesStaticLabel0 = new GridData();
			constraintMessageTypesStaticLabel0.verticalAlignment = GridData.BEGINNING;
			constraintMessageTypesStaticLabel0.horizontalAlignment = GridData.BEGINNING;
			constraintMessageTypesStaticLabel0.horizontalIndent = 0;
			constraintMessageTypesStaticLabel0.horizontalSpan = 1;
			constraintMessageTypesStaticLabel0.verticalSpan = 1;
			constraintMessageTypesStaticLabel0.grabExcessHorizontalSpace = true;
			constraintMessageTypesStaticLabel0.grabExcessVerticalSpace = false;
			this.add(messageTypesStaticLabel0,
					constraintMessageTypesStaticLabel0);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMessageBufferNameLabel() {
			return fFigureMessageBufferNameLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMessageBufferSizeLabel() {
			return fFigureMessageBufferSizeLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMessageBufferOverFlowAvoidanceStrategyLabel() {
			return fFigureMessageBufferOverFlowAvoidanceStrategyLabel;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 255, 255, 150);

	/**
	 * @generated
	 */
	static final Color FFIGUREMESSAGEBUFFERNAMELABEL_FORE = new Color(null,
			255, 0, 0);

	/**
	 * @generated
	 */
	static final Color FFIGUREMESSAGEBUFFERNAMELABEL_BACK = new Color(null, 0,
			255, 0);

	/**
	 * @generated
	 */
	static final Font FFIGUREMESSAGEBUFFERNAMELABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

}
