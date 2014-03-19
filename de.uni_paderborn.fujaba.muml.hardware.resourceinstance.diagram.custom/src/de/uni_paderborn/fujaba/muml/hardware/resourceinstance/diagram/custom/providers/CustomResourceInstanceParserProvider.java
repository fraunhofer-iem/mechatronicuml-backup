package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom.parsers.CustomCacheExpressionLabelParser5026;
import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom.parsers.CustomPLDExpressionLabelParser5027;
import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom.parsers.CustomProcessingMemoryExpressionLabelParser5032;
import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom.parsers.CustomProcessorInstanceExpressionLabelParser5028;
import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom.parsers.CustomStorageMemoryExpressionLabelParser5030;
import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareParserProvider;
/**
 * Our custom ParserProvider, which uses the customized LabelParsers.
 * 
 * @author adann
 * 
 */
public class CustomResourceInstanceParserProvider extends HardwareParserProvider {
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel20EditPart.VISUAL_ID:
			return new CustomStorageMemoryExpressionLabelParser5030();
			
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel22EditPart.VISUAL_ID:
			return new CustomProcessingMemoryExpressionLabelParser5032();
			
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel16EditPart.VISUAL_ID:
			return new CustomCacheExpressionLabelParser5026();
			
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel17EditPart.VISUAL_ID:
			return new CustomPLDExpressionLabelParser5027();
		
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel18EditPart.VISUAL_ID:
			return new CustomProcessorInstanceExpressionLabelParser5028();
		
		
		}
		return super.getParser(visualID);
	}


}
