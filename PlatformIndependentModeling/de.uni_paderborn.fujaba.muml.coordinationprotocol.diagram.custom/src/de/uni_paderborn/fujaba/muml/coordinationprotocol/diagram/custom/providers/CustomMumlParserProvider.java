package de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

import de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.custom.parsers.CustomConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5015;
import de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.custom.parsers.CustomConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5016;
import de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.providers.MumlParserProvider;
public class CustomMumlParserProvider extends MumlParserProvider{

	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptionsLabel_5015Parser();		
		case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptionsLabel_5016Parser();
		}
		return super.getParser(visualID);
	}
	
	private IParser getConnectorQualityOfServiceAssumptionsLabel_5015Parser()
	{
		return new CustomConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5015();
	}
	private IParser getConnectorQualityOfServiceAssumptionsLabel_5016Parser()
	{
		return new CustomConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5016();
	}
	
}
