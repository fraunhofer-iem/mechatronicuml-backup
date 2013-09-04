package de.uni_paderborn.fujaba.muml.properties.component.editor;

/**
 * @generated
 */
public class HybridPortEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.component.editor.DirectedTypedPortEditor {

	/**
	 * @generated
	 */
	public HybridPortEditor(
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

		addHybridPortSamplingIntervalEditor(null, true);

	}

	/**
	 * @generated
	 */
	protected void addHybridPortSamplingIntervalEditor(String category,
			boolean front) {
		addEditorToCategory(category, createHybridPortSamplingIntervalEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createHybridPortSamplingIntervalEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getHybridPort_SamplingInterval());

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public HybridPortEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getHybridPort());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new HybridPortEditor();
		}
	}

}
