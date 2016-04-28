
package org.muml.pm.hardware.properties.hwplatforminstance.editor;

/**
 * @generated
 */
public class HWPlatformInstanceConfigurationEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public HWPlatformInstanceConfigurationEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory, org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorComment_property_tab_documentationTab_Editor(), false);

			addPropertyEditor(createEditorParentHWPlatformInstance_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorHwplatformInstances_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorNetworkingHardwareInstances_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorResources_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorNetworkConnectorInstances_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorParentHWPlatformInstance_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorHwplatformInstances_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorNetworkingHardwareInstances_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorResources_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorNetworkConnectorInstances_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

			addPropertyEditor(createEditorComment_property_tab_documentationTab_Editor(), false);

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.condition".equals(tab)) { // Tab Condition

		} else if ("property.tab.effect".equals(tab)) { // Tab Effect

		} else if ("property.tab.deadline".equals(tab)) { // Tab Deadline

		} else if ("property.tab.sampling".equals(tab)) { // Tab Sampling

		} else if ("property.tab.message".equals(tab)) { // Tab Message

		} else if ("property.tab.behavior".equals(tab)) { // Tab Behavior

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorParentHWPlatformInstance_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorParentHWPlatformInstance_property_tab_generalTab_Editor() {
		if (this.editorParentHWPlatformInstance_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
					.getHWPlatformInstanceConfiguration_ParentHWPlatformInstance();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The parent HWPlatformInstance is which this HWPlatformInstanceConfiguration is embedded.\nThe bound is 0..1, because the root HWPlatformInstanceConfiguration is not embedded in any HWPlatformInstance.");

			this.editorParentHWPlatformInstance_property_tab_generalTab = editor;
		}
		return this.editorParentHWPlatformInstance_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorHwplatformInstances_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorHwplatformInstances_property_tab_generalTab_Editor() {
		if (this.editorHwplatformInstances_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
					.getHWPlatformInstanceConfiguration_HwplatformInstances();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The set of HWPlatformInstances of this HWPlatformInstanceConfiguration.");

			this.editorHwplatformInstances_property_tab_generalTab = editor;
		}
		return this.editorHwplatformInstances_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorNetworkingHardwareInstances_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorNetworkingHardwareInstances_property_tab_generalTab_Editor() {
		if (this.editorNetworkingHardwareInstances_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
					.getHWPlatformInstanceConfiguration_NetworkingHardwareInstances();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The NetworkingHardwareInstances of this HWPlatformInstanceConfiguration. \n");

			this.editorNetworkingHardwareInstances_property_tab_generalTab = editor;
		}
		return this.editorNetworkingHardwareInstances_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorResources_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorResources_property_tab_generalTab_Editor() {
		if (this.editorResources_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
					.getHWPlatformInstanceConfiguration_Resources();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The ResourceInstances that belong to this HWPlatformInstance.");

			this.editorResources_property_tab_generalTab = editor;
		}
		return this.editorResources_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorNetworkConnectorInstances_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorNetworkConnectorInstances_property_tab_generalTab_Editor() {
		if (this.editorNetworkConnectorInstances_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
					.getHWPlatformInstanceConfiguration_NetworkConnectorInstances();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The NetworkingConnectorInstances of this HWPlatformInstanceConfiguration. \nNetworkConnectorInstances are used to connect different HWPlatformInstances via bridges or HWPortInstances.");

			this.editorNetworkConnectorInstances_property_tab_generalTab = editor;
		}
		return this.editorNetworkConnectorInstances_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorComment_property_tab_documentationTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorComment_property_tab_documentationTab_Editor() {
		if (this.editorComment_property_tab_documentationTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.mumlcore.CorePackage.eINSTANCE
					.getCommentableElement_Comment();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage(
					"The comment string that can be used to attach arbitrary information to CommentableElements.");

			this.editorComment_property_tab_documentationTab = editor;
		}
		return this.editorComment_property_tab_documentationTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExtensions_property_tab_extensionsTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExtensions_property_tab_extensionsTab_Editor() {
		if (this.editorExtensions_property_tab_extensionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.mumlcore.CorePackage.eINSTANCE
					.getExtendableElement_Extensions();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.FlattenedListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Extendable Elements can be extended by an Extension.");

			this.editorExtensions_property_tab_extensionsTab = editor;
		}
		return this.editorExtensions_property_tab_extensionsTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public HWPlatformInstanceConfigurationEditor(String tab) {
		this(tab, org.muml.pm.hardware.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
						.getHWPlatformInstanceConfiguration());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new HWPlatformInstanceConfigurationEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.general", "property.tab.general",
					"property.tab.documentation", "property.tab.extensions"}).contains(tab);
		}
	}

}
