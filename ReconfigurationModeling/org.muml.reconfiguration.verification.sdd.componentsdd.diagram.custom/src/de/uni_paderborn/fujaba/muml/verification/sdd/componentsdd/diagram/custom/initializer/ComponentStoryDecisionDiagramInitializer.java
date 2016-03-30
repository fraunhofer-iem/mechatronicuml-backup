package de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.custom.initializer;

import org.eclipse.emf.ecore.EObject;
import org.muml.core.modelinstance.ui.initializer.IModelInitializer;

import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryDecisionDiagram;


public class ComponentStoryDecisionDiagramInitializer implements IModelInitializer{

	@Override
	public boolean supports(EObject object) {
		return object instanceof ComponentStoryDecisionDiagram;
	}

	@Override
	public void initialize(EObject object) {
		((ComponentStoryDecisionDiagram)object).setName("CSDD");
	}

}
