package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.parsers.CustomRegionLabelExpressionLabelParser5063;
import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlParserProvider;


public class CustomMumlParserProvider extends MumlParserProvider {
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionNameEditPart.VISUAL_ID:
			return getRegionLabel_5063Parser();
		
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
			// Deactivated because of MUML #516
//			return getTransitionLabel_6005Parser();
		}
		return super.getParser(visualID);
	}
	
	private IParser getRegionLabel_5063Parser() {
		return new CustomRegionLabelExpressionLabelParser5063();
	}

	
	
	// Deactivated because of MUML #516
//	protected IParser getTransitionLabel_6005Parser() {
//		return new CustomTransitionLabelExpressionLabelParser6005();
//	}
	
	

}
