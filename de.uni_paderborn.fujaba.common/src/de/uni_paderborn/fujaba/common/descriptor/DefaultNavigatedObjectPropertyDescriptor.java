package de.uni_paderborn.fujaba.common.descriptor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;

public class DefaultNavigatedObjectPropertyDescriptor extends
		AbstractNavigatedObjectPropertyDescriptor {

	private EStructuralFeature navigatedFeature;

	public DefaultNavigatedObjectPropertyDescriptor(
			AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, boolean multiLine, boolean sortChoices,
			Object staticImage, String category, String[] filterFlags,
			EStructuralFeature navigatedFeature) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
		this.navigatedFeature = navigatedFeature;
	}

	@Override
	protected EObject getNavigatedObject(Object object) {
		return (EObject) ((EObject) object).eGet(navigatedFeature);
	}

	@Override
	protected EObject createNewObject() {
		return EcoreFactory.eINSTANCE.create(this.feature.getEType().eClass());
	}

	@Override
	protected void setNavigatedObject(Object object, EObject newObject) {
		((EObject) object).eSet(navigatedFeature, newObject);
	}

}
