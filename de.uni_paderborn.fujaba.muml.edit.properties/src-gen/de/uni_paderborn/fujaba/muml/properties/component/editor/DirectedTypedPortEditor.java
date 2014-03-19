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
			addDirectedTypedPortKindEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addDirectedTypedPortOptionalEditor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addDirectedTypedPortInitializeExpressionEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addTypedNamedElementDataTypeEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addDirectedTypedPortKindEditor(String category, boolean front) {
		addEditorToCategory(category, createDirectedTypedPortKindEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createDirectedTypedPortKindEditor() {
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
	protected void addDirectedTypedPortOptionalEditor(String category,
			boolean front) {
		addEditorToCategory(category, createDirectedTypedPortOptionalEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createDirectedTypedPortOptionalEditor() {
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
	protected void addDirectedTypedPortInitializeExpressionEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createDirectedTypedPortInitializeExpressionEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createDirectedTypedPortInitializeExpressionEditor() {
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
	protected void addTypedNamedElementDataTypeEditor(String category,
			boolean front) {
		addEditorToCategory(category, createTypedNamedElementDataTypeEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createTypedNamedElementDataTypeEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
						.getTypedNamedElement_DataType());

		editor.setTooltipMessage("The data type of this element.");

		return editor;

	}

}
