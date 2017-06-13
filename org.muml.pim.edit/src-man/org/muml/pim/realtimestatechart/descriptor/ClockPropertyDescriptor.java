package org.muml.pim.realtimestatechart.descriptor;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.muml.core.common.utils.FujabaEcoreUtil;
import org.muml.pim.realtimestatechart.Clock;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;

public class ClockPropertyDescriptor extends ItemPropertyDescriptor {
	public ClockPropertyDescriptor(AdapterFactory adapterFactory,
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
		Collection<Clock> choices = new ArrayList<Clock>();
		
		if (!feature.isRequired() && !feature.isMany()) {
			choices.add(null);
		}
		
		RealtimeStatechart rtsc = (RealtimeStatechart) FujabaEcoreUtil
				.deduceContainer((EObject) object,
						RealtimestatechartPackage.Literals.REALTIME_STATECHART);
		if (rtsc != null) {
			choices.addAll(rtsc.getAvailableClocks());
		}
		return choices;
	}

}
