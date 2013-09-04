package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public abstract class VertexEditor
		extends
			org.storydriven.core.properties.core.editor.NamedElementEditor {

	/**
	 * @generated
	 */
	public VertexEditor(
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		super.createProperties();

		addSubCategory("de.fujaba.properties.category.Lists", "Lists",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		addVertexOutgoingTransitionsEditor(
				"de.fujaba.properties.category.Lists", true);

		addVertexIncomingTransitionsEditor(
				"de.fujaba.properties.category.Lists", true);

		addCommentableElementCommentEditor(null, true);

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
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createVertexOutgoingTransitionsEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getVertex_OutgoingTransitions());

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
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createVertexIncomingTransitionsEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getVertex_IncomingTransitions());

	}
	/**
	 * @generated
	 */
	protected void addCommentableElementCommentEditor(String category,
			boolean front) {
		addEditorToCategory(category, createCommentableElementCommentEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCommentableElementCommentEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.storydriven.core.CorePackage.eINSTANCE
						.getCommentableElement_Comment(), false);

	}

}
