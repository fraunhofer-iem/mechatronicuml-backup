package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public abstract class VertexEditor
		extends
			org.storydriven.core.properties.core.editor.CommentableElementEditor {

	/**
	 * @generated
	 */
	public VertexEditor(String tab,
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

		addSubCategory(
				"de.uni_paderborn.fujaba.properties.category.Transitions",
				"Transitions", org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addOutgoingTransitions_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Transitions",
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addIncomingTransitions_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Transitions",
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addName_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addOutgoingTransitions_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createOutgoingTransitions_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createOutgoingTransitions_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getVertex_OutgoingTransitions();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The outgoing transitions of this vertex");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addIncomingTransitions_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createIncomingTransitions_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createIncomingTransitions_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getVertex_IncomingTransitions();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The incoming transitions of this vertex");

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
