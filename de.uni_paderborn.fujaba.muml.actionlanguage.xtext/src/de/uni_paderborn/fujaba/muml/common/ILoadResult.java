package de.uni_paderborn.fujaba.muml.common;

import org.eclipse.emf.ecore.EObject;

public interface ILoadResult {
	
	public EObject getEObject();
	public boolean hasError();
	public String getError();

}
