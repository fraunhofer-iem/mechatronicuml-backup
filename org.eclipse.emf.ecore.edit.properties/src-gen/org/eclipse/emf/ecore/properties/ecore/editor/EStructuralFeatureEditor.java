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
			addEStructuralFeatureChangeableEditor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addEStructuralFeatureVolatileEditor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addEStructuralFeatureTransientEditor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addEStructuralFeatureDefaultValueLiteralEditor(null, true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addEStructuralFeatureUnsettableEditor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addEStructuralFeatureDerivedEditor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

	}

	/**
	 * @generated
	 */
	protected void addEStructuralFeatureChangeableEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createEStructuralFeatureChangeableEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEStructuralFeatureChangeableEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEStructuralFeature_Changeable());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addEStructuralFeatureVolatileEditor(String category,
			boolean front) {
		addEditorToCategory(category, createEStructuralFeatureVolatileEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEStructuralFeatureVolatileEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEStructuralFeature_Volatile());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addEStructuralFeatureTransientEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createEStructuralFeatureTransientEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEStructuralFeatureTransientEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEStructuralFeature_Transient());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addEStructuralFeatureDefaultValueLiteralEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createEStructuralFeatureDefaultValueLiteralEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEStructuralFeatureDefaultValueLiteralEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEStructuralFeature_DefaultValueLiteral(), false);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addEStructuralFeatureUnsettableEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createEStructuralFeatureUnsettableEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEStructuralFeatureUnsettableEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEStructuralFeature_Unsettable());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addEStructuralFeatureDerivedEditor(String category,
			boolean front) {
		addEditorToCategory(category, createEStructuralFeatureDerivedEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEStructuralFeatureDerivedEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEStructuralFeature_Derived());

		return editor;

	}

}
