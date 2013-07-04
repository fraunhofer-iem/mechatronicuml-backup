package test.editor;

import de.fujaba.properties.runtime.editors.CategoryPropertyEditor;
import de.fujaba.properties.runtime.editors.CheckboxPropertyEditor;
import de.fujaba.properties.runtime.editors.IPropertyEditor;
import de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;

/**
 * @generated
 */
public class StateEditor extends CategoryPropertyEditor {

	/**
	 * @generated
	 */
	public StateEditor() {
		addEditors();
	}

	/**
	 * @generated
	 */
	public void addEditors() {
		addPropertyEditor(getFeature1Editor());
		addPropertyEditor(getActionEditor());
	}

	/**
	 * @generated
	 */
	private IPropertyEditor getActionEditor() {
		return new NavigationFeaturePropertyEditor(
				RealtimestatechartPackage.Literals.STATE__DO_EVENT);
	}

	/**
	 * @generated
	 */
	private IPropertyEditor getFeature1Editor() {
		return new CheckboxPropertyEditor(
				RealtimestatechartPackage.Literals.STATE__INITIAL);

	}

}