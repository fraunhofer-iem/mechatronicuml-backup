package org.muml.pim.pattern.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.muml.pim.pattern.diagram.custom.parsers.CustomConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5009;
import org.muml.pim.pattern.diagram.edit.parts.WrappingLabel4EditPart;
import org.muml.pim.pattern.diagram.providers.CoordinationPatternParserProvider;


public class CustomMumlParserProvider extends CoordinationPatternParserProvider{

	protected IParser getParser(int visualID) {
		switch (visualID) {
		case WrappingLabel4EditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptionsLabel_5009Parser();		
		}
		return super.getParser(visualID);
	}
	
	
	private IParser getConnectorQualityOfServiceAssumptionsLabel_5009Parser()
	{
		return new CustomConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5009();
	}
	
}
