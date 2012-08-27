package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.parsers.CustomTransitionLabelExpressionLabelParser6003;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlParserProvider;

/**
 * @generated
 */
public class CustomMumlParserProvider extends MumlParserProvider {

	@Override
	protected IParser getTransitionLabel_6003Parser() {
		if (transitionLabel_6003Parser == null) {
			transitionLabel_6003Parser = new CustomTransitionLabelExpressionLabelParser6003();
		}
		return transitionLabel_6003Parser;
	}
}
