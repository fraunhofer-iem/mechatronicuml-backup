package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlParserProvider;

public class CustomComponentinstanceconfigurationParserProvider extends
		MumlParserProvider {

	private de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.parsers.CustomComponentInstanceLabelExpressionLabelParser5002 componentInstanceLabel_5002Parser;

	protected IParser getComponentInstanceLabel_5002Parser() {
		if (componentInstanceLabel_5002Parser == null) {
			componentInstanceLabel_5002Parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.parsers.CustomComponentInstanceLabelExpressionLabelParser5002();
		}
		return componentInstanceLabel_5002Parser;
	}

}
