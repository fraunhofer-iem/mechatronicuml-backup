package de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.custom.provider;

import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

import de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.custom.parsers.CustomMessageTypeLabelExpressionLabelParser5003;
import de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MessageinterfaceParserProvider;

public class CustomMessageinterfaceParserProvider extends
		MessageinterfaceParserProvider {


	public CustomMessageinterfaceParserProvider() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean provides(IOperation operation) {
		// TODO Auto-generated method stub
		return super.provides(operation);
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.parsers.MessageTypeLabelExpressionLabelParser5003 messageTypeLabel_5003Parser;

	/**
	 * @generated
	 */
	private IParser getMessageTypeLabel_5003Parser() {
		if (messageTypeLabel_5003Parser == null) {
			messageTypeLabel_5003Parser = new CustomMessageTypeLabelExpressionLabelParser5003();
		}
		return messageTypeLabel_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageTypeNameEditPart.VISUAL_ID:
			return getMessageTypeLabel_5003Parser();
		}
		return super.getParser(visualID);
	}

}
