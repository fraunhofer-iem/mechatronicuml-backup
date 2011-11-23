package de.uni_paderborn.fujaba.muml.model.realtimestatechart.descriptor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart;

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
		Collection<?> choices = super.getChoiceOfValues(object);
		List<Object> invalidChoices = new ArrayList<Object>();
		FujabaRealtimeStatechart rtsc = getContainerStatechart((EObject) object);
		if (rtsc != null) {
			for (Object choice : choices) {
				if (choice != null) {
					Clock clock = (Clock) choice;
					if (!clock.getStatechart().isSuperStatechartOf(rtsc)) {
						invalidChoices.add(choice);
					}
				}
			}
		}
		choices.removeAll(invalidChoices);
		return choices;
	}

	private FujabaRealtimeStatechart getContainerStatechart(EObject object) {
		while (object != null && !(object instanceof FujabaRealtimeStatechart)) {
			object = object.eContainer();
		}
		return (FujabaRealtimeStatechart) object;
	}

}
