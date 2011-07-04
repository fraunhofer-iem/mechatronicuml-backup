package de.uni_paderborn.fujaba.muml.common.figures;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

public class TransitionPriorityDecoration extends Ellipse implements RotatableDecoration {

	WrappingLabel priorityLabel;
	
	public TransitionPriorityDecoration() {
		this.setLayoutManager(new StackLayout());
		priorityLabel = new WrappingLabel("0");
		priorityLabel.setBorder(new MarginBorder(4, 7, 4, 7));
		this.add(priorityLabel);
	}

	@Override
	public void setBounds(Rectangle rect) {
		rect.setLocation(rect.getLocation().translate(rect.getSize().getScaled(1.0f / 2.0f).negate()));
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
