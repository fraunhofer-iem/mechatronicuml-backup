package org.muml.storydiagram.diagram.custom.dialogs;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.diagram.custom.DiagramImages;
import org.muml.storydiagram.diagram.custom.providers.ResourcesContentProvider;
import org.muml.storydiagram.diagram.custom.providers.ResourcesLabelProvider;

public class SelectEClassDialog extends AbstractTreeSelectionDialog<EClass> {
	private Activity activity;

	public SelectEClassDialog() {
		super("Object Classifier", "Select EClass", "Select the EClass for the object variable.");
		setTitleImage(DiagramImages.getImage(DiagramImages.BANNER_SELECT_ECLASS));
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	@Override
	protected String getErrorMessage(Object element) {
		if (element instanceof EClass) {
			return null;
		}
		return "You have to select an EClass!";
	}

	@Override
	protected ILabelProvider getLabelProvider() {
		return new ResourcesLabelProvider();
	}

	@Override
	protected ITreeContentProvider getContentProvider() {
		return new ResourcesContentProvider();
	}

	@Override
	protected Object getInput() {
		return activity;
	}
}
