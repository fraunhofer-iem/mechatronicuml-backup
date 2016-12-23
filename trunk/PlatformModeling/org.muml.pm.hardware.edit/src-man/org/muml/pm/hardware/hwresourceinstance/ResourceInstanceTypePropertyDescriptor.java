package org.muml.pm.hardware.hwresourceinstance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.muml.pm.hardware.hwresource.Device;
import org.muml.pm.hardware.hwresource.DeviceKind;
import org.muml.pm.hardware.hwresource.HwresourcePackage;
import org.muml.pm.hardware.hwresource.MemoryResource;
import org.muml.pm.hardware.hwresource.Resource;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;

public class ResourceInstanceTypePropertyDescriptor extends
		ItemPropertyDescriptor {
	/**
	 * This hashmap stores the valid resourceInstance->resourceType relation
	 */
	private static final Map<EClass, EClass> resourceInstanceValidResourceType;
	static {
		Map<EClass, EClass> aMap = new HashMap<EClass, EClass>();
		aMap.put(HwresourceinstancePackage.Literals.SENSOR_INSTANCE,
				HwresourcePackage.Literals.DEVICE);
		aMap.put(HwresourceinstancePackage.Literals.ACTUATOR_INSTANCE,
				HwresourcePackage.Literals.DEVICE);
		aMap.put(HwresourceinstancePackage.Literals.ATOMIC_RESOURCE_INSTANCE,
				HwresourcePackage.Literals.ATOMIC_RESOURCE);
		aMap.put(
				HwresourceinstancePackage.Literals.STRUCTURED_RESOURCE_INSTANCE,
				HwresourcePackage.Literals.STRUCTURED_RESOURCE);
		aMap.put(HwresourceinstancePackage.Literals.STORAGE_MEMORY_INSTANCE,
				HwresourcePackage.Literals.MEMORY_RESOURCE);
		aMap.put(HwresourceinstancePackage.Literals.PROCESSING_MEMORY_INSTANCE,
				HwresourcePackage.Literals.MEMORY_RESOURCE);
		aMap.put(HwresourceinstancePackage.Literals.CACHE_INSTANCE,
				HwresourcePackage.Literals.MEMORY_RESOURCE);
		aMap.put(HwresourceinstancePackage.Literals.PROCESSOR_INSTANCE,
				HwresourcePackage.Literals.PROCESSOR);
		aMap.put(
				HwresourceinstancePackage.Literals.PROGRAMMABLE_LOGIC_DEVICE_INSTANCE,
				HwresourcePackage.Literals.PROGRAMMABLE_LOGIC_DEVICE);
		resourceInstanceValidResourceType = Collections.unmodifiableMap(aMap);
	}

	public ResourceInstanceTypePropertyDescriptor(
			AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, boolean multiLine, boolean sortChoices,
			Object staticImage, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
	}
	/**
	 * This function decides if a given resource type is valid for a given resource instance
	 * 
	 * @param instance the ResourceInstance
	 * @param type the ResourceType
	 * @return
	 */
	private boolean isValidChoice(EObject instance, EObject type) {

		if (!resourceInstanceValidResourceType.get(instance.eClass())
				.isSuperTypeOf(type.eClass())) {
			return false;
		}
		// special case for ActuatorInstanceInstance
		if (HwresourceinstancePackage.Literals.ACTUATOR_INSTANCE
				.isSuperTypeOf(instance.eClass())) {
			return (((Device) type).getDeviceKind() == DeviceKind.ACTUATOR);
		}
		// special case for SensorInstanceInstance
		if (HwresourceinstancePackage.Literals.SENSOR_INSTANCE
				.isSuperTypeOf(instance.eClass())) {
			return (((Device) type).getDeviceKind() == DeviceKind.SENSOR);
		}
		// special case for StorageMemoryInstance
		if (HwresourceinstancePackage.Literals.PROCESSING_MEMORY_INSTANCE
				.isSuperTypeOf(instance.eClass())) {
			return (((MemoryResource) type).isIsVolatile());
		}

		// special case for ProcessingMemoryInstance
		if (HwresourceinstancePackage.Literals.STORAGE_MEMORY_INSTANCE
				.isSuperTypeOf(instance.eClass())) {
			return (!((MemoryResource) type).isIsVolatile());
		}

		return true;

	}

	/**
	 * Filters the ResourceTypes for a given ResourceInstance based on 
	 * the function {@link #isValidChoice(EObject, EObject)}}
	 */
	@Override
	public Collection<?> getChoiceOfValues(Object object) {
		EObject eobject = (EObject) object;

		List<Resource> resourceTypes = new ArrayList<Resource>();
		for (Object value : super.getChoiceOfValues(object)) {
			if (value == null) {
				continue;
			}

			if (isValidChoice(eobject, (EObject) value)) {
				resourceTypes.add((Resource) value);
				continue;
			}

		}
		return resourceTypes;
	}
}
