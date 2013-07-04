package test.editor;

import org.storydriven.core.CorePackage;

import de.fujaba.properties.runtime.editors.CategoryPropertyEditor;
import de.fujaba.properties.runtime.editors.IPropertyEditor;
import de.fujaba.properties.runtime.editors.TextPropertyEditor;

/**
 * @generated
 */
public class NamedElementEditor extends CategoryPropertyEditor {

	/**
	 * @generated
	 */
	public NamedElementEditor() {
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
		return new TextPropertyEditor(CorePackage.Literals.NAMED_ELEMENT__NAME);

	}

}