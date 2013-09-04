package de.fujaba.properties.runtime.factory;

import de.fujaba.properties.runtime.editors.IPropertyEditor;

public interface IPropertyEditorFactory {
	public IPropertyEditor createPropertyEditor(String tab);
}
