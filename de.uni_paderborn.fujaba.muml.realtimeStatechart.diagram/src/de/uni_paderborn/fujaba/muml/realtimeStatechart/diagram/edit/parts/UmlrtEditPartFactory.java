package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts;

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
public class UmlrtEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
					.getVisualID(view)) {

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.FujabaRealtimeStatechartEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.FujabaRealtimeStatechartEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.InitialStateEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.InitialStateEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ClockNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ClockNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EEActionEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EEActionEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.SynchroChannel2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.SynchroChannel2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.DoActionEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.DoActionEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.SynchroChannelEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.SynchroChannelEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabelEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EEAction2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EEAction2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TimeInvariantEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TimeInvariantEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateActionsCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateActionsCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateInvariantCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateInvariantCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionPriorityEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionPriorityEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel3EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel4EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel5EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel6EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel7EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel8EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel9EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel10EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel11EditPart(
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
