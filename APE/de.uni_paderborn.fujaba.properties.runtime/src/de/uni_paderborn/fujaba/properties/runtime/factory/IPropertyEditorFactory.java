package de.uni_paderborn.fujaba.properties.runtime.factory;

import de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor;

public interface IPropertyEditorFactory {
	public IPropertyEditor createPropertyEditor(String tab);

	public boolean hasTab(String tab);
}
