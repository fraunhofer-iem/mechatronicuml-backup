package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.parsers.CustomContinuousPortInstanceLabelExpressionLabelParser5042;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.parsers.CustomContinuousPortInstanceLabelExpressionLabelParser5046;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.parsers.CustomDiscreteMultiPortInstanceLabelExpressionLabelParser5041;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.parsers.CustomDiscreteMultiPortInstanceLabelExpressionLabelParser5045;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.parsers.CustomDiscreteSinglePortInstanceLabelExpressionLabelParser5040;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.parsers.CustomDiscreteSinglePortInstanceLabelExpressionLabelParser5044;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.parsers.CustomHybridPortInstanceLabelExpressionLabelParser5039;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.parsers.CustomHybridPortInstanceLabelExpressionLabelParser5043;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlParserProvider;

public class CustomMumlParserProvider extends MumlParserProvider {
	protected IParser getHybridPortInstanceLabel_5039Parser() {
		if (hybridPortInstanceLabel_5039Parser == null) {
			hybridPortInstanceLabel_5039Parser = new CustomHybridPortInstanceLabelExpressionLabelParser5039();
		}
		return hybridPortInstanceLabel_5039Parser;
	}

	protected IParser getDiscreteSinglePortInstanceLabel_5040Parser() {
		if (discreteSinglePortInstanceLabel_5040Parser == null) {
			discreteSinglePortInstanceLabel_5040Parser = new CustomDiscreteSinglePortInstanceLabelExpressionLabelParser5040();
		}
		return discreteSinglePortInstanceLabel_5040Parser;
	}

	protected IParser getDiscreteMultiPortInstanceLabel_5041Parser() {
		if (discreteMultiPortInstanceLabel_5041Parser == null) {
			discreteMultiPortInstanceLabel_5041Parser = new CustomDiscreteMultiPortInstanceLabelExpressionLabelParser5041();
		}
		return discreteMultiPortInstanceLabel_5041Parser;
	}
	protected IParser getContinuousPortInstanceLabel_5042Parser() {
		if (continuousPortInstanceLabel_5042Parser == null) {
			continuousPortInstanceLabel_5042Parser = new CustomContinuousPortInstanceLabelExpressionLabelParser5042();
		}
		return continuousPortInstanceLabel_5042Parser;
	}

	protected IParser getHybridPortInstanceLabel_5043Parser() {
		if (hybridPortInstanceLabel_5043Parser == null) {
			hybridPortInstanceLabel_5043Parser = new CustomHybridPortInstanceLabelExpressionLabelParser5043();
		}
		return hybridPortInstanceLabel_5043Parser;
	}

	protected IParser getDiscreteSinglePortInstanceLabel_5044Parser() {
		if (discreteSinglePortInstanceLabel_5044Parser == null) {
			discreteSinglePortInstanceLabel_5044Parser = new CustomDiscreteSinglePortInstanceLabelExpressionLabelParser5044();
		}
		return discreteSinglePortInstanceLabel_5044Parser;
	}

	protected IParser getDiscreteMultiPortInstanceLabel_5045Parser() {
		if (discreteMultiPortInstanceLabel_5045Parser == null) {
			discreteMultiPortInstanceLabel_5045Parser = new CustomDiscreteMultiPortInstanceLabelExpressionLabelParser5045();
		}
		return discreteMultiPortInstanceLabel_5045Parser;
	}

	protected IParser getContinuousPortInstanceLabel_5046Parser() {
		if (continuousPortInstanceLabel_5046Parser == null) {
			continuousPortInstanceLabel_5046Parser = new CustomContinuousPortInstanceLabelExpressionLabelParser5046();
		}
		return continuousPortInstanceLabel_5046Parser;
	}

}
