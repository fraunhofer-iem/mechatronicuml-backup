package de.uni_paderborn.fujaba.properties.runtime.constraint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EReference;

import de.uni_paderborn.fujaba.properties.runtime.filter.ICreationFilter;

public abstract class DefaultCreationConstraintContributor
		implements ICreationConstraintContributor {
	
	protected Map<EReference, List<ICreationFilter>> registeredConstraints =
			new HashMap<EReference, List<ICreationFilter>>();
	
	public DefaultCreationConstraintContributor() {
	}

	protected void addConstraintFilter(EReference reference, ICreationFilter filter) {
		List<ICreationFilter> filters = registeredConstraints.get(reference);
		if (filters == null) {
			filters = new ArrayList<ICreationFilter>();
			registeredConstraints.put(reference, filters);
		}
		filters.add(filter);
	}

	@Override
	public List<ICreationFilter> getCreationConstraints(EReference reference) {
		if (registeredConstraints.containsKey(reference)) {
			return registeredConstraints.get(reference);
		} else {
			return Collections.emptyList();
		}
	}

}
