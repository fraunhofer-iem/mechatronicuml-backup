package org.muml.pim.realtimestatechart.descriptor;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;

public class TransitionEndpointPropertyDescriptor extends
		ItemPropertyDescriptor {

	public TransitionEndpointPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
	}

	@Override
	public void setPropertyValue(Object object, final Object value) {
		final EObject eObject = (EObject) object;
		EditingDomain editingDomain = getEditingDomain(object);
		if (editingDomain == null) {
			doSetValue(eObject, value);
		} else {
			editingDomain.getCommandStack().execute(
					new ChangeCommand(eObject.eResource().getResourceSet()) {

						@Override
						protected void doExecute() {
							doSetValue(eObject, value);
						}

					});
		}

		super.setPropertyValue(object, value);
	}

	protected void doSetValue(EObject eObject, Object value) {
		eObject.eSet(feature, value);
		EObject statechart = (EObject) eObject
				.eGet(RealtimestatechartPackage.Literals.TRANSITION__STATECHART);
		@SuppressWarnings("unchecked")
		Collection<EObject> transitions = (Collection<EObject>) statechart
				.eGet(RealtimestatechartPackage.Literals.REALTIME_STATECHART__TRANSITIONS);
		if (!transitions.contains(eObject)) {
			transitions = new ArrayList<EObject>(transitions);
			transitions.add(eObject);
			statechart
					.eSet(RealtimestatechartPackage.Literals.REALTIME_STATECHART__TRANSITIONS,
							transitions);
		}
	}

}
