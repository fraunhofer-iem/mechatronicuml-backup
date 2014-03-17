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

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
				"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCacheWritePolicy_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCacheReplacementPolicy_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCacheNbSets_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCacheAssociativity_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCacheUsedByProcessor_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

	}

	/**
	 * @generated
	 */
	protected void addCacheWritePolicy_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createCacheWritePolicy_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCacheWritePolicy_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getCache_WritePolicy());

		editor.setTooltipMessage("Determines the write policy of the Cache.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addCacheReplacementPolicy_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createCacheReplacementPolicy_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCacheReplacementPolicy_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getCache_ReplacementPolicy());

		editor.setTooltipMessage("Determines the replacement policy for this Cache.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addCacheNbSets_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createCacheNbSets_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCacheNbSets_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.SpinnerPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getCache_NbSets(), 0);

		editor.setTooltipMessage("Specifies the number of sets.\n If the nbSets are one, the cache is full-associative.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addCacheAssociativity_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createCacheAssociativity_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCacheAssociativity_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.SpinnerPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getCache_Associativity(), 0);

		editor.setTooltipMessage("The associativity of this cache. It represents the number of blocks in one set. An associativity of 1 represents a direct mapped cache.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addCacheUsedByProcessor_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createCacheUsedByProcessor_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCacheUsedByProcessor_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getCache_UsedByProcessor());

		editor.setTooltipMessage("The processors which use this cache.");

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
				de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
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
							"property.tab.general", "property.tab.extensions"})
					.contains(tab);
		}
	}

}
