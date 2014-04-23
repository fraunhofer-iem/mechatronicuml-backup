package de.uni_paderborn.fujaba.muml.properties.component.editor;

/**
 * @generated
 */
public abstract class DirectedTypedPortEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.component.editor.PortEditor {

	/**
	 * @generated
	 */
	public DirectedTypedPortEditor(String tab,
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

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Booleans",
				"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addDirectedTypedPortKind_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addDirectedTypedPortOptional_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addDirectedTypedPortInitializeExpression_GeneralTab_Editor(null,
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addTypedNamedElementDataType_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addDirectedTypedPortKind_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createDirectedTypedPortKind_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createDirectedTypedPortKind_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getDirectedTypedPort_Kind());

		editor.setTooltipMessage("Defines the direction of this directed typed port.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addDirectedTypedPortOptional_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createDirectedTypedPortOptional_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createDirectedTypedPortOptional_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getDirectedTypedPort_Optional());

		editor.setTooltipMessage("Decides if this port is optional. An optional port does not need to be instantiated\nin all instances of the containing component.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addDirectedTypedPortInitializeExpression_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createDirectedTypedPortInitializeExpression_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createDirectedTypedPortInitializeExpression_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.muml.ui.properties.XtextPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getDirectedTypedPort_InitializeExpression());

		editor.setTooltipMessage("A initialize expression specifies the initial value that is emitted by the port after\nit has been instantiated. Thus, we only provide initialize expressions for out-port.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addTypedNamedElementDataType_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createTypedNamedElementDataType_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createTypedNamedElementDataType_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
						.getTypedNamedElement_DataType());

		editor.setTooltipMessage("The data type of this element.");

		return editor;

	}

}
