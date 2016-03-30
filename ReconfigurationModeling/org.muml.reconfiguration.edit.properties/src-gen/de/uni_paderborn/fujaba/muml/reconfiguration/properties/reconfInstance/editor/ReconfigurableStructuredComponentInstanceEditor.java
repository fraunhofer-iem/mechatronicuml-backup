
package de.uni_paderborn.fujaba.muml.reconfiguration.properties.reconfInstance.editor;

/**
 * @generated
 */
public class ReconfigurableStructuredComponentInstanceEditor
		extends
			org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ReconfigurableStructuredComponentInstanceEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory, org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(), false);

			addPropertyEditor(createEditorName_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorComponentType_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorComponentPart_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorParentCIC_GeneralTab_Editor(), false);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists", "Lists", org.eclipse.swt.SWT.HORIZONTAL,
					true);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorPortInstances_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorEmbeddedCIC_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorControllerInstance_GeneralTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorName_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorComponentType_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorComponentPart_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorParentCIC_GeneralTab_Editor(), false);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists", "Lists", org.eclipse.swt.SWT.HORIZONTAL,
					true);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorPortInstances_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorEmbeddedCIC_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorControllerInstance_GeneralTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorControllerInstance_GeneralTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorControllerInstance_GeneralTab_Editor() {
		if (this.editorControllerInstance_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfInstancePackage.eINSTANCE
					.getReconfigurableStructuredComponentInstance_ControllerInstance();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorControllerInstance_GeneralTab = editor;
		}
		return this.editorControllerInstance_GeneralTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEmbeddedCIC_GeneralTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEmbeddedCIC_GeneralTab_Editor() {
		if (this.editorEmbeddedCIC_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.instance.InstancePackage.eINSTANCE
					.getStructuredComponentInstance_EmbeddedCIC();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The component instances and connector instances that are embedded in this component instance\nare contained by the component instance configuration.");

			this.editorEmbeddedCIC_GeneralTab = editor;
		}
		return this.editorEmbeddedCIC_GeneralTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorComponentType_GeneralTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorComponentType_GeneralTab_Editor() {
		if (this.editorComponentType_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.instance.InstancePackage.eINSTANCE
					.getComponentInstance_ComponentType();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The component type of which this instance is derived.");

			this.editorComponentType_GeneralTab = editor;
		}
		return this.editorComponentType_GeneralTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorPortInstances_GeneralTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorPortInstances_GeneralTab_Editor() {
		if (this.editorPortInstances_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.instance.InstancePackage.eINSTANCE
					.getComponentInstance_PortInstances();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The port instances that belong to this component instance. \\todosd{Why are also DiscreteSinglePortInstances of DiscreteMultiPortInstances contained here and not in the DiscreteMultiPortInstance?}");

			this.editorPortInstances_GeneralTab = editor;
		}
		return this.editorPortInstances_GeneralTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorComponentPart_GeneralTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorComponentPart_GeneralTab_Editor() {
		if (this.editorComponentPart_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.instance.InstancePackage.eINSTANCE
					.getComponentInstance_ComponentPart();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"If the component instance is contained in a structured component instance,\nthen the corresponding structure component has has component part that \nwas used to include the component type of this instance. Then, this reference \npoints to this component part. We can use this reference for deciding how \nmany instances of a particular part exist in a structured component instance\nsuch that we can enforce the cardinalities of the component part during run-time.");

			this.editorComponentPart_GeneralTab = editor;
		}
		return this.editorComponentPart_GeneralTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorParentCIC_GeneralTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorParentCIC_GeneralTab_Editor() {
		if (this.editorParentCIC_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.instance.InstancePackage.eINSTANCE
					.getComponentInstance_ParentCIC();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The component instance configuration that contains this component instance.");

			this.editorParentCIC_GeneralTab = editor;
		}
		return this.editorParentCIC_GeneralTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorName_GeneralTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorName_GeneralTab_Editor() {
		if (this.editorName_GeneralTab == null) {
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

			this.editorName_GeneralTab = editor;
		}
		return this.editorName_GeneralTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExtension_ExtensionsTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExtension_ExtensionsTab_Editor() {
		if (this.editorExtension_ExtensionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
					.getExtendableElement_Extension();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.FlattenedListPropertyEditor(
					adapterFactory, feature);

			this.editorExtension_ExtensionsTab = editor;
		}
		return this.editorExtension_ExtensionsTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ReconfigurableStructuredComponentInstanceEditor(String tab) {
		this(tab,
				de.uni_paderborn.fujaba.muml.reconfiguration.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfInstancePackage.eINSTANCE
						.getReconfigurableStructuredComponentInstance());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new ReconfigurableStructuredComponentInstanceEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.general", "property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.extensions"}).contains(tab);
		}
	}

}
