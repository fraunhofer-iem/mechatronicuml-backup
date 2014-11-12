package org.storydriven.storydiagrams.properties.activities.editor;

/**
 * @generated
 */
public class ActivityCallNodeEditor
		extends
			org.storydriven.storydiagrams.properties.activities.editor.ActivityNodeEditor {

	/**
	 * @generated
	 */
	public ActivityCallNodeEditor(String tab,
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
			addCalledActivity_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCallee_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addCalledActivity_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createCalledActivity_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCalledActivity_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.activities.ActivitiesPackage.eINSTANCE
				.getActivityCallNode_CalledActivity();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("References all activities that are to be considered for the polymorphic dispatching of the call. All activities must have the same call signature.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addCallee_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createCallee_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCallee_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.calls.CallsPackage.eINSTANCE
				.getInvocation_Callee();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ActivityCallNodeEditor(String tab) {
		this(
				tab,
				org.storydriven.storydiagrams.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				org.storydriven.storydiagrams.activities.ActivitiesPackage.eINSTANCE
						.getActivityCallNode());
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
			return new ActivityCallNodeEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.extensions",
							"property.tab.documentation",
							"property.tab.general"}).contains(tab);
		}
	}

}
