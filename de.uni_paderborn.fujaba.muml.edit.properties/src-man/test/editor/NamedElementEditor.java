package test.editor;

import org.storydriven.core.CorePackage;

import de.fujaba.properties.runtime.editors.ClassPropertyEditor;
import de.fujaba.properties.runtime.editors.IPropertyEditor;
import de.fujaba.properties.runtime.editors.TextPropertyEditor;

/**
 * @generated
 */
public class NamedElementEditor extends ClassPropertyEditor {

	/**
	 * @generated
	 */
	public NamedElementEditor() {
	}

	/**
	 * @generated
	 */
	@Override
	protected void initialize() {
		addNameEditor(null, true);
		super.initialize();
	}

	protected void addNameEditor(String category, boolean front) {
		addEditorToCategory(category, createNameEditor(), front);
	}

	/**
	 * @generated
	 */
	protected IPropertyEditor createNameEditor() {
		return new TextPropertyEditor(CorePackage.Literals.NAMED_ELEMENT__NAME);

	}

}