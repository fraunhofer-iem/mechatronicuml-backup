package org.muml.storydiagram.diagram.custom.properties.sections;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.jface.window.Window;
import org.muml.storydiagram.activities.ActivitiesPackage;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.activities.ActivityCallNode;
import org.muml.storydiagram.calls.Callable;
import org.muml.storydiagram.calls.CallsPackage;
import org.muml.storydiagram.diagram.custom.ResourceManager;
import org.muml.storydiagram.diagram.custom.dialogs.SelectActivityDialog;
import org.muml.storydiagram.diagram.custom.util.ActivityUtil;
import org.muml.storydiagram.diagram.custom.util.TextUtil;

import de.upb.swt.core.ui.properties.sections.AbstractComboSection;

public class ActivityCallNodeCalleeSection extends AbstractComboSection<Callable> {
	private SelectActivityDialog dialog;

	public ActivityCallNodeCalleeSection() {
		dialog = new SelectActivityDialog();
	}

	@Override
	protected List<Callable> getItems() {
		List<Callable> items = new ArrayList<Callable>();
		items.add(null);

		Activity activity = ActivityUtil.getActivity(getElement());
		items.addAll(ResourceManager.get(activity).getActivities());

		return items;
	}

	@Override
	protected void handleButtonClicked() {
		// prepare dialog
		dialog.setActivityCallNode(getElement());

		if (dialog.open() == Window.OK) {
			final Activity call = dialog.getElement();
			if (call != null) {
				ActivityCallNode owner = getElement();
				EStructuralFeature feature = getFeature();

				Command command = SetCommand.create(getEditingDomain(), owner, feature, call);

				feature = ActivitiesPackage.Literals.ACTIVITY_CALL_NODE__CALLED_ACTIVITIES;
				command.chain(RemoveCommand.create(getEditingDomain(), owner, feature, owner.getCalledActivities()));
				command.chain(AddCommand.create(getEditingDomain(), owner, feature, call));

				refresh();
			}
		}
	}

	@Override
	protected ActivityCallNode getElement() {
		return (ActivityCallNode) super.getElement();
	}

	@Override
	protected String getText(Callable element) {
		return TextUtil.getText(element);
	}

	@Override
	protected boolean shouldShowButton() {
		return true;
	}

	@Override
	protected EStructuralFeature getFeature() {
		return CallsPackage.Literals.INVOCATION__CALLEE;
	}

	@Override
	protected String getLabelText() {
		return "Callee";
	}
}
