package de.uni_paderborn.fujaba.muml.properties.component.editor;

/**
 * @generated
 */
public class DiscretePortEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.component.editor.PortEditor {

	/**
	 * @generated
	 */
	public DiscretePortEditor(
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

		addDiscretePortRefinedRoleEditor(null, true);

	}

	/**
	 * @generated
	 */
	protected void addDiscretePortRefinedRoleEditor(String category,
			boolean front) {
		addEditorToCategory(category, createDiscretePortRefinedRoleEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDiscretePortRefinedRoleEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getDiscretePort_RefinedRole());

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public DiscretePortEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getDiscretePort());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new DiscretePortEditor();
		}
	}

}
