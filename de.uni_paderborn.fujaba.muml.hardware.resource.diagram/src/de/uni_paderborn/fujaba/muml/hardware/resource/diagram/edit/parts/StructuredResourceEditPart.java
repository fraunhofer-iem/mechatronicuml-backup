package de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts;

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
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class StructuredResourceEditPart extends AbstractBorderedShapeEditPart {

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
	public StructuredResourceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(
				EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.policies.StructuredResourceItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.policies.StructuredResourceCanonicalEditPolicy());
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
				View childView = (View) child.getModel();
				switch (de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareVisualIDRegistry
						.getVisualID(childView)) {
				case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationResourceEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy();
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
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.StructuredResourceNameEditPart) {
			((de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.StructuredResourceNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureStructuredResourceNameFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel3EditPart) {
			((de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel3EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureStructuredResourceKindFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel4EditPart) {
			((de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel4EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureStructuredResourceCardinalityFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.StructuredResourceStructuredResourceCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureEmbeddedAtomicResources();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.StructuredResourceStructuredResourceCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationResourceEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.EAST);
			getBorderedFigure()
					.getBorderItemContainer()
					.add(((de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationResourceEditPart) childEditPart)
							.getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.StructuredResourceNameEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel3EditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel4EditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.StructuredResourceStructuredResourceCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureEmbeddedAtomicResources();
			pane.remove(((de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.StructuredResourceStructuredResourceCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationResourceEditPart) {
			getBorderedFigure()
					.getBorderItemContainer()
					.remove(((de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationResourceEditPart) childEditPart)
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
		if (editPart instanceof de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.StructuredResourceStructuredResourceCompartmentEditPart) {
			return getPrimaryShape().getFigureEmbeddedAtomicResources();
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
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(130, 47);

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
		return getChildBySemanticHint(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.StructuredResourceNameEditPart.VISUAL_ID));
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
		private de.uni_paderborn.fujaba.muml.hardware.common.figures.CustomIconFigure fFigureCustomStructuredIconFigure;

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

			structuredContainer0.setOutline(false);
			structuredContainer0.setBorder(new MarginBorder(getMapMode()
					.DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));

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

			structuredName1.setOutline(false);

			GridData constraintStructuredName1 = new GridData();
			constraintStructuredName1.verticalAlignment = GridData.FILL;
			constraintStructuredName1.horizontalAlignment = GridData.FILL;
			constraintStructuredName1.horizontalIndent = 0;
			constraintStructuredName1.horizontalSpan = 1;
			constraintStructuredName1.verticalSpan = 1;
			constraintStructuredName1.grabExcessHorizontalSpace = true;
			constraintStructuredName1.grabExcessVerticalSpace = true;
			structuredContainer0
					.add(structuredName1, constraintStructuredName1);

			GridLayout layoutStructuredName1 = new GridLayout();
			layoutStructuredName1.numColumns = 3;
			layoutStructuredName1.makeColumnsEqualWidth = false;
			structuredName1.setLayoutManager(layoutStructuredName1);

			fFigureStructuredResourceNameFigure = new WrappingLabel();

			fFigureStructuredResourceNameFigure.setText("<...>");

			fFigureStructuredResourceNameFigure
					.setFont(FFIGURESTRUCTUREDRESOURCENAMEFIGURE_FONT);

			GridData constraintFFigureStructuredResourceNameFigure = new GridData();
			constraintFFigureStructuredResourceNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureStructuredResourceNameFigure.horizontalAlignment = GridData.END;
			constraintFFigureStructuredResourceNameFigure.horizontalIndent = 0;
			constraintFFigureStructuredResourceNameFigure.horizontalSpan = 1;
			constraintFFigureStructuredResourceNameFigure.verticalSpan = 1;
			constraintFFigureStructuredResourceNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureStructuredResourceNameFigure.grabExcessVerticalSpace = true;
			structuredName1.add(fFigureStructuredResourceNameFigure,
					constraintFFigureStructuredResourceNameFigure);

			fFigureStructuredResourceKindFigure = new WrappingLabel();

			fFigureStructuredResourceKindFigure.setText("<...>");

			fFigureStructuredResourceKindFigure
					.setFont(FFIGURESTRUCTUREDRESOURCEKINDFIGURE_FONT);

			GridData constraintFFigureStructuredResourceKindFigure = new GridData();
			constraintFFigureStructuredResourceKindFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureStructuredResourceKindFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureStructuredResourceKindFigure.horizontalIndent = 0;
			constraintFFigureStructuredResourceKindFigure.horizontalSpan = 1;
			constraintFFigureStructuredResourceKindFigure.verticalSpan = 1;
			constraintFFigureStructuredResourceKindFigure.grabExcessHorizontalSpace = true;
			constraintFFigureStructuredResourceKindFigure.grabExcessVerticalSpace = true;
			structuredName1.add(fFigureStructuredResourceKindFigure,
					constraintFFigureStructuredResourceKindFigure);

			fFigureStructuredResourceCardinalityFigure = new WrappingLabel();

			fFigureStructuredResourceCardinalityFigure.setText("<...>");

			fFigureStructuredResourceCardinalityFigure
					.setFont(FFIGURESTRUCTUREDRESOURCECARDINALITYFIGURE_FONT);

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

			fFigureCustomStructuredIconFigure = new de.uni_paderborn.fujaba.muml.hardware.common.figures.CustomIconFigure();

			GridData constraintFFigureCustomStructuredIconFigure = new GridData();
			constraintFFigureCustomStructuredIconFigure.verticalAlignment = GridData.FILL;
			constraintFFigureCustomStructuredIconFigure.horizontalAlignment = GridData.FILL;
			constraintFFigureCustomStructuredIconFigure.horizontalIndent = 0;
			constraintFFigureCustomStructuredIconFigure.horizontalSpan = 1;
			constraintFFigureCustomStructuredIconFigure.verticalSpan = 1;
			constraintFFigureCustomStructuredIconFigure.grabExcessHorizontalSpace = true;
			constraintFFigureCustomStructuredIconFigure.grabExcessVerticalSpace = true;
			structuredContainer0.add(fFigureCustomStructuredIconFigure,
					constraintFFigureCustomStructuredIconFigure);

			fFigureEmbeddedAtomicResources = new RectangleFigure();

			GridData constraintFFigureEmbeddedAtomicResources = new GridData();
			constraintFFigureEmbeddedAtomicResources.verticalAlignment = GridData.FILL;
			constraintFFigureEmbeddedAtomicResources.horizontalAlignment = GridData.FILL;
			constraintFFigureEmbeddedAtomicResources.horizontalIndent = 0;
			constraintFFigureEmbeddedAtomicResources.horizontalSpan = 1;
			constraintFFigureEmbeddedAtomicResources.verticalSpan = 1;
			constraintFFigureEmbeddedAtomicResources.grabExcessHorizontalSpace = true;
			constraintFFigureEmbeddedAtomicResources.grabExcessVerticalSpace = true;
			this.add(fFigureEmbeddedAtomicResources,
					constraintFFigureEmbeddedAtomicResources);

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
		public de.uni_paderborn.fujaba.muml.hardware.common.figures.CustomIconFigure getFigureCustomStructuredIconFigure() {
			return fFigureCustomStructuredIconFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGURESTRUCTUREDRESOURCENAMEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font FFIGURESTRUCTUREDRESOURCEKINDFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font FFIGURESTRUCTUREDRESOURCECARDINALITYFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

}
