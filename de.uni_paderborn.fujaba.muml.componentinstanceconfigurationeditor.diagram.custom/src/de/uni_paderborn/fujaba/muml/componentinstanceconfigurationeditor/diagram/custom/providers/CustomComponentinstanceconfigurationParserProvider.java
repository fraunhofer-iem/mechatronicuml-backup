package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.parsers.CustomStructuredComponentInstanceLabelExpressionLabelParser5029;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlParserProvider;

public class CustomComponentinstanceconfigurationParserProvider extends
		MumlParserProvider {

	@Override
	protected IParser getAtomicComponentInstanceLabel_5027Parser() {
		if (atomicComponentInstanceLabel_5027Parser == null) {
			atomicComponentInstanceLabel_5027Parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.parsers.CustomAtomicComponentInstanceLabelExpressionLabelParser5027();
		}
		return atomicComponentInstanceLabel_5027Parser;
	}

	@Override
	protected IParser getStructuredComponentInstanceLabel_5026Parser() {
		if (structuredComponentInstanceLabel_5026Parser == null) {
			structuredComponentInstanceLabel_5026Parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.parsers.CustomStructuredComponentInstanceLabelExpressionLabelParser5026();
		}
		return structuredComponentInstanceLabel_5026Parser;
	}

	@Override
	protected IParser getAtomicComponentInstanceLabel_5028Parser() {
		if (atomicComponentInstanceLabel_5028Parser == null) {
			atomicComponentInstanceLabel_5028Parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.parsers.CustomAtomicComponentInstanceLabelExpressionLabelParser5028();
		}
		return atomicComponentInstanceLabel_5028Parser;
	}

	@Override
	protected IParser getStructuredComponentInstanceLabel_5029Parser() {
		if (structuredComponentInstanceLabel_5029Parser == null) {
			structuredComponentInstanceLabel_5029Parser = new CustomStructuredComponentInstanceLabelExpressionLabelParser5029();
		}
		return structuredComponentInstanceLabel_5029Parser;
	}


}
