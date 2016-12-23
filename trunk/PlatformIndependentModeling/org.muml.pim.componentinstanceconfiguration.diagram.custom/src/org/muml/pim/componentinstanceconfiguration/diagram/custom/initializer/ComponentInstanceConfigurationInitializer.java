package org.muml.pim.componentinstanceconfiguration.diagram.custom.initializer;

import org.eclipse.emf.ecore.EObject;
import org.muml.core.modelinstance.ui.initializer.IModelInitializer;
import org.muml.pim.instance.ComponentInstanceConfiguration;


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
