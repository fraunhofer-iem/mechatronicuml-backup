package org.muml.pim.component.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.muml.pim.component.diagram.custom.parsers.CustomHybridPortLabelExpressionLabelParser;
import org.muml.pim.component.diagram.providers.MumlParserProvider;

public class CustomMumlParserProvider extends MumlParserProvider {

	protected IParser getParser(int visualID) {
		switch (visualID) {
		case org.muml.pim.component.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return new CustomHybridPortLabelExpressionLabelParser();
		}
		return super.getParser(visualID);
	}

}
