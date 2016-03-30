package org.muml.pim.coordinationprotocol.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.muml.pim.coordinationprotocol.diagram.custom.parsers.CustomConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5022;
import org.muml.pim.coordinationprotocol.diagram.providers.MumlParserProvider;
public class CustomMumlParserProvider extends MumlParserProvider{

	protected IParser getParser(int visualID) {
		switch (visualID) {
				
		case org.muml.pim.coordinationprotocol.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptionsLabel_5021Parser();
		}
		return super.getParser(visualID);
	}
	
	
	private IParser getConnectorQualityOfServiceAssumptionsLabel_5021Parser()
	{
		return new CustomConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5022();
	}
	
}
