package test.editor;

import java.util.Map;

import org.eclipse.swt.SWT;

import de.fujaba.properties.runtime.editors.CategoryPropertyEditor;
import de.fujaba.properties.runtime.editors.CheckboxPropertyEditor;
import de.fujaba.properties.runtime.editors.IPropertyEditor;
import de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;

/**
 * @generated
 */
public class StateEditor extends NamedElementEditor {
	
	/**
	 * @generated
	 */
	public StateEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {
		addSubCategory("Category1", "My Subcategory!", SWT.HORIZONTAL);
		addInitialEditor("Category1", true);
		addDoEventEditor(null, false);
		super.initialize();
	}
	
	protected void addInitialEditor(String category, boolean front) {
		addEditorToCategory(category, createInitialEditor(), front);
	}
	
	
	/**
	 * @generated
	 */
	protected IPropertyEditor createInitialEditor() {
		return new CheckboxPropertyEditor(
				RealtimestatechartPackage.Literals.STATE__INITIAL);

	}

	protected void addDoEventEditor(String category, boolean front) {
		addEditorToCategory(category, createDoEventEditor(), front);
	}
	/**
	 * @generated
	 */
	protected IPropertyEditor createDoEventEditor() {
		return new NavigationFeaturePropertyEditor(
				RealtimestatechartPackage.Literals.STATE__DO_EVENT);
	}
	
	
	// Überschreibungen von oberklassen:

	@Override
	protected void addNameEditor(String category, boolean front) {
		category = "Category1";
		super.addNameEditor(category, front);
	}


}