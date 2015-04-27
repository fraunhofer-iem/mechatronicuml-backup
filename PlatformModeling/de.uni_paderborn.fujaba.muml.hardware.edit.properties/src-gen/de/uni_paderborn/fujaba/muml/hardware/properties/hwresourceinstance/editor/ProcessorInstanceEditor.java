package de.uni_paderborn.fujaba.muml.hardware.properties.hwresourceinstance.editor;

/**
 * @generated
 */
public class ProcessorInstanceEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ProcessorInstanceEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(),
					false);

			addPropertyEditor(createEditorName_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorResourceType_GeneralTab_Editor(),
					false);

			addPropertyEditor(createEditorFrequency_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorMIPS_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorCPI_GeneralTab_Editor(), false);

			addPropertyEditor(
					createEditorOwnedCacheInstance_GeneralTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorName_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorResourceType_GeneralTab_Editor(),
					false);

			addPropertyEditor(createEditorFrequency_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorMIPS_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorCPI_GeneralTab_Editor(), false);

			addPropertyEditor(
					createEditorOwnedCacheInstance_GeneralTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(),
					false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorMIPS_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorMIPS_GeneralTab_Editor() {
		if (this.editorMIPS_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
					.getProcessorInstance_MIPS();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("The MIPS-Rate (Million instructions per second) of this ProcessorInstance.");

			this.editorMIPS_GeneralTab = editor;
		}
		return this.editorMIPS_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorCPI_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorCPI_GeneralTab_Editor() {
		if (this.editorCPI_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
					.getProcessorInstance_CPI();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("The average count of cycles per instruction (CPI) of this ProcessorInstance.");

			this.editorCPI_GeneralTab = editor;
		}
		return this.editorCPI_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOwnedCacheInstance_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorOwnedCacheInstance_GeneralTab_Editor() {
		if (this.editorOwnedCacheInstance_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
					.getProcessorInstance_OwnedCacheInstance();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The CacheInstance this ProcessorInstance uses.");

			this.editorOwnedCacheInstance_GeneralTab = editor;
		}
		return this.editorOwnedCacheInstance_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorFrequency_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorFrequency_GeneralTab_Editor() {
		if (this.editorFrequency_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
					.getComputingResourceInstance_Frequency();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The frequency or clock rate of this ComputingResource.");

			this.editorFrequency_GeneralTab = editor;
		}
		return this.editorFrequency_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorResourceType_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorResourceType_GeneralTab_Editor() {
		if (this.editorResourceType_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
					.getResourceInstance_ResourceType();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The resource type of which this ResourceInstance is derived.");

			this.editorResourceType_GeneralTab = editor;
		}
		return this.editorResourceType_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorName_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorName_GeneralTab_Editor() {
		if (this.editorName_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.CorePackage.eINSTANCE
					.getNamedElement_Name();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			{
				final org.eclipse.ocl.ecore.OCLExpression initExpression = de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin
						.createOCLExpression(
								"let prefix : String = self.oclAsType(ecore::EObject).eClass().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n	let provisionalName : String = prefix.concat(e.toString()) in\n	if self.oclAsType(ecore::EObject).eContainer().eContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n		e + 1\n	else\n		e\n	endif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)",
								feature, getEClass());
				final org.eclipse.ocl.Query<org.eclipse.emf.ecore.EClassifier, ?, ?> query = de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin.OCL_ECORE
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

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExtension_ExtensionsTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExtension_ExtensionsTab_Editor() {
		if (this.editorExtension_ExtensionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.CorePackage.eINSTANCE
					.getExtendableElement_Extension();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.FlattenedListPropertyEditor(
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
	public ProcessorInstanceEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.hardware.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
						.getProcessorInstance());
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
			return new ProcessorInstanceEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.extensions"}).contains(tab);
		}
	}

}
