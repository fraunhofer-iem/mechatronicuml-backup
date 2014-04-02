package org.storydriven.core.properties.core.editor;

/**
 * @generated
 */
public abstract class ExtendableElementEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ExtendableElementEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		super.createProperties();

		if (getTab() == null || "property.tab.extensions".equals(getTab())) {
			addExtendableElementExtension_ExtensionsTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addExtendableElementExtension_ExtensionsTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createExtendableElementExtension_ExtensionsTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createExtendableElementExtension_ExtensionsTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				org.storydriven.core.CorePackage.eINSTANCE
						.getExtendableElement_Extension());

		editor.addVisibilityFilter("not extension->isEmpty()", getEClass());

		return editor;

	}

}
