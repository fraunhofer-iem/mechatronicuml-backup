package de.uni_paderborn.fujaba.muml.properties.behavior.editor;

/**
 * @generated
 */
public abstract class BehaviorEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public BehaviorEditor(
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		super.createProperties();

		addSubCategory("de.fujaba.properties.category.Lists", "Lists",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		addBehaviorOperationsEditor("de.fujaba.properties.category.Lists", true);

		addBehaviorVariablesEditor("de.fujaba.properties.category.Lists", true);

	}

	/**
	 * @generated
	 */
	protected void addBehaviorOperationsEditor(String category, boolean front) {
		addEditorToCategory(category, createBehaviorOperationsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createBehaviorOperationsEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
						.getBehavior_Operations());

	}
	/**
	 * @generated
	 */
	protected void addBehaviorVariablesEditor(String category, boolean front) {
		addEditorToCategory(category, createBehaviorVariablesEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createBehaviorVariablesEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
						.getBehavior_Variables());

	}

}
