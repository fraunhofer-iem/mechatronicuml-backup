package de.uni_paderborn.fujaba.muml.hardware.properties.resourcetype.editor;

/**
 * @generated
 */
public class CacheEditor
		extends
			de.uni_paderborn.fujaba.muml.hardware.properties.resourcetype.editor.MemoryResourceEditor {

	/**
	 * @generated
	 */
	public CacheEditor(String tab,
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

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCacheWritePolicyEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCacheReplacementPolicyEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCacheNbSetsEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCacheAssociativityEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCacheUsedByProcessorEditor(
					"de.fujaba.properties.category.Lists", true);
		}

	}

	/**
	 * @generated
	 */
	protected void addCacheWritePolicyEditor(String category, boolean front) {
		addEditorToCategory(category, createCacheWritePolicyEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCacheWritePolicyEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getCache_WritePolicy());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addCacheReplacementPolicyEditor(String category,
			boolean front) {
		addEditorToCategory(category, createCacheReplacementPolicyEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCacheReplacementPolicyEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getCache_ReplacementPolicy());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addCacheNbSetsEditor(String category, boolean front) {
		addEditorToCategory(category, createCacheNbSetsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCacheNbSetsEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.SpinnerPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getCache_NbSets(), 0);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addCacheAssociativityEditor(String category, boolean front) {
		addEditorToCategory(category, createCacheAssociativityEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCacheAssociativityEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.SpinnerPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getCache_Associativity(), 0);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addCacheUsedByProcessorEditor(String category, boolean front) {
		addEditorToCategory(category, createCacheUsedByProcessorEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCacheUsedByProcessorEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getCache_UsedByProcessor());

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public CacheEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.hardware.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getCache());
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
			return new CacheEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.documentation",
							"property.tab.general"}).contains(tab);
		}
	}

}
