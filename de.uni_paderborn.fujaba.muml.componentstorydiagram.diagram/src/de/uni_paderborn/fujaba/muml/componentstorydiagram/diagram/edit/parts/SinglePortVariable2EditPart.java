package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
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
import org.eclipse.gmf.runtime.diagram.ui.editparts.BorderedBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class SinglePortVariable2EditPart extends BorderedBorderItemEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3018;

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
	public SinglePortVariable2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				getPrimaryDragEditPolicy());
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.policies.SinglePortVariable2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(
				de.uni_paderborn.fujaba.muml.common.edit.policies.EditPolicyRoles.PORT_VISUALIZATION_ROLE,
				new de.uni_paderborn.fujaba.muml.reconfiguration.common.edit.policies.PortVariableEditPolicy());
		installEditPolicy(
				de.uni_paderborn.fujaba.muml.common.edit.policies.EditPolicyRoles.COMPONENTSTORYPATTERNVARIABLE_VISUALIZATION_ROLE,
				new de.uni_paderborn.fujaba.muml.reconfiguration.common.edit.policies.ComponentStoryPatternVariableEditPolicy());
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
				View childView = (View) child.getModel();
				switch (de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry
						.getVisualID(childView)) {
				case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.PortVariableOperator2EditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.SinglePortVariableNameEditPart.VISUAL_ID:
					return new de.uni_paderborn.fujaba.muml.common.edit.policies.BorderItemSelectionEditPolicy();
				}
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
		return primaryShape = new de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure();
	}

	/**
	 * @generated
	 */
	public de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure getPrimaryShape() {
		return (de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected void addBorderItem(IFigure borderItemContainer,
			IBorderItemEditPart borderItemEditPart) {
		if (borderItemEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.PortVariableOperator2EditPart
				|| borderItemEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.SinglePortVariableNameEditPart) {
			// bug-fix: allows the free positioning of external Labels
			de.uni_paderborn.fujaba.muml.common.figures.CustomExternalLabelBorderItemLocator locator = new de.uni_paderborn.fujaba.muml.common.figures.CustomExternalLabelBorderItemLocator(
					getMainFigure(), PositionConstants.SOUTH);
			locator.setBorderItemOffset(new Dimension(-20, -20));
			borderItemContainer.add(borderItemEditPart.getFigure(), locator);
		} else {
			super.addBorderItem(borderItemContainer, borderItemEditPart);
		}
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(30, 30);

		//FIXME: workaround for #154536
		result.getBounds().setSize(result.getPreferredSize());

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
		return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.PortVariableOperator2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4004);
		types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4005);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.MultiPortVariableEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4004);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.SinglePortVariableEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4004);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.SinglePortVariable2EditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4004);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.MultiPortVariable2EditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4004);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.SinglePortVariable3EditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4004);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.MultiPortVariableEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4005);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.SinglePortVariableEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4005);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.SinglePortVariable2EditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4005);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.MultiPortVariable2EditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4005);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.SinglePortVariable3EditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4004) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortVariable_3016);
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3017);
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3018);
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortVariable_3019);
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3020);
		} else if (relationshipType == de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4005) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortVariable_3016);
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3017);
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3018);
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortVariable_3019);
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3020);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4004);
		types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4005);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4004) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortVariable_3016);
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3017);
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3018);
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortVariable_3019);
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3020);
		} else if (relationshipType == de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4005) {
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortVariable_3016);
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3017);
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3018);
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortVariable_3019);
			types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3020);
		}
		return types;
	}

}
