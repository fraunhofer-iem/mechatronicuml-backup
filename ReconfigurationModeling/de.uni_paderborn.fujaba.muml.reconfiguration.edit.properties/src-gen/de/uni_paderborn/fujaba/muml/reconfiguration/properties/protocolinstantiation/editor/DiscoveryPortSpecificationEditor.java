package de.uni_paderborn.fujaba.muml.reconfiguration.properties.protocolinstantiation.editor;

/**
 * @generated
 */
public class DiscoveryPortSpecificationEditor
		extends
			de.uni_paderborn.fujaba.muml.reconfiguration.properties.protocolinstantiation.editor.BroadcastPortSpecificationEditor {

	/**
	 * @generated
	 */
	public DiscoveryPortSpecificationEditor(String tab,
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

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public DiscoveryPortSpecificationEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.reconfiguration.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.ProtocolinstantiationPackage.eINSTANCE
						.getDiscoveryPortSpecification());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new DiscoveryPortSpecificationEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.extensions"})
					.contains(tab);
		}
	}

}
