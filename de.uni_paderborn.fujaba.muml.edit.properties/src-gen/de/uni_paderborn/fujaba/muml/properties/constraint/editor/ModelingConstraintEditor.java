package de.uni_paderborn.fujaba.muml.properties.constraint.editor;

/**
 * @generated
 */
public class ModelingConstraintEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.constraint.editor.ConstraintEditor {

	/**
	 * @generated
	 */
	public ModelingConstraintEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory());
	}

	/**
	 * @generated
	 */
	public ModelingConstraintEditor(
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * @generated
	 */
	public void initialize() {

		super.initialize();
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new ModelingConstraintEditor();
		}
	}

}
