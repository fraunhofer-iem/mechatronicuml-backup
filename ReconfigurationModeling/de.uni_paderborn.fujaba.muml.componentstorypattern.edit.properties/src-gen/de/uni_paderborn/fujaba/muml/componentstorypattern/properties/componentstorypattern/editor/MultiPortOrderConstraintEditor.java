package de.uni_paderborn.fujaba.muml.componentstorypattern.properties.componentstorypattern.editor;

/**
 * @generated
 */
public class MultiPortOrderConstraintEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public MultiPortOrderConstraintEditor(String tab,
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

			addPropertyEditor(createSrcSubPortVariable_GeneralTab_Editor(),
					false);

			addPropertyEditor(createOrderConstraintType_GeneralTab_Editor(),
					false);

			addPropertyEditor(createTgtSubPortVariable_GeneralTab_Editor(),
					false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createSrcSubPortVariable_GeneralTab_Editor(),
					false);

			addPropertyEditor(createOrderConstraintType_GeneralTab_Editor(),
					false);

			addPropertyEditor(createTgtSubPortVariable_GeneralTab_Editor(),
					false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorSrcSubPortVariable_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createSrcSubPortVariable_GeneralTab_Editor() {
		if (this.editorSrcSubPortVariable_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getMultiPortOrderConstraint_SrcSubPortVariable();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorSrcSubPortVariable_GeneralTab = editor;
		}
		return this.editorSrcSubPortVariable_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOrderConstraintType_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createOrderConstraintType_GeneralTab_Editor() {
		if (this.editorOrderConstraintType_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getMultiPortOrderConstraint_OrderConstraintType();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			this.editorOrderConstraintType_GeneralTab = editor;
		}
		return this.editorOrderConstraintType_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorTgtSubPortVariable_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createTgtSubPortVariable_GeneralTab_Editor() {
		if (this.editorTgtSubPortVariable_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
					.getMultiPortOrderConstraint_TgtSubPortVariable();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorTgtSubPortVariable_GeneralTab = editor;
		}
		return this.editorTgtSubPortVariable_GeneralTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public MultiPortOrderConstraintEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.componentstorypattern.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
						.getMultiPortOrderConstraint());
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
			return new MultiPortOrderConstraintEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general"})
					.contains(tab);
		}
	}

}
