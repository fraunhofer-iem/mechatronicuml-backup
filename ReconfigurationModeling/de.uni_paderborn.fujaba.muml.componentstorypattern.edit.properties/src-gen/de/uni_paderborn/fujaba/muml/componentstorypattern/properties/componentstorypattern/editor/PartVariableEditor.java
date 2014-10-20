package de.uni_paderborn.fujaba.muml.componentstorypattern.properties.componentstorypattern.editor;

/**
 * @generated
 */
public abstract class PartVariableEditor
		extends
			de.uni_paderborn.fujaba.muml.componentstorypattern.properties.componentstorypattern.editor.ComponentStoryPatternVariableEditor {

	/**
	 * @generated
	 */
	public PartVariableEditor(String tab,
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
			addType_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addType_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createType_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createType_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
				.getPartVariable_Type();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		return editor;

	}

}
