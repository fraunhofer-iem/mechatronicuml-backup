package de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.parsers.CustomContinuousPortInstanceLabelExpressionLabelParser5042;
import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.parsers.CustomContinuousPortInstanceLabelExpressionLabelParser5046;
import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.parsers.CustomDiscreteMultiPortInstanceLabelExpressionLabelParser5041;
import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.parsers.CustomDiscreteMultiPortInstanceLabelExpressionLabelParser5045;
import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.parsers.CustomDiscreteSinglePortInstanceLabelExpressionLabelParser5040;
import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.parsers.CustomDiscreteSinglePortInstanceLabelExpressionLabelParser5044;
import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.parsers.CustomHybridPortInstanceLabelExpressionLabelParser5039;
import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.parsers.CustomHybridPortInstanceLabelExpressionLabelParser5043;
import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlParserProvider;

public class CustomMumlParserProvider extends MumlParserProvider {
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceNameEditPart.VISUAL_ID:
			return getHybridPortInstanceLabel_5039Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceNameEditPart.VISUAL_ID:
			return getDiscreteSinglePortInstanceLabel_5040Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceNameEditPart.VISUAL_ID:
			return getDiscreteMultiPortInstanceLabel_5041Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceNameEditPart.VISUAL_ID:
			return getContinuousPortInstanceLabel_5042Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceName2EditPart.VISUAL_ID:
			return getHybridPortInstanceLabel_5043Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceName3EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstanceLabel_5044Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceName2EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstanceLabel_5045Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceName2EditPart.VISUAL_ID:
			return getContinuousPortInstanceLabel_5046Parser();
		}
		return super.getParser(visualID);
	}

	protected IParser getHybridPortInstanceLabel_5039Parser() {
		return new CustomHybridPortInstanceLabelExpressionLabelParser5039();
	}

	protected IParser getDiscreteSinglePortInstanceLabel_5040Parser() {
		return new CustomDiscreteSinglePortInstanceLabelExpressionLabelParser5040();
	}

	protected IParser getDiscreteMultiPortInstanceLabel_5041Parser() {

		return new CustomDiscreteMultiPortInstanceLabelExpressionLabelParser5041();

	}

	protected IParser getContinuousPortInstanceLabel_5042Parser() {
		return new CustomContinuousPortInstanceLabelExpressionLabelParser5042();

	}

	protected IParser getHybridPortInstanceLabel_5043Parser() {
		return new CustomHybridPortInstanceLabelExpressionLabelParser5043();

	}

	protected IParser getDiscreteSinglePortInstanceLabel_5044Parser() {
		return new CustomDiscreteSinglePortInstanceLabelExpressionLabelParser5044();

	}

	protected IParser getDiscreteMultiPortInstanceLabel_5045Parser() {
		return new CustomDiscreteMultiPortInstanceLabelExpressionLabelParser5045();

	}

	protected IParser getContinuousPortInstanceLabel_5046Parser() {
		return new CustomContinuousPortInstanceLabelExpressionLabelParser5046();

	}

}
