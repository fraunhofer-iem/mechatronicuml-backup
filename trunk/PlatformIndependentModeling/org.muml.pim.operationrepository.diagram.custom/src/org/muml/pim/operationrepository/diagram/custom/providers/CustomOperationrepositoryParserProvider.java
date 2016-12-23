package org.muml.pim.operationrepository.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.muml.pim.operationrepository.diagram.custom.parsers.CustomParameterLabelExpressionLabelParser;
import org.muml.pim.operationrepository.diagram.providers.MumlParserProvider;

public class CustomOperationrepositoryParserProvider extends MumlParserProvider {

	protected IParser getParser(int visualID) {
		switch (visualID) {
		case org.muml.pim.operationrepository.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getParameterLabelParser();
		}
		return super.getParser(visualID);
	}
	
	
	protected IParser getParameterLabelParser() {
		return new CustomParameterLabelExpressionLabelParser();
	}
}
