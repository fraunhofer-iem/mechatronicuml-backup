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
	public HybridPortEditor(String tab,
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

		addHybridPortSamplingIntervalEditor(null, false);

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
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getHybridPort_SamplingInterval());

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public HybridPortEditor(String tab) {
		this(
				tab,
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
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new HybridPortEditor(tab);
		}
	}

}
