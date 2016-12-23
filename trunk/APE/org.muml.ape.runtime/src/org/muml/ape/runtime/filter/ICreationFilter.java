package org.muml.ape.runtime.filter;

import org.eclipse.emf.ecore.EClass;

public interface ICreationFilter {

	public boolean select(Object toTest, EClass eClass);

}
