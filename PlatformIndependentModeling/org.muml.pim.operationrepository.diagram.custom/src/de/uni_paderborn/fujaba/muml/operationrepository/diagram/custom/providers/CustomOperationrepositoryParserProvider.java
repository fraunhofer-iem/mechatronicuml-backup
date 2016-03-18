package de.uni_paderborn.fujaba.muml.operationrepository.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

import de.uni_paderborn.fujaba.muml.operationrepository.diagram.custom.parsers.CustomParameterLabelExpressionLabelParser;
import de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlParserProvider;

public class CustomOperationrepositoryParserProvider extends MumlParserProvider {

	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getParameterLabelParser();
		}
		return super.getParser(visualID);
	}
	
	
	protected IParser getParameterLabelParser() {
		return new CustomParameterLabelExpressionLabelParser();
	}
}
