package de.uni_paderborn.fujaba.properties.runtime.constraint;

import java.util.List;

import org.eclipse.emf.ecore.EReference;

import de.uni_paderborn.fujaba.properties.runtime.filter.ICreationFilter;

public interface ICreationConstraintContributor {

	List<ICreationFilter> getCreationConstraints(EReference reference);

}
