
package de.uni_paderborn.fujaba.muml.hardware.properties.hwplatforminstance.editor;

/**
 * @generated
 */
public class HWPlatformInstanceEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public HWPlatformInstanceEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorExtension_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorName_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorHwplatformType_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorEmbeddedHPIC_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorParentHPIC_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorDelegationPorts_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorName_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorHwplatformType_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorEmbeddedHPIC_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorParentHPIC_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorDelegationPorts_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtension_property_tab_extensionsTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorHwplatformType_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorHwplatformType_property_tab_generalTab_Editor() {
		if (this.editorHwplatformType_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
					.getHWPlatformInstance_HwplatformType();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The HWPlatform type of which this instance is derived.");

			this.editorHwplatformType_property_tab_generalTab = editor;
		}
		return this.editorHwplatformType_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEmbeddedHPIC_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEmbeddedHPIC_property_tab_generalTab_Editor() {
		if (this.editorEmbeddedHPIC_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
					.getHWPlatformInstance_EmbeddedHPIC();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The embedded Hardware Platform Instance Configuration.\n");

			this.editorEmbeddedHPIC_property_tab_generalTab = editor;
		}
		return this.editorEmbeddedHPIC_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorParentHPIC_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorParentHPIC_property_tab_generalTab_Editor() {
		if (this.editorParentHPIC_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
					.getHWPlatformInstance_ParentHPIC();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			{
				final org.eclipse.ocl.ecore.OCLExpression expression = org.muml.ape.runtime.RuntimePlugin
						.createOCLExpression("true", feature, getEClass());
				editor.setInput(input);
				editor.registerOCLAdapter(expression, new org.eclipse.emf.common.notify.impl.AdapterImpl() {
					@Override
					public void notifyChanged(org.eclipse.emf.common.notify.Notification notification) {
						boolean visibleBefore = editor.isVisible();
						editor.updateVisibility(true);

						// Set default value, if we are hiding the editor and it was not hidden before.
						if (!editor.isVisible() && visibleBefore) {
							editor.setDefaultValue();
						}
					}
				});
				final org.eclipse.ocl.Query<org.eclipse.emf.ecore.EClassifier, ?, ?> query = org.muml.ape.runtime.RuntimePlugin.OCL_ECORE
						.createQuery(expression);
				org.eclipse.jface.viewers.IFilter filter = new org.eclipse.jface.viewers.IFilter() {

					@Override
					public boolean select(Object object) {
						return object != null && Boolean.TRUE.equals(query.evaluate(object));
					}

				};
				if (filter != null) {
					editor.addReadOnlyFilter(filter);
				}
			}

			editor.setTooltipMessage(
					"The Hardware Platform Instance Configuration in which this HWPlatformInstance is embedded.\n");

			this.editorParentHPIC_property_tab_generalTab = editor;
		}
		return this.editorParentHPIC_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorDelegationPorts_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorDelegationPorts_property_tab_generalTab_Editor() {
		if (this.editorDelegationPorts_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
					.getHWPlatformInstance_DelegationPorts();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The delegation ports of this HWPlatformInstance. They are derived from the HWPlatform type.");

			this.editorDelegationPorts_property_tab_generalTab = editor;
		}
		return this.editorDelegationPorts_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorName_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorName_property_tab_generalTab_Editor() {
		if (this.editorName_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
					.getNamedElement_Name();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			{
				final org.eclipse.ocl.ecore.OCLExpression initExpression = org.muml.ape.runtime.RuntimePlugin
						.createOCLExpression(
								"let prefix : String = self.oclAsType(ecore::EObject).eClass().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n	let provisionalName : String = prefix.concat(e.toString()) in\n	if self.oclAsType(ecore::EObject).eContainer().eContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n		e + 1\n	else\n		e\n	endif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)",
								feature, getEClass());
				final org.eclipse.ocl.Query<org.eclipse.emf.ecore.EClassifier, ?, ?> query = org.muml.ape.runtime.RuntimePlugin.OCL_ECORE
						.createQuery(initExpression);
				if (query != null) {
					editor.setInitializeQuery(query);
				}
			}

			editor.setTooltipMessage("The name attribute of a meta-model element.");

			this.editorName_property_tab_generalTab = editor;
		}
		return this.editorName_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExtension_property_tab_extensionsTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExtension_property_tab_extensionsTab_Editor() {
		if (this.editorExtension_property_tab_extensionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
					.getExtendableElement_Extension();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.FlattenedListPropertyEditor(
					adapterFactory, feature);

			this.editorExtension_property_tab_extensionsTab = editor;
		}
		return this.editorExtension_property_tab_extensionsTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public HWPlatformInstanceEditor(String tab) {
		this(tab, de.uni_paderborn.fujaba.muml.hardware.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
						.getHWPlatformInstance());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new HWPlatformInstanceEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.general", "property.tab.general", "property.tab.extensions"})
					.contains(tab);
		}
	}

}
