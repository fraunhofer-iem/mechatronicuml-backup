package de.uni_paderborn.fujaba.properties.editor;

/**
 * @generated
 */
public class ClassEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

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

		if (getTab() == null
				|| "de.uni_paderborn.fujaba.properties.tab.general".equals(getTab())) {
			addClassGenClassEditor(null, true);
		}

		if (getTab() == null
				|| "de.uni_paderborn.fujaba.properties.tab.general".equals(getTab())) {
			addClassSuperClassesEditor(null, true);
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
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createClassGenClassEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getClass_GenClass());

		return editor;

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
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createClassSuperClassesEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getClass_SuperClasses());

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ClassEditor(String tab) {
		this(tab, de.uni_paderborn.fujaba.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory(),
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE.getClass_());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new ClassEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general"}).contains(tab);
		}
	}

}
