package de.uni_paderborn.fujaba.muml.hardware.platform.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.custom.parsers.CustomHWPlatformPartPartCardinalityExpressionLabelParser5028;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.custom.parsers.CustomResourcePartCardinalityExpressionLabelParser5032;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareParserProvider;
/**
 * Our custom ParserProvider, which uses the customized LabelParsers.
 * 
 * @author adann
 * 
 */
public class CustomPlatformParserProvider extends HardwareParserProvider {
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
			return new CustomResourcePartCardinalityExpressionLabelParser5032();
			
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
			return new CustomHWPlatformPartPartCardinalityExpressionLabelParser5028();
					
		
		
		} 
		return super.getParser(visualID);
	}


}
