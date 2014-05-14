package org.eclipse.emf.ecore.properties.ecore.editor;

/**
 * @generated
 */
public abstract class ENamedElementEditor
		extends
			org.eclipse.emf.ecore.properties.ecore.editor.EModelElementEditor {

	/**
	 * @generated
	 */
	public ENamedElementEditor(String tab,
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

		if (getTab() == null || "tab.default".equals(getTab())) {
			addName_DefaultTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addName_DefaultTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createName_DefaultTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createName_DefaultTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
				.getENamedElement_Name();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory, feature, false);

		return editor;

	}

}
