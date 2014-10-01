package de.uni_paderborn.fujaba.muml.properties.component.editor;

/**
 * @generated
 */
public abstract class ComponentEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.types.editor.DataTypeEditor {

	/**
	 * @generated
	 */
	public ComponentEditor(String tab,
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
			addPorts_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addComponentKind_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addPorts_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createPorts_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPorts_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
				.getComponent_Ports();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The ports of a component represent the interaction points between the component and its environment.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addComponentKind_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createComponentKind_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createComponentKind_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
				.getComponent_ComponentKind();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("This attribute specifies the kind of the component. A component may be either\ndiscrete software component, a continuous component, a hybrid component \nor a hardware component.");

		return editor;

	}

}
