package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.parsers.CustomTransitionLabelExpressionLabelParser6005;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlParserProvider;

/**
 * @generated
 */
public class CustomMumlParserProvider extends MumlParserProvider {

	@Override
	protected IParser getTransitionLabel_6005Parser() {
		if (transitionLabel_6005Parser == null) {
			transitionLabel_6005Parser = new CustomTransitionLabelExpressionLabelParser6005();
		}
		return transitionLabel_6005Parser;
	}
}
