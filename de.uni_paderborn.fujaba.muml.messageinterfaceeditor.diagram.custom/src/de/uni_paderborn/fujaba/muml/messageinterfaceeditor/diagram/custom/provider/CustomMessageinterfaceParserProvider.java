package de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.custom.provider;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

import de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.custom.parsers.CustomMessageTypeLabelExpressionLabelParser5003;
import de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MessageinterfaceParserProvider;

public class CustomMessageinterfaceParserProvider extends
		MessageinterfaceParserProvider {

	@Override
	protected IParser getMessageTypeLabel_5007Parser() {
		if (messageTypeLabel_5007Parser== null) {
			messageTypeLabel_5007Parser = new CustomMessageTypeLabelExpressionLabelParser5003();
		}
		return messageTypeLabel_5007Parser;
	}

}
