package org.muml.storydiagram.verification.sdd.basicsdd.diagram.custom.providers;

import org.muml.storydiagram.verification.sdd.basicsdd.diagram.custom.edit.parts.CustomSDDEditPartFactory;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDEditPartProvider;

public class CustomSDDEditPartProvider extends BasicSDDEditPartProvider {

	public CustomSDDEditPartProvider() {
		setFactory(new CustomSDDEditPartFactory());
		setAllowCaching(true);
	}
	
}
