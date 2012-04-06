package de.uni_paderborn.fujaba.muml.model.realtimestatechart.descriptor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_paderborn.fujaba.common.descriptor.DefaultChainedPropertyDescriptor;
import de.uni_paderborn.fujaba.common.descriptor.IChainedPropertyDescriptor;

public class MessageInstanceOfPropertyDescriptor extends
		DefaultChainedPropertyDescriptor {

	public MessageInstanceOfPropertyDescriptor(
			AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, boolean multiLine, boolean sortChoices,
			Object staticImage, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
	}
	

	public MessageInstanceOfPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags,
			IChainedPropertyDescriptor parent) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags, parent);
	}

	// TODO: Removed due to Metamodel changes:

	// @Override
	// public void doSetValue(Object object, Object newValue) {
	// EObject eObject = (EObject) object;
	// EditingDomain editingDomain = getEditingDomain(object);
	// EReference setFeature = CallsPackage.Literals.INVOCATION__CALLEE;
	// editingDomain.getCommandStack().execute(
	// SetCommand.create(editingDomain, getCommandOwner(eObject),
	// setFeature, newValue));
	// }

}
