package de.uni_paderborn.fujaba.muml.componentstorypattern.properties.componentstorypattern.editor;

/**
 * @generated
 */
public class MultiPortOrderConstraintEditor
		extends
			org.muml.ape.runtime.editors.ClassPropertyEditor {

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
		super.createProperties();

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addSrcSubPortVariable_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addOrderConstraintType_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addTgtSubPortVariable_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addSrcSubPortVariable_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createSrcSubPortVariable_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected org.muml.ape.runtime.editors.IPropertyEditor createSrcSubPortVariable_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
				.getMultiPortOrderConstraint_SrcSubPortVariable();
		final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addOrderConstraintType_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createOrderConstraintType_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected org.muml.ape.runtime.editors.IPropertyEditor createOrderConstraintType_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
				.getMultiPortOrderConstraint_OrderConstraintType();
		final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.OptionPropertyEditor(
				adapterFactory, feature);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addTgtSubPortVariable_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createTgtSubPortVariable_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected org.muml.ape.runtime.editors.IPropertyEditor createTgtSubPortVariable_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
				.getMultiPortOrderConstraint_TgtSubPortVariable();
		final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		return editor;

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
				org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(
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
