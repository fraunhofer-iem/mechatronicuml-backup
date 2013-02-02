package de.uni_paderborn.fujaba.muml.messagetype.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

import de.uni_paderborn.fujaba.muml.messagetype.diagram.custom.parsers.CustomParameterLabelExpressionLabelParser5016;
import de.uni_paderborn.fujaba.muml.messagetype.diagram.providers.MumlParserProvider;

/**
 * @generated
 */
public class CustomMessageinterfaceParserProvider extends
		MumlParserProvider {

	@Override
	protected IParser getParameterLabel_5016Parser() {
		if (parameterLabel_5016Parser == null) {
			parameterLabel_5016Parser = new CustomParameterLabelExpressionLabelParser5016();
		}
		return parameterLabel_5016Parser;
	}

}
