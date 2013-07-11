package de.fujaba.properties.runtime.factory;

import org.eclipse.emf.common.command.CompoundCommand;

import de.fujaba.properties.runtime.editors.IPropertyEditor;

public interface IPropertyEditorFactory {
	public IPropertyEditor createPropertyEditor();
}
