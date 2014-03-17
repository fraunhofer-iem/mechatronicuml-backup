package de.uni_paderborn.fujaba.muml.hardware.properties.resourcetype.editor;

/**
 * @generated
 */
public class ResourceTypeRepositoryEditor
		extends
			org.storydriven.core.properties.core.editor.CommentableElementEditor {

	/**
	 * @generated
	 */
	public ResourceTypeRepositoryEditor(String tab,
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
			addResourceTypeRepositoryProtocols_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

	}

	/**
	 * @generated
	 */
	protected void addResourceTypeRepositoryProtocols_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createResourceTypeRepositoryProtocols_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createResourceTypeRepositoryProtocols_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getResourceTypeRepository_Protocols());

		editor.setTooltipMessage("The CommunicationProtocols that belong to this ResourceTypeRepository.\nCommunicationProtocols are used to specify the protocol used by HWPort and CommunicationMedia.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ResourceTypeRepositoryEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.hardware.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getResourceTypeRepository());
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
			return new ResourceTypeRepositoryEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.documentation",
							"property.tab.extensions"}).contains(tab);
		}
	}

}
