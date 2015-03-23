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
		if (tab == null) {

			addPropertyEditor(createEditorKey_DefaultTab_Editor(), false);

			addPropertyEditor(createEditorValue_DefaultTab_0_Editor(), false);

			addPropertyEditor(createEditorValue_DefaultTab_1_Editor(), false);

		} else if ("tab.default".equals(tab)) { // Tab Default

			addPropertyEditor(createEditorKey_DefaultTab_Editor(), false);

			addPropertyEditor(createEditorValue_DefaultTab_0_Editor(), false);

			addPropertyEditor(createEditorValue_DefaultTab_1_Editor(), false);

		} else if ("tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("tab.ocl".equals(tab)) { // Tab OCL

		} else if ("tab.filter".equals(tab)) { // Tab Filter

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorKey_DefaultTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorKey_DefaultTab_Editor() {
		if (this.editorKey_DefaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEStringToStringMapEntry_Key();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorKey_DefaultTab = editor;
		}
		return this.editorKey_DefaultTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorValue_DefaultTab_0;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorValue_DefaultTab_0_Editor() {
		if (this.editorValue_DefaultTab_0 == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEStringToStringMapEntry_Value();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			{
				final org.eclipse.ocl.ecore.OCLExpression expression = de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin
						.createOCLExpression(
								"not eContainer().oclIsKindOf(ecore::EAnnotation) or not (eContainer().oclAsType(ecore::EAnnotation).source = 'http://www.eclipse.org/emf/2002/Ecore/OCL' or eContainer().oclAsType(ecore::EAnnotation).source = 'http://www.muml.org/emf/OCLFilter')",
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

			this.editorValue_DefaultTab_0 = editor;
		}
		return this.editorValue_DefaultTab_0;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorValue_DefaultTab_1;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorValue_DefaultTab_1_Editor() {
		if (this.editorValue_DefaultTab_1 == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEStringToStringMapEntry_Value();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.eclipse.emf.ecore.properties.ecore.editor.CustomOCLPropertyEditor(
					adapterFactory, feature);

			{
				final org.eclipse.ocl.ecore.OCLExpression expression = de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin
						.createOCLExpression(
								"eContainer().oclIsKindOf(ecore::EAnnotation) and (eContainer().oclAsType(ecore::EAnnotation).source = 'http://www.eclipse.org/emf/2002/Ecore/OCL' or eContainer().oclAsType(ecore::EAnnotation).source = 'http://www.muml.org/emf/OCLFilter')",
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

			this.editorValue_DefaultTab_1 = editor;
		}
		return this.editorValue_DefaultTab_1;
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
							"tab.default"}).contains(tab);
		}
	}

}
