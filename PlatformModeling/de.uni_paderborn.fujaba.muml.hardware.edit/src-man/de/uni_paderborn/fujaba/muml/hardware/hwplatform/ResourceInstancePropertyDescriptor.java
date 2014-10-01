package de.uni_paderborn.fujaba.muml.hardware.hwplatform;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.DeviceInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StructuredResourceInstance;

public class ResourceInstancePropertyDescriptor  extends ItemPropertyDescriptor{
	public ResourceInstancePropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
	}
	
	@Override
	public Collection<?> getChoiceOfValues(Object object) {
		List<ResourceInstance> resourcInstances = new ArrayList<ResourceInstance>();
		for (Object value : super.getChoiceOfValues(object)) {
			if (value instanceof StructuredResourceInstance || value instanceof DeviceInstance) {
				resourcInstances.add((ResourceInstance) value);
			}
		}
		return resourcInstances;
	}
}
