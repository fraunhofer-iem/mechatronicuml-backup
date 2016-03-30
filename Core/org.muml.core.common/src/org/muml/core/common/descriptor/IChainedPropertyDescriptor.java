package org.muml.core.common.descriptor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

public interface IChainedPropertyDescriptor extends IItemPropertyDescriptor, IDifferentObjectItemPropertyDescriptor {
	IChainedPropertyDescriptor getParentDescriptor();

	void setParentDescriptor(IChainedPropertyDescriptor next);
	Object doGetValue(EObject object, EStructuralFeature feature);
	void doSetValue(Object object, Object newValue);
	Object createObject();
	void notifyObject(Object object);
}
