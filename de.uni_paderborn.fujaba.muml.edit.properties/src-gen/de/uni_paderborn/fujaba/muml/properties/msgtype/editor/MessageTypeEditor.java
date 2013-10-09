package de.uni_paderborn.fujaba.muml.properties.msgtype.editor;

/**
 * @generated
 */
public class MessageTypeEditor
		extends
			org.storydriven.core.properties.core.editor.CommentableElementEditor {

	/**
	 * @generated
	 */
	public MessageTypeEditor(String tab,
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

		addSubCategory("de.fujaba.properties.category.Lists", "Lists",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addMessageTypeParametersEditor(
					"de.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addMessageTypeRepositoryEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addNamedElementNameEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addMessageTypeParametersEditor(String category, boolean front) {
		addEditorToCategory(category, createMessageTypeParametersEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createMessageTypeParametersEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage.eINSTANCE
						.getMessageType_Parameters());

	}
	/**
	 * @generated
	 */
	protected void addMessageTypeRepositoryEditor(String category, boolean front) {
		addEditorToCategory(category, createMessageTypeRepositoryEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createMessageTypeRepositoryEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage.eINSTANCE
						.getMessageType_Repository());

	}
	/**
	 * @generated
	 */
	protected void addNamedElementNameEditor(String category, boolean front) {
		addEditorToCategory(category, createNamedElementNameEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createNamedElementNameEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.storydriven.core.CorePackage.eINSTANCE
						.getNamedElement_Name(), false);

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public MessageTypeEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage.eINSTANCE
						.getMessageType());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new MessageTypeEditor(tab);
		}
	}

}
