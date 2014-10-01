package org.eclipse.emf.ecore.properties.ecore.editor;

/**
 * @generated
 */
public class EStringToStringMapEntryEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public EStringToStringMapEntryEditor(String tab,
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

		if (getTab() == null || "tab.default".equals(getTab())) {
			addKey_DefaultTab_Editor(null, true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addValue_DefaultTab_Editor(null, true);
		}

		if (getTab() == null || "tab.ocl".equals(getTab())) {
			addValue_OCLTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addKey_DefaultTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createKey_DefaultTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createKey_DefaultTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
				.getEStringToStringMapEntry_Key();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory, feature, false);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addValue_DefaultTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createValue_DefaultTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createValue_DefaultTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
				.getEStringToStringMapEntry_Value();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory, feature, true);

		{
			final org.eclipse.ocl.ecore.OCLExpression expression = de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin
					.createOCLExpression(
							"not eContainer().oclIsKindOf(ecore::EAnnotation) or eContainer().oclAsType(ecore::EAnnotation).source <> 'http://www.eclipse.org/emf/2002/Ecore/OCL'",
							feature, getEClass());
			editor.registerOCLAdapter(expression,
					new org.eclipse.emf.common.notify.impl.AdapterImpl() {
						@Override
						public void notifyChanged(
								org.eclipse.emf.common.notify.Notification notification) {
							editor.updateVisibility(true, true);
						}
					});
			final org.eclipse.ocl.Query<org.eclipse.emf.ecore.EClassifier, ?, ?> query = de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin.OCL_ECORE
					.createQuery(expression);
			org.eclipse.jface.viewers.IFilter filter = new org.eclipse.jface.viewers.IFilter() {

				@Override
				public boolean select(Object object) {
					return object != null
							&& Boolean.TRUE.equals(query.evaluate(object));
				}

			};
			if (filter != null) {
				editor.addVisibilityFilter(filter);
			}
		}

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addValue_OCLTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createValue_OCLTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createValue_OCLTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
				.getEStringToStringMapEntry_Value();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.eclipse.emf.ecore.properties.ecore.editor.CustomOCLPropertyEditor(
				adapterFactory, feature);

		{
			final org.eclipse.ocl.ecore.OCLExpression expression = de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin
					.createOCLExpression(
							"eContainer().oclIsKindOf(ecore::EAnnotation) and eContainer().oclAsType(ecore::EAnnotation).source = 'http://www.eclipse.org/emf/2002/Ecore/OCL'",
							feature, getEClass());
			editor.registerOCLAdapter(expression,
					new org.eclipse.emf.common.notify.impl.AdapterImpl() {
						@Override
						public void notifyChanged(
								org.eclipse.emf.common.notify.Notification notification) {
							editor.updateVisibility(true, true);
						}
					});
			final org.eclipse.ocl.Query<org.eclipse.emf.ecore.EClassifier, ?, ?> query = de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin.OCL_ECORE
					.createQuery(expression);
			org.eclipse.jface.viewers.IFilter filter = new org.eclipse.jface.viewers.IFilter() {

				@Override
				public boolean select(Object object) {
					return object != null
							&& Boolean.TRUE.equals(query.evaluate(object));
				}

			};
			if (filter != null) {
				editor.addVisibilityFilter(filter);
			}
		}

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public EStringToStringMapEntryEditor(String tab) {
		this(tab, org.eclipse.emf.ecore.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory(),
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEStringToStringMapEntry());
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
			return new EStringToStringMapEntryEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"tab.default", "tab.default",
							"tab.ocl"}).contains(tab);
		}
	}

}
