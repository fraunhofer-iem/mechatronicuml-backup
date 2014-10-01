package de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.initializer;

import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.modelinstance.ui.initializer.IModelInitializer;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;


public class ComponentInstanceConfigurationInitializer implements IModelInitializer {

	public ComponentInstanceConfigurationInitializer() {
	}

	@Override
	public boolean supports(EObject object) {
		return object instanceof ComponentInstanceConfiguration; 
	}

	@Override
	public void initialize(EObject object) {
		((ComponentInstanceConfiguration)object).setName("root-cic");
	}

}
