package de.uni_paderborn.fujaba.muml.reconfiguration.properties.reconfInstance.editor;

/**
 * @generated
 */
public class ReconfigurableAtomicComponentInstanceEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ReconfigurableAtomicComponentInstanceEditor(String tab,
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

			addPropertyEditor(createEditorComponentType_nullTab_Editor(), false);

			addPropertyEditor(createEditorComponentPart_nullTab_Editor(), false);

			addPropertyEditor(createEditorParentCIC_nullTab_Editor(), false);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorPortInstances_nullTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorComponentType_nullTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorComponentType_nullTab_Editor() {
		if (this.editorComponentType_nullTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getComponentInstance_ComponentType();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The component type of which this instance is derived.");

			this.editorComponentType_nullTab = editor;
		}
		return this.editorComponentType_nullTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorPortInstances_nullTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorPortInstances_nullTab_Editor() {
		if (this.editorPortInstances_nullTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getComponentInstance_PortInstances();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The port instances that belong to this component instance. \\todosd{Why are also DiscreteSinglePortInstances of DiscreteMultiPortInstances contained here and not in the DiscreteMultiPortInstance?}");

			this.editorPortInstances_nullTab = editor;
		}
		return this.editorPortInstances_nullTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorComponentPart_nullTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorComponentPart_nullTab_Editor() {
		if (this.editorComponentPart_nullTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getComponentInstance_ComponentPart();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("If the component instance is contained in a structured component instance,\nthen the corresponding structure component has has component part that \nwas used to include the component type of this instance. Then, this reference \npoints to this component part. We can use this reference for deciding how \nmany instances of a particular part exist in a structured component instance\nsuch that we can enforce the cardinalities of the component part during run-time.");

			this.editorComponentPart_nullTab = editor;
		}
		return this.editorComponentPart_nullTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorParentCIC_nullTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorParentCIC_nullTab_Editor() {
		if (this.editorParentCIC_nullTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getComponentInstance_ParentCIC();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The component instance configuration that contains this component instance.");

			this.editorParentCIC_nullTab = editor;
		}
		return this.editorParentCIC_nullTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ReconfigurableAtomicComponentInstanceEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.reconfiguration.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfInstancePackage.eINSTANCE
						.getReconfigurableAtomicComponentInstance());
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
			return new ReconfigurableAtomicComponentInstanceEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"", "", "", ""}).contains(tab);
		}
	}

}
