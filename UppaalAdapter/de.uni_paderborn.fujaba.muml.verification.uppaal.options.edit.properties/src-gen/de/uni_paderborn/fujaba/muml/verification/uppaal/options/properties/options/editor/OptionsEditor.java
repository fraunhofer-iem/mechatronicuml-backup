package de.uni_paderborn.fujaba.muml.verification.uppaal.options.properties.options.editor;

/**
 * @generated
 */
public class OptionsEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public OptionsEditor(String tab,
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

		if (getTab() == null || "options".equals(getTab())) {
			addConnectorOutBufferSize_OptionsTab_Editor(null, true);
		}

		if (getTab() == null || "options".equals(getTab())) {
			addHashTableSize_OptionsTab_Editor(null, true);
		}

		if (getTab() == null || "options".equals(getTab())) {
			addStateSpaceReduction_OptionsTab_Editor(null, true);
		}

		if (getTab() == null || "options".equals(getTab())) {
			addTraceOptions_OptionsTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addConnectorOutBufferSize_OptionsTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createConnectorOutBufferSize_OptionsTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createConnectorOutBufferSize_OptionsTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.verification.uppaal.options.OptionsPackage.eINSTANCE
				.getOptions_ConnectorOutBufferSize();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.SpinnerPropertyEditor(
				adapterFactory, feature, 0);

		{
			final org.eclipse.ocl.ecore.OCLExpression expression = de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin
					.createOCLExpression(
							"not self.extension->exists(ext | ext.oclAsType(HideOptionExtension).option = 'connectorOutBufferSize')",
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

		editor.setTooltipMessage("the size of the outgoing connector buffers");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addHashTableSize_OptionsTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createHashTableSize_OptionsTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createHashTableSize_OptionsTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.verification.uppaal.options.OptionsPackage.eINSTANCE
				.getOptions_HashTableSize();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.SpinnerPropertyEditor(
				adapterFactory, feature, 0);

		{
			final org.eclipse.ocl.ecore.OCLExpression expression = de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin
					.createOCLExpression(
							"not self.extension->exists(ext | ext.oclAsType(HideOptionExtension).option = 'hashTableSize')",
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

		editor.setTooltipMessage("the hash table size for bit state hashing will be 2^hashTableSize");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addStateSpaceReduction_OptionsTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createStateSpaceReduction_OptionsTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createStateSpaceReduction_OptionsTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.verification.uppaal.options.OptionsPackage.eINSTANCE
				.getOptions_StateSpaceReduction();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory, feature);

		{
			final org.eclipse.ocl.ecore.OCLExpression expression = de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin
					.createOCLExpression(
							"not self.extension->exists(ext | ext.oclAsType(HideOptionExtension).option = 'stateSpaceReduction')",
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

		editor.setTooltipMessage("options for the state space consumption");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addTraceOptions_OptionsTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createTraceOptions_OptionsTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createTraceOptions_OptionsTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.verification.uppaal.options.OptionsPackage.eINSTANCE
				.getOptions_TraceOptions();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory, feature);

		{
			final org.eclipse.ocl.ecore.OCLExpression expression = de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin
					.createOCLExpression(
							"not self.extension->exists(ext | ext.oclAsType(HideOptionExtension).option = 'traceOptions')",
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

		editor.setTooltipMessage("options for the generated traces");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public OptionsEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.verification.uppaal.options.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.verification.uppaal.options.OptionsPackage.eINSTANCE
						.getOptions());
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
			return new OptionsEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"options", "options", "options",
							"options"}).contains(tab);
		}
	}

}
