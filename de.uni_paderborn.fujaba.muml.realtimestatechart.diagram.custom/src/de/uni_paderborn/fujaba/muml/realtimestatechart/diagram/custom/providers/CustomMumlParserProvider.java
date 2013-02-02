package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.parsers.CustomTransitionLabelExpressionLabelParser6005;
import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlParserProvider;


public class CustomMumlParserProvider extends MumlParserProvider {

	@Override
	protected IParser getTransitionLabel_6005Parser() {
		if (transitionLabel_6005Parser == null) {
			transitionLabel_6005Parser = new CustomTransitionLabelExpressionLabelParser6005();
		}
		return transitionLabel_6005Parser;
	}
//
//	@Override
//	protected IParser getVariableLabel_5066Parser() {
//		if (variableLabel_5066Parser == null) {
//			variableLabel_5066Parser = new CustomVariableLabelExpressionLabelParser5066();
//		}
//		return variableLabel_5066Parser;
//	}
}
