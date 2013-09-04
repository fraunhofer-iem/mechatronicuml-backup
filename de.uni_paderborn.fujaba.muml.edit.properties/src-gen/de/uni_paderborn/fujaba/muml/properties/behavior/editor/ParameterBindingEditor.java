package de.uni_paderborn.fujaba.muml.properties.behavior.editor;

/**
 * @generated
 */
public class ParameterBindingEditor
		extends
			org.storydriven.core.properties.core.editor.ExtendableElementEditor {

	/**
	 * @generated
	 */
	public ParameterBindingEditor(
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

		addParameterBindingValueEditor(null, false);

	}

	/**
	 * @generated
	 */
	protected void addParameterBindingValueEditor(String category, boolean front) {
		addEditorToCategory(category, createParameterBindingValueEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createParameterBindingValueEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
						.getParameterBinding_Value());

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ParameterBindingEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
						.getParameterBinding());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new ParameterBindingEditor();
		}
	}

}
