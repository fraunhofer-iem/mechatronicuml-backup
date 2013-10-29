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
			addVertexOutgoingTransitionsEditor(
					"de.uni_paderborn.fujaba.properties.category.Transitions",
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addVertexIncomingTransitionsEditor(
					"de.uni_paderborn.fujaba.properties.category.Transitions",
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addNamedElementNameEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addVertexOutgoingTransitionsEditor(String category,
			boolean front) {
		addEditorToCategory(category, createVertexOutgoingTransitionsEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createVertexOutgoingTransitionsEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getVertex_OutgoingTransitions());

		editor.setTooltipMessage("The outgoing transitions of this vertex");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addVertexIncomingTransitionsEditor(String category,
			boolean front) {
		addEditorToCategory(category, createVertexIncomingTransitionsEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createVertexIncomingTransitionsEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getVertex_IncomingTransitions());

		editor.setTooltipMessage("The incoming transitions of this vertex");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addNamedElementNameEditor(String category, boolean front) {
		addEditorToCategory(category, createNamedElementNameEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createNamedElementNameEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.storydriven.core.CorePackage.eINSTANCE
						.getNamedElement_Name(), false);

		editor.setTooltipMessage("The name attribute of a meta-model element.");

		return editor;

	}

}
