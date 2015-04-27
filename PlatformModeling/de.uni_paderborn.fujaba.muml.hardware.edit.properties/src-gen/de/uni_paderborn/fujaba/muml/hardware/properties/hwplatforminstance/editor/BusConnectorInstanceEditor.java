package de.uni_paderborn.fujaba.muml.hardware.properties.hwplatforminstance.editor;

/**
 * @generated
 */
public class BusConnectorInstanceEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public BusConnectorInstanceEditor(String tab,
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

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(),
					false);

			addPropertyEditor(createEditorComment_DocumentationTab_Editor(),
					false);

			addPropertyEditor(createEditorType_GeneralTab_Editor(), false);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorConnectorEndpointInstances_GeneralTab_Editor(),
					false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorType_GeneralTab_Editor(), false);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorConnectorEndpointInstances_GeneralTab_Editor(),
					false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

			addPropertyEditor(createEditorComment_DocumentationTab_Editor(),
					false);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(),
					false);

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(),
					false);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		} else {
		}
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

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorType_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorType_GeneralTab_Editor() {
		if (this.editorType_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
					.getConnectorInstance_Type();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The connector that represents the type of this connector instance. May be undefined in case of a top level connector instance, which does not refer to a particular connector inside a structured component.");

			this.editorType_GeneralTab = editor;
		}
		return this.editorType_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorConnectorEndpointInstances_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorConnectorEndpointInstances_GeneralTab_Editor() {
		if (this.editorConnectorEndpointInstances_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
					.getConnectorInstance_ConnectorEndpointInstances();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The connector endpoint instances connected by this connector instance.");

			this.editorConnectorEndpointInstances_GeneralTab = editor;
		}
		return this.editorConnectorEndpointInstances_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorComment_DocumentationTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorComment_DocumentationTab_Editor() {
		if (this.editorComment_DocumentationTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.CorePackage.eINSTANCE
					.getCommentableElement_Comment();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("The comment string that can be used to attach arbitrary information to CommentableElements.");

			this.editorComment_DocumentationTab = editor;
		}
		return this.editorComment_DocumentationTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public BusConnectorInstanceEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.hardware.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
						.getBusConnectorInstance());
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
			return new BusConnectorInstanceEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.extensions",
							"property.tab.general", "property.tab.general",
							"property.tab.documentation"}).contains(tab);
		}
	}

}
