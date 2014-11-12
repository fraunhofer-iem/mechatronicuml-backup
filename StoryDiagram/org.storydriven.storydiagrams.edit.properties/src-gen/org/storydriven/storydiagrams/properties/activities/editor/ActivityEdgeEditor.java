package org.storydriven.storydiagrams.properties.activities.editor;

/**
 * @generated
 */
public class ActivityEdgeEditor
		extends
			org.storydriven.core.properties.core.editor.ExtendableElementEditor {

	/**
	 * @generated
	 */
	public ActivityEdgeEditor(String tab,
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
			addTarget_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addSource_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addGuard_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addTarget_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createTarget_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createTarget_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.activities.ActivitiesPackage.eINSTANCE
				.getActivityEdge_Target();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The target node of this ActivityEdge.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addSource_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createSource_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createSource_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.activities.ActivitiesPackage.eINSTANCE
				.getActivityEdge_Source();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The source node of this ActivityEdge.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addGuard_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createGuard_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createGuard_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.activities.ActivitiesPackage.eINSTANCE
				.getActivityEdge_Guard();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The guard defines the kind of the activity edge. The possible kinds of guards are specified by the EdgeGuard enum.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ActivityEdgeEditor(String tab) {
		this(
				tab,
				org.storydriven.storydiagrams.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				org.storydriven.storydiagrams.activities.ActivitiesPackage.eINSTANCE
						.getActivityEdge());
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
			return new ActivityEdgeEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.extensions"}).contains(tab);
		}
	}

}
