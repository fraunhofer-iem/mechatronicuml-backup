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
public class MumlEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
					.getVisualID(view)) {

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ModelElementCategoryEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryEventEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryEventEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.DoEventEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.DoEventEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel3EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitEventEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitEventEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel4EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ClockConstraintEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel5EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.SynchronizationChannelEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel6EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionPriorityEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionPriorityEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel7EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.State2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.State2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateName2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateName2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEntryPointEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEntryPointEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateExitPointEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateExitPointEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateCompoundCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateCompoundCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionRegionContentsCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionRegionContentsCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateCompoundCompartment2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateCompoundCompartment2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartment2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateRegionCompartment2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel8EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel9EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.Transition2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.Transition2EditPart(
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
