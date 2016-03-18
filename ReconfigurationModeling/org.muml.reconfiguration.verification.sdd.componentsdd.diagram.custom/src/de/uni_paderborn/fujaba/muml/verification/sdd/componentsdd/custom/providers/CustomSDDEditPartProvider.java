package de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.custom.providers;

import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.custom.edit.parts.CustomComponentSDDEditPartFactory;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDEditPartProvider;

public class CustomSDDEditPartProvider extends ComponentSDDEditPartProvider {

	public CustomSDDEditPartProvider() {
		setFactory(new CustomComponentSDDEditPartFactory());
		setAllowCaching(true);
	}
	
}
