package de.uni_paderborn.fujaba.muml.properties.instance.editor;

/**
 * @generated
 */
public class DiscreteSinglePortInstanceEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.instance.editor.DiscretePortInstanceEditor {

	/**
	 * @generated
	 */
	public DiscreteSinglePortInstanceEditor(
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

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public DiscreteSinglePortInstanceEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getDiscreteSinglePortInstance());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new DiscreteSinglePortInstanceEditor();
		}
	}

}
