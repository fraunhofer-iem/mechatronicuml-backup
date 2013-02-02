package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

/**
 * @generated
 */
public class ComponentStoryDiagramEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getVisualID(view)) {

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryRuleEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryRuleEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ActivityEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ActivityEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ActivityNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ActivityNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryPatternEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryPatternEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentVariableEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentVariableEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentVariableOperatorEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentVariableOperatorEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentVariableNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentVariableNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.PartVariableEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.PartVariableEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabelEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabel2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.MultiPortVariableEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.MultiPortVariableEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.PortVariableOperatorEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.PortVariableOperatorEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.MultiPortVariableNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.MultiPortVariableNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.SinglePortVariableEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.SinglePortVariableEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.SinglePortVariable2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.SinglePortVariable2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.PortVariableOperator2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.PortVariableOperator2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.SinglePortVariableNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.SinglePortVariableNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.MultiPortVariable2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.MultiPortVariable2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.PortVariableOperator3EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.PortVariableOperator3EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.MultiPortVariableName2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.MultiPortVariableName2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.SinglePortVariable3EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.SinglePortVariable3EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.PortVariableOperator4EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.PortVariableOperator4EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.SinglePortVariableName2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.SinglePortVariableName2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.InitialNodeEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.JunctionNodeEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.JunctionNodeEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ActivityFinalNodeEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ActivityFinalNodeEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabel4EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryPattern2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryPattern2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.FadingFunctionEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.FadingFunctionEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabel3EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ActivityActivityCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ActivityActivityCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeComponentStoryNodeCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeComponentStoryNodeCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentVariableComponentVariableCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentVariableComponentVariableCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartment2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartment2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeControllerExchangeNodeFadingFunctionsCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeControllerExchangeNodeFadingFunctionsCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeControllerExchangeNodeCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeControllerExchangeNodeCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartment2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartment2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ActivityEdgeEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ActivityEdgeGuardEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ActivityEdgeGuardEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.AssemblyVariableEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.AssemblyVariableEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.AssemblyVariableNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.AssemblyVariableNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.DelegationVariableEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.DelegationVariableEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.DelegationVariableNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.DelegationVariableNameEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				if (getWrapLabel().isTextWrapOn()
						&& getWrapLabel().getText().length() > 0) {
					rect.setSize(new Dimension(text.computeSize(rect.width,
							SWT.DEFAULT)));
				} else {
					int avr = FigureUtilities.getFontMetrics(text.getFont())
							.getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
							SWT.DEFAULT)).expand(avr * 2, 0));
				}
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
