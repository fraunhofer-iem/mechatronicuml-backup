package org.muml.pm.hardware.hwplatform;

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
import org.muml.pm.hardware.hwresource.Resource;

public class CommunicationMediaPartCommunicationMediaPropertyDescriptor extends
		ItemPropertyDescriptor {

	private static final Map<EClass, EClass> communicationMediaRelation;
	static {
		Map<EClass, EClass> aMap = new HashMap<EClass, EClass>();
//		aMap.put(HwplatformPackage.Literals.BUS_PART,
//				HwresourcePackage.Literals.BUS);
//		aMap.put(HwplatformPackage.Literals.LINK_PART,
//				HwresourcePackage.Literals.LINK);
		communicationMediaRelation = Collections.unmodifiableMap(aMap);
	}

	public CommunicationMediaPartCommunicationMediaPropertyDescriptor(
			AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, boolean multiLine, boolean sortChoices,
			Object staticImage, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
	}

	/**
	 * This function decides if a given resource type is valid for a given
	 * resource instance
	 * 
	 * @param instance
	 *            the ResourceInstance
	 * @param type
	 *            the ResourceType
	 * @return
	 */
	private boolean isValidChoice(EObject instance, EObject type) {

		if (!communicationMediaRelation.get(instance.eClass()).isSuperTypeOf(
				type.eClass())) {
			return false;
		}
		return true;

	}

	/**
	 * Filters the ResourceTypes for a given ResourceInstance based on the
	 * function {@link #isValidChoice(EObject, EObject)}
	 */
	@Override
	public Collection<?> getChoiceOfValues(Object object) {
		EObject eobject = (EObject) object;

		List<Resource> communicationMedia = new ArrayList<Resource>();
		for (Object value : super.getChoiceOfValues(object)) {
			if (value == null) {
				continue;
			}

			if (isValidChoice(eobject, (EObject) value)) {
				communicationMedia.add((Resource) value);
				continue;
			}

		}
		return communicationMedia;
	}

}
