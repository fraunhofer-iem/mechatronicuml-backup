package org.muml.pim.messagetype.diagram.providers;

import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.behavior.Parameter;
import org.muml.pim.messagetype.diagram.expressions.MumlOCLFactory;
import org.muml.pim.messagetype.diagram.part.MessageTypeDiagramEditorPlugin;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.msgtype.MessageTypeRepository;
import org.muml.pim.msgtype.MsgtypePackage;

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
	public void init_MessageTypeRepository_2008(MessageTypeRepository instance) {
		try {
			Object value_0 = MumlOCLFactory.getExpression(2, MsgtypePackage.eINSTANCE.getMessageTypeRepository(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			MessageTypeDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_MessageType_3007(MessageType instance) {
		try {
			Object value_0 = MumlOCLFactory.getExpression(3, MsgtypePackage.eINSTANCE.getMessageType(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			MessageTypeDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_Parameter_3009(Parameter instance) {
		try {
			Object value_0 = MumlOCLFactory.getExpression(4, BehaviorPackage.eINSTANCE.getParameter(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			MessageTypeDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = MessageTypeDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			MessageTypeDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
