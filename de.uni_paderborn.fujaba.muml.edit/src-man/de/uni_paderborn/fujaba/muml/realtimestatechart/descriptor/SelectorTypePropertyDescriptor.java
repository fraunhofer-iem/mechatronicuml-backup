package de.uni_paderborn.fujaba.muml.realtimestatechart.descriptor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import de.uni_paderborn.fujaba.common.utils.FujabaEcoreUtil;
import de.uni_paderborn.fujaba.muml.behavior.BehavioralElement;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint;
import de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage;
import de.uni_paderborn.fujaba.muml.protocol.Role;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationChannel;
import de.uni_paderborn.fujaba.muml.types.PrimitiveDataType;
import de.uni_paderborn.fujaba.muml.types.TypesPackage;

public class SelectorTypePropertyDescriptor extends ItemPropertyDescriptor {
	public SelectorTypePropertyDescriptor(AdapterFactory adapterFactory,
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
		HashMap<String, Boolean> allowedPrimitiveTypes = new HashMap<String, Boolean>();
		allowedPrimitiveTypes.put(TypesPackage.Literals.PRIMITIVE_TYPES
				.getEEnumLiteral("BYTE").getLiteral(), true);
		allowedPrimitiveTypes.put(TypesPackage.Literals.PRIMITIVE_TYPES
				.getEEnumLiteral("SHORT").getLiteral(), true);
		allowedPrimitiveTypes.put(TypesPackage.Literals.PRIMITIVE_TYPES
				.getEEnumLiteral("BOOLEAN").getLiteral(), true);
		allowedPrimitiveTypes.put(TypesPackage.Literals.PRIMITIVE_TYPES
				.getEEnumLiteral("INT").getLiteral(), true);

		EClass eClassOfBehavioralElement = null;
		Boolean additionalTypeAllowed = false;
		if (object instanceof SynchronizationChannel) {
			SynchronizationChannel channel = (SynchronizationChannel) object;
			List<RealtimeStatechart> discreteInteractionRealtimeStateCharts = new ArrayList<RealtimeStatechart>();
			if (channel.getState() != null) {
				RealtimeStatechart stateChart = null;
				for (Region region : channel.getState().getEmbeddedRegions()) {
					stateChart = region.getEmbeddedStatechart();
					if (stateChart != null
							&& stateChart.getBehavioralElement() != null
							&& ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT
									.isSuperTypeOf(stateChart
											.getBehavioralElement().eClass()))
						discreteInteractionRealtimeStateCharts.add(stateChart);

				}

			}
			DiscreteInteractionEndpoint discreteEndpoint;
			for (RealtimeStatechart stateChart : discreteInteractionRealtimeStateCharts) {
				discreteEndpoint = (DiscreteInteractionEndpoint) stateChart
						.getBehavioralElement();
				if (discreteEndpoint.isMulti()) {
					eClassOfBehavioralElement = discreteEndpoint.eClass();
					additionalTypeAllowed = true;
				}
			}

		}

		// Filter the choices

		Collection<?> filteredChoices = new ArrayList<Object>(choices);
		for (Object choice : choices) {
			if (choice != null) {
				if (TypesPackage.Literals.PRIMITIVE_DATA_TYPE
						.isSuperTypeOf(((EObject) choice).eClass())
						&& allowedPrimitiveTypes
								.containsKey(((PrimitiveDataType) choice)
										.getPrimitiveType().getLiteral())) {

					continue;
				} else if (additionalTypeAllowed
						&& eClassOfBehavioralElement
								.isSuperTypeOf(((EObject) choice).eClass())) {
					continue;
				}
				filteredChoices.remove(choice);
			}
		}
		choices = filteredChoices;

		return choices;
	}

}
