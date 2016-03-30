package org.muml.pim.common.figures;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

public class TransitionPriorityDecoration extends Ellipse implements RotatableDecoration {

	static final Font PRIORITY_LABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 8, SWT.NORMAL);
	
	private WrappingLabel priorityLabel;
	
	public TransitionPriorityDecoration() {
		this.setLayoutManager(new StackLayout());
		priorityLabel = new WrappingLabel("0");
		priorityLabel.setBorder(new MarginBorder(2, 5, 2, 5));
		priorityLabel.setFont(PRIORITY_LABEL_FONT);
		this.add(priorityLabel);
	}

	@Override
	public void setBounds(Rectangle rect) {
		Point location = rect.getLocation();
		location.translate(rect.getSize().getScaled(1.0f / 2.0f).negate());
		rect.setLocation(location);
		super.setBounds(rect);
	}

	@Override
	public void setReferencePoint(Point p) {
		// We do not rotate the figure.
	}

	public void setPriority(int priority) {
		priorityLabel.setText(Integer.toString(priority));
	}

}
