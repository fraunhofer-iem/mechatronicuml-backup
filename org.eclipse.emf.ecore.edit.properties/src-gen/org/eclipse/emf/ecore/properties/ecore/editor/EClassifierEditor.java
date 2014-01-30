package org.eclipse.emf.ecore.properties.ecore.editor;

/**
 * @generated
 */
public abstract class EClassifierEditor
		extends
			org.eclipse.emf.ecore.properties.ecore.editor.ENamedElementEditor {

	/**
	 * @generated
	 */
	public EClassifierEditor(String tab,
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
			addEClassifierInstanceClassNameEditor(null, true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addEClassifierInstanceTypeNameEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addEClassifierInstanceClassNameEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createEClassifierInstanceClassNameEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEClassifierInstanceClassNameEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEClassifier_InstanceClassName(), false);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addEClassifierInstanceTypeNameEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createEClassifierInstanceTypeNameEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEClassifierInstanceTypeNameEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEClassifier_InstanceTypeName(), false);

		return editor;

	}

}
