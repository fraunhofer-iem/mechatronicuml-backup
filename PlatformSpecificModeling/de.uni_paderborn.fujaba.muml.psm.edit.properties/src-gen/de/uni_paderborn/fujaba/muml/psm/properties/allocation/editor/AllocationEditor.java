
package de.uni_paderborn.fujaba.muml.psm.properties.allocation.editor;

/**
 * @generated
 */
public class AllocationEditor extends de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public AllocationEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(), false);

			addPropertyEditor(createEditorComponentInstance_PSMTab_Editor(), false);

			addPropertyEditor(createEditorResourceInstance_PSMTab_Editor(), false);

		} else if ("property.tab.psm".equals(tab)) { // Tab PSM

			addPropertyEditor(createEditorComponentInstance_PSMTab_Editor(), false);

			addPropertyEditor(createEditorResourceInstance_PSMTab_Editor(), false);

		} else if ("property.tab.general".equals(tab)) { // Tab General

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorComponentInstance_PSMTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorComponentInstance_PSMTab_Editor() {
		if (this.editorComponentInstance_PSMTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.psm.allocation.AllocationPackage.eINSTANCE
					.getAllocation_ComponentInstance();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The allocated Component Instance.");

			this.editorComponentInstance_PSMTab = editor;
		}
		return this.editorComponentInstance_PSMTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorResourceInstance_PSMTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorResourceInstance_PSMTab_Editor() {
		if (this.editorResourceInstance_PSMTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.psm.allocation.AllocationPackage.eINSTANCE
					.getAllocation_ResourceInstance();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The allocated Resource Instance.");

			this.editorResourceInstance_PSMTab = editor;
		}
		return this.editorResourceInstance_PSMTab;
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
	public AllocationEditor(String tab) {
		this(tab, de.uni_paderborn.fujaba.muml.psm.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.psm.allocation.AllocationPackage.eINSTANCE.getAllocation());
	}

	/**
	 * @generated
	 */
	public static class Factory implements de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new AllocationEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays
					.asList(new java.lang.String[]{"property.tab.psm", "property.tab.psm", "property.tab.extensions"})
					.contains(tab);
		}
	}

}
