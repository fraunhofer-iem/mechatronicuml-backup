package org.muml.ape.runtime.constraint;

import java.util.List;

import org.eclipse.emf.ecore.EReference;
import org.muml.ape.runtime.filter.ICreationFilter;

public interface ICreationConstraintContributor {

	List<ICreationFilter> getCreationConstraints(EReference reference);

}
