package test.editor;

import de.fujaba.properties.runtime.editors.CategoryPropertyEditor;
import de.fujaba.properties.runtime.editors.IPropertyEditor;
import de.fujaba.properties.runtime.editors.ListPropertyEditor;
import de.fujaba.properties.runtime.editors.NavigatedPropertyEditor;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;

public class TransitionCategoryEditor extends CategoryPropertyEditor {

	public TransitionCategoryEditor() {
		super("Transition");
		addEditorsPerFeature();
	}
	
	public void addEditorsPerFeature() {
		addPropertyEditor(getFeature1Editor());
		addPropertyEditor(getActionEditor());
	}

	private IPropertyEditor getActionEditor() {
		return new NavigatedPropertyEditor(RealtimestatechartPackage.Literals.TRANSITION__ACTION, new ActionCategoryEditor());
	}

	private IPropertyEditor getFeature1Editor() {
		return new ListPropertyEditor(null);

	}
	
}