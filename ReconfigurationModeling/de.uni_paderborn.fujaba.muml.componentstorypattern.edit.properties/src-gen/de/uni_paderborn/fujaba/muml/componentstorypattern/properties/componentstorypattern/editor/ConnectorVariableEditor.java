package de.uni_paderborn.fujaba.muml.componentstorypattern.properties.componentstorypattern.editor;

/**
 * @generated
 */
public abstract class ConnectorVariableEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.connector.editor.ConnectorEditor {

	/**
	 * @generated
	 */
	public ConnectorVariableEditor(String tab,
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
			addBindingSemantics_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addBindingOperator_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addBindingState_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addName_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addBindingSemantics_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createBindingSemantics_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createBindingSemantics_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
				.getComponentStoryPatternVariable_BindingSemantics();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory, feature);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addBindingOperator_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createBindingOperator_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createBindingOperator_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
				.getComponentStoryPatternVariable_BindingOperator();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory, feature);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addBindingState_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createBindingState_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createBindingState_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
				.getComponentStoryPatternVariable_BindingState();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory, feature);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addName_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createName_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createName_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.CorePackage.eINSTANCE
				.getNamedElement_Name();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory, feature, false);

		editor.setTooltipMessage("The name attribute of a meta-model element.");

		return editor;

	}

}
