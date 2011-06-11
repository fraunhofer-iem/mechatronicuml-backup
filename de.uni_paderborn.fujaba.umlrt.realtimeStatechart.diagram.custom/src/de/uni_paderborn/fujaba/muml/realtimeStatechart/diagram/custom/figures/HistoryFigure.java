package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.figures;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

public class HistoryFigure extends Ellipse {
	/**
	 * @generated
	 */
	public HistoryFigure() {

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

		WrappingLabel historyLabel0 = new WrappingLabel();
		historyLabel0.setText("H*");

		GridData constraintHistoryLabel0 = new GridData();
		constraintHistoryLabel0.verticalAlignment = GridData.CENTER;
		constraintHistoryLabel0.horizontalAlignment = GridData.CENTER;
		constraintHistoryLabel0.horizontalIndent = 0;
		constraintHistoryLabel0.horizontalSpan = 1;
		constraintHistoryLabel0.verticalSpan = 1;
		constraintHistoryLabel0.grabExcessHorizontalSpace = true;
		constraintHistoryLabel0.grabExcessVerticalSpace = true;
		this.add(historyLabel0, constraintHistoryLabel0);

	}

}
