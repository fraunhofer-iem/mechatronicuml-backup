package de.fujaba.properties.runtime.editors;

import org.eclipse.emf.common.notify.AdapterFactory;


/**
 * This ClassPropertyEditor is contained within an ObjectPropertyEditor and is
 * registered using the propertyEditors extension. Subclasses should add
 * properties to it.
 * 
 * @author bingo
 * 
 */
public abstract class ClassPropertyEditor extends CategoryPropertyEditor {
	

	public ClassPropertyEditor(AdapterFactory adapterFactory) {
		super(adapterFactory);
		initiallyExpanded = true;
	}

	public CategoryPropertyEditor addSubCategory(String key, String title,
			int orientation, boolean initiallyExpanded) {
		CategoryPropertyEditor category = new CategoryPropertyEditor(adapterFactory,
				orientation, title, initiallyExpanded);
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
