package org.muml.reconfiguration.componentstorypattern.properties.componentstorypattern.editor;

/**
 * @generated
 */
public class SinglePortVariableEditor
		extends
			org.muml.reconfiguration.componentstorypattern.properties.componentstorypattern.editor.PortVariableEditor {

	/**
	 * @generated
	 */
	public SinglePortVariableEditor(String tab,
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

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
				"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addPositionConstraints_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

	}

	/**
	 * @generated
	 */
	protected void addPositionConstraints_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createPositionConstraints_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected org.muml.ape.runtime.editors.IPropertyEditor createPositionConstraints_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
				.getSinglePortVariable_PositionConstraints();
		final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
				adapterFactory, feature);

		{
			final org.eclipse.ocl.ecore.OCLExpression expression = org.muml.ape.runtime.RuntimePlugin
					.createOCLExpression(
							"-- only show this editor if SinglePortVariable is \"embedded\" in MultiPortVariable\nif \n	self.eContainer().oclIsUndefined() or not (self.eContainer().oclIsTypeOf(ComponentVariable) or self.eContainer().oclIsKindOf(PartVariable))\nthen\n	false\nelse\n	if\n		self.eContainer().oclIsTypeOf(ComponentVariable)\n	then\n		let container: ComponentVariable = self.eContainer().oclAsType(ComponentVariable) in\n		if\n			container.portVariables->select(oclIsTypeOf(MultiPortVariable))->exists(mPV |mPV.oclAsType(MultiPortVariable).gmfSubPortVariables->includes(self))\n		then\n			true\n		else\n			false\n		endif\n			\n	else \n		if\n			self.eContainer().oclIsKindOf(PartVariable)\n		then\n			let container: PartVariable = self.eContainer().oclAsType(PartVariable) in\n			if\n				container.portVariables->select(oclIsTypeOf(MultiPortVariable))->exists(mPV |mPV.oclAsType(MultiPortVariable).gmfSubPortVariables->includes(self))\n			then\n				true\n			else\n				false\n			endif\n			\n		else\n			false\n		endif\n	endif\n\nendif",
							feature, getEClass());
			editor.registerOCLAdapter(expression,
					new org.eclipse.emf.common.notify.impl.AdapterImpl() {
						@Override
						public void notifyChanged(
								org.eclipse.emf.common.notify.Notification notification) {
							editor.updateVisibility(true, true);
						}
					});
			final org.eclipse.ocl.Query<org.eclipse.emf.ecore.EClassifier, ?, ?> query = org.muml.ape.runtime.RuntimePlugin.OCL_ECORE
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
	public SinglePortVariableEditor(String tab) {
		this(
				tab,
				org.muml.reconfiguration.componentstorypattern.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
						.getSinglePortVariable());
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
			return new SinglePortVariableEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.extensions", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.documentation",
							"property.tab.general"}).contains(tab);
		}
	}

}
