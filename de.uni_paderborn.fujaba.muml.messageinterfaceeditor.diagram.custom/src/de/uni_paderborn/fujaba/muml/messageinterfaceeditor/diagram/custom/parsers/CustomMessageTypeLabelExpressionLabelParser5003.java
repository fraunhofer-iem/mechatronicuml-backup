package de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.custom.parsers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.parsers.MessageTypeLabelExpressionLabelParser5007;
import de.uni_paderborn.fujaba.muml.model.msgiface.MessageType;

public class CustomMessageTypeLabelExpressionLabelParser5003 extends
		MessageTypeLabelExpressionLabelParser5007 {


	protected IStatus updateValues(EObject target, String newString)
			throws ExecutionException {
		MessageType messageType = (MessageType) target;
		messageType.setName(newString);
		return Status.OK_STATUS;
	}

}
