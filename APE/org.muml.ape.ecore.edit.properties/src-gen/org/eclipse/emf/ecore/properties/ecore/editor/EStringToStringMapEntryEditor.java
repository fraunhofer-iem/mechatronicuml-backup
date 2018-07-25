
package org.eclipse.emf.ecore.properties.ecore.editor;

/**
 * @generated
 */
public class EStringToStringMapEntryEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public EStringToStringMapEntryEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorKey_tab_defaultTab_Editor(), false);

			addPropertyEditor(createEditorValue_tab_defaultTab_0_Editor(), false);

			addPropertyEditor(createEditorValue_tab_defaultTab_1_Editor(), false);

		} else if ("tab.default".equals(tab)) { // Tab Default

			addPropertyEditor(createEditorKey_tab_defaultTab_Editor(), false);

			addPropertyEditor(createEditorValue_tab_defaultTab_0_Editor(), false);

			addPropertyEditor(createEditorValue_tab_defaultTab_1_Editor(), false);

		} else if ("tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("tab.ocl".equals(tab)) { // Tab OCL

		} else if ("tab.filter".equals(tab)) { // Tab Filter

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorKey_tab_defaultTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorKey_tab_defaultTab_Editor() {
		if (this.editorKey_tab_defaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEStringToStringMapEntry_Key();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorKey_tab_defaultTab = editor;
		}
		return this.editorKey_tab_defaultTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorValue_tab_defaultTab_0;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorValue_tab_defaultTab_0_Editor() {
		if (this.editorValue_tab_defaultTab_0 == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEStringToStringMapEntry_Value();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			{
				editor.setInput(input);
				

				try {
					final org.eclipse.ocl.pivot.utilities.OCL ocl = org.eclipse.ocl.pivot.utilities.OCL.newInstance();
					org.eclipse.ocl.pivot.utilities.OCLHelper helper = ocl.createOCLHelper(feature);
					final org.eclipse.ocl.pivot.ExpressionInOCL oclExpression = helper.createQuery(
							"not eContainer().oclIsKindOf(ecore::EAnnotation) or not (eContainer().oclAsType(ecore::EAnnotation).source = 'http://www.eclipse.org/emf/2002/Ecore/OCL' or eContainer().oclAsType(ecore::EAnnotation).source = 'http://www.muml.org/emf/OCLFilter')");

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
						editor.addVisibilityFilter(filter);
					}

				} catch (org.eclipse.ocl.pivot.utilities.ParserException e) {
					e.printStackTrace();
				}
			}

			this.editorValue_tab_defaultTab_0 = editor;
		}
		return this.editorValue_tab_defaultTab_0;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorValue_tab_defaultTab_1;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorValue_tab_defaultTab_1_Editor() {
		if (this.editorValue_tab_defaultTab_1 == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEStringToStringMapEntry_Value();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.eclipse.emf.ecore.properties.ecore.editor.CustomOCLPropertyEditor(
					adapterFactory, feature);

			{
				editor.setInput(input);
				

				try {
					final org.eclipse.ocl.pivot.utilities.OCL ocl = org.eclipse.ocl.pivot.utilities.OCL.newInstance();
					org.eclipse.ocl.pivot.utilities.OCLHelper helper = ocl.createOCLHelper(feature);
					final org.eclipse.ocl.pivot.ExpressionInOCL oclExpression = helper.createQuery(
							"eContainer().oclIsKindOf(ecore::EAnnotation) and (eContainer().oclAsType(ecore::EAnnotation).source = 'http://www.eclipse.org/emf/2002/Ecore/OCL' or eContainer().oclAsType(ecore::EAnnotation).source = 'http://www.muml.org/emf/OCLFilter')");

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
						editor.addVisibilityFilter(filter);
					}

				} catch (org.eclipse.ocl.pivot.utilities.ParserException e) {
					e.printStackTrace();
				}
			}

			this.editorValue_tab_defaultTab_1 = editor;
		}
		return this.editorValue_tab_defaultTab_1;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public EStringToStringMapEntryEditor(String tab) {
		this(tab, org.eclipse.emf.ecore.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEStringToStringMapEntry());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new EStringToStringMapEntryEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"tab.default", "tab.default", "tab.default"})
					.contains(tab);
		}
	}

}
