package de.uni_paderborn.fujaba.muml.reconfiguration.properties.reconfiguration.editor;

/**
 * @generated
 */
public class FadingFunctionEditor
		extends
			org.storydriven.core.properties.core.editor.CommentableElementEditor {

	/**
	 * @generated
	 */
	public FadingFunctionEditor(String tab,
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

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addFadingFunctionFromPort_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addFadingFunctionToPort_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addNamedElementName_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addFadingFunctionFromPort_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createFadingFunctionFromPort_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createFadingFunctionFromPort_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getFadingFunction_FromPort());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addFadingFunctionToPort_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createFadingFunctionToPort_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createFadingFunctionToPort_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getFadingFunction_ToPort());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addNamedElementName_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createNamedElementName_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createNamedElementName_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.storydriven.core.CorePackage.eINSTANCE
						.getNamedElement_Name(), false);

		editor.setTooltipMessage("The name attribute of a meta-model element.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public FadingFunctionEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.reconfiguration.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getFadingFunction());
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
			return new FadingFunctionEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general",
							"property.tab.documentation",
							"property.tab.extensions", "property.tab.general"})
					.contains(tab);
		}
	}

}
