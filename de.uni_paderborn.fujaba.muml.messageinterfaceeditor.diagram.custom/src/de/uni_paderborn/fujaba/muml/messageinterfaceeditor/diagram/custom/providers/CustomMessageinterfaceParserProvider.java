package de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

import de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.custom.parsers.CustomParameterLabelExpressionLabelParser5011;
import de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MessageinterfaceParserProvider;

/**
 * @generated
 */
public class CustomMessageinterfaceParserProvider extends
		MessageinterfaceParserProvider {

	@Override
	protected IParser getParameterLabel_5011Parser() {
		if (parameterLabel_5011Parser == null) {
			parameterLabel_5011Parser = new CustomParameterLabelExpressionLabelParser5011();
		}
		return parameterLabel_5011Parser;
	}

}
