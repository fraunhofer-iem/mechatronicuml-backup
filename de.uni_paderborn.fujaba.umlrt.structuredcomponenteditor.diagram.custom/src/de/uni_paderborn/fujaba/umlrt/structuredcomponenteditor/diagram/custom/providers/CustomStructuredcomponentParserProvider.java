package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.StructuredcomponentParserProvider;

public class CustomStructuredcomponentParserProvider extends
		StructuredcomponentParserProvider {

	private de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.parsers.CustomComponentPartLabelExpressionLabelParser componentPartLabel_5003Parser;

	private IParser getComponentPartLabel_5003Parser() {
		if (componentPartLabel_5003Parser == null) {
			componentPartLabel_5003Parser = new de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.parsers.CustomComponentPartLabelExpressionLabelParser();
		}
		return componentPartLabel_5003Parser;
	}

	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.ComponentPartNameComponentNameDeriveEditPart.VISUAL_ID:
			return getComponentPartLabel_5003Parser();
		}
		return null;
	}

}
