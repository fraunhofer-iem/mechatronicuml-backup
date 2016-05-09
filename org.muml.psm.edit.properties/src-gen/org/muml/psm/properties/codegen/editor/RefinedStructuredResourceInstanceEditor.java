
package org.muml.psm.properties.codegen.editor;

/**
 * @generated
 */
public class RefinedStructuredResourceInstanceEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public RefinedStructuredResourceInstanceEditor(String tab,
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

			addPropertyEditor(createEditorName_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorResourceType_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorHwports_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorEmbeddedAtomicResourceInstances_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorAllocatedAtomicComponentInstances_property_tab_psmTab_Editor(), false);

		} else if ("property.tab.psm".equals(tab)) { // Tab PSM

			addPropertyEditor(createEditorAllocatedAtomicComponentInstances_property_tab_psmTab_Editor(), false);

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorName_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorResourceType_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorHwports_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorEmbeddedAtomicResourceInstances_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

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

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorAllocatedAtomicComponentInstances_property_tab_psmTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorAllocatedAtomicComponentInstances_property_tab_psmTab_Editor() {
		if (this.editorAllocatedAtomicComponentInstances_property_tab_psmTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.psm.codegen.CodegenPackage.eINSTANCE
					.getRefinedStructuredResourceInstance_AllocatedAtomicComponentInstances();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The ComponentInstances which are allocated to this StructuredResourceInstance.");

			this.editorAllocatedAtomicComponentInstances_property_tab_psmTab = editor;
		}
		return this.editorAllocatedAtomicComponentInstances_property_tab_psmTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEmbeddedAtomicResourceInstances_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEmbeddedAtomicResourceInstances_property_tab_generalTab_Editor() {
		if (this.editorEmbeddedAtomicResourceInstances_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
					.getStructuredResourceInstance_EmbeddedAtomicResourceInstances();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The AtomicResourceInstances which are contained in this StructuredResourceInstance.\nThe AtomicResourceInstances are determined by the AtomicResources which are embedded in the StructuredResource type.");

			this.editorEmbeddedAtomicResourceInstances_property_tab_generalTab = editor;
		}
		return this.editorEmbeddedAtomicResourceInstances_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorResourceType_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorResourceType_property_tab_generalTab_Editor() {
		if (this.editorResourceType_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
					.getResourceInstance_ResourceType();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The resource type of which this ResourceInstance is derived.");

			this.editorResourceType_property_tab_generalTab = editor;
		}
		return this.editorResourceType_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorHwports_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorHwports_property_tab_generalTab_Editor() {
		if (this.editorHwports_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
					.getResourceInstance_Hwports();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The HWPort of this ResourceType.\n\n");

			this.editorHwports_property_tab_generalTab = editor;
		}
		return this.editorHwports_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorName_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorName_property_tab_generalTab_Editor() {
		if (this.editorName_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
					.getNamedElement_Name();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			{
				final org.eclipse.ocl.pivot.utilities.OCL ocl = org.eclipse.ocl.pivot.utilities.OCL.newInstance();
				org.eclipse.ocl.pivot.utilities.OCLHelper helper = ocl.createOCLHelper(feature);

				try {
					final org.eclipse.ocl.pivot.ExpressionInOCL oclExpression = helper.createQuery(
							"let prefix : String = self.oclType().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n	let provisionalName : String = prefix.concat(e.toString()) in\n	if self.oclContainer().oclContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n		e + 1\n	else\n		e\n	endif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)");
					editor.setInitializeExpression(oclExpression);
				} catch (org.eclipse.ocl.pivot.utilities.ParserException e) {
					e.printStackTrace();
				}
			}

			editor.setTooltipMessage("The name attribute of a meta-model element.");

			this.editorName_property_tab_generalTab = editor;
		}
		return this.editorName_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExtensions_property_tab_extensionsTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExtensions_property_tab_extensionsTab_Editor() {
		if (this.editorExtensions_property_tab_extensionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
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
	public RefinedStructuredResourceInstanceEditor(String tab) {
		this(tab, org.muml.psm.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.psm.codegen.CodegenPackage.eINSTANCE.getRefinedStructuredResourceInstance());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new RefinedStructuredResourceInstanceEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.psm", "property.tab.general",
					"property.tab.general", "property.tab.general", "property.tab.general", "property.tab.extensions"})
					.contains(tab);
		}
	}

}
