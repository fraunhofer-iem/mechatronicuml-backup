package org.muml.storydiagram.verification.sdd.basicsdd.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.notation.View;
import org.muml.storydiagram.verification.sdd.PatternNodeType;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodeTypeEditPart;


public class CustomPatternNodeTypeEditPart extends StoryPatternNodeTypeEditPart {



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
		
		if (text.equals(PatternNodeType.EXISTENTIAL.getLiteral())) {
			text = EXISTENTIAL_CHAR;
		}
		else if (text.equals(PatternNodeType.UNIVERSAL.getLiteral())) {
			text = UNIVERSAL_CHAR;
		} 
		
		return text;
	}

	
}
