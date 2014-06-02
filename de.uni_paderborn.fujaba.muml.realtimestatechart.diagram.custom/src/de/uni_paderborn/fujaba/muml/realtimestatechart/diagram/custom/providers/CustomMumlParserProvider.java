package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.parsers.CustomClockConstraintLabelExpressionLabelParser5053;
import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.parsers.CustomRTSCVariableLabelExpressionLabelParser5062;
import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.parsers.CustomRegionLabelExpressionLabelParser5063;
import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.parsers.CustomTransitionLabelExpressionLabelParser6005;
import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.parsers.CustomTransitionLabelExpressionLabelParser6006;
import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlParserProvider;


public class CustomMumlParserProvider extends MumlParserProvider {
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionNameEditPart.VISUAL_ID:
			return getRegionLabel_5063Parser();
		
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
			return getTransitionLabel_6005Parser();
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
			return getTransitionLabel_6006Parser();
			
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
			return getClockConstraintLabel_5053Parser();
		
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getRTSCVariableLabel_5062Parser();
			
		}
		return super.getParser(visualID);
	}
	
	private IParser getRegionLabel_5063Parser() {
		return new CustomRegionLabelExpressionLabelParser5063();
	}

	protected IParser getTransitionLabel_6005Parser() {
		return new CustomTransitionLabelExpressionLabelParser6005();
	}
	

	protected IParser getTransitionLabel_6006Parser() {
		return new CustomTransitionLabelExpressionLabelParser6006();
	}

	protected IParser getRTSCVariableLabel_5062Parser() {
		return new CustomRTSCVariableLabelExpressionLabelParser5062();
	}


	protected IParser getClockConstraintLabel_5053Parser() {
		return new CustomClockConstraintLabelExpressionLabelParser5053();
	}

}
