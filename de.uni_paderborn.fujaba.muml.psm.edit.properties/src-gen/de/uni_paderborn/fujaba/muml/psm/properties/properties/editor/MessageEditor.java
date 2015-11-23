
package de.uni_paderborn.fujaba.muml.psm.properties.properties.editor;

/**
 * @generated
 */
public class MessageEditor extends de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public MessageEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
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

			addPropertyEditor(createEditorDeadline_PSMTab_Editor(), false);

			addPropertyEditor(createEditorPeriod_PSMTab_Editor(), false);

			addPropertyEditor(createEditorPriority_PSMTab_Editor(), false);

			addPropertyEditor(createEditorMessageType_PSMTab_Editor(), false);

			addPropertyEditor(createEditorSize_PSMTab_Editor(), false);

		} else if ("property.tab.psm".equals(tab)) { // Tab PSM

			addPropertyEditor(createEditorDeadline_PSMTab_Editor(), false);

			addPropertyEditor(createEditorPeriod_PSMTab_Editor(), false);

			addPropertyEditor(createEditorPriority_PSMTab_Editor(), false);

			addPropertyEditor(createEditorMessageType_PSMTab_Editor(), false);

			addPropertyEditor(createEditorSize_PSMTab_Editor(), false);

		} else if ("property.tab.general".equals(tab)) { // Tab General

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description_Aspects

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorMessageType_PSMTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorMessageType_PSMTab_Editor() {
		if (this.editorMessageType_PSMTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage.eINSTANCE
					.getMessage_MessageType();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorMessageType_PSMTab = editor;
		}
		return this.editorMessageType_PSMTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorSize_PSMTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorSize_PSMTab_Editor() {
		if (this.editorSize_PSMTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage.eINSTANCE
					.getMessage_Size();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			this.editorSize_PSMTab = editor;
		}
		return this.editorSize_PSMTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorDeadline_PSMTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorDeadline_PSMTab_Editor() {
		if (this.editorDeadline_PSMTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage.eINSTANCE
					.getScheduling_Deadline();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			this.editorDeadline_PSMTab = editor;
		}
		return this.editorDeadline_PSMTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorPeriod_PSMTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorPeriod_PSMTab_Editor() {
		if (this.editorPeriod_PSMTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage.eINSTANCE
					.getScheduling_Period();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			this.editorPeriod_PSMTab = editor;
		}
		return this.editorPeriod_PSMTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorPriority_PSMTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorPriority_PSMTab_Editor() {
		if (this.editorPriority_PSMTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage.eINSTANCE
					.getScheduling_Priority();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorPriority_PSMTab = editor;
		}
		return this.editorPriority_PSMTab;
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
	public MessageEditor(String tab) {
		this(tab, de.uni_paderborn.fujaba.muml.psm.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage.eINSTANCE.getMessage());
	}

	/**
	 * @generated
	 */
	public static class Factory implements de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new MessageEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays
					.asList(new java.lang.String[]{"property.tab.psm", "property.tab.psm", "property.tab.psm",
							"property.tab.psm", "property.tab.psm", "property.tab.general", "property.tab.extensions"})
					.contains(tab);
		}
	}

}
