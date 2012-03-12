package de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.custom.provider;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

import de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.custom.parsers.CustomMessageTypeLabelExpressionLabelParser5008;
import de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MessageinterfaceParserProvider;

public class CustomMessageinterfaceParserProvider extends
		MessageinterfaceParserProvider {

	@Override
	protected IParser getMessageTypeLabel_5008Parser() {
		if (messageTypeLabel_5008Parser== null) {
			messageTypeLabel_5008Parser = new CustomMessageTypeLabelExpressionLabelParser5008();
		}
		return messageTypeLabel_5008Parser;
	}

}
