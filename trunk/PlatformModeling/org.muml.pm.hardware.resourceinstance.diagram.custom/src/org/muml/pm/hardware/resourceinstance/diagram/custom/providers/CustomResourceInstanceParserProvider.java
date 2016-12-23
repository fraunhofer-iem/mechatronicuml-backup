package org.muml.pm.hardware.resourceinstance.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.muml.pm.hardware.resourceinstance.diagram.custom.parsers.CustomCacheExpressionLabelParser5026;
import org.muml.pm.hardware.resourceinstance.diagram.custom.parsers.CustomPLDExpressionLabelParser5027;
import org.muml.pm.hardware.resourceinstance.diagram.custom.parsers.CustomProcessingMemoryExpressionLabelParser5032;
import org.muml.pm.hardware.resourceinstance.diagram.custom.parsers.CustomProcessorInstanceExpressionLabelParser5028;
import org.muml.pm.hardware.resourceinstance.diagram.custom.parsers.CustomStorageMemoryExpressionLabelParser5030;
import org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareParserProvider;

/**
 * Our custom ParserProvider, which uses the customized LabelParsers.
 * 
 * @author adann
 * 
 */
public class CustomResourceInstanceParserProvider extends HardwareParserProvider {
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel23EditPart.VISUAL_ID:
			return new CustomStorageMemoryExpressionLabelParser5030();

		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel19EditPart.VISUAL_ID:
			return new CustomProcessingMemoryExpressionLabelParser5032();

		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
			return new CustomCacheExpressionLabelParser5026();

		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel12EditPart.VISUAL_ID:
			return new CustomPLDExpressionLabelParser5027();

		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel15EditPart.VISUAL_ID:
			return new CustomProcessorInstanceExpressionLabelParser5028();
		default:
			break;

		}
		return super.getParser(visualID);
	}

}
