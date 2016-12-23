package org.muml.pm.hardware.platform.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.muml.pm.hardware.platform.diagram.custom.parsers.CustomHWPlatformPartPartCardinalityExpressionLabelParser5028;
import org.muml.pm.hardware.platform.diagram.custom.parsers.CustomResourcePartCardinalityExpressionLabelParser5032;
import org.muml.pm.hardware.platform.diagram.providers.HardwareParserProvider;
/**
 * Our custom ParserProvider, which uses the customized LabelParsers.
 * 
 * @author adann
 * 
 */
public class CustomPlatformParserProvider extends HardwareParserProvider {
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
			return new CustomResourcePartCardinalityExpressionLabelParser5032();
			
		case org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
			return new CustomHWPlatformPartPartCardinalityExpressionLabelParser5028();
					
		default:
			break;
		
		} 
		return super.getParser(visualID);
	}


}
