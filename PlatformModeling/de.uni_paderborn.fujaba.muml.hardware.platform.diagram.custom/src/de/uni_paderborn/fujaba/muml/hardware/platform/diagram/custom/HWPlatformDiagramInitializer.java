package de.uni_paderborn.fujaba.muml.hardware.platform.diagram.custom;

import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.modelinstance.ui.initializer.IModelInitializer;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform;

public class HWPlatformDiagramInitializer implements IModelInitializer {

	public HWPlatformDiagramInitializer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean supports(EObject object) {
		// TODO Auto-generated method stub
		
		return object instanceof HWPlatform;
	}

	@Override
	public void initialize(EObject object) {
		// TODO Auto-generated method stub
		((HWPlatform) object).setName("Platform");

	}

}
