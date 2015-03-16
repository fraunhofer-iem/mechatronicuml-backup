package de.uni_paderborn.fujaba.modelinstance.properties.modelinstance.editor;

/**
 * @generated
 */
public class RootNodeEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public RootNodeEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
				"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		addEditorToCategory(
				"de.uni_paderborn.fujaba.properties.category.Lists",
				createCategories_GeneralTab_Editor(), false);

	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorCategories_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createCategories_GeneralTab_Editor() {
		if (this.editorCategories_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.modelinstance.ModelinstancePackage.eINSTANCE
					.getRootNode_Categories();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The model element categories which are contained in this RootNode.");

			this.editorCategories_GeneralTab = editor;
		}
		return this.editorCategories_GeneralTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public RootNodeEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.modelinstance.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.modelinstance.ModelinstancePackage.eINSTANCE
						.getRootNode());
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
			return new RootNodeEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general"}).contains(
					tab);
		}
	}

}
