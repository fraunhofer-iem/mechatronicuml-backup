package de.uni_paderborn.fujaba.muml.component.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

import de.uni_paderborn.fujaba.muml.component.diagram.custom.parsers.CustomHybridPortLabelExpressionLabelParser;
import de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlParserProvider;

public class CustomMumlParserProvider extends MumlParserProvider {

	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return new CustomHybridPortLabelExpressionLabelParser();
		}
		return super.getParser(visualID);
	}

}
