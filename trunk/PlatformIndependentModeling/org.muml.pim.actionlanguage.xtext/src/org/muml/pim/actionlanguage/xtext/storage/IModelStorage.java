package org.muml.pim.actionlanguage.xtext.storage;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;

public interface IModelStorage extends IStorage {
	public void save(String text) throws CoreException;
	public void save(EObject object) throws CoreException;
	public String serialize();
	public EObject getContainer();
}
