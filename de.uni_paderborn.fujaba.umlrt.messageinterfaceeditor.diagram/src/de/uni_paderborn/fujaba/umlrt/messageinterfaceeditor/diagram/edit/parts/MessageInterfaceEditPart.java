package de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts;

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
public class MessageInterfaceEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

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
	public MessageInterfaceEditPart(View view) {
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
				new de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.policies.MessageInterfaceItemSemanticEditPolicy());
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
		if (childEditPart instanceof de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceNameEditPart) {
			((de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMessageInterfaceNameLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceMessageTypeCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureMessageInterfaceCompartmentMessageType();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceMessageTypeCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceNameEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceMessageTypeCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureMessageInterfaceCompartmentMessageType();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceMessageTypeCompartmentEditPart) childEditPart)
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
		if (editPart instanceof de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceMessageTypeCompartmentEditPart) {
			return getPrimaryShape()
					.getFigureMessageInterfaceCompartmentMessageType();
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
		return getChildBySemanticHint(de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.providers.UmlrtElementTypes.MessageInterfaceSuperType_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceEditPart) {
			types.add(de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.providers.UmlrtElementTypes.MessageInterfaceSuperType_4003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.providers.UmlrtElementTypes.MessageInterfaceSuperType_4003) {
			types.add(de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.providers.UmlrtElementTypes.MessageInterface_2002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.providers.UmlrtElementTypes.MessageInterfaceSuperType_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.providers.UmlrtElementTypes.MessageInterfaceSuperType_4003) {
			types.add(de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.providers.UmlrtElementTypes.MessageInterface_2002);
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
			if (type == de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.providers.UmlrtElementTypes.MessageType_3002) {
				return getChildBySemanticHint(de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceMessageTypeCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class MessageInterfaceFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMessageInterfaceNameLabel;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureMessageInterfaceCompartmentMessageType;

		/**
		 * @generated
		 */
		public MessageInterfaceFigure() {

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

			fFigureMessageInterfaceNameLabel = new WrappingLabel();
			fFigureMessageInterfaceNameLabel.setText("");

			fFigureMessageInterfaceNameLabel
					.setFont(FFIGUREMESSAGEINTERFACENAMELABEL_FONT);

			GridData constraintFFigureMessageInterfaceNameLabel = new GridData();
			constraintFFigureMessageInterfaceNameLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureMessageInterfaceNameLabel.horizontalAlignment = GridData.CENTER;
			constraintFFigureMessageInterfaceNameLabel.horizontalIndent = 0;
			constraintFFigureMessageInterfaceNameLabel.horizontalSpan = 1;
			constraintFFigureMessageInterfaceNameLabel.verticalSpan = 1;
			constraintFFigureMessageInterfaceNameLabel.grabExcessHorizontalSpace = true;
			constraintFFigureMessageInterfaceNameLabel.grabExcessVerticalSpace = false;
			this.add(fFigureMessageInterfaceNameLabel,
					constraintFFigureMessageInterfaceNameLabel);

			fFigureMessageInterfaceCompartmentMessageType = new RectangleFigure();
			fFigureMessageInterfaceCompartmentMessageType.setOutline(false);

			GridData constraintFFigureMessageInterfaceCompartmentMessageType = new GridData();
			constraintFFigureMessageInterfaceCompartmentMessageType.verticalAlignment = GridData.CENTER;
			constraintFFigureMessageInterfaceCompartmentMessageType.horizontalAlignment = GridData.FILL;
			constraintFFigureMessageInterfaceCompartmentMessageType.horizontalIndent = 0;
			constraintFFigureMessageInterfaceCompartmentMessageType.horizontalSpan = 1;
			constraintFFigureMessageInterfaceCompartmentMessageType.verticalSpan = 1;
			constraintFFigureMessageInterfaceCompartmentMessageType.grabExcessHorizontalSpace = true;
			constraintFFigureMessageInterfaceCompartmentMessageType.grabExcessVerticalSpace = false;
			this.add(fFigureMessageInterfaceCompartmentMessageType,
					constraintFFigureMessageInterfaceCompartmentMessageType);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMessageInterfaceNameLabel() {
			return fFigureMessageInterfaceNameLabel;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureMessageInterfaceCompartmentMessageType() {
			return fFigureMessageInterfaceCompartmentMessageType;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREMESSAGEINTERFACENAMELABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 10, SWT.BOLD);

}
