package de.uni_paderborn.fujaba.muml.model.realtimestatechart.descriptor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_paderborn.fujaba.common.descriptor.AbstractNavigatedObjectPropertyDescriptor;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;

public class TransitionSynchronizationPropertyDescriptor extends
		AbstractNavigatedObjectPropertyDescriptor {

	public TransitionSynchronizationPropertyDescriptor(
			AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, boolean multiLine, boolean sortChoices,
			Object staticImage, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
	}

	@Override
	protected EObject createNewObject() {
		return RealtimestatechartFactory.eINSTANCE.createSynchronization();
	}

	@Override
	protected EObject getNavigatedObject(Object object) {
		return ((Transition)object).getSynchronization();
	}

	@Override
	protected void setNavigatedObject(Object object, EObject newObject) {
		
	}

}
