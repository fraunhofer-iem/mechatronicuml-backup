package de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.common.ui.URIEditorInput;

/**
 * @generated
 */
public class MessageinterfaceUriEditorInputTester extends PropertyTester {

	/**
	 * @generated
	 */
	public boolean test(Object receiver, String method, Object[] args,
			Object expectedValue) {
		if (false == receiver instanceof URIEditorInput) {
			return false;
		}
		URIEditorInput editorInput = (URIEditorInput) receiver;
		return "messageinterface_diagram".equals(editorInput.getURI().fileExtension()); //$NON-NLS-1$
	}

}
