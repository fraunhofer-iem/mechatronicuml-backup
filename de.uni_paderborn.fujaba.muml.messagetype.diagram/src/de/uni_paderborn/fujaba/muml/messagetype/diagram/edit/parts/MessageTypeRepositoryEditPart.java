package de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts;

import java.util.Collection;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
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
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class MessageTypeRepositoryEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2008;

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
	public MessageTypeRepositoryEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(
				EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.policies.MessageTypeRepositoryItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);

		installEditPolicy(
				EditPolicy.GRAPHICAL_NODE_ROLE,
				new de.uni_paderborn.fujaba.muml.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy());

		installEditPolicy(
				de.uni_paderborn.fujaba.muml.common.edit.policies.EditPolicyRoles.ERROR_FEEDBACK_ROLE,
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
		return primaryShape = new MessageInterfaceFigure();
	}

	/**
	 * @generated
	 */
	public MessageInterfaceFigure getPrimaryShape() {
		return (MessageInterfaceFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryNameEditPart) {
			((de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMessageInterfaceNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryMessageTypesCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureMessageTypesCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryMessageTypesCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryNameEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryMessageTypesCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureMessageTypesCompartmentFigure();
			pane.remove(((de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryMessageTypesCompartmentEditPart) childEditPart)
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
		if (editPart instanceof de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryMessageTypesCompartmentEditPart) {
			return getPrimaryShape().getFigureMessageTypesCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(130, 90);

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
		return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryNameEditPart.VISUAL_ID));
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
			if (type == de.uni_paderborn.fujaba.muml.messagetype.diagram.providers.MumlElementTypes.MessageType_3007) {
				return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryMessageTypesCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class MessageInterfaceFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMessageInterfaceNameLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureMessageTypesCompartmentFigure;

		/**
		 * @generated
		 */
		public MessageInterfaceFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = false;
			layoutThis.marginWidth = 1;
			layoutThis.marginHeight = 0;
			this.setLayoutManager(layoutThis);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureMessageInterfaceNameLabelFigure = new WrappingLabel();

			fFigureMessageInterfaceNameLabelFigure.setText("");

			fFigureMessageInterfaceNameLabelFigure
					.setFont(FFIGUREMESSAGEINTERFACENAMELABELFIGURE_FONT);

			GridData constraintFFigureMessageInterfaceNameLabelFigure = new GridData();
			constraintFFigureMessageInterfaceNameLabelFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureMessageInterfaceNameLabelFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureMessageInterfaceNameLabelFigure.horizontalIndent = 0;
			constraintFFigureMessageInterfaceNameLabelFigure.horizontalSpan = 1;
			constraintFFigureMessageInterfaceNameLabelFigure.verticalSpan = 1;
			constraintFFigureMessageInterfaceNameLabelFigure.grabExcessHorizontalSpace = true;
			constraintFFigureMessageInterfaceNameLabelFigure.grabExcessVerticalSpace = false;
			this.add(fFigureMessageInterfaceNameLabelFigure,
					constraintFFigureMessageInterfaceNameLabelFigure);

			fFigureMessageTypesCompartmentFigure = new RectangleFigure();

			fFigureMessageTypesCompartmentFigure.setOutline(false);

			GridData constraintFFigureMessageTypesCompartmentFigure = new GridData();
			constraintFFigureMessageTypesCompartmentFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureMessageTypesCompartmentFigure.horizontalAlignment = GridData.FILL;
			constraintFFigureMessageTypesCompartmentFigure.horizontalIndent = 0;
			constraintFFigureMessageTypesCompartmentFigure.horizontalSpan = 1;
			constraintFFigureMessageTypesCompartmentFigure.verticalSpan = 1;
			constraintFFigureMessageTypesCompartmentFigure.grabExcessHorizontalSpace = true;
			constraintFFigureMessageTypesCompartmentFigure.grabExcessVerticalSpace = false;
			this.add(fFigureMessageTypesCompartmentFigure,
					constraintFFigureMessageTypesCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMessageInterfaceNameLabelFigure() {
			return fFigureMessageInterfaceNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureMessageTypesCompartmentFigure() {
			return fFigureMessageTypesCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREMESSAGEINTERFACENAMELABELFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 10, SWT.BOLD);

}
