package de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

import de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.custom.parsers.CustomParameterLabelExpressionLabelParser5011;
import de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MumlParserProvider;

/**
 * @generated
 */
public class CustomMessageinterfaceParserProvider extends
		MumlParserProvider {

	@Override
	protected IParser getParameterLabel_5013Parser() {
		if (parameterLabel_5013Parser == null) {
			parameterLabel_5013Parser = new CustomParameterLabelExpressionLabelParser5011();
		}
		return parameterLabel_5013Parser;
	}

}
