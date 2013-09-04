package de.uni_paderborn.fujaba.muml.properties.component.editor;

/**
 * @generated
 */
public abstract class PortEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.connector.editor.ConnectorEndpointEditor {

	/**
	 * @generated
	 */
	public PortEditor(
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		super.createProperties();

		addConstrainableElementConstraintEditor(
				"de.fujaba.properties.category.Lists", true);

	}

	/**
	 * @generated
	 */
	protected void addConstrainableElementConstraintEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createConstrainableElementConstraintEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createConstrainableElementConstraintEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage.eINSTANCE
						.getConstrainableElement_Constraint());

	}

}
