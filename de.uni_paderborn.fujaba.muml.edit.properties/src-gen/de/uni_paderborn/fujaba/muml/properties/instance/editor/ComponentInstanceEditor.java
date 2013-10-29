package de.uni_paderborn.fujaba.muml.properties.instance.editor;

/**
 * @generated
 */
public abstract class ComponentInstanceEditor
		extends
			org.storydriven.core.properties.core.editor.NamedElementEditor {

	/**
	 * @generated
	 */
	public ComponentInstanceEditor(String tab,
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
			addComponentInstanceComponentTypeEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addComponentInstancePortInstancesEditor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addComponentInstanceComponentPartEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addComponentInstanceComponentTypeEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createComponentInstanceComponentTypeEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createComponentInstanceComponentTypeEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getComponentInstance_ComponentType());

		editor.setTooltipMessage("The component type of which this instance is derived.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addComponentInstancePortInstancesEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createComponentInstancePortInstancesEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createComponentInstancePortInstancesEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getComponentInstance_PortInstances());

		editor.setTooltipMessage("The port instances that belong to this component instance. \\todosd{Why are also DiscreteSinglePortInstances of DiscreteMultiPortInstances contained here and not in the DiscreteMultiPortInstance?}");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addComponentInstanceComponentPartEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createComponentInstanceComponentPartEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createComponentInstanceComponentPartEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getComponentInstance_ComponentPart());

		return editor;

	}

}
