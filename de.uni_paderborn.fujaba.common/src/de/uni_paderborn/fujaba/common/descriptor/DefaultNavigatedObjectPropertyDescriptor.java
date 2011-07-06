package de.uni_paderborn.fujaba.common.descriptor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class DefaultNavigatedObjectPropertyDescriptor extends
		AbstractNavigatedObjectPropertyDescriptor {

	private EStructuralFeature navigationFeature;
	private EClass instanceClass;

	public DefaultNavigatedObjectPropertyDescriptor(
			AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, boolean multiLine, boolean sortChoices,
			Object staticImage, String category, String[] filterFlags,
			EStructuralFeature navigationFeature) {
		this(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags, navigationFeature, (EClass) navigationFeature.getEType());
	}
	
	public DefaultNavigatedObjectPropertyDescriptor(
			AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, boolean multiLine, boolean sortChoices,
			Object staticImage, String category, String[] filterFlags,
			EStructuralFeature navigationFeature, EClass instanceClass) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
		this.navigationFeature = navigationFeature;
		this.instanceClass = instanceClass;
	}

	@Override
	protected EObject getNavigatedObject(Object object) {
		return (EObject) ((EObject) object).eGet(navigationFeature);
	}

	@Override
	protected EObject createNewObject() {
		return EcoreUtil.create(getInstanceClass());
	}

	protected EClass getInstanceClass() {
		return instanceClass;
	}

	@Override
	protected void setNavigatedObject(Object object, EObject newObject) {
		((EObject) object).eSet(navigationFeature, newObject);
	}

	@Override
	public EStructuralFeature getNavigationFeature() {
		return navigationFeature;
	}

}
