package de.uni_paderborn.fujaba.muml.verification.sdd.diagram.custom.providers;

import de.uni_paderborn.fujaba.muml.verification.sdd.diagram.custom.edit.parts.CustomSDDEditPartFactory;
import de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDEditPartProvider;

public class CustomSDDEditPartProvider extends BasicSDDEditPartProvider {

	public CustomSDDEditPartProvider() {
		setFactory(new CustomSDDEditPartFactory());
		setAllowCaching(true);
	}
	
}
