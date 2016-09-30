
package org.muml.pm.hardware.properties.hwresource.editor;

/**
 * @generated
 */
public class ProcessorEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ProcessorEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
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

			addPropertyEditor(createEditorOwnedCache_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorArchitecture_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorFamily_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorNbCores_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorNbPipelineStages_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorName_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorCommunicationResources_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorParentStructuredResource_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorOwnedCache_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorArchitecture_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorFamily_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorNbCores_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorNbPipelineStages_property_tab_generalTab_Editor(), false);

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

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOwnedCache_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorOwnedCache_property_tab_generalTab_Editor() {
		if (this.editorOwnedCache_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
					.getProcessor_OwnedCache();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The Cache which belongs to this Processor.");

			this.editorOwnedCache_property_tab_generalTab = editor;
		}
		return this.editorOwnedCache_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorArchitecture_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorArchitecture_property_tab_generalTab_Editor() {
		if (this.editorArchitecture_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
					.getProcessor_Architecture();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The architecture of this Processor (i.e. RISC,CISC,..).");

			this.editorArchitecture_property_tab_generalTab = editor;
		}
		return this.editorArchitecture_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorFamily_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorFamily_property_tab_generalTab_Editor() {
		if (this.editorFamily_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
					.getProcessor_Family();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("The family of this Processor (i.e. x86, ARM, MIPS,..).");

			this.editorFamily_property_tab_generalTab = editor;
		}
		return this.editorFamily_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorNbCores_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorNbCores_property_tab_generalTab_Editor() {
		if (this.editorNbCores_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
					.getProcessor_NbCores();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The number of cores of this Processor.");

			this.editorNbCores_property_tab_generalTab = editor;
		}
		return this.editorNbCores_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorNbPipelineStages_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorNbPipelineStages_property_tab_generalTab_Editor() {
		if (this.editorNbPipelineStages_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
					.getProcessor_NbPipelineStages();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The number of pipelines for this processor.");

			this.editorNbPipelineStages_property_tab_generalTab = editor;
		}
		return this.editorNbPipelineStages_property_tab_generalTab;
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

				try {
					final org.eclipse.ocl.pivot.utilities.OCL ocl = org.eclipse.ocl.pivot.utilities.OCL.newInstance();
					org.eclipse.ocl.pivot.utilities.OCLHelper helper = ocl.createOCLHelper(feature);
					final org.eclipse.ocl.pivot.ExpressionInOCL oclExpression = helper.createQuery("true");

					org.eclipse.jface.viewers.IFilter filter = new org.eclipse.jface.viewers.IFilter() {
						@Override
						public boolean select(Object object) {
							try {
								return object != null && Boolean.TRUE.equals(ocl.evaluate(object, oclExpression));
							} catch (org.eclipse.ocl.pivot.values.InvalidValueException e) {
								return false;
							}
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

				try {
					final org.eclipse.ocl.pivot.utilities.OCL ocl = org.eclipse.ocl.pivot.utilities.OCL.newInstance();
					org.eclipse.ocl.pivot.utilities.OCLHelper helper = ocl.createOCLHelper(feature);
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
	public ProcessorEditor(String tab) {
		this(tab, org.muml.pm.hardware.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE.getProcessor());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new ProcessorEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.general", "property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.general", "property.tab.extensions"}).contains(tab);
		}
	}

}
