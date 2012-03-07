package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.descriptors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.commands.instantiation.SetComponentTypeCommand;
import de.uni_paderborn.fujaba.muml.model.component.Component;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;

public class ComponentTypeItemPropertyDescriptor extends ItemPropertyDescriptor {

	public ComponentTypeItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
	}

	@Override
	public void setPropertyValue(Object object, Object value) {
		EditingDomain editingDomain = getEditingDomain(object);
		if (editingDomain != null) {
			editingDomain.getCommandStack().execute(
					new SetComponentTypeCommand((ComponentInstance) object,
							(Component) value));
		}
	}
}
