package org.muml.storydiagram.diagram.custom.edit.parts;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.storydiagram.diagram.edit.parts.ObjectVariableEditPart;
import org.muml.storydiagram.patterns.BindingSemantics;
import org.muml.storydiagram.patterns.ObjectVariable;

public class CustomObjectVariableEditPart extends ObjectVariableEditPart {
	public CustomObjectVariableEditPart(View view) {
		super(view);
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		updateMainFigure();
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		if (notification.getNotifier() instanceof ObjectVariable) {
			updateMainFigure();
		}

		super.handleNotificationEvent(notification);
	}

	private void updateMainFigure() {
		ObjectVariable ov = (ObjectVariable) ((View) getModel()).getElement();

		int style = Graphics.LINE_SOLID;
		if (BindingSemantics.OPTIONAL.equals(ov.getBindingSemantics())) {
			style = Graphics.LINE_DASH;
		}

		Collection<RectangleFigure> figures = new HashSet<RectangleFigure>();
		collect(figures, getPrimaryShape());
		for (RectangleFigure figure : figures) {
			figure.setLineStyle(style);
		}
	}

	private static void collect(Collection<RectangleFigure> figures, RectangleFigure figure) {
		figures.add(figure);

		for (Object child : figure.getChildren()) {
			if (child instanceof RectangleFigure) {
				collect(figures, (RectangleFigure) child);
			}
		}
	}
}
