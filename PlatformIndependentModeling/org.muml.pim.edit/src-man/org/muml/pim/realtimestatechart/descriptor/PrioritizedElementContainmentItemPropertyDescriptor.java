package org.muml.pim.realtimestatechart.descriptor;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.muml.pim.realtimestatechart.PrioritizedElement;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;

public class PrioritizedElementContainmentItemPropertyDescriptor extends
		ItemPropertyDescriptor {
	public PrioritizedElementContainmentItemPropertyDescriptor(
			AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, boolean multiLine, boolean sortChoices,
			Object staticImage, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
	}

	@Override
	public void setPropertyValue(Object object, Object value) {
		// Cast new value as collection, as this is a many-feature
		Collection<?> newValues = ((Collection<?>) value);

		// Collect all existing priorities in an array
		int i = 0;
		int[] priorities = new int[newValues.size()];
		for (Object prioritizedElement : newValues) {
			priorities[i] = ((PrioritizedElement) prioritizedElement).getPriority();
			i++;
		}

		// Sort the array in ascending order
		java.util.Arrays.sort(priorities);

		// Apply the sorted priority
		i = 0;
		EditingDomain editingDomain = getEditingDomain(object);
		for (Object prioritizedElement : newValues) {
			Command setCommand = SetCommand
					.create(editingDomain,
							getCommandOwner(prioritizedElement),
							RealtimestatechartPackage.Literals.PRIORITIZED_ELEMENT__PRIORITY,
							priorities[i]);
			editingDomain.getCommandStack().execute(setCommand);
			i++;
		}

		// not okay, as it removes all diagram information!
		// super.setPropertyValue(object, new ArrayList<Object>());

		// Set the new elements
		super.setPropertyValue(object, value);

	}
}