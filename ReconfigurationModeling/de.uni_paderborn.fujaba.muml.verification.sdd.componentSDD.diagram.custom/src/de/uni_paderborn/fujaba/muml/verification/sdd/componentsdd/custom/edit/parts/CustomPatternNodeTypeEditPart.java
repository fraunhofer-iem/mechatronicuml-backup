package de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.custom.edit.parts;

import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.verification.sdd.PatternNodeType;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeTypeEditPart;



public class CustomPatternNodeTypeEditPart extends ComponentStoryPatternNodeTypeEditPart {



	public CustomPatternNodeTypeEditPart(View view) {
		super(view);
	}
	
	
	private final String EXISTENTIAL_CHAR = "\u2203";
	
	private final String UNIVERSAL_CHAR = "\u2200";
	
	
	/**
	 * @override
	 */
	protected String getLabelText() {
		String text = super.getLabelText();
		
		if (text.equalsIgnoreCase(PatternNodeType.EXISTENTIAL.getLiteral())) {
			text = EXISTENTIAL_CHAR;
		}
		else if (text.equalsIgnoreCase(PatternNodeType.UNIVERSAL.getLiteral())) {
			text = UNIVERSAL_CHAR;
		} 
		
		return text;
	}

	
}
