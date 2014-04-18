package de.uni_paderborn.fujaba.muml.hardware.resource.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

import de.uni_paderborn.fujaba.muml.hardware.resource.diagram.custom.parsers.CustomBusExpressionLabelParser5023;
import de.uni_paderborn.fujaba.muml.hardware.resource.diagram.custom.parsers.CustomLinkExpressionLabelParser6002;
import de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareParserProvider;


/**
 * Our custom ParserProvider, which uses the customized LabelParsers.
 * 
 * @author adann
 * 
 */
public class CustomResourceParserProvider extends HardwareParserProvider {
	protected IParser getParser(int visualID) {
		switch (visualID) {
				
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel19EditPart.VISUAL_ID:
			return new CustomBusExpressionLabelParser5023();
			
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel21EditPart.VISUAL_ID:
			return new CustomLinkExpressionLabelParser6002();	
		
		
		} 
		return super.getParser(visualID);
	}


}
