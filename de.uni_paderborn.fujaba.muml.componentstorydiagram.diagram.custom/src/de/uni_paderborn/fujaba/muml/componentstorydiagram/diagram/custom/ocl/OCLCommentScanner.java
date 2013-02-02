package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.ocl;

import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;

public class OCLCommentScanner extends RuleBasedScanner {
	public OCLCommentScanner(ColorManager manager) {
		super();

		setRules(new IRule[0]);
	}
}
