
package org.muml.pm.hardware.properties.hwresource.editor;

/**
 * @generated
 */
public class CacheEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public CacheEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
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

			addPropertyEditor(createEditorCommunicationResources_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorParentStructuredResource_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorMemoryAccess_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorMemoryType_property_tab_generalTab_Editor(), false);

			addSubCategory("org.muml.ape.category.Booleans", "Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Booleans",
					createEditorIsVolatile_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorWritePolicy_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorReplacementPolicy_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorNbSets_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorAssociativity_property_tab_generalTab_Editor(), false);

			addSubCategory("org.muml.ape.category.Lists", "Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Lists",
					createEditorUsedByProcessor_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorName_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorCommunicationResources_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorParentStructuredResource_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorMemoryAccess_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorMemoryType_property_tab_generalTab_Editor(), false);

			addSubCategory("org.muml.ape.category.Booleans", "Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Booleans",
					createEditorIsVolatile_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorWritePolicy_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorReplacementPolicy_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorNbSets_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorAssociativity_property_tab_generalTab_Editor(), false);

			addSubCategory("org.muml.ape.category.Lists", "Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Lists",
					createEditorUsedByProcessor_property_tab_generalTab_Editor(), false);

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

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorWritePolicy_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorWritePolicy_property_tab_generalTab_Editor() {
		if (this.editorWritePolicy_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
					.getCache_WritePolicy();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Determines the write policy of the Cache.");

			this.editorWritePolicy_property_tab_generalTab = editor;
		}
		return this.editorWritePolicy_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorReplacementPolicy_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorReplacementPolicy_property_tab_generalTab_Editor() {
		if (this.editorReplacementPolicy_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
					.getCache_ReplacementPolicy();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Determines the replacement policy for this Cache.");

			this.editorReplacementPolicy_property_tab_generalTab = editor;
		}
		return this.editorReplacementPolicy_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorNbSets_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorNbSets_property_tab_generalTab_Editor() {
		if (this.editorNbSets_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
					.getCache_NbSets();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.SpinnerPropertyEditor(
					adapterFactory, feature, 0);

			editor.setTooltipMessage(
					"Specifies the number of sets.\n If the nbSets are one, the cache is full-associative.");

			this.editorNbSets_property_tab_generalTab = editor;
		}
		return this.editorNbSets_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorAssociativity_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorAssociativity_property_tab_generalTab_Editor() {
		if (this.editorAssociativity_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
					.getCache_Associativity();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.SpinnerPropertyEditor(
					adapterFactory, feature, 0);

			editor.setTooltipMessage(
					"The associativity of this cache. It represents the number of blocks in one set. An associativity of 1 represents a direct mapped cache.");

			this.editorAssociativity_property_tab_generalTab = editor;
		}
		return this.editorAssociativity_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorUsedByProcessor_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorUsedByProcessor_property_tab_generalTab_Editor() {
		if (this.editorUsedByProcessor_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
					.getCache_UsedByProcessor();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The processors which use this cache.");

			this.editorUsedByProcessor_property_tab_generalTab = editor;
		}
		return this.editorUsedByProcessor_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorMemoryAccess_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorMemoryAccess_property_tab_generalTab_Editor() {
		if (this.editorMemoryAccess_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
					.getMemoryResource_MemoryAccess();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Specifies what kind of access is allowed for this MemoryResource.");

			this.editorMemoryAccess_property_tab_generalTab = editor;
		}
		return this.editorMemoryAccess_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorIsVolatile_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorIsVolatile_property_tab_generalTab_Editor() {
		if (this.editorIsVolatile_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
					.getMemoryResource_IsVolatile();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"Specifies if this MemoryResource is volatile or non-volatile. \nNon-volatile Memory (i.e. ROM) could be used to store the binary code.\nVolatile Memory (i.e SRAM) is used during execution of code.");

			this.editorIsVolatile_property_tab_generalTab = editor;
		}
		return this.editorIsVolatile_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorMemoryType_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorMemoryType_property_tab_generalTab_Editor() {
		if (this.editorMemoryType_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
					.getMemoryResource_MemoryType();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The type of this MemoryResource.");

			this.editorMemoryType_property_tab_generalTab = editor;
		}
		return this.editorMemoryType_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorParentStructuredResource_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorParentStructuredResource_property_tab_generalTab_Editor() {
		if (this.editorParentStructuredResource_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
					.getAtomicResource_ParentStructuredResource();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			{
				editor.setInput(input);
				editor.registerOCLAdapter(new org.eclipse.emf.common.notify.impl.AdapterImpl() {
					@Override
					public void notifyChanged(org.eclipse.emf.common.notify.Notification notification) {
						editor.updateEnablement(true);
					}
				});

				final org.eclipse.ocl.pivot.utilities.OCL ocl = org.eclipse.ocl.pivot.utilities.OCL.newInstance();
				org.eclipse.ocl.pivot.utilities.OCLHelper helper = ocl.createOCLHelper(feature);

				try {
					final org.eclipse.ocl.pivot.ExpressionInOCL oclExpression = helper.createQuery("true");

					org.eclipse.jface.viewers.IFilter filter = new org.eclipse.jface.viewers.IFilter() {
						@Override
						public boolean select(Object object) {
							return object != null && Boolean.TRUE.equals(ocl.evaluate(object, oclExpression));
						}
					};
					if (filter != null) {
						editor.addReadOnlyFilter(filter);
					}

				} catch (org.eclipse.ocl.pivot.utilities.ParserException e) {
					e.printStackTrace();
				}
			}

			editor.setTooltipMessage("The StructuredResource, this AtomicResource belongs to.");

			this.editorParentStructuredResource_property_tab_generalTab = editor;
		}
		return this.editorParentStructuredResource_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorCommunicationResources_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorCommunicationResources_property_tab_generalTab_Editor() {
		if (this.editorCommunicationResources_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
					.getResource_CommunicationResources();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The HWPort of this ResourceType.\n\n");

			this.editorCommunicationResources_property_tab_generalTab = editor;
		}
		return this.editorCommunicationResources_property_tab_generalTab;
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
	public CacheEditor(String tab) {
		this(tab, org.muml.pm.hardware.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE.getCache());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new CacheEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.general", "property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.general", "property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.extensions"}).contains(tab);
		}
	}

}
