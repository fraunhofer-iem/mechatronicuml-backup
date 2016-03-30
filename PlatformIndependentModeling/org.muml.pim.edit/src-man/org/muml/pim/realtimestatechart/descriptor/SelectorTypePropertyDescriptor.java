package org.muml.pim.realtimestatechart.descriptor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.connector.DiscreteInteractionEndpoint;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.SynchronizationChannel;
import org.muml.pim.types.PrimitiveDataType;
import org.muml.pim.types.TypesPackage;

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
				.getEEnumLiteral("INT8").getLiteral(), true);
		allowedPrimitiveTypes.put(TypesPackage.Literals.PRIMITIVE_TYPES
				.getEEnumLiteral("INT16").getLiteral(), true);
		allowedPrimitiveTypes.put(TypesPackage.Literals.PRIMITIVE_TYPES
				.getEEnumLiteral("BOOLEAN").getLiteral(), true);
		allowedPrimitiveTypes.put(TypesPackage.Literals.PRIMITIVE_TYPES
				.getEEnumLiteral("INT32").getLiteral(), true);
		allowedPrimitiveTypes.put(TypesPackage.Literals.PRIMITIVE_TYPES
				.getEEnumLiteral("UINT8").getLiteral(), true);
		allowedPrimitiveTypes.put(TypesPackage.Literals.PRIMITIVE_TYPES
				.getEEnumLiteral("UINT16").getLiteral(), true);
		allowedPrimitiveTypes.put(TypesPackage.Literals.PRIMITIVE_TYPES
				.getEEnumLiteral("UINT32").getLiteral(), true);

		EClass eClassOfBehavioralElement = null;
		Boolean additionalTypeAllowed = false;
		DiscreteInteractionEndpoint discreteEndpoint = null;

		if (object instanceof SynchronizationChannel) {
			SynchronizationChannel channel = (SynchronizationChannel) object;
			RealtimeStatechart discreteInteractionRtsc = null;

			if (channel.getState() != null) {
				discreteInteractionRtsc = channel.getState()
						.getParentStatechart();
				if (discreteInteractionRtsc != null
						&& discreteInteractionRtsc.getBehavioralElement() != null
						&& ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT
								.isSuperTypeOf(discreteInteractionRtsc
										.getBehavioralElement().eClass())) {

					discreteEndpoint = (DiscreteInteractionEndpoint) discreteInteractionRtsc
							.getBehavioralElement();
					if (discreteEndpoint.isMulti()) {
						eClassOfBehavioralElement = discreteEndpoint.eClass();
						additionalTypeAllowed = true;
					}

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

					// do not filter the allowed primitive types
					continue;
				} else if (additionalTypeAllowed
						&& eClassOfBehavioralElement
								.isSuperTypeOf(((EObject) choice).eClass())
						&& ((EObject) choice).equals(discreteEndpoint)) {
					// do not filter the referenced discrete interaction
					// endpoint
					continue;
				}
				// filter anything else
				filteredChoices.remove(choice);
			}
		}
		choices = filteredChoices;

		return choices;
	}

}
