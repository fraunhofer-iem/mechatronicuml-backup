package de.uni_paderborn.fujaba.muml.coordinationpattern.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

import de.uni_paderborn.fujaba.muml.coordinationpattern.diagram.custom.parsers.CustomConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5008;
import de.uni_paderborn.fujaba.muml.coordinationpattern.diagram.custom.parsers.CustomConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5010;
import de.uni_paderborn.fujaba.muml.coordinationpattern.diagram.edit.parts.WrappingLabel4EditPart;
import de.uni_paderborn.fujaba.muml.coordinationpattern.diagram.edit.parts.WrappingLabel5EditPart;
import de.uni_paderborn.fujaba.muml.coordinationpattern.diagram.providers.PatternParserProvider;


public class CustomMumlParserProvider extends PatternParserProvider{

	protected IParser getParser(int visualID) {
		switch (visualID) {
		case WrappingLabel4EditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptionsLabel_5021Parser();		
		case WrappingLabel5EditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptionsLabel_5022Parser();
		}
		return super.getParser(visualID);
	}
	
	private IParser getConnectorQualityOfServiceAssumptionsLabel_5021Parser()
	{
		return new CustomConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5008();
	}
	private IParser getConnectorQualityOfServiceAssumptionsLabel_5022Parser()
	{
		return new CustomConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5010();
	}
	
}
