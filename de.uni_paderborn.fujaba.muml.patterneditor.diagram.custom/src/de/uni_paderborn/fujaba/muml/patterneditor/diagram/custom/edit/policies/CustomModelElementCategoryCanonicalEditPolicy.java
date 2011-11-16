package de.uni_paderborn.fujaba.muml.patterneditor.diagram.custom.edit.policies;

import de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.policies.ModelElementCategoryCanonicalEditPolicy;

public class CustomModelElementCategoryCanonicalEditPolicy extends
		ModelElementCategoryCanonicalEditPolicy {

	@Override
	public boolean isTopLevelCanonical() {
		return false;
	}

}