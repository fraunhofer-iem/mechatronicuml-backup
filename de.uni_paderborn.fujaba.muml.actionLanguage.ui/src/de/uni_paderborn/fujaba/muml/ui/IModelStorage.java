package de.uni_paderborn.fujaba.muml.ui;

import java.util.List;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;

import de.uni_paderborn.fujaba.muml.model.core.Attribute;

public interface IModelStorage extends IStorage {
	public List<Attribute> getAttributeList();
	public void save(String text) throws CoreException;
}
