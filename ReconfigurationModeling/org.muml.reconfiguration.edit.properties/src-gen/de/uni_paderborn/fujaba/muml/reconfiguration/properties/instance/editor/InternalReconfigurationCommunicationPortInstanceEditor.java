package de.uni_paderborn.fujaba.muml.reconfiguration.properties.instance.editor;

/**
 * @generated
 */
public class InternalReconfigurationCommunicationPortInstanceEditor
		extends
			de.uni_paderborn.fujaba.muml.reconfiguration.properties.instance.editor.ReconfigurationPortInstanceEditor {

	/**
	 * @generated
	 */
	public InternalReconfigurationCommunicationPortInstanceEditor(String tab,
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
	public InternalReconfigurationCommunicationPortInstanceEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.reconfiguration.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.reconfiguration.instance.InstancePackage.eINSTANCE
						.getInternalReconfigurationCommunicationPortInstance());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new InternalReconfigurationCommunicationPortInstanceEditor(
					tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general",
							"property.tab.documentation",
							"property.tab.extensions", "property.tab.general",
							"property.tab.general"}).contains(tab);
		}
	}

}
