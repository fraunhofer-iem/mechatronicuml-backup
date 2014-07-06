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
			addReconfigurationRuleReconfiguredComponent_GeneralTab_Editor(null,
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addReconfigurationRuleSignature_GeneralTab_Editor(null, false);
		}

	}

	/**
	 * @generated
	 */
	protected void addReconfigurationRuleReconfiguredComponent_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createReconfigurationRuleReconfiguredComponent_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createReconfigurationRuleReconfiguredComponent_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getReconfigurationRule_ReconfiguredComponent());

		editor.setTooltipMessage("The component on which the reconfiguration rule is to be applied.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addReconfigurationRuleSignature_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createReconfigurationRuleSignature_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createReconfigurationRuleSignature_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getReconfigurationRule_Signature());

		editor.setTooltipMessage("The signature of the reconfiguration rule that defines the name as well as the\ninput and output parameters of this reconfiguration rule.");

		return editor;

	}

}
