package de.uni_paderborn.fujaba.muml.reconfiguration.properties.reconfiguration.editor;

/**
 * @generated
 */
public abstract class ReconfigurationRuleEditor
		extends
			org.storydriven.core.properties.core.editor.CommentableElementEditor {

	/**
	 * @generated
	 */
	public ReconfigurationRuleEditor(String tab,
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
			addReconfiguredComponent_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addSignature_GeneralTab_Editor(null, false);
		}

	}

	/**
	 * @generated
	 */
	protected void addReconfiguredComponent_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createReconfiguredComponent_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createReconfiguredComponent_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
				.getReconfigurationRule_ReconfiguredComponent();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The component on which the reconfiguration rule is to be applied.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addSignature_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createSignature_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createSignature_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
				.getReconfigurationRule_Signature();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The signature of the reconfiguration rule that defines the name as well as the\ninput and output parameters of this reconfiguration rule.");

		return editor;

	}

}
