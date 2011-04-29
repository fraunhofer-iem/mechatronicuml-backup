package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts;

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
public class RealtimeStatechartEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
					.getVisualID(view)) {

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateNameEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.InitialStateEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.InitialStateEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.FinalStateEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.FinalStateEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.HistoryStateEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.HistoryStateEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ClockEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ClockEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ClockNameIdEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ClockNameIdEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.Transition2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.Transition2EditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.EntryActionEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.EntryActionEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.EntryActionActionExprEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.EntryActionActionExprEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.DoActionEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.DoActionEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.DoActionActionExprEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.DoActionActionExprEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ExitActionEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ExitActionEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ExitActionActionExprEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ExitActionActionExprEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ClockConstraintEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ClockConstraintClockConstraintExprEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ClockConstraintClockConstraintExprEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.SynchronizationChannelEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.SynchronizationChannelSynchroChannelExprEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.SynchronizationChannelSynchroChannelExprEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RegionEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.AbsoluteDeadlineEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.AbsoluteDeadlineEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RelativeDeadlineEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RelativeDeadlineEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ClockConstraint2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ClockConstraint2EditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.AsynchronousEventEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.AsynchronousEventEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.AsynchronousEvent2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.AsynchronousEvent2EditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ActionEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ActionEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.SynchronizationEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.SynchronizationEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.Synchronization2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.Synchronization2EditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateActionsCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateActionsCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateInvariantCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateInvariantCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateSynchroChannelsCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateSynchroChannelsCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateRegionCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateRegionCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionPriorityEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionPriorityEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionClockResetExprEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionClockResetExprEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionDeadlineExprEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionDeadlineExprEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEventExprEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEventExprEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionGuardExprEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionGuardExprEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSideEffectExprEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSideEffectExprEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionTimeGuardExprEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionTimeGuardExprEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSafetyTransitionEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSafetyTransitionEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSynchroExprEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSynchroExprEditPart(
						view);

			case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSynchroExpr2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSynchroExpr2EditPart(
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
