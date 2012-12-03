package de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts;

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
public class MumlEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MumlVisualIDRegistry
					.getVisualID(view)) {

			case de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceDiagramEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceDiagramEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageTypeRepositoryEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageTypeRepositoryEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageTypeRepositoryNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageTypeRepositoryNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageTypeEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageTypeNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageTypeNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.ParameterEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.WrappingLabelEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageTypeRepositoryMessageTypesCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageTypeRepositoryMessageTypesCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageTypeParametersCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageTypeParametersCompartmentEditPart(
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
