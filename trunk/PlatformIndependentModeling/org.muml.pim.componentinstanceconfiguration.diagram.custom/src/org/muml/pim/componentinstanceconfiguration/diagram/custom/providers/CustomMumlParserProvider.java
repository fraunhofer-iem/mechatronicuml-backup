package org.muml.pim.componentinstanceconfiguration.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.muml.pim.componentinstanceconfiguration.diagram.custom.parsers.CustomAtomicComponentInstanceLabelExpressionLabelParser5027;
import org.muml.pim.componentinstanceconfiguration.diagram.custom.parsers.CustomAtomicComponentInstanceLabelExpressionLabelParser5028;
import org.muml.pim.componentinstanceconfiguration.diagram.custom.parsers.CustomStructuredComponentInstanceLabelExpressionLabelParser5026;
import org.muml.pim.componentinstanceconfiguration.diagram.custom.parsers.CustomStructuredComponentInstanceLabelExpressionLabelParser5029;
import org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlParserProvider;

public class CustomMumlParserProvider extends MumlParserProvider {
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return new CustomAtomicComponentInstanceLabelExpressionLabelParser5027();
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return new CustomStructuredComponentInstanceLabelExpressionLabelParser5026();
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return new CustomAtomicComponentInstanceLabelExpressionLabelParser5028();
		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
			return new CustomStructuredComponentInstanceLabelExpressionLabelParser5029();
		}
		return super.getParser(visualID);
	}


}
