package org.eclipse.emf.ecore.properties.ecore.editor;

/**
 * @generated
 */
public abstract class EStructuralFeatureEditor
		extends
			org.eclipse.emf.ecore.properties.ecore.editor.ETypedElementEditor {

	/**
	 * @generated
	 */
	public EStructuralFeatureEditor(String tab,
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

		if (getTab() == null || "tab.default".equals(getTab())) {
			addEStructuralFeatureChangeable_DefaultTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addEStructuralFeatureVolatile_DefaultTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addEStructuralFeatureTransient_DefaultTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addEStructuralFeatureDefaultValueLiteral_DefaultTab_Editor(null,
					true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addEStructuralFeatureUnsettable_DefaultTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addEStructuralFeatureDerived_DefaultTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

	}

	/**
	 * @generated
	 */
	protected void addEStructuralFeatureChangeable_DefaultTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createEStructuralFeatureChangeable_DefaultTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEStructuralFeatureChangeable_DefaultTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEStructuralFeature_Changeable());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addEStructuralFeatureVolatile_DefaultTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createEStructuralFeatureVolatile_DefaultTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEStructuralFeatureVolatile_DefaultTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEStructuralFeature_Volatile());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addEStructuralFeatureTransient_DefaultTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createEStructuralFeatureTransient_DefaultTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEStructuralFeatureTransient_DefaultTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEStructuralFeature_Transient());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addEStructuralFeatureDefaultValueLiteral_DefaultTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createEStructuralFeatureDefaultValueLiteral_DefaultTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEStructuralFeatureDefaultValueLiteral_DefaultTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEStructuralFeature_DefaultValueLiteral(), false);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addEStructuralFeatureUnsettable_DefaultTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createEStructuralFeatureUnsettable_DefaultTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEStructuralFeatureUnsettable_DefaultTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEStructuralFeature_Unsettable());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addEStructuralFeatureDerived_DefaultTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createEStructuralFeatureDerived_DefaultTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEStructuralFeatureDerived_DefaultTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEStructuralFeature_Derived());

		return editor;

	}

}
