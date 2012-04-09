package de.uni_paderborn.fujaba.muml.storage;

import java.util.List;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.model.core.Attribute;

public interface IModelStorage extends IStorage {
	public List<Attribute> getAttributeList();
	public void save(String text) throws CoreException;
	public void save(EObject object) throws CoreException;
	public String serialize();
	public EObject getContainer();
}
