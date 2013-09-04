package de.uni_paderborn.fujaba.muml.properties.component.editor;

/**
 * @generated
 */
public class ComponentPartEditor
		extends
			org.storydriven.core.properties.core.editor.NamedElementEditor {

	/**
	 * @generated
	 */
	public ComponentPartEditor(
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

		addComponentPartCardinalityEditor(null, false);

		addCommentableElementCommentEditor(null, true);

	}

	/**
	 * @generated
	 */
	protected void addComponentPartCardinalityEditor(String category,
			boolean front) {
		addEditorToCategory(category, createComponentPartCardinalityEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createComponentPartCardinalityEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getComponentPart_Cardinality());

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

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ComponentPartEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getComponentPart());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new ComponentPartEditor();
		}
	}

}
