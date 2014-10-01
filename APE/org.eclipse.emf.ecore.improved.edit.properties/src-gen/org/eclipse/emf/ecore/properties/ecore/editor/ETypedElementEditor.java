package org.eclipse.emf.ecore.properties.ecore.editor;

/**
 * @generated
 */
public abstract class ETypedElementEditor
		extends
			org.eclipse.emf.ecore.properties.ecore.editor.ENamedElementEditor {

	/**
	 * @generated
	 */
	public ETypedElementEditor(String tab,
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

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Booleans",
				"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

		addSubCategory(
				"de.uni_paderborn.fujaba.properties.category.Cardinality",
				"Cardinality", org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "tab.default".equals(getTab())) {
			addOrdered_DefaultTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addUnique_DefaultTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addUpperBound_DefaultTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Cardinality",
					true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addLowerBound_DefaultTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Cardinality",
					true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addEType_DefaultTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addOrdered_DefaultTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createOrdered_DefaultTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createOrdered_DefaultTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
				.getETypedElement_Ordered();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory, feature);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addUnique_DefaultTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createUnique_DefaultTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createUnique_DefaultTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
				.getETypedElement_Unique();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory, feature);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addUpperBound_DefaultTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createUpperBound_DefaultTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createUpperBound_DefaultTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
				.getETypedElement_UpperBound();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.SpinnerPropertyEditor(
				adapterFactory, feature, 0);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addLowerBound_DefaultTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createLowerBound_DefaultTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createLowerBound_DefaultTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
				.getETypedElement_LowerBound();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.SpinnerPropertyEditor(
				adapterFactory, feature, 0);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addEType_DefaultTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createEType_DefaultTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEType_DefaultTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
				.getETypedElement_EType();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		return editor;

	}

}
