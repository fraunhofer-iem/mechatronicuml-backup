package org.muml.ape.runtime.factory;

import org.muml.ape.runtime.editors.IPropertyEditor;

public interface IPropertyEditorFactory {
	public IPropertyEditor createPropertyEditor(String tab);

	public boolean hasTab(String tab);
}
