package test.editor;

import de.fujaba.properties.runtime.editors.CategoryPropertyEditor;
import de.fujaba.properties.runtime.editors.IPropertyEditor;
import de.fujaba.properties.runtime.editors.ListPropertyEditor;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;

/**
 * @generated
 */
public class DoEventEditor extends CategoryPropertyEditor {

	/**
	 * @generated
	 */
	public DoEventEditor() {
		addEditors();
	}

	/**
	 * @generated
	 */
	public void addEditors() {
		addPropertyEditor(getFeature1Editor());
	}

	/**
	 * @generated
	 */
	private IPropertyEditor getFeature1Editor() {
		return new ListPropertyEditor(
				RealtimestatechartPackage.Literals.DO_EVENT__ACTION);
	}

}
