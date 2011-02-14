package patterneditor.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.workspace.AbstractEMFOperation;
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
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import patterneditor.diagram.edit.policies.CoordinationPatternItemSemanticEditPolicy;
import patterneditor.diagram.part.PatternDiagramEditorPlugin;
import patterneditor.diagram.part.PatternVisualIDRegistry;
import patterneditor.diagram.providers.PatternElementTypes;

/**
 * @generated
 */
public class CoordinationPatternEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

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
	public CoordinationPatternEditPart(View view) {
		super(view);
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public void activate() {
		super.activate();
		
		AbstractEMFOperation emfOp = new AbstractEMFOperation(getEditingDomain(), "Location setting") {

			@Override
			protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				Location lc = (Location) ((Node) getModel()).getLayoutConstraint();
				lc.setX(100);
				lc.setY(50);
				
				return Status.OK_STATUS;
			}

		};

		IStatus status;

		try {
			status = OperationHistoryFactory.getOperationHistory().execute(emfOp, null, null);
		} catch (ExecutionException e) {
			status = new Status(IStatus.ERROR, PatternDiagramEditorPlugin.ID, "Setting location failed", e);
		}

		if (status.getCode() == IStatus.WARNING || status.getCode() == IStatus.ERROR) {
			PatternDiagramEditorPlugin.getInstance().getLog().log(status);
		}
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CoordinationPatternItemSemanticEditPolicy());
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
		return primaryShape = new CoordinationPatternFigure();
	}

	/**
	 * @generated
	 */
	public CoordinationPatternFigure getPrimaryShape() {
		return (CoordinationPatternFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CoordinationPatternNameEditPart) {
			((CoordinationPatternNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureCoordinationPatternNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CoordinationPatternNameEditPart) {
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
	 * Customized the CoordinationPattern NodeFigure to have an EllipseAnchor.
	 * 
	 * @generated NOT
	 * 
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40) {
			@Override
			public ConnectionAnchor createDefaultAnchor() {
				return new EllipseAnchor(this);
			}
		};
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
		return getChildBySemanticHint(PatternVisualIDRegistry
				.getType(CoordinationPatternNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PatternElementTypes.ConstrainableElementConstraint_4003);
		types.add(PatternElementTypes.ConstrainableElementConstraint_4004);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof TextualConstraintEditPart) {
			types.add(PatternElementTypes.ConstrainableElementConstraint_4003);
		}
		if (targetEditPart instanceof TextualConstraintEditPart) {
			types.add(PatternElementTypes.ConstrainableElementConstraint_4004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == PatternElementTypes.ConstrainableElementConstraint_4003) {
			types.add(PatternElementTypes.TextualConstraint_2003);
		} else if (relationshipType == PatternElementTypes.ConstrainableElementConstraint_4004) {
			types.add(PatternElementTypes.TextualConstraint_2003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(PatternElementTypes.RolePattern_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == PatternElementTypes.RolePattern_4002) {
			types.add(PatternElementTypes.Role_2002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class CoordinationPatternFigure extends Ellipse {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureCoordinationPatternNameFigure;

		/**
		 * @generated
		 */
		public CoordinationPatternFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setLineStyle(Graphics.LINE_DASH);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureCoordinationPatternNameFigure = new WrappingLabel();
			fFigureCoordinationPatternNameFigure.setText("");

			GridData constraintFFigureCoordinationPatternNameFigure = new GridData();
			constraintFFigureCoordinationPatternNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureCoordinationPatternNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureCoordinationPatternNameFigure.horizontalIndent = 0;
			constraintFFigureCoordinationPatternNameFigure.horizontalSpan = 1;
			constraintFFigureCoordinationPatternNameFigure.verticalSpan = 1;
			constraintFFigureCoordinationPatternNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureCoordinationPatternNameFigure.grabExcessVerticalSpace = true;
			this.add(fFigureCoordinationPatternNameFigure,
					constraintFFigureCoordinationPatternNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCoordinationPatternNameFigure() {
			return fFigureCoordinationPatternNameFigure;
		}

	}

}
