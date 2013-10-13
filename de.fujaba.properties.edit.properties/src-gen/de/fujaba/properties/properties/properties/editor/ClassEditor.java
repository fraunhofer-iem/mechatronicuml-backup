package de.fujaba.properties.properties.properties.editor;

/**
 * @generated
 */
public class ClassEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ClassEditor(String tab,
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

		addSubCategory("de.fujaba.properties.category.Lists", "Lists",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null
				|| "de.fujaba.properties.tab.general".equals(getTab())) {
			addClassGenClassEditor(null, true);
		}

		if (getTab() == null
				|| "de.fujaba.properties.tab.general".equals(getTab())) {
			addClassSuperClassesEditor("de.fujaba.properties.category.Lists",
					true);
		}

		if (getTab() == null
				|| "de.fujaba.properties.tab.general".equals(getTab())) {
			addClassAllSuperClassesEditor(
					"de.fujaba.properties.category.Lists", true);
		}

	}

	/**
	 * @generated
	 */
	protected void addClassGenClassEditor(String category, boolean front) {
		addEditorToCategory(category, createClassGenClassEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createClassGenClassEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getClass_GenClass());

	}
	/**
	 * @generated
	 */
	protected void addClassSuperClassesEditor(String category, boolean front) {
		addEditorToCategory(category, createClassSuperClassesEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createClassSuperClassesEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getClass_SuperClasses());

	}
	/**
	 * @generated
	 */
	protected void addClassAllSuperClassesEditor(String category, boolean front) {
		addEditorToCategory(category, createClassAllSuperClassesEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createClassAllSuperClassesEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getClass_AllSuperClasses());

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ClassEditor(String tab) {
		this(tab, de.fujaba.properties.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory(),
				de.fujaba.properties.PropertiesPackage.eINSTANCE.getClass_());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new ClassEditor(tab);
		}
	}

}
