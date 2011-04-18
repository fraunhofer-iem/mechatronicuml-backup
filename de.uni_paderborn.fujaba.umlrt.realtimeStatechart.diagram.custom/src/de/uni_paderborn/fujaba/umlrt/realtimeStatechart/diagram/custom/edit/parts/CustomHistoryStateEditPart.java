package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.HistoryStateEditPart;

/**
 * A customized PortEditPart. It is responsible for ports around
 * StructuredComponents and ComponentParts.
 * 
 * @author bingo
 * 
 */
public class CustomHistoryStateEditPart extends HistoryStateEditPart {

	/**
	 * Constructs this EditPart.
	 * 
	 * @param view
	 *            The graphical model.
	 */
	public CustomHistoryStateEditPart(View view) {
		super(view);

	}

	/**
	 * Creates the custom figure.
	 */
	@Override
	protected IFigure createNodeShape() {

		return primaryShape = new ShallowHistoryFigure();
	}
	
	public class ShallowHistoryFigure extends Ellipse {

		public ShallowHistoryFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setLineWidth(3);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			WrappingLabel shallowHistoryLabel0 = new WrappingLabel();
			shallowHistoryLabel0.setText("H");

			GridData constraintShallowHistoryLabel0 = new GridData();
			constraintShallowHistoryLabel0.verticalAlignment = GridData.CENTER;
			constraintShallowHistoryLabel0.horizontalAlignment = GridData.CENTER;
			constraintShallowHistoryLabel0.horizontalIndent = 0;
			constraintShallowHistoryLabel0.horizontalSpan = 1;
			constraintShallowHistoryLabel0.verticalSpan = 1;
			constraintShallowHistoryLabel0.grabExcessHorizontalSpace = true;
			constraintShallowHistoryLabel0.grabExcessVerticalSpace = true;
			this.add(shallowHistoryLabel0, constraintShallowHistoryLabel0);

		}

	}
}
