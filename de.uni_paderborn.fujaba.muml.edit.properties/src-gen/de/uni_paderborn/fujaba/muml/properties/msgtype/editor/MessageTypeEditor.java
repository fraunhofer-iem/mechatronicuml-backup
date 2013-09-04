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
	public MessageTypeEditor(
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

		addSubCategory("de.fujaba.properties.category.Lists", "Lists",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		addMessageTypeParametersEditor("de.fujaba.properties.category.Lists",
				true);

		addNamedElementNameEditor(null, true);

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
	public MessageTypeEditor() {
		this(
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
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new MessageTypeEditor();
		}
	}

}
