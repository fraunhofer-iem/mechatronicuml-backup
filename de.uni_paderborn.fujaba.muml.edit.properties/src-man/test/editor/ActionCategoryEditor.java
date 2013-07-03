package test.editor;

import de.fujaba.properties.runtime.editors.CategoryPropertyEditor;
import de.fujaba.properties.runtime.editors.ListPropertyEditor;

public class ActionCategoryEditor extends CategoryPropertyEditor {

	public ActionCategoryEditor() {
		super("Action");
		addPropertyEditor(new ListPropertyEditor(null));
	}
	
}