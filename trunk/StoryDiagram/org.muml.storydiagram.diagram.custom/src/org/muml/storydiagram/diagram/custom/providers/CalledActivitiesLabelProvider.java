package org.muml.storydiagram.diagram.custom.providers;

import org.eclipse.swt.graphics.Image;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.activities.ActivityCallNode;
import org.muml.storydiagram.diagram.custom.util.TextUtil;

import de.upb.swt.core.ui.providers.ComposedAdapterFactoryLabelProvider;

public class CalledActivitiesLabelProvider extends ComposedAdapterFactoryLabelProvider {
	private ActivityCallNode node;

	@Override
	public String getText(Object element) {
		if (element instanceof Activity) {
			return TextUtil.getText((Activity) element);
		}
		return super.getText(element);
	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof Activity) {
			if (node != null && element.equals(node.getCallee())) {
				return super.getImage(node);
			}
		}
		return super.getImage(element);
	}

	public void setActivityCallNode(ActivityCallNode node) {
		this.node = node;
	}
}
