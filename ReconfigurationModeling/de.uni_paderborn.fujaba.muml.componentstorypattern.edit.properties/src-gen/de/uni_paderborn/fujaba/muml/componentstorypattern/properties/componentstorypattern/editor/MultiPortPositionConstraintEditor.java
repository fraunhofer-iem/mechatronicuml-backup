package de.uni_paderborn.fujaba.muml.componentstorypattern.properties.componentstorypattern.editor;

/**
 * @generated
 */
public class MultiPortPositionConstraintEditor
		extends
			de.uni_paderborn.fujaba.muml.componentstorypattern.properties.componentstorypattern.editor.MultiPortConstraintEditor {

	/**
	 * @generated
	 */
	public MultiPortPositionConstraintEditor(String tab,
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
			addPositionConstraintType_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addPositionConstraintType_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createPositionConstraintType_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPositionConstraintType_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
				.getMultiPortPositionConstraint_PositionConstraintType();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory, feature);

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public MultiPortPositionConstraintEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.componentstorypattern.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
						.getMultiPortPositionConstraint());
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
			return new MultiPortPositionConstraintEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general"}).contains(tab);
		}
	}

}
