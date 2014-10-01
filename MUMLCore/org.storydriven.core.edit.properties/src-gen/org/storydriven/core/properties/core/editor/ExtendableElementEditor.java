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
			addExtension_ExtensionsTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addExtension_ExtensionsTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createExtension_ExtensionsTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createExtension_ExtensionsTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.CorePackage.eINSTANCE
				.getExtendableElement_Extension();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.FlattenedListPropertyEditor(
				adapterFactory, feature);

		return editor;

	}

}
