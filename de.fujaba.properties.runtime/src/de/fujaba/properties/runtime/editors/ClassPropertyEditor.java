package de.fujaba.properties.runtime.editors;

import org.eclipse.core.runtime.Assert;

/**
 * This ClassPropertyEditor is contained within an ObjectPropertyEditor and is
 * registered using the propertyEditors extension. Subclasses should add
 * properties to it.
 * 
 * @author bingo
 * 
 */
public abstract class ClassPropertyEditor extends CategoryPropertyEditor {

	public CategoryPropertyEditor addSubCategory(String key, String title,
			int orientation) {
		CategoryPropertyEditor category = new CategoryPropertyEditor(
				orientation, title);
		addPropertyEditor(key, category, false);
		return category;
	}

	public void addEditorToCategory(String category, IPropertyEditor editor,
			boolean front) {
		CategoryPropertyEditor categoryEditor = this;
		IPropertyEditor subEditor = getEditor(category);
		if (subEditor instanceof CategoryPropertyEditor) {
			categoryEditor = (CategoryPropertyEditor) subEditor;
		}
		categoryEditor.addPropertyEditor(null, editor, front);
	}

}
