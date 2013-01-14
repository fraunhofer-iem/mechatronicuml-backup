package de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public void init_MessageTypeRepository_2008(
			de.uni_paderborn.fujaba.muml.model.msgtype.MessageTypeRepository instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							0,
							de.uni_paderborn.fujaba.muml.model.msgtype.MsgtypePackage.eINSTANCE
									.getMessageTypeRepository(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MessageTypeDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_MessageType_3007(
			de.uni_paderborn.fujaba.muml.model.msgtype.MessageType instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							1,
							de.uni_paderborn.fujaba.muml.model.msgtype.MsgtypePackage.eINSTANCE
									.getMessageType(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MessageTypeDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Parameter_3009(
			de.uni_paderborn.fujaba.muml.model.behavior.Parameter instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							2,
							de.uni_paderborn.fujaba.muml.model.behavior.BehaviorPackage.eINSTANCE
									.getParameter(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MessageTypeDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MessageTypeDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MessageTypeDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
