package de.uni_paderborn.fujaba.muml.model.realtimestatechart.descriptor;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.util.ItemPropertyDescriptorUtil;

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
		RealtimeStatechart rtsc = (RealtimeStatechart) ItemPropertyDescriptorUtil
				.deduceContainer((EObject) object,
						RealtimestatechartPackage.Literals.REALTIME_STATECHART);
		if (rtsc != null) {
			return rtsc.getAvailableClocks();
		}
		return Collections.emptyList();
	}

}
