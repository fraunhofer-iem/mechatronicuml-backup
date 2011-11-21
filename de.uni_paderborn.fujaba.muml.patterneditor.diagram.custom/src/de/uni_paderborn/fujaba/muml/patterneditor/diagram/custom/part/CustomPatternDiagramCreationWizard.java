package de.uni_paderborn.fujaba.muml.patterneditor.diagram.custom.part;

import de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlCreationWizard;

/**
 * A CreationWizard for Pattern diagrams. It implements the abstract creation
 * wizard from the de.uni_paderborn.fujaba.newwizard plugin.
 * 
 * @author bingo
 * 
 */
public class CustomPatternDiagramCreationWizard extends MumlCreationWizard {

	@Override
	protected String getModelElementCategoryKey() {
		return "de.uni_paderborn.fujaba.muml.pattern.category";
	}
}
