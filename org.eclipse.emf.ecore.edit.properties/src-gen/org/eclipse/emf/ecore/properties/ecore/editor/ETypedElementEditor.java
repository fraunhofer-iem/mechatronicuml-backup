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

		if (getTab() == null || "tab.default".equals(getTab())) {
			addETypedElementOrderedEditor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addETypedElementUniqueEditor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addETypedElementLowerBoundEditor(null, true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addETypedElementUpperBoundEditor(null, true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addETypedElementETypeEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addETypedElementOrderedEditor(String category, boolean front) {
		addEditorToCategory(category, createETypedElementOrderedEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createETypedElementOrderedEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getETypedElement_Ordered());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addETypedElementUniqueEditor(String category, boolean front) {
		addEditorToCategory(category, createETypedElementUniqueEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createETypedElementUniqueEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getETypedElement_Unique());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addETypedElementLowerBoundEditor(String category,
			boolean front) {
		addEditorToCategory(category, createETypedElementLowerBoundEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createETypedElementLowerBoundEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.SpinnerPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getETypedElement_LowerBound(), 0);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addETypedElementUpperBoundEditor(String category,
			boolean front) {
		addEditorToCategory(category, createETypedElementUpperBoundEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createETypedElementUpperBoundEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.SpinnerPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getETypedElement_UpperBound(), 0);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addETypedElementETypeEditor(String category, boolean front) {
		addEditorToCategory(category, createETypedElementETypeEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createETypedElementETypeEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getETypedElement_EType());

		return editor;

	}

}
