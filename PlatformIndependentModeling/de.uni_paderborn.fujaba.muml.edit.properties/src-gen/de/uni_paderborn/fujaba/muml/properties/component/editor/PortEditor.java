package de.uni_paderborn.fujaba.muml.properties.component.editor;

/**
 * @generated
 */
public abstract class PortEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.connector.editor.ConnectorEndpointEditor {

	/**
	 * @generated
	 */
	public PortEditor(String tab,
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
			addComponent_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addName_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addComponent_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createComponent_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createComponent_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
				.getPort_Component();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The component, this port belongs to. Theoretically the bounds\nshould be 1..1, but that would prevent the possibility for\nComponentPart.portsDerived to be a containment reference\n(see ComponentPart.portsDerived)");

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
