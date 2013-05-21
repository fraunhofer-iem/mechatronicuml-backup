package de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.parsers.CustomAtomicComponentInstanceLabelExpressionLabelParser5027;
import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.parsers.CustomAtomicComponentInstanceLabelExpressionLabelParser5028;
import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.parsers.CustomStructuredComponentInstanceLabelExpressionLabelParser5026;
import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.parsers.CustomStructuredComponentInstanceLabelExpressionLabelParser5029;
import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlParserProvider;

public class CustomMumlParserProvider extends MumlParserProvider {
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return new CustomAtomicComponentInstanceLabelExpressionLabelParser5027();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return new CustomStructuredComponentInstanceLabelExpressionLabelParser5026();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return new CustomAtomicComponentInstanceLabelExpressionLabelParser5028();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
			return new CustomStructuredComponentInstanceLabelExpressionLabelParser5029();
		}
		return super.getParser(visualID);
	}


}
