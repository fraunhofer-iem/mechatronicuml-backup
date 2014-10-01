package de.uni_paderborn.fujaba.muml.messagetype.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

import de.uni_paderborn.fujaba.muml.messagetype.diagram.custom.parsers.CustomParameterLabelExpressionLabelParser5016;
import de.uni_paderborn.fujaba.muml.messagetype.diagram.providers.MumlParserProvider;

public class CustomMessageinterfaceParserProvider extends
		MumlParserProvider {
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getParameterLabel_5016Parser();
		}
		return super.getParser(visualID);
	}
	protected IParser getParameterLabel_5016Parser() {
		return new CustomParameterLabelExpressionLabelParser5016();
	}

}
