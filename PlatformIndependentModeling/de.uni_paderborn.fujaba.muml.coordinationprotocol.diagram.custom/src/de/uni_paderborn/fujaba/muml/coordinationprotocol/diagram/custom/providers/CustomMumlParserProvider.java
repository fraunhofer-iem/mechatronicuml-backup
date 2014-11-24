package de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

import de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.custom.parsers.CustomConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5021;
import de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.custom.parsers.CustomConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5022;
import de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.providers.MumlParserProvider;
public class CustomMumlParserProvider extends MumlParserProvider{

	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptionsLabel_5021Parser();		
		case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptionsLabel_5022Parser();
		}
		return super.getParser(visualID);
	}
	
	private IParser getConnectorQualityOfServiceAssumptionsLabel_5021Parser()
	{
		return new CustomConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5021();
	}
	private IParser getConnectorQualityOfServiceAssumptionsLabel_5022Parser()
	{
		return new CustomConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5022();
	}
	
}
