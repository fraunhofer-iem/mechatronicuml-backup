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
			addENamedElementNameEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addENamedElementNameEditor(String category, boolean front) {
		addEditorToCategory(category, createENamedElementNameEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createENamedElementNameEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getENamedElement_Name(), false);

		return editor;

	}

}
