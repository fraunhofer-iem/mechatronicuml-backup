package org.muml.reconfiguration.verification.sdd.componentsdd.diagram.custom.providers;

import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.custom.edit.parts.CustomComponentSDDEditPartFactory;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDEditPartProvider;

public class CustomSDDEditPartProvider extends ComponentSDDEditPartProvider {

	public CustomSDDEditPartProvider() {
		setFactory(new CustomComponentSDDEditPartFactory());
		setAllowCaching(true);
	}
	
}
